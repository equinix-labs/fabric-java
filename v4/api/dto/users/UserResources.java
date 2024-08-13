package com.equinix.openapi.fabric.v4.api.dto.users;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserResources {
    private final List<UUID> cloudRoutersUuid = new ArrayList<>();
    private final List<String> connectionsUuid = new ArrayList<>();
    private final List<RoutingProtocolDto> routingProtocolsUuid = new ArrayList<>();
    private final List<UUID> networksUuid = new ArrayList<>();
    private final List<UUID> serviceProfilesUuid = new ArrayList<>();

    public List<UUID> getCloudRoutersUuid() {
        return cloudRoutersUuid;
    }

    public void addCloudRouterUuid(UUID cloudRouterUuid) {
        this.cloudRoutersUuid.add(cloudRouterUuid);
    }

    public List<String> getConnectionsUuid() {
        return connectionsUuid;
    }

    public void addConnectionUuid(String connectionsUuid) {
        this.connectionsUuid.add(connectionsUuid);
    }

    public List<RoutingProtocolDto> getRoutingProtocolsUuid() {
        return routingProtocolsUuid;
    }

    public UserResources addRoutingProtocolUuid(RoutingProtocolDto routingProtocolsUuid) {
        this.routingProtocolsUuid.add(routingProtocolsUuid);
        return this;
    }

    public List<UUID> getNetworksUuid() {
        return networksUuid;
    }

    public void addNetworkUuid(UUID networkUuid) {
        this.networksUuid.add(networkUuid);
    }

    public List<UUID> getServiceProfilesUuid() {
        return serviceProfilesUuid;
    }

    public void addServiceProfileUuid(UUID serviceProfilesUuid) {
        this.serviceProfilesUuid.add(serviceProfilesUuid);
    }

    public class RoutingProtocolDto {
        private UUID routingInstanceUuid;
        private UUID connectionUuid;

        public RoutingProtocolDto(UUID routingInstanceUuid, UUID connectionUuid) {
            this.routingInstanceUuid = routingInstanceUuid;
            this.connectionUuid = connectionUuid;
        }

        public UUID getRoutingInstanceUuid() {
            return routingInstanceUuid;
        }

        public UUID getConnectionUuid() {
            return connectionUuid;
        }
    }
}
