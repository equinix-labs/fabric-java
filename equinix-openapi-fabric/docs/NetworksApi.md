# NetworksApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNetwork**](NetworksApi.md#createNetwork) | **POST** /fabric/v4/networks | Create Network |
| [**deleteNetworkByUuid**](NetworksApi.md#deleteNetworkByUuid) | **DELETE** /fabric/v4/networks/{networkId} | Delete Network By ID |
| [**getConnectionsByNetworkUuid**](NetworksApi.md#getConnectionsByNetworkUuid) | **GET** /fabric/v4/networks/{networkId}/connections | Get Connections |
| [**getNetworkByUuid**](NetworksApi.md#getNetworkByUuid) | **GET** /fabric/v4/networks/{networkId} | Get Network By ID |
| [**getNetworkChangeByUuid**](NetworksApi.md#getNetworkChangeByUuid) | **GET** /fabric/v4/networks/{networkId}/changes/{changeId} | Get Change By ID |
| [**getNetworkChanges**](NetworksApi.md#getNetworkChanges) | **GET** /fabric/v4/networks/{networkId}/changes | Get Network Changes |
| [**searchNetworks**](NetworksApi.md#searchNetworks) | **POST** /fabric/v4/networks/search | Search Network |
| [**updateNetworkByUuid**](NetworksApi.md#updateNetworkByUuid) | **PATCH** /fabric/v4/networks/{networkId} | Update Network By ID |


<a name="createNetwork"></a>
# **createNetwork**
> Network createNetwork(networkPostRequest)

Create Network

This API provides capability to create user&#39;s Fabric Network

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

NetworksApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).networks();

api.createNetwork()
    .body(networkPostRequest).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **networkPostRequest** | [**NetworkPostRequest**](NetworkPostRequest.md)|  | |

### Return type

[**Network**](Network.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNetworkByUuid"></a>
# **deleteNetworkByUuid**
> Network deleteNetworkByUuid(networkId)

Delete Network By ID

This API provides capability to delete user&#39;s Fabric Network

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

NetworksApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).networks();

api.deleteNetworkByUuid()
    .networkIdPath(networkId).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **networkId** | **UUID**| Network UUID | |

### Return type

[**Network**](Network.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConnectionsByNetworkUuid"></a>
# **getConnectionsByNetworkUuid**
> NetworkConnections getConnectionsByNetworkUuid(networkId)

Get Connections

The API provides capability to get list of user&#39;s Fabric Network connections

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

NetworksApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).networks();

api.getConnectionsByNetworkUuid()
    .networkIdPath(networkId).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **networkId** | **UUID**| Network UUID | |

### Return type

[**NetworkConnections**](NetworkConnections.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNetworkByUuid"></a>
# **getNetworkByUuid**
> Network getNetworkByUuid(networkId)

Get Network By ID

This API provides capability to retrieve user&#39;s Fabric Network

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

NetworksApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).networks();

api.getNetworkByUuid()
    .networkIdPath(networkId).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **networkId** | **UUID**| Network UUID | |

### Return type

[**Network**](Network.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNetworkChangeByUuid"></a>
# **getNetworkChangeByUuid**
> NetworkChange getNetworkChangeByUuid(networkId, changeId)

Get Change By ID

This API provides capability to retrieve user&#39;s Fabric Network Change

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

NetworksApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).networks();

api.getNetworkChangeByUuid()
    .networkIdPath(networkId)
    .changeIdPath(changeId).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **networkId** | **UUID**| Network UUID | |
| **changeId** | **UUID**| Network Change UUID | |

### Return type

[**NetworkChange**](NetworkChange.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNetworkChanges"></a>
# **getNetworkChanges**
> NetworkChangeResponse getNetworkChanges(networkId)

Get Network Changes

The API provides capability to get list of user&#39;s Fabric Network changes

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

NetworksApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).networks();

api.getNetworkChanges()
    .networkIdPath(networkId).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **networkId** | **UUID**| Network UUID | |

### Return type

[**NetworkChangeResponse**](NetworkChangeResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchNetworks"></a>
# **searchNetworks**
> NetworkSearchResponse searchNetworks(networkSearchRequest)

Search Network

The API provides capability to get list of user&#39;s Fabric Network using search criteria, including optional filtering, pagination and sorting

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

NetworksApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).networks();

api.searchNetworks()
    .body(networkSearchRequest).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **networkSearchRequest** | [**NetworkSearchRequest**](NetworkSearchRequest.md)|  | |

### Return type

[**NetworkSearchResponse**](NetworkSearchResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNetworkByUuid"></a>
# **updateNetworkByUuid**
> Network updateNetworkByUuid(networkId, networkChangeOperation)

Update Network By ID

This API provides capability to update user&#39;s Fabric Network

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

NetworksApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).networks();

api.updateNetworkByUuid()
    .networkIdPath(networkId)
    .body(networkChangeOperation).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **networkId** | **UUID**| Network UUID | |
| **networkChangeOperation** | [**List&lt;NetworkChangeOperation&gt;**](NetworkChangeOperation.md)|  | |

### Return type

[**Network**](Network.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

