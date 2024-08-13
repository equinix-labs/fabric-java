package com.equinix.openapi.fabric.v4.api.dto;

import com.google.gson.annotations.SerializedName;

public class TokenRequestDto{

	@SerializedName("grant_type")
	private String grantType;

	@SerializedName("client_secret")
	private String clientSecret;

	@SerializedName("client_id")
	private String clientId;

	public void setGrantType(String grantType){
		this.grantType = grantType;
	}

	public String getGrantType(){
		return grantType;
	}

	public void setClientSecret(String clientSecret){
		this.clientSecret = clientSecret;
	}

	public String getClientSecret(){
		return clientSecret;
	}

	public void setClientId(String clientId){
		this.clientId = clientId;
	}

	public String getClientId(){
		return clientId;
	}
}