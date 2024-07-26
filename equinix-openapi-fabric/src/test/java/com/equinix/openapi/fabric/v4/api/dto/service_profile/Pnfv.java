package com.equinix.openapi.fabric.v4.api.dto.service_profile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pnfv{

	@JsonProperty("virtualDevice")
	private String virtualDevice;

	@JsonProperty("network")
	private String network;

	public String getVirtualDevice(){
		return virtualDevice;
	}

	public String getNetwork(){
		return network;
	}
}