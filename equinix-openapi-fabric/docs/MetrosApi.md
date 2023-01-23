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
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.MetrosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    MetrosApi apiInstance = new MetrosApi(defaultClient);
    String metroCode = "metroCode_example"; // String | Metro Code
    try {
      Metro result = apiInstance.getMetroByCode(metroCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetrosApi#getMetroByCode");
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
| **metroCode** | **String**| Metro Code | |

### Return type

[**Metro**](Metro.md)

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
| **500** | Internal Server Error |  -  |

<a name="getMetros"></a>
# **getMetros**
> MetroResponse getMetros(presence, offset, limit)

Get all Metros

GET All Subscriber Metros with an option query parameter to return all Equinix Fabric metros in which the customer has a presence, as well as latency data for each location.

### Example
```java
// Import classes:
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.auth.*;
import com.equinix.openapi.fabric.models.*;
import com.equinix.openapi.fabric.v4.api.MetrosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    MetrosApi apiInstance = new MetrosApi(defaultClient);
    Presence presence = Presence.fromValue("MY_PORTS"); // Presence | User On Boarded Metros based on Fabric resource availability
    Integer offset = 56; // Integer | offset
    Integer limit = 56; // Integer | number of records to fetch
    try {
      MetroResponse result = apiInstance.getMetros(presence, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetrosApi#getMetros");
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **500** | Internal Server Error |  -  |

