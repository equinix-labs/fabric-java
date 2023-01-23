# RoutingProtocolsApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createConnectionRoutingProtocol**](RoutingProtocolsApi.md#createConnectionRoutingProtocol) | **POST** /fabric/v4/connections/{connectionId}/routingProtocols | Create Protocol |
| [**createConnectionRoutingProtocolsInBulk**](RoutingProtocolsApi.md#createConnectionRoutingProtocolsInBulk) | **POST** /fabric/v4/connections/{connectionId}/routingProtocols/bulk | Bulk Create Protocol |
| [**deleteConnectionRoutingProtocolByUuid**](RoutingProtocolsApi.md#deleteConnectionRoutingProtocolByUuid) | **DELETE** /fabric/v4/connections/{connectionId}/routingProtocols/{routingProtocolId} | Delete Protocol |
| [**getConnectionRoutingProtocolByUuid**](RoutingProtocolsApi.md#getConnectionRoutingProtocolByUuid) | **GET** /fabric/v4/connections/{connectionId}/routingProtocols/{routingProtocolId} | Get Protocol |
| [**getConnectionRoutingProtocols**](RoutingProtocolsApi.md#getConnectionRoutingProtocols) | **GET** /fabric/v4/connections/{connectionId}/routingProtocols | GetRoutingProtocols |
| [**getConnectionRoutingProtocolsChangeByUuid**](RoutingProtocolsApi.md#getConnectionRoutingProtocolsChangeByUuid) | **GET** /fabric/v4/connections/{connectionId}/routingProtocols/{routingProtocolId}/changes/{changeId} | Get Change By ID |
| [**getConnectionRoutingProtocolsChanges**](RoutingProtocolsApi.md#getConnectionRoutingProtocolsChanges) | **GET** /fabric/v4/connections/{connectionId}/routingProtocols/{routingProtocolId}/changes | Get Changes |
| [**replaceConnectionRoutingProtocolByUuid**](RoutingProtocolsApi.md#replaceConnectionRoutingProtocolByUuid) | **PUT** /fabric/v4/connections/{connectionId}/routingProtocols/{routingProtocolId} | Replace Protocol |


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
    Integer offset = 56; // Integer | offset
    Integer limit = 56; // Integer | number of records to fetch
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
    Integer offset = 56; // Integer | offset
    Integer limit = 56; // Integer | number of records to fetch
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

