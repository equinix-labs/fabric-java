# PortsApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPort**](PortsApi.md#createPort) | **POST** /fabric/v4/ports | Create Port |
| [**getPortByUuid**](PortsApi.md#getPortByUuid) | **GET** /fabric/v4/ports/{portId} | Get Port by uuid |
| [**getPorts**](PortsApi.md#getPorts) | **GET** /fabric/v4/ports | Get All Ports |


<a name="createPort"></a>
# **createPort**
> AllPortsResponse createPort(port)

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
    Port port = new Port(); // Port | 
    try {
      AllPortsResponse result = apiInstance.createPort(port);
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

[**AllPortsResponse**](AllPortsResponse.md)

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
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

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
| **403** | Forbidden |  -  |

