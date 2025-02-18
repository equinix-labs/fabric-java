# StreamAlertRulesApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createStreamAlertRules**](StreamAlertRulesApi.md#createStreamAlertRules) | **POST** /fabric/v4/streams/{streamId}/alertRules | Create Stream Alert Rules |
| [**deleteStreamAlertRuleByUuid**](StreamAlertRulesApi.md#deleteStreamAlertRuleByUuid) | **DELETE** /fabric/v4/streams/{streamId}/alertRules/{alertRuleId} | Update Stream Alert Rules |
| [**getStreamAlertRuleByUuid**](StreamAlertRulesApi.md#getStreamAlertRuleByUuid) | **GET** /fabric/v4/streams/{streamId}/alertRules/{alertRuleId} | Get Stream Alert Rules |
| [**getStreamAlertRules**](StreamAlertRulesApi.md#getStreamAlertRules) | **GET** /fabric/v4/streams/{streamId}/alertRules | Get Stream Alert Rules |
| [**updateStreamAlertRuleByUuid**](StreamAlertRulesApi.md#updateStreamAlertRuleByUuid) | **PUT** /fabric/v4/streams/{streamId}/alertRules/{alertRuleId} | Update Stream Alert Rules |


<a name="createStreamAlertRules"></a>
# **createStreamAlertRules**
> StreamAlertRule createStreamAlertRules(streamId, alertRulePostRequest)

Create Stream Alert Rules

This API provides capability to create user&#39;s Stream Alert Rules

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.StreamAlertRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StreamAlertRulesApi apiInstance = new StreamAlertRulesApi(defaultClient);
    UUID streamId = UUID.randomUUID(); // UUID | Stream UUID
    AlertRulePostRequest alertRulePostRequest = new AlertRulePostRequest(); // AlertRulePostRequest | 
    try {
      StreamAlertRule result = apiInstance.createStreamAlertRules(streamId, alertRulePostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamAlertRulesApi#createStreamAlertRules");
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
| **alertRulePostRequest** | [**AlertRulePostRequest**](AlertRulePostRequest.md)|  | |

### Return type

[**StreamAlertRule**](StreamAlertRule.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Stream Alert Rules object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="deleteStreamAlertRuleByUuid"></a>
# **deleteStreamAlertRuleByUuid**
> StreamAlertRule deleteStreamAlertRuleByUuid(streamId, alertRuleId)

Update Stream Alert Rules

This API provides capability to delete a user&#39;s stream alert rule

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.StreamAlertRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StreamAlertRulesApi apiInstance = new StreamAlertRulesApi(defaultClient);
    UUID streamId = UUID.randomUUID(); // UUID | Stream UUID
    UUID alertRuleId = UUID.randomUUID(); // UUID | alert rule UUID
    try {
      StreamAlertRule result = apiInstance.deleteStreamAlertRuleByUuid(streamId, alertRuleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamAlertRulesApi#deleteStreamAlertRuleByUuid");
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
| **alertRuleId** | **UUID**| alert rule UUID | |

### Return type

[**StreamAlertRule**](StreamAlertRule.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Stream Alert Rules object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="getStreamAlertRuleByUuid"></a>
# **getStreamAlertRuleByUuid**
> StreamAlertRule getStreamAlertRuleByUuid(streamId, alertRuleId)

Get Stream Alert Rules

This API provides capability to get user&#39;s stream alert rules

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.StreamAlertRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StreamAlertRulesApi apiInstance = new StreamAlertRulesApi(defaultClient);
    UUID streamId = UUID.randomUUID(); // UUID | Stream UUID
    UUID alertRuleId = UUID.randomUUID(); // UUID | alert rule UUID
    try {
      StreamAlertRule result = apiInstance.getStreamAlertRuleByUuid(streamId, alertRuleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamAlertRulesApi#getStreamAlertRuleByUuid");
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
| **alertRuleId** | **UUID**| alert rule UUID | |

### Return type

[**StreamAlertRule**](StreamAlertRule.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Stream Alert Rules object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="getStreamAlertRules"></a>
# **getStreamAlertRules**
> StreamAlertRule getStreamAlertRules(streamId, offset, limit)

Get Stream Alert Rules

This API provides capability to retrieve stream alert rules

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.StreamAlertRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StreamAlertRulesApi apiInstance = new StreamAlertRulesApi(defaultClient);
    UUID streamId = UUID.randomUUID(); // UUID | Stream UUID
    Integer offset = 1; // Integer | offset
    Integer limit = 10; // Integer | number of records to fetch
    try {
      StreamAlertRule result = apiInstance.getStreamAlertRules(streamId, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamAlertRulesApi#getStreamAlertRules");
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

[**StreamAlertRule**](StreamAlertRule.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Stream Alert Rules object |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="updateStreamAlertRuleByUuid"></a>
# **updateStreamAlertRuleByUuid**
> StreamAlertRule updateStreamAlertRuleByUuid(streamId, alertRuleId, alertRulePutRequest)

Update Stream Alert Rules

This API provides capability to update a user&#39;s stream alert rule

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.StreamAlertRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    StreamAlertRulesApi apiInstance = new StreamAlertRulesApi(defaultClient);
    UUID streamId = UUID.randomUUID(); // UUID | Stream UUID
    UUID alertRuleId = UUID.randomUUID(); // UUID | alert rule UUID
    AlertRulePutRequest alertRulePutRequest = new AlertRulePutRequest(); // AlertRulePutRequest | 
    try {
      StreamAlertRule result = apiInstance.updateStreamAlertRuleByUuid(streamId, alertRuleId, alertRulePutRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamAlertRulesApi#updateStreamAlertRuleByUuid");
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
| **alertRuleId** | **UUID**| alert rule UUID | |
| **alertRulePutRequest** | [**AlertRulePutRequest**](AlertRulePutRequest.md)|  | |

### Return type

[**StreamAlertRule**](StreamAlertRule.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Stream Alert Rules object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

