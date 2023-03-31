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

import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.v4.model.BGPActionData;
import com.equinix.openapi.fabric.v4.model.BGPActionRequest;
import com.equinix.openapi.fabric.v4.model.BGPActionsBulkData;
import com.equinix.openapi.fabric.v4.model.ConnectionChangeOperation;
import com.equinix.openapi.fabric.v4.model.ConnectionRoutingProtocolPostRequest;
import com.equinix.openapi.fabric.v4.model.Error;
import com.equinix.openapi.fabric.v4.model.GetResponse;
import com.equinix.openapi.fabric.v4.model.RoutingProtocolBase;
import com.equinix.openapi.fabric.v4.model.RoutingProtocolChangeData;
import com.equinix.openapi.fabric.v4.model.RoutingProtocolChangeDataResponse;
import com.equinix.openapi.fabric.v4.model.RoutingProtocolData;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RoutingProtocolsApi
 */
@Disabled
public class RoutingProtocolsApiTest {

    private final RoutingProtocolsApi api = new RoutingProtocolsApi();

    /**
     * Create Protocol
     *
     * This API provides capability to create Routing Protocol for connections
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createConnectionRoutingProtocolTest() throws ApiException {
        String connectionId = null;
        RoutingProtocolBase routingProtocolBase = null;
        RoutingProtocolData response = api.createConnectionRoutingProtocol(connectionId, routingProtocolBase);
        // TODO: test validations
    }

    /**
     * Bulk Create Protocol
     *
     * This API provides capability to create Routing Protocol for connections
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createConnectionRoutingProtocolsInBulkTest() throws ApiException {
        String connectionId = null;
        ConnectionRoutingProtocolPostRequest connectionRoutingProtocolPostRequest = null;
        GetResponse response = api.createConnectionRoutingProtocolsInBulk(connectionId, connectionRoutingProtocolPostRequest);
        // TODO: test validations
    }

    /**
     * Delete Protocol
     *
     * This API provides capability to delete Routing Protocols on virtual connection
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteConnectionRoutingProtocolByUuidTest() throws ApiException {
        UUID routingProtocolId = null;
        String connectionId = null;
        RoutingProtocolData response = api.deleteConnectionRoutingProtocolByUuid(routingProtocolId, connectionId);
        // TODO: test validations
    }

    /**
     * Get BGP Actions
     *
     * This API provides capability to get all BGP actions status
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConnectionRoutingProtocolAllBgpActionsTest() throws ApiException {
        UUID routingProtocolId = null;
        String connectionId = null;
        Integer offset = null;
        Integer limit = null;
        BGPActionsBulkData response = api.getConnectionRoutingProtocolAllBgpActions(routingProtocolId, connectionId, offset, limit);
        // TODO: test validations
    }

    /**
     * Get Protocol
     *
     * This API provides capability to accept/reject user&#39;s virtual connection
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConnectionRoutingProtocolByUuidTest() throws ApiException {
        UUID routingProtocolId = null;
        String connectionId = null;
        RoutingProtocolData response = api.getConnectionRoutingProtocolByUuid(routingProtocolId, connectionId);
        // TODO: test validations
    }

    /**
     * GetRoutingProtocols
     *
     * This API provides capability to get Routing Protocols for connections
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConnectionRoutingProtocolsTest() throws ApiException {
        String connectionId = null;
        Integer offset = null;
        Integer limit = null;
        GetResponse response = api.getConnectionRoutingProtocols(connectionId, offset, limit);
        // TODO: test validations
    }

    /**
     * Get BGP Action
     *
     * This API provides capability to retrieve specific BGP action
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConnectionRoutingProtocolsBgpActionByUuidTest() throws ApiException {
        String connectionId = null;
        UUID routingProtocolId = null;
        UUID actionId = null;
        BGPActionData response = api.getConnectionRoutingProtocolsBgpActionByUuid(connectionId, routingProtocolId, actionId);
        // TODO: test validations
    }

    /**
     * Get Change By ID
     *
     * This API provides capability to retrieve specific Routing Protocol Change
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConnectionRoutingProtocolsChangeByUuidTest() throws ApiException {
        String connectionId = null;
        UUID routingProtocolId = null;
        UUID changeId = null;
        RoutingProtocolChangeData response = api.getConnectionRoutingProtocolsChangeByUuid(connectionId, routingProtocolId, changeId);
        // TODO: test validations
    }

    /**
     * Get Changes
     *
     * This API provides capability to retrieve user&#39;s Routing Protocol Changes
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConnectionRoutingProtocolsChangesTest() throws ApiException {
        String connectionId = null;
        UUID routingProtocolId = null;
        Integer offset = null;
        Integer limit = null;
        RoutingProtocolChangeDataResponse response = api.getConnectionRoutingProtocolsChanges(connectionId, routingProtocolId, offset, limit);
        // TODO: test validations
    }

    /**
     * Patch Protocol
     *
     * This API provides capability to partially update Routing Protocols on a virtual connection
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void patchConnectionRoutingProtocolByUuidTest() throws ApiException {
        UUID routingProtocolId = null;
        String connectionId = null;
        List<ConnectionChangeOperation> connectionChangeOperation = null;
        RoutingProtocolData response = api.patchConnectionRoutingProtocolByUuid(routingProtocolId, connectionId, connectionChangeOperation);
        // TODO: test validations
    }

    /**
     * Clear/Reset BGP
     *
     * This API provides capability to clear/reset Routing Protocols BGP session
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postConnectionRoutingProtocolBgpActionByUuidTest() throws ApiException {
        UUID routingProtocolId = null;
        String connectionId = null;
        BGPActionRequest bgPActionRequest = null;
        BGPActionData response = api.postConnectionRoutingProtocolBgpActionByUuid(routingProtocolId, connectionId, bgPActionRequest);
        // TODO: test validations
    }

    /**
     * Replace Protocol
     *
     * This API provides capability to replace complete Routing Protocols on a virtual connection
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void replaceConnectionRoutingProtocolByUuidTest() throws ApiException {
        UUID routingProtocolId = null;
        String connectionId = null;
        RoutingProtocolBase routingProtocolBase = null;
        RoutingProtocolData response = api.replaceConnectionRoutingProtocolByUuid(routingProtocolId, connectionId, routingProtocolBase);
        // TODO: test validations
    }

}
