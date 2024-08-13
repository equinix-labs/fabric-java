package com.equinix.openapi.fabric.v4.api.dto.users;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UsersDto {

	@JsonProperty("users")
	private List<UsersItem> users;

	public void setUsers(List<UsersItem> users){
		this.users = users;
	}

	public List<UsersItem> getUsers(){
		return users;
	}
}
