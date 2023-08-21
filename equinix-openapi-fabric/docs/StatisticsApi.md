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
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.StatisticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    String connectionId = "connectionId_example"; // String | Connection UUID
    OffsetDateTime startDateTime = OffsetDateTime.parse("2020-11-06T07:00:00Z"); // OffsetDateTime | startDateTime
    OffsetDateTime endDateTime = OffsetDateTime.parse("2020-11-10T07:00:00Z"); // OffsetDateTime | endDateTime
    ViewPoint viewPoint = ViewPoint.fromValue("aSide"); // ViewPoint | viewPoint
    try {
      Statistics result = apiInstance.getConnectionStatsByPortUuid(connectionId, startDateTime, endDateTime, viewPoint);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#getConnectionStatsByPortUuid");
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="getPortStats"></a>
# **getPortStats**
> TopUtilizedStatistics getPortStats(metros, sort, top, duration, direction, metricInterval, projectId)

Top Port Statistics

This API provides top utilized service-level traffic metrics so that you can view access and gather key information required to manage service subscription sizing and capacity.

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.StatisticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    List<String> metros = Arrays.asList(); // List<String> | Two-letter prefix indicating the metropolitan area in which a specified Equinix asset is located.
    Sort sort = Sort.fromValue("-bandwidthUtilization"); // Sort | Key or set of keys that organizes the search payload by property (such as createdDate or metroCode) or by direction. Ascending (ASC) is the default value. The \"?\" prefix indicates descending (DESC) order.
    Integer top = 5; // Integer | Filter returning only the specified number of most heavily trafficked ports. The standard value is [1...10], and the default is 5.
    Duration duration = Duration.fromValue("P7D"); // Duration | duration
    QueryDirection direction = QueryDirection.fromValue("inbound"); // QueryDirection | Direction of traffic from the requester's viewpoint. The default is outbound.
    MetricInterval metricInterval = MetricInterval.fromValue("P7D"); // MetricInterval | metricInterval
    String projectId = "projectId_example"; // String | projectId
    try {
      TopUtilizedStatistics result = apiInstance.getPortStats(metros, sort, top, duration, direction, metricInterval, projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#getPortStats");
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="getPortStatsByPortUuid"></a>
# **getPortStatsByPortUuid**
> Statistics getPortStatsByPortUuid(portId, startDateTime, endDateTime)

Get Stats by uuid

This API provides service-level traffic metrics so that you can view access and gather key information required to manage service subscription sizing and capacity.

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.StatisticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StatisticsApi apiInstance = new StatisticsApi(defaultClient);
    UUID portId = UUID.randomUUID(); // UUID | Port UUID
    OffsetDateTime startDateTime = OffsetDateTime.parse("2020-11-06T07:00:00Z"); // OffsetDateTime | startDateTime
    OffsetDateTime endDateTime = OffsetDateTime.parse("2020-11-10T07:00:00Z"); // OffsetDateTime | endDateTime
    try {
      Statistics result = apiInstance.getPortStatsByPortUuid(portId, startDateTime, endDateTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#getPortStatsByPortUuid");
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

