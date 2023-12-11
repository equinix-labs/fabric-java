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
import com.equinix.openapi.fabric.v4.model.ConnectionChangeOperation;
import com.equinix.openapi.fabric.v4.model.ConnectionRouteFilterData;
import com.equinix.openapi.fabric.v4.model.ConnectionRouteFiltersBase;
import com.equinix.openapi.fabric.v4.model.Error;
import com.equinix.openapi.fabric.v4.model.GetAllConnectionRouteFiltersResponse;
import com.equinix.openapi.fabric.v4.model.GetRouteFilterGetConnectionsResponse;
import com.equinix.openapi.fabric.v4.model.RouteFilterChangeData;
import com.equinix.openapi.fabric.v4.model.RouteFilterChangeDataResponse;
import com.equinix.openapi.fabric.v4.model.RouteFiltersBase;
import com.equinix.openapi.fabric.v4.model.RouteFiltersData;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RouteFiltersApi
 */
@Disabled
public class RouteFiltersApiTest {

    private final RouteFiltersApi api = new RouteFiltersApi();

    /**
     * Attach Route Filter
     *
     * This API provides capability to attach a Route Filter to a Connection
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void attachConnectionRouteFilterTest() throws ApiException {
        String routeFilterId = null;
        String connectionId = null;
        ConnectionRouteFiltersBase connectionRouteFiltersBase = null;
        ConnectionRouteFilterData response = api.attachConnectionRouteFilter(routeFilterId, connectionId, connectionRouteFiltersBase);
        // TODO: test validations
    }

    /**
     * Create Route Filters
     *
     * This API provides capability to create a Route Filter
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createRouteFilterTest() throws ApiException {
        RouteFiltersBase routeFiltersBase = null;
        RouteFiltersData response = api.createRouteFilter(routeFiltersBase);
        // TODO: test validations
    }

    /**
     * Delete Route Filter
     *
     * This API provides capability to delete a Route Filter
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteRouteFilterByUuidTest() throws ApiException {
        String routeFilterId = null;
        RouteFiltersData response = api.deleteRouteFilterByUuid(routeFilterId);
        // TODO: test validations
    }

    /**
     * Detach Route Filter
     *
     * This API provides capability to detach a Route Filter from a Connection
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void detachConnectionRouteFilterTest() throws ApiException {
        String routeFilterId = null;
        String connectionId = null;
        ConnectionRouteFilterData response = api.detachConnectionRouteFilter(routeFilterId, connectionId);
        // TODO: test validations
    }

    /**
     * Get Route Filter
     *
     * This API provides capability to view a specific Route Filter attached to a Connection
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConnectionRouteFilterByUuidTest() throws ApiException {
        String routeFilterId = null;
        String connectionId = null;
        ConnectionRouteFilterData response = api.getConnectionRouteFilterByUuid(routeFilterId, connectionId);
        // TODO: test validations
    }

    /**
     * Get All RouteFilters
     *
     * This API provides capability to view all Route Filters attached to a Connection
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConnectionRouteFiltersTest() throws ApiException {
        String connectionId = null;
        GetAllConnectionRouteFiltersResponse response = api.getConnectionRouteFilters(connectionId);
        // TODO: test validations
    }

    /**
     * Get Filter By UUID
     *
     * This API provides capability to view a Route Filter by UUID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRouteFilterByUuidTest() throws ApiException {
        String routeFilterId = null;
        RouteFiltersData response = api.getRouteFilterByUuid(routeFilterId);
        // TODO: test validations
    }

    /**
     * Get Change By ID
     *
     * This API provides capability to retrieve a specific Route Filter&#39;s Changes
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRouteFilterChangeByUuidTest() throws ApiException {
        String routeFilterId = null;
        UUID changeId = null;
        RouteFilterChangeData response = api.getRouteFilterChangeByUuid(routeFilterId, changeId);
        // TODO: test validations
    }

    /**
     * Get All Changes
     *
     * This API provides capability to retrieve all of a Route Filter&#39;s Changes
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRouteFilterChangesTest() throws ApiException {
        String routeFilterId = null;
        Integer offset = null;
        Integer limit = null;
        RouteFilterChangeDataResponse response = api.getRouteFilterChanges(routeFilterId, offset, limit);
        // TODO: test validations
    }

    /**
     * Get Connections
     *
     * This API provides capability to view all Connections using the Route Filter
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRouteFilterConnectionsTest() throws ApiException {
        String routeFilterId = null;
        GetRouteFilterGetConnectionsResponse response = api.getRouteFilterConnections(routeFilterId);
        // TODO: test validations
    }

    /**
     * Patch Route Filter
     *
     * This API provides capability to partially update a Route Filter
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void patchRouteFilterByUuidTest() throws ApiException {
        String routeFilterId = null;
        List<ConnectionChangeOperation> connectionChangeOperation = null;
        RouteFiltersData response = api.patchRouteFilterByUuid(routeFilterId, connectionChangeOperation);
        // TODO: test validations
    }

    /**
     * Replace Route Filter
     *
     * This API provides capability to replace a Route Filter completely
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void replaceRouteFilterByUuidTest() throws ApiException {
        String routeFilterId = null;
        RouteFiltersBase routeFiltersBase = null;
        RouteFiltersData response = api.replaceRouteFilterByUuid(routeFilterId, routeFiltersBase);
        // TODO: test validations
    }

}
