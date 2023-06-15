# RoutesApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**searchRoutes**](RoutesApi.md#searchRoutes) | **POST** /fabric/v4/gateways/{gatewayId}/routes/search | Search Route Table |


<a name="searchRoutes"></a>
# **searchRoutes**
> RouteTableEntrySearchResponse searchRoutes(gatewayId, routeTableEntrySearchRequest)

Search Route Table

The API provides capability to get list of user&#39;s Fabric Gateways route table entries using search criteria, including optional filtering, pagination and sorting

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.RoutesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    RoutesApi apiInstance = new RoutesApi(defaultClient);
    UUID gatewayId = UUID.randomUUID(); // UUID | Gateway UUID
    RouteTableEntrySearchRequest routeTableEntrySearchRequest = new RouteTableEntrySearchRequest(); // RouteTableEntrySearchRequest | 
    try {
      RouteTableEntrySearchResponse result = apiInstance.searchRoutes(gatewayId, routeTableEntrySearchRequest);
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
| **gatewayId** | **UUID**| Gateway UUID | |
| **routeTableEntrySearchRequest** | [**RouteTableEntrySearchRequest**](RouteTableEntrySearchRequest.md)|  | |

### Return type

[**RouteTableEntrySearchResponse**](RouteTableEntrySearchResponse.md)

### Authorization

No authorization required

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

