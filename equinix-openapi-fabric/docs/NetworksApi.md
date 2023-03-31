# NetworksApi

All URIs are relative to *https://virtserver.swaggerhub.com/equinix-api/fabric/4.6*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNetwork**](NetworksApi.md#createNetwork) | **POST** /fabric/v4/networks | Create Network |
| [**deleteNetworkByUuid**](NetworksApi.md#deleteNetworkByUuid) | **DELETE** /fabric/v4/networks/{networkId} | Delete Network By ID |
| [**getConnectionsByNetworkUuid**](NetworksApi.md#getConnectionsByNetworkUuid) | **GET** /fabric/v4/networks/{networkId}/connections | Get Connections |
| [**getNetworkByUuid**](NetworksApi.md#getNetworkByUuid) | **GET** /fabric/v4/networks/{networkId} | Get Network By ID |
| [**getNetworkChangeByUuid**](NetworksApi.md#getNetworkChangeByUuid) | **GET** /fabric/v4/networks/{networkId}/changes/{changeId} | Get Change By ID |
| [**getNetworkChanges**](NetworksApi.md#getNetworkChanges) | **GET** /fabric/v4/networks/{networkId}/changes | Get Network Changes |
| [**searchNetworks**](NetworksApi.md#searchNetworks) | **POST** /fabric/v4/networks/search | Search Network |
| [**updateNetworkByUuid**](NetworksApi.md#updateNetworkByUuid) | **PATCH** /fabric/v4/networks/{networkId} | Update Network By ID |


<a name="createNetwork"></a>
# **createNetwork**
> Network createNetwork(networkPostRequest)

Create Network

This API provides capability to create user&#39;s Fabric Network

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.NetworksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://virtserver.swaggerhub.com/equinix-api/fabric/4.6");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    NetworksApi apiInstance = new NetworksApi(defaultClient);
    NetworkPostRequest networkPostRequest = new NetworkPostRequest(); // NetworkPostRequest | 
    try {
      Network result = apiInstance.createNetwork(networkPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworksApi#createNetwork");
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
| **networkPostRequest** | [**NetworkPostRequest**](NetworkPostRequest.md)|  | |

### Return type

[**Network**](Network.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Fabric Network Access point object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="deleteNetworkByUuid"></a>
# **deleteNetworkByUuid**
> Network deleteNetworkByUuid(networkId)

Delete Network By ID

This API provides capability to delete user&#39;s Fabric Network

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.NetworksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://virtserver.swaggerhub.com/equinix-api/fabric/4.6");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    NetworksApi apiInstance = new NetworksApi(defaultClient);
    UUID networkId = UUID.randomUUID(); // UUID | Network UUID
    try {
      Network result = apiInstance.deleteNetworkByUuid(networkId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworksApi#deleteNetworkByUuid");
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
| **networkId** | **UUID**| Network UUID | |

### Return type

[**Network**](Network.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Fabric Network Access point object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getConnectionsByNetworkUuid"></a>
# **getConnectionsByNetworkUuid**
> NetworkConnections getConnectionsByNetworkUuid(networkId)

Get Connections

The API provides capability to get list of user&#39;s Fabric Network connections

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.NetworksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://virtserver.swaggerhub.com/equinix-api/fabric/4.6");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    NetworksApi apiInstance = new NetworksApi(defaultClient);
    UUID networkId = UUID.randomUUID(); // UUID | Network UUID
    try {
      NetworkConnections result = apiInstance.getConnectionsByNetworkUuid(networkId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworksApi#getConnectionsByNetworkUuid");
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
| **networkId** | **UUID**| Network UUID | |

### Return type

[**NetworkConnections**](NetworkConnections.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Network Access point object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |

<a name="getNetworkByUuid"></a>
# **getNetworkByUuid**
> Network getNetworkByUuid(networkId)

Get Network By ID

This API provides capability to retrieve user&#39;s Fabric Network

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.NetworksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://virtserver.swaggerhub.com/equinix-api/fabric/4.6");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    NetworksApi apiInstance = new NetworksApi(defaultClient);
    UUID networkId = UUID.randomUUID(); // UUID | Network UUID
    try {
      Network result = apiInstance.getNetworkByUuid(networkId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworksApi#getNetworkByUuid");
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
| **networkId** | **UUID**| Network UUID | |

### Return type

[**Network**](Network.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Network Access point object |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getNetworkChangeByUuid"></a>
# **getNetworkChangeByUuid**
> NetworkChange getNetworkChangeByUuid(networkId, changeId)

Get Change By ID

This API provides capability to retrieve user&#39;s Fabric Network Change

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.NetworksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://virtserver.swaggerhub.com/equinix-api/fabric/4.6");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    NetworksApi apiInstance = new NetworksApi(defaultClient);
    UUID networkId = UUID.randomUUID(); // UUID | Network UUID
    UUID changeId = UUID.randomUUID(); // UUID | Network Change UUID
    try {
      NetworkChange result = apiInstance.getNetworkChangeByUuid(networkId, changeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworksApi#getNetworkChangeByUuid");
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
| **networkId** | **UUID**| Network UUID | |
| **changeId** | **UUID**| Network Change UUID | |

### Return type

[**NetworkChange**](NetworkChange.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Network Access point object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getNetworkChanges"></a>
# **getNetworkChanges**
> NetworkChangeResponse getNetworkChanges(networkId)

Get Network Changes

The API provides capability to get list of user&#39;s Fabric Network changes

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.NetworksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://virtserver.swaggerhub.com/equinix-api/fabric/4.6");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    NetworksApi apiInstance = new NetworksApi(defaultClient);
    UUID networkId = UUID.randomUUID(); // UUID | Network UUID
    try {
      NetworkChangeResponse result = apiInstance.getNetworkChanges(networkId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworksApi#getNetworkChanges");
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
| **networkId** | **UUID**| Network UUID | |

### Return type

[**NetworkChangeResponse**](NetworkChangeResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Network Access point object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |

<a name="searchNetworks"></a>
# **searchNetworks**
> NetworkSearchResponse searchNetworks(networkSearchRequest)

Search Network

The API provides capability to get list of user&#39;s Fabric Network using search criteria, including optional filtering, pagination and sorting

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.NetworksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://virtserver.swaggerhub.com/equinix-api/fabric/4.6");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    NetworksApi apiInstance = new NetworksApi(defaultClient);
    NetworkSearchRequest networkSearchRequest = new NetworkSearchRequest(); // NetworkSearchRequest | 
    try {
      NetworkSearchResponse result = apiInstance.searchNetworks(networkSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworksApi#searchNetworks");
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
| **networkSearchRequest** | [**NetworkSearchRequest**](NetworkSearchRequest.md)|  | |

### Return type

[**NetworkSearchResponse**](NetworkSearchResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Network Access point object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |

<a name="updateNetworkByUuid"></a>
# **updateNetworkByUuid**
> Network updateNetworkByUuid(networkId, networkChangeOperation)

Update Network By ID

This API provides capability to update user&#39;s Fabric Network

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.NetworksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://virtserver.swaggerhub.com/equinix-api/fabric/4.6");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    NetworksApi apiInstance = new NetworksApi(defaultClient);
    UUID networkId = UUID.randomUUID(); // UUID | Network UUID
    List<NetworkChangeOperation> networkChangeOperation = Arrays.asList(); // List<NetworkChangeOperation> | 
    try {
      Network result = apiInstance.updateNetworkByUuid(networkId, networkChangeOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworksApi#updateNetworkByUuid");
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
| **networkId** | **UUID**| Network UUID | |
| **networkChangeOperation** | [**List&lt;NetworkChangeOperation&gt;**](NetworkChangeOperation.md)|  | |

### Return type

[**Network**](Network.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Network Access point object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Unsupported Media Type |  -  |

