package com.equinix.openapi.fabric.v4.api.helpers;

import com.equinix.openapi.fabric.v4.api.*;
import com.equinix.openapi.fabric.v4.api.dto.users.UsersItem;

public class Apis {
    public static CloudRoutersApi cloudRoutersApi;
    public static ConnectionsApi connectionsApi;
    public static MetrosApi metrosApi;
    public static NetworksApi networksApi;
    public static PortsApi portsApi;
    public static PricesApi pricesApi;
    public static RoutingProtocolsApi routingProtocolsApi;
    public static ServiceProfilesApi serviceProfilesApi;
    private static UsersItem.UserName currentUser;

    static {
        currentUser = UsersItem.UserName.PANTHERS_FCR;
        setApis();
    }

    public static void setUserName(UsersItem.UserName userName) {
        currentUser = userName;
        setApis();
    }

    public static UsersItem.UserName getCurrentUser(){
        return currentUser;
    }

    private static void setApis() {
        cloudRoutersApi = new CloudRoutersApi(TokenGenerator.getApiClient(currentUser));
        connectionsApi = new ConnectionsApi(TokenGenerator.getApiClient(currentUser));
        metrosApi = new MetrosApi(TokenGenerator.getApiClient(currentUser));
        networksApi = new NetworksApi(TokenGenerator.getApiClient(currentUser));
        portsApi = new PortsApi(TokenGenerator.getApiClient(currentUser));
        pricesApi = new PricesApi(TokenGenerator.getApiClient(currentUser));
        routingProtocolsApi = new RoutingProtocolsApi(TokenGenerator.getApiClient(currentUser));
        serviceProfilesApi = new ServiceProfilesApi(TokenGenerator.getApiClient(currentUser));
    }
}
