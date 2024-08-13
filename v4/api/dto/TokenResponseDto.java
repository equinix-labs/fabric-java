package com.equinix.openapi.fabric.v4.api.dto;

import com.google.gson.annotations.SerializedName;

public class TokenResponseDto{

	@SerializedName("access_token")
	private String accessToken;

	@SerializedName("user_name")
	private String userName;

	@SerializedName("token_timeout")
	private String tokenTimeout;

	@SerializedName("token_type")
	private String tokenType;

	public String getAccessToken(){
		return accessToken;
	}

	public String getUserName(){
		return userName;
	}

	public String getTokenTimeout(){
		return tokenTimeout;
	}

	public String getTokenType(){
		return tokenType;
	}
}