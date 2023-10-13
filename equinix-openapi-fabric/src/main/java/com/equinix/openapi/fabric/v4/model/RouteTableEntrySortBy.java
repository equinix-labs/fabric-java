/*
 * Equinix Fabric API v4
 * Equinix Fabric is an advanced software-defined interconnection solution that enables you to directly, securely and dynamically connect to distributed infrastructure and digital ecosystems on platform Equinix via a single port, Customers can use Fabric to connect to: </br> 1. Cloud Service Providers - Clouds, network and other service providers.  </br> 2. Enterprises - Other Equinix customers, vendors and partners.  </br> 3. Myself - Another customer instance deployed at Equinix. </br>
 *
 * The version of the OpenAPI document: 4.10
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
 * Possible field names to use on sorting
 */
@JsonAdapter(RouteTableEntrySortBy.Adapter.class)
public enum RouteTableEntrySortBy {
  
  CHANGELOG_CREATEDDATETIME("/changeLog/createdDateTime"),
  
  CHANGELOG_UPDATEDDATETIME("/changeLog/updatedDateTime"),
  
  PREFIX("/prefix"),
  
  NEXTHOP("/nextHop"),
  
  CONNECTION_NAME("/connection/name"),
  
  TYPE("/type");

  private String value;

  RouteTableEntrySortBy(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RouteTableEntrySortBy fromValue(String value) {
    for (RouteTableEntrySortBy b : RouteTableEntrySortBy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<RouteTableEntrySortBy> {
    @Override
    public void write(final JsonWriter jsonWriter, final RouteTableEntrySortBy enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RouteTableEntrySortBy read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RouteTableEntrySortBy.fromValue(value);
    }
  }
}

