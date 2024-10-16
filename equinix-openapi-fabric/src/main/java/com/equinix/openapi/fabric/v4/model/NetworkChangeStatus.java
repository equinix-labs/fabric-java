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
 * Current outcome of the change flow
 */
@JsonAdapter(NetworkChangeStatus.Adapter.class)
public enum NetworkChangeStatus {
  
  APPROVED("APPROVED"),
  
  COMPLETED("COMPLETED"),
  
  FAILED("FAILED"),
  
  REJECTED("REJECTED"),
  
  REQUESTED("REQUESTED"),
  
  SUBMITTED_FOR_APPROVAL("SUBMITTED_FOR_APPROVAL");

  private String value;

  NetworkChangeStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NetworkChangeStatus fromValue(String value) {
    for (NetworkChangeStatus b : NetworkChangeStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<NetworkChangeStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final NetworkChangeStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NetworkChangeStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NetworkChangeStatus.fromValue(value);
    }
  }
}

