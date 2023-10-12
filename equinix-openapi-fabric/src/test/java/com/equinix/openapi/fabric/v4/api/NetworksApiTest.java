/*
 * Equinix Fabric API v4
 * Equinix Fabric is an advanced software-defined interconnection solution that enables you to directly, securely and dynamically connect to distributed infrastructure and digital ecosystems on platform Equinix via a single port, Customers can use Fabric to connect to: </br> 1. Cloud Service Providers - Clouds, network and other service providers.  </br> 2. Enterprises - Other Equinix customers, vendors and partners.  </br> 3. Myself - Another customer instance deployed at Equinix. </br>
 *
 * The version of the OpenAPI document: 4.10
 * Contact: api-support@equinix.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.equinix.openapi.fabric.v4.api;

import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.v4.model.Error;
import com.equinix.openapi.fabric.v4.model.Network;
import com.equinix.openapi.fabric.v4.model.NetworkChange;
import com.equinix.openapi.fabric.v4.model.NetworkChangeOperation;
import com.equinix.openapi.fabric.v4.model.NetworkChangeResponse;
import com.equinix.openapi.fabric.v4.model.NetworkConnections;
import com.equinix.openapi.fabric.v4.model.NetworkPostRequest;
import com.equinix.openapi.fabric.v4.model.NetworkSearchRequest;
import com.equinix.openapi.fabric.v4.model.NetworkSearchResponse;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NetworksApi
 */
@Disabled
public class NetworksApiTest {

    private final NetworksApi api = new NetworksApi();

    /**
     * Create Network
     *
     * This API provides capability to create user&#39;s Fabric Network
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNetworkTest() throws ApiException {
        NetworkPostRequest networkPostRequest = null;
        Network response = api.createNetwork(networkPostRequest);
        // TODO: test validations
    }

    /**
     * Delete Network By ID
     *
     * This API provides capability to delete user&#39;s Fabric Network
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteNetworkByUuidTest() throws ApiException {
        UUID networkId = null;
        Network response = api.deleteNetworkByUuid(networkId);
        // TODO: test validations
    }

    /**
     * Get Connections
     *
     * The API provides capability to get list of user&#39;s Fabric Network connections
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConnectionsByNetworkUuidTest() throws ApiException {
        UUID networkId = null;
        NetworkConnections response = api.getConnectionsByNetworkUuid(networkId);
        // TODO: test validations
    }

    /**
     * Get Network By ID
     *
     * This API provides capability to retrieve user&#39;s Fabric Network
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getNetworkByUuidTest() throws ApiException {
        UUID networkId = null;
        Network response = api.getNetworkByUuid(networkId);
        // TODO: test validations
    }

    /**
     * Get Change By ID
     *
     * This API provides capability to retrieve user&#39;s Fabric Network Change
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getNetworkChangeByUuidTest() throws ApiException {
        UUID networkId = null;
        UUID changeId = null;
        NetworkChange response = api.getNetworkChangeByUuid(networkId, changeId);
        // TODO: test validations
    }

    /**
     * Get Network Changes
     *
     * The API provides capability to get list of user&#39;s Fabric Network changes
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getNetworkChangesTest() throws ApiException {
        UUID networkId = null;
        NetworkChangeResponse response = api.getNetworkChanges(networkId);
        // TODO: test validations
    }

    /**
     * Search Network
     *
     * The API provides capability to get list of user&#39;s Fabric Network using search criteria, including optional filtering, pagination and sorting
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchNetworksTest() throws ApiException {
        NetworkSearchRequest networkSearchRequest = null;
        NetworkSearchResponse response = api.searchNetworks(networkSearchRequest);
        // TODO: test validations
    }

    /**
     * Update Network By ID
     *
     * This API provides capability to update user&#39;s Fabric Network
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateNetworkByUuidTest() throws ApiException {
        UUID networkId = null;
        List<NetworkChangeOperation> networkChangeOperation = null;
        Network response = api.updateNetworkByUuid(networkId, networkChangeOperation);
        // TODO: test validations
    }

}
