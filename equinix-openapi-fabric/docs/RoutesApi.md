# RoutesApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**searchRoutes**](RoutesApi.md#searchRoutes) | **POST** /fabric/v4/routers/{routerId}/routes/search | Search Route Table |


<a name="searchRoutes"></a>
# **searchRoutes**
> RouteTableEntrySearchResponse searchRoutes(routerId, routeTableEntrySearchRequest)

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
import com.equinix.openapi.fabric.v4.api.RoutesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RoutesApi apiInstance = new RoutesApi(defaultClient);
    UUID routerId = UUID.randomUUID(); // UUID | Router UUID
    RouteTableEntrySearchRequest routeTableEntrySearchRequest = new RouteTableEntrySearchRequest(); // RouteTableEntrySearchRequest | 
    try {
      RouteTableEntrySearchResponse result = apiInstance.searchRoutes(routerId, routeTableEntrySearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutesApi#searchRoutes");
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

