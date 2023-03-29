.PHONY: docker_run

CURRENT_UID := $(shell id -u)
CURRENT_GID := $(shell id -g)

##
# Preliminary definitions
##

# git repo : equinix fabric-java sdk
GIT_ORG=equinix-labs
GIT_REPO=fabric-java

# Equinix fabric OAS 3.0.0
SPEC_FETCHED_FILE:=spec/oas3.fabric.fetched.json
SPEC_PATCHED_FILE:=spec/oas3.fabric.patched.json
OPENAPI_CONFIG:=spec/oas3.fabric.config.json
OPENAPI_GENERATED_CLIENT=equinix-openapi-fabric/

# Patches
SPEC_FETCHED_PATCHES=patches/spec.fetched.json

##
# OpenAPI codegen container
##
CRI:=docker # nerdctl
OPENAPI_CODEGEN_TAG=v6.4.0
OPENAPI_CODEGEN_IMAGE=openapitools/openapi-generator-cli:${OPENAPI_CODEGEN_TAG}
DOCKER_OPENAPI=${CRI} run --rm -u ${CURRENT_UID}:${CURRENT_GID} -v $(CURDIR):/local ${OPENAPI_CODEGEN_IMAGE}
OPENAPI_URL=https://app.swaggerhub.com/apiproxy/registry/equinix-api/fabric/4.6

docker_run: clean pre-spec-patch pull docker_generate build_client

pull:
	${CRI} pull ${OPENAPI_CODEGEN_IMAGE}

docker_generate:
	${DOCKER_OPENAPI} generate \
		-i /local/${SPEC_PATCHED_FILE} \
		-g java \
		-c /local/${OPENAPI_CONFIG} \
		-o /local/${OPENAPI_GENERATED_CLIENT} \
		--git-repo-id ${GIT_REPO} \
		--git-user-id ${GIT_ORG}

##
# Utility functions
##

# Fetch any public available version of Fabric V4 API specification. Send the URL to the specification as input argument
# Example: make fetch OPENAPI_URL=https://app.swaggerhub.com/apiproxy/registry/equinix-api/fabric/4.6
fetch:
	curl ${OPENAPI_URL} | jq . > ${SPEC_FETCHED_FILE}

clean:
	rm -rf ${OPENAPI_GENERATED_CLIENT}
	rm -rf ${OPENAPI_GIT_DIR}

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

build_client:
	cd ${OPENAPI_GENERATED_CLIENT}; mvn clean package
