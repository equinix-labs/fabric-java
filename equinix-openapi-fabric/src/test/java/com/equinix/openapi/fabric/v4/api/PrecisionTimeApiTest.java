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
import com.equinix.openapi.fabric.v4.model.PrecisionTimeChangeOperation;
import com.equinix.openapi.fabric.v4.model.PrecisionTimePackageResponse;
import com.equinix.openapi.fabric.v4.model.PrecisionTimeServiceConnectionsResponse;
import com.equinix.openapi.fabric.v4.model.PrecisionTimeServiceCreateResponse;
import com.equinix.openapi.fabric.v4.model.PrecisionTimeServicePackagesResponse;
import com.equinix.openapi.fabric.v4.model.PrecisionTimeServiceRequest;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PrecisionTimeApi
 */
@Disabled
public class PrecisionTimeApiTest {

    private final PrecisionTimeApi api = new PrecisionTimeApi();

    /**
     * Create Time Service
     *
     * The API provides capability to create timing service
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTimeServicesTest() throws ApiException {
        PrecisionTimeServiceRequest precisionTimeServiceRequest = null;
        PrecisionTimeServiceCreateResponse response = api.createTimeServices(precisionTimeServiceRequest);
        // TODO: test validations
    }

    /**
     * Delete time service
     *
     * Delete EPT service by it&#39;s uuid
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTimeServiceByIdTest() throws ApiException {
        UUID serviceId = null;
        PrecisionTimeServiceCreateResponse response = api.deleteTimeServiceById(serviceId);
        // TODO: test validations
    }

    /**
     * Get Time Service
     *
     * The API provides capability to get precision timing service&#39;s details
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTimeServicesByIdTest() throws ApiException {
        UUID serviceId = null;
        PrecisionTimeServiceCreateResponse response = api.getTimeServicesById(serviceId);
        // TODO: test validations
    }

    /**
     * Get Connection Links
     *
     * The API provides capability to get prevision timing service&#39;s details
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTimeServicesConnectionsByServiceIdTest() throws ApiException {
        UUID serviceId = null;
        PrecisionTimeServiceConnectionsResponse response = api.getTimeServicesConnectionsByServiceId(serviceId);
        // TODO: test validations
    }

    /**
     * Get Package By Code
     *
     * The API provides capability to get timing service&#39;s package by code
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTimeServicesPackageByCodeTest() throws ApiException {
        String packageCode = null;
        PrecisionTimePackageResponse response = api.getTimeServicesPackageByCode(packageCode);
        // TODO: test validations
    }

    /**
     * Get Packages
     *
     * The API provides capability to get timing service&#39;s packages
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTimeServicesPackagesTest() throws ApiException {
        PrecisionTimeServicePackagesResponse response = api.getTimeServicesPackages();
        // TODO: test validations
    }

    /**
     * Patch time service
     *
     * The API provides capability to update timing service
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTimeServicesByIdTest() throws ApiException {
        UUID serviceId = null;
        List<PrecisionTimeChangeOperation> precisionTimeChangeOperation = null;
        PrecisionTimeServiceCreateResponse response = api.updateTimeServicesById(serviceId, precisionTimeChangeOperation);
        // TODO: test validations
    }

}
