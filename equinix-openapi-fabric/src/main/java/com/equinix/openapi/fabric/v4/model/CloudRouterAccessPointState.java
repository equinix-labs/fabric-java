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

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Access point lifecycle state
 */
public enum CloudRouterAccessPointState {
  
  PROVISIONED("PROVISIONED"),
  
  PROVISIONING("PROVISIONING"),
  
  DEPROVISIONING("DEPROVISIONING"),
  
  DEPROVISIONED("DEPROVISIONED"),
  
  LOCKED("LOCKED"),
  
  NOT_PROVISIONED("NOT_PROVISIONED"),
  
  NOT_DEPROVISIONED("NOT_DEPROVISIONED");

  private String value;

  CloudRouterAccessPointState(String value) {
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
  public static CloudRouterAccessPointState fromValue(String value) {
    for (CloudRouterAccessPointState b : CloudRouterAccessPointState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

