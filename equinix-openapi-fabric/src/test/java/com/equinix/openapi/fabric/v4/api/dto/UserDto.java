package com.equinix.openapi.fabric.v4.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDto{

	@JsonProperty("accountNumber")
	private String  accountNumber;

	@JsonProperty("projectId")
	private String projectId;

	public String getAccountNumber(){
		return accountNumber;
	}

	public String getProjectId(){
		return projectId;
	}
}
