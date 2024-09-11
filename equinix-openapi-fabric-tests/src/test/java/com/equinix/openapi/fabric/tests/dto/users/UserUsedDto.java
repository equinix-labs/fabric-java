package com.equinix.openapi.fabric.tests.dto.users;

import com.equinix.openapi.fabric.ApiClient;

public class UserUsedDto {

    private final UserResources userResources = new UserResources();
    private UsersItem.UserName userName;

    private ApiClient apiClient;

    public UserUsedDto(UsersItem.UserName userName, ApiClient apiClient) {
        this.userName = userName;
        this.apiClient = apiClient;
    }

    public UserResources getUserResources() {
        return userResources;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public UsersItem.UserName getUserName() {
        return userName;
    }

    public UserUsedDto setUserName(UsersItem.UserName userName) {
        this.userName = userName;
        return this;
    }
}
