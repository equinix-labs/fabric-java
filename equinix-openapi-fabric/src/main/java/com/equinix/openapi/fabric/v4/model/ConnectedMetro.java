/*
 * Equinix Fabric API v4
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.equinix.openapi.fabric.v4.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;

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
 * Arrays of objects containing latency data for the specified metros
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectedMetro {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_AVG_LATENCY = "avgLatency";
  @SerializedName(SERIALIZED_NAME_AVG_LATENCY)
  private BigDecimal avgLatency;

  public static final String SERIALIZED_NAME_REMOTE_V_C_BANDWIDTH_MAX = "remoteVCBandwidthMax";
  @SerializedName(SERIALIZED_NAME_REMOTE_V_C_BANDWIDTH_MAX)
  private Long remoteVCBandwidthMax;

  public ConnectedMetro() {
  }

  public ConnectedMetro href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * The Canonical URL at which the resource resides.
   * @return href
  **/
  @javax.annotation.Nullable

  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    this.href = href;
  }


  public ConnectedMetro code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Code assigned to an Equinix International Business Exchange (IBX) data center in a specified metropolitan area.
   * @return code
  **/
  @javax.annotation.Nullable

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public ConnectedMetro avgLatency(BigDecimal avgLatency) {
    
    this.avgLatency = avgLatency;
    return this;
  }

   /**
   * Average latency (in milliseconds[ms]) between two specified metros.
   * @return avgLatency
  **/
  @javax.annotation.Nullable

  public BigDecimal getAvgLatency() {
    return avgLatency;
  }


  public void setAvgLatency(BigDecimal avgLatency) {
    this.avgLatency = avgLatency;
  }


  public ConnectedMetro remoteVCBandwidthMax(Long remoteVCBandwidthMax) {
    
    this.remoteVCBandwidthMax = remoteVCBandwidthMax;
    return this;
  }

   /**
   * This field holds the Max Connection speed with connected metros
   * @return remoteVCBandwidthMax
  **/
  @javax.annotation.Nullable

  public Long getRemoteVCBandwidthMax() {
    return remoteVCBandwidthMax;
  }


  public void setRemoteVCBandwidthMax(Long remoteVCBandwidthMax) {
    this.remoteVCBandwidthMax = remoteVCBandwidthMax;
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
   * @return the ConnectedMetro instance itself
   */
  public ConnectedMetro putAdditionalProperty(String key, Object value) {
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
    ConnectedMetro connectedMetro = (ConnectedMetro) o;
    return Objects.equals(this.href, connectedMetro.href) &&
        Objects.equals(this.code, connectedMetro.code) &&
        Objects.equals(this.avgLatency, connectedMetro.avgLatency) &&
        Objects.equals(this.remoteVCBandwidthMax, connectedMetro.remoteVCBandwidthMax)&&
        Objects.equals(this.additionalProperties, connectedMetro.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, code, avgLatency, remoteVCBandwidthMax, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectedMetro {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    avgLatency: ").append(toIndentedString(avgLatency)).append("\n");
    sb.append("    remoteVCBandwidthMax: ").append(toIndentedString(remoteVCBandwidthMax)).append("\n");
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
    openapiFields.add("href");
    openapiFields.add("code");
    openapiFields.add("avgLatency");
    openapiFields.add("remoteVCBandwidthMax");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConnectedMetro
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ConnectedMetro.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConnectedMetro is not found in the empty JSON string", ConnectedMetro.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConnectedMetro.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConnectedMetro' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConnectedMetro> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConnectedMetro.class));

       return (TypeAdapter<T>) new TypeAdapter<ConnectedMetro>() {
           @Override
           public void write(JsonWriter out, ConnectedMetro value) throws IOException {
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
           public ConnectedMetro read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ConnectedMetro instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ConnectedMetro given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConnectedMetro
  * @throws IOException if the JSON string is invalid with respect to ConnectedMetro
  */
  public static ConnectedMetro fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConnectedMetro.class);
  }

 /**
  * Convert an instance of ConnectedMetro to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

