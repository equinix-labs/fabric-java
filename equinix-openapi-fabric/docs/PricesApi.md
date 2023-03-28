# PricesApi

All URIs are relative to *https://virtserver.swaggerhub.com/equinix-api/fabric/4.6*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**searchPrices**](PricesApi.md#searchPrices) | **POST** /fabric/v4/prices/search | Get Prices |


<a name="searchPrices"></a>
# **searchPrices**
> PriceSearchResponse searchPrices(filterBody)

Get Prices

Search prices by search criteria

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.PricesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://virtserver.swaggerhub.com/equinix-api/fabric/4.6");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PricesApi apiInstance = new PricesApi(defaultClient);
    FilterBody filterBody = new FilterBody(); // FilterBody | 
    try {
      PriceSearchResponse result = apiInstance.searchPrices(filterBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PricesApi#searchPrices");
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
| **filterBody** | [**FilterBody**](FilterBody.md)|  | |

### Return type

[**PriceSearchResponse**](PriceSearchResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal server error |  -  |

