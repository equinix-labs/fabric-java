# PortsApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addToLag**](PortsApi.md#addToLag) | **POST** /fabric/v4/ports/{portId}/physicalPorts/bulk | Add to Lag |
| [**createBulkPort**](PortsApi.md#createBulkPort) | **POST** /fabric/v4/ports/bulk | Create Port |
| [**createPort**](PortsApi.md#createPort) | **POST** /fabric/v4/ports | Create Port |
| [**deletePort**](PortsApi.md#deletePort) | **DELETE** /fabric/v4/ports/{portId} | Delete a single port |
| [**getPortByUuid**](PortsApi.md#getPortByUuid) | **GET** /fabric/v4/ports/{portId} | Get Port by uuid |
| [**getPorts**](PortsApi.md#getPorts) | **GET** /fabric/v4/ports | Get All Ports |
| [**getVlans**](PortsApi.md#getVlans) | **GET** /fabric/v4/ports/{portUuid}/linkProtocols | Get Vlans |
| [**searchPorts**](PortsApi.md#searchPorts) | **POST** /fabric/v4/ports/search | Search ports |


<a name="addToLag"></a>
# **addToLag**
> AllPhysicalPortsResponse addToLag(portId, bulkPhysicalPort)

Add to Lag

Add Physical Ports to Virtual Port.&lt;font color&#x3D;\&quot;red\&quot;&gt; &lt;sup color&#x3D;&#39;red&#39;&gt;Preview&lt;/sup&gt;&lt;/font&gt;

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

PortsApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).ports();

api.addToLag()
    .portIdPath(portId)
    .body(bulkPhysicalPort).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **portId** | **UUID**| Port UUID | |
| **bulkPhysicalPort** | [**BulkPhysicalPort**](BulkPhysicalPort.md)|  | |

### Return type

[**AllPhysicalPortsResponse**](AllPhysicalPortsResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createBulkPort"></a>
# **createBulkPort**
> AllPortsResponse createBulkPort(bulkPort)

Create Port

Create Port creates Equinix Fabric? Port.&lt;font color&#x3D;\&quot;red\&quot;&gt; &lt;sup color&#x3D;&#39;red&#39;&gt;Preview&lt;/sup&gt;&lt;/font&gt;

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

PortsApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).ports();

api.createBulkPort()
    .body(bulkPort).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bulkPort** | [**BulkPort**](BulkPort.md)|  | |

### Return type

[**AllPortsResponse**](AllPortsResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPort"></a>
# **createPort**
> Port createPort(port)

Create Port

Creates Equinix Fabric? Port.

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

PortsApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).ports();

api.createPort()
    .body(port).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **port** | [**Port**](Port.md)|  | |

### Return type

[**Port**](Port.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePort"></a>
# **deletePort**
> Port deletePort(portId)

Delete a single port

The API provides capability to delete a single port

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

PortsApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).ports();

api.deletePort()
    .portIdPath(portId).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **portId** | **UUID**| Port UUID | |

### Return type

[**Port**](Port.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPortByUuid"></a>
# **getPortByUuid**
> Port getPortByUuid(portId)

Get Port by uuid

Get Port By uuid returns details of assigned and available Equinix Fabric port for the specified user credentials. The metro code attribute in the response shows the origin of the proposed connection.

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

PortsApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).ports();

api.getPortByUuid()
    .portIdPath(portId).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **portId** | **UUID**| Port UUID | |

### Return type

[**Port**](Port.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPorts"></a>
# **getPorts**
> AllPortsResponse getPorts(name)

Get All Ports

Get All Ports returns details of all assigned and available ports for the specified user credentials. The metro attribute in the response shows the origin of the proposed connection.

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

PortsApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).ports();

api.getPorts().execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| port name to be provided if specific port(s) to be retrieved | [optional] |

### Return type

[**AllPortsResponse**](AllPortsResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVlans"></a>
# **getVlans**
> LinkProtocolGetResponse getVlans(portUuid)

Get Vlans

The API provides capability to retrieve Vlans for a Port.

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

PortsApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).ports();

api.getVlans()
    .portUuidPath(portUuid).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **portUuid** | **UUID**| Port UUID | |

### Return type

[**LinkProtocolGetResponse**](LinkProtocolGetResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchPorts"></a>
# **searchPorts**
> AllPortsResponse searchPorts(portV4SearchRequest)

Search ports

The API provides capability to get list of user&#39;s virtual ports using search criteria, including optional filtering, pagination and sorting

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

PortsApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).ports();

api.searchPorts()
    .body(portV4SearchRequest).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **portV4SearchRequest** | [**PortV4SearchRequest**](PortV4SearchRequest.md)|  | |

### Return type

[**AllPortsResponse**](AllPortsResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

