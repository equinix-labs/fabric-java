package com.equinix.openapi.fabric.tests.dto.users;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UsersDto {

    @JsonProperty("users")
    private List<UsersItem> users;

    public void setUsers(List<UsersItem> users) {
        this.users = users;
    }

    public List<UsersItem> getUsers() {
        return users;
    }
}
