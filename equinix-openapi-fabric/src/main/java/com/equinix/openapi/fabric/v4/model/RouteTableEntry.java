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
import com.equinix.openapi.fabric.v4.model.Changelog;
import com.equinix.openapi.fabric.v4.model.RouteTableEntryConnection;
import com.equinix.openapi.fabric.v4.model.RouteTableEntryProtocolType;
import com.equinix.openapi.fabric.v4.model.RouteTableEntryState;
import com.equinix.openapi.fabric.v4.model.RouteTableEntryType;
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
 * Route table entry object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RouteTableEntry {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private RouteTableEntryType type;

  public static final String SERIALIZED_NAME_PROTOCOL_TYPE = "protocolType";
  @SerializedName(SERIALIZED_NAME_PROTOCOL_TYPE)
  private RouteTableEntryProtocolType protocolType;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private RouteTableEntryState state;

  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private String age;

  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_NEXT_HOP = "nextHop";
  @SerializedName(SERIALIZED_NAME_NEXT_HOP)
  private String nextHop;

  public static final String SERIALIZED_NAME_METRIC = "metric";
  @SerializedName(SERIALIZED_NAME_METRIC)
  private Integer metric;

  public static final String SERIALIZED_NAME_LOCAL_PREFERENCE = "localPreference";
  @SerializedName(SERIALIZED_NAME_LOCAL_PREFERENCE)
  private Integer localPreference;

  public static final String SERIALIZED_NAME_AS_PATH = "asPath";
  @SerializedName(SERIALIZED_NAME_AS_PATH)
  private List<Integer> asPath = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONNECTION = "connection";
  @SerializedName(SERIALIZED_NAME_CONNECTION)
  private RouteTableEntryConnection connection;

  public static final String SERIALIZED_NAME_CHANGE_LOG = "changeLog";
  @SerializedName(SERIALIZED_NAME_CHANGE_LOG)
  private Changelog changeLog;

  public RouteTableEntry() {
  }

  public RouteTableEntry type(RouteTableEntryType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull

  public RouteTableEntryType getType() {
    return type;
  }


  public void setType(RouteTableEntryType type) {
    this.type = type;
  }


  public RouteTableEntry protocolType(RouteTableEntryProtocolType protocolType) {
    
    this.protocolType = protocolType;
    return this;
  }

   /**
   * Get protocolType
   * @return protocolType
  **/
  @javax.annotation.Nullable

  public RouteTableEntryProtocolType getProtocolType() {
    return protocolType;
  }


  public void setProtocolType(RouteTableEntryProtocolType protocolType) {
    this.protocolType = protocolType;
  }


  public RouteTableEntry state(RouteTableEntryState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull

  public RouteTableEntryState getState() {
    return state;
  }


  public void setState(RouteTableEntryState state) {
    this.state = state;
  }


  public RouteTableEntry age(String age) {
    
    this.age = age;
    return this;
  }

   /**
   * Get age
   * @return age
  **/
  @javax.annotation.Nullable

  public String getAge() {
    return age;
  }


  public void setAge(String age) {
    this.age = age;
  }


  public RouteTableEntry prefix(String prefix) {
    
    this.prefix = prefix;
    return this;
  }

   /**
   * Get prefix
   * @return prefix
  **/
  @javax.annotation.Nullable

  public String getPrefix() {
    return prefix;
  }


  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public RouteTableEntry nextHop(String nextHop) {
    
    this.nextHop = nextHop;
    return this;
  }

   /**
   * Get nextHop
   * @return nextHop
  **/
  @javax.annotation.Nullable

  public String getNextHop() {
    return nextHop;
  }


  public void setNextHop(String nextHop) {
    this.nextHop = nextHop;
  }


  public RouteTableEntry metric(Integer metric) {
    
    this.metric = metric;
    return this;
  }

   /**
   * Get metric
   * @return metric
  **/
  @javax.annotation.Nullable

  public Integer getMetric() {
    return metric;
  }


  public void setMetric(Integer metric) {
    this.metric = metric;
  }


  public RouteTableEntry localPreference(Integer localPreference) {
    
    this.localPreference = localPreference;
    return this;
  }

   /**
   * Get localPreference
   * @return localPreference
  **/
  @javax.annotation.Nullable

  public Integer getLocalPreference() {
    return localPreference;
  }


  public void setLocalPreference(Integer localPreference) {
    this.localPreference = localPreference;
  }


  public RouteTableEntry asPath(List<Integer> asPath) {
    
    this.asPath = asPath;
    return this;
  }

  public RouteTableEntry addAsPathItem(Integer asPathItem) {
    if (this.asPath == null) {
      this.asPath = new ArrayList<>();
    }
    this.asPath.add(asPathItem);
    return this;
  }

   /**
   * Get asPath
   * @return asPath
  **/
  @javax.annotation.Nullable

  public List<Integer> getAsPath() {
    return asPath;
  }


  public void setAsPath(List<Integer> asPath) {
    this.asPath = asPath;
  }


  public RouteTableEntry connection(RouteTableEntryConnection connection) {
    
    this.connection = connection;
    return this;
  }

   /**
   * Get connection
   * @return connection
  **/
  @javax.annotation.Nullable

  public RouteTableEntryConnection getConnection() {
    return connection;
  }


  public void setConnection(RouteTableEntryConnection connection) {
    this.connection = connection;
  }


  public RouteTableEntry changeLog(Changelog changeLog) {
    
    this.changeLog = changeLog;
    return this;
  }

   /**
   * Get changeLog
   * @return changeLog
  **/
  @javax.annotation.Nonnull

  public Changelog getChangeLog() {
    return changeLog;
  }


  public void setChangeLog(Changelog changeLog) {
    this.changeLog = changeLog;
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
   * @return the RouteTableEntry instance itself
   */
  public RouteTableEntry putAdditionalProperty(String key, Object value) {
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
    RouteTableEntry routeTableEntry = (RouteTableEntry) o;
    return Objects.equals(this.type, routeTableEntry.type) &&
        Objects.equals(this.protocolType, routeTableEntry.protocolType) &&
        Objects.equals(this.state, routeTableEntry.state) &&
        Objects.equals(this.age, routeTableEntry.age) &&
        Objects.equals(this.prefix, routeTableEntry.prefix) &&
        Objects.equals(this.nextHop, routeTableEntry.nextHop) &&
        Objects.equals(this.metric, routeTableEntry.metric) &&
        Objects.equals(this.localPreference, routeTableEntry.localPreference) &&
        Objects.equals(this.asPath, routeTableEntry.asPath) &&
        Objects.equals(this.connection, routeTableEntry.connection) &&
        Objects.equals(this.changeLog, routeTableEntry.changeLog)&&
        Objects.equals(this.additionalProperties, routeTableEntry.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, protocolType, state, age, prefix, nextHop, metric, localPreference, asPath, connection, changeLog, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteTableEntry {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    protocolType: ").append(toIndentedString(protocolType)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    nextHop: ").append(toIndentedString(nextHop)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    localPreference: ").append(toIndentedString(localPreference)).append("\n");
    sb.append("    asPath: ").append(toIndentedString(asPath)).append("\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("    changeLog: ").append(toIndentedString(changeLog)).append("\n");
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
    openapiFields.add("protocolType");
    openapiFields.add("state");
    openapiFields.add("age");
    openapiFields.add("prefix");
    openapiFields.add("nextHop");
    openapiFields.add("metric");
    openapiFields.add("localPreference");
    openapiFields.add("asPath");
    openapiFields.add("connection");
    openapiFields.add("changeLog");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("changeLog");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RouteTableEntry
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RouteTableEntry.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RouteTableEntry is not found in the empty JSON string", RouteTableEntry.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RouteTableEntry.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("age") != null && !jsonObj.get("age").isJsonNull()) && !jsonObj.get("age").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `age` to be a primitive type in the JSON string but got `%s`", jsonObj.get("age").toString()));
      }
      if ((jsonObj.get("prefix") != null && !jsonObj.get("prefix").isJsonNull()) && !jsonObj.get("prefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prefix").toString()));
      }
      if ((jsonObj.get("nextHop") != null && !jsonObj.get("nextHop").isJsonNull()) && !jsonObj.get("nextHop").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextHop` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextHop").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("asPath") != null && !jsonObj.get("asPath").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `asPath` to be an array in the JSON string but got `%s`", jsonObj.get("asPath").toString()));
      }
      // validate the optional field `connection`
      if (jsonObj.get("connection") != null && !jsonObj.get("connection").isJsonNull()) {
        RouteTableEntryConnection.validateJsonObject(jsonObj.getAsJsonObject("connection"));
      }
      // validate the required field `changeLog`
      Changelog.validateJsonObject(jsonObj.getAsJsonObject("changeLog"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RouteTableEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RouteTableEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RouteTableEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RouteTableEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<RouteTableEntry>() {
           @Override
           public void write(JsonWriter out, RouteTableEntry value) throws IOException {
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
           public RouteTableEntry read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RouteTableEntry instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RouteTableEntry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RouteTableEntry
  * @throws IOException if the JSON string is invalid with respect to RouteTableEntry
  */
  public static RouteTableEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RouteTableEntry.class);
  }

 /**
  * Convert an instance of RouteTableEntry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

