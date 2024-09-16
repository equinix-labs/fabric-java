package com.equinix.openapi.fabric.tests.helpers;

import com.equinix.openapi.fabric.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.equinix.openapi.fabric.tests.dto.users.UsersDto;
import com.equinix.openapi.fabric.tests.dto.users.UsersItem;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Random;

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

    public static int getRandomVlanNumber() {
        Random r = new Random();
        return r.ints(1, 4000).findFirst().getAsInt();
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
