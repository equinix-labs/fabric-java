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
 * Advance Configuration for NTP/PTP
 */
@JsonPropertyOrder({
  AdvanceConfiguration.JSON_PROPERTY_NTP,
  AdvanceConfiguration.JSON_PROPERTY_PTP
})
@JsonTypeName("advanceConfiguration")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdvanceConfiguration {
  public static final String JSON_PROPERTY_NTP = "ntp";
  private List<Md5> ntp = new ArrayList<>();

  public static final String JSON_PROPERTY_PTP = "ptp";
  private PtpAdvanceConfiguration ptp;

  public AdvanceConfiguration() {
  }

  public AdvanceConfiguration ntp(List<Md5> ntp) {
    
    this.ntp = ntp;
    return this;
  }

  public AdvanceConfiguration addNtpItem(Md5 ntpItem) {
    if (this.ntp == null) {
      this.ntp = new ArrayList<>();
    }
    this.ntp.add(ntpItem);
    return this;
  }

   /**
   * Get ntp
   * @return ntp
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NTP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Md5> getNtp() {
    return ntp;
  }


  @JsonProperty(JSON_PROPERTY_NTP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNtp(List<Md5> ntp) {
    this.ntp = ntp;
  }


  public AdvanceConfiguration ptp(PtpAdvanceConfiguration ptp) {
    
    this.ptp = ptp;
    return this;
  }

   /**
   * Get ptp
   * @return ptp
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PTP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PtpAdvanceConfiguration getPtp() {
    return ptp;
  }


  @JsonProperty(JSON_PROPERTY_PTP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPtp(PtpAdvanceConfiguration ptp) {
    this.ptp = ptp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvanceConfiguration advanceConfiguration = (AdvanceConfiguration) o;
    return Objects.equals(this.ntp, advanceConfiguration.ntp) &&
        Objects.equals(this.ptp, advanceConfiguration.ptp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ntp, ptp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvanceConfiguration {\n");
    sb.append("    ntp: ").append(toIndentedString(ntp)).append("\n");
    sb.append("    ptp: ").append(toIndentedString(ptp)).append("\n");
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

