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

import com.equinix.openapi.fabric.v4.model.PrecisionTimeChangeOperation;
import com.equinix.openapi.fabric.v4.model.PrecisionTimeServiceRequest;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;
import java.util.UUID;

/**
 * API tests for PrecisionTimeApi
 */
@Ignore
public class PrecisionTimeApiTest {

    private PrecisionTimeApi api = TokenGenerator.getApiClient().precisionTime();

    /**
     * Successful operation
     */
    @Test
    public void shouldSee202AfterCreateTimeServices() {
        PrecisionTimeServiceRequest precisionTimeServiceRequest = null;
        api.createTimeServices()
                .body(precisionTimeServiceRequest).execute(r -> r);
        // TODO: test validations
    }

    /**
     * Successful operation
     */
    @Test
    public void shouldSee202AfterDeleteTimeServiceById() {
        UUID serviceId = null;
        api.deleteTimeServiceById()
                .serviceIdPath(serviceId).execute(r -> r);
        // TODO: test validations
    }

    /**
     * Successful operation
     */
    @Test
    public void shouldSee200AfterGetTimeServicesById() {
        UUID serviceId = null;
        api.getTimeServicesById()
                .serviceIdPath(serviceId).execute(r -> r);
        // TODO: test validations
    }

    /**
     * Return Time Service Connection
     */
    @Test
    public void shouldSee200AfterGetTimeServicesConnectionsByServiceId() {
        UUID serviceId = null;
        api.getTimeServicesConnectionsByServiceId()
                .serviceIdPath(serviceId).execute(r -> r);
        // TODO: test validations
    }

    /**
     * Successful operation
     */
    @Test
    public void shouldSee200AfterGetTimeServicesPackageByCode() {
        String packageCode = null;
        api.getTimeServicesPackageByCode()
                .packageCodePath(packageCode).execute(r -> r);
        // TODO: test validations
    }

    /**
     * Successful operation
     */
    @Test
    public void shouldSee200AfterGetTimeServicesPackages() {
        api.getTimeServicesPackages().execute(r -> r);
        // TODO: test validations
    }

    /**
     * Successful operation
     */
    @Test
    public void shouldSee202AfterUpdateTimeServicesById() {
        UUID serviceId = null;
        List<PrecisionTimeChangeOperation> precisionTimeChangeOperation = null;
        api.updateTimeServicesById()
                .serviceIdPath(serviceId)
                .body(precisionTimeChangeOperation).execute(r -> r);
        // TODO: test validations
    }
}
