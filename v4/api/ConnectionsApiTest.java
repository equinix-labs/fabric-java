/*
 * Equinix Fabric API v4
 * Equinix Fabric is an advanced software-defined interconnection solution that enables you to directly, securely and dynamically connect to distributed infrastructure and digital ecosystems on platform Equinix via a single port, Customers can use Fabric to connect to: </br> 1. Cloud Service Providers - Clouds, network and other service providers.  </br> 2. Enterprises - Other Equinix customers, vendors and partners.  </br> 3. Myself - Another customer instance deployed at Equinix. </br>
 *
 * Contact: api-support@equinix.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.equinix.openapi.fabric.v4.api;

import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.v4.model.Connection;
import com.equinix.openapi.fabric.v4.model.ConnectionAction;
import com.equinix.openapi.fabric.v4.model.ConnectionActionRequest;
import com.equinix.openapi.fabric.v4.model.ConnectionChangeOperation;
import com.equinix.openapi.fabric.v4.model.ConnectionDirection;
import com.equinix.openapi.fabric.v4.model.ConnectionPostRequest;
import com.equinix.openapi.fabric.v4.model.ConnectionResponse;
import com.equinix.openapi.fabric.v4.model.ConnectionSearchResponse;
import com.equinix.openapi.fabric.v4.model.Error;
import com.equinix.openapi.fabric.v4.model.SearchRequest;
import com.equinix.openapi.fabric.v4.model.ValidateRequest;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConnectionsApi
 */
@Ignore
public class ConnectionsApiTest extends AbstractTest {

    private final ConnectionsApi api = new ConnectionsApi(generateToken());

    /**
     * Create Connection
     *
     * This API provides capability to create user&#39;s virtual connection
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createConnectionTest() throws ApiException {
        //
        //ConnectionPostRequest connectionPostRequest = null;
        //
        //Connection response = api.createConnection(connectionPostRequest);

        // TODO: test validations
    }
    /**
     * Connection Actions
     *
     * This API provides capability to accept/reject user&#39;s virtual connection
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createConnectionActionTest() throws ApiException {
        //
        //String connectionId = null;
        //
        //ConnectionActionRequest connectionActionRequest = null;
        //
        //ConnectionAction response = api.createConnectionAction(connectionId, connectionActionRequest);

        // TODO: test validations
    }
    /**
     * Delete by ID
     *
     * Delete Connection by ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteConnectionByUuidTest() throws ApiException {
        //
        //String connectionId = null;
        //
        //Connection response = api.deleteConnectionByUuid(connectionId);

        // TODO: test validations
    }
    /**
     * Get Connection by ID
     *
     * The API provides capability to get user&#39;s virtual connection details (Service Tokens, Access Points, Link Protocols, etc) by it&#39;s connection ID (UUID)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConnectionByUuidTest() throws ApiException {
        //
        //String connectionId = null;
        //
        //ConnectionDirection direction = null;
        //
        //Connection response = api.getConnectionByUuid(connectionId, direction);

        // TODO: test validations
    }
    /**
     * Search connections
     *
     * The API provides capability to get list of user&#39;s virtual connections using search criteria, including optional filtering, pagination and sorting
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchConnectionsTest() throws ApiException {
        //
        //SearchRequest searchRequest = null;
        //
        //ConnectionSearchResponse response = api.searchConnections(searchRequest);

        // TODO: test validations
    }
    /**
     * Update by ID
     *
     * Update Connection by ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateConnectionByUuidTest() throws ApiException {
        //
        //String connectionId = null;
        //
        //List<ConnectionChangeOperation> connectionChangeOperation = null;
        //
        //Connection response = api.updateConnectionByUuid(connectionId, connectionChangeOperation);

        // TODO: test validations
    }
    /**
     * Validate Connection
     *
     * This API provides capability to validate by auth key
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateConnectionsTest() throws ApiException {
        //
        //ValidateRequest validateRequest = null;
        //
        //ConnectionResponse response = api.validateConnections(validateRequest);

        // TODO: test validations
    }
}
