# ConnectionsApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createConnection**](ConnectionsApi.md#createConnection) | **POST** /fabric/v4/connections | Create Connection |
| [**createConnectionAction**](ConnectionsApi.md#createConnectionAction) | **POST** /fabric/v4/connections/{connectionId}/actions | Connection Actions |
| [**deleteConnectionByUuid**](ConnectionsApi.md#deleteConnectionByUuid) | **DELETE** /fabric/v4/connections/{connectionId} | Delete by ID |
| [**getConnectionByUuid**](ConnectionsApi.md#getConnectionByUuid) | **GET** /fabric/v4/connections/{connectionId} | Get Connection by ID |
| [**searchConnections**](ConnectionsApi.md#searchConnections) | **POST** /fabric/v4/connections/search | Search connections |
| [**updateConnectionByUuid**](ConnectionsApi.md#updateConnectionByUuid) | **PATCH** /fabric/v4/connections/{connectionId} | Update by ID |
| [**validateConnections**](ConnectionsApi.md#validateConnections) | **POST** /fabric/v4/connections/validate | Validate Connection |


<a name="createConnection"></a>
# **createConnection**
> Connection createConnection(connectionPostRequest)

Create Connection

This API provides capability to create user&#39;s virtual connection

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

ConnectionsApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).connections();

api.createConnection()
    .body(connectionPostRequest).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **connectionPostRequest** | [**ConnectionPostRequest**](ConnectionPostRequest.md)|  | |

### Return type

[**Connection**](Connection.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createConnectionAction"></a>
# **createConnectionAction**
> ConnectionAction createConnectionAction(connectionId, connectionActionRequest)

Connection Actions

This API provides capability to accept/reject user&#39;s virtual connection

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

ConnectionsApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).connections();

api.createConnectionAction()
    .connectionIdPath(connectionId)
    .body(connectionActionRequest).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **connectionId** | **String**| Connection Id | |
| **connectionActionRequest** | [**ConnectionActionRequest**](ConnectionActionRequest.md)|  | |

### Return type

[**ConnectionAction**](ConnectionAction.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteConnectionByUuid"></a>
# **deleteConnectionByUuid**
> Connection deleteConnectionByUuid(connectionId)

Delete by ID

Delete Connection by ID

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

ConnectionsApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).connections();

api.deleteConnectionByUuid()
    .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **connectionId** | **String**| Connection UUID | |

### Return type

[**Connection**](Connection.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConnectionByUuid"></a>
# **getConnectionByUuid**
> Connection getConnectionByUuid(connectionId, direction)

Get Connection by ID

The API provides capability to get user&#39;s virtual connection details (Service Tokens, Access Points, Link Protocols, etc) by it&#39;s connection ID (UUID)

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

ConnectionsApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).connections();

api.getConnectionByUuid()
    .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **connectionId** | **String**| Connection Id | |
| **direction** | [**ConnectionDirection**](.md)| Connection Direction | [optional] [enum: INTERNAL, INCOMING, OUTGOING] |

### Return type

[**Connection**](Connection.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchConnections"></a>
# **searchConnections**
> ConnectionSearchResponse searchConnections(searchRequest)

Search connections

The API provides capability to get list of user&#39;s virtual connections using search criteria, including optional filtering, pagination and sorting

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

ConnectionsApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).connections();

api.searchConnections()
    .body(searchRequest).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **searchRequest** | [**SearchRequest**](SearchRequest.md)|  | |

### Return type

[**ConnectionSearchResponse**](ConnectionSearchResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateConnectionByUuid"></a>
# **updateConnectionByUuid**
> Connection updateConnectionByUuid(connectionId, connectionChangeOperation)

Update by ID

Update Connection by ID

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

ConnectionsApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).connections();

api.updateConnectionByUuid()
    .connectionIdPath(connectionId)
    .body(connectionChangeOperation).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **connectionId** | **String**| Connection Id | |
| **connectionChangeOperation** | [**List&lt;ConnectionChangeOperation&gt;**](ConnectionChangeOperation.md)|  | |

### Return type

[**Connection**](Connection.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

<a name="validateConnections"></a>
# **validateConnections**
> ConnectionResponse validateConnections(validateRequest)

Validate Connection

This API provides capability to validate by auth key

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

ConnectionsApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).connections();

api.validateConnections()
    .body(validateRequest).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **validateRequest** | [**ValidateRequest**](ValidateRequest.md)|  | |

### Return type

[**ConnectionResponse**](ConnectionResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

