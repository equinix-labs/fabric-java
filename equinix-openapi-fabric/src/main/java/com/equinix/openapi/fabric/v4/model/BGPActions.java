/*
 * Equinix Fabric API v4
 * Equinix Fabric is an advanced software-defined interconnection solution that enables you to directly, securely and dynamically connect to distributed infrastructure and digital ecosystems on platform Equinix via a single port, Customers can use Fabric to connect to: </br> 1. Cloud Service Providers - Clouds, network and other service providers.  </br> 2. Enterprises - Other Equinix customers, vendors and partners.  </br> 3. Myself - Another customer instance deployed at Equinix. </br>
 *
 * The version of the OpenAPI document: 4.8
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
 * BGP action type
 */
@JsonAdapter(BGPActions.Adapter.class)
public enum BGPActions {
  
  CLEAR_BGPIPV4("CLEAR_BGPIPV4"),
  
  CLEAR_BGPIPV6("CLEAR_BGPIPV6"),
  
  CLEAR_BGPIPV4_INBOUND("CLEAR_BGPIPV4_INBOUND"),
  
  CLEAR_BGPIPV6_INBOUND("CLEAR_BGPIPV6_INBOUND"),
  
  RESET_BGPIPV4("RESET_BGPIPV4"),
  
  RESET_BGPIPV6("RESET_BGPIPV6");

  private String value;

  BGPActions(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BGPActions fromValue(String value) {
    for (BGPActions b : BGPActions.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BGPActions> {
    @Override
    public void write(final JsonWriter jsonWriter, final BGPActions enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BGPActions read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BGPActions.fromValue(value);
    }
  }
}

