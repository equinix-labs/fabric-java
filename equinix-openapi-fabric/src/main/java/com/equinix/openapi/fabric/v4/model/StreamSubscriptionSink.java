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
import com.equinix.openapi.fabric.v4.model.StreamSubscriptionSinkCredential;
import com.equinix.openapi.fabric.v4.model.StreamSubscriptionSinkSetting;
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
 * Create Stream destination
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StreamSubscriptionSink {
  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  /**
   * destination type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    DATADOG("DATADOG"),
    
    PAGERDUTY("PAGERDUTY"),
    
    SPLUNK_HEC("SPLUNK_HEC"),
    
    SLACK("SLACK"),
    
    TEAMS("TEAMS"),
    
    CUSTOM("CUSTOM");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_BATCH_ENABLED = "batchEnabled";
  @SerializedName(SERIALIZED_NAME_BATCH_ENABLED)
  private Boolean batchEnabled;

  public static final String SERIALIZED_NAME_BATCH_SIZE_MAX = "batchSizeMax";
  @SerializedName(SERIALIZED_NAME_BATCH_SIZE_MAX)
  private Integer batchSizeMax;

  public static final String SERIALIZED_NAME_BATCH_WAIT_TIME_MAX = "batchWaitTimeMax";
  @SerializedName(SERIALIZED_NAME_BATCH_WAIT_TIME_MAX)
  private Integer batchWaitTimeMax;

  public static final String SERIALIZED_NAME_CREDENTIAL = "credential";
  @SerializedName(SERIALIZED_NAME_CREDENTIAL)
  private StreamSubscriptionSinkCredential credential;

  public static final String SERIALIZED_NAME_SETTINGS = "settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private StreamSubscriptionSinkSetting settings;

  public StreamSubscriptionSink() {
  }

  public StreamSubscriptionSink uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * any publicly reachable http endpoint
   * @return uri
  **/
  @javax.annotation.Nullable

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public StreamSubscriptionSink type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * destination type
   * @return type
  **/
  @javax.annotation.Nullable

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public StreamSubscriptionSink batchEnabled(Boolean batchEnabled) {
    
    this.batchEnabled = batchEnabled;
    return this;
  }

   /**
   * batch mode on/off
   * @return batchEnabled
  **/
  @javax.annotation.Nullable

  public Boolean getBatchEnabled() {
    return batchEnabled;
  }


  public void setBatchEnabled(Boolean batchEnabled) {
    this.batchEnabled = batchEnabled;
  }


  public StreamSubscriptionSink batchSizeMax(Integer batchSizeMax) {
    
    this.batchSizeMax = batchSizeMax;
    return this;
  }

   /**
   * maximum batch size
   * @return batchSizeMax
  **/
  @javax.annotation.Nullable

  public Integer getBatchSizeMax() {
    return batchSizeMax;
  }


  public void setBatchSizeMax(Integer batchSizeMax) {
    this.batchSizeMax = batchSizeMax;
  }


  public StreamSubscriptionSink batchWaitTimeMax(Integer batchWaitTimeMax) {
    
    this.batchWaitTimeMax = batchWaitTimeMax;
    return this;
  }

   /**
   * maximum batch waiting time
   * @return batchWaitTimeMax
  **/
  @javax.annotation.Nullable

  public Integer getBatchWaitTimeMax() {
    return batchWaitTimeMax;
  }


  public void setBatchWaitTimeMax(Integer batchWaitTimeMax) {
    this.batchWaitTimeMax = batchWaitTimeMax;
  }


  public StreamSubscriptionSink credential(StreamSubscriptionSinkCredential credential) {
    
    this.credential = credential;
    return this;
  }

   /**
   * Get credential
   * @return credential
  **/
  @javax.annotation.Nullable

  public StreamSubscriptionSinkCredential getCredential() {
    return credential;
  }


  public void setCredential(StreamSubscriptionSinkCredential credential) {
    this.credential = credential;
  }


  public StreamSubscriptionSink settings(StreamSubscriptionSinkSetting settings) {
    
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nullable

  public StreamSubscriptionSinkSetting getSettings() {
    return settings;
  }


  public void setSettings(StreamSubscriptionSinkSetting settings) {
    this.settings = settings;
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
   * @return the StreamSubscriptionSink instance itself
   */
  public StreamSubscriptionSink putAdditionalProperty(String key, Object value) {
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
    StreamSubscriptionSink streamSubscriptionSink = (StreamSubscriptionSink) o;
    return Objects.equals(this.uri, streamSubscriptionSink.uri) &&
        Objects.equals(this.type, streamSubscriptionSink.type) &&
        Objects.equals(this.batchEnabled, streamSubscriptionSink.batchEnabled) &&
        Objects.equals(this.batchSizeMax, streamSubscriptionSink.batchSizeMax) &&
        Objects.equals(this.batchWaitTimeMax, streamSubscriptionSink.batchWaitTimeMax) &&
        Objects.equals(this.credential, streamSubscriptionSink.credential) &&
        Objects.equals(this.settings, streamSubscriptionSink.settings)&&
        Objects.equals(this.additionalProperties, streamSubscriptionSink.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, type, batchEnabled, batchSizeMax, batchWaitTimeMax, credential, settings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamSubscriptionSink {\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    batchEnabled: ").append(toIndentedString(batchEnabled)).append("\n");
    sb.append("    batchSizeMax: ").append(toIndentedString(batchSizeMax)).append("\n");
    sb.append("    batchWaitTimeMax: ").append(toIndentedString(batchWaitTimeMax)).append("\n");
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
    openapiFields.add("uri");
    openapiFields.add("type");
    openapiFields.add("batchEnabled");
    openapiFields.add("batchSizeMax");
    openapiFields.add("batchWaitTimeMax");
    openapiFields.add("credential");
    openapiFields.add("settings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StreamSubscriptionSink
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!StreamSubscriptionSink.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StreamSubscriptionSink is not found in the empty JSON string", StreamSubscriptionSink.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("uri") != null && !jsonObj.get("uri").isJsonNull()) && !jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `credential`
      if (jsonObj.get("credential") != null && !jsonObj.get("credential").isJsonNull()) {
        StreamSubscriptionSinkCredential.validateJsonObject(jsonObj.getAsJsonObject("credential"));
      }
      // validate the optional field `settings`
      if (jsonObj.get("settings") != null && !jsonObj.get("settings").isJsonNull()) {
        StreamSubscriptionSinkSetting.validateJsonObject(jsonObj.getAsJsonObject("settings"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StreamSubscriptionSink.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StreamSubscriptionSink' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StreamSubscriptionSink> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StreamSubscriptionSink.class));

       return (TypeAdapter<T>) new TypeAdapter<StreamSubscriptionSink>() {
           @Override
           public void write(JsonWriter out, StreamSubscriptionSink value) throws IOException {
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
           public StreamSubscriptionSink read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             StreamSubscriptionSink instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of StreamSubscriptionSink given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StreamSubscriptionSink
  * @throws IOException if the JSON string is invalid with respect to StreamSubscriptionSink
  */
  public static StreamSubscriptionSink fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StreamSubscriptionSink.class);
  }

 /**
  * Convert an instance of StreamSubscriptionSink to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
