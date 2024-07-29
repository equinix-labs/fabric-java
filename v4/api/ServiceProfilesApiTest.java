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

import com.equinix.openapi.fabric.v4.model.JsonPatchOperation;
import com.equinix.openapi.fabric.v4.model.ServiceProfileRequest;
import com.equinix.openapi.fabric.v4.model.ServiceProfileSearchRequest;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;
import java.util.UUID;

/**
 * API tests for ServiceProfilesApi
 */
@Ignore
public class ServiceProfilesApiTest {

    private ServiceProfilesApi api;

    @Before
    public void createApi() {
        api = new TokenGenerator().generate().serviceProfiles();
    }

    /**
     * Successful Create operation
     */
    @Test
    public void shouldSee201AfterCreateServiceProfile() {
        ServiceProfileRequest serviceProfileRequest = null;
        api.createServiceProfile()
                .body(serviceProfileRequest).execute(r -> r);
        // TODO: test validations
    }

    /**
     * Successful Delete operation
     */
    @Test
    public void shouldSee200AfterDeleteServiceProfileByUuid() {
        UUID serviceProfileId = null;
        api.deleteServiceProfileByUuid()
                .serviceProfileIdPath(serviceProfileId).execute(r -> r);
        // TODO: test validations
    }

    /**
     * Successful operation
     */
    @Test
    public void shouldSee200AfterGetServiceProfileByUuid() {
        UUID serviceProfileId = null;
        String viewPoint = null;
        api.getServiceProfileByUuid()
                .serviceProfileIdPath(serviceProfileId).execute(r -> r);
        // TODO: test validations
    }

    /**
     * Successful operation
     */
    @Test
    public void shouldSee200AfterGetServiceProfileMetrosByUuid() {
        UUID serviceProfileId = null;
        Integer offset = null;
        Integer limit = null;
        api.getServiceProfileMetrosByUuid()
                .serviceProfileIdPath(serviceProfileId).execute(r -> r);
        // TODO: test validations
    }

    /**
     * Successful operation
     */
    @Test
    public void shouldSee200AfterGetServiceProfiles() {
        Integer offset = null;
        Integer limit = null;
        String viewPoint = null;
        api.getServiceProfiles().execute(r -> r);
        // TODO: test validations
    }

    /**
     * Successful Put operation
     */
    @Test
    public void shouldSee202AfterPutServiceProfileByUuid() {
        UUID serviceProfileId = null;
        String ifMatch = null;
        ServiceProfileRequest serviceProfileRequest = null;
        api.putServiceProfileByUuid()
                .serviceProfileIdPath(serviceProfileId)
                .ifMatchHeader(ifMatch)
                .body(serviceProfileRequest).execute(r -> r);
        // TODO: test validations
    }

    /**
     * Successful operation
     */
    @Test
    public void shouldSee200AfterSearchServiceProfiles() {
        ServiceProfileSearchRequest serviceProfileSearchRequest = null;
        String viewPoint = null;
        api.searchServiceProfiles()
                .body(serviceProfileSearchRequest).execute(r -> r);
        // TODO: test validations
    }

    /**
     * Successful Patch operation
     */
    @Test
    public void shouldSee200AfterUpdateServiceProfileByUuid() {
        UUID serviceProfileId = null;
        String ifMatch = null;
        List<JsonPatchOperation> jsonPatchOperation = null;
        api.updateServiceProfileByUuid()
                .serviceProfileIdPath(serviceProfileId)
                .ifMatchHeader(ifMatch)
                .body(jsonPatchOperation).execute(r -> r);
        // TODO: test validations
    }
}
