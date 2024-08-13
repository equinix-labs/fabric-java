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
 * Direction of traffic from the requester&#39;s viewpoint.
 */
@JsonAdapter(QueryDirection.Adapter.class)
public enum QueryDirection {
  
  INBOUND("inbound"),
  
  OUTBOUND("outbound");

  private String value;

  QueryDirection(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QueryDirection fromValue(String value) {
    for (QueryDirection b : QueryDirection.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QueryDirection> {
    @Override
    public void write(final JsonWriter jsonWriter, final QueryDirection enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QueryDirection read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QueryDirection.fromValue(value);
    }
  }
}

