# ServiceProfilesApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createServiceProfile**](ServiceProfilesApi.md#createServiceProfile) | **POST** /fabric/v4/serviceProfiles | Create Profile |
| [**deleteServiceProfileByUuid**](ServiceProfilesApi.md#deleteServiceProfileByUuid) | **DELETE** /fabric/v4/serviceProfiles/{serviceProfileId} | Delete Profile |
| [**getServiceProfileByUuid**](ServiceProfilesApi.md#getServiceProfileByUuid) | **GET** /fabric/v4/serviceProfiles/{serviceProfileId} | Get Profile |
| [**getServiceProfiles**](ServiceProfilesApi.md#getServiceProfiles) | **GET** /fabric/v4/serviceProfiles | Get all Profiles |
| [**putServiceProfileByUuid**](ServiceProfilesApi.md#putServiceProfileByUuid) | **PUT** /fabric/v4/serviceProfiles/{serviceProfileId} | Replace Profile |
| [**searchServiceProfiles**](ServiceProfilesApi.md#searchServiceProfiles) | **POST** /fabric/v4/serviceProfiles/search | Profile Search |
| [**updateServiceProfileByUuid**](ServiceProfilesApi.md#updateServiceProfileByUuid) | **PATCH** /fabric/v4/serviceProfiles/{serviceProfileId} | Update Profile |


<a name="createServiceProfile"></a>
# **createServiceProfile**
> ServiceProfile createServiceProfile(serviceProfileRequest)

Create Profile

Create Service Profile creates Equinix Fabric? Service Profile.

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.ServiceProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ServiceProfilesApi apiInstance = new ServiceProfilesApi(defaultClient);
    ServiceProfileRequest serviceProfileRequest = new ServiceProfileRequest(); // ServiceProfileRequest | 
    try {
      ServiceProfile result = apiInstance.createServiceProfile(serviceProfileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceProfilesApi#createServiceProfile");
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
| **serviceProfileRequest** | [**ServiceProfileRequest**](ServiceProfileRequest.md)|  | |

### Return type

[**ServiceProfile**](ServiceProfile.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=UTF-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Create operation |  * ETag -  <br>  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

<a name="deleteServiceProfileByUuid"></a>
# **deleteServiceProfileByUuid**
> ServiceProfile deleteServiceProfileByUuid(serviceProfileId)

Delete Profile

delete Service Profile by UUID

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.ServiceProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ServiceProfilesApi apiInstance = new ServiceProfilesApi(defaultClient);
    UUID serviceProfileId = UUID.randomUUID(); // UUID | Service Profile UUID
    try {
      ServiceProfile result = apiInstance.deleteServiceProfileByUuid(serviceProfileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceProfilesApi#deleteServiceProfileByUuid");
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
| **serviceProfileId** | **UUID**| Service Profile UUID | |

### Return type

[**ServiceProfile**](ServiceProfile.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=UTF-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Delete operation |  * ETag -  <br>  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a name="getServiceProfileByUuid"></a>
# **getServiceProfileByUuid**
> ServiceProfile getServiceProfileByUuid(serviceProfileId, viewPoint)

Get Profile

Get service profile by UUID. View Point parameter if set to zSide will give seller&#39;s view of the profile otherwise buyer&#39;s view.

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.ServiceProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ServiceProfilesApi apiInstance = new ServiceProfilesApi(defaultClient);
    UUID serviceProfileId = UUID.randomUUID(); // UUID | Service Profile UUID
    String viewPoint = "aSide"; // String | flips view between buyer and seller representation
    try {
      ServiceProfile result = apiInstance.getServiceProfileByUuid(serviceProfileId, viewPoint);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceProfilesApi#getServiceProfileByUuid");
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
| **serviceProfileId** | **UUID**| Service Profile UUID | |
| **viewPoint** | **String**| flips view between buyer and seller representation | [optional] [default to aSide] [enum: aSide, zSide] |

### Return type

[**ServiceProfile**](ServiceProfile.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=UTF-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  * ETag -  <br>  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

<a name="getServiceProfiles"></a>
# **getServiceProfiles**
> ServiceProfiles getServiceProfiles(offset, limit, viewPoint)

Get all Profiles

The API request returns all Equinix Fabric Service Profiles in accordance with the view point requested.

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.ServiceProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ServiceProfilesApi apiInstance = new ServiceProfilesApi(defaultClient);
    Integer offset = 1; // Integer | offset
    Integer limit = 10; // Integer | number of records to fetch
    String viewPoint = "aSide"; // String | flips view between buyer and seller representation
    try {
      ServiceProfiles result = apiInstance.getServiceProfiles(offset, limit, viewPoint);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceProfilesApi#getServiceProfiles");
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
| **viewPoint** | **String**| flips view between buyer and seller representation | [optional] [default to aSide] [enum: aSide, zSide] |

### Return type

[**ServiceProfiles**](ServiceProfiles.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=UTF-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

<a name="putServiceProfileByUuid"></a>
# **putServiceProfileByUuid**
> ServiceProfile putServiceProfileByUuid(serviceProfileId, ifMatch, serviceProfileRequest)

Replace Profile

This API request replaces a service profile definition

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.ServiceProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ServiceProfilesApi apiInstance = new ServiceProfilesApi(defaultClient);
    UUID serviceProfileId = UUID.randomUUID(); // UUID | Service Profile UUID
    String ifMatch = "ifMatch_example"; // String | conditional request
    ServiceProfileRequest serviceProfileRequest = new ServiceProfileRequest(); // ServiceProfileRequest | 
    try {
      ServiceProfile result = apiInstance.putServiceProfileByUuid(serviceProfileId, ifMatch, serviceProfileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceProfilesApi#putServiceProfileByUuid");
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
| **serviceProfileId** | **UUID**| Service Profile UUID | |
| **ifMatch** | **String**| conditional request | |
| **serviceProfileRequest** | [**ServiceProfileRequest**](ServiceProfileRequest.md)|  | |

### Return type

[**ServiceProfile**](ServiceProfile.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=UTF-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Put operation |  * ETag -  <br>  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a name="searchServiceProfiles"></a>
# **searchServiceProfiles**
> ServiceProfiles searchServiceProfiles(serviceProfileSearchRequest, viewPoint)

Profile Search

Search service profiles by search criteria

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.ServiceProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ServiceProfilesApi apiInstance = new ServiceProfilesApi(defaultClient);
    ServiceProfileSearchRequest serviceProfileSearchRequest = new ServiceProfileSearchRequest(); // ServiceProfileSearchRequest | 
    String viewPoint = "aSide"; // String | flips view between buyer and seller representation
    try {
      ServiceProfiles result = apiInstance.searchServiceProfiles(serviceProfileSearchRequest, viewPoint);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceProfilesApi#searchServiceProfiles");
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
| **serviceProfileSearchRequest** | [**ServiceProfileSearchRequest**](ServiceProfileSearchRequest.md)|  | |
| **viewPoint** | **String**| flips view between buyer and seller representation | [optional] [default to aSide] [enum: aSide, zSide] |

### Return type

[**ServiceProfiles**](ServiceProfiles.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=UTF-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **500** | Internal Server Error |  -  |

<a name="updateServiceProfileByUuid"></a>
# **updateServiceProfileByUuid**
> ServiceProfile updateServiceProfileByUuid(serviceProfileId, ifMatch, jsonPatchOperation)

Update Profile

Update Service Profile by UUID

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.ServiceProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ServiceProfilesApi apiInstance = new ServiceProfilesApi(defaultClient);
    UUID serviceProfileId = UUID.randomUUID(); // UUID | Service Profile UUID
    String ifMatch = "ifMatch_example"; // String | conditional request
    List<JsonPatchOperation> jsonPatchOperation = Arrays.asList(); // List<JsonPatchOperation> | 
    try {
      ServiceProfile result = apiInstance.updateServiceProfileByUuid(serviceProfileId, ifMatch, jsonPatchOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceProfilesApi#updateServiceProfileByUuid");
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
| **serviceProfileId** | **UUID**| Service Profile UUID | |
| **ifMatch** | **String**| conditional request | |
| **jsonPatchOperation** | [**List&lt;JsonPatchOperation&gt;**](JsonPatchOperation.md)|  | |

### Return type

[**ServiceProfile**](ServiceProfile.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json; charset=UTF-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Patch operation |  * ETag -  <br>  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **412** | Precondition Failed |  -  |
| **500** | Internal Server Error |  -  |

