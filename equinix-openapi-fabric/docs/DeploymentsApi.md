# DeploymentsApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**actionDeployment**](DeploymentsApi.md#actionDeployment) | **POST** /fabric/v4/deployments/{deploymentId}/actions | Deploy, Dry Run or Destroy Deployment |
| [**createTopologyDeployment**](DeploymentsApi.md#createTopologyDeployment) | **POST** /fabric/v4/deployments | Create a new topology deployment |
| [**deleteDeployment**](DeploymentsApi.md#deleteDeployment) | **DELETE** /fabric/v4/deployments/{deploymentId} | Delete Deployment using UUID |
| [**getDeployment**](DeploymentsApi.md#getDeployment) | **GET** /fabric/v4/deployments/{deploymentId} | Retrieve Deployment details using UUID |
| [**searchDeployments**](DeploymentsApi.md#searchDeployments) | **POST** /fabric/v4/deployments/searchDeployments | Search deployments |
| [**searchProviderResources**](DeploymentsApi.md#searchProviderResources) | **POST** /fabric/v4/providerResources/search | Search provider resources |


<a name="actionDeployment"></a>
# **actionDeployment**
> CloudRouterActionResponse actionDeployment(deploymentId, deploymentActionRequest)

Deploy, Dry Run or Destroy Deployment

The deployment action is used to deploy, dry run or destroy a deployment. The request body must contain the type of action to be performed and the connection details. The response will contain the status of the action. 

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.DeploymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DeploymentsApi apiInstance = new DeploymentsApi(defaultClient);
    UUID deploymentId = UUID.randomUUID(); // UUID | Deployment UUID
    DeploymentActionRequest deploymentActionRequest = new DeploymentActionRequest(); // DeploymentActionRequest | 
    try {
      CloudRouterActionResponse result = apiInstance.actionDeployment(deploymentId, deploymentActionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentsApi#actionDeployment");
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
| **deploymentActionRequest** | [**DeploymentActionRequest**](DeploymentActionRequest.md)|  | |

### Return type

[**CloudRouterActionResponse**](CloudRouterActionResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Internal server error |  -  |
| **500** | Internal server error |  -  |

<a name="createTopologyDeployment"></a>
# **createTopologyDeployment**
> DeploymentResponse createTopologyDeployment(deployment)

Create a new topology deployment

The deployment API is used to creates new deployment topologies.  It allows users to define the properties of the deployment, including Fabric and CSP providers. 

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.DeploymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DeploymentsApi apiInstance = new DeploymentsApi(defaultClient);
    Deployment deployment = new Deployment(); // Deployment | 
    try {
      DeploymentResponse result = apiInstance.createTopologyDeployment(deployment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentsApi#createTopologyDeployment");
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
| **deployment** | [**Deployment**](Deployment.md)|  | |

### Return type

[**DeploymentResponse**](DeploymentResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Deployment created successfully |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="deleteDeployment"></a>
# **deleteDeployment**
> DeploymentResponse deleteDeployment(deploymentId)

Delete Deployment using UUID

This API provides capability to delete user&#39;s deployment

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.DeploymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DeploymentsApi apiInstance = new DeploymentsApi(defaultClient);
    UUID deploymentId = UUID.randomUUID(); // UUID | Deployment UUID
    try {
      DeploymentResponse result = apiInstance.deleteDeployment(deploymentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentsApi#deleteDeployment");
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

### Return type

[**DeploymentResponse**](DeploymentResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Deployment object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="getDeployment"></a>
# **getDeployment**
> DeploymentResponse getDeployment(deploymentId)

Retrieve Deployment details using UUID

This API provides capability to retrieve user&#39;s deployment details.

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.DeploymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DeploymentsApi apiInstance = new DeploymentsApi(defaultClient);
    UUID deploymentId = UUID.randomUUID(); // UUID | Deployment UUID
    try {
      DeploymentResponse result = apiInstance.getDeployment(deploymentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentsApi#getDeployment");
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

### Return type

[**DeploymentResponse**](DeploymentResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Deployment details |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="searchDeployments"></a>
# **searchDeployments**
> DeploymentSearchResponse searchDeployments(deploymentSearchRequest)

Search deployments

The API provides capability to get list of user&#39;s deployment using search criteria.

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.DeploymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DeploymentsApi apiInstance = new DeploymentsApi(defaultClient);
    DeploymentSearchRequest deploymentSearchRequest = new DeploymentSearchRequest(); // DeploymentSearchRequest | 
    try {
      DeploymentSearchResponse result = apiInstance.searchDeployments(deploymentSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentsApi#searchDeployments");
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
| **deploymentSearchRequest** | [**DeploymentSearchRequest**](DeploymentSearchRequest.md)|  | |

### Return type

[**DeploymentSearchResponse**](DeploymentSearchResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of deployments |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="searchProviderResources"></a>
# **searchProviderResources**
> ProviderSearchResponse searchProviderResources(providerSearchRequest)

Search provider resources

The API provides capability to get list of user&#39;s provider resources using search criteria, including optional filtering

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.DeploymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DeploymentsApi apiInstance = new DeploymentsApi(defaultClient);
    ProviderSearchRequest providerSearchRequest = new ProviderSearchRequest(); // ProviderSearchRequest | 
    try {
      ProviderSearchResponse result = apiInstance.searchProviderResources(providerSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentsApi#searchProviderResources");
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
| **providerSearchRequest** | [**ProviderSearchRequest**](ProviderSearchRequest.md)|  | |

### Return type

[**ProviderSearchResponse**](ProviderSearchResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

