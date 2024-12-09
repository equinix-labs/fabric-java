# RouteFiltersApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**attachConnectionRouteFilter**](RouteFiltersApi.md#attachConnectionRouteFilter) | **PUT** /fabric/v4/connections/{connectionId}/routeFilters/{routeFilterId} | Attach Route Filter |
| [**createRouteFilter**](RouteFiltersApi.md#createRouteFilter) | **POST** /fabric/v4/routeFilters | Create Route Filters |
| [**deleteRouteFilterByUuid**](RouteFiltersApi.md#deleteRouteFilterByUuid) | **DELETE** /fabric/v4/routeFilters/{routeFilterId} | Delete Route Filter |
| [**detachConnectionRouteFilter**](RouteFiltersApi.md#detachConnectionRouteFilter) | **DELETE** /fabric/v4/connections/{connectionId}/routeFilters/{routeFilterId} | Detach Route Filter |
| [**getConnectionRouteFilterByUuid**](RouteFiltersApi.md#getConnectionRouteFilterByUuid) | **GET** /fabric/v4/connections/{connectionId}/routeFilters/{routeFilterId} | Get Route Filter |
| [**getConnectionRouteFilters**](RouteFiltersApi.md#getConnectionRouteFilters) | **GET** /fabric/v4/connections/{connectionId}/routeFilters | Get All Route Filters |
| [**getRouteFilterByUuid**](RouteFiltersApi.md#getRouteFilterByUuid) | **GET** /fabric/v4/routeFilters/{routeFilterId} | Get Route Filter By UUID |
| [**getRouteFilterChangeByUuid**](RouteFiltersApi.md#getRouteFilterChangeByUuid) | **GET** /fabric/v4/routeFilters/{routeFilterId}/changes/{changeId} | Get Change By ID |
| [**getRouteFilterChanges**](RouteFiltersApi.md#getRouteFilterChanges) | **GET** /fabric/v4/routeFilters/{routeFilterId}/changes | Get All Changes |
| [**getRouteFilterConnections**](RouteFiltersApi.md#getRouteFilterConnections) | **GET** /fabric/v4/routeFilters/{routeFilterId}/connections | Get All Connections on Route Filter |
| [**patchRouteFilterByUuid**](RouteFiltersApi.md#patchRouteFilterByUuid) | **PATCH** /fabric/v4/routeFilters/{routeFilterId} | Patch Route Filter |
| [**searchRouteFilters**](RouteFiltersApi.md#searchRouteFilters) | **POST** /fabric/v4/routeFilters/search | Search Route Filters |


<a name="attachConnectionRouteFilter"></a>
# **attachConnectionRouteFilter**
> ConnectionRouteFilterData attachConnectionRouteFilter(routeFilterId, connectionId, connectionRouteFiltersBase)

Attach Route Filter

This API provides capability to attach a Route Filter to a Connection

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteFiltersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteFiltersApi apiInstance = new RouteFiltersApi(defaultClient);
    String routeFilterId = "routeFilterId_example"; // String | Route Filters Id
    String connectionId = "connectionId_example"; // String | Connection Id
    ConnectionRouteFiltersBase connectionRouteFiltersBase = new ConnectionRouteFiltersBase(); // ConnectionRouteFiltersBase | 
    try {
      ConnectionRouteFilterData result = apiInstance.attachConnectionRouteFilter(routeFilterId, connectionId, connectionRouteFiltersBase);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteFiltersApi#attachConnectionRouteFilter");
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
| **routeFilterId** | **String**| Route Filters Id | |
| **connectionId** | **String**| Connection Id | |
| **connectionRouteFiltersBase** | [**ConnectionRouteFiltersBase**](ConnectionRouteFiltersBase.md)|  | |

### Return type

[**ConnectionRouteFilterData**](ConnectionRouteFilterData.md)

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
| **404** | Route Filter ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="createRouteFilter"></a>
# **createRouteFilter**
> RouteFiltersData createRouteFilter(routeFiltersBase)

Create Route Filters

This API provides capability to create a Route Filter

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteFiltersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteFiltersApi apiInstance = new RouteFiltersApi(defaultClient);
    RouteFiltersBase routeFiltersBase = new RouteFiltersBase(); // RouteFiltersBase | 
    try {
      RouteFiltersData result = apiInstance.createRouteFilter(routeFiltersBase);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteFiltersApi#createRouteFilter");
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
| **routeFiltersBase** | [**RouteFiltersBase**](RouteFiltersBase.md)|  | |

### Return type

[**RouteFiltersData**](RouteFiltersData.md)

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
| **404** | Route Filter ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="deleteRouteFilterByUuid"></a>
# **deleteRouteFilterByUuid**
> RouteFiltersData deleteRouteFilterByUuid(routeFilterId)

Delete Route Filter

This API provides capability to delete a Route Filter

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteFiltersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteFiltersApi apiInstance = new RouteFiltersApi(defaultClient);
    String routeFilterId = "routeFilterId_example"; // String | Route Filters Id
    try {
      RouteFiltersData result = apiInstance.deleteRouteFilterByUuid(routeFilterId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteFiltersApi#deleteRouteFilterByUuid");
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
| **routeFilterId** | **String**| Route Filters Id | |

### Return type

[**RouteFiltersData**](RouteFiltersData.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Route Filter ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="detachConnectionRouteFilter"></a>
# **detachConnectionRouteFilter**
> ConnectionRouteFilterData detachConnectionRouteFilter(routeFilterId, connectionId)

Detach Route Filter

This API provides capability to detach a Route Filter from a Connection

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteFiltersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteFiltersApi apiInstance = new RouteFiltersApi(defaultClient);
    String routeFilterId = "routeFilterId_example"; // String | Route Filters Id
    String connectionId = "connectionId_example"; // String | Connection Id
    try {
      ConnectionRouteFilterData result = apiInstance.detachConnectionRouteFilter(routeFilterId, connectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteFiltersApi#detachConnectionRouteFilter");
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
| **routeFilterId** | **String**| Route Filters Id | |
| **connectionId** | **String**| Connection Id | |

### Return type

[**ConnectionRouteFilterData**](ConnectionRouteFilterData.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Route Filter ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="getConnectionRouteFilterByUuid"></a>
# **getConnectionRouteFilterByUuid**
> ConnectionRouteFilterData getConnectionRouteFilterByUuid(routeFilterId, connectionId)

Get Route Filter

This API provides capability to view a specific Route Filter attached to a Connection

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteFiltersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteFiltersApi apiInstance = new RouteFiltersApi(defaultClient);
    String routeFilterId = "routeFilterId_example"; // String | Route Filters Id
    String connectionId = "connectionId_example"; // String | Connection Id
    try {
      ConnectionRouteFilterData result = apiInstance.getConnectionRouteFilterByUuid(routeFilterId, connectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteFiltersApi#getConnectionRouteFilterByUuid");
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
| **routeFilterId** | **String**| Route Filters Id | |
| **connectionId** | **String**| Connection Id | |

### Return type

[**ConnectionRouteFilterData**](ConnectionRouteFilterData.md)

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
| **404** | Route Filter ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="getConnectionRouteFilters"></a>
# **getConnectionRouteFilters**
> GetAllConnectionRouteFiltersResponse getConnectionRouteFilters(connectionId)

Get All Route Filters

This API provides capability to view all Route Filters attached to a Connection

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteFiltersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteFiltersApi apiInstance = new RouteFiltersApi(defaultClient);
    String connectionId = "connectionId_example"; // String | Connection Id
    try {
      GetAllConnectionRouteFiltersResponse result = apiInstance.getConnectionRouteFilters(connectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteFiltersApi#getConnectionRouteFilters");
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
| **connectionId** | **String**| Connection Id | |

### Return type

[**GetAllConnectionRouteFiltersResponse**](GetAllConnectionRouteFiltersResponse.md)

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
| **404** | Route Filter ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="getRouteFilterByUuid"></a>
# **getRouteFilterByUuid**
> RouteFiltersData getRouteFilterByUuid(routeFilterId)

Get Route Filter By UUID

This API provides capability to view a Route Filter by UUID

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteFiltersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteFiltersApi apiInstance = new RouteFiltersApi(defaultClient);
    String routeFilterId = "routeFilterId_example"; // String | Route Filters Id
    try {
      RouteFiltersData result = apiInstance.getRouteFilterByUuid(routeFilterId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteFiltersApi#getRouteFilterByUuid");
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
| **routeFilterId** | **String**| Route Filters Id | |

### Return type

[**RouteFiltersData**](RouteFiltersData.md)

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
| **404** | Route Filter ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="getRouteFilterChangeByUuid"></a>
# **getRouteFilterChangeByUuid**
> RouteFilterChangeData getRouteFilterChangeByUuid(routeFilterId, changeId)

Get Change By ID

This API provides capability to retrieve a specific Route Filter&#39;s Changes

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteFiltersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteFiltersApi apiInstance = new RouteFiltersApi(defaultClient);
    String routeFilterId = "routeFilterId_example"; // String | Route Filters Id
    UUID changeId = UUID.randomUUID(); // UUID | Routing Protocol Change UUID
    try {
      RouteFilterChangeData result = apiInstance.getRouteFilterChangeByUuid(routeFilterId, changeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteFiltersApi#getRouteFilterChangeByUuid");
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
| **routeFilterId** | **String**| Route Filters Id | |
| **changeId** | **UUID**| Routing Protocol Change UUID | |

### Return type

[**RouteFilterChangeData**](RouteFilterChangeData.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Route Filter Change object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Route Filter ID Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="getRouteFilterChanges"></a>
# **getRouteFilterChanges**
> RouteFilterChangeDataResponse getRouteFilterChanges(routeFilterId, offset, limit)

Get All Changes

This API provides capability to retrieve all of a Route Filter&#39;s Changes

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteFiltersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteFiltersApi apiInstance = new RouteFiltersApi(defaultClient);
    String routeFilterId = "routeFilterId_example"; // String | Route Filters Id
    Integer offset = 1; // Integer | offset
    Integer limit = 10; // Integer | number of records to fetch
    try {
      RouteFilterChangeDataResponse result = apiInstance.getRouteFilterChanges(routeFilterId, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteFiltersApi#getRouteFilterChanges");
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
| **routeFilterId** | **String**| Route Filters Id | |
| **offset** | **Integer**| offset | [optional] |
| **limit** | **Integer**| number of records to fetch | [optional] |

### Return type

[**RouteFilterChangeDataResponse**](RouteFilterChangeDataResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Route Filter Change object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Route Filter ID Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="getRouteFilterConnections"></a>
# **getRouteFilterConnections**
> GetRouteFilterGetConnectionsResponse getRouteFilterConnections(routeFilterId)

Get All Connections on Route Filter

This API provides capability to view all Connections using the Route Filter

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteFiltersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteFiltersApi apiInstance = new RouteFiltersApi(defaultClient);
    String routeFilterId = "routeFilterId_example"; // String | Route Filters Id
    try {
      GetRouteFilterGetConnectionsResponse result = apiInstance.getRouteFilterConnections(routeFilterId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteFiltersApi#getRouteFilterConnections");
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
| **routeFilterId** | **String**| Route Filters Id | |

### Return type

[**GetRouteFilterGetConnectionsResponse**](GetRouteFilterGetConnectionsResponse.md)

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
| **404** | Route Filter ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="patchRouteFilterByUuid"></a>
# **patchRouteFilterByUuid**
> RouteFiltersData patchRouteFilterByUuid(routeFilterId, routeFiltersPatchRequestItem)

Patch Route Filter

This API provides capability to partially update a Route Filter

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteFiltersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteFiltersApi apiInstance = new RouteFiltersApi(defaultClient);
    String routeFilterId = "routeFilterId_example"; // String | Route Filters Id
    List<RouteFiltersPatchRequestItem> routeFiltersPatchRequestItem = Arrays.asList(); // List<RouteFiltersPatchRequestItem> | 
    try {
      RouteFiltersData result = apiInstance.patchRouteFilterByUuid(routeFilterId, routeFiltersPatchRequestItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteFiltersApi#patchRouteFilterByUuid");
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
| **routeFilterId** | **String**| Route Filters Id | |
| **routeFiltersPatchRequestItem** | [**List&lt;RouteFiltersPatchRequestItem&gt;**](RouteFiltersPatchRequestItem.md)|  | |

### Return type

[**RouteFiltersData**](RouteFiltersData.md)

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
| **404** | Route Filter ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="searchRouteFilters"></a>
# **searchRouteFilters**
> RouteFiltersSearchResponse searchRouteFilters(routeFiltersSearchBase)

Search Route Filters

This API provides capability to search Route Filters

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteFiltersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteFiltersApi apiInstance = new RouteFiltersApi(defaultClient);
    RouteFiltersSearchBase routeFiltersSearchBase = new RouteFiltersSearchBase(); // RouteFiltersSearchBase | 
    try {
      RouteFiltersSearchResponse result = apiInstance.searchRouteFilters(routeFiltersSearchBase);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteFiltersApi#searchRouteFilters");
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
| **routeFiltersSearchBase** | [**RouteFiltersSearchBase**](RouteFiltersSearchBase.md)|  | |

### Return type

[**RouteFiltersSearchResponse**](RouteFiltersSearchResponse.md)

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
| **404** | Route Filter ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

