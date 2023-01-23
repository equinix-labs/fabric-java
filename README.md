# Fabric java SDK

[![Experimental](https://img.shields.io/badge/Stability-Experimental-red.svg)](https://github.com/equinix-labs/equinix-labs/blob/main/uniform-standards.md)

> **[Experimental](https://github.com/equinix-labs/equinix-labs/blob/main/experimental-statement.md)**
> Experimental Fabric SDK for Java. Don't use it in production. Examples demonstrate that this client is usable. Please submit patches and open issues with your experience. This repo contains java code generated from customized Equinix Fabric oas3. The client is generated using the java client support built into the openapi-generator.

## Prerequisite:

1. Jq (https://stedolan.github.io/jq/) : Jq command is used inside makefile to format OAS 3.0 json read from equinix public url.
   ```
    brew install jq
   ```

2. Docker : We can generate fabric-java client in two ways (described in later section), first is via utilising swagger codegen image to consume fabric OAS 3.0 spec which is provided as option in makefile. To install docker refer : https://docs.docker.com/engine/install/.

3. Building the API client library requires:
   1. Java 1.7+
   2. Maven

  
## Running sample:

Build generated client:
```
cd equinix-openapi-fabric
mvn clean package
```

Sample can be written by consuming local jars produced after building generated fabric-java client:
```
cd ..
java -classpath "equinix-openapi-fabric/target/equinix-openapi-fabric-1.0.0.jar:equinix-openapi-fabric/target/lib/*" your-example.java
```

## Generate and build equinix fabric java client:

Using openapi generator v3 docker image :
```
make docker_run
```

Note : docker pulls latest version of openapi generator.

## Contribution guidelines
### Patching oas3.0 spec
1. Make changes in ``spec/oas3.patched.json`` dir.
2. Create a patch file in fabric-java:
   ```
   cd spec
   git diff oas3.patched/ > ../patches/spec.fetched.json/<patchfilename>
   cd ..
   ```
3. ``patchfilename`` should be in format: ``<patch_index>-<short_patch_decription_or_identifier>.patch``
4. Run ``make docker_run`` to reapply the changes to oas spec.
5. Before pushing changes, commit ``fabric-java/spec/oas3.patched.json`` along with the patch file.