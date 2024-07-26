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
 * BGP action type
 */
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BGPActions fromValue(String value) {
    for (BGPActions b : BGPActions.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

