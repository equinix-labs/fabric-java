package com.equinix.openapi.fabric.v4.api.dto;

import com.google.gson.annotations.SerializedName;

public class TokenResponseDto {

    @SerializedName("access_token")
    private String accessToken;

    @SerializedName("refresh_token")
    private String refreshToken;

    @SerializedName("user_name")
    private String userName;

    @SerializedName("token_timeout")
    private String tokenTimeout;

    @SerializedName("token_type")
    private String tokenType;

    @SerializedName("refresh_token_timeout")
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
