/*
 * Equinix Fabric API v4
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.equinix.openapi.fabric.v4.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Virtual Connection access point type
 */
@JsonAdapter(VirtualConnectionPriceAccessPointType.Adapter.class)
public enum VirtualConnectionPriceAccessPointType {
  
  VD("VD"),
  
  SP("SP"),
  
  COLO("COLO"),
  
  CLOUD_ROUTER("CLOUD_ROUTER"),
  
  CHAINGROUP("CHAINGROUP"),
  
  NETWORK("NETWORK"),
  
  METAL_NETWORK("METAL_NETWORK");

  private String value;

  VirtualConnectionPriceAccessPointType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static VirtualConnectionPriceAccessPointType fromValue(String value) {
    for (VirtualConnectionPriceAccessPointType b : VirtualConnectionPriceAccessPointType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<VirtualConnectionPriceAccessPointType> {
    @Override
    public void write(final JsonWriter jsonWriter, final VirtualConnectionPriceAccessPointType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public VirtualConnectionPriceAccessPointType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return VirtualConnectionPriceAccessPointType.fromValue(value);
    }
  }
}

