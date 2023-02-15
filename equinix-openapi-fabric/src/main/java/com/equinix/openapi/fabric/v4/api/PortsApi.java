/*
 * Equinix Fabric API v4
 * Equinix Fabric is an advanced software-defined interconnection solution that enables you to directly, securely and dynamically connect to distributed infrastructure and digital ecosystems on platform Equinix via a single port, Customers can use Fabric to connect to: </br> 1. Cloud Service Providers - Clouds, network and other service providers.  </br> 2. Enterprises - Other Equinix customers, vendors and partners.  </br> 3. Myself - Another customer instance deployed at Equinix. </br>
 *
 * The version of the OpenAPI document: 4.4
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


import com.equinix.openapi.fabric.v4.model.AllPortsResponse;
import com.equinix.openapi.fabric.v4.model.Error;
import com.equinix.openapi.fabric.v4.model.Port;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class PortsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PortsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PortsApi(ApiClient apiClient) {
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
     * Build call for createPort
     * @param port  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful operation for COLO Single Port Non Lag </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createPortCall(Port port, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = port;

        // create path and map variables
        String localVarPath = "/fabric/v4/ports";

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
    private okhttp3.Call createPortValidateBeforeCall(Port port, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'port' is set
        if (port == null) {
            throw new ApiException("Missing the required parameter 'port' when calling createPort(Async)");
        }

        return createPortCall(port, _callback);

    }

    /**
     * Create Port
     * Create Port creates Equinix Fabric™ Port.&lt;font color&#x3D;\&quot;red\&quot;&gt; &lt;sup color&#x3D;&#39;red&#39;&gt;Preview&lt;/sup&gt;&lt;/font&gt;
     * @param port  (required)
     * @return AllPortsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful operation for COLO Single Port Non Lag </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public AllPortsResponse createPort(Port port) throws ApiException {
        ApiResponse<AllPortsResponse> localVarResp = createPortWithHttpInfo(port);
        return localVarResp.getData();
    }

    /**
     * Create Port
     * Create Port creates Equinix Fabric™ Port.&lt;font color&#x3D;\&quot;red\&quot;&gt; &lt;sup color&#x3D;&#39;red&#39;&gt;Preview&lt;/sup&gt;&lt;/font&gt;
     * @param port  (required)
     * @return ApiResponse&lt;AllPortsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful operation for COLO Single Port Non Lag </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AllPortsResponse> createPortWithHttpInfo(Port port) throws ApiException {
        okhttp3.Call localVarCall = createPortValidateBeforeCall(port, null);
        Type localVarReturnType = new TypeToken<AllPortsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Port (asynchronously)
     * Create Port creates Equinix Fabric™ Port.&lt;font color&#x3D;\&quot;red\&quot;&gt; &lt;sup color&#x3D;&#39;red&#39;&gt;Preview&lt;/sup&gt;&lt;/font&gt;
     * @param port  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful operation for COLO Single Port Non Lag </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createPortAsync(Port port, final ApiCallback<AllPortsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createPortValidateBeforeCall(port, _callback);
        Type localVarReturnType = new TypeToken<AllPortsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPortByUuid
     * @param portId Port UUID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPortByUuidCall(UUID portId, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fabric/v4/ports/{portId}"
            .replace("{" + "portId" + "}", localVarApiClient.escapeString(portId.toString()));

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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPortByUuidValidateBeforeCall(UUID portId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'portId' is set
        if (portId == null) {
            throw new ApiException("Missing the required parameter 'portId' when calling getPortByUuid(Async)");
        }

        return getPortByUuidCall(portId, _callback);

    }

    /**
     * Get Port by uuid
     * Get Port By uuid returns details of assigned and available Equinix Fabric port for the specified user credentials. The metro code attribute in the response shows the origin of the proposed connection.
     * @param portId Port UUID (required)
     * @return Port
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public Port getPortByUuid(UUID portId) throws ApiException {
        ApiResponse<Port> localVarResp = getPortByUuidWithHttpInfo(portId);
        return localVarResp.getData();
    }

    /**
     * Get Port by uuid
     * Get Port By uuid returns details of assigned and available Equinix Fabric port for the specified user credentials. The metro code attribute in the response shows the origin of the proposed connection.
     * @param portId Port UUID (required)
     * @return ApiResponse&lt;Port&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Port> getPortByUuidWithHttpInfo(UUID portId) throws ApiException {
        okhttp3.Call localVarCall = getPortByUuidValidateBeforeCall(portId, null);
        Type localVarReturnType = new TypeToken<Port>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Port by uuid (asynchronously)
     * Get Port By uuid returns details of assigned and available Equinix Fabric port for the specified user credentials. The metro code attribute in the response shows the origin of the proposed connection.
     * @param portId Port UUID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPortByUuidAsync(UUID portId, final ApiCallback<Port> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPortByUuidValidateBeforeCall(portId, _callback);
        Type localVarReturnType = new TypeToken<Port>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPorts
     * @param name port name to be provided if specific port(s) to be retrieved (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPortsCall(String name, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fabric/v4/ports";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (name != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("name", name));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPortsValidateBeforeCall(String name, final ApiCallback _callback) throws ApiException {
        return getPortsCall(name, _callback);

    }

    /**
     * Get All Ports
     * Get All Ports returns details of all assigned and available ports for the specified user credentials. The metro attribute in the response shows the origin of the proposed connection.
     * @param name port name to be provided if specific port(s) to be retrieved (optional)
     * @return AllPortsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public AllPortsResponse getPorts(String name) throws ApiException {
        ApiResponse<AllPortsResponse> localVarResp = getPortsWithHttpInfo(name);
        return localVarResp.getData();
    }

    /**
     * Get All Ports
     * Get All Ports returns details of all assigned and available ports for the specified user credentials. The metro attribute in the response shows the origin of the proposed connection.
     * @param name port name to be provided if specific port(s) to be retrieved (optional)
     * @return ApiResponse&lt;AllPortsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AllPortsResponse> getPortsWithHttpInfo(String name) throws ApiException {
        okhttp3.Call localVarCall = getPortsValidateBeforeCall(name, null);
        Type localVarReturnType = new TypeToken<AllPortsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get All Ports (asynchronously)
     * Get All Ports returns details of all assigned and available ports for the specified user credentials. The metro attribute in the response shows the origin of the proposed connection.
     * @param name port name to be provided if specific port(s) to be retrieved (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPortsAsync(String name, final ApiCallback<AllPortsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPortsValidateBeforeCall(name, _callback);
        Type localVarReturnType = new TypeToken<AllPortsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}