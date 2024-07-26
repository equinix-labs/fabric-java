# CloudRoutersApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCloudRouter**](CloudRoutersApi.md#createCloudRouter) | **POST** /fabric/v4/routers | Create Routers |
| [**createCloudRouterAction**](CloudRoutersApi.md#createCloudRouterAction) | **POST** /fabric/v4/routers/{routerId}/actions | Route table actions |
| [**deleteCloudRouterByUuid**](CloudRoutersApi.md#deleteCloudRouterByUuid) | **DELETE** /fabric/v4/routers/{routerId} | Delete Routers |
| [**getCloudRouterActions**](CloudRoutersApi.md#getCloudRouterActions) | **GET** /fabric/v4/routers/{routerId}/actions | Get actions |
| [**getCloudRouterByUuid**](CloudRoutersApi.md#getCloudRouterByUuid) | **GET** /fabric/v4/routers/{routerId} | Get Routers |
| [**getCloudRouterPackageByCode**](CloudRoutersApi.md#getCloudRouterPackageByCode) | **GET** /fabric/v4/routerPackages/{routerPackageCode} | Get Package Details |
| [**getCloudRouterPackages**](CloudRoutersApi.md#getCloudRouterPackages) | **GET** /fabric/v4/routerPackages | List Packages |
| [**searchCloudRouterRoutes**](CloudRoutersApi.md#searchCloudRouterRoutes) | **POST** /fabric/v4/routers/{routerId}/routes/search | Search Route Table |
| [**searchCloudRouters**](CloudRoutersApi.md#searchCloudRouters) | **POST** /fabric/v4/routers/search | Search Routers |
| [**updateCloudRouterByUuid**](CloudRoutersApi.md#updateCloudRouterByUuid) | **PATCH** /fabric/v4/routers/{routerId} | Update Routers |


<a name="createCloudRouter"></a>
# **createCloudRouter**
> CloudRouter createCloudRouter(cloudRouterPostRequest)

Create Routers

This API provides capability to create user&#39;s Cloud Routers

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

CloudRoutersApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).cloudRouters();

api.createCloudRouter()
    .body(cloudRouterPostRequest).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cloudRouterPostRequest** | [**CloudRouterPostRequest**](CloudRouterPostRequest.md)|  | |

### Return type

[**CloudRouter**](CloudRouter.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCloudRouterAction"></a>
# **createCloudRouterAction**
> CloudRouterActionResponse createCloudRouterAction(routerId, cloudRouterActionRequest)

Route table actions

This API provides capability to refresh route table and bgp session summary information

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

CloudRoutersApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).cloudRouters();

api.createCloudRouterAction()
    .routerIdPath(routerId)
    .body(cloudRouterActionRequest).execute(r -> r.prettyPeek());
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

<a name="deleteCloudRouterByUuid"></a>
# **deleteCloudRouterByUuid**
> deleteCloudRouterByUuid(routerId)

Delete Routers

This API provides capability to delete user&#39;s Cloud Routers

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

CloudRoutersApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).cloudRouters();

api.deleteCloudRouterByUuid()
    .routerIdPath(routerId).execute(r -> r.prettyPeek());
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

<a name="getCloudRouterActions"></a>
# **getCloudRouterActions**
> CloudRouterActionResponse getCloudRouterActions(routerId, state)

Get actions

This API provides capability to fetch action status

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

CloudRoutersApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).cloudRouters();

api.getCloudRouterActions()
    .routerIdPath(routerId).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **routerId** | **UUID**| Router UUID | |
| **state** | [**CloudRouterActionState**](.md)| Action state | [optional] [enum: DONE, FAILED, PENDING] |

### Return type

[**CloudRouterActionResponse**](CloudRouterActionResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCloudRouterByUuid"></a>
# **getCloudRouterByUuid**
> CloudRouter getCloudRouterByUuid(routerId)

Get Routers

This API provides capability to retrieve user&#39;s Cloud Routers

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

CloudRoutersApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).cloudRouters();

api.getCloudRouterByUuid()
    .routerIdPath(routerId).execute(r -> r.prettyPeek());
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

<a name="getCloudRouterPackageByCode"></a>
# **getCloudRouterPackageByCode**
> CloudRouterPackage getCloudRouterPackageByCode(routerPackageCode)

Get Package Details

This API provides capability to retrieve user&#39;s Cloud Routers Package Details

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

CloudRoutersApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).cloudRouters();

api.getCloudRouterPackageByCode()
    .routerPackageCodePath(routerPackageCode).execute(r -> r.prettyPeek());
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

<a name="getCloudRouterPackages"></a>
# **getCloudRouterPackages**
> PackageResponse getCloudRouterPackages(offset, limit)

List Packages

This API provides capability to retrieve user&#39;s Cloud Routers Packages

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

CloudRoutersApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).cloudRouters();

api.getCloudRouterPackages().execute(r -> r.prettyPeek());
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

<a name="searchCloudRouterRoutes"></a>
# **searchCloudRouterRoutes**
> RouteTableEntrySearchResponse searchCloudRouterRoutes(routerId, routeTableEntrySearchRequest)

Search Route Table

The API provides capability to get list of user&#39;s Fabric Cloud Router route table entries using search criteria, including optional filtering, pagination and sorting

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

CloudRoutersApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).cloudRouters();

api.searchCloudRouterRoutes()
    .routerIdPath(routerId)
    .body(routeTableEntrySearchRequest).execute(r -> r.prettyPeek());
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

<a name="searchCloudRouters"></a>
# **searchCloudRouters**
> SearchResponse searchCloudRouters(cloudRouterSearchRequest)

Search Routers

The API provides capability to get list of user&#39;s Cloud Routers using search criteria, including optional filtering, pagination and sorting

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

CloudRoutersApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).cloudRouters();

api.searchCloudRouters()
    .body(cloudRouterSearchRequest).execute(r -> r.prettyPeek());
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

<a name="updateCloudRouterByUuid"></a>
# **updateCloudRouterByUuid**
> CloudRouter updateCloudRouterByUuid(routerId, cloudRouterChangeOperation)

Update Routers

This API provides capability to update user&#39;s Cloud Routers

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

CloudRoutersApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).cloudRouters();

api.updateCloudRouterByUuid()
    .routerIdPath(routerId)
    .body(cloudRouterChangeOperation).execute(r -> r.prettyPeek());
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

