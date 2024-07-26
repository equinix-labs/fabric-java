# StatisticsApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getConnectionStatsByPortUuid**](StatisticsApi.md#getConnectionStatsByPortUuid) | **GET** /fabric/v4/connections/{connectionId}/stats | Get Stats by uuid |
| [**getPortStats**](StatisticsApi.md#getPortStats) | **GET** /fabric/v4/ports/stats | Top Port Statistics |
| [**getPortStatsByPortUuid**](StatisticsApi.md#getPortStatsByPortUuid) | **GET** /fabric/v4/ports/{portId}/stats | Get Stats by uuid |


<a name="getConnectionStatsByPortUuid"></a>
# **getConnectionStatsByPortUuid**
> Statistics getConnectionStatsByPortUuid(connectionId, startDateTime, endDateTime, viewPoint)

Get Stats by uuid

This API provides service-level metrics so that you can view access and gather key information required to manage service subscription sizing and capacity

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

StatisticsApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).statistics();

api.getConnectionStatsByPortUuid()
    .connectionIdPath(connectionId)
    .startDateTimeQuery(startDateTime)
    .endDateTimeQuery(endDateTime)
    .viewPointQuery(viewPoint).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **connectionId** | **String**| Connection UUID | |
| **startDateTime** | **OffsetDateTime**| startDateTime | |
| **endDateTime** | **OffsetDateTime**| endDateTime | |
| **viewPoint** | [**ViewPoint**](.md)| viewPoint | [enum: aSide, zSide] |

### Return type

[**Statistics**](Statistics.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPortStats"></a>
# **getPortStats**
> TopUtilizedStatistics getPortStats(metros, sort, top, duration, direction, metricInterval, projectId)

Top Port Statistics

This API provides top utilized service-level traffic metrics so that you can view access and gather key information required to manage service subscription sizing and capacity.

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

StatisticsApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).statistics();

api.getPortStats()
    .metrosQuery(metros).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **metros** | [**List&lt;String&gt;**](String.md)| Two-letter prefix indicating the metropolitan area in which a specified Equinix asset is located. | |
| **sort** | [**Sort**](.md)| Key or set of keys that organizes the search payload by property (such as createdDate or metroCode) or by direction. Ascending (ASC) is the default value. The \&quot;?\&quot; prefix indicates descending (DESC) order. | [optional] [default to -bandwidthUtilization] [enum: -bandwidthUtilization] |
| **top** | **Integer**| Filter returning only the specified number of most heavily trafficked ports. The standard value is [1...10], and the default is 5. | [optional] [default to 5] |
| **duration** | [**Duration**](.md)| duration | [optional] [default to P7D] [enum: P7D, P1M, P3M] |
| **direction** | [**QueryDirection**](.md)| Direction of traffic from the requester&#39;s viewpoint. The default is outbound. | [optional] [default to outbound] [enum: inbound, outbound] |
| **metricInterval** | [**MetricInterval**](.md)| metricInterval | [optional] [default to P7D] [enum: P7D] |
| **projectId** | **String**| projectId | [optional] |

### Return type

[**TopUtilizedStatistics**](TopUtilizedStatistics.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPortStatsByPortUuid"></a>
# **getPortStatsByPortUuid**
> Statistics getPortStatsByPortUuid(portId, startDateTime, endDateTime)

Get Stats by uuid

This API provides service-level traffic metrics so that you can view access and gather key information required to manage service subscription sizing and capacity.

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

StatisticsApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).statistics();

api.getPortStatsByPortUuid()
    .portIdPath(portId)
    .startDateTimeQuery(startDateTime)
    .endDateTimeQuery(endDateTime).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **portId** | **UUID**| Port UUID | |
| **startDateTime** | **OffsetDateTime**| startDateTime | |
| **endDateTime** | **OffsetDateTime**| endDateTime | |

### Return type

[**Statistics**](Statistics.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

