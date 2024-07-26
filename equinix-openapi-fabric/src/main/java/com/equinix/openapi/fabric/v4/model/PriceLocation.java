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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PriceLocation
 */
@JsonPropertyOrder({
  PriceLocation.JSON_PROPERTY_METRO_CODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PriceLocation {
  public static final String JSON_PROPERTY_METRO_CODE = "metroCode";
  private String metroCode;

  public PriceLocation() {
  }

  public PriceLocation metroCode(String metroCode) {
    
    this.metroCode = metroCode;
    return this;
  }

   /**
   * Get metroCode
   * @return metroCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRO_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMetroCode() {
    return metroCode;
  }


  @JsonProperty(JSON_PROPERTY_METRO_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetroCode(String metroCode) {
    this.metroCode = metroCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceLocation priceLocation = (PriceLocation) o;
    return Objects.equals(this.metroCode, priceLocation.metroCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metroCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceLocation {\n");
    sb.append("    metroCode: ").append(toIndentedString(metroCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

