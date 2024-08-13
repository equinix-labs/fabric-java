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
 * Cloud Router action type
 */
@JsonAdapter(CloudRouterActionType.Adapter.class)
public enum CloudRouterActionType {
  
  BGP_SESSION_STATUS_UPDATE("BGP_SESSION_STATUS_UPDATE"),
  
  ROUTE_TABLE_ENTRY_UPDATE("ROUTE_TABLE_ENTRY_UPDATE");

  private String value;

  CloudRouterActionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CloudRouterActionType fromValue(String value) {
    for (CloudRouterActionType b : CloudRouterActionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CloudRouterActionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CloudRouterActionType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CloudRouterActionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CloudRouterActionType.fromValue(value);
    }
  }
}

