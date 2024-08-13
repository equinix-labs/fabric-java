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
 * Duration of the statistical analysis interval.
 */
@JsonAdapter(Duration.Adapter.class)
public enum Duration {
  
  P7D("P7D"),
  
  P1M("P1M"),
  
  P3M("P3M");

  private String value;

  Duration(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Duration fromValue(String value) {
    for (Duration b : Duration.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Duration> {
    @Override
    public void write(final JsonWriter jsonWriter, final Duration enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Duration read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Duration.fromValue(value);
    }
  }
}

