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

import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.v4.model.Error;
import com.equinix.openapi.fabric.v4.model.RouteTableEntrySearchRequest;
import com.equinix.openapi.fabric.v4.model.RouteTableEntrySearchResponse;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RoutesApi
 */
@Disabled
public class RoutesApiTest {

    private final RoutesApi api = new RoutesApi();

    /**
     * Search Route Table
     *
     * The API provides capability to get list of user&#39;s Fabric Gateways route table entries using search criteria, including optional filtering, pagination and sorting
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchRoutesTest() throws ApiException {
        UUID gatewayId = null;
        RouteTableEntrySearchRequest routeTableEntrySearchRequest = null;
        RouteTableEntrySearchResponse response = api.searchRoutes(gatewayId, routeTableEntrySearchRequest);
        // TODO: test validations
    }

}