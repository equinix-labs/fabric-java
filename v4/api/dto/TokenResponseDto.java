package com.equinix.openapi.fabric.v4.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TokenResponseDto {

    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("refresh_token")
    private String refreshToken;

    @JsonProperty("user_name")
    private String userName;

    @JsonProperty("token_timeout")
    private String tokenTimeout;

    @JsonProperty("token_type")
    private String tokenType;

    @JsonProperty("refresh_token_timeout")
    private String refreshTokenTimeout;

    public String getAccessToken() {
        return accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public String getUserName() {
        return userName;
    }

    public String getTokenTimeout() {
        return tokenTimeout;
    }

    public String getTokenType() {
        return tokenType;
    }

    public String getRefreshTokenTimeout() {
        return refreshTokenTimeout;
    }
}
