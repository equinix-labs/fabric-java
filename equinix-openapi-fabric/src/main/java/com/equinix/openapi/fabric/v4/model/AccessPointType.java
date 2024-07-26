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
 * Access point type
 */
public enum AccessPointType {
  
  VD("VD"),
  
  VG("VG"),
  
  SP("SP"),
  
  IGW("IGW"),
  
  COLO("COLO"),
  
  SUBNET("SUBNET"),
  
  CLOUD_ROUTER("CLOUD_ROUTER"),
  
  NETWORK("NETWORK"),
  
  METAL_NETWORK("METAL_NETWORK"),
  
  VPIC_INTERFACE("VPIC_INTERFACE");

  private String value;

  AccessPointType(String value) {
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
  public static AccessPointType fromValue(String value) {
    for (AccessPointType b : AccessPointType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

