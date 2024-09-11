package com.equinix.openapi.fabric.tests.dto.port;

import com.google.gson.annotations.SerializedName;

public class Location {

    @SerializedName("metroName")
    private String metroName;

    @SerializedName("metroCode")
    private String metroCode;

    @SerializedName("region")
    private String region;

    @SerializedName("ibx")
    private String ibx;

    public String getMetroName() {
        return metroName;
    }

    public String getMetroCode() {
        return metroCode;
    }

    public String getRegion() {
        return region;
    }

    public String getIbx() {
        return ibx;
    }
}
