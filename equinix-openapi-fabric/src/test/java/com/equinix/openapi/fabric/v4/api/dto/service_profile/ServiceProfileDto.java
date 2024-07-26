package com.equinix.openapi.fabric.v4.api.dto.service_profile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceProfileDto{

	@JsonProperty("pfcr")
	private Pfcr pfcr;

	@JsonProperty("pnfv")
	private Pnfv pnfv;

	public Pfcr getPfcr(){
		return pfcr;
	}

	public Pnfv getPnfv(){
		return pnfv;
	}
}