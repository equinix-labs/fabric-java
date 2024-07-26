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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;

/**
 * NetworkSortCriteriaResponse
 */
@JsonPropertyOrder({
  NetworkSortCriteriaResponse.JSON_PROPERTY_DIRECTION,
  NetworkSortCriteriaResponse.JSON_PROPERTY_PROPERTY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NetworkSortCriteriaResponse {
  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private NetworkSortDirectionResponse direction = NetworkSortDirectionResponse.DESC;

  public static final String JSON_PROPERTY_PROPERTY = "property";
  private NetworkSortByResponse property = NetworkSortByResponse.CHANGELOG_UPDATEDDATETIME;

  public NetworkSortCriteriaResponse() {
  }

  public NetworkSortCriteriaResponse direction(NetworkSortDirectionResponse direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkSortDirectionResponse getDirection() {
    return direction;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirection(NetworkSortDirectionResponse direction) {
    this.direction = direction;
  }


  public NetworkSortCriteriaResponse property(NetworkSortByResponse property) {
    
    this.property = property;
    return this;
  }

   /**
   * Get property
   * @return property
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkSortByResponse getProperty() {
    return property;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProperty(NetworkSortByResponse property) {
    this.property = property;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkSortCriteriaResponse networkSortCriteriaResponse = (NetworkSortCriteriaResponse) o;
    return Objects.equals(this.direction, networkSortCriteriaResponse.direction) &&
        Objects.equals(this.property, networkSortCriteriaResponse.property);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, property);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkSortCriteriaResponse {\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
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

