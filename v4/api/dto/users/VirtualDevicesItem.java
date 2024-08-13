package com.equinix.openapi.fabric.v4.api.dto.users;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class VirtualDevicesItem{

	@JsonProperty("orderNumber")
	private String orderNumber;

	@JsonProperty("name")
	private String name;

	@JsonProperty("uuid")
	private UUID uuid;

	public void setOrderNumber(String orderNumber){
		this.orderNumber = orderNumber;
	}

	public String getOrderNumber(){
		return orderNumber;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setUuid(UUID uuid){
		this.uuid = uuid;
	}

	public UUID getUuid(){
		return uuid;
	}
}
