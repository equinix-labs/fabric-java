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
import com.equinix.openapi.fabric.v4.model.RouteTableEntrySimpleExpression;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RouteTableEntryOrFilter
 */
@JsonPropertyOrder({
  RouteTableEntryOrFilter.JSON_PROPERTY_OR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RouteTableEntryOrFilter {
  public static final String JSON_PROPERTY_OR = "or";
  private List<RouteTableEntrySimpleExpression> or = new ArrayList<>();

  public RouteTableEntryOrFilter() {
  }

  public RouteTableEntryOrFilter or(List<RouteTableEntrySimpleExpression> or) {
    
    this.or = or;
    return this;
  }

  public RouteTableEntryOrFilter addOrItem(RouteTableEntrySimpleExpression orItem) {
    if (this.or == null) {
      this.or = new ArrayList<>();
    }
    this.or.add(orItem);
    return this;
  }

   /**
   * Get or
   * @return or
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RouteTableEntrySimpleExpression> getOr() {
    return or;
  }


  @JsonProperty(JSON_PROPERTY_OR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOr(List<RouteTableEntrySimpleExpression> or) {
    this.or = or;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteTableEntryOrFilter routeTableEntryOrFilter = (RouteTableEntryOrFilter) o;
    return Objects.equals(this.or, routeTableEntryOrFilter.or);
  }

  @Override
  public int hashCode() {
    return Objects.hash(or);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteTableEntryOrFilter {\n");
    sb.append("    or: ").append(toIndentedString(or)).append("\n");
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

