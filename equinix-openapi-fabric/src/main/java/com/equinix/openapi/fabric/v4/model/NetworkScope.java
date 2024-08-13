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
 * Network scope
 */
@JsonAdapter(NetworkScope.Adapter.class)
public enum NetworkScope {
  
  REGIONAL("REGIONAL"),
  
  GLOBAL("GLOBAL"),
  
  LOCAL("LOCAL");

  private String value;

  NetworkScope(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NetworkScope fromValue(String value) {
    for (NetworkScope b : NetworkScope.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<NetworkScope> {
    @Override
    public void write(final JsonWriter jsonWriter, final NetworkScope enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NetworkScope read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NetworkScope.fromValue(value);
    }
  }
}

