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
 * Possible field names to use on sorting
 */
@JsonAdapter(NetworkSortByResponse.Adapter.class)
public enum NetworkSortByResponse {
  
  NAME("/name"),
  
  TYPE("/type"),
  
  UUID("/uuid"),
  
  STATE("/state"),
  
  SCOPE("/scope"),
  
  LOCATION_REGION("/location/region"),
  
  CHANGELOG_CREATEDDATETIME("/changeLog/createdDateTime"),
  
  CHANGELOG_UPDATEDDATETIME("/changeLog/updatedDateTime");

  private String value;

  NetworkSortByResponse(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NetworkSortByResponse fromValue(String value) {
    for (NetworkSortByResponse b : NetworkSortByResponse.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<NetworkSortByResponse> {
    @Override
    public void write(final JsonWriter jsonWriter, final NetworkSortByResponse enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NetworkSortByResponse read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NetworkSortByResponse.fromValue(value);
    }
  }
}

