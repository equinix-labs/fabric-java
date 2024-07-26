package com.equinix.openapi.fabric.v4.api.dto.service_profile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pfcr{

	@JsonProperty("publicSPName")
	private String publicSPName;

	public String getPublicSPName(){
		return publicSPName;
	}
}