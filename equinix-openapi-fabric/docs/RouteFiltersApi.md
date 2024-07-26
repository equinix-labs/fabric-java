# RouteFiltersApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**attachConnectionRouteFilter**](RouteFiltersApi.md#attachConnectionRouteFilter) | **PUT** /fabric/v4/connections/{connectionId}/routeFilters/{routeFilterId} | Attach Route Filter |
| [**createRouteFilter**](RouteFiltersApi.md#createRouteFilter) | **POST** /fabric/v4/routeFilters | Create Route Filters |
| [**deleteRouteFilterByUuid**](RouteFiltersApi.md#deleteRouteFilterByUuid) | **DELETE** /fabric/v4/routeFilters/{routeFilterId} | Delete Route Filter |
| [**detachConnectionRouteFilter**](RouteFiltersApi.md#detachConnectionRouteFilter) | **DELETE** /fabric/v4/connections/{connectionId}/routeFilters/{routeFilterId} | Detach Route Filter |
| [**getConnectionRouteFilterByUuid**](RouteFiltersApi.md#getConnectionRouteFilterByUuid) | **GET** /fabric/v4/connections/{connectionId}/routeFilters/{routeFilterId} | Get Route Filter |
| [**getConnectionRouteFilters**](RouteFiltersApi.md#getConnectionRouteFilters) | **GET** /fabric/v4/connections/{connectionId}/routeFilters | Get All RouteFilters |
| [**getRouteFilterByUuid**](RouteFiltersApi.md#getRouteFilterByUuid) | **GET** /fabric/v4/routeFilters/{routeFilterId} | Get Filter By UUID |
| [**getRouteFilterChangeByUuid**](RouteFiltersApi.md#getRouteFilterChangeByUuid) | **GET** /fabric/v4/routeFilters/{routeFilterId}/changes/{changeId} | Get Change By ID |
| [**getRouteFilterChanges**](RouteFiltersApi.md#getRouteFilterChanges) | **GET** /fabric/v4/routeFilters/{routeFilterId}/changes | Get All Changes |
| [**getRouteFilterConnections**](RouteFiltersApi.md#getRouteFilterConnections) | **GET** /fabric/v4/routeFilters/{routeFilterId}/connections | Get Connections |
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
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RouteFiltersApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routeFilters();

api.attachConnectionRouteFilter()
    .routeFilterIdPath(routeFilterId)
    .connectionIdPath(connectionId)
    .body(connectionRouteFiltersBase).execute(r -> r.prettyPeek());
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

<a name="createRouteFilter"></a>
# **createRouteFilter**
> RouteFiltersData createRouteFilter(routeFiltersBase)

Create Route Filters

This API provides capability to create a Route Filter

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RouteFiltersApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routeFilters();

api.createRouteFilter()
    .body(routeFiltersBase).execute(r -> r.prettyPeek());
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

<a name="deleteRouteFilterByUuid"></a>
# **deleteRouteFilterByUuid**
> RouteFiltersData deleteRouteFilterByUuid(routeFilterId)

Delete Route Filter

This API provides capability to delete a Route Filter

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RouteFiltersApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routeFilters();

api.deleteRouteFilterByUuid()
    .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
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

<a name="detachConnectionRouteFilter"></a>
# **detachConnectionRouteFilter**
> ConnectionRouteFilterData detachConnectionRouteFilter(routeFilterId, connectionId)

Detach Route Filter

This API provides capability to detach a Route Filter from a Connection

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RouteFiltersApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routeFilters();

api.detachConnectionRouteFilter()
    .routeFilterIdPath(routeFilterId)
    .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
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

<a name="getConnectionRouteFilterByUuid"></a>
# **getConnectionRouteFilterByUuid**
> ConnectionRouteFilterData getConnectionRouteFilterByUuid(routeFilterId, connectionId)

Get Route Filter

This API provides capability to view a specific Route Filter attached to a Connection

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RouteFiltersApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routeFilters();

api.getConnectionRouteFilterByUuid()
    .routeFilterIdPath(routeFilterId)
    .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
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

<a name="getConnectionRouteFilters"></a>
# **getConnectionRouteFilters**
> GetAllConnectionRouteFiltersResponse getConnectionRouteFilters(connectionId)

Get All RouteFilters

This API provides capability to view all Route Filters attached to a Connection

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RouteFiltersApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routeFilters();

api.getConnectionRouteFilters()
    .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
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

<a name="getRouteFilterByUuid"></a>
# **getRouteFilterByUuid**
> RouteFiltersData getRouteFilterByUuid(routeFilterId)

Get Filter By UUID

This API provides capability to view a Route Filter by UUID

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RouteFiltersApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routeFilters();

api.getRouteFilterByUuid()
    .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
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

<a name="getRouteFilterChangeByUuid"></a>
# **getRouteFilterChangeByUuid**
> RouteFilterChangeData getRouteFilterChangeByUuid(routeFilterId, changeId)

Get Change By ID

This API provides capability to retrieve a specific Route Filter&#39;s Changes

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RouteFiltersApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routeFilters();

api.getRouteFilterChangeByUuid()
    .routeFilterIdPath(routeFilterId)
    .changeIdPath(changeId).execute(r -> r.prettyPeek());
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

<a name="getRouteFilterChanges"></a>
# **getRouteFilterChanges**
> RouteFilterChangeDataResponse getRouteFilterChanges(routeFilterId, offset, limit)

Get All Changes

This API provides capability to retrieve all of a Route Filter&#39;s Changes

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RouteFiltersApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routeFilters();

api.getRouteFilterChanges()
    .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
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

<a name="getRouteFilterConnections"></a>
# **getRouteFilterConnections**
> GetRouteFilterGetConnectionsResponse getRouteFilterConnections(routeFilterId)

Get Connections

This API provides capability to view all Connections using the Route Filter

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RouteFiltersApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routeFilters();

api.getRouteFilterConnections()
    .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
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

<a name="patchRouteFilterByUuid"></a>
# **patchRouteFilterByUuid**
> RouteFiltersData patchRouteFilterByUuid(routeFilterId, routeFiltersPatchRequestItem)

Patch Route Filter

This API provides capability to partially update a Route Filter

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RouteFiltersApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routeFilters();

api.patchRouteFilterByUuid()
    .routeFilterIdPath(routeFilterId)
    .body(routeFiltersPatchRequestItem).execute(r -> r.prettyPeek());
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

<a name="searchRouteFilters"></a>
# **searchRouteFilters**
> RouteFiltersSearchResponse searchRouteFilters(routeFiltersSearchBase)

Search Route Filters

This API provides capability to search Route Filters

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RouteFiltersApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routeFilters();

api.searchRouteFilters()
    .body(routeFiltersSearchBase).execute(r -> r.prettyPeek());
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

