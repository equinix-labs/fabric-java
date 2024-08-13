package com.equinix.openapi.fabric.v4.api;

import com.equinix.openapi.fabric.JSON;
import com.equinix.openapi.fabric.v4.api.dto.port.PortDto;
import com.equinix.openapi.fabric.v4.api.dto.users.UsersDto;
import com.equinix.openapi.fabric.v4.api.dto.users.UsersItem;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.NoSuchElementException;

public class Utils {

    public static Object getEnvData(EnvVariable envVariable) {
        ObjectMapper mapper = new ObjectMapper();
        String json = System.getenv(envVariable.value);
        try {
            return mapper.readValue(json, envVariable.clazz);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static UsersItem getUserData(UsersItem.UserName userName) {
        return ((UsersDto) getEnvData(EnvVariable.TEST_DATA_UAT_USERS)).getUsers().stream()
                .filter(usersItem -> usersItem.getName().equals(userName.getValue()))
                .findFirst().orElseThrow(() -> new NoSuchElementException("User not found"));
    }

    public static void printJson(Object object) {
        System.out.println(JSON.getGson().toJson(object));
    }

    public enum EnvVariable {
        TEST_DATA_UAT_USERS("TEST_DATA_UAT_USERS", UsersDto.class);

        private String value;
        private Class<?> clazz;

        EnvVariable(String value, Class<?> clazz) {
            this.value = value;
            this.clazz = clazz;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}
