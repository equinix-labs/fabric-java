package com.equinix.openapi.fabric.v4.api.dto.port;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Encapsulation{

	@JsonProperty("tagProtocolId")
	private String tagProtocolId;

	@JsonProperty("type")
	private String type;

	public String getTagProtocolId(){
		return tagProtocolId;
	}

	public String getType(){
		return type;
	}
}
