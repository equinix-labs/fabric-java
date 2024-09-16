package com.equinix.openapi.fabric.tests.dto.port;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class UsersItem {

    @SerializedName("virtualDevices")
    private List<VirtualDevicesItem> virtualDevices;

    @SerializedName("name")
    private String name;

    @SerializedName("client_secret")
    private String clientSecret;

    @SerializedName("accountNumber")
    private String accountNumber;

    @SerializedName("ports")
    private List<PortDto> ports;

    @SerializedName("projectId")
    private String projectId;

    @SerializedName("client_id")
    private String clientId;

    public List<VirtualDevicesItem> getVirtualDevices() {
        return virtualDevices;
    }

    public String getName() {
        return name;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public List<PortDto> getPorts() {
        return ports;
    }

    public String getProjectId() {
        return projectId;
    }

    public String getClientId() {
        return clientId;
    }
}
