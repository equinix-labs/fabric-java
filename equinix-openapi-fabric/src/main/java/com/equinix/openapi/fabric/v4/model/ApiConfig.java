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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Configuration for API based Integration for Service Profile
 */
@JsonPropertyOrder({
  ApiConfig.JSON_PROPERTY_API_AVAILABLE,
  ApiConfig.JSON_PROPERTY_INTEGRATION_ID,
  ApiConfig.JSON_PROPERTY_EQUINIX_MANAGED_PORT,
  ApiConfig.JSON_PROPERTY_EQUINIX_MANAGED_VLAN,
  ApiConfig.JSON_PROPERTY_ALLOW_OVER_SUBSCRIPTION,
  ApiConfig.JSON_PROPERTY_OVER_SUBSCRIPTION_LIMIT,
  ApiConfig.JSON_PROPERTY_BANDWIDTH_FROM_API
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiConfig {
  public static final String JSON_PROPERTY_API_AVAILABLE = "apiAvailable";
  private Boolean apiAvailable = false;

  public static final String JSON_PROPERTY_INTEGRATION_ID = "integrationId";
  private String integrationId;

  public static final String JSON_PROPERTY_EQUINIX_MANAGED_PORT = "equinixManagedPort";
  private Boolean equinixManagedPort = false;

  public static final String JSON_PROPERTY_EQUINIX_MANAGED_VLAN = "equinixManagedVlan";
  private Boolean equinixManagedVlan = false;

  public static final String JSON_PROPERTY_ALLOW_OVER_SUBSCRIPTION = "allowOverSubscription";
  private Boolean allowOverSubscription = false;

  public static final String JSON_PROPERTY_OVER_SUBSCRIPTION_LIMIT = "overSubscriptionLimit";
  private Integer overSubscriptionLimit = 1;

  public static final String JSON_PROPERTY_BANDWIDTH_FROM_API = "bandwidthFromApi";
  private Boolean bandwidthFromApi = false;

  public ApiConfig() {
  }

  public ApiConfig apiAvailable(Boolean apiAvailable) {
    
    this.apiAvailable = apiAvailable;
    return this;
  }

   /**
   * Setting indicating whether the API is available (true) or not (false).
   * @return apiAvailable
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getApiAvailable() {
    return apiAvailable;
  }


  @JsonProperty(JSON_PROPERTY_API_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApiAvailable(Boolean apiAvailable) {
    this.apiAvailable = apiAvailable;
  }


  public ApiConfig integrationId(String integrationId) {
    
    this.integrationId = integrationId;
    return this;
  }

   /**
   * Get integrationId
   * @return integrationId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntegrationId() {
    return integrationId;
  }


  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  public ApiConfig equinixManagedPort(Boolean equinixManagedPort) {
    
    this.equinixManagedPort = equinixManagedPort;
    return this;
  }

   /**
   * Setting indicating that the port is managed by Equinix (true) or not (false).
   * @return equinixManagedPort
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EQUINIX_MANAGED_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEquinixManagedPort() {
    return equinixManagedPort;
  }


  @JsonProperty(JSON_PROPERTY_EQUINIX_MANAGED_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEquinixManagedPort(Boolean equinixManagedPort) {
    this.equinixManagedPort = equinixManagedPort;
  }


  public ApiConfig equinixManagedVlan(Boolean equinixManagedVlan) {
    
    this.equinixManagedVlan = equinixManagedVlan;
    return this;
  }

   /**
   * Setting indicating that the VLAN is managed by Equinix (true) or not (false).
   * @return equinixManagedVlan
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EQUINIX_MANAGED_VLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEquinixManagedVlan() {
    return equinixManagedVlan;
  }


  @JsonProperty(JSON_PROPERTY_EQUINIX_MANAGED_VLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEquinixManagedVlan(Boolean equinixManagedVlan) {
    this.equinixManagedVlan = equinixManagedVlan;
  }


  public ApiConfig allowOverSubscription(Boolean allowOverSubscription) {
    
    this.allowOverSubscription = allowOverSubscription;
    return this;
  }

   /**
   * Setting showing that oversubscription support is available (true) or not (false). The default is false. Oversubscription is the sale of more than the available network bandwidth. This practice is common and legitimate. After all, many customers use less bandwidth than they&#39;ve purchased. And network users don&#39;t consume bandwidth all at the same time. The leftover bandwidth can be sold to other customers. When demand surges, operational and engineering resources can be shifted to accommodate the load. 
   * @return allowOverSubscription
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_OVER_SUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowOverSubscription() {
    return allowOverSubscription;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_OVER_SUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowOverSubscription(Boolean allowOverSubscription) {
    this.allowOverSubscription = allowOverSubscription;
  }


  public ApiConfig overSubscriptionLimit(Integer overSubscriptionLimit) {
    
    this.overSubscriptionLimit = overSubscriptionLimit;
    return this;
  }

   /**
   * A cap on oversubscription.
   * minimum: 1
   * maximum: 20
   * @return overSubscriptionLimit
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVER_SUBSCRIPTION_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOverSubscriptionLimit() {
    return overSubscriptionLimit;
  }


  @JsonProperty(JSON_PROPERTY_OVER_SUBSCRIPTION_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOverSubscriptionLimit(Integer overSubscriptionLimit) {
    this.overSubscriptionLimit = overSubscriptionLimit;
  }


  public ApiConfig bandwidthFromApi(Boolean bandwidthFromApi) {
    
    this.bandwidthFromApi = bandwidthFromApi;
    return this;
  }

   /**
   * Get bandwidthFromApi
   * @return bandwidthFromApi
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BANDWIDTH_FROM_API)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBandwidthFromApi() {
    return bandwidthFromApi;
  }


  @JsonProperty(JSON_PROPERTY_BANDWIDTH_FROM_API)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBandwidthFromApi(Boolean bandwidthFromApi) {
    this.bandwidthFromApi = bandwidthFromApi;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiConfig apiConfig = (ApiConfig) o;
    return Objects.equals(this.apiAvailable, apiConfig.apiAvailable) &&
        Objects.equals(this.integrationId, apiConfig.integrationId) &&
        Objects.equals(this.equinixManagedPort, apiConfig.equinixManagedPort) &&
        Objects.equals(this.equinixManagedVlan, apiConfig.equinixManagedVlan) &&
        Objects.equals(this.allowOverSubscription, apiConfig.allowOverSubscription) &&
        Objects.equals(this.overSubscriptionLimit, apiConfig.overSubscriptionLimit) &&
        Objects.equals(this.bandwidthFromApi, apiConfig.bandwidthFromApi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiAvailable, integrationId, equinixManagedPort, equinixManagedVlan, allowOverSubscription, overSubscriptionLimit, bandwidthFromApi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiConfig {\n");
    sb.append("    apiAvailable: ").append(toIndentedString(apiAvailable)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    equinixManagedPort: ").append(toIndentedString(equinixManagedPort)).append("\n");
    sb.append("    equinixManagedVlan: ").append(toIndentedString(equinixManagedVlan)).append("\n");
    sb.append("    allowOverSubscription: ").append(toIndentedString(allowOverSubscription)).append("\n");
    sb.append("    overSubscriptionLimit: ").append(toIndentedString(overSubscriptionLimit)).append("\n");
    sb.append("    bandwidthFromApi: ").append(toIndentedString(bandwidthFromApi)).append("\n");
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

