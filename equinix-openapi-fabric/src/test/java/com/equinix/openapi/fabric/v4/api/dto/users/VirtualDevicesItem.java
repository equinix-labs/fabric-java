package com.equinix.openapi.fabric.v4.api.dto.users;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VirtualDevicesItem{

	@JsonProperty("orderNumber")
	private String orderNumber;

	@JsonProperty("name")
	private String name;

	@JsonProperty("uuid")
	private String uuid;

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

	public void setUuid(String uuid){
		this.uuid = uuid;
	}

	public String getUuid(){
		return uuid;
	}
}
