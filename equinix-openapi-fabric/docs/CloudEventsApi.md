# CloudEventsApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCloudEvent**](CloudEventsApi.md#getCloudEvent) | **GET** /fabric/v4/cloudevents/{cloudEventId} | Get Cloud Event |
| [**getCloudEventByAssetId**](CloudEventsApi.md#getCloudEventByAssetId) | **GET** /fabric/v4/{asset}/{assetId}/cloudevents | Get Cloud Events by Asset Id |
| [**searchCloudEvents**](CloudEventsApi.md#searchCloudEvents) | **POST** /fabric/v4/cloudevents/search | Search Cloud Events |


<a name="getCloudEvent"></a>
# **getCloudEvent**
> CloudEvent getCloudEvent(cloudEventId)

Get Cloud Event

This API provides capability to retrieve a cloud event by uuid

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.CloudEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudEventsApi apiInstance = new CloudEventsApi(defaultClient);
    UUID cloudEventId = UUID.randomUUID(); // UUID | Cloud Event UUID
    try {
      CloudEvent result = apiInstance.getCloudEvent(cloudEventId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudEventsApi#getCloudEvent");
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
| **cloudEventId** | **UUID**| Cloud Event UUID | |

### Return type

[**CloudEvent**](CloudEvent.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cloud Event object |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="getCloudEventByAssetId"></a>
# **getCloudEventByAssetId**
> GetCloudEventsByAssetResponse getCloudEventByAssetId(asset, assetId, fromDateTime, toDateTime, offset, limit)

Get Cloud Events by Asset Id

This API provides capability to retrieve cloud events of an asset id

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.CloudEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudEventsApi apiInstance = new CloudEventsApi(defaultClient);
    CloudEventAssetType asset = CloudEventAssetType.fromValue("ports"); // CloudEventAssetType | asset
    UUID assetId = UUID.randomUUID(); // UUID | asset UUID
    OffsetDateTime fromDateTime = OffsetDateTime.now(); // OffsetDateTime | Start date and time
    OffsetDateTime toDateTime = OffsetDateTime.now(); // OffsetDateTime | End date and time
    Integer offset = 0; // Integer | offset
    Integer limit = 20; // Integer | limit
    try {
      GetCloudEventsByAssetResponse result = apiInstance.getCloudEventByAssetId(asset, assetId, fromDateTime, toDateTime, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudEventsApi#getCloudEventByAssetId");
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
| **asset** | [**CloudEventAssetType**](.md)| asset | [enum: ports, connections, routers] |
| **assetId** | **UUID**| asset UUID | |
| **fromDateTime** | **OffsetDateTime**| Start date and time | [optional] |
| **toDateTime** | **OffsetDateTime**| End date and time | [optional] |
| **offset** | **Integer**| offset | [optional] [default to 0] |
| **limit** | **Integer**| limit | [optional] [default to 20] |

### Return type

[**GetCloudEventsByAssetResponse**](GetCloudEventsByAssetResponse.md)

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

<a name="searchCloudEvents"></a>
# **searchCloudEvents**
> GetCloudEventsByAssetResponse searchCloudEvents(cloudEventSearchRequest)

Search Cloud Events

This API provides capability to search cloud events from a filtered query

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.CloudEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudEventsApi apiInstance = new CloudEventsApi(defaultClient);
    CloudEventSearchRequest cloudEventSearchRequest = new CloudEventSearchRequest(); // CloudEventSearchRequest | 
    try {
      GetCloudEventsByAssetResponse result = apiInstance.searchCloudEvents(cloudEventSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudEventsApi#searchCloudEvents");
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
| **cloudEventSearchRequest** | [**CloudEventSearchRequest**](CloudEventSearchRequest.md)|  | |

### Return type

[**GetCloudEventsByAssetResponse**](GetCloudEventsByAssetResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

