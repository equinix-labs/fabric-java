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
import com.equinix.openapi.fabric.v4.model.Duration;
import com.equinix.openapi.fabric.v4.model.Error;
import com.equinix.openapi.fabric.v4.model.MetricInterval;
import java.time.OffsetDateTime;
import com.equinix.openapi.fabric.v4.model.QueryDirection;
import com.equinix.openapi.fabric.v4.model.Sort;
import com.equinix.openapi.fabric.v4.model.Statistics;
import com.equinix.openapi.fabric.v4.model.TopUtilizedStatistics;
import java.util.UUID;
import com.equinix.openapi.fabric.v4.model.ViewPoint;
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
 * API tests for StatisticsApi
 */
public class StatisticsApiTest extends AbstractTest {

    private final StatisticsApi api = new StatisticsApi(generateToken());

    /**
     * Get Stats by uuid
     *
     * This API provides service-level metrics so that you can view access and gather key information required to manage service subscription sizing and capacity
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConnectionStatsByPortUuidTest() throws ApiException {
        //
        //String connectionId = null;
        //
        //OffsetDateTime startDateTime = null;
        //
        //OffsetDateTime endDateTime = null;
        //
        //ViewPoint viewPoint = null;
        //
        //Statistics response = api.getConnectionStatsByPortUuid(connectionId, startDateTime, endDateTime, viewPoint);

        // TODO: test validations
    }
    /**
     * Top Port Statistics
     *
     * This API provides top utilized service-level traffic metrics so that you can view access and gather key information required to manage service subscription sizing and capacity.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPortStatsTest() throws ApiException {
        //
        //List<String> metros = null;
        //
        //Sort sort = null;
        //
        //Integer top = null;
        //
        //Duration duration = null;
        //
        //QueryDirection direction = null;
        //
        //MetricInterval metricInterval = null;
        //
        //String projectId = null;
        //
        //TopUtilizedStatistics response = api.getPortStats(metros, sort, top, duration, direction, metricInterval, projectId);

        // TODO: test validations
    }
    /**
     * Get Stats by uuid
     *
     * This API provides service-level traffic metrics so that you can view access and gather key information required to manage service subscription sizing and capacity.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPortStatsByPortUuidTest() throws ApiException {
        //
        //UUID portId = null;
        //
        //OffsetDateTime startDateTime = null;
        //
        //OffsetDateTime endDateTime = null;
        //
        //Statistics response = api.getPortStatsByPortUuid(portId, startDateTime, endDateTime);

        // TODO: test validations
    }
}
