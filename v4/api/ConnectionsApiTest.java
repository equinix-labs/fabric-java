/*
 * Equinix Fabric API v4
 *
 * Contact: api-support@equinix.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.equinix.openapi.fabric.v4.api;

import com.equinix.openapi.fabric.v4.model.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

/**
 * API tests for ConnectionsApi
 */
@Ignore
public class ConnectionsApiTest {

    private ConnectionsApi api;

    @Before
    public void createApi() {
        api = new TokenGenerator().generate().connections();
    }

    /**
     * Accept Connection Request
     */
    @Test
    public void shouldSee201AfterCreateConnection() {
        ConnectionPostRequest connectionPostRequest = null;
        api.createConnection()
                .body(connectionPostRequest).execute(r -> r);
        // TODO: test validations
    }

    /**
     * Successful operation
     */
    @Test
    public void shouldSee202AfterCreateConnectionAction() {
        String connectionId = null;
        ConnectionActionRequest connectionActionRequest = null;
        api.createConnectionAction()
                .connectionIdPath(connectionId)
                .body(connectionActionRequest).execute(r -> r);
        // TODO: test validations
    }

    /**
     * Delete Connection Request
     */
    @Test
    public void shouldSee200AfterDeleteConnectionByUuid() {
        String connectionId = null;
        api.deleteConnectionByUuid()
                .connectionIdPath(connectionId).execute(r -> r);
        // TODO: test validations
    }

    /**
     * Successful operation
     */
    @Test
    public void shouldSee200AfterGetConnectionByUuid() {
        String connectionId = null;
        ConnectionDirection direction = null;
        api.getConnectionByUuid()
                .connectionIdPath(connectionId).execute(r -> r);
        // TODO: test validations
    }

    /**
     * Successful operation
     */
    @Test
    public void shouldSee200AfterSearchConnections() {
        SearchRequest searchRequest = null;
        api.searchConnections()
                .body(searchRequest).execute(r -> r);
        // TODO: test validations
    }

    /**
     * Successful operation
     */
    @Test
    public void shouldSee202AfterUpdateConnectionByUuid() {
        String connectionId = null;
        List<ConnectionChangeOperation> connectionChangeOperation = null;
        api.updateConnectionByUuid()
                .connectionIdPath(connectionId)
                .body(connectionChangeOperation).execute(r -> r);
        // TODO: test validations
    }

    /**
     * Successful operation
     */
    @Test
    public void shouldSee200AfterValidateConnections() {
        ValidateRequest validateRequest = null;
        api.validateConnections()
                .body(validateRequest).execute(r -> r);
        // TODO: test validations
    }
}
