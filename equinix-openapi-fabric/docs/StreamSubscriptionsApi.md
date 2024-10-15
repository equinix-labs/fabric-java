# StreamSubscriptionsApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createStreamSubscriptions**](StreamSubscriptionsApi.md#createStreamSubscriptions) | **POST** /fabric/v4/streamSubscriptions | Create Subscription |
| [**deleteStreamSubscriptionByUuid**](StreamSubscriptionsApi.md#deleteStreamSubscriptionByUuid) | **DELETE** /fabric/v4/streamSubscriptions/{streamSubscriptionId} | Delete Subscription |
| [**getStreamSubscriptionByUuid**](StreamSubscriptionsApi.md#getStreamSubscriptionByUuid) | **GET** /fabric/v4/streamSubscriptions/{streamSubscriptionId} | Get Subscription |
| [**getStreamSubscriptions**](StreamSubscriptionsApi.md#getStreamSubscriptions) | **GET** /fabric/v4/streamSubscriptions | Get Subscriptions |
| [**updateStreamSubscriptionByUuid**](StreamSubscriptionsApi.md#updateStreamSubscriptionByUuid) | **PUT** /fabric/v4/streamSubscriptions/{streamSubscriptionId} | Update Subscription |


<a name="createStreamSubscriptions"></a>
# **createStreamSubscriptions**
> StreamSubscription createStreamSubscriptions(streamSubscriptionPostRequest)

Create Subscription

This API provides capability to create user&#39;s Stream Subscriptions

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.StreamSubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StreamSubscriptionsApi apiInstance = new StreamSubscriptionsApi(defaultClient);
    StreamSubscriptionPostRequest streamSubscriptionPostRequest = new StreamSubscriptionPostRequest(); // StreamSubscriptionPostRequest | 
    try {
      StreamSubscription result = apiInstance.createStreamSubscriptions(streamSubscriptionPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamSubscriptionsApi#createStreamSubscriptions");
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
| **streamSubscriptionPostRequest** | [**StreamSubscriptionPostRequest**](StreamSubscriptionPostRequest.md)|  | |

### Return type

[**StreamSubscription**](StreamSubscription.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Stream Subscription object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="deleteStreamSubscriptionByUuid"></a>
# **deleteStreamSubscriptionByUuid**
> StreamSubscription deleteStreamSubscriptionByUuid(streamSubscriptionId)

Delete Subscription

This API provides capability to delete user&#39;s Stream Subscriptions

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.StreamSubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StreamSubscriptionsApi apiInstance = new StreamSubscriptionsApi(defaultClient);
    UUID streamSubscriptionId = UUID.randomUUID(); // UUID | Stream Subscription UUID
    try {
      StreamSubscription result = apiInstance.deleteStreamSubscriptionByUuid(streamSubscriptionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamSubscriptionsApi#deleteStreamSubscriptionByUuid");
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
| **streamSubscriptionId** | **UUID**| Stream Subscription UUID | |

### Return type

[**StreamSubscription**](StreamSubscription.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Stream Subscription object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="getStreamSubscriptionByUuid"></a>
# **getStreamSubscriptionByUuid**
> StreamSubscription getStreamSubscriptionByUuid(streamSubscriptionId)

Get Subscription

This API provides capability to delete user&#39;s get Stream Subscriptions

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.StreamSubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StreamSubscriptionsApi apiInstance = new StreamSubscriptionsApi(defaultClient);
    UUID streamSubscriptionId = UUID.randomUUID(); // UUID | Stream Subscription UUID
    try {
      StreamSubscription result = apiInstance.getStreamSubscriptionByUuid(streamSubscriptionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamSubscriptionsApi#getStreamSubscriptionByUuid");
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
| **streamSubscriptionId** | **UUID**| Stream Subscription UUID | |

### Return type

[**StreamSubscription**](StreamSubscription.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Stream Subscription object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="getStreamSubscriptions"></a>
# **getStreamSubscriptions**
> GetAllStreamSubscriptionResponse getStreamSubscriptions(offset, limit)

Get Subscriptions

This API provides capability to retrieve stream subscriptions

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.StreamSubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StreamSubscriptionsApi apiInstance = new StreamSubscriptionsApi(defaultClient);
    Integer offset = 1; // Integer | offset
    Integer limit = 10; // Integer | number of records to fetch
    try {
      GetAllStreamSubscriptionResponse result = apiInstance.getStreamSubscriptions(offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamSubscriptionsApi#getStreamSubscriptions");
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
| **offset** | **Integer**| offset | [optional] |
| **limit** | **Integer**| number of records to fetch | [optional] |

### Return type

[**GetAllStreamSubscriptionResponse**](GetAllStreamSubscriptionResponse.md)

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

<a name="updateStreamSubscriptionByUuid"></a>
# **updateStreamSubscriptionByUuid**
> StreamSubscription updateStreamSubscriptionByUuid(streamSubscriptionId, streamSubscriptionPutRequest)

Update Subscription

This API provides capability to update user&#39;s Stream Subscriptions

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.StreamSubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StreamSubscriptionsApi apiInstance = new StreamSubscriptionsApi(defaultClient);
    UUID streamSubscriptionId = UUID.randomUUID(); // UUID | Stream Subscription UUID
    StreamSubscriptionPutRequest streamSubscriptionPutRequest = new StreamSubscriptionPutRequest(); // StreamSubscriptionPutRequest | 
    try {
      StreamSubscription result = apiInstance.updateStreamSubscriptionByUuid(streamSubscriptionId, streamSubscriptionPutRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamSubscriptionsApi#updateStreamSubscriptionByUuid");
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
| **streamSubscriptionId** | **UUID**| Stream Subscription UUID | |
| **streamSubscriptionPutRequest** | [**StreamSubscriptionPutRequest**](StreamSubscriptionPutRequest.md)|  | |

### Return type

[**StreamSubscription**](StreamSubscription.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Stream Subscription object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

