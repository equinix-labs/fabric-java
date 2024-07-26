package com.equinix.openapi.fabric.v4.api.dto.port;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location{

	@JsonProperty("metroName")
	private String metroName;

	@JsonProperty("metroCode")
	private String metroCode;

	@JsonProperty("href")
	private String href;

	@JsonProperty("region")
	private String region;

	@JsonProperty("ibx")
	private String ibx;

	public String getMetroName(){
		return metroName;
	}

	public String getMetroCode(){
		return metroCode;
	}

	public String getHref(){
		return href;
	}

	public String getRegion(){
		return region;
	}

	public String getIbx(){
		return ibx;
	}
}
