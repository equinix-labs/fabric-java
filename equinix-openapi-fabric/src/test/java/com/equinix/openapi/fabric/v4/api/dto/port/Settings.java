package com.equinix.openapi.fabric.v4.api.dto.port;

import com.google.gson.annotations.SerializedName;

public class Settings{

	@SerializedName("buyout")
	private boolean buyout;

	@SerializedName("placeVcOrderPermission")
	private boolean placeVcOrderPermission;

	@SerializedName("viewPortPermission")
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