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
 * Connection acceptance data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectionAcceptanceData {
  public static final String SERIALIZED_NAME_Z_SIDE = "zSide";
  @SerializedName(SERIALIZED_NAME_Z_SIDE)
  private ConnectionSide zSide;

  public static final String SERIALIZED_NAME_PROVIDER_BANDWIDTH = "providerBandwidth";
  @SerializedName(SERIALIZED_NAME_PROVIDER_BANDWIDTH)
  private Integer providerBandwidth;

  public ConnectionAcceptanceData() {
  }

  
  public ConnectionAcceptanceData(
     Integer providerBandwidth
  ) {
    this();
    this.providerBandwidth = providerBandwidth;
  }

  public ConnectionAcceptanceData zSide(ConnectionSide zSide) {
    
    this.zSide = zSide;
    return this;
  }

   /**
   * Get zSide
   * @return zSide
  **/
  @javax.annotation.Nullable

  public ConnectionSide getzSide() {
    return zSide;
  }


  public void setzSide(ConnectionSide zSide) {
    this.zSide = zSide;
  }


   /**
   * Authorization key bandwidth in Mbps
   * @return providerBandwidth
  **/
  @javax.annotation.Nullable

  public Integer getProviderBandwidth() {
    return providerBandwidth;
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
   * @return the ConnectionAcceptanceData instance itself
   */
  public ConnectionAcceptanceData putAdditionalProperty(String key, Object value) {
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
    ConnectionAcceptanceData connectionAcceptanceData = (ConnectionAcceptanceData) o;
    return Objects.equals(this.zSide, connectionAcceptanceData.zSide) &&
        Objects.equals(this.providerBandwidth, connectionAcceptanceData.providerBandwidth)&&
        Objects.equals(this.additionalProperties, connectionAcceptanceData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zSide, providerBandwidth, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionAcceptanceData {\n");
    sb.append("    zSide: ").append(toIndentedString(zSide)).append("\n");
    sb.append("    providerBandwidth: ").append(toIndentedString(providerBandwidth)).append("\n");
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
    openapiFields.add("zSide");
    openapiFields.add("providerBandwidth");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConnectionAcceptanceData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ConnectionAcceptanceData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConnectionAcceptanceData is not found in the empty JSON string", ConnectionAcceptanceData.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `zSide`
      if (jsonObj.get("zSide") != null && !jsonObj.get("zSide").isJsonNull()) {
        ConnectionSide.validateJsonObject(jsonObj.getAsJsonObject("zSide"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConnectionAcceptanceData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConnectionAcceptanceData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConnectionAcceptanceData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConnectionAcceptanceData.class));

       return (TypeAdapter<T>) new TypeAdapter<ConnectionAcceptanceData>() {
           @Override
           public void write(JsonWriter out, ConnectionAcceptanceData value) throws IOException {
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
           public ConnectionAcceptanceData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ConnectionAcceptanceData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ConnectionAcceptanceData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConnectionAcceptanceData
  * @throws IOException if the JSON string is invalid with respect to ConnectionAcceptanceData
  */
  public static ConnectionAcceptanceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConnectionAcceptanceData.class);
  }

 /**
  * Convert an instance of ConnectionAcceptanceData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

