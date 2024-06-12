# RouteFilterRulesApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRouteFilterRule**](RouteFilterRulesApi.md#createRouteFilterRule) | **POST** /fabric/v4/routeFilters/{routeFilterId}/routeFilterRules | Create RFRule |
| [**createRouteFilterRulesInBulk**](RouteFilterRulesApi.md#createRouteFilterRulesInBulk) | **POST** /fabric/v4/routeFilters/{routeFilterId}/routeFilterRules/bulk | Bulk RFRules |
| [**deleteRouteFilterRuleByUuid**](RouteFilterRulesApi.md#deleteRouteFilterRuleByUuid) | **DELETE** /fabric/v4/routeFilters/{routeFilterId}/routeFilterRules/{routeFilterRuleId} | DeleteRFRule |
| [**getRouteFilterRuleByUuid**](RouteFilterRulesApi.md#getRouteFilterRuleByUuid) | **GET** /fabric/v4/routeFilters/{routeFilterId}/routeFilterRules/{routeFilterRuleId} | GetRFRule By UUID |
| [**getRouteFilterRuleChangeByUuid**](RouteFilterRulesApi.md#getRouteFilterRuleChangeByUuid) | **GET** /fabric/v4/routeFilters/{routeFilterId}/routeFilterRules/{routeFilterRuleId}/changes/{changeId} | Get Change By ID |
| [**getRouteFilterRuleChanges**](RouteFilterRulesApi.md#getRouteFilterRuleChanges) | **GET** /fabric/v4/routeFilters/{routeFilterId}/routeFilterRules/{routeFilterRuleId}/changes | Get All Changes |
| [**getRouteFilterRules**](RouteFilterRulesApi.md#getRouteFilterRules) | **GET** /fabric/v4/routeFilters/{routeFilterId}/routeFilterRules | GetRFRules |
| [**patchRouteFilterRuleByUuid**](RouteFilterRulesApi.md#patchRouteFilterRuleByUuid) | **PATCH** /fabric/v4/routeFilters/{routeFilterId}/routeFilterRules/{routeFilterRuleId} | PatchRFilterRule |
| [**replaceRouteFilterRuleByUuid**](RouteFilterRulesApi.md#replaceRouteFilterRuleByUuid) | **PUT** /fabric/v4/routeFilters/{routeFilterId}/routeFilterRules/{routeFilterRuleId} | ReplaceRFRule |


<a name="createRouteFilterRule"></a>
# **createRouteFilterRule**
> RouteFilterRulesData createRouteFilterRule(routeFilterId, routeFilterRulesBase)

Create RFRule

This API provides capability to create a Route Filter Rule

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteFilterRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteFilterRulesApi apiInstance = new RouteFilterRulesApi(defaultClient);
    String routeFilterId = "routeFilterId_example"; // String | Route Filters Id
    RouteFilterRulesBase routeFilterRulesBase = new RouteFilterRulesBase(); // RouteFilterRulesBase | 
    try {
      RouteFilterRulesData result = apiInstance.createRouteFilterRule(routeFilterId, routeFilterRulesBase);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteFilterRulesApi#createRouteFilterRule");
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
| **routeFilterRulesBase** | [**RouteFilterRulesBase**](RouteFilterRulesBase.md)|  | |

### Return type

[**RouteFilterRulesData**](RouteFilterRulesData.md)

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
| **404** | Route Filter Rule ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="createRouteFilterRulesInBulk"></a>
# **createRouteFilterRulesInBulk**
> GetRouteFilterRulesResponse createRouteFilterRulesInBulk(routeFilterId, routeFilterRulesPostRequest)

Bulk RFRules

This API provides capability to create bulk route filter rules

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteFilterRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteFilterRulesApi apiInstance = new RouteFilterRulesApi(defaultClient);
    String routeFilterId = "routeFilterId_example"; // String | Route Filters Id
    RouteFilterRulesPostRequest routeFilterRulesPostRequest = new RouteFilterRulesPostRequest(); // RouteFilterRulesPostRequest | 
    try {
      GetRouteFilterRulesResponse result = apiInstance.createRouteFilterRulesInBulk(routeFilterId, routeFilterRulesPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteFilterRulesApi#createRouteFilterRulesInBulk");
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
| **routeFilterRulesPostRequest** | [**RouteFilterRulesPostRequest**](RouteFilterRulesPostRequest.md)|  | |

### Return type

[**GetRouteFilterRulesResponse**](GetRouteFilterRulesResponse.md)

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

<a name="deleteRouteFilterRuleByUuid"></a>
# **deleteRouteFilterRuleByUuid**
> RouteFilterRulesData deleteRouteFilterRuleByUuid(routeFilterId, routeFilterRuleId)

DeleteRFRule

This API provides capability to delete a Route Filter Rule

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteFilterRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteFilterRulesApi apiInstance = new RouteFilterRulesApi(defaultClient);
    String routeFilterId = "routeFilterId_example"; // String | Route Filters Id
    String routeFilterRuleId = "routeFilterRuleId_example"; // String | Route  Filter  Rules Id
    try {
      RouteFilterRulesData result = apiInstance.deleteRouteFilterRuleByUuid(routeFilterId, routeFilterRuleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteFilterRulesApi#deleteRouteFilterRuleByUuid");
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
| **routeFilterRuleId** | **String**| Route  Filter  Rules Id | |

### Return type

[**RouteFilterRulesData**](RouteFilterRulesData.md)

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

<a name="getRouteFilterRuleByUuid"></a>
# **getRouteFilterRuleByUuid**
> RouteFilterRulesData getRouteFilterRuleByUuid(routeFilterId, routeFilterRuleId)

GetRFRule By UUID

This API provides capability to view a Route Filter Rule by UUID

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteFilterRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteFilterRulesApi apiInstance = new RouteFilterRulesApi(defaultClient);
    String routeFilterId = "routeFilterId_example"; // String | Route Filters Id
    String routeFilterRuleId = "routeFilterRuleId_example"; // String | Route  Filter  Rules Id
    try {
      RouteFilterRulesData result = apiInstance.getRouteFilterRuleByUuid(routeFilterId, routeFilterRuleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteFilterRulesApi#getRouteFilterRuleByUuid");
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
| **routeFilterRuleId** | **String**| Route  Filter  Rules Id | |

### Return type

[**RouteFilterRulesData**](RouteFilterRulesData.md)

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

<a name="getRouteFilterRuleChangeByUuid"></a>
# **getRouteFilterRuleChangeByUuid**
> RouteFilterRulesChangeData getRouteFilterRuleChangeByUuid(routeFilterId, routeFilterRuleId, changeId)

Get Change By ID

This API provides capability to retrieve a specific Route Filter Rule&#39;s Changes

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteFilterRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteFilterRulesApi apiInstance = new RouteFilterRulesApi(defaultClient);
    String routeFilterId = "routeFilterId_example"; // String | Route Filters Id
    String routeFilterRuleId = "routeFilterRuleId_example"; // String | Route  Filter  Rules Id
    UUID changeId = UUID.randomUUID(); // UUID | Route Filter Rule Change UUID
    try {
      RouteFilterRulesChangeData result = apiInstance.getRouteFilterRuleChangeByUuid(routeFilterId, routeFilterRuleId, changeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteFilterRulesApi#getRouteFilterRuleChangeByUuid");
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
| **routeFilterRuleId** | **String**| Route  Filter  Rules Id | |
| **changeId** | **UUID**| Route Filter Rule Change UUID | |

### Return type

[**RouteFilterRulesChangeData**](RouteFilterRulesChangeData.md)

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

<a name="getRouteFilterRuleChanges"></a>
# **getRouteFilterRuleChanges**
> RouteFilterRulesChangeDataResponse getRouteFilterRuleChanges(routeFilterId, routeFilterRuleId, offset, limit)

Get All Changes

This API provides capability to retrieve all of a Route Filter Rule&#39;s Changes

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteFilterRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteFilterRulesApi apiInstance = new RouteFilterRulesApi(defaultClient);
    String routeFilterId = "routeFilterId_example"; // String | Route Filters Id
    String routeFilterRuleId = "routeFilterRuleId_example"; // String | Route  Filter  Rules Id
    Integer offset = 1; // Integer | offset
    Integer limit = 10; // Integer | number of records to fetch
    try {
      RouteFilterRulesChangeDataResponse result = apiInstance.getRouteFilterRuleChanges(routeFilterId, routeFilterRuleId, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteFilterRulesApi#getRouteFilterRuleChanges");
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
| **routeFilterRuleId** | **String**| Route  Filter  Rules Id | |
| **offset** | **Integer**| offset | [optional] |
| **limit** | **Integer**| number of records to fetch | [optional] |

### Return type

[**RouteFilterRulesChangeDataResponse**](RouteFilterRulesChangeDataResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Route Filter Rule Change object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Route Filter ID Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="getRouteFilterRules"></a>
# **getRouteFilterRules**
> GetRouteFilterRulesResponse getRouteFilterRules(routeFilterId, offset, limit)

GetRFRules

This API provides capability to get all Route Filters Rules for Fabric

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteFilterRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteFilterRulesApi apiInstance = new RouteFilterRulesApi(defaultClient);
    String routeFilterId = "routeFilterId_example"; // String | Route Filters Id
    Integer offset = 1; // Integer | offset
    Integer limit = 10; // Integer | number of records to fetch
    try {
      GetRouteFilterRulesResponse result = apiInstance.getRouteFilterRules(routeFilterId, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteFilterRulesApi#getRouteFilterRules");
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

[**GetRouteFilterRulesResponse**](GetRouteFilterRulesResponse.md)

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
| **404** | Route Filter Rule ID Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="patchRouteFilterRuleByUuid"></a>
# **patchRouteFilterRuleByUuid**
> RouteFilterRulesData patchRouteFilterRuleByUuid(routeFilterId, routeFilterRuleId, routeFilterRulesPatchRequestItem)

PatchRFilterRule

This API provides capability to partially update a Route Filter Rule

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteFilterRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteFilterRulesApi apiInstance = new RouteFilterRulesApi(defaultClient);
    String routeFilterId = "routeFilterId_example"; // String | Route Filters Id
    String routeFilterRuleId = "routeFilterRuleId_example"; // String | Route  Filter  Rules Id
    List<RouteFilterRulesPatchRequestItem> routeFilterRulesPatchRequestItem = Arrays.asList(); // List<RouteFilterRulesPatchRequestItem> | 
    try {
      RouteFilterRulesData result = apiInstance.patchRouteFilterRuleByUuid(routeFilterId, routeFilterRuleId, routeFilterRulesPatchRequestItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteFilterRulesApi#patchRouteFilterRuleByUuid");
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
| **routeFilterRuleId** | **String**| Route  Filter  Rules Id | |
| **routeFilterRulesPatchRequestItem** | [**List&lt;RouteFilterRulesPatchRequestItem&gt;**](RouteFilterRulesPatchRequestItem.md)|  | |

### Return type

[**RouteFilterRulesData**](RouteFilterRulesData.md)

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

<a name="replaceRouteFilterRuleByUuid"></a>
# **replaceRouteFilterRuleByUuid**
> RouteFilterRulesData replaceRouteFilterRuleByUuid(routeFilterId, routeFilterRuleId, routeFilterRulesBase)

ReplaceRFRule

This API provides capability to replace a Route Filter Rule completely

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RouteFilterRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RouteFilterRulesApi apiInstance = new RouteFilterRulesApi(defaultClient);
    String routeFilterId = "routeFilterId_example"; // String | Route Filters Id
    String routeFilterRuleId = "routeFilterRuleId_example"; // String | Route  Filter  Rules Id
    RouteFilterRulesBase routeFilterRulesBase = new RouteFilterRulesBase(); // RouteFilterRulesBase | 
    try {
      RouteFilterRulesData result = apiInstance.replaceRouteFilterRuleByUuid(routeFilterId, routeFilterRuleId, routeFilterRulesBase);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RouteFilterRulesApi#replaceRouteFilterRuleByUuid");
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
| **routeFilterRuleId** | **String**| Route  Filter  Rules Id | |
| **routeFilterRulesBase** | [**RouteFilterRulesBase**](RouteFilterRulesBase.md)|  | |

### Return type

[**RouteFilterRulesData**](RouteFilterRulesData.md)

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

