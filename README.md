# Fabric java SDK

[![Experimental](https://img.shields.io/badge/Stability-Experimental-red.svg)](https://github.com/equinix-labs/equinix-labs/blob/main/uniform-standards.md)

> **[Experimental](https://github.com/equinix-labs/equinix-labs/blob/main/experimental-statement.md)**
> Experimental Fabric SDK for Java. Don't use it in production. Examples demonstrate that this client is usable. Please submit patches and open issues with your experience. This repo contains java code generated from customized Equinix Fabric OAS3. The client is generated using the java client support built into the openapi-generator.

## Prerequisite:

1. Jq (https://stedolan.github.io/jq/) : Jq command is used inside makefile to format OAS 3.0 JSON read from Equinix Public Url.
   ```
    brew install jq
   ```

2. Docker : We generate the fabric-java client by utilising the openapi-generator-cli docker image to consume the Fabric OAS 3.0 spec which is provided as option in makefile. To install docker refer to: https://docs.docker.com/engine/install/.

3. Building the API client library requires:
   1. Java 1.7+
   2. Maven

## Generate and build equinix fabric java client:

Using openapi-generator-cli v3 docker image :
```
make generate
```

This will:
1. Clean the current working directory
2. Download the Fabric OAS 3.0 Spec for the version specified in the OPENAPI_URL Makefile variable
3. Apply the patches to the Fabric OAS 3.0 Spec with what is present in the `patches` directory
4. Pull down the openapi generator cli docker image (Version of image specified in the Makefile)
5. Generate the Fabric Java SDK Client based on the Patched Fabric OAS 3.0 Spec
6. Build the generated Fabric Java SDK Client with `mvn clean package`

## Running sample:

Build generated client (The Makefile command `make generate` includes these commands as well):
```
cd equinix-openapi-fabric
mvn clean package
```

Create a sample file with the following code:
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.v4.model.*;
import com.equinix.openapi.fabric.v4.api.PortsApi;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("<GetBearerTokenFromDeveloperPortal>");

    PortsApi apiInstance = new PortsApi(defaultClient);
    try {
      Port result = apiInstance.getPortByUuid(UUID.fromString("<RetrievePortUUIDFromFabricPortal>"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#createConnection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

Sample can be run by consuming local jars produced after building generated fabric-java client 
(Notice that the version numbers in the jar path will change over time, input correct path into
the `<current_version_#>` space in the command and the name of your example file into 
`<your-example-name>` below):
```
java -classpath "equinix-openapi-fabric/target/equinix-openapi-fabric-<current_version_#>.jar:equinix-openapi-fabric/target/lib/*" <your-example-name>.java
```

## Contribution guidelines

### Code Changes

No manual code changes should be made. All .java files are generated with the OpenAPI Generator CLI.
If there are updates you think should be made to the generated client then they should be handled
through patches. The patching process is detailed below.

### Patching OAS 3.0 Spec
1. Make changes in ``spec/oas3.patched.json`` dir.
2. Create a patch file in fabric-java:
   ```
   cd spec
   git diff oas3.patched/ > ../patches/spec.fetched.json/<patchfilename>
   cd ..
   ```
3. ``patchfilename`` should be in format: ``<patch_index>-<short_patch_decription_or_identifier>.patch``
4. Run ``make generate`` to reapply the changes to oas spec.
5. Before pushing changes, commit ``fabric-java/spec/oas3.patched.json`` along with the patch file.
