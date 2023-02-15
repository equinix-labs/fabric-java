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


package com.equinix.openapi.fabric.v4.model;

import com.equinix.openapi.fabric.v4.model.Changelog;
import com.equinix.openapi.fabric.v4.model.PhysicalPort;
import com.equinix.openapi.fabric.v4.model.PortAdditionalInfo;
import com.equinix.openapi.fabric.v4.model.PortDemarcationPoint;
import com.equinix.openapi.fabric.v4.model.PortDevice;
import com.equinix.openapi.fabric.v4.model.PortEncapsulation;
import com.equinix.openapi.fabric.v4.model.PortInterface;
import com.equinix.openapi.fabric.v4.model.PortLAG;
import com.equinix.openapi.fabric.v4.model.PortLoa;
import com.equinix.openapi.fabric.v4.model.PortNotification;
import com.equinix.openapi.fabric.v4.model.PortOperation;
import com.equinix.openapi.fabric.v4.model.PortOrder;
import com.equinix.openapi.fabric.v4.model.PortRedundancy;
import com.equinix.openapi.fabric.v4.model.PortSettings;
import com.equinix.openapi.fabric.v4.model.PortState;
import com.equinix.openapi.fabric.v4.model.PortTether;
import com.equinix.openapi.fabric.v4.model.PortType;
import com.equinix.openapi.fabric.v4.model.Project;
import com.equinix.openapi.fabric.v4.model.SimplifiedAccount;
import com.equinix.openapi.fabric.v4.model.SimplifiedLocation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for Port
 */
public class PortTest {
    private final Port model = new Port();

    /**
     * Model tests for Port
     */
    @Test
    public void testPort() {
        // TODO: test Port
    }

    /**
     * Test the property 'serviceType'
     */
    @Test
    public void serviceTypeTest() {
        // TODO: test serviceType
    }

    /**
     * Test the property 'encapsulation'
     */
    @Test
    public void encapsulationTest() {
        // TODO: test encapsulation
    }

    /**
     * Test the property 'loas'
     */
    @Test
    public void loasTest() {
        // TODO: test loas
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'project'
     */
    @Test
    public void projectTest() {
        // TODO: test project
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property '_interface'
     */
    @Test
    public void _interfaceTest() {
        // TODO: test _interface
    }

    /**
     * Test the property 'uuid'
     */
    @Test
    public void uuidTest() {
        // TODO: test uuid
    }

    /**
     * Test the property 'physicalPortsSpeed'
     */
    @Test
    public void physicalPortsSpeedTest() {
        // TODO: test physicalPortsSpeed
    }

    /**
     * Test the property 'connectionsCount'
     */
    @Test
    public void connectionsCountTest() {
        // TODO: test connectionsCount
    }

    /**
     * Test the property 'connectivitySourceType'
     */
    @Test
    public void connectivitySourceTypeTest() {
        // TODO: test connectivitySourceType
    }

    /**
     * Test the property 'physicalPortQuantity'
     */
    @Test
    public void physicalPortQuantityTest() {
        // TODO: test physicalPortQuantity
    }

    /**
     * Test the property 'lag'
     */
    @Test
    public void lagTest() {
        // TODO: test lag
    }

    /**
     * Test the property 'usedBandwidth'
     */
    @Test
    public void usedBandwidthTest() {
        // TODO: test usedBandwidth
    }

    /**
     * Test the property 'additionalInfo'
     */
    @Test
    public void additionalInfoTest() {
        // TODO: test additionalInfo
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'href'
     */
    @Test
    public void hrefTest() {
        // TODO: test href
    }

    /**
     * Test the property 'state'
     */
    @Test
    public void stateTest() {
        // TODO: test state
    }

    /**
     * Test the property 'redundancy'
     */
    @Test
    public void redundancyTest() {
        // TODO: test redundancy
    }

    /**
     * Test the property 'order'
     */
    @Test
    public void orderTest() {
        // TODO: test order
    }

    /**
     * Test the property 'settings'
     */
    @Test
    public void settingsTest() {
        // TODO: test settings
    }

    /**
     * Test the property 'availableBandwidth'
     */
    @Test
    public void availableBandwidthTest() {
        // TODO: test availableBandwidth
    }

    /**
     * Test the property 'demarcationPoint'
     */
    @Test
    public void demarcationPointTest() {
        // TODO: test demarcationPoint
    }

    /**
     * Test the property 'bandwidth'
     */
    @Test
    public void bandwidthTest() {
        // TODO: test bandwidth
    }

    /**
     * Test the property 'tether'
     */
    @Test
    public void tetherTest() {
        // TODO: test tether
    }

    /**
     * Test the property 'physicalPorts'
     */
    @Test
    public void physicalPortsTest() {
        // TODO: test physicalPorts
    }

    /**
     * Test the property 'changelog'
     */
    @Test
    public void changelogTest() {
        // TODO: test changelog
    }

    /**
     * Test the property 'physicalPortsType'
     */
    @Test
    public void physicalPortsTypeTest() {
        // TODO: test physicalPortsType
    }

    /**
     * Test the property 'cvpId'
     */
    @Test
    public void cvpIdTest() {
        // TODO: test cvpId
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'location'
     */
    @Test
    public void locationTest() {
        // TODO: test location
    }

    /**
     * Test the property 'operation'
     */
    @Test
    public void operationTest() {
        // TODO: test operation
    }

    /**
     * Test the property 'device'
     */
    @Test
    public void deviceTest() {
        // TODO: test device
    }

    /**
     * Test the property 'asn'
     */
    @Test
    public void asnTest() {
        // TODO: test asn
    }

    /**
     * Test the property 'account'
     */
    @Test
    public void accountTest() {
        // TODO: test account
    }

    /**
     * Test the property 'notifications'
     */
    @Test
    public void notificationsTest() {
        // TODO: test notifications
    }

}