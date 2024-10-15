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
@JsonAdapter(CloudRouterActionsSearchSortBy.Adapter.class)
public enum CloudRouterActionsSearchSortBy {
  
  CHANGELOG_CREATEDDATETIME("/changeLog/createdDateTime"),
  
  CHANGELOG_UPDATEDDATETIME("/changeLog/updatedDateTime"),
  
  CONNECTION_NAME("/connection/name"),
  
  TYPE("/type");

  private String value;

  CloudRouterActionsSearchSortBy(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CloudRouterActionsSearchSortBy fromValue(String value) {
    for (CloudRouterActionsSearchSortBy b : CloudRouterActionsSearchSortBy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CloudRouterActionsSearchSortBy> {
    @Override
    public void write(final JsonWriter jsonWriter, final CloudRouterActionsSearchSortBy enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CloudRouterActionsSearchSortBy read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CloudRouterActionsSearchSortBy.fromValue(value);
    }
  }
}

