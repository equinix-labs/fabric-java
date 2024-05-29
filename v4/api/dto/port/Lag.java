package com.equinix.openapi.fabric.v4.api.dto.port;

import com.google.gson.annotations.SerializedName;

public class Lag{

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	@SerializedName("enabled")
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