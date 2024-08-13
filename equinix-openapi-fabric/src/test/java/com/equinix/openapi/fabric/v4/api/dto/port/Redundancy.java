package com.equinix.openapi.fabric.v4.api.dto.port;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Redundancy{

	@JsonProperty("priority")
	private String priority;

	public String getPriority(){
		return priority;
	}
}
