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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Search requests containing criteria
 */
@JsonPropertyOrder({
  CloudRouterSearchRequest.JSON_PROPERTY_FILTER,
  CloudRouterSearchRequest.JSON_PROPERTY_PAGINATION,
  CloudRouterSearchRequest.JSON_PROPERTY_SORT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CloudRouterSearchRequest {
  public static final String JSON_PROPERTY_FILTER = "filter";
  private CloudRouterFilters filter;

  public static final String JSON_PROPERTY_PAGINATION = "pagination";
  private PaginationRequest pagination;

  public static final String JSON_PROPERTY_SORT = "sort";
  private List<CloudRouterSortCriteria> sort = new ArrayList<>();

  public CloudRouterSearchRequest() {
  }

  public CloudRouterSearchRequest filter(CloudRouterFilters filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CloudRouterFilters getFilter() {
    return filter;
  }


  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilter(CloudRouterFilters filter) {
    this.filter = filter;
  }


  public CloudRouterSearchRequest pagination(PaginationRequest pagination) {
    
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

  public PaginationRequest getPagination() {
    return pagination;
  }


  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPagination(PaginationRequest pagination) {
    this.pagination = pagination;
  }


  public CloudRouterSearchRequest sort(List<CloudRouterSortCriteria> sort) {
    
    this.sort = sort;
    return this;
  }

  public CloudRouterSearchRequest addSortItem(CloudRouterSortCriteria sortItem) {
    if (this.sort == null) {
      this.sort = new ArrayList<>();
    }
    this.sort.add(sortItem);
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CloudRouterSortCriteria> getSort() {
    return sort;
  }


  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSort(List<CloudRouterSortCriteria> sort) {
    this.sort = sort;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudRouterSearchRequest cloudRouterSearchRequest = (CloudRouterSearchRequest) o;
    return Objects.equals(this.filter, cloudRouterSearchRequest.filter) &&
        Objects.equals(this.pagination, cloudRouterSearchRequest.pagination) &&
        Objects.equals(this.sort, cloudRouterSearchRequest.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, pagination, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudRouterSearchRequest {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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

