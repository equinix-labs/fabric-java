/*
 * Equinix Fabric API v4
 * Equinix Fabric is an advanced software-defined interconnection solution that enables you to directly, securely and dynamically connect to distributed infrastructure and digital ecosystems on platform Equinix via a single port, Customers can use Fabric to connect to: </br> 1. Cloud Service Providers - Clouds, network and other service providers.  </br> 2. Enterprises - Other Equinix customers, vendors and partners.  </br> 3. Myself - Another customer instance deployed at Equinix. </br>
 *
 * The version of the OpenAPI document: 4.6
 * Contact: api-support@equinix.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.equinix.openapi.fabric.v4.api;

import com.equinix.openapi.fabric.ApiCallback;
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.ApiResponse;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.Pair;
import com.equinix.openapi.fabric.ProgressRequestBody;
import com.equinix.openapi.fabric.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.equinix.openapi.fabric.v4.model.Error;
import com.equinix.openapi.fabric.v4.model.RouteTableEntrySearchRequest;
import com.equinix.openapi.fabric.v4.model.RouteTableEntrySearchResponse;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class RoutesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public RoutesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RoutesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for searchRoutes
     * @param gatewayId Gateway UUID (required)
     * @param routeTableEntrySearchRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Internal server error </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchRoutesCall(UUID gatewayId, RouteTableEntrySearchRequest routeTableEntrySearchRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = routeTableEntrySearchRequest;

        // create path and map variables
        String localVarPath = "/fabric/v4/gateways/{gatewayId}/routes/search"
            .replace("{" + "gatewayId" + "}", localVarApiClient.escapeString(gatewayId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call searchRoutesValidateBeforeCall(UUID gatewayId, RouteTableEntrySearchRequest routeTableEntrySearchRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'gatewayId' is set
        if (gatewayId == null) {
            throw new ApiException("Missing the required parameter 'gatewayId' when calling searchRoutes(Async)");
        }

        // verify the required parameter 'routeTableEntrySearchRequest' is set
        if (routeTableEntrySearchRequest == null) {
            throw new ApiException("Missing the required parameter 'routeTableEntrySearchRequest' when calling searchRoutes(Async)");
        }

        return searchRoutesCall(gatewayId, routeTableEntrySearchRequest, _callback);

    }

    /**
     * Search Route Table
     * The API provides capability to get list of user&#39;s Fabric Gateways route table entries using search criteria, including optional filtering, pagination and sorting
     * @param gatewayId Gateway UUID (required)
     * @param routeTableEntrySearchRequest  (required)
     * @return RouteTableEntrySearchResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Internal server error </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public RouteTableEntrySearchResponse searchRoutes(UUID gatewayId, RouteTableEntrySearchRequest routeTableEntrySearchRequest) throws ApiException {
        ApiResponse<RouteTableEntrySearchResponse> localVarResp = searchRoutesWithHttpInfo(gatewayId, routeTableEntrySearchRequest);
        return localVarResp.getData();
    }

    /**
     * Search Route Table
     * The API provides capability to get list of user&#39;s Fabric Gateways route table entries using search criteria, including optional filtering, pagination and sorting
     * @param gatewayId Gateway UUID (required)
     * @param routeTableEntrySearchRequest  (required)
     * @return ApiResponse&lt;RouteTableEntrySearchResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Internal server error </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<RouteTableEntrySearchResponse> searchRoutesWithHttpInfo(UUID gatewayId, RouteTableEntrySearchRequest routeTableEntrySearchRequest) throws ApiException {
        okhttp3.Call localVarCall = searchRoutesValidateBeforeCall(gatewayId, routeTableEntrySearchRequest, null);
        Type localVarReturnType = new TypeToken<RouteTableEntrySearchResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Search Route Table (asynchronously)
     * The API provides capability to get list of user&#39;s Fabric Gateways route table entries using search criteria, including optional filtering, pagination and sorting
     * @param gatewayId Gateway UUID (required)
     * @param routeTableEntrySearchRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Internal server error </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchRoutesAsync(UUID gatewayId, RouteTableEntrySearchRequest routeTableEntrySearchRequest, final ApiCallback<RouteTableEntrySearchResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchRoutesValidateBeforeCall(gatewayId, routeTableEntrySearchRequest, _callback);
        Type localVarReturnType = new TypeToken<RouteTableEntrySearchResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
