package com.equinix.openapi.fabric.v4.api.dto.port;

import com.google.gson.annotations.SerializedName;

public class VirtualDevicesItem {

    @SerializedName("orderNumber")
    private String orderNumber;

    @SerializedName("name")
    private String name;

    @SerializedName("uuid")
    private String uuid;

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getName() {
        return name;
    }

    public String getUuid() {
        return uuid;
    }
}
