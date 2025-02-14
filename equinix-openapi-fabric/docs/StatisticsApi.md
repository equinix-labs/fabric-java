# StatisticsApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getConnectionStatsByPortUuid**](StatisticsApi.md#getConnectionStatsByPortUuid) | **GET** /fabric/v4/connections/{connectionId}/stats | Get Stats by uuid |
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

