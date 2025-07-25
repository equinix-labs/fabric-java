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
 * Virtual Connection type
 */
@JsonAdapter(VirtualConnectionPriceConnectionType.Adapter.class)
public enum VirtualConnectionPriceConnectionType {
  
  EVPL_VC("EVPL_VC"),
  
  EPL_VC("EPL_VC"),
  
  EC_VC("EC_VC"),
  
  IP_VC("IP_VC"),
  
  VD_CHAIN_VC("VD_CHAIN_VC"),
  
  ACCESS_EPL_VC("ACCESS_EPL_VC"),
  
  EVPLAN_VC("EVPLAN_VC"),
  
  EPLAN_VC("EPLAN_VC"),
  
  IPWAN_VC("IPWAN_VC"),
  
  EVPTREE_VC("EVPTREE_VC"),
  
  EPTREE_VC("EPTREE_VC"),
  
  IA_VC("IA_VC");

  private String value;

  VirtualConnectionPriceConnectionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static VirtualConnectionPriceConnectionType fromValue(String value) {
    for (VirtualConnectionPriceConnectionType b : VirtualConnectionPriceConnectionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<VirtualConnectionPriceConnectionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final VirtualConnectionPriceConnectionType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public VirtualConnectionPriceConnectionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return VirtualConnectionPriceConnectionType.fromValue(value);
    }
  }
}

