# PrecisionTimeApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTimeServices**](PrecisionTimeApi.md#createTimeServices) | **POST** /fabric/v4/timeServices | Create Time Service |
| [**deleteTimeServiceById**](PrecisionTimeApi.md#deleteTimeServiceById) | **DELETE** /fabric/v4/timeServices/{serviceId} | Delete time service |
| [**getTimeServicesById**](PrecisionTimeApi.md#getTimeServicesById) | **GET** /fabric/v4/timeServices/{serviceId} | Get Time Service |
| [**getTimeServicesConnectionsByServiceId**](PrecisionTimeApi.md#getTimeServicesConnectionsByServiceId) | **GET** /fabric/v4/timeServices/{serviceId}/connections | Get Connection Links |
| [**getTimeServicesPackageByCode**](PrecisionTimeApi.md#getTimeServicesPackageByCode) | **GET** /fabric/v4/timeServicePackages/{packageCode} | Get Package By Code |
| [**getTimeServicesPackages**](PrecisionTimeApi.md#getTimeServicesPackages) | **GET** /fabric/v4/timeServicePackages | Get Packages |
| [**updateTimeServicesById**](PrecisionTimeApi.md#updateTimeServicesById) | **PATCH** /fabric/v4/timeServices/{serviceId} | Patch time service |


<a name="createTimeServices"></a>
# **createTimeServices**
> PrecisionTimeServiceCreateResponse createTimeServices(precisionTimeServiceRequest)

Create Time Service

The API provides capability to create timing service

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

PrecisionTimeApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).precisionTime();

api.createTimeServices()
    .body(precisionTimeServiceRequest).execute(r -> r.prettyPeek());
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

<a name="deleteTimeServiceById"></a>
# **deleteTimeServiceById**
> PrecisionTimeServiceCreateResponse deleteTimeServiceById(serviceId)

Delete time service

Delete EPT service by it&#39;s uuid

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

PrecisionTimeApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).precisionTime();

api.deleteTimeServiceById()
    .serviceIdPath(serviceId).execute(r -> r.prettyPeek());
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

<a name="getTimeServicesById"></a>
# **getTimeServicesById**
> PrecisionTimeServiceCreateResponse getTimeServicesById(serviceId)

Get Time Service

The API provides capability to get precision timing service&#39;s details

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

PrecisionTimeApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).precisionTime();

api.getTimeServicesById()
    .serviceIdPath(serviceId).execute(r -> r.prettyPeek());
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

<a name="getTimeServicesConnectionsByServiceId"></a>
# **getTimeServicesConnectionsByServiceId**
> PrecisionTimeServiceConnectionsResponse getTimeServicesConnectionsByServiceId(serviceId)

Get Connection Links

The API provides capability to get prevision timing service&#39;s details

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

PrecisionTimeApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).precisionTime();

api.getTimeServicesConnectionsByServiceId()
    .serviceIdPath(serviceId).execute(r -> r.prettyPeek());
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

<a name="getTimeServicesPackageByCode"></a>
# **getTimeServicesPackageByCode**
> PrecisionTimePackageResponse getTimeServicesPackageByCode(packageCode)

Get Package By Code

The API provides capability to get timing service&#39;s package by code

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

PrecisionTimeApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).precisionTime();

api.getTimeServicesPackageByCode()
    .packageCodePath(packageCode).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **packageCode** | **String**| Package Code | [enum: NTP_STANDARD, NTP_ENTERPRISE, PTP_STANDARD, PTP_ENTERPRISE] |

### Return type

[**PrecisionTimePackageResponse**](PrecisionTimePackageResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTimeServicesPackages"></a>
# **getTimeServicesPackages**
> PrecisionTimeServicePackagesResponse getTimeServicesPackages()

Get Packages

The API provides capability to get timing service&#39;s packages

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

PrecisionTimeApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).precisionTime();

api.getTimeServicesPackages().execute(r -> r.prettyPeek());
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

<a name="updateTimeServicesById"></a>
# **updateTimeServicesById**
> PrecisionTimeServiceCreateResponse updateTimeServicesById(serviceId, precisionTimeChangeOperation)

Patch time service

The API provides capability to update timing service

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

PrecisionTimeApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).precisionTime();

api.updateTimeServicesById()
    .serviceIdPath(serviceId)
    .body(precisionTimeChangeOperation).execute(r -> r.prettyPeek());
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

