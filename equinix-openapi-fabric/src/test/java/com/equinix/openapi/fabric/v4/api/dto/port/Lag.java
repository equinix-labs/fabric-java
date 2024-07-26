package com.equinix.openapi.fabric.v4.api.dto.port;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Lag{

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private String id;

	@JsonProperty("enabled")
	private boolean enabled;

	public String getName(){
		return name;
	}

	public String getId(){
		return id;
	}

	public boolean isEnabled(){
		return enabled;
	}
}
