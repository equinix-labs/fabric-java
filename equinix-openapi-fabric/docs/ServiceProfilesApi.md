# ServiceProfilesApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createServiceProfile**](ServiceProfilesApi.md#createServiceProfile) | **POST** /fabric/v4/serviceProfiles | Create Profile |
| [**deleteServiceProfileByUuid**](ServiceProfilesApi.md#deleteServiceProfileByUuid) | **DELETE** /fabric/v4/serviceProfiles/{serviceProfileId} | Delete Profile |
| [**getServiceProfileByUuid**](ServiceProfilesApi.md#getServiceProfileByUuid) | **GET** /fabric/v4/serviceProfiles/{serviceProfileId} | Get Profile |
| [**getServiceProfileMetrosByUuid**](ServiceProfilesApi.md#getServiceProfileMetrosByUuid) | **GET** /fabric/v4/serviceProfiles/{serviceProfileId}/metros | Get Profile Metros |
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
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

ServiceProfilesApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).serviceProfiles();

api.createServiceProfile()
    .body(serviceProfileRequest).execute(r -> r.prettyPeek());
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

<a name="deleteServiceProfileByUuid"></a>
# **deleteServiceProfileByUuid**
> ServiceProfile deleteServiceProfileByUuid(serviceProfileId)

Delete Profile

delete Service Profile by UUID

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

ServiceProfilesApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).serviceProfiles();

api.deleteServiceProfileByUuid()
    .serviceProfileIdPath(serviceProfileId).execute(r -> r.prettyPeek());
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

<a name="getServiceProfileByUuid"></a>
# **getServiceProfileByUuid**
> ServiceProfile getServiceProfileByUuid(serviceProfileId, viewPoint)

Get Profile

Get service profile by UUID. View Point parameter if set to zSide will give seller&#39;s view of the profile otherwise buyer&#39;s view.

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

ServiceProfilesApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).serviceProfiles();

api.getServiceProfileByUuid()
    .serviceProfileIdPath(serviceProfileId).execute(r -> r.prettyPeek());
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

<a name="getServiceProfileMetrosByUuid"></a>
# **getServiceProfileMetrosByUuid**
> ServiceMetros getServiceProfileMetrosByUuid(serviceProfileId, offset, limit)

Get Profile Metros

Get service profile metros by UUID.

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

ServiceProfilesApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).serviceProfiles();

api.getServiceProfileMetrosByUuid()
    .serviceProfileIdPath(serviceProfileId).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceProfileId** | **UUID**| Service Profile UUID | |
| **offset** | **Integer**| offset | [optional] |
| **limit** | **Integer**| number of records to fetch | [optional] |

### Return type

[**ServiceMetros**](ServiceMetros.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=UTF-8, application/json

<a name="getServiceProfiles"></a>
# **getServiceProfiles**
> ServiceProfiles getServiceProfiles(offset, limit, viewPoint)

Get all Profiles

The API request returns all Equinix Fabric Service Profiles in accordance with the view point requested.

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

ServiceProfilesApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).serviceProfiles();

api.getServiceProfiles().execute(r -> r.prettyPeek());
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

<a name="putServiceProfileByUuid"></a>
# **putServiceProfileByUuid**
> ServiceProfile putServiceProfileByUuid(serviceProfileId, ifMatch, serviceProfileRequest)

Replace Profile

This API request replaces a service profile definition

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

ServiceProfilesApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).serviceProfiles();

api.putServiceProfileByUuid()
    .serviceProfileIdPath(serviceProfileId)
    .ifMatchHeader(ifMatch)
    .body(serviceProfileRequest).execute(r -> r.prettyPeek());
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

<a name="searchServiceProfiles"></a>
# **searchServiceProfiles**
> ServiceProfiles searchServiceProfiles(serviceProfileSearchRequest, viewPoint)

Profile Search

Search service profiles by search criteria

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

ServiceProfilesApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).serviceProfiles();

api.searchServiceProfiles()
    .body(serviceProfileSearchRequest).execute(r -> r.prettyPeek());
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

<a name="updateServiceProfileByUuid"></a>
# **updateServiceProfileByUuid**
> ServiceProfile updateServiceProfileByUuid(serviceProfileId, ifMatch, jsonPatchOperation)

Update Profile

Update Service Profile by UUID

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

ServiceProfilesApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).serviceProfiles();

api.updateServiceProfileByUuid()
    .serviceProfileIdPath(serviceProfileId)
    .ifMatchHeader(ifMatch)
    .body(jsonPatchOperation).execute(r -> r.prettyPeek());
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

