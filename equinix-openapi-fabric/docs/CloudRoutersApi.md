# CloudRoutersApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createGateway**](CloudRoutersApi.md#createGateway) | **POST** /fabric/v4/routers | Create Routers |
| [**createGatewayAction**](CloudRoutersApi.md#createGatewayAction) | **POST** /fabric/v4/routers/{routerId}/actions | Route table actions |
| [**deleteGatewayByUuid**](CloudRoutersApi.md#deleteGatewayByUuid) | **DELETE** /fabric/v4/routers/{routerId} | Delete Routers |
| [**getGatewayActions**](CloudRoutersApi.md#getGatewayActions) | **GET** /fabric/v4/routers/{routerId}/actions | Get actions |
| [**getGatewayByUuid**](CloudRoutersApi.md#getGatewayByUuid) | **GET** /fabric/v4/routers/{routerId} | Get Routers |
| [**getGatewayPackageByCode**](CloudRoutersApi.md#getGatewayPackageByCode) | **GET** /fabric/v4/routerPackages/{routerPackageCode} | Get Package Details |
| [**getGatewayPackages**](CloudRoutersApi.md#getGatewayPackages) | **GET** /fabric/v4/routerPackages | List Packages |
| [**searchGateways**](CloudRoutersApi.md#searchGateways) | **POST** /fabric/v4/routers/search | Search Routers |
| [**updateGatewayByUuid**](CloudRoutersApi.md#updateGatewayByUuid) | **PATCH** /fabric/v4/routers/{routerId} | Update Routers |


<a name="createGateway"></a>
# **createGateway**
> CloudRouter createGateway(cloudRouterPostRequest)

Create Routers

This API provides capability to create user&#39;s Cloud Routers

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    CloudRouterPostRequest cloudRouterPostRequest = new CloudRouterPostRequest(); // CloudRouterPostRequest | 
    try {
      CloudRouter result = apiInstance.createGateway(cloudRouterPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#createGateway");
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
| **cloudRouterPostRequest** | [**CloudRouterPostRequest**](CloudRouterPostRequest.md)|  | |

### Return type

[**CloudRouter**](CloudRouter.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Cloud Router object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="createGatewayAction"></a>
# **createGatewayAction**
> GatewayActionResponse createGatewayAction(routerId, gatewayActionRequest)

Route table actions

This API provides capability to refresh route table and bgp session summary information

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    UUID routerId = UUID.randomUUID(); // UUID | Router UUID
    GatewayActionRequest gatewayActionRequest = new GatewayActionRequest(); // GatewayActionRequest | 
    try {
      GatewayActionResponse result = apiInstance.createGatewayAction(routerId, gatewayActionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#createGatewayAction");
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
| **routerId** | **UUID**| Router UUID | |
| **gatewayActionRequest** | [**GatewayActionRequest**](GatewayActionRequest.md)|  | |

### Return type

[**GatewayActionResponse**](GatewayActionResponse.md)

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

<a name="deleteGatewayByUuid"></a>
# **deleteGatewayByUuid**
> deleteGatewayByUuid(routerId)

Delete Routers

This API provides capability to delete user&#39;s Cloud Routers

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    UUID routerId = UUID.randomUUID(); // UUID | Cloud Router UUID
    try {
      apiInstance.deleteGatewayByUuid(routerId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#deleteGatewayByUuid");
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
| **routerId** | **UUID**| Cloud Router UUID | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Deleted Cloud Router Successfully |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="getGatewayActions"></a>
# **getGatewayActions**
> GatewayActionResponse getGatewayActions(routerId, state)

Get actions

This API provides capability to fetch action status

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    UUID routerId = UUID.randomUUID(); // UUID | Router UUID
    GatewayActionState state = GatewayActionState.fromValue("DONE"); // GatewayActionState | Action state
    try {
      GatewayActionResponse result = apiInstance.getGatewayActions(routerId, state);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#getGatewayActions");
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
| **routerId** | **UUID**| Router UUID | |
| **state** | [**GatewayActionState**](.md)| Action state | [optional] [enum: DONE, FAILED, PENDING] |

### Return type

[**GatewayActionResponse**](GatewayActionResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Internal server error |  -  |
| **500** | Internal server error |  -  |

<a name="getGatewayByUuid"></a>
# **getGatewayByUuid**
> CloudRouter getGatewayByUuid(routerId)

Get Routers

This API provides capability to retrieve user&#39;s Cloud Routers

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    UUID routerId = UUID.randomUUID(); // UUID | Cloud Router UUID
    try {
      CloudRouter result = apiInstance.getGatewayByUuid(routerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#getGatewayByUuid");
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
| **routerId** | **UUID**| Cloud Router UUID | |

### Return type

[**CloudRouter**](CloudRouter.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Cloud Router object |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="getGatewayPackageByCode"></a>
# **getGatewayPackageByCode**
> CloudRouterPackage getGatewayPackageByCode(routerPackageCode)

Get Package Details

This API provides capability to retrieve user&#39;s Cloud Routers Package Details

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    RouterPackageCode routerPackageCode = RouterPackageCode.fromValue("LAB"); // RouterPackageCode | Equinix-assigned Cloud Router package identifier
    try {
      CloudRouterPackage result = apiInstance.getGatewayPackageByCode(routerPackageCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#getGatewayPackageByCode");
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
| **routerPackageCode** | [**RouterPackageCode**](.md)| Equinix-assigned Cloud Router package identifier | [enum: LAB, BASIC, PRO, PREMIUM] |

### Return type

[**CloudRouterPackage**](CloudRouterPackage.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Cloud Router Package details |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="getGatewayPackages"></a>
# **getGatewayPackages**
> PackageResponse getGatewayPackages(offset, limit)

List Packages

This API provides capability to retrieve user&#39;s Cloud Routers Packages

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    Integer offset = 1; // Integer | offset
    Integer limit = 10; // Integer | number of records to fetch
    try {
      PackageResponse result = apiInstance.getGatewayPackages(offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#getGatewayPackages");
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
| **offset** | **Integer**| offset | [optional] |
| **limit** | **Integer**| number of records to fetch | [optional] |

### Return type

[**PackageResponse**](PackageResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Cloud Router Packages |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="searchGateways"></a>
# **searchGateways**
> SearchResponse searchGateways(cloudRouterSearchRequest)

Search Routers

The API provides capability to get list of user&#39;s Cloud Routers using search criteria, including optional filtering, pagination and sorting

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    CloudRouterSearchRequest cloudRouterSearchRequest = new CloudRouterSearchRequest(); // CloudRouterSearchRequest | 
    try {
      SearchResponse result = apiInstance.searchGateways(cloudRouterSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#searchGateways");
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
| **cloudRouterSearchRequest** | [**CloudRouterSearchRequest**](CloudRouterSearchRequest.md)|  | |

### Return type

[**SearchResponse**](SearchResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="updateGatewayByUuid"></a>
# **updateGatewayByUuid**
> CloudRouter updateGatewayByUuid(routerId, cloudRouterChangeOperation)

Update Routers

This API provides capability to update user&#39;s Cloud Routers

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    UUID routerId = UUID.randomUUID(); // UUID | Cloud Router UUID
    List<CloudRouterChangeOperation> cloudRouterChangeOperation = Arrays.asList(); // List<CloudRouterChangeOperation> | 
    try {
      CloudRouter result = apiInstance.updateGatewayByUuid(routerId, cloudRouterChangeOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#updateGatewayByUuid");
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
| **routerId** | **UUID**| Cloud Router UUID | |
| **cloudRouterChangeOperation** | [**List&lt;CloudRouterChangeOperation&gt;**](CloudRouterChangeOperation.md)|  | |

### Return type

[**CloudRouter**](CloudRouter.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Cloud Router object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

