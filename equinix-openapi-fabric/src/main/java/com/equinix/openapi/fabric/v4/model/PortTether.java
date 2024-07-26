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

/**
 * Port physical connection
 */
@JsonPropertyOrder({
  PortTether.JSON_PROPERTY_CROSS_CONNECT_ID,
  PortTether.JSON_PROPERTY_CABINET_NUMBER,
  PortTether.JSON_PROPERTY_SYSTEM_NAME,
  PortTether.JSON_PROPERTY_PATCH_PANEL,
  PortTether.JSON_PROPERTY_PATCH_PANEL_PORT_A,
  PortTether.JSON_PROPERTY_PATCH_PANEL_PORT_B,
  PortTether.JSON_PROPERTY_IBX
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PortTether {
  public static final String JSON_PROPERTY_CROSS_CONNECT_ID = "crossConnectId";
  private String crossConnectId;

  public static final String JSON_PROPERTY_CABINET_NUMBER = "cabinetNumber";
  private String cabinetNumber;

  public static final String JSON_PROPERTY_SYSTEM_NAME = "systemName";
  private String systemName;

  public static final String JSON_PROPERTY_PATCH_PANEL = "patchPanel";
  private String patchPanel;

  public static final String JSON_PROPERTY_PATCH_PANEL_PORT_A = "patchPanelPortA";
  private String patchPanelPortA;

  public static final String JSON_PROPERTY_PATCH_PANEL_PORT_B = "patchPanelPortB";
  private String patchPanelPortB;

  public static final String JSON_PROPERTY_IBX = "ibx";
  private String ibx;

  public PortTether() {
  }

  public PortTether crossConnectId(String crossConnectId) {
    
    this.crossConnectId = crossConnectId;
    return this;
  }

   /**
   * Port cross connect identifier
   * @return crossConnectId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CROSS_CONNECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCrossConnectId() {
    return crossConnectId;
  }


  @JsonProperty(JSON_PROPERTY_CROSS_CONNECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCrossConnectId(String crossConnectId) {
    this.crossConnectId = crossConnectId;
  }


  public PortTether cabinetNumber(String cabinetNumber) {
    
    this.cabinetNumber = cabinetNumber;
    return this;
  }

   /**
   * Port cabinet number
   * @return cabinetNumber
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CABINET_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCabinetNumber() {
    return cabinetNumber;
  }


  @JsonProperty(JSON_PROPERTY_CABINET_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCabinetNumber(String cabinetNumber) {
    this.cabinetNumber = cabinetNumber;
  }


  public PortTether systemName(String systemName) {
    
    this.systemName = systemName;
    return this;
  }

   /**
   * Port system name
   * @return systemName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYSTEM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSystemName() {
    return systemName;
  }


  @JsonProperty(JSON_PROPERTY_SYSTEM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSystemName(String systemName) {
    this.systemName = systemName;
  }


  public PortTether patchPanel(String patchPanel) {
    
    this.patchPanel = patchPanel;
    return this;
  }

   /**
   * Port patch panel
   * @return patchPanel
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATCH_PANEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPatchPanel() {
    return patchPanel;
  }


  @JsonProperty(JSON_PROPERTY_PATCH_PANEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPatchPanel(String patchPanel) {
    this.patchPanel = patchPanel;
  }


  public PortTether patchPanelPortA(String patchPanelPortA) {
    
    this.patchPanelPortA = patchPanelPortA;
    return this;
  }

   /**
   * Port patch panel port A
   * @return patchPanelPortA
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATCH_PANEL_PORT_A)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPatchPanelPortA() {
    return patchPanelPortA;
  }


  @JsonProperty(JSON_PROPERTY_PATCH_PANEL_PORT_A)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPatchPanelPortA(String patchPanelPortA) {
    this.patchPanelPortA = patchPanelPortA;
  }


  public PortTether patchPanelPortB(String patchPanelPortB) {
    
    this.patchPanelPortB = patchPanelPortB;
    return this;
  }

   /**
   * Port patch panel port B
   * @return patchPanelPortB
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATCH_PANEL_PORT_B)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPatchPanelPortB() {
    return patchPanelPortB;
  }


  @JsonProperty(JSON_PROPERTY_PATCH_PANEL_PORT_B)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPatchPanelPortB(String patchPanelPortB) {
    this.patchPanelPortB = patchPanelPortB;
  }


  public PortTether ibx(String ibx) {
    
    this.ibx = ibx;
    return this;
  }

   /**
   * z-side/Equinix IBX
   * @return ibx
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IBX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIbx() {
    return ibx;
  }


  @JsonProperty(JSON_PROPERTY_IBX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIbx(String ibx) {
    this.ibx = ibx;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortTether portTether = (PortTether) o;
    return Objects.equals(this.crossConnectId, portTether.crossConnectId) &&
        Objects.equals(this.cabinetNumber, portTether.cabinetNumber) &&
        Objects.equals(this.systemName, portTether.systemName) &&
        Objects.equals(this.patchPanel, portTether.patchPanel) &&
        Objects.equals(this.patchPanelPortA, portTether.patchPanelPortA) &&
        Objects.equals(this.patchPanelPortB, portTether.patchPanelPortB) &&
        Objects.equals(this.ibx, portTether.ibx);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crossConnectId, cabinetNumber, systemName, patchPanel, patchPanelPortA, patchPanelPortB, ibx);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortTether {\n");
    sb.append("    crossConnectId: ").append(toIndentedString(crossConnectId)).append("\n");
    sb.append("    cabinetNumber: ").append(toIndentedString(cabinetNumber)).append("\n");
    sb.append("    systemName: ").append(toIndentedString(systemName)).append("\n");
    sb.append("    patchPanel: ").append(toIndentedString(patchPanel)).append("\n");
    sb.append("    patchPanelPortA: ").append(toIndentedString(patchPanelPortA)).append("\n");
    sb.append("    patchPanelPortB: ").append(toIndentedString(patchPanelPortB)).append("\n");
    sb.append("    ibx: ").append(toIndentedString(ibx)).append("\n");
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

