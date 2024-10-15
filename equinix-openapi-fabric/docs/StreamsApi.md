# StreamsApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createStreams**](StreamsApi.md#createStreams) | **POST** /fabric/v4/streams | Create Stream |
| [**deleteStreamAssetByUuid**](StreamsApi.md#deleteStreamAssetByUuid) | **DELETE** /fabric/v4/streams/{streamId}/{asset}/{assetId} | Detach Asset |
| [**deleteStreamByUuid**](StreamsApi.md#deleteStreamByUuid) | **DELETE** /fabric/v4/streams/{streamId} | Delete Stream |
| [**getStreamAssetByUuid**](StreamsApi.md#getStreamAssetByUuid) | **GET** /fabric/v4/streams/{streamId}/{asset}/{assetId} | Get Asset |
| [**getStreamByUuid**](StreamsApi.md#getStreamByUuid) | **GET** /fabric/v4/streams/{streamId} | Get Stream |
| [**getStreams**](StreamsApi.md#getStreams) | **GET** /fabric/v4/streams | Get Streams |
| [**getStreamsAssets**](StreamsApi.md#getStreamsAssets) | **POST** /fabric/v4/streamAssets/search | Get Assets |
| [**getSubscriptionsInStream**](StreamsApi.md#getSubscriptionsInStream) | **GET** /fabric/v4/streams/{streamId}/streamSubscriptions | Get Stream&#39;s Subs |
| [**updateStreamAssetByUuid**](StreamsApi.md#updateStreamAssetByUuid) | **PUT** /fabric/v4/streams/{streamId}/{asset}/{assetId} | Attach Asset |
| [**updateStreamByUuid**](StreamsApi.md#updateStreamByUuid) | **PUT** /fabric/v4/streams/{streamId} | Update Stream |


<a name="createStreams"></a>
# **createStreams**
> Stream createStreams(streamPostRequest)

Create Stream

This API provides capability to create user&#39;s stream

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.StreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StreamsApi apiInstance = new StreamsApi(defaultClient);
    StreamPostRequest streamPostRequest = new StreamPostRequest(); // StreamPostRequest | 
    try {
      Stream result = apiInstance.createStreams(streamPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamsApi#createStreams");
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
| **streamPostRequest** | [**StreamPostRequest**](StreamPostRequest.md)|  | |

### Return type

[**Stream**](Stream.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Stream object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="deleteStreamAssetByUuid"></a>
# **deleteStreamAssetByUuid**
> StreamAsset deleteStreamAssetByUuid(assetId, asset, streamId)

Detach Asset

This API provides capability to detach an asset from a stream

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.StreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StreamsApi apiInstance = new StreamsApi(defaultClient);
    UUID assetId = UUID.randomUUID(); // UUID | asset UUID
    Asset asset = Asset.fromValue("ports"); // Asset | asset
    UUID streamId = UUID.randomUUID(); // UUID | Stream UUID
    try {
      StreamAsset result = apiInstance.deleteStreamAssetByUuid(assetId, asset, streamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamsApi#deleteStreamAssetByUuid");
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
| **assetId** | **UUID**| asset UUID | |
| **asset** | [**Asset**](.md)| asset | [enum: ports, connections, routers, metros] |
| **streamId** | **UUID**| Stream UUID | |

### Return type

[**StreamAsset**](StreamAsset.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Stream object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="deleteStreamByUuid"></a>
# **deleteStreamByUuid**
> Stream deleteStreamByUuid(streamId)

Delete Stream

This API provides capability to delete user&#39;s stream

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.StreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StreamsApi apiInstance = new StreamsApi(defaultClient);
    UUID streamId = UUID.randomUUID(); // UUID | Stream UUID
    try {
      Stream result = apiInstance.deleteStreamByUuid(streamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamsApi#deleteStreamByUuid");
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
| **streamId** | **UUID**| Stream UUID | |

### Return type

[**Stream**](Stream.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Stream object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="getStreamAssetByUuid"></a>
# **getStreamAssetByUuid**
> StreamAsset getStreamAssetByUuid(assetId, asset, streamId)

Get Asset

This API provides capability to get user&#39;s assets attached to a stream

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.StreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StreamsApi apiInstance = new StreamsApi(defaultClient);
    UUID assetId = UUID.randomUUID(); // UUID | asset UUID
    Asset asset = Asset.fromValue("ports"); // Asset | asset
    UUID streamId = UUID.randomUUID(); // UUID | Stream UUID
    try {
      StreamAsset result = apiInstance.getStreamAssetByUuid(assetId, asset, streamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamsApi#getStreamAssetByUuid");
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
| **assetId** | **UUID**| asset UUID | |
| **asset** | [**Asset**](.md)| asset | [enum: ports, connections, routers, metros] |
| **streamId** | **UUID**| Stream UUID | |

### Return type

[**StreamAsset**](StreamAsset.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Stream asset object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="getStreamByUuid"></a>
# **getStreamByUuid**
> Stream getStreamByUuid(streamId)

Get Stream

This API provides capability to get user&#39;s stream

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.StreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StreamsApi apiInstance = new StreamsApi(defaultClient);
    UUID streamId = UUID.randomUUID(); // UUID | Stream UUID
    try {
      Stream result = apiInstance.getStreamByUuid(streamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamsApi#getStreamByUuid");
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
| **streamId** | **UUID**| Stream UUID | |

### Return type

[**Stream**](Stream.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Stream object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="getStreams"></a>
# **getStreams**
> GetAllStreamResponse getStreams(offset, limit)

Get Streams

This API provides capability to retrieve streams

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.StreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StreamsApi apiInstance = new StreamsApi(defaultClient);
    Integer offset = 1; // Integer | offset
    Integer limit = 10; // Integer | number of records to fetch
    try {
      GetAllStreamResponse result = apiInstance.getStreams(offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamsApi#getStreams");
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

[**GetAllStreamResponse**](GetAllStreamResponse.md)

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

<a name="getStreamsAssets"></a>
# **getStreamsAssets**
> GetAllStreamAssetResponse getStreamsAssets(streamAssetSearchRequest, offset, limit)

Get Assets

This API provides capability to retrieve stream assets

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.StreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StreamsApi apiInstance = new StreamsApi(defaultClient);
    StreamAssetSearchRequest streamAssetSearchRequest = new StreamAssetSearchRequest(); // StreamAssetSearchRequest | 
    Integer offset = 1; // Integer | offset
    Integer limit = 10; // Integer | number of records to fetch
    try {
      GetAllStreamAssetResponse result = apiInstance.getStreamsAssets(streamAssetSearchRequest, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamsApi#getStreamsAssets");
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
| **streamAssetSearchRequest** | [**StreamAssetSearchRequest**](StreamAssetSearchRequest.md)|  | |
| **offset** | **Integer**| offset | [optional] |
| **limit** | **Integer**| number of records to fetch | [optional] |

### Return type

[**GetAllStreamAssetResponse**](GetAllStreamAssetResponse.md)

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

<a name="getSubscriptionsInStream"></a>
# **getSubscriptionsInStream**
> GetSubscriptionsInStreamResponse getSubscriptionsInStream(streamId, offset, limit)

Get Stream&#39;s Subs

This API provides capability to retrieve subscriptions in a stream

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.StreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StreamsApi apiInstance = new StreamsApi(defaultClient);
    UUID streamId = UUID.randomUUID(); // UUID | Stream UUID
    Integer offset = 1; // Integer | offset
    Integer limit = 10; // Integer | number of records to fetch
    try {
      GetSubscriptionsInStreamResponse result = apiInstance.getSubscriptionsInStream(streamId, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamsApi#getSubscriptionsInStream");
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
| **streamId** | **UUID**| Stream UUID | |
| **offset** | **Integer**| offset | [optional] |
| **limit** | **Integer**| number of records to fetch | [optional] |

### Return type

[**GetSubscriptionsInStreamResponse**](GetSubscriptionsInStreamResponse.md)

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

<a name="updateStreamAssetByUuid"></a>
# **updateStreamAssetByUuid**
> StreamAsset updateStreamAssetByUuid(assetId, asset, streamId, streamAssetPutRequest)

Attach Asset

This API provides capability to attach an asset to a stream

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.StreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StreamsApi apiInstance = new StreamsApi(defaultClient);
    UUID assetId = UUID.randomUUID(); // UUID | asset UUID
    Asset asset = Asset.fromValue("ports"); // Asset | asset
    UUID streamId = UUID.randomUUID(); // UUID | Stream UUID
    StreamAssetPutRequest streamAssetPutRequest = new StreamAssetPutRequest(); // StreamAssetPutRequest | 
    try {
      StreamAsset result = apiInstance.updateStreamAssetByUuid(assetId, asset, streamId, streamAssetPutRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamsApi#updateStreamAssetByUuid");
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
| **assetId** | **UUID**| asset UUID | |
| **asset** | [**Asset**](.md)| asset | [enum: ports, connections, routers, metros] |
| **streamId** | **UUID**| Stream UUID | |
| **streamAssetPutRequest** | [**StreamAssetPutRequest**](StreamAssetPutRequest.md)|  | |

### Return type

[**StreamAsset**](StreamAsset.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Stream object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="updateStreamByUuid"></a>
# **updateStreamByUuid**
> Stream updateStreamByUuid(streamId, streamPutRequest)

Update Stream

This API provides capability to update user&#39;s stream

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.StreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StreamsApi apiInstance = new StreamsApi(defaultClient);
    UUID streamId = UUID.randomUUID(); // UUID | Stream UUID
    StreamPutRequest streamPutRequest = new StreamPutRequest(); // StreamPutRequest | 
    try {
      Stream result = apiInstance.updateStreamByUuid(streamId, streamPutRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamsApi#updateStreamByUuid");
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
| **streamId** | **UUID**| Stream UUID | |
| **streamPutRequest** | [**StreamPutRequest**](StreamPutRequest.md)|  | |

### Return type

[**Stream**](Stream.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Stream object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

