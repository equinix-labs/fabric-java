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
 * Cloud Router package code
 */
@JsonAdapter(Code.Adapter.class)
public enum Code {
  
  LAB("LAB"),
  
  ADVANCED("ADVANCED"),
  
  STANDARD("STANDARD"),
  
  PREMIUM("PREMIUM");

  private String value;

  Code(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Code fromValue(String value) {
    for (Code b : Code.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Code> {
    @Override
    public void write(final JsonWriter jsonWriter, final Code enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Code read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Code.fromValue(value);
    }
  }
}

