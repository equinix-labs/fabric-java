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
 * Possible field names to use on filters
 */
public enum NetworkSearchFieldName {
  
  NAME("/name"),
  
  UUID("/uuid"),
  
  SCOPE("/scope"),
  
  TYPE("/type"),
  
  OPERATION_EQUINIXSTATUS("/operation/equinixStatus"),
  
  LOCATION_REGION("/location/region"),
  
  PROJECT_PROJECTID("/project/projectId"),
  
  ACCOUNT_GLOBALCUSTID("/account/globalCustId"),
  
  ACCOUNT_ORGID("/account/orgId"),
  
  DELETEDDATE("/deletedDate"),
  
  STAR("/_*");

  private String value;

  NetworkSearchFieldName(String value) {
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
  public static NetworkSearchFieldName fromValue(String value) {
    for (NetworkSearchFieldName b : NetworkSearchFieldName.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

