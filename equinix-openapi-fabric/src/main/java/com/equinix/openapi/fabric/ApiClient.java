/*
* Equinix Fabric API v4
*
* Contact: api-support@equinix.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


package com.equinix.openapi.fabric;

import com.equinix.openapi.fabric.v4.api.*;
import io.restassured.builder.RequestSpecBuilder;

import java.util.function.Supplier;

import static com.equinix.openapi.fabric.JacksonObjectMapper.jackson;
import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static io.restassured.config.RestAssuredConfig.config;


public class ApiClient {
public static final String BASE_URI = System.getProperty("envUrl");

private final Config config;

private ApiClient(Config config) {
this.config = config;
}

public static ApiClient api(Config config) {
return new ApiClient(config);
}

public CloudRoutersApi cloudRouters() {
return CloudRoutersApi.cloudRouters(config.reqSpecSupplier);
}
public ConnectionsApi connections() {
return ConnectionsApi.connections(config.reqSpecSupplier);
}
public HealthApi health() {
return HealthApi.health(config.reqSpecSupplier);
}
public MetrosApi metros() {
return MetrosApi.metros(config.reqSpecSupplier);
}
public NetworksApi networks() {
return NetworksApi.networks(config.reqSpecSupplier);
}
public PortsApi ports() {
return PortsApi.ports(config.reqSpecSupplier);
}
public PrecisionTimeApi precisionTime() {
return PrecisionTimeApi.precisionTime(config.reqSpecSupplier);
}
public PricesApi prices() {
return PricesApi.prices(config.reqSpecSupplier);
}
public RouteFilterRulesApi routeFilterRules() {
return RouteFilterRulesApi.routeFilterRules(config.reqSpecSupplier);
}
public RouteFiltersApi routeFilters() {
return RouteFiltersApi.routeFilters(config.reqSpecSupplier);
}
public RoutingProtocolsApi routingProtocols() {
return RoutingProtocolsApi.routingProtocols(config.reqSpecSupplier);
}
public ServiceProfilesApi serviceProfiles() {
return ServiceProfilesApi.serviceProfiles(config.reqSpecSupplier);
}
public ServiceTokensApi serviceTokens() {
return ServiceTokensApi.serviceTokens(config.reqSpecSupplier);
}
public StatisticsApi statistics() {
return StatisticsApi.statistics(config.reqSpecSupplier);
}

public static class Config {
private Supplier<RequestSpecBuilder> reqSpecSupplier = () -> new RequestSpecBuilder()
    .setBaseUri(BASE_URI)
    .setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(jackson())));

    /**
    * Use common specification for all operations
    * @param supplier supplier
    * @return configuration
    */
    public Config reqSpecSupplier(Supplier<RequestSpecBuilder> supplier) {
        this.reqSpecSupplier = supplier;
        return this;
        }

        public static Config apiConfig() {
        return new Config();
        }
        }
        }
