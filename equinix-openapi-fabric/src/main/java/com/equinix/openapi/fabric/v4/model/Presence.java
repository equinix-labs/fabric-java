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
 * Presence
 */
@JsonAdapter(Presence.Adapter.class)
public enum Presence {
  
  MY_PORTS("MY_PORTS");

  private String value;

  Presence(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Presence fromValue(String value) {
    for (Presence b : Presence.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Presence> {
    @Override
    public void write(final JsonWriter jsonWriter, final Presence enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Presence read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Presence.fromValue(value);
    }
  }
}

