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
 * Type of Port
 */
@JsonAdapter(PortType.Adapter.class)
public enum PortType {
  
  XF_PORT("XF_PORT"),
  
  IX_PORT("IX_PORT");

  private String value;

  PortType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PortType fromValue(String value) {
    for (PortType b : PortType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PortType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PortType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PortType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PortType.fromValue(value);
    }
  }
}

