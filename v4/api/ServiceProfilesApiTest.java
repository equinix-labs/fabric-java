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
import com.equinix.openapi.fabric.v4.model.Error;
import com.equinix.openapi.fabric.v4.model.JsonPatchOperation;
import com.equinix.openapi.fabric.v4.model.ServiceMetros;
import com.equinix.openapi.fabric.v4.model.ServiceProfile;
import com.equinix.openapi.fabric.v4.model.ServiceProfileRequest;
import com.equinix.openapi.fabric.v4.model.ServiceProfileSearchRequest;
import com.equinix.openapi.fabric.v4.model.ServiceProfiles;
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
 * API tests for ServiceProfilesApi
 */
@Ignore
public class ServiceProfilesApiTest extends AbstractTest{

    private final ServiceProfilesApi api = new ServiceProfilesApi(generateToken());

    /**
     * Create Profile
     *
     * Create Service Profile creates Equinix Fabric? Service Profile.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createServiceProfileTest() throws ApiException {
        //
        //ServiceProfileRequest serviceProfileRequest = null;
        //
        //ServiceProfile response = api.createServiceProfile(serviceProfileRequest);

        // TODO: test validations
    }
    /**
     * Delete Profile
     *
     * delete Service Profile by UUID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteServiceProfileByUuidTest() throws ApiException {
        //
        //UUID serviceProfileId = null;
        //
        //ServiceProfile response = api.deleteServiceProfileByUuid(serviceProfileId);

        // TODO: test validations
    }
    /**
     * Get Profile
     *
     * Get service profile by UUID. View Point parameter if set to zSide will give seller&#39;s view of the profile otherwise buyer&#39;s view.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getServiceProfileByUuidTest() throws ApiException {
        //
        //UUID serviceProfileId = null;
        //
        //String viewPoint = null;
        //
        //ServiceProfile response = api.getServiceProfileByUuid(serviceProfileId, viewPoint);

        // TODO: test validations
    }
    /**
     * Get Profile Metros
     *
     * Get service profile metros by UUID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getServiceProfileMetrosByUuidTest() throws ApiException {
        //
        //UUID serviceProfileId = null;
        //
        //Integer offset = null;
        //
        //Integer limit = null;
        //
        //ServiceMetros response = api.getServiceProfileMetrosByUuid(serviceProfileId, offset, limit);

        // TODO: test validations
    }
    /**
     * Get all Profiles
     *
     * The API request returns all Equinix Fabric Service Profiles in accordance with the view point requested.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getServiceProfilesTest() throws ApiException {
        //
        //Integer offset = null;
        //
        //Integer limit = null;
        //
        //String viewPoint = null;
        //
        //ServiceProfiles response = api.getServiceProfiles(offset, limit, viewPoint);

        // TODO: test validations
    }
    /**
     * Replace Profile
     *
     * This API request replaces a service profile definition
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putServiceProfileByUuidTest() throws ApiException {
        //
        //UUID serviceProfileId = null;
        //
        //String ifMatch = null;
        //
        //ServiceProfileRequest serviceProfileRequest = null;
        //
        //ServiceProfile response = api.putServiceProfileByUuid(serviceProfileId, ifMatch, serviceProfileRequest);

        // TODO: test validations
    }
    /**
     * Profile Search
     *
     * Search service profiles by search criteria
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchServiceProfilesTest() throws ApiException {
        //
        //ServiceProfileSearchRequest serviceProfileSearchRequest = null;
        //
        //String viewPoint = null;
        //
        //ServiceProfiles response = api.searchServiceProfiles(serviceProfileSearchRequest, viewPoint);

        // TODO: test validations
    }
    /**
     * Update Profile
     *
     * Update Service Profile by UUID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateServiceProfileByUuidTest() throws ApiException {
        //
        //UUID serviceProfileId = null;
        //
        //String ifMatch = null;
        //
        //List<JsonPatchOperation> jsonPatchOperation = null;
        //
        //ServiceProfile response = api.updateServiceProfileByUuid(serviceProfileId, ifMatch, jsonPatchOperation);

        // TODO: test validations
    }
}