package com.equinix.openapi.fabric.v4.api;

import com.equinix.openapi.fabric.v4.api.dto.UserDto;
import com.equinix.openapi.fabric.v4.api.dto.port.PortDto;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

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

    public enum EnvVariable {
        QINQ_PORT("TEST_DATA_UAT_QINQ_PORT", PortDto.class),
        TEST_DATA_UAT_FCR_USER("TEST_DATA_UAT_FCR_USER", UserDto.class);

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
