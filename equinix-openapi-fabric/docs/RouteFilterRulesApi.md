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
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RouteFilterRulesApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routeFilterRules();

api.createRouteFilterRule()
    .routeFilterIdPath(routeFilterId)
    .body(routeFilterRulesBase).execute(r -> r.prettyPeek());
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

<a name="createRouteFilterRulesInBulk"></a>
# **createRouteFilterRulesInBulk**
> GetRouteFilterRulesResponse createRouteFilterRulesInBulk(routeFilterId, routeFilterRulesPostRequest)

Bulk RFRules

This API provides capability to create bulk route filter rules

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RouteFilterRulesApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routeFilterRules();

api.createRouteFilterRulesInBulk()
    .routeFilterIdPath(routeFilterId)
    .body(routeFilterRulesPostRequest).execute(r -> r.prettyPeek());
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

<a name="deleteRouteFilterRuleByUuid"></a>
# **deleteRouteFilterRuleByUuid**
> RouteFilterRulesData deleteRouteFilterRuleByUuid(routeFilterId, routeFilterRuleId)

DeleteRFRule

This API provides capability to delete a Route Filter Rule

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RouteFilterRulesApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routeFilterRules();

api.deleteRouteFilterRuleByUuid()
    .routeFilterIdPath(routeFilterId)
    .routeFilterRuleIdPath(routeFilterRuleId).execute(r -> r.prettyPeek());
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

<a name="getRouteFilterRuleByUuid"></a>
# **getRouteFilterRuleByUuid**
> RouteFilterRulesData getRouteFilterRuleByUuid(routeFilterId, routeFilterRuleId)

GetRFRule By UUID

This API provides capability to view a Route Filter Rule by UUID

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RouteFilterRulesApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routeFilterRules();

api.getRouteFilterRuleByUuid()
    .routeFilterIdPath(routeFilterId)
    .routeFilterRuleIdPath(routeFilterRuleId).execute(r -> r.prettyPeek());
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

<a name="getRouteFilterRuleChangeByUuid"></a>
# **getRouteFilterRuleChangeByUuid**
> RouteFilterRulesChangeData getRouteFilterRuleChangeByUuid(routeFilterId, routeFilterRuleId, changeId)

Get Change By ID

This API provides capability to retrieve a specific Route Filter Rule&#39;s Changes

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RouteFilterRulesApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routeFilterRules();

api.getRouteFilterRuleChangeByUuid()
    .routeFilterIdPath(routeFilterId)
    .routeFilterRuleIdPath(routeFilterRuleId)
    .changeIdPath(changeId).execute(r -> r.prettyPeek());
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

<a name="getRouteFilterRuleChanges"></a>
# **getRouteFilterRuleChanges**
> RouteFilterRulesChangeDataResponse getRouteFilterRuleChanges(routeFilterId, routeFilterRuleId, offset, limit)

Get All Changes

This API provides capability to retrieve all of a Route Filter Rule&#39;s Changes

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RouteFilterRulesApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routeFilterRules();

api.getRouteFilterRuleChanges()
    .routeFilterIdPath(routeFilterId)
    .routeFilterRuleIdPath(routeFilterRuleId).execute(r -> r.prettyPeek());
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

<a name="getRouteFilterRules"></a>
# **getRouteFilterRules**
> GetRouteFilterRulesResponse getRouteFilterRules(routeFilterId, offset, limit)

GetRFRules

This API provides capability to get all Route Filters Rules for Fabric

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RouteFilterRulesApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routeFilterRules();

api.getRouteFilterRules()
    .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
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

<a name="patchRouteFilterRuleByUuid"></a>
# **patchRouteFilterRuleByUuid**
> RouteFilterRulesData patchRouteFilterRuleByUuid(routeFilterId, routeFilterRuleId, routeFilterRulesPatchRequestItem)

PatchRFilterRule

This API provides capability to partially update a Route Filter Rule

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RouteFilterRulesApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routeFilterRules();

api.patchRouteFilterRuleByUuid()
    .routeFilterIdPath(routeFilterId)
    .routeFilterRuleIdPath(routeFilterRuleId)
    .body(routeFilterRulesPatchRequestItem).execute(r -> r.prettyPeek());
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

<a name="replaceRouteFilterRuleByUuid"></a>
# **replaceRouteFilterRuleByUuid**
> RouteFilterRulesData replaceRouteFilterRuleByUuid(routeFilterId, routeFilterRuleId, routeFilterRulesBase)

ReplaceRFRule

This API provides capability to replace a Route Filter Rule completely

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RouteFilterRulesApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routeFilterRules();

api.replaceRouteFilterRuleByUuid()
    .routeFilterIdPath(routeFilterId)
    .routeFilterRuleIdPath(routeFilterRuleId)
    .body(routeFilterRulesBase).execute(r -> r.prettyPeek());
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

