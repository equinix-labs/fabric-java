package com.equinix.openapi.fabric.v4.api.dto.port;

import com.google.gson.annotations.SerializedName;

public class Encapsulation{

	@SerializedName("tagProtocolId")
	private String tagProtocolId;

	@SerializedName("type")
	private String type;

	public String getTagProtocolId(){
		return tagProtocolId;
	}

	public String getType(){
		return type;
	}
}