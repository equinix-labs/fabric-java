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

import com.equinix.openapi.fabric.ApiClient;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static com.equinix.openapi.fabric.JacksonObjectMapper.jackson;
import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static io.restassured.config.RestAssuredConfig.config;

/**
 * API tests for HealthApi
 */
@Ignore
public class HealthApiTest {

    private HealthApi api;

    @Before
    public void createApi() {
        api = ApiClient.api(ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(jackson())))
                        .addFilter(new ErrorLoggingFilter())
                        .setBaseUri("https://api.equinix.com"))).health();
    }

    /**
     * Successful operation
     */
    @Test
    public void shouldSee200AfterGetStatus() {
        api.getStatus().execute(r -> r.prettyPeek());
        // TODO: test validations
    }

}
