# PrecisionTimeApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTimeServices**](PrecisionTimeApi.md#createTimeServices) | **POST** /fabric/v4/timeServices | Create time service |
| [**deleteTimeServiceById**](PrecisionTimeApi.md#deleteTimeServiceById) | **DELETE** /fabric/v4/timeServices/{serviceId} | Delete time service |
| [**getTimeServicesById**](PrecisionTimeApi.md#getTimeServicesById) | **GET** /fabric/v4/timeServices/{serviceId} | Get time service |
| [**getTimeServicesConnectionsByServiceId**](PrecisionTimeApi.md#getTimeServicesConnectionsByServiceId) | **GET** /fabric/v4/timeServices/{serviceId}/connections | Get Conn Links |
| [**getTimeServicesPackageByCode**](PrecisionTimeApi.md#getTimeServicesPackageByCode) | **GET** /fabric/v4/timeServicesPackages/{packageCode} | Get package by Code |
| [**getTimeServicesPackages**](PrecisionTimeApi.md#getTimeServicesPackages) | **GET** /fabric/v4/timeServicesPackages | Get Packages |
| [**updateTimeServicesById**](PrecisionTimeApi.md#updateTimeServicesById) | **PATCH** /fabric/v4/timeServices/{serviceId} | Patch time service |


<a name="createTimeServices"></a>
# **createTimeServices**
> PrecisionTimeServiceCreateResponse createTimeServices(precisionTimeServiceRequest)

Create time service

The API provides capability to create timing service

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.PrecisionTimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PrecisionTimeApi apiInstance = new PrecisionTimeApi(defaultClient);
    PrecisionTimeServiceRequest precisionTimeServiceRequest = new PrecisionTimeServiceRequest(); // PrecisionTimeServiceRequest | 
    try {
      PrecisionTimeServiceCreateResponse result = apiInstance.createTimeServices(precisionTimeServiceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrecisionTimeApi#createTimeServices");
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
| **precisionTimeServiceRequest** | [**PrecisionTimeServiceRequest**](PrecisionTimeServiceRequest.md)|  | |

### Return type

[**PrecisionTimeServiceCreateResponse**](PrecisionTimeServiceCreateResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="deleteTimeServiceById"></a>
# **deleteTimeServiceById**
> PrecisionTimeServiceCreateResponse deleteTimeServiceById(serviceId)

Delete time service

Delete EPT service by it&#39;s uuid

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.PrecisionTimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PrecisionTimeApi apiInstance = new PrecisionTimeApi(defaultClient);
    UUID serviceId = UUID.randomUUID(); // UUID | Service UUID
    try {
      PrecisionTimeServiceCreateResponse result = apiInstance.deleteTimeServiceById(serviceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrecisionTimeApi#deleteTimeServiceById");
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
| **serviceId** | **UUID**| Service UUID | |

### Return type

[**PrecisionTimeServiceCreateResponse**](PrecisionTimeServiceCreateResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful operation |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="getTimeServicesById"></a>
# **getTimeServicesById**
> PrecisionTimeServiceCreateResponse getTimeServicesById(serviceId)

Get time service

The API provides capability to get prevision timing service&#39;s details

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.PrecisionTimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PrecisionTimeApi apiInstance = new PrecisionTimeApi(defaultClient);
    UUID serviceId = UUID.randomUUID(); // UUID | Service UUID
    try {
      PrecisionTimeServiceCreateResponse result = apiInstance.getTimeServicesById(serviceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrecisionTimeApi#getTimeServicesById");
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
| **serviceId** | **UUID**| Service UUID | |

### Return type

[**PrecisionTimeServiceCreateResponse**](PrecisionTimeServiceCreateResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="getTimeServicesConnectionsByServiceId"></a>
# **getTimeServicesConnectionsByServiceId**
> PrecisionTimeServiceConnectionsResponse getTimeServicesConnectionsByServiceId(serviceId)

Get Conn Links

The API provides capability to get prevision timing service&#39;s details

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.PrecisionTimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PrecisionTimeApi apiInstance = new PrecisionTimeApi(defaultClient);
    UUID serviceId = UUID.randomUUID(); // UUID | Service UUID
    try {
      PrecisionTimeServiceConnectionsResponse result = apiInstance.getTimeServicesConnectionsByServiceId(serviceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrecisionTimeApi#getTimeServicesConnectionsByServiceId");
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
| **serviceId** | **UUID**| Service UUID | |

### Return type

[**PrecisionTimeServiceConnectionsResponse**](PrecisionTimeServiceConnectionsResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Return Time Service Connection |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="getTimeServicesPackageByCode"></a>
# **getTimeServicesPackageByCode**
> PackageResponse getTimeServicesPackageByCode(packageCode)

Get package by Code

The API provides capability to get timing service&#39;s package by code

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.PrecisionTimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PrecisionTimeApi apiInstance = new PrecisionTimeApi(defaultClient);
    String packageCode = "NTP_STANDARD"; // String | Package Code
    try {
      PackageResponse result = apiInstance.getTimeServicesPackageByCode(packageCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrecisionTimeApi#getTimeServicesPackageByCode");
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
| **packageCode** | **String**| Package Code | [enum: NTP_STANDARD, NTP_ENTERPRISE, PTP_STANDARD, PTP_ENTERPRISE] |

### Return type

[**PackageResponse**](PackageResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="getTimeServicesPackages"></a>
# **getTimeServicesPackages**
> PrecisionTimeServicePackagesResponse getTimeServicesPackages()

Get Packages

The API provides capability to get timing service&#39;s packages

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.PrecisionTimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PrecisionTimeApi apiInstance = new PrecisionTimeApi(defaultClient);
    try {
      PrecisionTimeServicePackagesResponse result = apiInstance.getTimeServicesPackages();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrecisionTimeApi#getTimeServicesPackages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PrecisionTimeServicePackagesResponse**](PrecisionTimeServicePackagesResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="updateTimeServicesById"></a>
# **updateTimeServicesById**
> PrecisionTimeServiceCreateResponse updateTimeServicesById(serviceId, precisionTimeChangeOperation)

Patch time service

The API provides capability to update timing service

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.PrecisionTimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PrecisionTimeApi apiInstance = new PrecisionTimeApi(defaultClient);
    UUID serviceId = UUID.randomUUID(); // UUID | Service UUID
    List<PrecisionTimeChangeOperation> precisionTimeChangeOperation = Arrays.asList(); // List<PrecisionTimeChangeOperation> | 
    try {
      PrecisionTimeServiceCreateResponse result = apiInstance.updateTimeServicesById(serviceId, precisionTimeChangeOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrecisionTimeApi#updateTimeServicesById");
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
| **serviceId** | **UUID**| Service UUID | |
| **precisionTimeChangeOperation** | [**List&lt;PrecisionTimeChangeOperation&gt;**](PrecisionTimeChangeOperation.md)|  | |

### Return type

[**PrecisionTimeServiceCreateResponse**](PrecisionTimeServiceCreateResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

