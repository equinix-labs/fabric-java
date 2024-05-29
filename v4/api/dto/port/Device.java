package com.equinix.openapi.fabric.v4.api.dto.port;

import com.google.gson.annotations.SerializedName;

public class Device{

	@SerializedName("name")
	private String name;

	@SerializedName("redundancy")
	private Redundancy redundancy;

	public String getName(){
		return name;
	}

	public Redundancy getRedundancy(){
		return redundancy;
	}
}