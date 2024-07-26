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

import java.util.Objects;

/**
 * VirtualConnectionPriceASideAccessPointPort
 */
@JsonPropertyOrder({
  VirtualConnectionPriceASideAccessPointPort.JSON_PROPERTY_SETTINGS
})
@JsonTypeName("VirtualConnectionPriceASide_accessPoint_port")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VirtualConnectionPriceASideAccessPointPort {
  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private VirtualConnectionPriceASideAccessPointPortSettings settings;

  public VirtualConnectionPriceASideAccessPointPort() {
  }

  public VirtualConnectionPriceASideAccessPointPort settings(VirtualConnectionPriceASideAccessPointPortSettings settings) {
    
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VirtualConnectionPriceASideAccessPointPortSettings getSettings() {
    return settings;
  }


  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSettings(VirtualConnectionPriceASideAccessPointPortSettings settings) {
    this.settings = settings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualConnectionPriceASideAccessPointPort virtualConnectionPriceASideAccessPointPort = (VirtualConnectionPriceASideAccessPointPort) o;
    return Objects.equals(this.settings, virtualConnectionPriceASideAccessPointPort.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualConnectionPriceASideAccessPointPort {\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

