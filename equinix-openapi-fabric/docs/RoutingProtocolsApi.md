# RoutingProtocolsApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createConnectionRoutingProtocol**](RoutingProtocolsApi.md#createConnectionRoutingProtocol) | **POST** /fabric/v4/connections/{connectionId}/routingProtocols | Create Protocol |
| [**createConnectionRoutingProtocolsInBulk**](RoutingProtocolsApi.md#createConnectionRoutingProtocolsInBulk) | **POST** /fabric/v4/connections/{connectionId}/routingProtocols/bulk | Bulk Create Protocol |
| [**deleteConnectionRoutingProtocolByUuid**](RoutingProtocolsApi.md#deleteConnectionRoutingProtocolByUuid) | **DELETE** /fabric/v4/connections/{connectionId}/routingProtocols/{routingProtocolId} | Delete Protocol |
| [**getConnectionRoutingProtocolAllBgpActions**](RoutingProtocolsApi.md#getConnectionRoutingProtocolAllBgpActions) | **GET** /fabric/v4/connections/{connectionId}/routingProtocols/{routingProtocolId}/actions | Get BGP Actions |
| [**getConnectionRoutingProtocolByUuid**](RoutingProtocolsApi.md#getConnectionRoutingProtocolByUuid) | **GET** /fabric/v4/connections/{connectionId}/routingProtocols/{routingProtocolId} | Get Protocol |
| [**getConnectionRoutingProtocols**](RoutingProtocolsApi.md#getConnectionRoutingProtocols) | **GET** /fabric/v4/connections/{connectionId}/routingProtocols | GetRoutingProtocols |
| [**getConnectionRoutingProtocolsBgpActionByUuid**](RoutingProtocolsApi.md#getConnectionRoutingProtocolsBgpActionByUuid) | **GET** /fabric/v4/connections/{connectionId}/routingProtocols/{routingProtocolId}/actions/{actionId} | Get BGP Action |
| [**getConnectionRoutingProtocolsChangeByUuid**](RoutingProtocolsApi.md#getConnectionRoutingProtocolsChangeByUuid) | **GET** /fabric/v4/connections/{connectionId}/routingProtocols/{routingProtocolId}/changes/{changeId} | Get Change By ID |
| [**getConnectionRoutingProtocolsChanges**](RoutingProtocolsApi.md#getConnectionRoutingProtocolsChanges) | **GET** /fabric/v4/connections/{connectionId}/routingProtocols/{routingProtocolId}/changes | Get Changes |
| [**patchConnectionRoutingProtocolByUuid**](RoutingProtocolsApi.md#patchConnectionRoutingProtocolByUuid) | **PATCH** /fabric/v4/connections/{connectionId}/routingProtocols/{routingProtocolId} | Patch Protocol |
| [**postConnectionRoutingProtocolBgpActionByUuid**](RoutingProtocolsApi.md#postConnectionRoutingProtocolBgpActionByUuid) | **POST** /fabric/v4/connections/{connectionId}/routingProtocols/{routingProtocolId}/actions | Clear/Reset BGP |
| [**replaceConnectionRoutingProtocolByUuid**](RoutingProtocolsApi.md#replaceConnectionRoutingProtocolByUuid) | **PUT** /fabric/v4/connections/{connectionId}/routingProtocols/{routingProtocolId} | Replace Protocol |
| [**validateRoutingProtocol**](RoutingProtocolsApi.md#validateRoutingProtocol) | **POST** /fabric/v4/routers/{routerId}/validate | Validate Subnet |


<a name="createConnectionRoutingProtocol"></a>
# **createConnectionRoutingProtocol**
> RoutingProtocolData createConnectionRoutingProtocol(connectionId, routingProtocolBase)

Create Protocol

This API provides capability to create Routing Protocol for connections

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RoutingProtocolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RoutingProtocolsApi apiInstance = new RoutingProtocolsApi(defaultClient);
    String connectionId = "connectionId_example"; // String | Connection Id
    RoutingProtocolBase routingProtocolBase = new RoutingProtocolBase(); // RoutingProtocolBase | 
    try {
      RoutingProtocolData result = apiInstance.createConnectionRoutingProtocol(connectionId, routingProtocolBase);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutingProtocolsApi#createConnectionRoutingProtocol");
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
| **routingProtocolBase** | [**RoutingProtocolBase**](RoutingProtocolBase.md)|  | |

### Return type

[**RoutingProtocolData**](RoutingProtocolData.md)

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
| **404** | Connection ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="createConnectionRoutingProtocolsInBulk"></a>
# **createConnectionRoutingProtocolsInBulk**
> GetResponse createConnectionRoutingProtocolsInBulk(connectionId, connectionRoutingProtocolPostRequest)

Bulk Create Protocol

This API provides capability to create Routing Protocol for connections

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RoutingProtocolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RoutingProtocolsApi apiInstance = new RoutingProtocolsApi(defaultClient);
    String connectionId = "connectionId_example"; // String | Connection Id
    ConnectionRoutingProtocolPostRequest connectionRoutingProtocolPostRequest = new ConnectionRoutingProtocolPostRequest(); // ConnectionRoutingProtocolPostRequest | 
    try {
      GetResponse result = apiInstance.createConnectionRoutingProtocolsInBulk(connectionId, connectionRoutingProtocolPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutingProtocolsApi#createConnectionRoutingProtocolsInBulk");
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
| **connectionRoutingProtocolPostRequest** | [**ConnectionRoutingProtocolPostRequest**](ConnectionRoutingProtocolPostRequest.md)|  | |

### Return type

[**GetResponse**](GetResponse.md)

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
| **404** | Connection ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="deleteConnectionRoutingProtocolByUuid"></a>
# **deleteConnectionRoutingProtocolByUuid**
> RoutingProtocolData deleteConnectionRoutingProtocolByUuid(routingProtocolId, connectionId)

Delete Protocol

This API provides capability to delete Routing Protocols on virtual connection

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RoutingProtocolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RoutingProtocolsApi apiInstance = new RoutingProtocolsApi(defaultClient);
    UUID routingProtocolId = UUID.randomUUID(); // UUID | Routing Protocol Id
    String connectionId = "connectionId_example"; // String | Connection Id
    try {
      RoutingProtocolData result = apiInstance.deleteConnectionRoutingProtocolByUuid(routingProtocolId, connectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutingProtocolsApi#deleteConnectionRoutingProtocolByUuid");
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
| **routingProtocolId** | **UUID**| Routing Protocol Id | |
| **connectionId** | **String**| Connection Id | |

### Return type

[**RoutingProtocolData**](RoutingProtocolData.md)

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
| **404** | Connection ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="getConnectionRoutingProtocolAllBgpActions"></a>
# **getConnectionRoutingProtocolAllBgpActions**
> BGPActionsBulkData getConnectionRoutingProtocolAllBgpActions(routingProtocolId, connectionId, offset, limit)

Get BGP Actions

This API provides capability to get all BGP actions status

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RoutingProtocolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RoutingProtocolsApi apiInstance = new RoutingProtocolsApi(defaultClient);
    UUID routingProtocolId = UUID.randomUUID(); // UUID | Routing Protocol Id
    String connectionId = "connectionId_example"; // String | Connection Id
    Integer offset = 1; // Integer | offset
    Integer limit = 10; // Integer | number of records to fetch
    try {
      BGPActionsBulkData result = apiInstance.getConnectionRoutingProtocolAllBgpActions(routingProtocolId, connectionId, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutingProtocolsApi#getConnectionRoutingProtocolAllBgpActions");
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
| **routingProtocolId** | **UUID**| Routing Protocol Id | |
| **connectionId** | **String**| Connection Id | |
| **offset** | **Integer**| offset | [optional] |
| **limit** | **Integer**| number of records to fetch | [optional] |

### Return type

[**BGPActionsBulkData**](BGPActionsBulkData.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric BGP Action object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Connection ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="getConnectionRoutingProtocolByUuid"></a>
# **getConnectionRoutingProtocolByUuid**
> RoutingProtocolData getConnectionRoutingProtocolByUuid(routingProtocolId, connectionId)

Get Protocol

This API provides capability to accept/reject user&#39;s virtual connection

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RoutingProtocolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RoutingProtocolsApi apiInstance = new RoutingProtocolsApi(defaultClient);
    UUID routingProtocolId = UUID.randomUUID(); // UUID | Routing Protocol Id
    String connectionId = "connectionId_example"; // String | Connection Id
    try {
      RoutingProtocolData result = apiInstance.getConnectionRoutingProtocolByUuid(routingProtocolId, connectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutingProtocolsApi#getConnectionRoutingProtocolByUuid");
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
| **routingProtocolId** | **UUID**| Routing Protocol Id | |
| **connectionId** | **String**| Connection Id | |

### Return type

[**RoutingProtocolData**](RoutingProtocolData.md)

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
| **404** | Connection ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="getConnectionRoutingProtocols"></a>
# **getConnectionRoutingProtocols**
> GetResponse getConnectionRoutingProtocols(connectionId, offset, limit)

GetRoutingProtocols

This API provides capability to get Routing Protocols for connections

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RoutingProtocolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RoutingProtocolsApi apiInstance = new RoutingProtocolsApi(defaultClient);
    String connectionId = "connectionId_example"; // String | Connection Id
    Integer offset = 1; // Integer | offset
    Integer limit = 10; // Integer | number of records to fetch
    try {
      GetResponse result = apiInstance.getConnectionRoutingProtocols(connectionId, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutingProtocolsApi#getConnectionRoutingProtocols");
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
| **offset** | **Integer**| offset | [optional] |
| **limit** | **Integer**| number of records to fetch | [optional] |

### Return type

[**GetResponse**](GetResponse.md)

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
| **404** | Connection ID Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="getConnectionRoutingProtocolsBgpActionByUuid"></a>
# **getConnectionRoutingProtocolsBgpActionByUuid**
> BGPActionData getConnectionRoutingProtocolsBgpActionByUuid(connectionId, routingProtocolId, actionId)

Get BGP Action

This API provides capability to retrieve specific BGP action

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RoutingProtocolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RoutingProtocolsApi apiInstance = new RoutingProtocolsApi(defaultClient);
    String connectionId = "connectionId_example"; // String | Connection Id
    UUID routingProtocolId = UUID.randomUUID(); // UUID | Routing Protocol Id
    UUID actionId = UUID.randomUUID(); // UUID | BGP Action UUID
    try {
      BGPActionData result = apiInstance.getConnectionRoutingProtocolsBgpActionByUuid(connectionId, routingProtocolId, actionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutingProtocolsApi#getConnectionRoutingProtocolsBgpActionByUuid");
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
| **routingProtocolId** | **UUID**| Routing Protocol Id | |
| **actionId** | **UUID**| BGP Action UUID | |

### Return type

[**BGPActionData**](BGPActionData.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric BGP Action object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Connection ID Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="getConnectionRoutingProtocolsChangeByUuid"></a>
# **getConnectionRoutingProtocolsChangeByUuid**
> RoutingProtocolChangeData getConnectionRoutingProtocolsChangeByUuid(connectionId, routingProtocolId, changeId)

Get Change By ID

This API provides capability to retrieve specific Routing Protocol Change

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RoutingProtocolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RoutingProtocolsApi apiInstance = new RoutingProtocolsApi(defaultClient);
    String connectionId = "connectionId_example"; // String | Connection Id
    UUID routingProtocolId = UUID.randomUUID(); // UUID | Routing Protocol Id
    UUID changeId = UUID.randomUUID(); // UUID | Routing Protocol Change UUID
    try {
      RoutingProtocolChangeData result = apiInstance.getConnectionRoutingProtocolsChangeByUuid(connectionId, routingProtocolId, changeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutingProtocolsApi#getConnectionRoutingProtocolsChangeByUuid");
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
| **routingProtocolId** | **UUID**| Routing Protocol Id | |
| **changeId** | **UUID**| Routing Protocol Change UUID | |

### Return type

[**RoutingProtocolChangeData**](RoutingProtocolChangeData.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Routing Protocol Change object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Connection ID Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="getConnectionRoutingProtocolsChanges"></a>
# **getConnectionRoutingProtocolsChanges**
> RoutingProtocolChangeDataResponse getConnectionRoutingProtocolsChanges(connectionId, routingProtocolId, offset, limit)

Get Changes

This API provides capability to retrieve user&#39;s Routing Protocol Changes

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RoutingProtocolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RoutingProtocolsApi apiInstance = new RoutingProtocolsApi(defaultClient);
    String connectionId = "connectionId_example"; // String | Connection Id
    UUID routingProtocolId = UUID.randomUUID(); // UUID | Routing Protocol Id
    Integer offset = 1; // Integer | offset
    Integer limit = 10; // Integer | number of records to fetch
    try {
      RoutingProtocolChangeDataResponse result = apiInstance.getConnectionRoutingProtocolsChanges(connectionId, routingProtocolId, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutingProtocolsApi#getConnectionRoutingProtocolsChanges");
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
| **routingProtocolId** | **UUID**| Routing Protocol Id | |
| **offset** | **Integer**| offset | [optional] |
| **limit** | **Integer**| number of records to fetch | [optional] |

### Return type

[**RoutingProtocolChangeDataResponse**](RoutingProtocolChangeDataResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Routing Protocol Change object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Connection ID Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="patchConnectionRoutingProtocolByUuid"></a>
# **patchConnectionRoutingProtocolByUuid**
> RoutingProtocolData patchConnectionRoutingProtocolByUuid(routingProtocolId, connectionId, connectionChangeOperation)

Patch Protocol

This API provides capability to partially update Routing Protocols on a virtual connection

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RoutingProtocolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RoutingProtocolsApi apiInstance = new RoutingProtocolsApi(defaultClient);
    UUID routingProtocolId = UUID.randomUUID(); // UUID | Routing Protocol Id
    String connectionId = "connectionId_example"; // String | Connection Id
    List<ConnectionChangeOperation> connectionChangeOperation = Arrays.asList(); // List<ConnectionChangeOperation> | 
    try {
      RoutingProtocolData result = apiInstance.patchConnectionRoutingProtocolByUuid(routingProtocolId, connectionId, connectionChangeOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutingProtocolsApi#patchConnectionRoutingProtocolByUuid");
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
| **routingProtocolId** | **UUID**| Routing Protocol Id | |
| **connectionId** | **String**| Connection Id | |
| **connectionChangeOperation** | [**List&lt;ConnectionChangeOperation&gt;**](ConnectionChangeOperation.md)|  | |

### Return type

[**RoutingProtocolData**](RoutingProtocolData.md)

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
| **404** | Connection ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="postConnectionRoutingProtocolBgpActionByUuid"></a>
# **postConnectionRoutingProtocolBgpActionByUuid**
> BGPActionData postConnectionRoutingProtocolBgpActionByUuid(routingProtocolId, connectionId, bgPActionRequest)

Clear/Reset BGP

This API provides capability to clear/reset Routing Protocols BGP session

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RoutingProtocolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RoutingProtocolsApi apiInstance = new RoutingProtocolsApi(defaultClient);
    UUID routingProtocolId = UUID.randomUUID(); // UUID | Routing Protocol Id
    String connectionId = "connectionId_example"; // String | Connection Id
    BGPActionRequest bgPActionRequest = new BGPActionRequest(); // BGPActionRequest | 
    try {
      BGPActionData result = apiInstance.postConnectionRoutingProtocolBgpActionByUuid(routingProtocolId, connectionId, bgPActionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutingProtocolsApi#postConnectionRoutingProtocolBgpActionByUuid");
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
| **routingProtocolId** | **UUID**| Routing Protocol Id | |
| **connectionId** | **String**| Connection Id | |
| **bgPActionRequest** | [**BGPActionRequest**](BGPActionRequest.md)|  | |

### Return type

[**BGPActionData**](BGPActionData.md)

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
| **404** | Connection ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="replaceConnectionRoutingProtocolByUuid"></a>
# **replaceConnectionRoutingProtocolByUuid**
> RoutingProtocolData replaceConnectionRoutingProtocolByUuid(routingProtocolId, connectionId, routingProtocolBase)

Replace Protocol

This API provides capability to replace complete Routing Protocols on a virtual connection

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RoutingProtocolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RoutingProtocolsApi apiInstance = new RoutingProtocolsApi(defaultClient);
    UUID routingProtocolId = UUID.randomUUID(); // UUID | Routing Protocol Id
    String connectionId = "connectionId_example"; // String | Connection Id
    RoutingProtocolBase routingProtocolBase = new RoutingProtocolBase(); // RoutingProtocolBase | 
    try {
      RoutingProtocolData result = apiInstance.replaceConnectionRoutingProtocolByUuid(routingProtocolId, connectionId, routingProtocolBase);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutingProtocolsApi#replaceConnectionRoutingProtocolByUuid");
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
| **routingProtocolId** | **UUID**| Routing Protocol Id | |
| **connectionId** | **String**| Connection Id | |
| **routingProtocolBase** | [**RoutingProtocolBase**](RoutingProtocolBase.md)|  | |

### Return type

[**RoutingProtocolData**](RoutingProtocolData.md)

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
| **404** | Connection ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="validateRoutingProtocol"></a>
# **validateRoutingProtocol**
> ValidateSubnetResponse validateRoutingProtocol(routerId, validateRequest)

Validate Subnet

This API provides capability to validate all subnets associated with any connection in the given FCR

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RoutingProtocolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RoutingProtocolsApi apiInstance = new RoutingProtocolsApi(defaultClient);
    UUID routerId = UUID.randomUUID(); // UUID | Cloud Router UUID
    ValidateRequest validateRequest = new ValidateRequest(); // ValidateRequest | 
    try {
      ValidateSubnetResponse result = apiInstance.validateRoutingProtocol(routerId, validateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutingProtocolsApi#validateRoutingProtocol");
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
| **validateRequest** | [**ValidateRequest**](ValidateRequest.md)|  | |

### Return type

[**ValidateSubnetResponse**](ValidateSubnetResponse.md)

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

