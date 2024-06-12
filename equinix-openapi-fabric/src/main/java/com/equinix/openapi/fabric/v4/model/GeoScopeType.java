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
 * Geographic boundary types
 */
@JsonAdapter(GeoScopeType.Adapter.class)
public enum GeoScopeType {
  
  CANADA("CANADA"),
  
  CONUS("CONUS");

  private String value;

  GeoScopeType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static GeoScopeType fromValue(String value) {
    for (GeoScopeType b : GeoScopeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<GeoScopeType> {
    @Override
    public void write(final JsonWriter jsonWriter, final GeoScopeType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public GeoScopeType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return GeoScopeType.fromValue(value);
    }
  }
}

