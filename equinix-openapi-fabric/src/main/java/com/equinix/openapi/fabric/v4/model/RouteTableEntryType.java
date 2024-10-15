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
 * Route table entry type
 */
@JsonAdapter(RouteTableEntryType.Adapter.class)
public enum RouteTableEntryType {
  
  IPV4_BGP_ROUTE("IPv4_BGP_ROUTE"),
  
  IPV4_STATIC_ROUTE("IPv4_STATIC_ROUTE"),
  
  IPV4_DIRECT_ROUTE("IPv4_DIRECT_ROUTE"),
  
  IPV6_BGP_ROUTE("IPv6_BGP_ROUTE"),
  
  IPV6_STATIC_ROUTE("IPv6_STATIC_ROUTE"),
  
  IPV6_DIRECT_ROUTE("IPv6_DIRECT_ROUTE");

  private String value;

  RouteTableEntryType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RouteTableEntryType fromValue(String value) {
    for (RouteTableEntryType b : RouteTableEntryType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<RouteTableEntryType> {
    @Override
    public void write(final JsonWriter jsonWriter, final RouteTableEntryType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RouteTableEntryType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RouteTableEntryType.fromValue(value);
    }
  }
}

