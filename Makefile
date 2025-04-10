.PHONY: generate

CURRENT_UID := $(shell id -u)
CURRENT_GID := $(shell id -g)

##
# Preliminary definitions
##

# git repo : equinix fabric-java sdk
GIT_ORG=equinix-labs
GIT_REPO=fabric-sdk-java

PACKAGE_VERSION=$(shell cat version)

# Equinix fabric OAS 3.0.0
SPEC_FETCHED_FILE:=spec/oas3.fabric.fetched.json
SPEC_PATCHED_FILE:=spec/oas3.fabric.patched.json
OPENAPI_CONFIG:=spec/oas3.fabric.config.json
OPENAPI_GENERATED_CLIENT=equinix-openapi-fabric/
TESTS_PATH=src/test/java/com/equinix/openapi/fabric/

# Patches
SPEC_FETCHED_PATCHES=patches/spec.fetched.json

##
# OpenAPI codegen container
##
CRI:=docker # nerdctl
OPENAPI_CODEGEN_TAG=v6.4.0
OPENAPI_CODEGEN_IMAGE=openapitools/openapi-generator-cli:${OPENAPI_CODEGEN_TAG}
DOCKER_OPENAPI=${CRI} run --rm -u ${CURRENT_UID}:${CURRENT_GID} -v $(CURDIR):/local ${OPENAPI_CODEGEN_IMAGE}
OPENAPI_URL="https://app.swaggerhub.com/apiproxy/registry/equinix-api/fabric/4.21"

generate: clean fetch pre-spec-patch pull docker_generate build_client

clean:
	rm -rf ${OPENAPI_GENERATED_CLIENT}
	rm -rf ${OPENAPI_GIT_DIR}

# Fetch any public available version of Fabric V4 API specification. Send the URL to the specification as input argument
# Example: make fetch OPENAPI_URL=https://app.swaggerhub.com/apiproxy/registry/equinix-api/fabric/4.11
fetch:
	curl ${OPENAPI_URL} | jq . > ${SPEC_FETCHED_FILE}

# For patches summary refer : fabric-java/patches/README.md
pre-spec-patch:
	# patch is idempotent, always starting with the fetched
	# fetched file to create the patched file.
	cp ${SPEC_FETCHED_FILE} ${SPEC_PATCHED_FILE}
	ARGS="-o ${SPEC_PATCHED_FILE} ${SPEC_FETCHED_FILE}"; \
	for diff in $(shell find ${SPEC_FETCHED_PATCHES} -name \*.patch | sort -n); do \
		patch --no-backup-if-mismatch -N -t $$ARGS $$diff; \
		ARGS=${SPEC_PATCHED_FILE}; \
	done

pull:
	${CRI} pull ${OPENAPI_CODEGEN_IMAGE}

docker_generate:
	${DOCKER_OPENAPI} generate \
		--http-user-agent "${GIT_REPO}/${PACKAGE_VERSION}" \
        -p artifactVersion=${PACKAGE_VERSION} \
		-i /local/${SPEC_PATCHED_FILE} \
		-t /local/templates/Java \
		-g java \
		-c /local/${OPENAPI_CONFIG} \
		-o /local/${OPENAPI_GENERATED_CLIENT} \
		--git-repo-id ${GIT_REPO} \
		--git-user-id ${GIT_ORG}

build_client:
	rm -rf ${OPENAPI_GENERATED_CLIENT}${TESTS_PATH}v4;
