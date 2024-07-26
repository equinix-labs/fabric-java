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
import com.equinix.openapi.fabric.v4.model.ApiConfig;
import com.equinix.openapi.fabric.v4.model.AuthenticationKey;
import com.equinix.openapi.fabric.v4.model.ServiceProfileAccessPointTypeEnum;
import com.equinix.openapi.fabric.v4.model.ServiceProfileLinkProtocolConfig;
import com.equinix.openapi.fabric.v4.model.ServiceProfileMetadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Colo Access Point Type
 */
@JsonPropertyOrder({
  ServiceProfileAccessPointTypeCOLO.JSON_PROPERTY_UUID,
  ServiceProfileAccessPointTypeCOLO.JSON_PROPERTY_TYPE,
  ServiceProfileAccessPointTypeCOLO.JSON_PROPERTY_SUPPORTED_BANDWIDTHS,
  ServiceProfileAccessPointTypeCOLO.JSON_PROPERTY_ALLOW_REMOTE_CONNECTIONS,
  ServiceProfileAccessPointTypeCOLO.JSON_PROPERTY_ALLOW_CUSTOM_BANDWIDTH,
  ServiceProfileAccessPointTypeCOLO.JSON_PROPERTY_BANDWIDTH_ALERT_THRESHOLD,
  ServiceProfileAccessPointTypeCOLO.JSON_PROPERTY_ALLOW_BANDWIDTH_AUTO_APPROVAL,
  ServiceProfileAccessPointTypeCOLO.JSON_PROPERTY_ALLOW_BANDWIDTH_UPGRADE,
  ServiceProfileAccessPointTypeCOLO.JSON_PROPERTY_LINK_PROTOCOL_CONFIG,
  ServiceProfileAccessPointTypeCOLO.JSON_PROPERTY_ENABLE_AUTO_GENERATE_SERVICE_KEY,
  ServiceProfileAccessPointTypeCOLO.JSON_PROPERTY_CONNECTION_REDUNDANCY_REQUIRED,
  ServiceProfileAccessPointTypeCOLO.JSON_PROPERTY_API_CONFIG,
  ServiceProfileAccessPointTypeCOLO.JSON_PROPERTY_CONNECTION_LABEL,
  ServiceProfileAccessPointTypeCOLO.JSON_PROPERTY_AUTHENTICATION_KEY,
  ServiceProfileAccessPointTypeCOLO.JSON_PROPERTY_METADATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceProfileAccessPointTypeCOLO {
  public static final String JSON_PROPERTY_UUID = "uuid";
  private String uuid;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ServiceProfileAccessPointTypeEnum type;

  public static final String JSON_PROPERTY_SUPPORTED_BANDWIDTHS = "supportedBandwidths";
  private List<Integer> supportedBandwidths = new ArrayList<>();

  public static final String JSON_PROPERTY_ALLOW_REMOTE_CONNECTIONS = "allowRemoteConnections";
  private Boolean allowRemoteConnections = false;

  public static final String JSON_PROPERTY_ALLOW_CUSTOM_BANDWIDTH = "allowCustomBandwidth";
  private Boolean allowCustomBandwidth = false;

  public static final String JSON_PROPERTY_BANDWIDTH_ALERT_THRESHOLD = "bandwidthAlertThreshold";
  private BigDecimal bandwidthAlertThreshold;

  public static final String JSON_PROPERTY_ALLOW_BANDWIDTH_AUTO_APPROVAL = "allowBandwidthAutoApproval";
  private Boolean allowBandwidthAutoApproval = false;

  public static final String JSON_PROPERTY_ALLOW_BANDWIDTH_UPGRADE = "allowBandwidthUpgrade";
  private Boolean allowBandwidthUpgrade;

  public static final String JSON_PROPERTY_LINK_PROTOCOL_CONFIG = "linkProtocolConfig";
  private ServiceProfileLinkProtocolConfig linkProtocolConfig;

  public static final String JSON_PROPERTY_ENABLE_AUTO_GENERATE_SERVICE_KEY = "enableAutoGenerateServiceKey";
  private Boolean enableAutoGenerateServiceKey;

  public static final String JSON_PROPERTY_CONNECTION_REDUNDANCY_REQUIRED = "connectionRedundancyRequired";
  private Boolean connectionRedundancyRequired = false;

  public static final String JSON_PROPERTY_API_CONFIG = "apiConfig";
  private ApiConfig apiConfig;

  public static final String JSON_PROPERTY_CONNECTION_LABEL = "connectionLabel";
  private String connectionLabel;

  public static final String JSON_PROPERTY_AUTHENTICATION_KEY = "authenticationKey";
  private AuthenticationKey authenticationKey;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private ServiceProfileMetadata metadata;

  public ServiceProfileAccessPointTypeCOLO() {
  }

  public ServiceProfileAccessPointTypeCOLO uuid(String uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUuid() {
    return uuid;
  }


  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public ServiceProfileAccessPointTypeCOLO type(ServiceProfileAccessPointTypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ServiceProfileAccessPointTypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(ServiceProfileAccessPointTypeEnum type) {
    this.type = type;
  }


  public ServiceProfileAccessPointTypeCOLO supportedBandwidths(List<Integer> supportedBandwidths) {
    
    this.supportedBandwidths = supportedBandwidths;
    return this;
  }

  public ServiceProfileAccessPointTypeCOLO addSupportedBandwidthsItem(Integer supportedBandwidthsItem) {
    if (this.supportedBandwidths == null) {
      this.supportedBandwidths = new ArrayList<>();
    }
    this.supportedBandwidths.add(supportedBandwidthsItem);
    return this;
  }

   /**
   * Get supportedBandwidths
   * @return supportedBandwidths
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPORTED_BANDWIDTHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getSupportedBandwidths() {
    return supportedBandwidths;
  }


  @JsonProperty(JSON_PROPERTY_SUPPORTED_BANDWIDTHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupportedBandwidths(List<Integer> supportedBandwidths) {
    this.supportedBandwidths = supportedBandwidths;
  }


  public ServiceProfileAccessPointTypeCOLO allowRemoteConnections(Boolean allowRemoteConnections) {
    
    this.allowRemoteConnections = allowRemoteConnections;
    return this;
  }

   /**
   * Setting to allow or prohibit remote connections to the service profile.
   * @return allowRemoteConnections
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_REMOTE_CONNECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowRemoteConnections() {
    return allowRemoteConnections;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_REMOTE_CONNECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowRemoteConnections(Boolean allowRemoteConnections) {
    this.allowRemoteConnections = allowRemoteConnections;
  }


  public ServiceProfileAccessPointTypeCOLO allowCustomBandwidth(Boolean allowCustomBandwidth) {
    
    this.allowCustomBandwidth = allowCustomBandwidth;
    return this;
  }

   /**
   * Setting to enable or disable the ability of the buyer to customize the bandwidth.
   * @return allowCustomBandwidth
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_CUSTOM_BANDWIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowCustomBandwidth() {
    return allowCustomBandwidth;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_CUSTOM_BANDWIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowCustomBandwidth(Boolean allowCustomBandwidth) {
    this.allowCustomBandwidth = allowCustomBandwidth;
  }


  public ServiceProfileAccessPointTypeCOLO bandwidthAlertThreshold(BigDecimal bandwidthAlertThreshold) {
    
    this.bandwidthAlertThreshold = bandwidthAlertThreshold;
    return this;
  }

   /**
   * percentage of port bandwidth at which an allocation alert is generated - missing on wiki.
   * @return bandwidthAlertThreshold
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BANDWIDTH_ALERT_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getBandwidthAlertThreshold() {
    return bandwidthAlertThreshold;
  }


  @JsonProperty(JSON_PROPERTY_BANDWIDTH_ALERT_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBandwidthAlertThreshold(BigDecimal bandwidthAlertThreshold) {
    this.bandwidthAlertThreshold = bandwidthAlertThreshold;
  }


  public ServiceProfileAccessPointTypeCOLO allowBandwidthAutoApproval(Boolean allowBandwidthAutoApproval) {
    
    this.allowBandwidthAutoApproval = allowBandwidthAutoApproval;
    return this;
  }

   /**
   * Setting to enable or disable the ability of the buyer to change connection bandwidth without approval of the seller.
   * @return allowBandwidthAutoApproval
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_BANDWIDTH_AUTO_APPROVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowBandwidthAutoApproval() {
    return allowBandwidthAutoApproval;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_BANDWIDTH_AUTO_APPROVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowBandwidthAutoApproval(Boolean allowBandwidthAutoApproval) {
    this.allowBandwidthAutoApproval = allowBandwidthAutoApproval;
  }


  public ServiceProfileAccessPointTypeCOLO allowBandwidthUpgrade(Boolean allowBandwidthUpgrade) {
    
    this.allowBandwidthUpgrade = allowBandwidthUpgrade;
    return this;
  }

   /**
   * Availability of a bandwidth upgrade. The default is false.
   * @return allowBandwidthUpgrade
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_BANDWIDTH_UPGRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowBandwidthUpgrade() {
    return allowBandwidthUpgrade;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_BANDWIDTH_UPGRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowBandwidthUpgrade(Boolean allowBandwidthUpgrade) {
    this.allowBandwidthUpgrade = allowBandwidthUpgrade;
  }


  public ServiceProfileAccessPointTypeCOLO linkProtocolConfig(ServiceProfileLinkProtocolConfig linkProtocolConfig) {
    
    this.linkProtocolConfig = linkProtocolConfig;
    return this;
  }

   /**
   * Get linkProtocolConfig
   * @return linkProtocolConfig
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINK_PROTOCOL_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ServiceProfileLinkProtocolConfig getLinkProtocolConfig() {
    return linkProtocolConfig;
  }


  @JsonProperty(JSON_PROPERTY_LINK_PROTOCOL_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkProtocolConfig(ServiceProfileLinkProtocolConfig linkProtocolConfig) {
    this.linkProtocolConfig = linkProtocolConfig;
  }


  public ServiceProfileAccessPointTypeCOLO enableAutoGenerateServiceKey(Boolean enableAutoGenerateServiceKey) {
    
    this.enableAutoGenerateServiceKey = enableAutoGenerateServiceKey;
    return this;
  }

   /**
   * for verizon only.
   * @return enableAutoGenerateServiceKey
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLE_AUTO_GENERATE_SERVICE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnableAutoGenerateServiceKey() {
    return enableAutoGenerateServiceKey;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_AUTO_GENERATE_SERVICE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableAutoGenerateServiceKey(Boolean enableAutoGenerateServiceKey) {
    this.enableAutoGenerateServiceKey = enableAutoGenerateServiceKey;
  }


  public ServiceProfileAccessPointTypeCOLO connectionRedundancyRequired(Boolean connectionRedundancyRequired) {
    
    this.connectionRedundancyRequired = connectionRedundancyRequired;
    return this;
  }

   /**
   * Mandate redundant connections
   * @return connectionRedundancyRequired
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECTION_REDUNDANCY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getConnectionRedundancyRequired() {
    return connectionRedundancyRequired;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_REDUNDANCY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectionRedundancyRequired(Boolean connectionRedundancyRequired) {
    this.connectionRedundancyRequired = connectionRedundancyRequired;
  }


  public ServiceProfileAccessPointTypeCOLO apiConfig(ApiConfig apiConfig) {
    
    this.apiConfig = apiConfig;
    return this;
  }

   /**
   * Get apiConfig
   * @return apiConfig
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiConfig getApiConfig() {
    return apiConfig;
  }


  @JsonProperty(JSON_PROPERTY_API_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApiConfig(ApiConfig apiConfig) {
    this.apiConfig = apiConfig;
  }


  public ServiceProfileAccessPointTypeCOLO connectionLabel(String connectionLabel) {
    
    this.connectionLabel = connectionLabel;
    return this;
  }

   /**
   * custom name for \&quot;Connection\&quot;
   * @return connectionLabel
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECTION_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectionLabel() {
    return connectionLabel;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectionLabel(String connectionLabel) {
    this.connectionLabel = connectionLabel;
  }


  public ServiceProfileAccessPointTypeCOLO authenticationKey(AuthenticationKey authenticationKey) {
    
    this.authenticationKey = authenticationKey;
    return this;
  }

   /**
   * Get authenticationKey
   * @return authenticationKey
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AuthenticationKey getAuthenticationKey() {
    return authenticationKey;
  }


  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthenticationKey(AuthenticationKey authenticationKey) {
    this.authenticationKey = authenticationKey;
  }


  public ServiceProfileAccessPointTypeCOLO metadata(ServiceProfileMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ServiceProfileMetadata getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(ServiceProfileMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceProfileAccessPointTypeCOLO serviceProfileAccessPointTypeCOLO = (ServiceProfileAccessPointTypeCOLO) o;
    return Objects.equals(this.uuid, serviceProfileAccessPointTypeCOLO.uuid) &&
        Objects.equals(this.type, serviceProfileAccessPointTypeCOLO.type) &&
        Objects.equals(this.supportedBandwidths, serviceProfileAccessPointTypeCOLO.supportedBandwidths) &&
        Objects.equals(this.allowRemoteConnections, serviceProfileAccessPointTypeCOLO.allowRemoteConnections) &&
        Objects.equals(this.allowCustomBandwidth, serviceProfileAccessPointTypeCOLO.allowCustomBandwidth) &&
        Objects.equals(this.bandwidthAlertThreshold, serviceProfileAccessPointTypeCOLO.bandwidthAlertThreshold) &&
        Objects.equals(this.allowBandwidthAutoApproval, serviceProfileAccessPointTypeCOLO.allowBandwidthAutoApproval) &&
        Objects.equals(this.allowBandwidthUpgrade, serviceProfileAccessPointTypeCOLO.allowBandwidthUpgrade) &&
        Objects.equals(this.linkProtocolConfig, serviceProfileAccessPointTypeCOLO.linkProtocolConfig) &&
        Objects.equals(this.enableAutoGenerateServiceKey, serviceProfileAccessPointTypeCOLO.enableAutoGenerateServiceKey) &&
        Objects.equals(this.connectionRedundancyRequired, serviceProfileAccessPointTypeCOLO.connectionRedundancyRequired) &&
        Objects.equals(this.apiConfig, serviceProfileAccessPointTypeCOLO.apiConfig) &&
        Objects.equals(this.connectionLabel, serviceProfileAccessPointTypeCOLO.connectionLabel) &&
        Objects.equals(this.authenticationKey, serviceProfileAccessPointTypeCOLO.authenticationKey) &&
        Objects.equals(this.metadata, serviceProfileAccessPointTypeCOLO.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, type, supportedBandwidths, allowRemoteConnections, allowCustomBandwidth, bandwidthAlertThreshold, allowBandwidthAutoApproval, allowBandwidthUpgrade, linkProtocolConfig, enableAutoGenerateServiceKey, connectionRedundancyRequired, apiConfig, connectionLabel, authenticationKey, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceProfileAccessPointTypeCOLO {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    supportedBandwidths: ").append(toIndentedString(supportedBandwidths)).append("\n");
    sb.append("    allowRemoteConnections: ").append(toIndentedString(allowRemoteConnections)).append("\n");
    sb.append("    allowCustomBandwidth: ").append(toIndentedString(allowCustomBandwidth)).append("\n");
    sb.append("    bandwidthAlertThreshold: ").append(toIndentedString(bandwidthAlertThreshold)).append("\n");
    sb.append("    allowBandwidthAutoApproval: ").append(toIndentedString(allowBandwidthAutoApproval)).append("\n");
    sb.append("    allowBandwidthUpgrade: ").append(toIndentedString(allowBandwidthUpgrade)).append("\n");
    sb.append("    linkProtocolConfig: ").append(toIndentedString(linkProtocolConfig)).append("\n");
    sb.append("    enableAutoGenerateServiceKey: ").append(toIndentedString(enableAutoGenerateServiceKey)).append("\n");
    sb.append("    connectionRedundancyRequired: ").append(toIndentedString(connectionRedundancyRequired)).append("\n");
    sb.append("    apiConfig: ").append(toIndentedString(apiConfig)).append("\n");
    sb.append("    connectionLabel: ").append(toIndentedString(connectionLabel)).append("\n");
    sb.append("    authenticationKey: ").append(toIndentedString(authenticationKey)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

