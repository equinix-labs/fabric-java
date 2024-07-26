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
 * Connection action type
 */
public enum Actions {
  
  CONNECTION_CREATION_ACCEPTANCE("CONNECTION_CREATION_ACCEPTANCE"),
  
  CONNECTION_CREATION_REJECTION("CONNECTION_CREATION_REJECTION"),
  
  CONNECTION_UPDATE_ACCEPTANCE("CONNECTION_UPDATE_ACCEPTANCE"),
  
  CONNECTION_UPDATE_REJECTION("CONNECTION_UPDATE_REJECTION"),
  
  CONNECTION_DELETION_ACCEPTANCE("CONNECTION_DELETION_ACCEPTANCE"),
  
  CONNECTION_REJECTION_ACCEPTANCE("CONNECTION_REJECTION_ACCEPTANCE"),
  
  CONNECTION_UPDATE_REQUEST("CONNECTION_UPDATE_REQUEST"),
  
  MIGRATION_EVPL_VC("MIGRATION_EVPL_VC"),
  
  CONNECTION_PROVIDER_STATUS_REQUEST("CONNECTION_PROVIDER_STATUS_REQUEST"),
  
  ACCEPT_HOSTED_CONNECTION("ACCEPT_HOSTED_CONNECTION"),
  
  CANCEL_EVPL_VC_DRAFT_ORDERS("CANCEL_EVPL_VC_DRAFT_ORDERS");

  private String value;

  Actions(String value) {
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
  public static Actions fromValue(String value) {
    for (Actions b : Actions.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

