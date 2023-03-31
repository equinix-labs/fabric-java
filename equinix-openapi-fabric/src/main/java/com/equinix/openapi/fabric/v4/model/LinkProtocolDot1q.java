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
 * Connection link protocol configuration - DOT1Q
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LinkProtocolDot1q {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private LinkProtocolType type;

  public static final String SERIALIZED_NAME_TAG_PROTOCOL_ID = "tagProtocolId";
  @SerializedName(SERIALIZED_NAME_TAG_PROTOCOL_ID)
  private String tagProtocolId;

  public static final String SERIALIZED_NAME_VLAN_TAG = "vlanTag";
  @SerializedName(SERIALIZED_NAME_VLAN_TAG)
  private String vlanTag;

  public static final String SERIALIZED_NAME_VLAN_TAG_MIN = "vlanTagMin";
  @SerializedName(SERIALIZED_NAME_VLAN_TAG_MIN)
  private Integer vlanTagMin;

  public static final String SERIALIZED_NAME_VLAN_TAG_MAX = "vlanTagMax";
  @SerializedName(SERIALIZED_NAME_VLAN_TAG_MAX)
  private Integer vlanTagMax;

  public LinkProtocolDot1q() {
  }

  public LinkProtocolDot1q type(LinkProtocolType type) {
    
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


  public LinkProtocolDot1q tagProtocolId(String tagProtocolId) {
    
    this.tagProtocolId = tagProtocolId;
    return this;
  }

   /**
   * Tag protocol identifier
   * @return tagProtocolId
  **/
  @javax.annotation.Nullable

  public String getTagProtocolId() {
    return tagProtocolId;
  }


  public void setTagProtocolId(String tagProtocolId) {
    this.tagProtocolId = tagProtocolId;
  }


  public LinkProtocolDot1q vlanTag(String vlanTag) {
    
    this.vlanTag = vlanTag;
    return this;
  }

   /**
   * VLAN tag
   * @return vlanTag
  **/
  @javax.annotation.Nonnull

  public String getVlanTag() {
    return vlanTag;
  }


  public void setVlanTag(String vlanTag) {
    this.vlanTag = vlanTag;
  }


  public LinkProtocolDot1q vlanTagMin(Integer vlanTagMin) {
    
    this.vlanTagMin = vlanTagMin;
    return this;
  }

   /**
   * VLAN tag Min value specified for DOT1Q connections
   * @return vlanTagMin
  **/
  @javax.annotation.Nullable

  public Integer getVlanTagMin() {
    return vlanTagMin;
  }


  public void setVlanTagMin(Integer vlanTagMin) {
    this.vlanTagMin = vlanTagMin;
  }


  public LinkProtocolDot1q vlanTagMax(Integer vlanTagMax) {
    
    this.vlanTagMax = vlanTagMax;
    return this;
  }

   /**
   * VLAN tag Max value specified for DOT1Q connections
   * @return vlanTagMax
  **/
  @javax.annotation.Nullable

  public Integer getVlanTagMax() {
    return vlanTagMax;
  }


  public void setVlanTagMax(Integer vlanTagMax) {
    this.vlanTagMax = vlanTagMax;
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
   * @return the LinkProtocolDot1q instance itself
   */
  public LinkProtocolDot1q putAdditionalProperty(String key, Object value) {
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
    LinkProtocolDot1q linkProtocolDot1q = (LinkProtocolDot1q) o;
    return Objects.equals(this.type, linkProtocolDot1q.type) &&
        Objects.equals(this.tagProtocolId, linkProtocolDot1q.tagProtocolId) &&
        Objects.equals(this.vlanTag, linkProtocolDot1q.vlanTag) &&
        Objects.equals(this.vlanTagMin, linkProtocolDot1q.vlanTagMin) &&
        Objects.equals(this.vlanTagMax, linkProtocolDot1q.vlanTagMax)&&
        Objects.equals(this.additionalProperties, linkProtocolDot1q.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, tagProtocolId, vlanTag, vlanTagMin, vlanTagMax, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkProtocolDot1q {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    tagProtocolId: ").append(toIndentedString(tagProtocolId)).append("\n");
    sb.append("    vlanTag: ").append(toIndentedString(vlanTag)).append("\n");
    sb.append("    vlanTagMin: ").append(toIndentedString(vlanTagMin)).append("\n");
    sb.append("    vlanTagMax: ").append(toIndentedString(vlanTagMax)).append("\n");
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
    openapiFields.add("tagProtocolId");
    openapiFields.add("vlanTag");
    openapiFields.add("vlanTagMin");
    openapiFields.add("vlanTagMax");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("vlanTag");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LinkProtocolDot1q
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LinkProtocolDot1q.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LinkProtocolDot1q is not found in the empty JSON string", LinkProtocolDot1q.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LinkProtocolDot1q.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("tagProtocolId") != null && !jsonObj.get("tagProtocolId").isJsonNull()) && !jsonObj.get("tagProtocolId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tagProtocolId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tagProtocolId").toString()));
      }
      if (!jsonObj.get("vlanTag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vlanTag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vlanTag").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LinkProtocolDot1q.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LinkProtocolDot1q' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LinkProtocolDot1q> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LinkProtocolDot1q.class));

       return (TypeAdapter<T>) new TypeAdapter<LinkProtocolDot1q>() {
           @Override
           public void write(JsonWriter out, LinkProtocolDot1q value) throws IOException {
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
           public LinkProtocolDot1q read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LinkProtocolDot1q instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LinkProtocolDot1q given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LinkProtocolDot1q
  * @throws IOException if the JSON string is invalid with respect to LinkProtocolDot1q
  */
  public static LinkProtocolDot1q fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LinkProtocolDot1q.class);
  }

 /**
  * Convert an instance of LinkProtocolDot1q to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

