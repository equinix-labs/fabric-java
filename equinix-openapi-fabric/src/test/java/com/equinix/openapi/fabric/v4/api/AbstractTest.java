package com.equinix.openapi.fabric.v4.api;

import com.equinix.openapi.fabric.ApiClient;
import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.Configuration;
import com.equinix.openapi.fabric.Pair;
import com.equinix.openapi.fabric.v4.api.dto.TokenRequestDto;
import com.equinix.openapi.fabric.v4.api.dto.TokenResponseDto;
import com.equinix.openapi.fabric.v4.api.dto.port.PortDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractTest {
    public ApiClient generateToken() {
        ApiClient apiTokeClient = Configuration.getDefaultApiClient();

        TokenRequestDto tokenRequestDto = new TokenRequestDto()
                .setClientId(System.getProperty("clientId"))
                .setClientSecret(System.getProperty("clientSecret"))
                .setUserPassword(System.getProperty("userPassword"))
                .setUserName(System.getProperty("userName"));

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
            call = apiTokeClient.buildCall(apiTokeClient.getBasePath(), localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
                    tokenRequestDto, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, null);

            Type localVarReturnType = new TypeToken<TokenResponseDto>() {
            }.getType();
            tokenResponseDto = (TokenResponseDto) apiTokeClient.execute(call, localVarReturnType).getData();
        } catch (ApiException e) {
            throw new RuntimeException(e);
        }

        ApiClient apiClient = Configuration.getDefaultApiClient();
        apiClient.addDefaultHeader("Authorization", "Bearer " + tokenResponseDto.getAccessToken());

        return apiClient;
    }

    protected PortDto getPort(EnvVariable envVariable) {
        ObjectMapper mapper = new ObjectMapper();
        String json = System.getenv(envVariable.value);
        try {
            return mapper.readValue(json, PortDto.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected void printJson(Object object) {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        try {
            String json = ow.writeValueAsString(object);
            System.out.println(json);
        } catch (
                JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public enum EnvVariable {
        QINQ_PORT("TEST_DATA_UAT_QINQ_PORT");

        private String value;

        EnvVariable(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}
