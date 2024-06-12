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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Route Filter status
 */
@JsonAdapter(RouteFilterState.Adapter.class)
public enum RouteFilterState {
  
  PROVISIONING("PROVISIONING"),
  
  REPROVISIONING("REPROVISIONING"),
  
  DEPROVISIONING("DEPROVISIONING"),
  
  PROVISIONED("PROVISIONED"),
  
  DEPROVISIONED("DEPROVISIONED"),
  
  NOT_PROVISIONED("NOT_PROVISIONED"),
  
  NOT_DEPROVISIONED("NOT_DEPROVISIONED");

  private String value;

  RouteFilterState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RouteFilterState fromValue(String value) {
    for (RouteFilterState b : RouteFilterState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<RouteFilterState> {
    @Override
    public void write(final JsonWriter jsonWriter, final RouteFilterState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RouteFilterState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RouteFilterState.fromValue(value);
    }
  }
}

