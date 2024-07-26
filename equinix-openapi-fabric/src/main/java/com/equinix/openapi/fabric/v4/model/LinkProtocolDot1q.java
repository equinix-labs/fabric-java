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
import com.equinix.openapi.fabric.v4.model.LinkProtocolType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Connection link protocol configuration - DOT1Q
 */
@JsonPropertyOrder({
  LinkProtocolDot1q.JSON_PROPERTY_TYPE,
  LinkProtocolDot1q.JSON_PROPERTY_TAG_PROTOCOL_ID,
  LinkProtocolDot1q.JSON_PROPERTY_VLAN_TAG,
  LinkProtocolDot1q.JSON_PROPERTY_VLAN_TAG_MIN,
  LinkProtocolDot1q.JSON_PROPERTY_VLAN_TAG_MAX
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LinkProtocolDot1q {
  public static final String JSON_PROPERTY_TYPE = "type";
  private LinkProtocolType type;

  public static final String JSON_PROPERTY_TAG_PROTOCOL_ID = "tagProtocolId";
  private String tagProtocolId;

  public static final String JSON_PROPERTY_VLAN_TAG = "vlanTag";
  private String vlanTag;

  public static final String JSON_PROPERTY_VLAN_TAG_MIN = "vlanTagMin";
  private Integer vlanTagMin;

  public static final String JSON_PROPERTY_VLAN_TAG_MAX = "vlanTagMax";
  private Integer vlanTagMax;

  public LinkProtocolDot1q() {
  }

  public LinkProtocolDot1q type(LinkProtocolType type) {
    
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

  public LinkProtocolType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(LinkProtocolType type) {
    this.type = type;
  }


  public LinkProtocolDot1q tagProtocolId(String tagProtocolId) {
    
    this.tagProtocolId = tagProtocolId;
    return this;
  }

   /**
   * Tag protocol identifier
   * @return tagProtocolId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG_PROTOCOL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTagProtocolId() {
    return tagProtocolId;
  }


  @JsonProperty(JSON_PROPERTY_TAG_PROTOCOL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTagProtocolId(String tagProtocolId) {
    this.tagProtocolId = tagProtocolId;
  }


  public LinkProtocolDot1q vlanTag(String vlanTag) {
    
    this.vlanTag = vlanTag;
    return this;
  }

   /**
   * VLAN tag
   * @return vlanTag
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VLAN_TAG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVlanTag() {
    return vlanTag;
  }


  @JsonProperty(JSON_PROPERTY_VLAN_TAG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVlanTag(String vlanTag) {
    this.vlanTag = vlanTag;
  }


  public LinkProtocolDot1q vlanTagMin(Integer vlanTagMin) {
    
    this.vlanTagMin = vlanTagMin;
    return this;
  }

   /**
   * VLAN tag Min value specified for DOT1Q connections
   * @return vlanTagMin
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VLAN_TAG_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVlanTagMin() {
    return vlanTagMin;
  }


  @JsonProperty(JSON_PROPERTY_VLAN_TAG_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVlanTagMin(Integer vlanTagMin) {
    this.vlanTagMin = vlanTagMin;
  }


  public LinkProtocolDot1q vlanTagMax(Integer vlanTagMax) {
    
    this.vlanTagMax = vlanTagMax;
    return this;
  }

   /**
   * VLAN tag Max value specified for DOT1Q connections
   * @return vlanTagMax
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VLAN_TAG_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVlanTagMax() {
    return vlanTagMax;
  }


  @JsonProperty(JSON_PROPERTY_VLAN_TAG_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVlanTagMax(Integer vlanTagMax) {
    this.vlanTagMax = vlanTagMax;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkProtocolDot1q linkProtocolDot1q = (LinkProtocolDot1q) o;
    return Objects.equals(this.type, linkProtocolDot1q.type) &&
        Objects.equals(this.tagProtocolId, linkProtocolDot1q.tagProtocolId) &&
        Objects.equals(this.vlanTag, linkProtocolDot1q.vlanTag) &&
        Objects.equals(this.vlanTagMin, linkProtocolDot1q.vlanTagMin) &&
        Objects.equals(this.vlanTagMax, linkProtocolDot1q.vlanTagMax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, tagProtocolId, vlanTag, vlanTagMin, vlanTagMax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkProtocolDot1q {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    tagProtocolId: ").append(toIndentedString(tagProtocolId)).append("\n");
    sb.append("    vlanTag: ").append(toIndentedString(vlanTag)).append("\n");
    sb.append("    vlanTagMin: ").append(toIndentedString(vlanTagMin)).append("\n");
    sb.append("    vlanTagMax: ").append(toIndentedString(vlanTagMax)).append("\n");
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

