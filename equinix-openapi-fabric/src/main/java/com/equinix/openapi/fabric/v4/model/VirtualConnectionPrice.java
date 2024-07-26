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
import java.util.UUID;

/**
 * Virtual Connection Product configuration
 */
@JsonPropertyOrder({
  VirtualConnectionPrice.JSON_PROPERTY_UUID,
  VirtualConnectionPrice.JSON_PROPERTY_TYPE,
  VirtualConnectionPrice.JSON_PROPERTY_BANDWIDTH,
  VirtualConnectionPrice.JSON_PROPERTY_A_SIDE,
  VirtualConnectionPrice.JSON_PROPERTY_Z_SIDE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VirtualConnectionPrice {
  public static final String JSON_PROPERTY_UUID = "uuid";
  private UUID uuid;

  public static final String JSON_PROPERTY_TYPE = "type";
  private VirtualConnectionPriceConnectionType type;

  public static final String JSON_PROPERTY_BANDWIDTH = "bandwidth";
  private Integer bandwidth;

  public static final String JSON_PROPERTY_A_SIDE = "aSide";
  private VirtualConnectionPriceASide aSide;

  public static final String JSON_PROPERTY_Z_SIDE = "zSide";
  private VirtualConnectionPriceZSide zSide;

  public VirtualConnectionPrice() {
  }

  public VirtualConnectionPrice uuid(UUID uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Either uuid or rest of attributes are required
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


  public VirtualConnectionPrice type(VirtualConnectionPriceConnectionType type) {
    
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

  public VirtualConnectionPriceConnectionType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(VirtualConnectionPriceConnectionType type) {
    this.type = type;
  }


  public VirtualConnectionPrice bandwidth(Integer bandwidth) {
    
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Get bandwidth
   * minimum: 0
   * @return bandwidth
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BANDWIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBandwidth() {
    return bandwidth;
  }


  @JsonProperty(JSON_PROPERTY_BANDWIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
  }


  public VirtualConnectionPrice aSide(VirtualConnectionPriceASide aSide) {
    
    this.aSide = aSide;
    return this;
  }

   /**
   * Get aSide
   * @return aSide
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_A_SIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VirtualConnectionPriceASide getaSide() {
    return aSide;
  }


  @JsonProperty(JSON_PROPERTY_A_SIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setaSide(VirtualConnectionPriceASide aSide) {
    this.aSide = aSide;
  }


  public VirtualConnectionPrice zSide(VirtualConnectionPriceZSide zSide) {
    
    this.zSide = zSide;
    return this;
  }

   /**
   * Get zSide
   * @return zSide
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_Z_SIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VirtualConnectionPriceZSide getzSide() {
    return zSide;
  }


  @JsonProperty(JSON_PROPERTY_Z_SIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setzSide(VirtualConnectionPriceZSide zSide) {
    this.zSide = zSide;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualConnectionPrice virtualConnectionPrice = (VirtualConnectionPrice) o;
    return Objects.equals(this.uuid, virtualConnectionPrice.uuid) &&
        Objects.equals(this.type, virtualConnectionPrice.type) &&
        Objects.equals(this.bandwidth, virtualConnectionPrice.bandwidth) &&
        Objects.equals(this.aSide, virtualConnectionPrice.aSide) &&
        Objects.equals(this.zSide, virtualConnectionPrice.zSide);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, type, bandwidth, aSide, zSide);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualConnectionPrice {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    aSide: ").append(toIndentedString(aSide)).append("\n");
    sb.append("    zSide: ").append(toIndentedString(zSide)).append("\n");
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

