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
import com.equinix.openapi.fabric.v4.model.NetworkChangeOperation;
import com.equinix.openapi.fabric.v4.model.NetworkChangeStatus;
import com.equinix.openapi.fabric.v4.model.NetworkChangeType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Current state of latest network change
 */
@JsonPropertyOrder({
  NetworkChange.JSON_PROPERTY_HREF,
  NetworkChange.JSON_PROPERTY_UUID,
  NetworkChange.JSON_PROPERTY_TYPE,
  NetworkChange.JSON_PROPERTY_STATUS,
  NetworkChange.JSON_PROPERTY_CREATED_DATE_TIME,
  NetworkChange.JSON_PROPERTY_UPDATED_DATE_TIME,
  NetworkChange.JSON_PROPERTY_DATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NetworkChange {
  public static final String JSON_PROPERTY_HREF = "href";
  private URI href;

  public static final String JSON_PROPERTY_UUID = "uuid";
  private UUID uuid;

  public static final String JSON_PROPERTY_TYPE = "type";
  private NetworkChangeType type;

  public static final String JSON_PROPERTY_STATUS = "status";
  private NetworkChangeStatus status;

  public static final String JSON_PROPERTY_CREATED_DATE_TIME = "createdDateTime";
  private OffsetDateTime createdDateTime;

  public static final String JSON_PROPERTY_UPDATED_DATE_TIME = "updatedDateTime";
  private OffsetDateTime updatedDateTime;

  public static final String JSON_PROPERTY_DATA = "data";
  private List<NetworkChangeOperation> data = new ArrayList<>();

  public NetworkChange() {
  }

  @JsonCreator
  public NetworkChange(
    @JsonProperty(JSON_PROPERTY_HREF) URI href
  ) {
    this();
    this.href = href;
  }

   /**
   * Network URI
   * @return href
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getHref() {
    return href;
  }




  public NetworkChange uuid(UUID uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Uniquely identifies a change
   * @return uuid
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getUuid() {
    return uuid;
  }


  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }


  public NetworkChange type(NetworkChangeType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkChangeType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(NetworkChangeType type) {
    this.type = type;
  }


  public NetworkChange status(NetworkChangeStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkChangeStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(NetworkChangeStatus status) {
    this.status = status;
  }


  public NetworkChange createdDateTime(OffsetDateTime createdDateTime) {
    
    this.createdDateTime = createdDateTime;
    return this;
  }

   /**
   * Set when change flow starts
   * @return createdDateTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedDateTime() {
    return createdDateTime;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedDateTime(OffsetDateTime createdDateTime) {
    this.createdDateTime = createdDateTime;
  }


  public NetworkChange updatedDateTime(OffsetDateTime updatedDateTime) {
    
    this.updatedDateTime = updatedDateTime;
    return this;
  }

   /**
   * Set when change object is updated
   * @return updatedDateTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdatedDateTime() {
    return updatedDateTime;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedDateTime(OffsetDateTime updatedDateTime) {
    this.updatedDateTime = updatedDateTime;
  }


  public NetworkChange data(List<NetworkChangeOperation> data) {
    
    this.data = data;
    return this;
  }

  public NetworkChange addDataItem(NetworkChangeOperation dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<NetworkChangeOperation> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<NetworkChangeOperation> data) {
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
    NetworkChange networkChange = (NetworkChange) o;
    return Objects.equals(this.href, networkChange.href) &&
        Objects.equals(this.uuid, networkChange.uuid) &&
        Objects.equals(this.type, networkChange.type) &&
        Objects.equals(this.status, networkChange.status) &&
        Objects.equals(this.createdDateTime, networkChange.createdDateTime) &&
        Objects.equals(this.updatedDateTime, networkChange.updatedDateTime) &&
        Objects.equals(this.data, networkChange.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, uuid, type, status, createdDateTime, updatedDateTime, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkChange {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    updatedDateTime: ").append(toIndentedString(updatedDateTime)).append("\n");
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

