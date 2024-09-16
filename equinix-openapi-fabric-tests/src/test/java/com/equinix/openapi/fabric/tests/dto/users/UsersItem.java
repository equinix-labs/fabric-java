package com.equinix.openapi.fabric.tests.dto.users;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.equinix.openapi.fabric.tests.dto.port.PortDto;
import com.equinix.openapi.fabric.tests.dto.port.VirtualDevicesItem;

import java.util.List;

public class UsersItem {

    @JsonProperty("virtualDevices")
    private List<VirtualDevicesItem> virtualDevices;

    @JsonProperty("ports")
    private List<PortDto> ports;

    @JsonProperty("name")
    private String name;

    @JsonProperty("client_secret")
    private String clientSecret;

    @JsonProperty("accountNumber")
    private String accountNumber;

    @JsonProperty("projectId")
    private String projectId;

    @JsonProperty("client_id")
    private String clientId;

    public List<PortDto> getPorts() {
        return ports;
    }

    public void setPorts(List<PortDto> ports) {
        this.ports = ports;
    }

    public List<VirtualDevicesItem> getVirtualDevices() {
        return virtualDevices;
    }

    public void setVirtualDevices(List<VirtualDevicesItem> virtualDevices) {
        this.virtualDevices = virtualDevices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public enum UserName {
        PANTHERS_FCR("fcr"),
        PANTHERS_FNV("fnv");

        public final String value;

        UserName(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}

