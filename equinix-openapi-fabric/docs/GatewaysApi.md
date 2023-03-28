# GatewaysApi

All URIs are relative to *https://virtserver.swaggerhub.com/equinix-api/fabric/4.6*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createGateway**](GatewaysApi.md#createGateway) | **POST** /fabric/v4/gateways | Create Gateway |
| [**createGatewayAction**](GatewaysApi.md#createGatewayAction) | **POST** /fabric/v4/gateways/{gatewayId}/actions | Route table actions |
| [**deleteGatewayByUuid**](GatewaysApi.md#deleteGatewayByUuid) | **DELETE** /fabric/v4/gateways/{gatewayId} | Delete Gateway |
| [**getGatewayActions**](GatewaysApi.md#getGatewayActions) | **GET** /fabric/v4/gateways/{gatewayId}/actions | Get actions |
| [**getGatewayByUuid**](GatewaysApi.md#getGatewayByUuid) | **GET** /fabric/v4/gateways/{gatewayId} | Get Gateway |
| [**getGatewayPackageByCode**](GatewaysApi.md#getGatewayPackageByCode) | **GET** /fabric/v4/gatewayPackages/{gatewayPackageCode} | Get Package Details |
| [**getGatewayPackages**](GatewaysApi.md#getGatewayPackages) | **GET** /fabric/v4/gatewayPackages | List Packages |
| [**searchGateways**](GatewaysApi.md#searchGateways) | **POST** /fabric/v4/gateways/search | Search Gateway |
| [**updateGatewayByUuid**](GatewaysApi.md#updateGatewayByUuid) | **PATCH** /fabric/v4/gateways/{gatewayId} | Update Gateway |


<a name="createGateway"></a>
# **createGateway**
> FabricGateway createGateway(fabricGatewayPostRequest)

Create Gateway

This API provides capability to create user&#39;s Fabric Gateways

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.GatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://virtserver.swaggerhub.com/equinix-api/fabric/4.6");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    GatewaysApi apiInstance = new GatewaysApi(defaultClient);
    FabricGatewayPostRequest fabricGatewayPostRequest = new FabricGatewayPostRequest(); // FabricGatewayPostRequest | 
    try {
      FabricGateway result = apiInstance.createGateway(fabricGatewayPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GatewaysApi#createGateway");
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
| **fabricGatewayPostRequest** | [**FabricGatewayPostRequest**](FabricGatewayPostRequest.md)|  | |

### Return type

[**FabricGateway**](FabricGateway.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Gateway Access point object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="createGatewayAction"></a>
# **createGatewayAction**
> GatewayActionResponse createGatewayAction(gatewayId, gatewayActionRequest)

Route table actions

This API provides capability to refresh route table and bgp session summary information

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.GatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://virtserver.swaggerhub.com/equinix-api/fabric/4.6");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    GatewaysApi apiInstance = new GatewaysApi(defaultClient);
    UUID gatewayId = UUID.randomUUID(); // UUID | Gateway UUID
    GatewayActionRequest gatewayActionRequest = new GatewayActionRequest(); // GatewayActionRequest | 
    try {
      GatewayActionResponse result = apiInstance.createGatewayAction(gatewayId, gatewayActionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GatewaysApi#createGatewayAction");
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
| **gatewayId** | **UUID**| Gateway UUID | |
| **gatewayActionRequest** | [**GatewayActionRequest**](GatewayActionRequest.md)|  | |

### Return type

[**GatewayActionResponse**](GatewayActionResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Internal server error |  -  |
| **500** | Internal server error |  -  |

<a name="deleteGatewayByUuid"></a>
# **deleteGatewayByUuid**
> deleteGatewayByUuid(gatewayId)

Delete Gateway

This API provides capability to delete user&#39;s Fabric Gateway

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.GatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://virtserver.swaggerhub.com/equinix-api/fabric/4.6");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    GatewaysApi apiInstance = new GatewaysApi(defaultClient);
    UUID gatewayId = UUID.randomUUID(); // UUID | Gateway UUID
    try {
      apiInstance.deleteGatewayByUuid(gatewayId);
    } catch (ApiException e) {
      System.err.println("Exception when calling GatewaysApi#deleteGatewayByUuid");
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
| **gatewayId** | **UUID**| Gateway UUID | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Deleted Gateway Successfully |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="getGatewayActions"></a>
# **getGatewayActions**
> GatewayActionResponse getGatewayActions(gatewayId, state)

Get actions

This API provides capability to fetch action status

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.GatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://virtserver.swaggerhub.com/equinix-api/fabric/4.6");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    GatewaysApi apiInstance = new GatewaysApi(defaultClient);
    UUID gatewayId = UUID.randomUUID(); // UUID | Gateway UUID
    GatewayActionState state = GatewayActionState.fromValue("DONE"); // GatewayActionState | Action state
    try {
      GatewayActionResponse result = apiInstance.getGatewayActions(gatewayId, state);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GatewaysApi#getGatewayActions");
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
| **gatewayId** | **UUID**| Gateway UUID | |
| **state** | [**GatewayActionState**](.md)| Action state | [optional] [enum: DONE, FAILED, PENDING] |

### Return type

[**GatewayActionResponse**](GatewayActionResponse.md)

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
| **404** | Not Found |  -  |
| **415** | Internal server error |  -  |
| **500** | Internal server error |  -  |

<a name="getGatewayByUuid"></a>
# **getGatewayByUuid**
> FabricGateway getGatewayByUuid(gatewayId)

Get Gateway

This API provides capability to retrieve user&#39;s Fabric Gateway

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.GatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://virtserver.swaggerhub.com/equinix-api/fabric/4.6");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    GatewaysApi apiInstance = new GatewaysApi(defaultClient);
    UUID gatewayId = UUID.randomUUID(); // UUID | Gateway UUID
    try {
      FabricGateway result = apiInstance.getGatewayByUuid(gatewayId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GatewaysApi#getGatewayByUuid");
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
| **gatewayId** | **UUID**| Gateway UUID | |

### Return type

[**FabricGateway**](FabricGateway.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Gateway Access point object |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="getGatewayPackageByCode"></a>
# **getGatewayPackageByCode**
> FabricGatewayPackage getGatewayPackageByCode(gatewayPackageCode)

Get Package Details

This API provides capability to retrieve user&#39;s Fabric Gateway Package Details

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.GatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://virtserver.swaggerhub.com/equinix-api/fabric/4.6");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    GatewaysApi apiInstance = new GatewaysApi(defaultClient);
    GatewayPackageCode gatewayPackageCode = GatewayPackageCode.fromValue("LAB"); // GatewayPackageCode | Equinix-assigned gateway package identifier
    try {
      FabricGatewayPackage result = apiInstance.getGatewayPackageByCode(gatewayPackageCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GatewaysApi#getGatewayPackageByCode");
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
| **gatewayPackageCode** | [**GatewayPackageCode**](.md)| Equinix-assigned gateway package identifier | [enum: LAB, BASIC, PRO, PREMIUM] |

### Return type

[**FabricGatewayPackage**](FabricGatewayPackage.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Gateway Package details |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="getGatewayPackages"></a>
# **getGatewayPackages**
> PackageResponse getGatewayPackages(offset, limit)

List Packages

This API provides capability to retrieve user&#39;s Fabric Gateway Packages

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.GatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://virtserver.swaggerhub.com/equinix-api/fabric/4.6");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    GatewaysApi apiInstance = new GatewaysApi(defaultClient);
    Integer offset = 1; // Integer | offset
    Integer limit = 10; // Integer | number of records to fetch
    try {
      PackageResponse result = apiInstance.getGatewayPackages(offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GatewaysApi#getGatewayPackages");
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
| **offset** | **Integer**| offset | [optional] |
| **limit** | **Integer**| number of records to fetch | [optional] |

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
| **200** | Fabric Gateway Packages |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="searchGateways"></a>
# **searchGateways**
> SearchResponse searchGateways(fabricGatewaySearchRequest)

Search Gateway

The API provides capability to get list of user&#39;s Fabric Gateways using search criteria, including optional filtering, pagination and sorting

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.GatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://virtserver.swaggerhub.com/equinix-api/fabric/4.6");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    GatewaysApi apiInstance = new GatewaysApi(defaultClient);
    FabricGatewaySearchRequest fabricGatewaySearchRequest = new FabricGatewaySearchRequest(); // FabricGatewaySearchRequest | 
    try {
      SearchResponse result = apiInstance.searchGateways(fabricGatewaySearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GatewaysApi#searchGateways");
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
| **fabricGatewaySearchRequest** | [**FabricGatewaySearchRequest**](FabricGatewaySearchRequest.md)|  | |

### Return type

[**SearchResponse**](SearchResponse.md)

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

<a name="updateGatewayByUuid"></a>
# **updateGatewayByUuid**
> FabricGateway updateGatewayByUuid(gatewayId, fabricGatewayChangeOperation)

Update Gateway

This API provides capability to update user&#39;s Fabric Gateway

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.GatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://virtserver.swaggerhub.com/equinix-api/fabric/4.6");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    GatewaysApi apiInstance = new GatewaysApi(defaultClient);
    UUID gatewayId = UUID.randomUUID(); // UUID | Gateway UUID
    List<FabricGatewayChangeOperation> fabricGatewayChangeOperation = Arrays.asList(); // List<FabricGatewayChangeOperation> | 
    try {
      FabricGateway result = apiInstance.updateGatewayByUuid(gatewayId, fabricGatewayChangeOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GatewaysApi#updateGatewayByUuid");
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
| **gatewayId** | **UUID**| Gateway UUID | |
| **fabricGatewayChangeOperation** | [**List&lt;FabricGatewayChangeOperation&gt;**](FabricGatewayChangeOperation.md)|  | |

### Return type

[**FabricGateway**](FabricGateway.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Gateway Access point object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

