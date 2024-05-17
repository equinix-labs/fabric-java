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
import com.equinix.openapi.fabric.v4.model.Metro;
import com.equinix.openapi.fabric.v4.model.MetroResponse;
import com.equinix.openapi.fabric.v4.model.Presence;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * API tests for MetrosApi
 */
public class MetrosApiTest extends AbstractTest {
    private final MetrosApi api = new MetrosApi(generateToken());
    private final String metroCode = "DC";

    /**
     * Get Metro by Code
     * <p>
     * GET Metros retrieves all Equinix Fabric metros, as well as latency data between each metro location. .
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMetroByCodeTest() throws ApiException {
        Metro response = api.getMetroByCode(metroCode);
        assertEquals(200, api.getApiClient().getStatusCode());
        assertEquals(metroCode, response.getCode());
    }

    /**
     * Get all Metros
     * <p>
     * GET All Subscriber Metros with an option query parameter to return all Equinix Fabric metros in which the customer has a presence, as well as latency data for each location.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMetrosTest() throws ApiException {
        MetroResponse response = api.getMetros(Presence.MY_PORTS, 1, 10);
        assertEquals(200, api.getApiClient().getStatusCode());

        boolean metroFound = response.getData()
                .stream().anyMatch(metro -> metro.getCode().equals(metroCode));

        assertTrue(metroFound);
    }
}
