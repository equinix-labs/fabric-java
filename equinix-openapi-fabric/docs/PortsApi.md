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
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.PortsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PortsApi apiInstance = new PortsApi(defaultClient);
    UUID portId = UUID.randomUUID(); // UUID | Port UUID
    BulkPhysicalPort bulkPhysicalPort = new BulkPhysicalPort(); // BulkPhysicalPort | 
    try {
      AllPhysicalPortsResponse result = apiInstance.addToLag(portId, bulkPhysicalPort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortsApi#addToLag");
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
| **portId** | **UUID**| Port UUID | |
| **bulkPhysicalPort** | [**BulkPhysicalPort**](BulkPhysicalPort.md)|  | |

### Return type

[**AllPhysicalPortsResponse**](AllPhysicalPortsResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="createBulkPort"></a>
# **createBulkPort**
> AllPortsResponse createBulkPort(bulkPort)

Create Port

Create Port creates Equinix Fabric™ Port.&lt;font color&#x3D;\&quot;red\&quot;&gt; &lt;sup color&#x3D;&#39;red&#39;&gt;Preview&lt;/sup&gt;&lt;/font&gt;

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.PortsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PortsApi apiInstance = new PortsApi(defaultClient);
    BulkPort bulkPort = new BulkPort(); // BulkPort | 
    try {
      AllPortsResponse result = apiInstance.createBulkPort(bulkPort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortsApi#createBulkPort");
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
| **bulkPort** | [**BulkPort**](BulkPort.md)|  | |

### Return type

[**AllPortsResponse**](AllPortsResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful operation for COLO Bulk Port |  -  |

<a name="createPort"></a>
# **createPort**
> Port createPort(port)

Create Port

Creates Equinix Fabric™ Port.

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.PortsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PortsApi apiInstance = new PortsApi(defaultClient);
    Port port = new Port(); // Port | 
    try {
      Port result = apiInstance.createPort(port);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortsApi#createPort");
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
| **port** | [**Port**](Port.md)|  | |

### Return type

[**Port**](Port.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful operation for COLO Single Port Non Lag |  -  |
| **400** | Bad request |  -  |
| **500** | Internal Server Error |  -  |

<a name="deletePort"></a>
# **deletePort**
> Port deletePort(portId)

Delete a single port

The API provides capability to delete a single port

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.PortsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PortsApi apiInstance = new PortsApi(defaultClient);
    UUID portId = UUID.randomUUID(); // UUID | Port UUID
    try {
      Port result = apiInstance.deletePort(portId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortsApi#deletePort");
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
| **portId** | **UUID**| Port UUID | |

### Return type

[**Port**](Port.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |

<a name="getPortByUuid"></a>
# **getPortByUuid**
> Port getPortByUuid(portId)

Get Port by uuid

Get Port By uuid returns details of assigned and available Equinix Fabric port for the specified user credentials. The metro code attribute in the response shows the origin of the proposed connection.

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.PortsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PortsApi apiInstance = new PortsApi(defaultClient);
    UUID portId = UUID.randomUUID(); // UUID | Port UUID
    try {
      Port result = apiInstance.getPortByUuid(portId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortsApi#getPortByUuid");
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
| **portId** | **UUID**| Port UUID | |

### Return type

[**Port**](Port.md)

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

<a name="getPorts"></a>
# **getPorts**
> AllPortsResponse getPorts(name)

Get All Ports

Get All Ports returns details of all assigned and available ports for the specified user credentials. The metro attribute in the response shows the origin of the proposed connection.

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.PortsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PortsApi apiInstance = new PortsApi(defaultClient);
    String name = "name_example"; // String | port name to be provided if specific port(s) to be retrieved
    try {
      AllPortsResponse result = apiInstance.getPorts(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortsApi#getPorts");
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
| **name** | **String**| port name to be provided if specific port(s) to be retrieved | [optional] |

### Return type

[**AllPortsResponse**](AllPortsResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

<a name="getVlans"></a>
# **getVlans**
> LinkProtocolGetResponse getVlans(portUuid)

Get Vlans

The API provides capability to retrieve Vlans for a Port.

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.PortsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PortsApi apiInstance = new PortsApi(defaultClient);
    UUID portUuid = UUID.randomUUID(); // UUID | Port UUID
    try {
      LinkProtocolGetResponse result = apiInstance.getVlans(portUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortsApi#getVlans");
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
| **portUuid** | **UUID**| Port UUID | |

### Return type

[**LinkProtocolGetResponse**](LinkProtocolGetResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Vlans |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |

<a name="searchPorts"></a>
# **searchPorts**
> AllPortsResponse searchPorts(portV4SearchRequest)

Search ports

The API provides capability to get list of user&#39;s virtual ports using search criteria, including optional filtering, pagination and sorting

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.PortsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PortsApi apiInstance = new PortsApi(defaultClient);
    PortV4SearchRequest portV4SearchRequest = new PortV4SearchRequest(); // PortV4SearchRequest | 
    try {
      AllPortsResponse result = apiInstance.searchPorts(portV4SearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortsApi#searchPorts");
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
| **portV4SearchRequest** | [**PortV4SearchRequest**](PortV4SearchRequest.md)|  | |

### Return type

[**AllPortsResponse**](AllPortsResponse.md)

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
| **404** | Not Found |  -  |

