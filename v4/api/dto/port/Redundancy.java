package com.equinix.openapi.fabric.v4.api.dto.port;

import com.google.gson.annotations.SerializedName;

public class Redundancy{

	@SerializedName("priority")
	private String priority;

	public String getPriority(){
		return priority;
	}
}