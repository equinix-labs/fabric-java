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
import com.equinix.openapi.fabric.v4.model.LinkProtocolIpv4Ipv6Config;
import com.equinix.openapi.fabric.v4.model.LinkProtocolType;
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
 * Connection link protocol configuration - UNTAGGED
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LinkProtocolUntagged {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private LinkProtocolType type;

  public static final String SERIALIZED_NAME_IPV4 = "ipv4";
  @SerializedName(SERIALIZED_NAME_IPV4)
  private LinkProtocolIpv4Ipv6Config ipv4;

  public static final String SERIALIZED_NAME_IPV6 = "ipv6";
  @SerializedName(SERIALIZED_NAME_IPV6)
  private LinkProtocolIpv4Ipv6Config ipv6;

  public LinkProtocolUntagged() {
  }

  public LinkProtocolUntagged type(LinkProtocolType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable

  public LinkProtocolType getType() {
    return type;
  }


  public void setType(LinkProtocolType type) {
    this.type = type;
  }


  public LinkProtocolUntagged ipv4(LinkProtocolIpv4Ipv6Config ipv4) {
    
    this.ipv4 = ipv4;
    return this;
  }

   /**
   * Get ipv4
   * @return ipv4
  **/
  @javax.annotation.Nullable

  public LinkProtocolIpv4Ipv6Config getIpv4() {
    return ipv4;
  }


  public void setIpv4(LinkProtocolIpv4Ipv6Config ipv4) {
    this.ipv4 = ipv4;
  }


  public LinkProtocolUntagged ipv6(LinkProtocolIpv4Ipv6Config ipv6) {
    
    this.ipv6 = ipv6;
    return this;
  }

   /**
   * Get ipv6
   * @return ipv6
  **/
  @javax.annotation.Nullable

  public LinkProtocolIpv4Ipv6Config getIpv6() {
    return ipv6;
  }


  public void setIpv6(LinkProtocolIpv4Ipv6Config ipv6) {
    this.ipv6 = ipv6;
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
   * @return the LinkProtocolUntagged instance itself
   */
  public LinkProtocolUntagged putAdditionalProperty(String key, Object value) {
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
    LinkProtocolUntagged linkProtocolUntagged = (LinkProtocolUntagged) o;
    return Objects.equals(this.type, linkProtocolUntagged.type) &&
        Objects.equals(this.ipv4, linkProtocolUntagged.ipv4) &&
        Objects.equals(this.ipv6, linkProtocolUntagged.ipv6)&&
        Objects.equals(this.additionalProperties, linkProtocolUntagged.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, ipv4, ipv6, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkProtocolUntagged {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    ipv4: ").append(toIndentedString(ipv4)).append("\n");
    sb.append("    ipv6: ").append(toIndentedString(ipv6)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("ipv4");
    openapiFields.add("ipv6");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LinkProtocolUntagged
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LinkProtocolUntagged.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LinkProtocolUntagged is not found in the empty JSON string", LinkProtocolUntagged.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `ipv4`
      if (jsonObj.get("ipv4") != null && !jsonObj.get("ipv4").isJsonNull()) {
        LinkProtocolIpv4Ipv6Config.validateJsonObject(jsonObj.getAsJsonObject("ipv4"));
      }
      // validate the optional field `ipv6`
      if (jsonObj.get("ipv6") != null && !jsonObj.get("ipv6").isJsonNull()) {
        LinkProtocolIpv4Ipv6Config.validateJsonObject(jsonObj.getAsJsonObject("ipv6"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LinkProtocolUntagged.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LinkProtocolUntagged' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LinkProtocolUntagged> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LinkProtocolUntagged.class));

       return (TypeAdapter<T>) new TypeAdapter<LinkProtocolUntagged>() {
           @Override
           public void write(JsonWriter out, LinkProtocolUntagged value) throws IOException {
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
           public LinkProtocolUntagged read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LinkProtocolUntagged instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LinkProtocolUntagged given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LinkProtocolUntagged
  * @throws IOException if the JSON string is invalid with respect to LinkProtocolUntagged
  */
  public static LinkProtocolUntagged fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LinkProtocolUntagged.class);
  }

 /**
  * Convert an instance of LinkProtocolUntagged to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

