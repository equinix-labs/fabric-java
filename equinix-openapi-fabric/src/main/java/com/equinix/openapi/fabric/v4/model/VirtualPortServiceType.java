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
 * Port service type. The default is managed-service provider (MSP).
 */
public enum VirtualPortServiceType {
  
  MSP("MSP"),
  
  EPL("EPL");

  private String value;

  VirtualPortServiceType(String value) {
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
  public static VirtualPortServiceType fromValue(String value) {
    for (VirtualPortServiceType b : VirtualPortServiceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

