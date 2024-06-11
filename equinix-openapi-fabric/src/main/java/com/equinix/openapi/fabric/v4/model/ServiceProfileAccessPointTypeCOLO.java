/*
 * Equinix Fabric API v4
 * Equinix Fabric is an advanced software-defined interconnection solution that enables you to directly, securely and dynamically connect to distributed infrastructure and digital ecosystems on platform Equinix via a single port, Customers can use Fabric to connect to: </br> 1. Cloud Service Providers - Clouds, network and other service providers.  </br> 2. Enterprises - Other Equinix customers, vendors and partners.  </br> 3. Myself - Another customer instance deployed at Equinix. </br> </br> <b>Integrations (SDKs, Tools) links:</b></br> <a href=\"https://deploy.equinix.com/labs/fabric-java\\\">Fabric Java SDK</a> </br> <a href=\"https://deploy.equinix.com/labs/equinix-sdk-go\\\">Fabric Go SDK</a> </br> <a href=\"https://deploy.equinix.com/labs/terraform-provider-equinix\\\">Equinix Terraform Provider</a> </br> <a href=\"https://deploy.equinix.com/labs/terraform-equinix-fabric\\\">Fabric Terraform Modules</a> </br> <a href=\"https://deploy.equinix.com/labs/pulumi-provider-equinix/\">Equinix Pulumi Provider</a> </br>
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.equinix.openapi.fabric.JSON;

/**
 * Colo Access Point Type
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceProfileAccessPointTypeCOLO {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ServiceProfileAccessPointTypeEnum type;

  public static final String SERIALIZED_NAME_SUPPORTED_BANDWIDTHS = "supportedBandwidths";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_BANDWIDTHS)
  private List<Integer> supportedBandwidths = new ArrayList<>();

  public static final String SERIALIZED_NAME_ALLOW_REMOTE_CONNECTIONS = "allowRemoteConnections";
  @SerializedName(SERIALIZED_NAME_ALLOW_REMOTE_CONNECTIONS)
  private Boolean allowRemoteConnections = false;

  public static final String SERIALIZED_NAME_ALLOW_CUSTOM_BANDWIDTH = "allowCustomBandwidth";
  @SerializedName(SERIALIZED_NAME_ALLOW_CUSTOM_BANDWIDTH)
  private Boolean allowCustomBandwidth = false;

  public static final String SERIALIZED_NAME_BANDWIDTH_ALERT_THRESHOLD = "bandwidthAlertThreshold";
  @SerializedName(SERIALIZED_NAME_BANDWIDTH_ALERT_THRESHOLD)
  private BigDecimal bandwidthAlertThreshold;

  public static final String SERIALIZED_NAME_ALLOW_BANDWIDTH_AUTO_APPROVAL = "allowBandwidthAutoApproval";
  @SerializedName(SERIALIZED_NAME_ALLOW_BANDWIDTH_AUTO_APPROVAL)
  private Boolean allowBandwidthAutoApproval = false;

  public static final String SERIALIZED_NAME_ALLOW_BANDWIDTH_UPGRADE = "allowBandwidthUpgrade";
  @SerializedName(SERIALIZED_NAME_ALLOW_BANDWIDTH_UPGRADE)
  private Boolean allowBandwidthUpgrade;

  public static final String SERIALIZED_NAME_LINK_PROTOCOL_CONFIG = "linkProtocolConfig";
  @SerializedName(SERIALIZED_NAME_LINK_PROTOCOL_CONFIG)
  private ServiceProfileLinkProtocolConfig linkProtocolConfig;

  public static final String SERIALIZED_NAME_ENABLE_AUTO_GENERATE_SERVICE_KEY = "enableAutoGenerateServiceKey";
  @SerializedName(SERIALIZED_NAME_ENABLE_AUTO_GENERATE_SERVICE_KEY)
  private Boolean enableAutoGenerateServiceKey;

  public static final String SERIALIZED_NAME_CONNECTION_REDUNDANCY_REQUIRED = "connectionRedundancyRequired";
  @SerializedName(SERIALIZED_NAME_CONNECTION_REDUNDANCY_REQUIRED)
  private Boolean connectionRedundancyRequired = false;

  public static final String SERIALIZED_NAME_API_CONFIG = "apiConfig";
  @SerializedName(SERIALIZED_NAME_API_CONFIG)
  private ApiConfig apiConfig;

  public static final String SERIALIZED_NAME_CONNECTION_LABEL = "connectionLabel";
  @SerializedName(SERIALIZED_NAME_CONNECTION_LABEL)
  private String connectionLabel;

  public static final String SERIALIZED_NAME_AUTHENTICATION_KEY = "authenticationKey";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_KEY)
  private AuthenticationKey authenticationKey;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
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

  public String getUuid() {
    return uuid;
  }


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

  public ServiceProfileAccessPointTypeEnum getType() {
    return type;
  }


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

  public List<Integer> getSupportedBandwidths() {
    return supportedBandwidths;
  }


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

  public Boolean getAllowRemoteConnections() {
    return allowRemoteConnections;
  }


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

  public Boolean getAllowCustomBandwidth() {
    return allowCustomBandwidth;
  }


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

  public BigDecimal getBandwidthAlertThreshold() {
    return bandwidthAlertThreshold;
  }


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

  public Boolean getAllowBandwidthAutoApproval() {
    return allowBandwidthAutoApproval;
  }


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

  public Boolean getAllowBandwidthUpgrade() {
    return allowBandwidthUpgrade;
  }


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

  public ServiceProfileLinkProtocolConfig getLinkProtocolConfig() {
    return linkProtocolConfig;
  }


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

  public Boolean getEnableAutoGenerateServiceKey() {
    return enableAutoGenerateServiceKey;
  }


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

  public Boolean getConnectionRedundancyRequired() {
    return connectionRedundancyRequired;
  }


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

  public ApiConfig getApiConfig() {
    return apiConfig;
  }


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

  public String getConnectionLabel() {
    return connectionLabel;
  }


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

  public AuthenticationKey getAuthenticationKey() {
    return authenticationKey;
  }


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

  public ServiceProfileMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(ServiceProfileMetadata metadata) {
    this.metadata = metadata;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ServiceProfileAccessPointTypeCOLO instance itself
   */
  public ServiceProfileAccessPointTypeCOLO putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
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
        Objects.equals(this.metadata, serviceProfileAccessPointTypeCOLO.metadata)&&
        Objects.equals(this.additionalProperties, serviceProfileAccessPointTypeCOLO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, type, supportedBandwidths, allowRemoteConnections, allowCustomBandwidth, bandwidthAlertThreshold, allowBandwidthAutoApproval, allowBandwidthUpgrade, linkProtocolConfig, enableAutoGenerateServiceKey, connectionRedundancyRequired, apiConfig, connectionLabel, authenticationKey, metadata, additionalProperties);
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
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("uuid");
    openapiFields.add("type");
    openapiFields.add("supportedBandwidths");
    openapiFields.add("allowRemoteConnections");
    openapiFields.add("allowCustomBandwidth");
    openapiFields.add("bandwidthAlertThreshold");
    openapiFields.add("allowBandwidthAutoApproval");
    openapiFields.add("allowBandwidthUpgrade");
    openapiFields.add("linkProtocolConfig");
    openapiFields.add("enableAutoGenerateServiceKey");
    openapiFields.add("connectionRedundancyRequired");
    openapiFields.add("apiConfig");
    openapiFields.add("connectionLabel");
    openapiFields.add("authenticationKey");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ServiceProfileAccessPointTypeCOLO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ServiceProfileAccessPointTypeCOLO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ServiceProfileAccessPointTypeCOLO is not found in the empty JSON string", ServiceProfileAccessPointTypeCOLO.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ServiceProfileAccessPointTypeCOLO.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("supportedBandwidths") != null && !jsonObj.get("supportedBandwidths").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `supportedBandwidths` to be an array in the JSON string but got `%s`", jsonObj.get("supportedBandwidths").toString()));
      }
      // validate the optional field `linkProtocolConfig`
      if (jsonObj.get("linkProtocolConfig") != null && !jsonObj.get("linkProtocolConfig").isJsonNull()) {
        ServiceProfileLinkProtocolConfig.validateJsonObject(jsonObj.getAsJsonObject("linkProtocolConfig"));
      }
      // validate the optional field `apiConfig`
      if (jsonObj.get("apiConfig") != null && !jsonObj.get("apiConfig").isJsonNull()) {
        ApiConfig.validateJsonObject(jsonObj.getAsJsonObject("apiConfig"));
      }
      if ((jsonObj.get("connectionLabel") != null && !jsonObj.get("connectionLabel").isJsonNull()) && !jsonObj.get("connectionLabel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connectionLabel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connectionLabel").toString()));
      }
      // validate the optional field `authenticationKey`
      if (jsonObj.get("authenticationKey") != null && !jsonObj.get("authenticationKey").isJsonNull()) {
        AuthenticationKey.validateJsonObject(jsonObj.getAsJsonObject("authenticationKey"));
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        ServiceProfileMetadata.validateJsonObject(jsonObj.getAsJsonObject("metadata"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServiceProfileAccessPointTypeCOLO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServiceProfileAccessPointTypeCOLO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServiceProfileAccessPointTypeCOLO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServiceProfileAccessPointTypeCOLO.class));

       return (TypeAdapter<T>) new TypeAdapter<ServiceProfileAccessPointTypeCOLO>() {
           @Override
           public void write(JsonWriter out, ServiceProfileAccessPointTypeCOLO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ServiceProfileAccessPointTypeCOLO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ServiceProfileAccessPointTypeCOLO instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ServiceProfileAccessPointTypeCOLO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServiceProfileAccessPointTypeCOLO
  * @throws IOException if the JSON string is invalid with respect to ServiceProfileAccessPointTypeCOLO
  */
  public static ServiceProfileAccessPointTypeCOLO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServiceProfileAccessPointTypeCOLO.class);
  }

 /**
  * Convert an instance of ServiceProfileAccessPointTypeCOLO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

