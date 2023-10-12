/*
 * Equinix Fabric API v4
 * Equinix Fabric is an advanced software-defined interconnection solution that enables you to directly, securely and dynamically connect to distributed infrastructure and digital ecosystems on platform Equinix via a single port, Customers can use Fabric to connect to: </br> 1. Cloud Service Providers - Clouds, network and other service providers.  </br> 2. Enterprises - Other Equinix customers, vendors and partners.  </br> 3. Myself - Another customer instance deployed at Equinix. </br>
 *
 * The version of the OpenAPI document: 4.10
 * Contact: api-support@equinix.com
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
 * SimplifiedLocation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SimplifiedLocation {
  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_METRO_NAME = "metroName";
  @SerializedName(SERIALIZED_NAME_METRO_NAME)
  private String metroName;

  public static final String SERIALIZED_NAME_METRO_CODE = "metroCode";
  @SerializedName(SERIALIZED_NAME_METRO_CODE)
  private String metroCode;

  public static final String SERIALIZED_NAME_METRO_HREF = "metroHref";
  @SerializedName(SERIALIZED_NAME_METRO_HREF)
  private String metroHref;

  public static final String SERIALIZED_NAME_IBX = "ibx";
  @SerializedName(SERIALIZED_NAME_IBX)
  private String ibx;

  public SimplifiedLocation() {
  }

  public SimplifiedLocation region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nullable

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public SimplifiedLocation metroName(String metroName) {
    
    this.metroName = metroName;
    return this;
  }

   /**
   * Get metroName
   * @return metroName
  **/
  @javax.annotation.Nullable

  public String getMetroName() {
    return metroName;
  }


  public void setMetroName(String metroName) {
    this.metroName = metroName;
  }


  public SimplifiedLocation metroCode(String metroCode) {
    
    this.metroCode = metroCode;
    return this;
  }

   /**
   * Get metroCode
   * @return metroCode
  **/
  @javax.annotation.Nullable

  public String getMetroCode() {
    return metroCode;
  }


  public void setMetroCode(String metroCode) {
    this.metroCode = metroCode;
  }


  public SimplifiedLocation metroHref(String metroHref) {
    
    this.metroHref = metroHref;
    return this;
  }

   /**
   * Get metroHref
   * @return metroHref
  **/
  @javax.annotation.Nullable

  public String getMetroHref() {
    return metroHref;
  }


  public void setMetroHref(String metroHref) {
    this.metroHref = metroHref;
  }


  public SimplifiedLocation ibx(String ibx) {
    
    this.ibx = ibx;
    return this;
  }

   /**
   * Get ibx
   * @return ibx
  **/
  @javax.annotation.Nullable

  public String getIbx() {
    return ibx;
  }


  public void setIbx(String ibx) {
    this.ibx = ibx;
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
   * @return the SimplifiedLocation instance itself
   */
  public SimplifiedLocation putAdditionalProperty(String key, Object value) {
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
    SimplifiedLocation simplifiedLocation = (SimplifiedLocation) o;
    return Objects.equals(this.region, simplifiedLocation.region) &&
        Objects.equals(this.metroName, simplifiedLocation.metroName) &&
        Objects.equals(this.metroCode, simplifiedLocation.metroCode) &&
        Objects.equals(this.metroHref, simplifiedLocation.metroHref) &&
        Objects.equals(this.ibx, simplifiedLocation.ibx)&&
        Objects.equals(this.additionalProperties, simplifiedLocation.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(region, metroName, metroCode, metroHref, ibx, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimplifiedLocation {\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    metroName: ").append(toIndentedString(metroName)).append("\n");
    sb.append("    metroCode: ").append(toIndentedString(metroCode)).append("\n");
    sb.append("    metroHref: ").append(toIndentedString(metroHref)).append("\n");
    sb.append("    ibx: ").append(toIndentedString(ibx)).append("\n");
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
    openapiFields.add("region");
    openapiFields.add("metroName");
    openapiFields.add("metroCode");
    openapiFields.add("metroHref");
    openapiFields.add("ibx");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SimplifiedLocation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SimplifiedLocation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SimplifiedLocation is not found in the empty JSON string", SimplifiedLocation.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("region") != null && !jsonObj.get("region").isJsonNull()) && !jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
      if ((jsonObj.get("metroName") != null && !jsonObj.get("metroName").isJsonNull()) && !jsonObj.get("metroName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metroName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metroName").toString()));
      }
      if ((jsonObj.get("metroCode") != null && !jsonObj.get("metroCode").isJsonNull()) && !jsonObj.get("metroCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metroCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metroCode").toString()));
      }
      if ((jsonObj.get("metroHref") != null && !jsonObj.get("metroHref").isJsonNull()) && !jsonObj.get("metroHref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metroHref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metroHref").toString()));
      }
      if ((jsonObj.get("ibx") != null && !jsonObj.get("ibx").isJsonNull()) && !jsonObj.get("ibx").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ibx` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ibx").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SimplifiedLocation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SimplifiedLocation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SimplifiedLocation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SimplifiedLocation.class));

       return (TypeAdapter<T>) new TypeAdapter<SimplifiedLocation>() {
           @Override
           public void write(JsonWriter out, SimplifiedLocation value) throws IOException {
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
           public SimplifiedLocation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SimplifiedLocation instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SimplifiedLocation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SimplifiedLocation
  * @throws IOException if the JSON string is invalid with respect to SimplifiedLocation
  */
  public static SimplifiedLocation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SimplifiedLocation.class);
  }

 /**
  * Convert an instance of SimplifiedLocation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

