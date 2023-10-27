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
import com.equinix.openapi.fabric.v4.model.AllPhysicalPortsResponse;
import com.equinix.openapi.fabric.v4.model.AllPortsResponse;
import com.equinix.openapi.fabric.v4.model.BulkPhysicalPort;
import com.equinix.openapi.fabric.v4.model.BulkPort;
import com.equinix.openapi.fabric.v4.model.Error;
import com.equinix.openapi.fabric.v4.model.LinkProtocolGetResponse;
import com.equinix.openapi.fabric.v4.model.Port;
import com.equinix.openapi.fabric.v4.model.PortV4SearchRequest;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PortsApi
 */
@Disabled
public class PortsApiTest {

    private final PortsApi api = new PortsApi();

    /**
     * Add to Lag
     *
     * Add Physical Ports to Virtual Port.&lt;font color&#x3D;\&quot;red\&quot;&gt; &lt;sup color&#x3D;&#39;red&#39;&gt;Preview&lt;/sup&gt;&lt;/font&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addToLagTest() throws ApiException {
        UUID portId = null;
        BulkPhysicalPort bulkPhysicalPort = null;
        AllPhysicalPortsResponse response = api.addToLag(portId, bulkPhysicalPort);
        // TODO: test validations
    }

    /**
     * Create Port
     *
     * Create Port creates Equinix Fabric? Port.&lt;font color&#x3D;\&quot;red\&quot;&gt; &lt;sup color&#x3D;&#39;red&#39;&gt;Preview&lt;/sup&gt;&lt;/font&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createBulkPortTest() throws ApiException {
        BulkPort bulkPort = null;
        AllPortsResponse response = api.createBulkPort(bulkPort);
        // TODO: test validations
    }

    /**
     * Create Port
     *
     * Creates Equinix Fabric? Port.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createPortTest() throws ApiException {
        Port port = null;
        Port response = api.createPort(port);
        // TODO: test validations
    }

    /**
     * Get Port by uuid
     *
     * Get Port By uuid returns details of assigned and available Equinix Fabric port for the specified user credentials. The metro code attribute in the response shows the origin of the proposed connection.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPortByUuidTest() throws ApiException {
        UUID portId = null;
        Port response = api.getPortByUuid(portId);
        // TODO: test validations
    }

    /**
     * Get All Ports
     *
     * Get All Ports returns details of all assigned and available ports for the specified user credentials. The metro attribute in the response shows the origin of the proposed connection.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPortsTest() throws ApiException {
        String name = null;
        AllPortsResponse response = api.getPorts(name);
        // TODO: test validations
    }

    /**
     * Get Vlans
     *
     * The API provides capability to retrieve Vlans for a Port.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getVlansTest() throws ApiException {
        UUID portUuid = null;
        LinkProtocolGetResponse response = api.getVlans(portUuid);
        // TODO: test validations
    }

    /**
     * Search ports
     *
     * The API provides capability to get list of user&#39;s virtual ports using search criteria, including optional filtering, pagination and sorting
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchPortsTest() throws ApiException {
        PortV4SearchRequest portV4SearchRequest = null;
        AllPortsResponse response = api.searchPorts(portV4SearchRequest);
        // TODO: test validations
    }

}
