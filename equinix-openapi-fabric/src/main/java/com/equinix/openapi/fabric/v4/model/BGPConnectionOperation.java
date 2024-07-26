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

import com.fasterxml.jackson.annotation.*;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * BGP IPv4 or IPv6 Connection State operational data
 */
@JsonPropertyOrder({
  BGPConnectionOperation.JSON_PROPERTY_OPERATIONAL_STATUS,
  BGPConnectionOperation.JSON_PROPERTY_OP_STATUS_CHANGED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BGPConnectionOperation {
  /**
   * BGP IPv4 or IPv6 Connection State operational status
   */
  public enum OperationalStatusEnum {
    UP("UP"),
    
    DOWN("DOWN"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    OperationalStatusEnum(String value) {
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
    public static OperationalStatusEnum fromValue(String value) {
      for (OperationalStatusEnum b : OperationalStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_OPERATIONAL_STATUS = "operationalStatus";
  private OperationalStatusEnum operationalStatus;

  public static final String JSON_PROPERTY_OP_STATUS_CHANGED_AT = "opStatusChangedAt";
  private OffsetDateTime opStatusChangedAt;

  public BGPConnectionOperation() {
  }

  public BGPConnectionOperation operationalStatus(OperationalStatusEnum operationalStatus) {
    
    this.operationalStatus = operationalStatus;
    return this;
  }

   /**
   * BGP IPv4 or IPv6 Connection State operational status
   * @return operationalStatus
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATIONAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OperationalStatusEnum getOperationalStatus() {
    return operationalStatus;
  }


  @JsonProperty(JSON_PROPERTY_OPERATIONAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperationalStatus(OperationalStatusEnum operationalStatus) {
    this.operationalStatus = operationalStatus;
  }


  public BGPConnectionOperation opStatusChangedAt(OffsetDateTime opStatusChangedAt) {
    
    this.opStatusChangedAt = opStatusChangedAt;
    return this;
  }

   /**
   * Last BGP State Update by Date and Time
   * @return opStatusChangedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OP_STATUS_CHANGED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getOpStatusChangedAt() {
    return opStatusChangedAt;
  }


  @JsonProperty(JSON_PROPERTY_OP_STATUS_CHANGED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpStatusChangedAt(OffsetDateTime opStatusChangedAt) {
    this.opStatusChangedAt = opStatusChangedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BGPConnectionOperation bgPConnectionOperation = (BGPConnectionOperation) o;
    return Objects.equals(this.operationalStatus, bgPConnectionOperation.operationalStatus) &&
        Objects.equals(this.opStatusChangedAt, bgPConnectionOperation.opStatusChangedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationalStatus, opStatusChangedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BGPConnectionOperation {\n");
    sb.append("    operationalStatus: ").append(toIndentedString(operationalStatus)).append("\n");
    sb.append("    opStatusChangedAt: ").append(toIndentedString(opStatusChangedAt)).append("\n");
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

