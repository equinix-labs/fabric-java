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
 * Gets or Sets SubscriptionStatus
 */
@JsonAdapter(SubscriptionStatus.Adapter.class)
public enum SubscriptionStatus {
  
  ACTIVE("ACTIVE"),
  
  EXPIRED("EXPIRED"),
  
  CANCELLED("CANCELLED"),
  
  GRACE_PERIOD("GRACE_PERIOD");

  private String value;

  SubscriptionStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SubscriptionStatus fromValue(String value) {
    for (SubscriptionStatus b : SubscriptionStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SubscriptionStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final SubscriptionStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SubscriptionStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SubscriptionStatus.fromValue(value);
    }
  }
}

