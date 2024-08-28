package com.equinix.openapi.fabric.v4.api.dto.port;

import com.google.gson.annotations.SerializedName;

public class PortDto {

	@SerializedName("encapsulation")
	private String encapsulation;

	@SerializedName("name")
	private String name;

	@SerializedName("location")
	private Location location;

	@SerializedName("type")
	private String type;

	@SerializedName("uuid")
	private String uuid;

	public String getEncapsulation() {
		return encapsulation;
	}

	public String getName(){
		return name;
	}

	public Location getLocation(){
		return location;
	}

	public String getType() {
		return type;
	}

	public String getUuid() {
		return uuid;
	}
}
