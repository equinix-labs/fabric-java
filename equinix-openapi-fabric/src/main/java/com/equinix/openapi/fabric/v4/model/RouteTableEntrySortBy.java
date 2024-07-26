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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Possible field names to use on sorting
 */
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static RouteTableEntrySortBy fromValue(String value) {
    for (RouteTableEntrySortBy b : RouteTableEntrySortBy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

