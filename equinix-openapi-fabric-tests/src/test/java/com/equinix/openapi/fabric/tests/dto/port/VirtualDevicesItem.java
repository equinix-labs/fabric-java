package com.equinix.openapi.fabric.tests.dto.port;

import com.google.gson.annotations.SerializedName;

import java.util.UUID;

public class VirtualDevicesItem {

    @SerializedName("orderNumber")
    private String orderNumber;

    @SerializedName("name")
    private String name;

    @SerializedName("uuid")
    private UUID uuid;

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getName() {
        return name;
    }

    public UUID getUuid() {
        return uuid;
    }
}
