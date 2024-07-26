# ServiceTokensApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createServiceToken**](ServiceTokensApi.md#createServiceToken) | **POST** /fabric/v4/serviceTokens | Create Service Token |
| [**createServiceTokenAction**](ServiceTokensApi.md#createServiceTokenAction) | **POST** /fabric/v4/serviceTokens/{serviceTokenId}/actions | ServiceToken Actions |
| [**deleteServiceTokenByUuid**](ServiceTokensApi.md#deleteServiceTokenByUuid) | **DELETE** /fabric/v4/serviceTokens/{serviceTokenId} | Delete Token by uuid |
| [**getServiceTokenByUuid**](ServiceTokensApi.md#getServiceTokenByUuid) | **GET** /fabric/v4/serviceTokens/{serviceTokenId} | Get Token by uuid |
| [**getServiceTokens**](ServiceTokensApi.md#getServiceTokens) | **GET** /fabric/v4/serviceTokens | Get All Tokens |
| [**searchServiceTokens**](ServiceTokensApi.md#searchServiceTokens) | **POST** /fabric/v4/serviceTokens/search | Search servicetokens |
| [**updateServiceTokenByUuid**](ServiceTokensApi.md#updateServiceTokenByUuid) | **PATCH** /fabric/v4/serviceTokens/{serviceTokenId} | Update Token By ID |


<a name="createServiceToken"></a>
# **createServiceToken**
> ServiceToken createServiceToken(serviceToken)

Create Service Token

Create Service Tokens generates Equinix Fabric? service tokens. These tokens authorize users to access protected resources and services.

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

ServiceTokensApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).serviceTokens();

api.createServiceToken()
    .body(serviceToken).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceToken** | [**ServiceToken**](ServiceToken.md)|  | |

### Return type

[**ServiceToken**](ServiceToken.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createServiceTokenAction"></a>
# **createServiceTokenAction**
> ServiceToken createServiceTokenAction(serviceTokenId, serviceTokenActionRequest)

ServiceToken Actions

This API provides capability to accept/reject user&#39;s servicetokens

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

ServiceTokensApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).serviceTokens();

api.createServiceTokenAction()
    .serviceTokenIdPath(serviceTokenId)
    .body(serviceTokenActionRequest).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceTokenId** | **UUID**| Service Token UUID | |
| **serviceTokenActionRequest** | [**ServiceTokenActionRequest**](ServiceTokenActionRequest.md)|  | |

### Return type

[**ServiceToken**](ServiceToken.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteServiceTokenByUuid"></a>
# **deleteServiceTokenByUuid**
> deleteServiceTokenByUuid(serviceTokenId)

Delete Token by uuid

Delete Service Tokens removes an Equinix Fabric service token corresponding to the specified uuid which are in INACTIVE state.

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

ServiceTokensApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).serviceTokens();

api.deleteServiceTokenByUuid()
    .serviceTokenIdPath(serviceTokenId).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceTokenId** | **UUID**| Service Token UUID | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getServiceTokenByUuid"></a>
# **getServiceTokenByUuid**
> ServiceToken getServiceTokenByUuid(serviceTokenId)

Get Token by uuid

Get Specified Service Tokens uses the uuid of an Equinix Fabric service token to return details about the token&#39;s type, state, location, bandwidth, and other key properties.

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

ServiceTokensApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).serviceTokens();

api.getServiceTokenByUuid()
    .serviceTokenIdPath(serviceTokenId).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceTokenId** | **UUID**| Service Token UUID | |

### Return type

[**ServiceToken**](ServiceToken.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getServiceTokens"></a>
# **getServiceTokens**
> ServiceTokens getServiceTokens(offset, limit)

Get All Tokens

Get All ServiceTokens creates a list of all Equinix Fabric service tokens associated with the subscriber&#39;s account.

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

ServiceTokensApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).serviceTokens();

api.getServiceTokens().execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **offset** | **BigDecimal**| offset | [optional] |
| **limit** | **BigDecimal**| number of records to fetch | [optional] |

### Return type

[**ServiceTokens**](ServiceTokens.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchServiceTokens"></a>
# **searchServiceTokens**
> ServiceTokens searchServiceTokens(serviceTokenSearchRequest)

Search servicetokens

The API provides capability to get list of user&#39;s servicetokens using search criteria, including optional filtering, pagination and sorting

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

ServiceTokensApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).serviceTokens();

api.searchServiceTokens()
    .body(serviceTokenSearchRequest).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceTokenSearchRequest** | [**ServiceTokenSearchRequest**](ServiceTokenSearchRequest.md)|  | |

### Return type

[**ServiceTokens**](ServiceTokens.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateServiceTokenByUuid"></a>
# **updateServiceTokenByUuid**
> ServiceToken updateServiceTokenByUuid(serviceTokenId, serviceTokenChangeOperation)

Update Token By ID

This API provides capability to update user&#39;s Service Token

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

ServiceTokensApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).serviceTokens();

api.updateServiceTokenByUuid()
    .serviceTokenIdPath(serviceTokenId)
    .body(serviceTokenChangeOperation).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceTokenId** | **UUID**| Service Token UUID | |
| **serviceTokenChangeOperation** | [**List&lt;ServiceTokenChangeOperation&gt;**](ServiceTokenChangeOperation.md)|  | |

### Return type

[**ServiceToken**](ServiceToken.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

