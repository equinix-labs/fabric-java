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
 * metric interval
 */
@JsonAdapter(MetricInterval.Adapter.class)
public enum MetricInterval {
  
  P7D("P7D");

  private String value;

  MetricInterval(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MetricInterval fromValue(String value) {
    for (MetricInterval b : MetricInterval.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<MetricInterval> {
    @Override
    public void write(final JsonWriter jsonWriter, final MetricInterval enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MetricInterval read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return MetricInterval.fromValue(value);
    }
  }
}

