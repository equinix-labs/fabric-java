# CloudRoutersApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCloudRouter**](CloudRoutersApi.md#createCloudRouter) | **POST** /fabric/v4/routers | Create Routers |
| [**createCloudRouterAction**](CloudRoutersApi.md#createCloudRouterAction) | **POST** /fabric/v4/routers/{routerId}/actions | Create Route Table Action |
| [**createCloudRouterCommand**](CloudRoutersApi.md#createCloudRouterCommand) | **POST** /fabric/v4/routers/{routerId}/commands | Initiate Command |
| [**deleteCloudRouterByUuid**](CloudRoutersApi.md#deleteCloudRouterByUuid) | **DELETE** /fabric/v4/routers/{routerId} | Delete Routers |
| [**deleteCloudRouterCommandByUuid**](CloudRoutersApi.md#deleteCloudRouterCommandByUuid) | **DELETE** /fabric/v4/routers/{routerId}/commands/{commandId} | Delete Command |
| [**getAllCloudRouterCommands**](CloudRoutersApi.md#getAllCloudRouterCommands) | **GET** /fabric/v4/routers/{routerId}/commands | Get Commands |
| [**getCloudRouterActions**](CloudRoutersApi.md#getCloudRouterActions) | **GET** /fabric/v4/routers/{routerId}/actions | Get Route Table Actions |
| [**getCloudRouterActionsByUuid**](CloudRoutersApi.md#getCloudRouterActionsByUuid) | **GET** /fabric/v4/routers/{routerId}/actions/{actionId} | Get Route Table Action by ID |
| [**getCloudRouterByUuid**](CloudRoutersApi.md#getCloudRouterByUuid) | **GET** /fabric/v4/routers/{routerId} | Get Routers |
| [**getCloudRouterCommand**](CloudRoutersApi.md#getCloudRouterCommand) | **GET** /fabric/v4/routers/{routerId}/commands/{commandId} | Get Command |
| [**getCloudRouterPackageByCode**](CloudRoutersApi.md#getCloudRouterPackageByCode) | **GET** /fabric/v4/routerPackages/{routerPackageCode} | Get Package Details |
| [**getCloudRouterPackages**](CloudRoutersApi.md#getCloudRouterPackages) | **GET** /fabric/v4/routerPackages | List Packages |
| [**searchCloudRouterCommands**](CloudRoutersApi.md#searchCloudRouterCommands) | **POST** /fabric/v4/routers/{routerId}/commands/search | Search Commands |
| [**searchCloudRouterRoutes**](CloudRoutersApi.md#searchCloudRouterRoutes) | **POST** /fabric/v4/routers/{routerId}/routes/search | Search Route Table |
| [**searchCloudRouters**](CloudRoutersApi.md#searchCloudRouters) | **POST** /fabric/v4/routers/search | Search Routers |
| [**searchConnectionAdvertisedRoutes**](CloudRoutersApi.md#searchConnectionAdvertisedRoutes) | **POST** /fabric/v4/connections/{connectionId}/advertisedRoutes/search | Search Advertised Routes |
| [**searchConnectionReceivedRoutes**](CloudRoutersApi.md#searchConnectionReceivedRoutes) | **POST** /fabric/v4/connections/{connectionId}/receivedRoutes/search | Search Received Routes |
| [**searchRouterActions**](CloudRoutersApi.md#searchRouterActions) | **POST** /fabric/v4/routers/{routerId}/actions/search | Search Route Table Actions |
| [**updateCloudRouterByUuid**](CloudRoutersApi.md#updateCloudRouterByUuid) | **PATCH** /fabric/v4/routers/{routerId} | Update Routers |


<a name="createCloudRouter"></a>
# **createCloudRouter**
> CloudRouter createCloudRouter(cloudRouterPostRequest, dryRun)

Create Routers

This API provides capability to create user&#39;s Cloud Routers

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    CloudRouterPostRequest cloudRouterPostRequest = new CloudRouterPostRequest(); // CloudRouterPostRequest | 
    Boolean dryRun = false; // Boolean | option to verify that API calls will succeed
    try {
      CloudRouter result = apiInstance.createCloudRouter(cloudRouterPostRequest, dryRun);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#createCloudRouter");
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
| **cloudRouterPostRequest** | [**CloudRouterPostRequest**](CloudRouterPostRequest.md)|  | |
| **dryRun** | **Boolean**| option to verify that API calls will succeed | [optional] [default to false] |

### Return type

[**CloudRouter**](CloudRouter.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Cloud Router object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="createCloudRouterAction"></a>
# **createCloudRouterAction**
> CloudRouterActionResponse createCloudRouterAction(routerId, cloudRouterActionRequest)

Create Route Table Action

This API provides capability to refresh route table and bgp session summary information

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    UUID routerId = UUID.randomUUID(); // UUID | Router UUID
    CloudRouterActionRequest cloudRouterActionRequest = new CloudRouterActionRequest(); // CloudRouterActionRequest | 
    try {
      CloudRouterActionResponse result = apiInstance.createCloudRouterAction(routerId, cloudRouterActionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#createCloudRouterAction");
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
| **routerId** | **UUID**| Router UUID | |
| **cloudRouterActionRequest** | [**CloudRouterActionRequest**](CloudRouterActionRequest.md)|  | |

### Return type

[**CloudRouterActionResponse**](CloudRouterActionResponse.md)

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

<a name="createCloudRouterCommand"></a>
# **createCloudRouterCommand**
> CloudRouterCommand createCloudRouterCommand(routerId, cloudRouterCommandPostRequest)

Initiate Command

This API provides capability to initiate Command

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    UUID routerId = UUID.randomUUID(); // UUID | Router UUID
    CloudRouterCommandPostRequest cloudRouterCommandPostRequest = new CloudRouterCommandPostRequest(); // CloudRouterCommandPostRequest | 
    try {
      CloudRouterCommand result = apiInstance.createCloudRouterCommand(routerId, cloudRouterCommandPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#createCloudRouterCommand");
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
| **routerId** | **UUID**| Router UUID | |
| **cloudRouterCommandPostRequest** | [**CloudRouterCommandPostRequest**](CloudRouterCommandPostRequest.md)|  | |

### Return type

[**CloudRouterCommand**](CloudRouterCommand.md)

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

<a name="deleteCloudRouterByUuid"></a>
# **deleteCloudRouterByUuid**
> deleteCloudRouterByUuid(routerId)

Delete Routers

This API provides capability to delete user&#39;s Cloud Routers

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    UUID routerId = UUID.randomUUID(); // UUID | Cloud Router UUID
    try {
      apiInstance.deleteCloudRouterByUuid(routerId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#deleteCloudRouterByUuid");
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
| **routerId** | **UUID**| Cloud Router UUID | |

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
| **204** | Deleted Cloud Router Successfully |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="deleteCloudRouterCommandByUuid"></a>
# **deleteCloudRouterCommandByUuid**
> deleteCloudRouterCommandByUuid(routerId, commandId)

Delete Command

This API provides capability to delete command based on command Id

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    UUID routerId = UUID.randomUUID(); // UUID | Router UUID
    UUID commandId = UUID.randomUUID(); // UUID | Command UUID
    try {
      apiInstance.deleteCloudRouterCommandByUuid(routerId, commandId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#deleteCloudRouterCommandByUuid");
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
| **routerId** | **UUID**| Router UUID | |
| **commandId** | **UUID**| Command UUID | |

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
| **204** | Deleted command successfully |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="getAllCloudRouterCommands"></a>
# **getAllCloudRouterCommands**
> GetAllCloudRouterCommands getAllCloudRouterCommands(routerId)

Get Commands

This API provides capability to fetch all commands

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    UUID routerId = UUID.randomUUID(); // UUID | Router UUID
    try {
      GetAllCloudRouterCommands result = apiInstance.getAllCloudRouterCommands(routerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#getAllCloudRouterCommands");
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
| **routerId** | **UUID**| Router UUID | |

### Return type

[**GetAllCloudRouterCommands**](GetAllCloudRouterCommands.md)

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

<a name="getCloudRouterActions"></a>
# **getCloudRouterActions**
> CloudRouterActionResponse getCloudRouterActions(routerId, state)

Get Route Table Actions

This API provides capability to fetch action status

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    UUID routerId = UUID.randomUUID(); // UUID | Router UUID
    CloudRouterActionState state = CloudRouterActionState.fromValue("SUCCEEDED"); // CloudRouterActionState | Action state
    try {
      CloudRouterActionResponse result = apiInstance.getCloudRouterActions(routerId, state);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#getCloudRouterActions");
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
| **routerId** | **UUID**| Router UUID | |
| **state** | [**CloudRouterActionState**](.md)| Action state | [optional] [enum: SUCCEEDED, FAILED, PENDING] |

### Return type

[**CloudRouterActionResponse**](CloudRouterActionResponse.md)

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

<a name="getCloudRouterActionsByUuid"></a>
# **getCloudRouterActionsByUuid**
> CloudRouterActionResponse getCloudRouterActionsByUuid(routerId, actionId, state)

Get Route Table Action by ID

This API provides capability to fetch action status

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    UUID routerId = UUID.randomUUID(); // UUID | Router UUID
    UUID actionId = UUID.randomUUID(); // UUID | Action UUID
    CloudRouterActionState state = CloudRouterActionState.fromValue("SUCCEEDED"); // CloudRouterActionState | Action state
    try {
      CloudRouterActionResponse result = apiInstance.getCloudRouterActionsByUuid(routerId, actionId, state);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#getCloudRouterActionsByUuid");
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
| **routerId** | **UUID**| Router UUID | |
| **actionId** | **UUID**| Action UUID | |
| **state** | [**CloudRouterActionState**](.md)| Action state | [optional] [enum: SUCCEEDED, FAILED, PENDING] |

### Return type

[**CloudRouterActionResponse**](CloudRouterActionResponse.md)

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

<a name="getCloudRouterByUuid"></a>
# **getCloudRouterByUuid**
> CloudRouter getCloudRouterByUuid(routerId)

Get Routers

This API provides capability to retrieve user&#39;s Cloud Routers

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    UUID routerId = UUID.randomUUID(); // UUID | Cloud Router UUID
    try {
      CloudRouter result = apiInstance.getCloudRouterByUuid(routerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#getCloudRouterByUuid");
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
| **routerId** | **UUID**| Cloud Router UUID | |

### Return type

[**CloudRouter**](CloudRouter.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Cloud Router object |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="getCloudRouterCommand"></a>
# **getCloudRouterCommand**
> CloudRouterCommand getCloudRouterCommand(routerId, commandId)

Get Command

This API provides capability to fetch command using command Id

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    UUID routerId = UUID.randomUUID(); // UUID | Router UUID
    UUID commandId = UUID.randomUUID(); // UUID | Command UUID
    try {
      CloudRouterCommand result = apiInstance.getCloudRouterCommand(routerId, commandId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#getCloudRouterCommand");
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
| **routerId** | **UUID**| Router UUID | |
| **commandId** | **UUID**| Command UUID | |

### Return type

[**CloudRouterCommand**](CloudRouterCommand.md)

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

<a name="getCloudRouterPackageByCode"></a>
# **getCloudRouterPackageByCode**
> CloudRouterPackage getCloudRouterPackageByCode(routerPackageCode)

Get Package Details

This API provides capability to retrieve user&#39;s Cloud Routers Package Details

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    RouterPackageCode routerPackageCode = RouterPackageCode.fromValue("LAB"); // RouterPackageCode | Equinix-assigned Cloud Router package identifier
    try {
      CloudRouterPackage result = apiInstance.getCloudRouterPackageByCode(routerPackageCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#getCloudRouterPackageByCode");
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
| **routerPackageCode** | [**RouterPackageCode**](.md)| Equinix-assigned Cloud Router package identifier | [enum: LAB, ADVANCED, STANDARD, PREMIUM] |

### Return type

[**CloudRouterPackage**](CloudRouterPackage.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Cloud Router Package details |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="getCloudRouterPackages"></a>
# **getCloudRouterPackages**
> PackageResponse getCloudRouterPackages(offset, limit)

List Packages

This API provides capability to retrieve user&#39;s Cloud Routers Packages

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    Integer offset = 1; // Integer | offset
    Integer limit = 10; // Integer | number of records to fetch
    try {
      PackageResponse result = apiInstance.getCloudRouterPackages(offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#getCloudRouterPackages");
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
| **200** | Fabric Cloud Router Packages |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a name="searchCloudRouterCommands"></a>
# **searchCloudRouterCommands**
> CloudRouterCommandSearchResponse searchCloudRouterCommands(routerId, cloudRouterCommandSearchRequest)

Search Commands

This API provides capability to search commands

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    UUID routerId = UUID.randomUUID(); // UUID | Router UUID
    CloudRouterCommandSearchRequest cloudRouterCommandSearchRequest = new CloudRouterCommandSearchRequest(); // CloudRouterCommandSearchRequest | 
    try {
      CloudRouterCommandSearchResponse result = apiInstance.searchCloudRouterCommands(routerId, cloudRouterCommandSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#searchCloudRouterCommands");
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
| **routerId** | **UUID**| Router UUID | |
| **cloudRouterCommandSearchRequest** | [**CloudRouterCommandSearchRequest**](CloudRouterCommandSearchRequest.md)|  | |

### Return type

[**CloudRouterCommandSearchResponse**](CloudRouterCommandSearchResponse.md)

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
| **404** | Not Found |  -  |
| **415** | Internal server error |  -  |
| **500** | Internal server error |  -  |

<a name="searchCloudRouterRoutes"></a>
# **searchCloudRouterRoutes**
> RouteTableEntrySearchResponse searchCloudRouterRoutes(routerId, routeTableEntrySearchRequest)

Search Route Table

The API provides capability to get list of user&#39;s Fabric Cloud Router route table entries using search criteria, including optional filtering, pagination and sorting

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    UUID routerId = UUID.randomUUID(); // UUID | Router UUID
    RouteTableEntrySearchRequest routeTableEntrySearchRequest = new RouteTableEntrySearchRequest(); // RouteTableEntrySearchRequest | 
    try {
      RouteTableEntrySearchResponse result = apiInstance.searchCloudRouterRoutes(routerId, routeTableEntrySearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#searchCloudRouterRoutes");
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
| **routerId** | **UUID**| Router UUID | |
| **routeTableEntrySearchRequest** | [**RouteTableEntrySearchRequest**](RouteTableEntrySearchRequest.md)|  | |

### Return type

[**RouteTableEntrySearchResponse**](RouteTableEntrySearchResponse.md)

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
| **404** | Not Found |  -  |
| **415** | Internal server error |  -  |
| **500** | Internal server error |  -  |

<a name="searchCloudRouters"></a>
# **searchCloudRouters**
> SearchResponse searchCloudRouters(cloudRouterSearchRequest)

Search Routers

The API provides capability to get list of user&#39;s Cloud Routers using search criteria, including optional filtering, pagination and sorting

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    CloudRouterSearchRequest cloudRouterSearchRequest = new CloudRouterSearchRequest(); // CloudRouterSearchRequest | 
    try {
      SearchResponse result = apiInstance.searchCloudRouters(cloudRouterSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#searchCloudRouters");
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
| **cloudRouterSearchRequest** | [**CloudRouterSearchRequest**](CloudRouterSearchRequest.md)|  | |

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

<a name="searchConnectionAdvertisedRoutes"></a>
# **searchConnectionAdvertisedRoutes**
> ConnectionRouteTableEntrySearchResponse searchConnectionAdvertisedRoutes(connectionId, connectionRouteSearchRequest)

Search Advertised Routes

The API provides capability to get list of user&#39;s advertised routes using search criteria, including optional filtering, pagination and sorting

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    String connectionId = "connectionId_example"; // String | Connection Id
    ConnectionRouteSearchRequest connectionRouteSearchRequest = new ConnectionRouteSearchRequest(); // ConnectionRouteSearchRequest | 
    try {
      ConnectionRouteTableEntrySearchResponse result = apiInstance.searchConnectionAdvertisedRoutes(connectionId, connectionRouteSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#searchConnectionAdvertisedRoutes");
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
| **connectionId** | **String**| Connection Id | |
| **connectionRouteSearchRequest** | [**ConnectionRouteSearchRequest**](ConnectionRouteSearchRequest.md)|  | |

### Return type

[**ConnectionRouteTableEntrySearchResponse**](ConnectionRouteTableEntrySearchResponse.md)

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
| **404** | Not Found |  -  |

<a name="searchConnectionReceivedRoutes"></a>
# **searchConnectionReceivedRoutes**
> ConnectionRouteTableEntrySearchResponse searchConnectionReceivedRoutes(connectionId, connectionRouteSearchRequest)

Search Received Routes

The API provides capability to get list of received routes using search criteria, including optional filtering, pagination and sorting

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    String connectionId = "connectionId_example"; // String | Connection Id
    ConnectionRouteSearchRequest connectionRouteSearchRequest = new ConnectionRouteSearchRequest(); // ConnectionRouteSearchRequest | 
    try {
      ConnectionRouteTableEntrySearchResponse result = apiInstance.searchConnectionReceivedRoutes(connectionId, connectionRouteSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#searchConnectionReceivedRoutes");
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
| **connectionId** | **String**| Connection Id | |
| **connectionRouteSearchRequest** | [**ConnectionRouteSearchRequest**](ConnectionRouteSearchRequest.md)|  | |

### Return type

[**ConnectionRouteTableEntrySearchResponse**](ConnectionRouteTableEntrySearchResponse.md)

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
| **404** | Not Found |  -  |

<a name="searchRouterActions"></a>
# **searchRouterActions**
> CloudRouterActionsSearchResponse searchRouterActions(routerId, cloudRouterActionsSearchRequest)

Search Route Table Actions

This API provides capability to refresh route table and bgp session summary information

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    UUID routerId = UUID.randomUUID(); // UUID | Router UUID
    CloudRouterActionsSearchRequest cloudRouterActionsSearchRequest = new CloudRouterActionsSearchRequest(); // CloudRouterActionsSearchRequest | 
    try {
      CloudRouterActionsSearchResponse result = apiInstance.searchRouterActions(routerId, cloudRouterActionsSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#searchRouterActions");
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
| **routerId** | **UUID**| Router UUID | |
| **cloudRouterActionsSearchRequest** | [**CloudRouterActionsSearchRequest**](CloudRouterActionsSearchRequest.md)|  | |

### Return type

[**CloudRouterActionsSearchResponse**](CloudRouterActionsSearchResponse.md)

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
| **404** | Not Found |  -  |
| **415** | Internal server error |  -  |
| **500** | Internal server error |  -  |

<a name="updateCloudRouterByUuid"></a>
# **updateCloudRouterByUuid**
> CloudRouter updateCloudRouterByUuid(routerId, cloudRouterChangeOperation)

Update Routers

This API provides capability to update user&#39;s Cloud Routers

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.CloudRoutersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudRoutersApi apiInstance = new CloudRoutersApi(defaultClient);
    UUID routerId = UUID.randomUUID(); // UUID | Cloud Router UUID
    List<CloudRouterChangeOperation> cloudRouterChangeOperation = Arrays.asList(); // List<CloudRouterChangeOperation> | 
    try {
      CloudRouter result = apiInstance.updateCloudRouterByUuid(routerId, cloudRouterChangeOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudRoutersApi#updateCloudRouterByUuid");
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
| **routerId** | **UUID**| Cloud Router UUID | |
| **cloudRouterChangeOperation** | [**List&lt;CloudRouterChangeOperation&gt;**](CloudRouterChangeOperation.md)|  | |

### Return type

[**CloudRouter**](CloudRouter.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fabric Cloud Router object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

