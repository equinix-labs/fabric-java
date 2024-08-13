package com.equinix.openapi.fabric.v4.api.dto.users;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UsersItem {

    @JsonProperty("virtualDevices")
    private List<Object> virtualDevices;

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

    public List<Object> getVirtualDevices() {
        return virtualDevices;
    }

    public void setVirtualDevices(List<Object> virtualDevices) {
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
