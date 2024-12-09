# RouteAggregationRulesApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRouteAggregationRule**](RouteAggregationRulesApi.md#createRouteAggregationRule) | **POST** /fabric/v4/routeAggregations/{routeAggregationId}/routeAggregationRules | Create RARule |
| [**createRouteAggregationRulesInBulk**](RouteAggregationRulesApi.md#createRouteAggregationRulesInBulk) | **POST** /fabric/v4/routeAggregations/{routeAggregationId}/routeAggregationRules/bulk | Bulk RARules |
| [**deleteRouteAggregationRuleByUuid**](RouteAggregationRulesApi.md#deleteRouteAggregationRuleByUuid) | **DELETE** /fabric/v4/routeAggregations/{routeAggregationId}/routeAggregationRules/{routeAggregationRuleId} | DeleteRARule |
| [**getRouteAggregationRuleByUuid**](RouteAggregationRulesApi.md#getRouteAggregationRuleByUuid) | **GET** /fabric/v4/routeAggregations/{routeAggregationId}/routeAggregationRules/{routeAggregationRuleId} | GetRARule By UUID |
| [**getRouteAggregationRuleChangeByUuid**](RouteAggregationRulesApi.md#getRouteAggregationRuleChangeByUuid) | **GET** /fabric/v4/routeAggregations/{routeAggregationId}/routeAggregationRules/{routeAggregationRuleId}/changes/{changeId} | Get Change By ID |
| [**getRouteAggregationRuleChanges**](RouteAggregationRulesApi.md#getRouteAggregationRuleChanges) | **GET** /fabric/v4/routeAggregations/{routeAggregationId}/routeAggregationRules/{routeAggregationRuleId}/changes | Get All Changes |
| [**getRouteAggregationRules**](RouteAggregationRulesApi.md#getRouteAggregationRules) | **GET** /fabric/v4/routeAggregations/{routeAggregationId}/routeAggregationRules | GetRARules |
| [**patchRouteAggregationRuleByUuid**](RouteAggregationRulesApi.md#patchRouteAggregationRuleByUuid) | **PATCH** /fabric/v4/routeAggregations/{routeAggregationId}/routeAggregationRules/{routeAggregationRuleId} | PatchRARule |
| [**replaceRouteAggregationRuleByUuid**](RouteAggregationRulesApi.md#replaceRouteAggregationRuleByUuid) | **PUT** /fabric/v4/routeAggregations/{routeAggregationId}/routeAggregationRules/{routeAggregationRuleId} | ReplaceRARule |


<a name="createRouteAggregationRule"></a>
# **createRouteAggregationRule**
> RouteAggregationRulesData createRouteAggregationRule(routeAggregationId, routeAggregationRulesBase)

Create RARule

This API provides capability to create a Route Aggregation Rule

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteAggregationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteAggregationRulesApi apiInstance = new RouteAggregationRulesApi(defaultClient);
    String routeAggregationId = "routeAggregationId_example"; // String | Route Aggregations Id
    RouteAggregationRulesBase routeAggregationRulesBase = new RouteAggregationRulesBase(); // RouteAggregationRulesBase | 
    try {
      RouteAggregationRulesData result = apiInstance.createRouteAggregationRule(routeAggregationId, routeAggregationRulesBase);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteAggregationRulesApi#createRouteAggregationRule");
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
| **routeAggregationRulesBase** | [**RouteAggregationRulesBase**](RouteAggregationRulesBase.md)|  | |

### Return type

[**RouteAggregationRulesData**](RouteAggregationRulesData.md)

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
| **404** | Route Aggregation Rule ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="createRouteAggregationRulesInBulk"></a>
# **createRouteAggregationRulesInBulk**
> GetRouteAggregationRulesResponse createRouteAggregationRulesInBulk(routeAggregationId, routeAggregationRulesPostRequest)

Bulk RARules

This API provides capability to create bulk route aggregation rules

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteAggregationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteAggregationRulesApi apiInstance = new RouteAggregationRulesApi(defaultClient);
    String routeAggregationId = "routeAggregationId_example"; // String | Route Aggregations Id
    RouteAggregationRulesPostRequest routeAggregationRulesPostRequest = new RouteAggregationRulesPostRequest(); // RouteAggregationRulesPostRequest | 
    try {
      GetRouteAggregationRulesResponse result = apiInstance.createRouteAggregationRulesInBulk(routeAggregationId, routeAggregationRulesPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteAggregationRulesApi#createRouteAggregationRulesInBulk");
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
| **routeAggregationRulesPostRequest** | [**RouteAggregationRulesPostRequest**](RouteAggregationRulesPostRequest.md)|  | |

### Return type

[**GetRouteAggregationRulesResponse**](GetRouteAggregationRulesResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful operation |  -  |
| **400** | Resource not found |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="deleteRouteAggregationRuleByUuid"></a>
# **deleteRouteAggregationRuleByUuid**
> RouteAggregationRulesData deleteRouteAggregationRuleByUuid(routeAggregationId, routeAggregationRuleId)

DeleteRARule

This API provides capability to delete a Route aggregation Rule

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteAggregationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteAggregationRulesApi apiInstance = new RouteAggregationRulesApi(defaultClient);
    String routeAggregationId = "routeAggregationId_example"; // String | Route Aggregations Id
    String routeAggregationRuleId = "routeAggregationRuleId_example"; // String | Route Aggregation Rules Id
    try {
      RouteAggregationRulesData result = apiInstance.deleteRouteAggregationRuleByUuid(routeAggregationId, routeAggregationRuleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteAggregationRulesApi#deleteRouteAggregationRuleByUuid");
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
| **routeAggregationRuleId** | **String**| Route Aggregation Rules Id | |

### Return type

[**RouteAggregationRulesData**](RouteAggregationRulesData.md)

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

<a name="getRouteAggregationRuleByUuid"></a>
# **getRouteAggregationRuleByUuid**
> RouteAggregationRulesData getRouteAggregationRuleByUuid(routeAggregationId, routeAggregationRuleId)

GetRARule By UUID

This API provides capability to view a Route Aggregation Rule by UUID

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteAggregationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteAggregationRulesApi apiInstance = new RouteAggregationRulesApi(defaultClient);
    String routeAggregationId = "routeAggregationId_example"; // String | Route Aggregations Id
    String routeAggregationRuleId = "routeAggregationRuleId_example"; // String | Route Aggregation Rules Id
    try {
      RouteAggregationRulesData result = apiInstance.getRouteAggregationRuleByUuid(routeAggregationId, routeAggregationRuleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteAggregationRulesApi#getRouteAggregationRuleByUuid");
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
| **routeAggregationRuleId** | **String**| Route Aggregation Rules Id | |

### Return type

[**RouteAggregationRulesData**](RouteAggregationRulesData.md)

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

<a name="getRouteAggregationRuleChangeByUuid"></a>
# **getRouteAggregationRuleChangeByUuid**
> RouteAggregationRulesChangeData getRouteAggregationRuleChangeByUuid(routeAggregationId, routeAggregationRuleId, changeId)

Get Change By ID

This API provides capability to retrieve a specific Route Aggregation Rule&#39;s Changes

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteAggregationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteAggregationRulesApi apiInstance = new RouteAggregationRulesApi(defaultClient);
    String routeAggregationId = "routeAggregationId_example"; // String | Route Aggregations Id
    String routeAggregationRuleId = "routeAggregationRuleId_example"; // String | Route Aggregation Rules Id
    UUID changeId = UUID.randomUUID(); // UUID | Route Aggregation Rule Change UUID
    try {
      RouteAggregationRulesChangeData result = apiInstance.getRouteAggregationRuleChangeByUuid(routeAggregationId, routeAggregationRuleId, changeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteAggregationRulesApi#getRouteAggregationRuleChangeByUuid");
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
| **routeAggregationRuleId** | **String**| Route Aggregation Rules Id | |
| **changeId** | **UUID**| Route Aggregation Rule Change UUID | |

### Return type

[**RouteAggregationRulesChangeData**](RouteAggregationRulesChangeData.md)

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

<a name="getRouteAggregationRuleChanges"></a>
# **getRouteAggregationRuleChanges**
> RouteAggregationRulesChangeDataResponse getRouteAggregationRuleChanges(routeAggregationId, routeAggregationRuleId, offset, limit)

Get All Changes

This API provides capability to retrieve all of a Route Aggregation Rule&#39;s Changes

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteAggregationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteAggregationRulesApi apiInstance = new RouteAggregationRulesApi(defaultClient);
    String routeAggregationId = "routeAggregationId_example"; // String | Route Aggregations Id
    String routeAggregationRuleId = "routeAggregationRuleId_example"; // String | Route Aggregation Rules Id
    Integer offset = 1; // Integer | offset
    Integer limit = 10; // Integer | number of records to fetch
    try {
      RouteAggregationRulesChangeDataResponse result = apiInstance.getRouteAggregationRuleChanges(routeAggregationId, routeAggregationRuleId, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteAggregationRulesApi#getRouteAggregationRuleChanges");
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
| **routeAggregationRuleId** | **String**| Route Aggregation Rules Id | |
| **offset** | **Integer**| offset | [optional] |
| **limit** | **Integer**| number of records to fetch | [optional] |

### Return type

[**RouteAggregationRulesChangeDataResponse**](RouteAggregationRulesChangeDataResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Route Aggregation Rule Change object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Route Aggregation ID Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="getRouteAggregationRules"></a>
# **getRouteAggregationRules**
> GetRouteAggregationRulesResponse getRouteAggregationRules(routeAggregationId, offset, limit)

GetRARules

This API provides capability to get all Route Aggregations Rules for Fabric

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteAggregationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteAggregationRulesApi apiInstance = new RouteAggregationRulesApi(defaultClient);
    String routeAggregationId = "routeAggregationId_example"; // String | Route Aggregations Id
    Integer offset = 1; // Integer | offset
    Integer limit = 10; // Integer | number of records to fetch
    try {
      GetRouteAggregationRulesResponse result = apiInstance.getRouteAggregationRules(routeAggregationId, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteAggregationRulesApi#getRouteAggregationRules");
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

[**GetRouteAggregationRulesResponse**](GetRouteAggregationRulesResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Resource not found |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Route Aggregation Rule ID Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="patchRouteAggregationRuleByUuid"></a>
# **patchRouteAggregationRuleByUuid**
> RouteAggregationRulesData patchRouteAggregationRuleByUuid(routeAggregationId, routeAggregationRuleId, routeAggregationRulesPatchRequestItem)

PatchRARule

This API provides capability to partially update a Route Aggregation Rule

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteAggregationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteAggregationRulesApi apiInstance = new RouteAggregationRulesApi(defaultClient);
    String routeAggregationId = "routeAggregationId_example"; // String | Route Aggregations Id
    String routeAggregationRuleId = "routeAggregationRuleId_example"; // String | Route Aggregation Rules Id
    List<RouteAggregationRulesPatchRequestItem> routeAggregationRulesPatchRequestItem = Arrays.asList(); // List<RouteAggregationRulesPatchRequestItem> | 
    try {
      RouteAggregationRulesData result = apiInstance.patchRouteAggregationRuleByUuid(routeAggregationId, routeAggregationRuleId, routeAggregationRulesPatchRequestItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteAggregationRulesApi#patchRouteAggregationRuleByUuid");
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
| **routeAggregationRuleId** | **String**| Route Aggregation Rules Id | |
| **routeAggregationRulesPatchRequestItem** | [**List&lt;RouteAggregationRulesPatchRequestItem&gt;**](RouteAggregationRulesPatchRequestItem.md)|  | |

### Return type

[**RouteAggregationRulesData**](RouteAggregationRulesData.md)

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

<a name="replaceRouteAggregationRuleByUuid"></a>
# **replaceRouteAggregationRuleByUuid**
> RouteAggregationRulesData replaceRouteAggregationRuleByUuid(routeAggregationId, routeAggregationRuleId, routeAggregationRulesBase)

ReplaceRARule

This API provides capability to replace a Route Aggregation Rule completely

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteAggregationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteAggregationRulesApi apiInstance = new RouteAggregationRulesApi(defaultClient);
    String routeAggregationId = "routeAggregationId_example"; // String | Route Aggregations Id
    String routeAggregationRuleId = "routeAggregationRuleId_example"; // String | Route Aggregation Rules Id
    RouteAggregationRulesBase routeAggregationRulesBase = new RouteAggregationRulesBase(); // RouteAggregationRulesBase | 
    try {
      RouteAggregationRulesData result = apiInstance.replaceRouteAggregationRuleByUuid(routeAggregationId, routeAggregationRuleId, routeAggregationRulesBase);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteAggregationRulesApi#replaceRouteAggregationRuleByUuid");
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
| **routeAggregationRuleId** | **String**| Route Aggregation Rules Id | |
| **routeAggregationRulesBase** | [**RouteAggregationRulesBase**](RouteAggregationRulesBase.md)|  | |

### Return type

[**RouteAggregationRulesData**](RouteAggregationRulesData.md)

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

