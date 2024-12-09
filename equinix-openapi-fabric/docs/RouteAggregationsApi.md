# RouteAggregationsApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**attachConnectionRouteAggregation**](RouteAggregationsApi.md#attachConnectionRouteAggregation) | **PUT** /fabric/v4/connections/{connectionId}/routeAggregations/{routeAggregationId} | Attach Aggregation |
| [**createRouteAggregation**](RouteAggregationsApi.md#createRouteAggregation) | **POST** /fabric/v4/routeAggregations | Create Aggregations |
| [**deleteRouteAggregationByUuid**](RouteAggregationsApi.md#deleteRouteAggregationByUuid) | **DELETE** /fabric/v4/routeAggregations/{routeAggregationId} | Delete Aggregation |
| [**detachConnectionRouteAggregation**](RouteAggregationsApi.md#detachConnectionRouteAggregation) | **DELETE** /fabric/v4/connections/{connectionId}/routeAggregations/{routeAggregationId} | Detach Aggregation |
| [**getConnectionRouteAggregationByUuid**](RouteAggregationsApi.md#getConnectionRouteAggregationByUuid) | **GET** /fabric/v4/connections/{connectionId}/routeAggregations/{routeAggregationId} | Get Aggregation |
| [**getConnectionRouteAggregations**](RouteAggregationsApi.md#getConnectionRouteAggregations) | **GET** /fabric/v4/connections/{connectionId}/routeAggregations | Get All Aggregations |
| [**getRouteAggregationByUuid**](RouteAggregationsApi.md#getRouteAggregationByUuid) | **GET** /fabric/v4/routeAggregations/{routeAggregationId} | Get Aggregation |
| [**getRouteAggregationChangeByUuid**](RouteAggregationsApi.md#getRouteAggregationChangeByUuid) | **GET** /fabric/v4/routeAggregations/{routeAggregationId}/changes/{changeId} | Get Change By ID |
| [**getRouteAggregationChanges**](RouteAggregationsApi.md#getRouteAggregationChanges) | **GET** /fabric/v4/routeAggregations/{routeAggregationId}/changes | Get All Changes |
| [**getRouteAggregationConnections**](RouteAggregationsApi.md#getRouteAggregationConnections) | **GET** /fabric/v4/routeAggregations/{routeAggregationId}/connections | Get All Connections on Route Aggregation |
| [**patchRouteAggregationByUuid**](RouteAggregationsApi.md#patchRouteAggregationByUuid) | **PATCH** /fabric/v4/routeAggregations/{routeAggregationId} | Patch Aggregation |
| [**searchRouteAggregations**](RouteAggregationsApi.md#searchRouteAggregations) | **POST** /fabric/v4/routeAggregations/search | Search Aggregations |


<a name="attachConnectionRouteAggregation"></a>
# **attachConnectionRouteAggregation**
> ConnectionRouteAggregationData attachConnectionRouteAggregation(routeAggregationId, connectionId)

Attach Aggregation

This API provides capability to attach a Route Aggregation to a Connection

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteAggregationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteAggregationsApi apiInstance = new RouteAggregationsApi(defaultClient);
    String routeAggregationId = "routeAggregationId_example"; // String | Route Aggregations Id
    String connectionId = "connectionId_example"; // String | Connection Id
    try {
      ConnectionRouteAggregationData result = apiInstance.attachConnectionRouteAggregation(routeAggregationId, connectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteAggregationsApi#attachConnectionRouteAggregation");
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
| **routeAggregationId** | **String**| Route Aggregations Id | |
| **connectionId** | **String**| Connection Id | |

### Return type

[**ConnectionRouteAggregationData**](ConnectionRouteAggregationData.md)

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
| **404** | Route Aggregation ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="createRouteAggregation"></a>
# **createRouteAggregation**
> RouteAggregationsData createRouteAggregation(routeAggregationsBase)

Create Aggregations

This API provides capability to create a Route Aggregation

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteAggregationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteAggregationsApi apiInstance = new RouteAggregationsApi(defaultClient);
    RouteAggregationsBase routeAggregationsBase = new RouteAggregationsBase(); // RouteAggregationsBase | 
    try {
      RouteAggregationsData result = apiInstance.createRouteAggregation(routeAggregationsBase);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteAggregationsApi#createRouteAggregation");
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
| **routeAggregationsBase** | [**RouteAggregationsBase**](RouteAggregationsBase.md)|  | |

### Return type

[**RouteAggregationsData**](RouteAggregationsData.md)

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
| **404** | Route Aggregation ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="deleteRouteAggregationByUuid"></a>
# **deleteRouteAggregationByUuid**
> RouteAggregationsData deleteRouteAggregationByUuid(routeAggregationId)

Delete Aggregation

This API provides capability to delete a Route Aggregation

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteAggregationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteAggregationsApi apiInstance = new RouteAggregationsApi(defaultClient);
    String routeAggregationId = "routeAggregationId_example"; // String | Route Aggregations Id
    try {
      RouteAggregationsData result = apiInstance.deleteRouteAggregationByUuid(routeAggregationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteAggregationsApi#deleteRouteAggregationByUuid");
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
| **routeAggregationId** | **String**| Route Aggregations Id | |

### Return type

[**RouteAggregationsData**](RouteAggregationsData.md)

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
| **404** | Route Aggregation ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="detachConnectionRouteAggregation"></a>
# **detachConnectionRouteAggregation**
> ConnectionRouteAggregationData detachConnectionRouteAggregation(routeAggregationId, connectionId)

Detach Aggregation

This API provides capability to detach a Route Aggregation from a Connection

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteAggregationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteAggregationsApi apiInstance = new RouteAggregationsApi(defaultClient);
    String routeAggregationId = "routeAggregationId_example"; // String | Route Aggregations Id
    String connectionId = "connectionId_example"; // String | Connection Id
    try {
      ConnectionRouteAggregationData result = apiInstance.detachConnectionRouteAggregation(routeAggregationId, connectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteAggregationsApi#detachConnectionRouteAggregation");
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
| **routeAggregationId** | **String**| Route Aggregations Id | |
| **connectionId** | **String**| Connection Id | |

### Return type

[**ConnectionRouteAggregationData**](ConnectionRouteAggregationData.md)

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
| **404** | Route Aggregation ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="getConnectionRouteAggregationByUuid"></a>
# **getConnectionRouteAggregationByUuid**
> ConnectionRouteAggregationData getConnectionRouteAggregationByUuid(routeAggregationId, connectionId)

Get Aggregation

This API provides capability to view a specific Route Aggregation attached to a Connection

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteAggregationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteAggregationsApi apiInstance = new RouteAggregationsApi(defaultClient);
    String routeAggregationId = "routeAggregationId_example"; // String | Route Aggregations Id
    String connectionId = "connectionId_example"; // String | Connection Id
    try {
      ConnectionRouteAggregationData result = apiInstance.getConnectionRouteAggregationByUuid(routeAggregationId, connectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteAggregationsApi#getConnectionRouteAggregationByUuid");
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
| **routeAggregationId** | **String**| Route Aggregations Id | |
| **connectionId** | **String**| Connection Id | |

### Return type

[**ConnectionRouteAggregationData**](ConnectionRouteAggregationData.md)

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
| **404** | Route Aggregation ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="getConnectionRouteAggregations"></a>
# **getConnectionRouteAggregations**
> GetAllConnectionRouteAggregationsResponse getConnectionRouteAggregations(connectionId)

Get All Aggregations

This API provides capability to view all Route Aggregations attached to a Connection

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteAggregationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteAggregationsApi apiInstance = new RouteAggregationsApi(defaultClient);
    String connectionId = "connectionId_example"; // String | Connection Id
    try {
      GetAllConnectionRouteAggregationsResponse result = apiInstance.getConnectionRouteAggregations(connectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteAggregationsApi#getConnectionRouteAggregations");
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

[**GetAllConnectionRouteAggregationsResponse**](GetAllConnectionRouteAggregationsResponse.md)

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
| **404** | Route Aggregation ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="getRouteAggregationByUuid"></a>
# **getRouteAggregationByUuid**
> RouteAggregationsData getRouteAggregationByUuid(routeAggregationId)

Get Aggregation

This API provides capability to view a Route Aggregation by UUID

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteAggregationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteAggregationsApi apiInstance = new RouteAggregationsApi(defaultClient);
    String routeAggregationId = "routeAggregationId_example"; // String | Route Aggregations Id
    try {
      RouteAggregationsData result = apiInstance.getRouteAggregationByUuid(routeAggregationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteAggregationsApi#getRouteAggregationByUuid");
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
| **routeAggregationId** | **String**| Route Aggregations Id | |

### Return type

[**RouteAggregationsData**](RouteAggregationsData.md)

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
| **404** | Route Aggregation ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="getRouteAggregationChangeByUuid"></a>
# **getRouteAggregationChangeByUuid**
> RouteAggregationChangeData getRouteAggregationChangeByUuid(routeAggregationId, changeId)

Get Change By ID

This API provides capability to retrieve a specific Route Aggregation&#39;s Changes

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteAggregationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteAggregationsApi apiInstance = new RouteAggregationsApi(defaultClient);
    String routeAggregationId = "routeAggregationId_example"; // String | Route Aggregations Id
    UUID changeId = UUID.randomUUID(); // UUID | Routing Protocol Change UUID
    try {
      RouteAggregationChangeData result = apiInstance.getRouteAggregationChangeByUuid(routeAggregationId, changeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteAggregationsApi#getRouteAggregationChangeByUuid");
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
| **routeAggregationId** | **String**| Route Aggregations Id | |
| **changeId** | **UUID**| Routing Protocol Change UUID | |

### Return type

[**RouteAggregationChangeData**](RouteAggregationChangeData.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Route Aggregation Change object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Route Aggregation ID Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="getRouteAggregationChanges"></a>
# **getRouteAggregationChanges**
> RouteAggregationChangeDataResponse getRouteAggregationChanges(routeAggregationId, offset, limit)

Get All Changes

This API provides capability to retrieve all of a Route Aggregation&#39;s Changes

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteAggregationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteAggregationsApi apiInstance = new RouteAggregationsApi(defaultClient);
    String routeAggregationId = "routeAggregationId_example"; // String | Route Aggregations Id
    Integer offset = 1; // Integer | offset
    Integer limit = 10; // Integer | number of records to fetch
    try {
      RouteAggregationChangeDataResponse result = apiInstance.getRouteAggregationChanges(routeAggregationId, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteAggregationsApi#getRouteAggregationChanges");
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
| **routeAggregationId** | **String**| Route Aggregations Id | |
| **offset** | **Integer**| offset | [optional] |
| **limit** | **Integer**| number of records to fetch | [optional] |

### Return type

[**RouteAggregationChangeDataResponse**](RouteAggregationChangeDataResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Route Aggregation Change object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Route Aggregation ID Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="getRouteAggregationConnections"></a>
# **getRouteAggregationConnections**
> GetRouteAggregationGetConnectionsResponse getRouteAggregationConnections(routeAggregationId)

Get All Connections on Route Aggregation

This API provides capability to view all Connections using the Route Aggregation

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteAggregationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteAggregationsApi apiInstance = new RouteAggregationsApi(defaultClient);
    String routeAggregationId = "routeAggregationId_example"; // String | Route Aggregations Id
    try {
      GetRouteAggregationGetConnectionsResponse result = apiInstance.getRouteAggregationConnections(routeAggregationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteAggregationsApi#getRouteAggregationConnections");
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
| **routeAggregationId** | **String**| Route Aggregations Id | |

### Return type

[**GetRouteAggregationGetConnectionsResponse**](GetRouteAggregationGetConnectionsResponse.md)

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
| **404** | Route Aggregation ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="patchRouteAggregationByUuid"></a>
# **patchRouteAggregationByUuid**
> RouteAggregationsData patchRouteAggregationByUuid(routeAggregationId, routeAggregationsPatchRequestItem)

Patch Aggregation

This API provides capability to partially update a Route Aggregation

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteAggregationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteAggregationsApi apiInstance = new RouteAggregationsApi(defaultClient);
    String routeAggregationId = "routeAggregationId_example"; // String | Route Aggregations Id
    List<RouteAggregationsPatchRequestItem> routeAggregationsPatchRequestItem = Arrays.asList(); // List<RouteAggregationsPatchRequestItem> | 
    try {
      RouteAggregationsData result = apiInstance.patchRouteAggregationByUuid(routeAggregationId, routeAggregationsPatchRequestItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteAggregationsApi#patchRouteAggregationByUuid");
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
| **routeAggregationId** | **String**| Route Aggregations Id | |
| **routeAggregationsPatchRequestItem** | [**List&lt;RouteAggregationsPatchRequestItem&gt;**](RouteAggregationsPatchRequestItem.md)|  | |

### Return type

[**RouteAggregationsData**](RouteAggregationsData.md)

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
| **404** | Route Aggregation ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="searchRouteAggregations"></a>
# **searchRouteAggregations**
> RouteAggregationsSearchResponse searchRouteAggregations(routeAggregationsSearchBase)

Search Aggregations

This API provides capability to search Route Aggregations

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteAggregationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteAggregationsApi apiInstance = new RouteAggregationsApi(defaultClient);
    RouteAggregationsSearchBase routeAggregationsSearchBase = new RouteAggregationsSearchBase(); // RouteAggregationsSearchBase | 
    try {
      RouteAggregationsSearchResponse result = apiInstance.searchRouteAggregations(routeAggregationsSearchBase);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteAggregationsApi#searchRouteAggregations");
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
| **routeAggregationsSearchBase** | [**RouteAggregationsSearchBase**](RouteAggregationsSearchBase.md)|  | |

### Return type

[**RouteAggregationsSearchResponse**](RouteAggregationsSearchResponse.md)

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
| **404** | Route Aggregation ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

