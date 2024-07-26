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

import com.equinix.openapi.fabric.v4.model.ConnectionRouteFilterData;
import com.equinix.openapi.fabric.v4.model.ConnectionRouteFiltersBase;
import com.equinix.openapi.fabric.v4.model.Error;
import com.equinix.openapi.fabric.v4.model.GetAllConnectionRouteFiltersResponse;
import com.equinix.openapi.fabric.v4.model.GetRouteFilterGetConnectionsResponse;
import com.equinix.openapi.fabric.v4.model.RouteFilterChangeData;
import com.equinix.openapi.fabric.v4.model.RouteFilterChangeDataResponse;
import com.equinix.openapi.fabric.v4.model.RouteFiltersBase;
import com.equinix.openapi.fabric.v4.model.RouteFiltersData;
import com.equinix.openapi.fabric.v4.model.RouteFiltersPatchRequestItem;
import com.equinix.openapi.fabric.v4.model.RouteFiltersSearchBase;
import com.equinix.openapi.fabric.v4.model.RouteFiltersSearchResponse;
import java.util.UUID;
import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.v4.api.RouteFiltersApi;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static io.restassured.config.RestAssuredConfig.config;
import static com.equinix.openapi.fabric.JacksonObjectMapper.jackson;

/**
 * API tests for RouteFiltersApi
 */
@Ignore
public class RouteFiltersApiTest {

    private RouteFiltersApi api;

    @Before
    public void createApi() {
        api = ApiClient.api(ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(jackson())))
                        .addFilter(new ErrorLoggingFilter())
                        .setBaseUri("https://api.equinix.com"))).routeFilters();
    }

    /**
     * Successful operation
     */
    @Test
    public void shouldSee202AfterAttachConnectionRouteFilter() {
        String routeFilterId = null;
        String connectionId = null;
        ConnectionRouteFiltersBase connectionRouteFiltersBase = null;
        api.attachConnectionRouteFilter()
                .routeFilterIdPath(routeFilterId)
                .connectionIdPath(connectionId)
                .body(connectionRouteFiltersBase).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Bad request
     */
    @Test
    public void shouldSee400AfterAttachConnectionRouteFilter() {
        String routeFilterId = null;
        String connectionId = null;
        ConnectionRouteFiltersBase connectionRouteFiltersBase = null;
        api.attachConnectionRouteFilter()
                .routeFilterIdPath(routeFilterId)
                .connectionIdPath(connectionId)
                .body(connectionRouteFiltersBase).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unauthorized
     */
    @Test
    public void shouldSee401AfterAttachConnectionRouteFilter() {
        String routeFilterId = null;
        String connectionId = null;
        ConnectionRouteFiltersBase connectionRouteFiltersBase = null;
        api.attachConnectionRouteFilter()
                .routeFilterIdPath(routeFilterId)
                .connectionIdPath(connectionId)
                .body(connectionRouteFiltersBase).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Forbidden
     */
    @Test
    public void shouldSee403AfterAttachConnectionRouteFilter() {
        String routeFilterId = null;
        String connectionId = null;
        ConnectionRouteFiltersBase connectionRouteFiltersBase = null;
        api.attachConnectionRouteFilter()
                .routeFilterIdPath(routeFilterId)
                .connectionIdPath(connectionId)
                .body(connectionRouteFiltersBase).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Route Filter ID Not Found
     */
    @Test
    public void shouldSee404AfterAttachConnectionRouteFilter() {
        String routeFilterId = null;
        String connectionId = null;
        ConnectionRouteFiltersBase connectionRouteFiltersBase = null;
        api.attachConnectionRouteFilter()
                .routeFilterIdPath(routeFilterId)
                .connectionIdPath(connectionId)
                .body(connectionRouteFiltersBase).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unsupported Media Type
     */
    @Test
    public void shouldSee415AfterAttachConnectionRouteFilter() {
        String routeFilterId = null;
        String connectionId = null;
        ConnectionRouteFiltersBase connectionRouteFiltersBase = null;
        api.attachConnectionRouteFilter()
                .routeFilterIdPath(routeFilterId)
                .connectionIdPath(connectionId)
                .body(connectionRouteFiltersBase).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Internal server error
     */
    @Test
    public void shouldSee500AfterAttachConnectionRouteFilter() {
        String routeFilterId = null;
        String connectionId = null;
        ConnectionRouteFiltersBase connectionRouteFiltersBase = null;
        api.attachConnectionRouteFilter()
                .routeFilterIdPath(routeFilterId)
                .connectionIdPath(connectionId)
                .body(connectionRouteFiltersBase).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Successful operation
     */
    @Test
    public void shouldSee202AfterCreateRouteFilter() {
        RouteFiltersBase routeFiltersBase = null;
        api.createRouteFilter()
                .body(routeFiltersBase).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Bad request
     */
    @Test
    public void shouldSee400AfterCreateRouteFilter() {
        RouteFiltersBase routeFiltersBase = null;
        api.createRouteFilter()
                .body(routeFiltersBase).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unauthorized
     */
    @Test
    public void shouldSee401AfterCreateRouteFilter() {
        RouteFiltersBase routeFiltersBase = null;
        api.createRouteFilter()
                .body(routeFiltersBase).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Forbidden
     */
    @Test
    public void shouldSee403AfterCreateRouteFilter() {
        RouteFiltersBase routeFiltersBase = null;
        api.createRouteFilter()
                .body(routeFiltersBase).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Route Filter ID Not Found
     */
    @Test
    public void shouldSee404AfterCreateRouteFilter() {
        RouteFiltersBase routeFiltersBase = null;
        api.createRouteFilter()
                .body(routeFiltersBase).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unsupported Media Type
     */
    @Test
    public void shouldSee415AfterCreateRouteFilter() {
        RouteFiltersBase routeFiltersBase = null;
        api.createRouteFilter()
                .body(routeFiltersBase).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Internal server error
     */
    @Test
    public void shouldSee500AfterCreateRouteFilter() {
        RouteFiltersBase routeFiltersBase = null;
        api.createRouteFilter()
                .body(routeFiltersBase).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Successful operation
     */
    @Test
    public void shouldSee202AfterDeleteRouteFilterByUuid() {
        String routeFilterId = null;
        api.deleteRouteFilterByUuid()
                .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Bad request
     */
    @Test
    public void shouldSee400AfterDeleteRouteFilterByUuid() {
        String routeFilterId = null;
        api.deleteRouteFilterByUuid()
                .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unauthorized
     */
    @Test
    public void shouldSee401AfterDeleteRouteFilterByUuid() {
        String routeFilterId = null;
        api.deleteRouteFilterByUuid()
                .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Forbidden
     */
    @Test
    public void shouldSee403AfterDeleteRouteFilterByUuid() {
        String routeFilterId = null;
        api.deleteRouteFilterByUuid()
                .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Route Filter ID Not Found
     */
    @Test
    public void shouldSee404AfterDeleteRouteFilterByUuid() {
        String routeFilterId = null;
        api.deleteRouteFilterByUuid()
                .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unsupported Media Type
     */
    @Test
    public void shouldSee415AfterDeleteRouteFilterByUuid() {
        String routeFilterId = null;
        api.deleteRouteFilterByUuid()
                .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Internal server error
     */
    @Test
    public void shouldSee500AfterDeleteRouteFilterByUuid() {
        String routeFilterId = null;
        api.deleteRouteFilterByUuid()
                .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Successful operation
     */
    @Test
    public void shouldSee202AfterDetachConnectionRouteFilter() {
        String routeFilterId = null;
        String connectionId = null;
        api.detachConnectionRouteFilter()
                .routeFilterIdPath(routeFilterId)
                .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Bad request
     */
    @Test
    public void shouldSee400AfterDetachConnectionRouteFilter() {
        String routeFilterId = null;
        String connectionId = null;
        api.detachConnectionRouteFilter()
                .routeFilterIdPath(routeFilterId)
                .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unauthorized
     */
    @Test
    public void shouldSee401AfterDetachConnectionRouteFilter() {
        String routeFilterId = null;
        String connectionId = null;
        api.detachConnectionRouteFilter()
                .routeFilterIdPath(routeFilterId)
                .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Forbidden
     */
    @Test
    public void shouldSee403AfterDetachConnectionRouteFilter() {
        String routeFilterId = null;
        String connectionId = null;
        api.detachConnectionRouteFilter()
                .routeFilterIdPath(routeFilterId)
                .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Route Filter ID Not Found
     */
    @Test
    public void shouldSee404AfterDetachConnectionRouteFilter() {
        String routeFilterId = null;
        String connectionId = null;
        api.detachConnectionRouteFilter()
                .routeFilterIdPath(routeFilterId)
                .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unsupported Media Type
     */
    @Test
    public void shouldSee415AfterDetachConnectionRouteFilter() {
        String routeFilterId = null;
        String connectionId = null;
        api.detachConnectionRouteFilter()
                .routeFilterIdPath(routeFilterId)
                .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Internal server error
     */
    @Test
    public void shouldSee500AfterDetachConnectionRouteFilter() {
        String routeFilterId = null;
        String connectionId = null;
        api.detachConnectionRouteFilter()
                .routeFilterIdPath(routeFilterId)
                .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Successful operation
     */
    @Test
    public void shouldSee200AfterGetConnectionRouteFilterByUuid() {
        String routeFilterId = null;
        String connectionId = null;
        api.getConnectionRouteFilterByUuid()
                .routeFilterIdPath(routeFilterId)
                .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Bad request
     */
    @Test
    public void shouldSee400AfterGetConnectionRouteFilterByUuid() {
        String routeFilterId = null;
        String connectionId = null;
        api.getConnectionRouteFilterByUuid()
                .routeFilterIdPath(routeFilterId)
                .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unauthorized
     */
    @Test
    public void shouldSee401AfterGetConnectionRouteFilterByUuid() {
        String routeFilterId = null;
        String connectionId = null;
        api.getConnectionRouteFilterByUuid()
                .routeFilterIdPath(routeFilterId)
                .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Forbidden
     */
    @Test
    public void shouldSee403AfterGetConnectionRouteFilterByUuid() {
        String routeFilterId = null;
        String connectionId = null;
        api.getConnectionRouteFilterByUuid()
                .routeFilterIdPath(routeFilterId)
                .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Route Filter ID Not Found
     */
    @Test
    public void shouldSee404AfterGetConnectionRouteFilterByUuid() {
        String routeFilterId = null;
        String connectionId = null;
        api.getConnectionRouteFilterByUuid()
                .routeFilterIdPath(routeFilterId)
                .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unsupported Media Type
     */
    @Test
    public void shouldSee415AfterGetConnectionRouteFilterByUuid() {
        String routeFilterId = null;
        String connectionId = null;
        api.getConnectionRouteFilterByUuid()
                .routeFilterIdPath(routeFilterId)
                .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Internal server error
     */
    @Test
    public void shouldSee500AfterGetConnectionRouteFilterByUuid() {
        String routeFilterId = null;
        String connectionId = null;
        api.getConnectionRouteFilterByUuid()
                .routeFilterIdPath(routeFilterId)
                .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Successful operation
     */
    @Test
    public void shouldSee200AfterGetConnectionRouteFilters() {
        String connectionId = null;
        api.getConnectionRouteFilters()
                .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Bad request
     */
    @Test
    public void shouldSee400AfterGetConnectionRouteFilters() {
        String connectionId = null;
        api.getConnectionRouteFilters()
                .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unauthorized
     */
    @Test
    public void shouldSee401AfterGetConnectionRouteFilters() {
        String connectionId = null;
        api.getConnectionRouteFilters()
                .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Forbidden
     */
    @Test
    public void shouldSee403AfterGetConnectionRouteFilters() {
        String connectionId = null;
        api.getConnectionRouteFilters()
                .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Route Filter ID Not Found
     */
    @Test
    public void shouldSee404AfterGetConnectionRouteFilters() {
        String connectionId = null;
        api.getConnectionRouteFilters()
                .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unsupported Media Type
     */
    @Test
    public void shouldSee415AfterGetConnectionRouteFilters() {
        String connectionId = null;
        api.getConnectionRouteFilters()
                .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Internal server error
     */
    @Test
    public void shouldSee500AfterGetConnectionRouteFilters() {
        String connectionId = null;
        api.getConnectionRouteFilters()
                .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Successful operation
     */
    @Test
    public void shouldSee200AfterGetRouteFilterByUuid() {
        String routeFilterId = null;
        api.getRouteFilterByUuid()
                .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Bad request
     */
    @Test
    public void shouldSee400AfterGetRouteFilterByUuid() {
        String routeFilterId = null;
        api.getRouteFilterByUuid()
                .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unauthorized
     */
    @Test
    public void shouldSee401AfterGetRouteFilterByUuid() {
        String routeFilterId = null;
        api.getRouteFilterByUuid()
                .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Forbidden
     */
    @Test
    public void shouldSee403AfterGetRouteFilterByUuid() {
        String routeFilterId = null;
        api.getRouteFilterByUuid()
                .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Route Filter ID Not Found
     */
    @Test
    public void shouldSee404AfterGetRouteFilterByUuid() {
        String routeFilterId = null;
        api.getRouteFilterByUuid()
                .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unsupported Media Type
     */
    @Test
    public void shouldSee415AfterGetRouteFilterByUuid() {
        String routeFilterId = null;
        api.getRouteFilterByUuid()
                .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Internal server error
     */
    @Test
    public void shouldSee500AfterGetRouteFilterByUuid() {
        String routeFilterId = null;
        api.getRouteFilterByUuid()
                .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Fabric Route Filter Change object
     */
    @Test
    public void shouldSee200AfterGetRouteFilterChangeByUuid() {
        String routeFilterId = null;
        UUID changeId = null;
        api.getRouteFilterChangeByUuid()
                .routeFilterIdPath(routeFilterId)
                .changeIdPath(changeId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Bad request
     */
    @Test
    public void shouldSee400AfterGetRouteFilterChangeByUuid() {
        String routeFilterId = null;
        UUID changeId = null;
        api.getRouteFilterChangeByUuid()
                .routeFilterIdPath(routeFilterId)
                .changeIdPath(changeId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unauthorized
     */
    @Test
    public void shouldSee401AfterGetRouteFilterChangeByUuid() {
        String routeFilterId = null;
        UUID changeId = null;
        api.getRouteFilterChangeByUuid()
                .routeFilterIdPath(routeFilterId)
                .changeIdPath(changeId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Forbidden
     */
    @Test
    public void shouldSee403AfterGetRouteFilterChangeByUuid() {
        String routeFilterId = null;
        UUID changeId = null;
        api.getRouteFilterChangeByUuid()
                .routeFilterIdPath(routeFilterId)
                .changeIdPath(changeId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Route Filter ID Not Found
     */
    @Test
    public void shouldSee404AfterGetRouteFilterChangeByUuid() {
        String routeFilterId = null;
        UUID changeId = null;
        api.getRouteFilterChangeByUuid()
                .routeFilterIdPath(routeFilterId)
                .changeIdPath(changeId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Internal server error
     */
    @Test
    public void shouldSee500AfterGetRouteFilterChangeByUuid() {
        String routeFilterId = null;
        UUID changeId = null;
        api.getRouteFilterChangeByUuid()
                .routeFilterIdPath(routeFilterId)
                .changeIdPath(changeId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Fabric Route Filter Change object
     */
    @Test
    public void shouldSee200AfterGetRouteFilterChanges() {
        String routeFilterId = null;
        Integer offset = null;
        Integer limit = null;
        api.getRouteFilterChanges()
                .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Bad request
     */
    @Test
    public void shouldSee400AfterGetRouteFilterChanges() {
        String routeFilterId = null;
        Integer offset = null;
        Integer limit = null;
        api.getRouteFilterChanges()
                .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unauthorized
     */
    @Test
    public void shouldSee401AfterGetRouteFilterChanges() {
        String routeFilterId = null;
        Integer offset = null;
        Integer limit = null;
        api.getRouteFilterChanges()
                .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Forbidden
     */
    @Test
    public void shouldSee403AfterGetRouteFilterChanges() {
        String routeFilterId = null;
        Integer offset = null;
        Integer limit = null;
        api.getRouteFilterChanges()
                .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Route Filter ID Not Found
     */
    @Test
    public void shouldSee404AfterGetRouteFilterChanges() {
        String routeFilterId = null;
        Integer offset = null;
        Integer limit = null;
        api.getRouteFilterChanges()
                .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Internal server error
     */
    @Test
    public void shouldSee500AfterGetRouteFilterChanges() {
        String routeFilterId = null;
        Integer offset = null;
        Integer limit = null;
        api.getRouteFilterChanges()
                .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Successful operation
     */
    @Test
    public void shouldSee200AfterGetRouteFilterConnections() {
        String routeFilterId = null;
        api.getRouteFilterConnections()
                .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Bad request
     */
    @Test
    public void shouldSee400AfterGetRouteFilterConnections() {
        String routeFilterId = null;
        api.getRouteFilterConnections()
                .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unauthorized
     */
    @Test
    public void shouldSee401AfterGetRouteFilterConnections() {
        String routeFilterId = null;
        api.getRouteFilterConnections()
                .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Forbidden
     */
    @Test
    public void shouldSee403AfterGetRouteFilterConnections() {
        String routeFilterId = null;
        api.getRouteFilterConnections()
                .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Route Filter ID Not Found
     */
    @Test
    public void shouldSee404AfterGetRouteFilterConnections() {
        String routeFilterId = null;
        api.getRouteFilterConnections()
                .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unsupported Media Type
     */
    @Test
    public void shouldSee415AfterGetRouteFilterConnections() {
        String routeFilterId = null;
        api.getRouteFilterConnections()
                .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Internal server error
     */
    @Test
    public void shouldSee500AfterGetRouteFilterConnections() {
        String routeFilterId = null;
        api.getRouteFilterConnections()
                .routeFilterIdPath(routeFilterId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Successful operation
     */
    @Test
    public void shouldSee202AfterPatchRouteFilterByUuid() {
        String routeFilterId = null;
        List<RouteFiltersPatchRequestItem> routeFiltersPatchRequestItem = null;
        api.patchRouteFilterByUuid()
                .routeFilterIdPath(routeFilterId)
                .body(routeFiltersPatchRequestItem).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Bad request
     */
    @Test
    public void shouldSee400AfterPatchRouteFilterByUuid() {
        String routeFilterId = null;
        List<RouteFiltersPatchRequestItem> routeFiltersPatchRequestItem = null;
        api.patchRouteFilterByUuid()
                .routeFilterIdPath(routeFilterId)
                .body(routeFiltersPatchRequestItem).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unauthorized
     */
    @Test
    public void shouldSee401AfterPatchRouteFilterByUuid() {
        String routeFilterId = null;
        List<RouteFiltersPatchRequestItem> routeFiltersPatchRequestItem = null;
        api.patchRouteFilterByUuid()
                .routeFilterIdPath(routeFilterId)
                .body(routeFiltersPatchRequestItem).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Forbidden
     */
    @Test
    public void shouldSee403AfterPatchRouteFilterByUuid() {
        String routeFilterId = null;
        List<RouteFiltersPatchRequestItem> routeFiltersPatchRequestItem = null;
        api.patchRouteFilterByUuid()
                .routeFilterIdPath(routeFilterId)
                .body(routeFiltersPatchRequestItem).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Route Filter ID Not Found
     */
    @Test
    public void shouldSee404AfterPatchRouteFilterByUuid() {
        String routeFilterId = null;
        List<RouteFiltersPatchRequestItem> routeFiltersPatchRequestItem = null;
        api.patchRouteFilterByUuid()
                .routeFilterIdPath(routeFilterId)
                .body(routeFiltersPatchRequestItem).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unsupported Media Type
     */
    @Test
    public void shouldSee415AfterPatchRouteFilterByUuid() {
        String routeFilterId = null;
        List<RouteFiltersPatchRequestItem> routeFiltersPatchRequestItem = null;
        api.patchRouteFilterByUuid()
                .routeFilterIdPath(routeFilterId)
                .body(routeFiltersPatchRequestItem).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Internal server error
     */
    @Test
    public void shouldSee500AfterPatchRouteFilterByUuid() {
        String routeFilterId = null;
        List<RouteFiltersPatchRequestItem> routeFiltersPatchRequestItem = null;
        api.patchRouteFilterByUuid()
                .routeFilterIdPath(routeFilterId)
                .body(routeFiltersPatchRequestItem).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Successful operation
     */
    @Test
    public void shouldSee200AfterSearchRouteFilters() {
        RouteFiltersSearchBase routeFiltersSearchBase = null;
        api.searchRouteFilters()
                .body(routeFiltersSearchBase).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Bad request
     */
    @Test
    public void shouldSee400AfterSearchRouteFilters() {
        RouteFiltersSearchBase routeFiltersSearchBase = null;
        api.searchRouteFilters()
                .body(routeFiltersSearchBase).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unauthorized
     */
    @Test
    public void shouldSee401AfterSearchRouteFilters() {
        RouteFiltersSearchBase routeFiltersSearchBase = null;
        api.searchRouteFilters()
                .body(routeFiltersSearchBase).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Forbidden
     */
    @Test
    public void shouldSee403AfterSearchRouteFilters() {
        RouteFiltersSearchBase routeFiltersSearchBase = null;
        api.searchRouteFilters()
                .body(routeFiltersSearchBase).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Route Filter ID Not Found
     */
    @Test
    public void shouldSee404AfterSearchRouteFilters() {
        RouteFiltersSearchBase routeFiltersSearchBase = null;
        api.searchRouteFilters()
                .body(routeFiltersSearchBase).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unsupported Media Type
     */
    @Test
    public void shouldSee415AfterSearchRouteFilters() {
        RouteFiltersSearchBase routeFiltersSearchBase = null;
        api.searchRouteFilters()
                .body(routeFiltersSearchBase).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Internal server error
     */
    @Test
    public void shouldSee500AfterSearchRouteFilters() {
        RouteFiltersSearchBase routeFiltersSearchBase = null;
        api.searchRouteFilters()
                .body(routeFiltersSearchBase).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

}
