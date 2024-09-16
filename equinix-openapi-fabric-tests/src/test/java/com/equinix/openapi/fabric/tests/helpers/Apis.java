package com.equinix.openapi.fabric.tests.helpers;

import com.equinix.openapi.fabric.v4.api.*;
import com.equinix.openapi.fabric.tests.dto.users.UsersItem;

import static com.equinix.openapi.fabric.tests.helpers.TokenGenerator.generate;

public class Apis {
    public static CloudRoutersApi cloudRoutersApi;
    public static ConnectionsApi connectionsApi;
    public static HealthApi healthApi;
    public static MetrosApi metrosApi;
    public static NetworksApi networksApi;
    public static PortsApi portsApi;
    public static PrecisionTimeApi precisionTimeApi;
    public static PricesApi pricesApi;
    public static RouteFilterRulesApi routeFilterRulesApi;
    public static RouteFiltersApi routeFiltersApi;
    public static RoutingProtocolsApi routingProtocolsApi;
    public static ServiceProfilesApi serviceProfilesApi;
    public static ServiceTokensApi serviceTokensApi;
    public static StatisticsApi statisticsApi;
    private static UsersItem.UserName currentUser;

    static {
        currentUser = UsersItem.UserName.PANTHERS_FCR;
        setApis();
    }

    public static void setUserName(UsersItem.UserName userName) {
        currentUser = userName;
        generate(currentUser);
        setApis();
    }

    public static UsersItem.UserName getCurrentUser() {
        return currentUser;
    }

    private static void setApis() {
        cloudRoutersApi = new CloudRoutersApi(TokenGenerator.getApiClient(currentUser));
        connectionsApi = new ConnectionsApi(TokenGenerator.getApiClient(currentUser));
        healthApi = new HealthApi(TokenGenerator.getApiClient(currentUser));
        metrosApi = new MetrosApi(TokenGenerator.getApiClient(currentUser));
        networksApi = new NetworksApi(TokenGenerator.getApiClient(currentUser));
        portsApi = new PortsApi(TokenGenerator.getApiClient(currentUser));
        precisionTimeApi = new PrecisionTimeApi(TokenGenerator.getApiClient(currentUser));
        pricesApi = new PricesApi(TokenGenerator.getApiClient(currentUser));
        routeFiltersApi = new RouteFiltersApi(TokenGenerator.getApiClient(currentUser));
        routeFilterRulesApi = new RouteFilterRulesApi(TokenGenerator.getApiClient(currentUser));
        routingProtocolsApi = new RoutingProtocolsApi(TokenGenerator.getApiClient(currentUser));
        serviceProfilesApi = new ServiceProfilesApi(TokenGenerator.getApiClient(currentUser));
        serviceTokensApi = new ServiceTokensApi(TokenGenerator.getApiClient(currentUser));
        statisticsApi = new StatisticsApi(TokenGenerator.getApiClient(currentUser));
    }
}
