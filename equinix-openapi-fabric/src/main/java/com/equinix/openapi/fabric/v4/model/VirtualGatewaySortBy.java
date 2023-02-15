/*
 * Equinix Fabric API v4
 * Equinix Fabric is an advanced software-defined interconnection solution that enables you to directly, securely and dynamically connect to distributed infrastructure and digital ecosystems on platform Equinix via a single port, Customers can use Fabric to connect to: </br> 1. Cloud Service Providers - Clouds, network and other service providers.  </br> 2. Enterprises - Other Equinix customers, vendors and partners.  </br> 3. Myself - Another customer instance deployed at Equinix. </br>
 *
 * The version of the OpenAPI document: 4.4
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
@JsonAdapter(VirtualGatewaySortBy.Adapter.class)
public enum VirtualGatewaySortBy {
  
  NAME("/name"),
  
  UUID("/uuid"),
  
  STATE("/state"),
  
  LOCATION_METROCODE("/location/metroCode"),
  
  LOCATION_METRONAME("/location/metroName"),
  
  PACKAGE_CODE("/package/code"),
  
  CHANGELOG_CREATEDDATETIME("/changeLog/createdDateTime"),
  
  CHANGELOG_UPDATEDDATETIME("/changeLog/updatedDateTime");

  private String value;

  VirtualGatewaySortBy(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static VirtualGatewaySortBy fromValue(String value) {
    for (VirtualGatewaySortBy b : VirtualGatewaySortBy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<VirtualGatewaySortBy> {
    @Override
    public void write(final JsonWriter jsonWriter, final VirtualGatewaySortBy enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public VirtualGatewaySortBy read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return VirtualGatewaySortBy.fromValue(value);
    }
  }
}
