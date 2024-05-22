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
import com.equinix.openapi.fabric.v4.api.dto.PortDto;
import com.equinix.openapi.fabric.v4.model.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

import java.util.Arrays;
import java.util.Collections;
import java.util.UUID;

import static org.junit.Assert.assertEquals;

/**
 * API tests for PortsApi
 */
@Disabled
public class PortsApiTest extends AbstractTest {
    private final PortsApi api = new PortsApi(generateToken());

    /**
     * Add to Lag
     * <p>
     * Add Physical Ports to Virtual Port.&lt;font color&#x3D;\&quot;red\&quot;&gt; &lt;sup color&#x3D;&#39;red&#39;&gt;Preview&lt;/sup&gt;&lt;/font&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addToLagTest() throws ApiException {
        //
        //UUID portId = null;
        //
        //BulkPhysicalPort bulkPhysicalPort = null;
        //
        //AllPhysicalPortsResponse response = api.addToLag(portId, bulkPhysicalPort);

        // TODO: test validations
    }

    /**
     * Create Port
     * <p>
     * Create Port creates Equinix Fabric? Port.&lt;font color&#x3D;\&quot;red\&quot;&gt; &lt;sup color&#x3D;&#39;red&#39;&gt;Preview&lt;/sup&gt;&lt;/font&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createBulkPortTest() throws ApiException {
        //
        //BulkPort bulkPort = null;
        //
        //AllPortsResponse response = api.createBulkPort(bulkPort);

        // TODO: test validations
    }

    /**
     * Create Port
     * <p>
     * Creates Equinix Fabric? Port.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createPortTest() throws ApiException {
        //
        //Port port = null;
        //
        //Port response = api.createPort(port);

        // TODO: test validations
    }

    /**
     * Get Port by uuid
     * <p>
     * Get Port By uuid returns details of assigned and available Equinix Fabric port for the specified user credentials. The metro code attribute in the response shows the origin of the proposed connection.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPortByUuidTest() throws ApiException {
        UUID portUUID = UUID.fromString("c4d9350e-7787-787d-1ce0-306a5c00a600");
        Port response = api.getPortByUuid(UUID.fromString(portUUID.toString()));
        assertEquals(200, api.getApiClient().getStatusCode());
        System.out.println(response);
    }

    /**
     * Get All Ports
     * <p>
     * Get All Ports returns details of all assigned and available ports for the specified user credentials. The metro attribute in the response shows the origin of the proposed connection.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPortsTest() throws ApiException {
        PortDto portDto = getPort(JsonFiles.PORT_2_PUBLIC_SERVICE_PROFILE_CONNECTION);
        AllPortsResponse response = api.getPorts(portDto.getAsidePortName());
        assertEquals(200, api.getApiClient().getStatusCode());
        assertEquals(portDto.getAsidePortName(), response.getData().get(0).getName());
    }

    /**
     * Get Vlans
     * <p>
     * The API provides capability to retrieve Vlans for a Port.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLinkProtocolsTest() throws ApiException {
        UUID portUUID = UUID.fromString("c4d9350e-7787-787d-1ce0-306a5c00a600");
        LinkProtocolGetResponse response = api.getVlans(portUUID);
        assertEquals(200, api.getApiClient().getStatusCode());
        System.out.println(response);
    }

    /**
     * Search ports
     * <p>
     * The API provides capability to get list of user&#39;s virtual ports using search criteria, including optional filtering, pagination and sorting
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchPortsTest() throws ApiException {
        PortV4SearchRequest portV4SearchRequest = new PortV4SearchRequest();

        PortExpression portExpressionProperty1 = new PortExpression()
                .property(PortSearchFieldName.STATE)
                .operator(PortExpression.OperatorEnum.EQUAL)
                .values(Collections.singletonList("ACTIVE"));

        PortExpression portExpressionProperty2 = new PortExpression()
                .property(PortSearchFieldName.SETTINGS_PRODUCTCODE)
                .operator(PortExpression.OperatorEnum.EQUAL)
                .values(Collections.singletonList("CX"));

        PortExpression portExpressionProperty3 = new PortExpression()
                .property(PortSearchFieldName.PROJECT_PROJECTID)
                .operator(PortExpression.OperatorEnum.EQUAL)
                .values(Collections.singletonList("291639000636552"));

        PortExpression item = new PortExpression().and(Arrays.asList(portExpressionProperty1, portExpressionProperty2, portExpressionProperty3));

        portV4SearchRequest.setFilter(new PortExpression().or(Collections.singletonList(item)));
        portV4SearchRequest.setPagination(new PaginationRequest().limit(1000).offset(0));
        portV4SearchRequest.sort(Collections.singletonList(new PortSortCriteria().direction(PortSortDirection.DESC).property(PortSortBy._DEVICE_NAME)));

        printJson(portV4SearchRequest);

        AllPortsResponse response = api.searchPorts(portV4SearchRequest);
        assertEquals(200, api.getApiClient().getStatusCode());
        System.out.println(response);

//        issue all encapsulation are return no like enum value e.g Qinq
//        assertNotEquals(null,response.getData().get(0).getType());
    }
}
