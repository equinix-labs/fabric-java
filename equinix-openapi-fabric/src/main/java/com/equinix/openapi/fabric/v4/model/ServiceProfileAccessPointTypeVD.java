/*
 * Equinix Fabric API v4
 * Equinix Fabric is an advanced software-defined interconnection solution that enables you to directly, securely and dynamically connect to distributed infrastructure and digital ecosystems on platform Equinix via a single port, Customers can use Fabric to connect to: </br> 1. Cloud Service Providers - Clouds, network and other service providers.  </br> 2. Enterprises - Other Equinix customers, vendors and partners.  </br> 3. Myself - Another customer instance deployed at Equinix. </br>
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
import com.equinix.openapi.fabric.v4.model.ServiceProfileAccessPointTypeEnum;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * VirtualDevice Access Point Type
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceProfileAccessPointTypeVD {
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
  private Boolean allowRemoteConnections;

  public static final String SERIALIZED_NAME_ALLOW_CUSTOM_BANDWIDTH = "allowCustomBandwidth";
  @SerializedName(SERIALIZED_NAME_ALLOW_CUSTOM_BANDWIDTH)
  private Boolean allowCustomBandwidth;

  public ServiceProfileAccessPointTypeVD() {
  }

  public ServiceProfileAccessPointTypeVD uuid(String uuid) {
    
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


  public ServiceProfileAccessPointTypeVD type(ServiceProfileAccessPointTypeEnum type) {
    
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


  public ServiceProfileAccessPointTypeVD supportedBandwidths(List<Integer> supportedBandwidths) {
    
    this.supportedBandwidths = supportedBandwidths;
    return this;
  }

  public ServiceProfileAccessPointTypeVD addSupportedBandwidthsItem(Integer supportedBandwidthsItem) {
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


  public ServiceProfileAccessPointTypeVD allowRemoteConnections(Boolean allowRemoteConnections) {
    
    this.allowRemoteConnections = allowRemoteConnections;
    return this;
  }

   /**
   * Allow remote connections to Service Profile
   * @return allowRemoteConnections
  **/
  @javax.annotation.Nullable

  public Boolean getAllowRemoteConnections() {
    return allowRemoteConnections;
  }


  public void setAllowRemoteConnections(Boolean allowRemoteConnections) {
    this.allowRemoteConnections = allowRemoteConnections;
  }


  public ServiceProfileAccessPointTypeVD allowCustomBandwidth(Boolean allowCustomBandwidth) {
    
    this.allowCustomBandwidth = allowCustomBandwidth;
    return this;
  }

   /**
   * Get allowCustomBandwidth
   * @return allowCustomBandwidth
  **/
  @javax.annotation.Nullable

  public Boolean getAllowCustomBandwidth() {
    return allowCustomBandwidth;
  }


  public void setAllowCustomBandwidth(Boolean allowCustomBandwidth) {
    this.allowCustomBandwidth = allowCustomBandwidth;
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
   * @return the ServiceProfileAccessPointTypeVD instance itself
   */
  public ServiceProfileAccessPointTypeVD putAdditionalProperty(String key, Object value) {
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
    ServiceProfileAccessPointTypeVD serviceProfileAccessPointTypeVD = (ServiceProfileAccessPointTypeVD) o;
    return Objects.equals(this.uuid, serviceProfileAccessPointTypeVD.uuid) &&
        Objects.equals(this.type, serviceProfileAccessPointTypeVD.type) &&
        Objects.equals(this.supportedBandwidths, serviceProfileAccessPointTypeVD.supportedBandwidths) &&
        Objects.equals(this.allowRemoteConnections, serviceProfileAccessPointTypeVD.allowRemoteConnections) &&
        Objects.equals(this.allowCustomBandwidth, serviceProfileAccessPointTypeVD.allowCustomBandwidth)&&
        Objects.equals(this.additionalProperties, serviceProfileAccessPointTypeVD.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, type, supportedBandwidths, allowRemoteConnections, allowCustomBandwidth, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceProfileAccessPointTypeVD {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    supportedBandwidths: ").append(toIndentedString(supportedBandwidths)).append("\n");
    sb.append("    allowRemoteConnections: ").append(toIndentedString(allowRemoteConnections)).append("\n");
    sb.append("    allowCustomBandwidth: ").append(toIndentedString(allowCustomBandwidth)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ServiceProfileAccessPointTypeVD
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ServiceProfileAccessPointTypeVD.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ServiceProfileAccessPointTypeVD is not found in the empty JSON string", ServiceProfileAccessPointTypeVD.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ServiceProfileAccessPointTypeVD.openapiRequiredFields) {
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServiceProfileAccessPointTypeVD.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServiceProfileAccessPointTypeVD' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServiceProfileAccessPointTypeVD> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServiceProfileAccessPointTypeVD.class));

       return (TypeAdapter<T>) new TypeAdapter<ServiceProfileAccessPointTypeVD>() {
           @Override
           public void write(JsonWriter out, ServiceProfileAccessPointTypeVD value) throws IOException {
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
           public ServiceProfileAccessPointTypeVD read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ServiceProfileAccessPointTypeVD instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ServiceProfileAccessPointTypeVD given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServiceProfileAccessPointTypeVD
  * @throws IOException if the JSON string is invalid with respect to ServiceProfileAccessPointTypeVD
  */
  public static ServiceProfileAccessPointTypeVD fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServiceProfileAccessPointTypeVD.class);
  }

 /**
  * Convert an instance of ServiceProfileAccessPointTypeVD to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

