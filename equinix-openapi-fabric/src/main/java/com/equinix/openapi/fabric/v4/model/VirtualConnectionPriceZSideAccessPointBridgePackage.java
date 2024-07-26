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
 * VirtualConnectionPriceZSideAccessPointBridgePackage
 */
@JsonPropertyOrder({
  VirtualConnectionPriceZSideAccessPointBridgePackage.JSON_PROPERTY_CODE
})
@JsonTypeName("VirtualConnectionPriceZSide_accessPoint_bridge_package")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VirtualConnectionPriceZSideAccessPointBridgePackage {
  public static final String JSON_PROPERTY_CODE = "code";
  private VirtualConnectionBridgePackageCode code;

  public VirtualConnectionPriceZSideAccessPointBridgePackage() {
  }

  public VirtualConnectionPriceZSideAccessPointBridgePackage code(VirtualConnectionBridgePackageCode code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VirtualConnectionBridgePackageCode getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(VirtualConnectionBridgePackageCode code) {
    this.code = code;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualConnectionPriceZSideAccessPointBridgePackage virtualConnectionPriceZSideAccessPointBridgePackage = (VirtualConnectionPriceZSideAccessPointBridgePackage) o;
    return Objects.equals(this.code, virtualConnectionPriceZSideAccessPointBridgePackage.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualConnectionPriceZSideAccessPointBridgePackage {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

