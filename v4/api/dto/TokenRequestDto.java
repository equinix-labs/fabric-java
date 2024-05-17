package com.equinix.openapi.fabric.v4.api.dto;

import com.google.gson.annotations.SerializedName;

public class TokenRequestDto {
    @SerializedName("user_password")
    private String userPassword;

    @SerializedName("grant_type")
    private String grantType;

    @SerializedName("user_name")
    private String userName;

    @SerializedName("client_secret")
    private String clientSecret;

    @SerializedName("client_id")
    private String clientId;

    public String getUserPassword() {
        return userPassword;
    }

    public TokenRequestDto setUserPassword(String userPassword) {
        this.userPassword = userPassword;
        return this;
    }

    public String getGrantType() {
        return grantType;
    }

    public String getUserName() {
        return userName;
    }

    public TokenRequestDto setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public TokenRequestDto setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    public String getClientId() {
        return clientId;
    }

    public TokenRequestDto setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
}
