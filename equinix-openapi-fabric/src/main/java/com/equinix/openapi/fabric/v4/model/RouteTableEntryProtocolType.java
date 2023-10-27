/*
 * Equinix Fabric API v4
 * Equinix Fabric is an advanced software-defined interconnection solution that enables you to directly, securely and dynamically connect to distributed infrastructure and digital ecosystems on platform Equinix via a single port, Customers can use Fabric to connect to: </br> 1. Cloud Service Providers - Clouds, network and other service providers.  </br> 2. Enterprises - Other Equinix customers, vendors and partners.  </br> 3. Myself - Another customer instance deployed at Equinix. </br>
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
 * Route table entry protocol type
 */
@JsonAdapter(RouteTableEntryProtocolType.Adapter.class)
public enum RouteTableEntryProtocolType {
  
  BGP("BGP"),
  
  STATIC("STATIC"),
  
  DIRECT("DIRECT");

  private String value;

  RouteTableEntryProtocolType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RouteTableEntryProtocolType fromValue(String value) {
    for (RouteTableEntryProtocolType b : RouteTableEntryProtocolType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<RouteTableEntryProtocolType> {
    @Override
    public void write(final JsonWriter jsonWriter, final RouteTableEntryProtocolType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RouteTableEntryProtocolType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RouteTableEntryProtocolType.fromValue(value);
    }
  }
}

