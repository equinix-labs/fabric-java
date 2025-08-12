# ClientInterfacesApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTerraformTemplates**](ClientInterfacesApi.md#createTerraformTemplates) | **POST** /fabric/v4/deployments/{deploymentId}/download | Generate Terraform Deployment Templates |


<a name="createTerraformTemplates"></a>
# **createTerraformTemplates**
> File createTerraformTemplates(deploymentId, clientInterfaces)

Generate Terraform Deployment Templates

The Client Interfaces API is used to generate Terraform Templates based on Deployment details.

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.ClientInterfacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ClientInterfacesApi apiInstance = new ClientInterfacesApi(defaultClient);
    UUID deploymentId = UUID.randomUUID(); // UUID | Deployment UUID
    ClientInterfaces clientInterfaces = new ClientInterfaces(); // ClientInterfaces | 
    try {
      File result = apiInstance.createTerraformTemplates(deploymentId, clientInterfaces);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientInterfacesApi#createTerraformTemplates");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deploymentId** | **UUID**| Deployment UUID | |
| **clientInterfaces** | [**ClientInterfaces**](ClientInterfaces.md)|  | |

### Return type

[**File**](File.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/zip, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Terraform deployment templates ZIP file generated successfully |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

