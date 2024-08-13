/*
 * Equinix Fabric API v4
 *
 * Contact: api-support@equinix.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.equinix.openapi.fabric.v4.api;

import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.Pair;
import com.equinix.openapi.fabric.v4.api.dto.TokenRequestDto;
import com.equinix.openapi.fabric.v4.api.dto.TokenResponseDto;
import com.equinix.openapi.fabric.v4.api.dto.users.UserUsedDto;
import com.equinix.openapi.fabric.v4.api.dto.users.UsersItem;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TokenGenerator {

    public static Map<UsersItem.UserName, UserUsedDto> users = new HashMap<>();

    public static ApiClient getApiClient(UsersItem.UserName userName) {
        if (users.containsKey(userName)) {
            return users.get(userName).getApiClient();
        } else {
            return generate(userName);
        }
    }

    private static ApiClient generate(UsersItem.UserName userName) {
        String baseUrl = System.getProperty("envUrl");
        UsersItem user = Utils.getUserData(userName);

        ApiClient apiTokeClient = Configuration.getDefaultApiClient();
        TokenRequestDto tokenRequestDto = new TokenRequestDto();
        tokenRequestDto.setClientId(user.getClientId());
        tokenRequestDto.setClientSecret(user.getClientSecret());
        tokenRequestDto.setGrantType("client_credentials");

        String localVarPath = "/oauth2/v1/token";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarHeaderParams.put("Content-Type", "application/json");
        String[] localVarAuthNames = new String[]{"BearerAuth"};

        okhttp3.Call call;
        TokenResponseDto tokenResponseDto = null;

        try {
            call = apiTokeClient.buildCall(baseUrl, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, tokenRequestDto, localVarHeaderParams
                    , localVarCookieParams, localVarFormParams, localVarAuthNames, null);

            Type localVarReturnType = new TypeToken<TokenResponseDto>() {
            }.getType();
            tokenResponseDto = (TokenResponseDto) apiTokeClient.execute(call, localVarReturnType).getData();
        } catch (ApiException e) {
            throw new RuntimeException(e);
        }

        ApiClient apiClient = Configuration.getDefaultApiClient();
        apiClient.addDefaultHeader("Authorization", String.format("Bearer %s",tokenResponseDto.getAccessToken()));
        users.put(userName, new UserUsedDto(userName,apiClient));
        return users.get(userName).getApiClient();
    }
}
