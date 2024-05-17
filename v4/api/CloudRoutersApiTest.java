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
import com.equinix.openapi.fabric.v4.model.CloudRouter;
import com.equinix.openapi.fabric.v4.model.CloudRouterActionRequest;
import com.equinix.openapi.fabric.v4.model.CloudRouterActionResponse;
import com.equinix.openapi.fabric.v4.model.CloudRouterActionState;
import com.equinix.openapi.fabric.v4.model.CloudRouterChangeOperation;
import com.equinix.openapi.fabric.v4.model.CloudRouterPackage;
import com.equinix.openapi.fabric.v4.model.CloudRouterPostRequest;
import com.equinix.openapi.fabric.v4.model.CloudRouterSearchRequest;
import com.equinix.openapi.fabric.v4.model.Error;
import com.equinix.openapi.fabric.v4.model.PackageResponse;
import com.equinix.openapi.fabric.v4.model.RouteTableEntrySearchRequest;
import com.equinix.openapi.fabric.v4.model.RouteTableEntrySearchResponse;
import com.equinix.openapi.fabric.v4.model.RouterPackageCode;
import com.equinix.openapi.fabric.v4.model.SearchResponse;
import java.util.UUID;
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
 * API tests for CloudRoutersApi
 */
@Ignore
public class CloudRoutersApiTest extends AbstractTest {

    private final CloudRoutersApi api = new CloudRoutersApi(generateToken());

    /**
     * Create Routers
     *
     * This API provides capability to create user&#39;s Cloud Routers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCloudRouterTest() throws ApiException {
        //
        //CloudRouterPostRequest cloudRouterPostRequest = null;
        //
        //CloudRouter response = api.createCloudRouter(cloudRouterPostRequest);

        // TODO: test validations
    }
    /**
     * Route table actions
     *
     * This API provides capability to refresh route table and bgp session summary information
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCloudRouterActionTest() throws ApiException {
        //
        //UUID routerId = null;
        //
        //CloudRouterActionRequest cloudRouterActionRequest = null;
        //
        //CloudRouterActionResponse response = api.createCloudRouterAction(routerId, cloudRouterActionRequest);

        // TODO: test validations
    }
    /**
     * Delete Routers
     *
     * This API provides capability to delete user&#39;s Cloud Routers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCloudRouterByUuidTest() throws ApiException {
        //
        //UUID routerId = null;
        //
        //api.deleteCloudRouterByUuid(routerId);

        // TODO: test validations
    }
    /**
     * Get actions
     *
     * This API provides capability to fetch action status
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCloudRouterActionsTest() throws ApiException {
        //
        //UUID routerId = null;
        //
        //CloudRouterActionState state = null;
        //
        //CloudRouterActionResponse response = api.getCloudRouterActions(routerId, state);

        // TODO: test validations
    }
    /**
     * Get Routers
     *
     * This API provides capability to retrieve user&#39;s Cloud Routers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCloudRouterByUuidTest() throws ApiException {
        //
        //UUID routerId = null;
        //
        //CloudRouter response = api.getCloudRouterByUuid(routerId);

        // TODO: test validations
    }
    /**
     * Get Package Details
     *
     * This API provides capability to retrieve user&#39;s Cloud Routers Package Details
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCloudRouterPackageByCodeTest() throws ApiException {
        //
        //RouterPackageCode routerPackageCode = null;
        //
        //CloudRouterPackage response = api.getCloudRouterPackageByCode(routerPackageCode);

        // TODO: test validations
    }
    /**
     * List Packages
     *
     * This API provides capability to retrieve user&#39;s Cloud Routers Packages
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCloudRouterPackagesTest() throws ApiException {
        //
        //Integer offset = null;
        //
        //Integer limit = null;
        //
        //PackageResponse response = api.getCloudRouterPackages(offset, limit);

        // TODO: test validations
    }
    /**
     * Search Route Table
     *
     * The API provides capability to get list of user&#39;s Fabric Cloud Router route table entries using search criteria, including optional filtering, pagination and sorting
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchCloudRouterRoutesTest() throws ApiException {
        //
        //UUID routerId = null;
        //
        //RouteTableEntrySearchRequest routeTableEntrySearchRequest = null;
        //
        //RouteTableEntrySearchResponse response = api.searchCloudRouterRoutes(routerId, routeTableEntrySearchRequest);

        // TODO: test validations
    }
    /**
     * Search Routers
     *
     * The API provides capability to get list of user&#39;s Cloud Routers using search criteria, including optional filtering, pagination and sorting
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchCloudRoutersTest() throws ApiException {
        //
        //CloudRouterSearchRequest cloudRouterSearchRequest = null;
        //
        //SearchResponse response = api.searchCloudRouters(cloudRouterSearchRequest);

        // TODO: test validations
    }
    /**
     * Update Routers
     *
     * This API provides capability to update user&#39;s Cloud Routers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCloudRouterByUuidTest() throws ApiException {
        //
        //UUID routerId = null;
        //
        //List<CloudRouterChangeOperation> cloudRouterChangeOperation = null;
        //
        //CloudRouter response = api.updateCloudRouterByUuid(routerId, cloudRouterChangeOperation);

        // TODO: test validations
    }
}