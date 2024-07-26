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
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ValidateRequestFilterAnd
 */
@JsonPropertyOrder({
  ValidateRequestFilterAnd.JSON_PROPERTY_PROPERTY,
  ValidateRequestFilterAnd.JSON_PROPERTY_OPERATOR,
  ValidateRequestFilterAnd.JSON_PROPERTY_VALUES
})
@JsonTypeName("ValidateRequest_filter_and")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ValidateRequestFilterAnd {
  public static final String JSON_PROPERTY_PROPERTY = "property";
  private String property;

  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private String operator;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<String> values = new ArrayList<>();

  public ValidateRequestFilterAnd() {
  }

  public ValidateRequestFilterAnd property(String property) {
    
    this.property = property;
    return this;
  }

   /**
   * Path to property
   * @return property
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProperty() {
    return property;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProperty(String property) {
    this.property = property;
  }


  public ValidateRequestFilterAnd operator(String operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * Type of operation
   * @return operator
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOperator() {
    return operator;
  }


  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperator(String operator) {
    this.operator = operator;
  }


  public ValidateRequestFilterAnd values(List<String> values) {
    
    this.values = values;
    return this;
  }

  public ValidateRequestFilterAnd addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Values for the given property
   * @return values
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getValues() {
    return values;
  }


  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValues(List<String> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateRequestFilterAnd validateRequestFilterAnd = (ValidateRequestFilterAnd) o;
    return Objects.equals(this.property, validateRequestFilterAnd.property) &&
        Objects.equals(this.operator, validateRequestFilterAnd.operator) &&
        Objects.equals(this.values, validateRequestFilterAnd.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(property, operator, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateRequestFilterAnd {\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

