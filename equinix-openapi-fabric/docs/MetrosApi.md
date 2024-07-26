# MetrosApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMetroByCode**](MetrosApi.md#getMetroByCode) | **GET** /fabric/v4/metros/{metroCode} | Get Metro by Code |
| [**getMetros**](MetrosApi.md#getMetros) | **GET** /fabric/v4/metros | Get all Metros |


<a name="getMetroByCode"></a>
# **getMetroByCode**
> Metro getMetroByCode(metroCode)

Get Metro by Code

GET Metros retrieves all Equinix Fabric metros, as well as latency data between each metro location. .

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

MetrosApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).metros();

api.getMetroByCode()
    .metroCodePath(metroCode).execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **metroCode** | **String**| Metro Code | |

### Return type

[**Metro**](Metro.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMetros"></a>
# **getMetros**
> MetroResponse getMetros(presence, offset, limit)

Get all Metros

GET All Subscriber Metros with an option query parameter to return all Equinix Fabric metros in which the customer has a presence, as well as latency data for each location.

### Example
```java
// Import classes:
//import com.equinix.openapi.fabric.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

MetrosApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("https://api.equinix.com"))).metros();

api.getMetros().execute(r -> r.prettyPeek());
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **presence** | [**Presence**](.md)| User On Boarded Metros based on Fabric resource availability | [optional] [enum: MY_PORTS] |
| **offset** | **Integer**| offset | [optional] |
| **limit** | **Integer**| number of records to fetch | [optional] |

### Return type

[**MetroResponse**](MetroResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

