package com.equinix.openapi.fabric.v4.api.dto.port;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Settings{

	@JsonProperty("buyout")
	private boolean buyout;

	@JsonProperty("placeVcOrderPermission")
	private boolean placeVcOrderPermission;

	@JsonProperty("viewPortPermission")
	private boolean viewPortPermission;

	public boolean isBuyout(){
		return buyout;
	}

	public boolean isPlaceVcOrderPermission(){
		return placeVcOrderPermission;
	}

	public boolean isViewPortPermission(){
		return viewPortPermission;
	}
}
