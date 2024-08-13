/*
 * Equinix Fabric API v4
 *
 * Contact: api-support@equinix.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.equinix.openapi.fabric.v4.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Connection type
 */
@JsonAdapter(ConnectionType.Adapter.class)
public enum ConnectionType {
  
  EVPL_VC("EVPL_VC"),
  
  EPL_VC("EPL_VC"),
  
  EC_VC("EC_VC"),
  
  IP_VC("IP_VC"),
  
  ACCESS_EPL_VC("ACCESS_EPL_VC"),
  
  EIA_VC("EIA_VC"),
  
  EVPLAN_VC("EVPLAN_VC"),
  
  EPLAN_VC("EPLAN_VC"),
  
  IPWAN_VC("IPWAN_VC"),
  
  IA_VC("IA_VC");

  private String value;

  ConnectionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConnectionType fromValue(String value) {
    for (ConnectionType b : ConnectionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ConnectionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ConnectionType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ConnectionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ConnectionType.fromValue(value);
    }
  }
}

