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
 * Precision Packages
 */
@JsonPropertyOrder({
  PrecisionTimeServicePackagesResponse.JSON_PROPERTY_PAGINATION,
  PrecisionTimeServicePackagesResponse.JSON_PROPERTY_DATA
})
@JsonTypeName("precisionTimeServicePackagesResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PrecisionTimeServicePackagesResponse {
  public static final String JSON_PROPERTY_PAGINATION = "pagination";
  private Pagination pagination;

  public static final String JSON_PROPERTY_DATA = "data";
  private List<PrecisionTimePackageResponse> data = new ArrayList<>();

  public PrecisionTimeServicePackagesResponse() {
  }

  public PrecisionTimeServicePackagesResponse pagination(Pagination pagination) {
    
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Pagination getPagination() {
    return pagination;
  }


  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }


  public PrecisionTimeServicePackagesResponse data(List<PrecisionTimePackageResponse> data) {
    
    this.data = data;
    return this;
  }

  public PrecisionTimeServicePackagesResponse addDataItem(PrecisionTimePackageResponse dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Data returned from the API call
   * @return data
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PrecisionTimePackageResponse> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<PrecisionTimePackageResponse> data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrecisionTimeServicePackagesResponse precisionTimeServicePackagesResponse = (PrecisionTimeServicePackagesResponse) o;
    return Objects.equals(this.pagination, precisionTimeServicePackagesResponse.pagination) &&
        Objects.equals(this.data, precisionTimeServicePackagesResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrecisionTimeServicePackagesResponse {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

