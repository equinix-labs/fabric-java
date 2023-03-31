/*
 * Equinix Fabric API v4
 * Equinix Fabric is an advanced software-defined interconnection solution that enables you to directly, securely and dynamically connect to distributed infrastructure and digital ecosystems on platform Equinix via a single port, Customers can use Fabric to connect to: </br> 1. Cloud Service Providers - Clouds, network and other service providers.  </br> 2. Enterprises - Other Equinix customers, vendors and partners.  </br> 3. Myself - Another customer instance deployed at Equinix. </br>
 *
 * The version of the OpenAPI document: 4.6
 * Contact: api-support@equinix.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.equinix.openapi.fabric.v4.model;

import java.util.Objects;
import java.util.Arrays;
import com.equinix.openapi.fabric.v4.model.AccessPoint;
import com.equinix.openapi.fabric.v4.model.ConnectionCompanyProfile;
import com.equinix.openapi.fabric.v4.model.ConnectionSideAdditionalInfo;
import com.equinix.openapi.fabric.v4.model.SimplifiedServiceToken;
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
 * Connection configuration object for each side of multi-segment connection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectionSide {
  public static final String SERIALIZED_NAME_SERVICE_TOKEN = "serviceToken";
  @SerializedName(SERIALIZED_NAME_SERVICE_TOKEN)
  private SimplifiedServiceToken serviceToken;

  public static final String SERIALIZED_NAME_ACCESS_POINT = "accessPoint";
  @SerializedName(SERIALIZED_NAME_ACCESS_POINT)
  private AccessPoint accessPoint;

  public static final String SERIALIZED_NAME_COMPANY_PROFILE = "companyProfile";
  @SerializedName(SERIALIZED_NAME_COMPANY_PROFILE)
  private ConnectionCompanyProfile companyProfile;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additionalInfo";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  private List<ConnectionSideAdditionalInfo> additionalInfo = new ArrayList<>();

  public ConnectionSide() {
  }

  public ConnectionSide serviceToken(SimplifiedServiceToken serviceToken) {
    
    this.serviceToken = serviceToken;
    return this;
  }

   /**
   * Get serviceToken
   * @return serviceToken
  **/
  @javax.annotation.Nullable

  public SimplifiedServiceToken getServiceToken() {
    return serviceToken;
  }


  public void setServiceToken(SimplifiedServiceToken serviceToken) {
    this.serviceToken = serviceToken;
  }


  public ConnectionSide accessPoint(AccessPoint accessPoint) {
    
    this.accessPoint = accessPoint;
    return this;
  }

   /**
   * Get accessPoint
   * @return accessPoint
  **/
  @javax.annotation.Nullable

  public AccessPoint getAccessPoint() {
    return accessPoint;
  }


  public void setAccessPoint(AccessPoint accessPoint) {
    this.accessPoint = accessPoint;
  }


  public ConnectionSide companyProfile(ConnectionCompanyProfile companyProfile) {
    
    this.companyProfile = companyProfile;
    return this;
  }

   /**
   * Get companyProfile
   * @return companyProfile
  **/
  @javax.annotation.Nullable

  public ConnectionCompanyProfile getCompanyProfile() {
    return companyProfile;
  }


  public void setCompanyProfile(ConnectionCompanyProfile companyProfile) {
    this.companyProfile = companyProfile;
  }


  public ConnectionSide additionalInfo(List<ConnectionSideAdditionalInfo> additionalInfo) {
    
    this.additionalInfo = additionalInfo;
    return this;
  }

  public ConnectionSide addAdditionalInfoItem(ConnectionSideAdditionalInfo additionalInfoItem) {
    if (this.additionalInfo == null) {
      this.additionalInfo = new ArrayList<>();
    }
    this.additionalInfo.add(additionalInfoItem);
    return this;
  }

   /**
   * Any additional information, which is not part of connection metadata or configuration
   * @return additionalInfo
  **/
  @javax.annotation.Nullable

  public List<ConnectionSideAdditionalInfo> getAdditionalInfo() {
    return additionalInfo;
  }


  public void setAdditionalInfo(List<ConnectionSideAdditionalInfo> additionalInfo) {
    this.additionalInfo = additionalInfo;
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
   * @return the ConnectionSide instance itself
   */
  public ConnectionSide putAdditionalProperty(String key, Object value) {
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
    ConnectionSide connectionSide = (ConnectionSide) o;
    return Objects.equals(this.serviceToken, connectionSide.serviceToken) &&
        Objects.equals(this.accessPoint, connectionSide.accessPoint) &&
        Objects.equals(this.companyProfile, connectionSide.companyProfile) &&
        Objects.equals(this.additionalInfo, connectionSide.additionalInfo)&&
        Objects.equals(this.additionalProperties, connectionSide.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceToken, accessPoint, companyProfile, additionalInfo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionSide {\n");
    sb.append("    serviceToken: ").append(toIndentedString(serviceToken)).append("\n");
    sb.append("    accessPoint: ").append(toIndentedString(accessPoint)).append("\n");
    sb.append("    companyProfile: ").append(toIndentedString(companyProfile)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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
    openapiFields.add("serviceToken");
    openapiFields.add("accessPoint");
    openapiFields.add("companyProfile");
    openapiFields.add("additionalInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConnectionSide
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ConnectionSide.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConnectionSide is not found in the empty JSON string", ConnectionSide.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `serviceToken`
      if (jsonObj.get("serviceToken") != null && !jsonObj.get("serviceToken").isJsonNull()) {
        SimplifiedServiceToken.validateJsonObject(jsonObj.getAsJsonObject("serviceToken"));
      }
      // validate the optional field `accessPoint`
      if (jsonObj.get("accessPoint") != null && !jsonObj.get("accessPoint").isJsonNull()) {
        AccessPoint.validateJsonObject(jsonObj.getAsJsonObject("accessPoint"));
      }
      // validate the optional field `companyProfile`
      if (jsonObj.get("companyProfile") != null && !jsonObj.get("companyProfile").isJsonNull()) {
        ConnectionCompanyProfile.validateJsonObject(jsonObj.getAsJsonObject("companyProfile"));
      }
      if (jsonObj.get("additionalInfo") != null && !jsonObj.get("additionalInfo").isJsonNull()) {
        JsonArray jsonArrayadditionalInfo = jsonObj.getAsJsonArray("additionalInfo");
        if (jsonArrayadditionalInfo != null) {
          // ensure the json data is an array
          if (!jsonObj.get("additionalInfo").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `additionalInfo` to be an array in the JSON string but got `%s`", jsonObj.get("additionalInfo").toString()));
          }

          // validate the optional field `additionalInfo` (array)
          for (int i = 0; i < jsonArrayadditionalInfo.size(); i++) {
            ConnectionSideAdditionalInfo.validateJsonObject(jsonArrayadditionalInfo.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConnectionSide.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConnectionSide' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConnectionSide> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConnectionSide.class));

       return (TypeAdapter<T>) new TypeAdapter<ConnectionSide>() {
           @Override
           public void write(JsonWriter out, ConnectionSide value) throws IOException {
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
           public ConnectionSide read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ConnectionSide instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ConnectionSide given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConnectionSide
  * @throws IOException if the JSON string is invalid with respect to ConnectionSide
  */
  public static ConnectionSide fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConnectionSide.class);
  }

 /**
  * Convert an instance of ConnectionSide to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

