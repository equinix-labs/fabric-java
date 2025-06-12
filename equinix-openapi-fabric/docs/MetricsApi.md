# MetricsApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMetricByAssetId**](MetricsApi.md#getMetricByAssetId) | **GET** /fabric/v4/{asset}/{assetId}/metrics | Get Metrics by Asset Id |


<a name="getMetricByAssetId"></a>
# **getMetricByAssetId**
> GetMetricsByAssetResponse getMetricByAssetId(asset, assetId, fromDateTime, toDateTime, offset, limit)

Get Metrics by Asset Id

This API provides capability to retrieve Metrics of an asset id

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.MetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    MetricsApi apiInstance = new MetricsApi(defaultClient);
    MetricAssetType asset = MetricAssetType.fromValue("ports"); // MetricAssetType | asset
    UUID assetId = UUID.randomUUID(); // UUID | asset UUID
    OffsetDateTime fromDateTime = OffsetDateTime.now(); // OffsetDateTime | Start date and time
    OffsetDateTime toDateTime = OffsetDateTime.now(); // OffsetDateTime | End date and time
    Integer offset = 0; // Integer | offset
    Integer limit = 20; // Integer | limit
    try {
      GetMetricsByAssetResponse result = apiInstance.getMetricByAssetId(asset, assetId, fromDateTime, toDateTime, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#getMetricByAssetId");
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
| **asset** | [**MetricAssetType**](.md)| asset | [enum: ports, connections, routers] |
| **assetId** | **UUID**| asset UUID | |
| **fromDateTime** | **OffsetDateTime**| Start date and time | [optional] |
| **toDateTime** | **OffsetDateTime**| End date and time | [optional] |
| **offset** | **Integer**| offset | [optional] [default to 0] |
| **limit** | **Integer**| limit | [optional] [default to 20] |

### Return type

[**GetMetricsByAssetResponse**](GetMetricsByAssetResponse.md)

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
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

