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

import com.equinix.openapi.fabric.JSON;
import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.*;

/**
 * Configuration for API based Integration for Service Profile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiConfig {
  public static final String SERIALIZED_NAME_API_AVAILABLE = "apiAvailable";
  @SerializedName(SERIALIZED_NAME_API_AVAILABLE)
  private Boolean apiAvailable = false;

  public static final String SERIALIZED_NAME_INTEGRATION_ID = "integrationId";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_ID)
  private String integrationId;

  public static final String SERIALIZED_NAME_EQUINIX_MANAGED_PORT = "equinixManagedPort";
  @SerializedName(SERIALIZED_NAME_EQUINIX_MANAGED_PORT)
  private Boolean equinixManagedPort = false;

  public static final String SERIALIZED_NAME_EQUINIX_MANAGED_VLAN = "equinixManagedVlan";
  @SerializedName(SERIALIZED_NAME_EQUINIX_MANAGED_VLAN)
  private Boolean equinixManagedVlan = false;

  public static final String SERIALIZED_NAME_ALLOW_OVER_SUBSCRIPTION = "allowOverSubscription";
  @SerializedName(SERIALIZED_NAME_ALLOW_OVER_SUBSCRIPTION)
  private Boolean allowOverSubscription = false;

  public static final String SERIALIZED_NAME_OVER_SUBSCRIPTION_LIMIT = "overSubscriptionLimit";
  @SerializedName(SERIALIZED_NAME_OVER_SUBSCRIPTION_LIMIT)
  private Integer overSubscriptionLimit = 1;

  public static final String SERIALIZED_NAME_BANDWIDTH_FROM_API = "bandwidthFromApi";
  @SerializedName(SERIALIZED_NAME_BANDWIDTH_FROM_API)
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

  public Boolean getApiAvailable() {
    return apiAvailable;
  }


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

  public String getIntegrationId() {
    return integrationId;
  }


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

  public Boolean getEquinixManagedPort() {
    return equinixManagedPort;
  }


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

  public Boolean getEquinixManagedVlan() {
    return equinixManagedVlan;
  }


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

  public Boolean getAllowOverSubscription() {
    return allowOverSubscription;
  }


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

  public Integer getOverSubscriptionLimit() {
    return overSubscriptionLimit;
  }


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

  public Boolean getBandwidthFromApi() {
    return bandwidthFromApi;
  }


  public void setBandwidthFromApi(Boolean bandwidthFromApi) {
    this.bandwidthFromApi = bandwidthFromApi;
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
   * @return the ApiConfig instance itself
   */
  public ApiConfig putAdditionalProperty(String key, Object value) {
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
    ApiConfig apiConfig = (ApiConfig) o;
    return Objects.equals(this.apiAvailable, apiConfig.apiAvailable) &&
        Objects.equals(this.integrationId, apiConfig.integrationId) &&
        Objects.equals(this.equinixManagedPort, apiConfig.equinixManagedPort) &&
        Objects.equals(this.equinixManagedVlan, apiConfig.equinixManagedVlan) &&
        Objects.equals(this.allowOverSubscription, apiConfig.allowOverSubscription) &&
        Objects.equals(this.overSubscriptionLimit, apiConfig.overSubscriptionLimit) &&
        Objects.equals(this.bandwidthFromApi, apiConfig.bandwidthFromApi)&&
        Objects.equals(this.additionalProperties, apiConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiAvailable, integrationId, equinixManagedPort, equinixManagedVlan, allowOverSubscription, overSubscriptionLimit, bandwidthFromApi, additionalProperties);
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
    openapiFields.add("apiAvailable");
    openapiFields.add("integrationId");
    openapiFields.add("equinixManagedPort");
    openapiFields.add("equinixManagedVlan");
    openapiFields.add("allowOverSubscription");
    openapiFields.add("overSubscriptionLimit");
    openapiFields.add("bandwidthFromApi");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApiConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApiConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiConfig is not found in the empty JSON string", ApiConfig.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("integrationId") != null && !jsonObj.get("integrationId").isJsonNull()) && !jsonObj.get("integrationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `integrationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("integrationId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiConfig>() {
           @Override
           public void write(JsonWriter out, ApiConfig value) throws IOException {
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
           public ApiConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ApiConfig instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ApiConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiConfig
  * @throws IOException if the JSON string is invalid with respect to ApiConfig
  */
  public static ApiConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiConfig.class);
  }

 /**
  * Convert an instance of ApiConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

