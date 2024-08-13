package com.equinix.openapi.fabric.v4.api.dto.port;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Device{

	@JsonProperty("name")
	private String name;

	@JsonProperty("redundancy")
	private Redundancy redundancy;

	public String getName(){
		return name;
	}

	public Redundancy getRedundancy(){
		return redundancy;
	}
}
