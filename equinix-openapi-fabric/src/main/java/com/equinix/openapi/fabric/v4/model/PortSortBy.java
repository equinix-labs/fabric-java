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
 * Possible field names to use on sorting
 */
@JsonAdapter(PortSortBy.Adapter.class)
public enum PortSortBy {
  
  _DEVICE_NAME("/device/name");

  private String value;

  PortSortBy(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PortSortBy fromValue(String value) {
    for (PortSortBy b : PortSortBy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PortSortBy> {
    @Override
    public void write(final JsonWriter jsonWriter, final PortSortBy enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PortSortBy read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PortSortBy.fromValue(value);
    }
  }
}

