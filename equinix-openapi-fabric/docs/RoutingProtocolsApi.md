# RoutingProtocolsApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createConnectionRoutingProtocol**](RoutingProtocolsApi.md#createConnectionRoutingProtocol) | **POST** /fabric/v4/connections/{connectionId}/routingProtocols | Create Protocol |
| [**createConnectionRoutingProtocolsInBulk**](RoutingProtocolsApi.md#createConnectionRoutingProtocolsInBulk) | **POST** /fabric/v4/connections/{connectionId}/routingProtocols/bulk | Bulk Create Protocol |
| [**deleteConnectionRoutingProtocolByUuid**](RoutingProtocolsApi.md#deleteConnectionRoutingProtocolByUuid) | **DELETE** /fabric/v4/connections/{connectionId}/routingProtocols/{routingProtocolId} | Delete Protocol |
| [**getConnectionRoutingProtocolAllBgpActions**](RoutingProtocolsApi.md#getConnectionRoutingProtocolAllBgpActions) | **GET** /fabric/v4/connections/{connectionId}/routingProtocols/{routingProtocolId}/actions | Get BGP Actions |
| [**getConnectionRoutingProtocolByUuid**](RoutingProtocolsApi.md#getConnectionRoutingProtocolByUuid) | **GET** /fabric/v4/connections/{connectionId}/routingProtocols/{routingProtocolId} | Get Protocol |
| [**getConnectionRoutingProtocols**](RoutingProtocolsApi.md#getConnectionRoutingProtocols) | **GET** /fabric/v4/connections/{connectionId}/routingProtocols | GetRoutingProtocols |
| [**getConnectionRoutingProtocolsBgpActionByUuid**](RoutingProtocolsApi.md#getConnectionRoutingProtocolsBgpActionByUuid) | **GET** /fabric/v4/connections/{connectionId}/routingProtocols/{routingProtocolId}/actions/{actionId} | Get BGP Action |
| [**getConnectionRoutingProtocolsChangeByUuid**](RoutingProtocolsApi.md#getConnectionRoutingProtocolsChangeByUuid) | **GET** /fabric/v4/connections/{connectionId}/routingProtocols/{routingProtocolId}/changes/{changeId} | Get Change By ID |
| [**getConnectionRoutingProtocolsChanges**](RoutingProtocolsApi.md#getConnectionRoutingProtocolsChanges) | **GET** /fabric/v4/connections/{connectionId}/routingProtocols/{routingProtocolId}/changes | Get Changes |
| [**patchConnectionRoutingProtocolByUuid**](RoutingProtocolsApi.md#patchConnectionRoutingProtocolByUuid) | **PATCH** /fabric/v4/connections/{connectionId}/routingProtocols/{routingProtocolId} | Patch Protocol |
| [**postConnectionRoutingProtocolBgpActionByUuid**](RoutingProtocolsApi.md#postConnectionRoutingProtocolBgpActionByUuid) | **POST** /fabric/v4/connections/{connectionId}/routingProtocols/{routingProtocolId}/actions | Clear/Reset BGP |
| [**replaceConnectionRoutingProtocolByUuid**](RoutingProtocolsApi.md#replaceConnectionRoutingProtocolByUuid) | **PUT** /fabric/v4/connections/{connectionId}/routingProtocols/{routingProtocolId} | Replace Protocol |
| [**validateRoutingProtocol**](RoutingProtocolsApi.md#validateRoutingProtocol) | **POST** /fabric/v4/routers/{routerId}/validate | Validate Subnet |


<a name="createConnectionRoutingProtocol"></a>
# **createConnectionRoutingProtocol**
> RoutingProtocolData createConnectionRoutingProtocol(connectionId, routingProtocolBase)

Create Protocol

This API provides capability to create Routing Protocol for connections

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RoutingProtocolsApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routingProtocols();

api.createConnectionRoutingProtocol()
    .connectionIdPath(connectionId)
    .body(routingProtocolBase).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **connectionId** | **String**| Connection Id | |
| **routingProtocolBase** | [**RoutingProtocolBase**](RoutingProtocolBase.md)|  | |

### Return type

[**RoutingProtocolData**](RoutingProtocolData.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createConnectionRoutingProtocolsInBulk"></a>
# **createConnectionRoutingProtocolsInBulk**
> GetResponse createConnectionRoutingProtocolsInBulk(connectionId, connectionRoutingProtocolPostRequest)

Bulk Create Protocol

This API provides capability to create Routing Protocol for connections

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RoutingProtocolsApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routingProtocols();

api.createConnectionRoutingProtocolsInBulk()
    .connectionIdPath(connectionId)
    .body(connectionRoutingProtocolPostRequest).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **connectionId** | **String**| Connection Id | |
| **connectionRoutingProtocolPostRequest** | [**ConnectionRoutingProtocolPostRequest**](ConnectionRoutingProtocolPostRequest.md)|  | |

### Return type

[**GetResponse**](GetResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteConnectionRoutingProtocolByUuid"></a>
# **deleteConnectionRoutingProtocolByUuid**
> RoutingProtocolData deleteConnectionRoutingProtocolByUuid(routingProtocolId, connectionId)

Delete Protocol

This API provides capability to delete Routing Protocols on virtual connection

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RoutingProtocolsApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routingProtocols();

api.deleteConnectionRoutingProtocolByUuid()
    .routingProtocolIdPath(routingProtocolId)
    .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **routingProtocolId** | **UUID**| Routing Protocol Id | |
| **connectionId** | **String**| Connection Id | |

### Return type

[**RoutingProtocolData**](RoutingProtocolData.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConnectionRoutingProtocolAllBgpActions"></a>
# **getConnectionRoutingProtocolAllBgpActions**
> BGPActionsBulkData getConnectionRoutingProtocolAllBgpActions(routingProtocolId, connectionId, offset, limit)

Get BGP Actions

This API provides capability to get all BGP actions status

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RoutingProtocolsApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routingProtocols();

api.getConnectionRoutingProtocolAllBgpActions()
    .routingProtocolIdPath(routingProtocolId)
    .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **routingProtocolId** | **UUID**| Routing Protocol Id | |
| **connectionId** | **String**| Connection Id | |
| **offset** | **Integer**| offset | [optional] |
| **limit** | **Integer**| number of records to fetch | [optional] |

### Return type

[**BGPActionsBulkData**](BGPActionsBulkData.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConnectionRoutingProtocolByUuid"></a>
# **getConnectionRoutingProtocolByUuid**
> RoutingProtocolData getConnectionRoutingProtocolByUuid(routingProtocolId, connectionId)

Get Protocol

This API provides capability to accept/reject user&#39;s virtual connection

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RoutingProtocolsApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routingProtocols();

api.getConnectionRoutingProtocolByUuid()
    .routingProtocolIdPath(routingProtocolId)
    .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **routingProtocolId** | **UUID**| Routing Protocol Id | |
| **connectionId** | **String**| Connection Id | |

### Return type

[**RoutingProtocolData**](RoutingProtocolData.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConnectionRoutingProtocols"></a>
# **getConnectionRoutingProtocols**
> GetResponse getConnectionRoutingProtocols(connectionId, offset, limit)

GetRoutingProtocols

This API provides capability to get Routing Protocols for connections

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RoutingProtocolsApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routingProtocols();

api.getConnectionRoutingProtocols()
    .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **connectionId** | **String**| Connection Id | |
| **offset** | **Integer**| offset | [optional] |
| **limit** | **Integer**| number of records to fetch | [optional] |

### Return type

[**GetResponse**](GetResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConnectionRoutingProtocolsBgpActionByUuid"></a>
# **getConnectionRoutingProtocolsBgpActionByUuid**
> BGPActionData getConnectionRoutingProtocolsBgpActionByUuid(connectionId, routingProtocolId, actionId)

Get BGP Action

This API provides capability to retrieve specific BGP action

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RoutingProtocolsApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routingProtocols();

api.getConnectionRoutingProtocolsBgpActionByUuid()
    .connectionIdPath(connectionId)
    .routingProtocolIdPath(routingProtocolId)
    .actionIdPath(actionId).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **connectionId** | **String**| Connection Id | |
| **routingProtocolId** | **UUID**| Routing Protocol Id | |
| **actionId** | **UUID**| BGP Action UUID | |

### Return type

[**BGPActionData**](BGPActionData.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConnectionRoutingProtocolsChangeByUuid"></a>
# **getConnectionRoutingProtocolsChangeByUuid**
> RoutingProtocolChangeData getConnectionRoutingProtocolsChangeByUuid(connectionId, routingProtocolId, changeId)

Get Change By ID

This API provides capability to retrieve specific Routing Protocol Change

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RoutingProtocolsApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routingProtocols();

api.getConnectionRoutingProtocolsChangeByUuid()
    .connectionIdPath(connectionId)
    .routingProtocolIdPath(routingProtocolId)
    .changeIdPath(changeId).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **connectionId** | **String**| Connection Id | |
| **routingProtocolId** | **UUID**| Routing Protocol Id | |
| **changeId** | **UUID**| Routing Protocol Change UUID | |

### Return type

[**RoutingProtocolChangeData**](RoutingProtocolChangeData.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConnectionRoutingProtocolsChanges"></a>
# **getConnectionRoutingProtocolsChanges**
> RoutingProtocolChangeDataResponse getConnectionRoutingProtocolsChanges(connectionId, routingProtocolId, offset, limit)

Get Changes

This API provides capability to retrieve user&#39;s Routing Protocol Changes

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RoutingProtocolsApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routingProtocols();

api.getConnectionRoutingProtocolsChanges()
    .connectionIdPath(connectionId)
    .routingProtocolIdPath(routingProtocolId).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **connectionId** | **String**| Connection Id | |
| **routingProtocolId** | **UUID**| Routing Protocol Id | |
| **offset** | **Integer**| offset | [optional] |
| **limit** | **Integer**| number of records to fetch | [optional] |

### Return type

[**RoutingProtocolChangeDataResponse**](RoutingProtocolChangeDataResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="patchConnectionRoutingProtocolByUuid"></a>
# **patchConnectionRoutingProtocolByUuid**
> RoutingProtocolData patchConnectionRoutingProtocolByUuid(routingProtocolId, connectionId, connectionChangeOperation)

Patch Protocol

This API provides capability to partially update Routing Protocols on a virtual connection

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RoutingProtocolsApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routingProtocols();

api.patchConnectionRoutingProtocolByUuid()
    .routingProtocolIdPath(routingProtocolId)
    .connectionIdPath(connectionId)
    .body(connectionChangeOperation).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **routingProtocolId** | **UUID**| Routing Protocol Id | |
| **connectionId** | **String**| Connection Id | |
| **connectionChangeOperation** | [**List&lt;ConnectionChangeOperation&gt;**](ConnectionChangeOperation.md)|  | |

### Return type

[**RoutingProtocolData**](RoutingProtocolData.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postConnectionRoutingProtocolBgpActionByUuid"></a>
# **postConnectionRoutingProtocolBgpActionByUuid**
> BGPActionData postConnectionRoutingProtocolBgpActionByUuid(routingProtocolId, connectionId, bgPActionRequest)

Clear/Reset BGP

This API provides capability to clear/reset Routing Protocols BGP session

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RoutingProtocolsApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routingProtocols();

api.postConnectionRoutingProtocolBgpActionByUuid()
    .routingProtocolIdPath(routingProtocolId)
    .connectionIdPath(connectionId)
    .body(bgPActionRequest).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **routingProtocolId** | **UUID**| Routing Protocol Id | |
| **connectionId** | **String**| Connection Id | |
| **bgPActionRequest** | [**BGPActionRequest**](BGPActionRequest.md)|  | |

### Return type

[**BGPActionData**](BGPActionData.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="replaceConnectionRoutingProtocolByUuid"></a>
# **replaceConnectionRoutingProtocolByUuid**
> RoutingProtocolData replaceConnectionRoutingProtocolByUuid(routingProtocolId, connectionId, routingProtocolBase)

Replace Protocol

This API provides capability to replace complete Routing Protocols on a virtual connection

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RoutingProtocolsApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routingProtocols();

api.replaceConnectionRoutingProtocolByUuid()
    .routingProtocolIdPath(routingProtocolId)
    .connectionIdPath(connectionId)
    .body(routingProtocolBase).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **routingProtocolId** | **UUID**| Routing Protocol Id | |
| **connectionId** | **String**| Connection Id | |
| **routingProtocolBase** | [**RoutingProtocolBase**](RoutingProtocolBase.md)|  | |

### Return type

[**RoutingProtocolData**](RoutingProtocolData.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="validateRoutingProtocol"></a>
# **validateRoutingProtocol**
> ValidateSubnetResponse validateRoutingProtocol(routerId, validateRequest)

Validate Subnet

This API provides capability to validate all subnets associated with any connection in the given FCR

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

RoutingProtocolsApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).routingProtocols();

api.validateRoutingProtocol()
    .routerIdPath(routerId)
    .body(validateRequest).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **routerId** | **UUID**| Cloud Router UUID | |
| **validateRequest** | [**ValidateRequest**](ValidateRequest.md)|  | |

### Return type

[**ValidateSubnetResponse**](ValidateSubnetResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

