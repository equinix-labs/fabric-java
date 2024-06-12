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

import java.util.Objects;
import java.util.Arrays;
import com.equinix.openapi.fabric.v4.model.Changelog;
import com.equinix.openapi.fabric.v4.model.Link;
import com.equinix.openapi.fabric.v4.model.NetworkOperation;
import com.equinix.openapi.fabric.v4.model.NetworkState;
import com.equinix.openapi.fabric.v4.model.SimplifiedAccount;
import com.equinix.openapi.fabric.v4.model.SimplifiedNetworkChange;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
 * NetworkAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NetworkAllOf {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private UUID uuid;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private NetworkState state;

  public static final String SERIALIZED_NAME_CONNECTIONS_COUNT = "connectionsCount";
  @SerializedName(SERIALIZED_NAME_CONNECTIONS_COUNT)
  private BigDecimal connectionsCount;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private SimplifiedAccount account;

  public static final String SERIALIZED_NAME_CHANGE = "change";
  @SerializedName(SERIALIZED_NAME_CHANGE)
  private SimplifiedNetworkChange change;

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private NetworkOperation operation;

  public static final String SERIALIZED_NAME_CHANGE_LOG = "changeLog";
  @SerializedName(SERIALIZED_NAME_CHANGE_LOG)
  private Changelog changeLog;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = new ArrayList<>();

  public NetworkAllOf() {
  }

  
  public NetworkAllOf(
     URI href, 
     List<Link> links
  ) {
    this();
    this.href = href;
    this.links = links;
  }

   /**
   * Network URI
   * @return href
  **/
  @javax.annotation.Nonnull

  public URI getHref() {
    return href;
  }




  public NetworkAllOf uuid(UUID uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Equinix-assigned network identifier
   * @return uuid
  **/
  @javax.annotation.Nonnull

  public UUID getUuid() {
    return uuid;
  }


  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }


  public NetworkAllOf state(NetworkState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull

  public NetworkState getState() {
    return state;
  }


  public void setState(NetworkState state) {
    this.state = state;
  }


  public NetworkAllOf connectionsCount(BigDecimal connectionsCount) {
    
    this.connectionsCount = connectionsCount;
    return this;
  }

   /**
   * number of connections created on the network
   * @return connectionsCount
  **/
  @javax.annotation.Nullable

  public BigDecimal getConnectionsCount() {
    return connectionsCount;
  }


  public void setConnectionsCount(BigDecimal connectionsCount) {
    this.connectionsCount = connectionsCount;
  }


  public NetworkAllOf account(SimplifiedAccount account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nullable

  public SimplifiedAccount getAccount() {
    return account;
  }


  public void setAccount(SimplifiedAccount account) {
    this.account = account;
  }


  public NetworkAllOf change(SimplifiedNetworkChange change) {
    
    this.change = change;
    return this;
  }

   /**
   * Get change
   * @return change
  **/
  @javax.annotation.Nullable

  public SimplifiedNetworkChange getChange() {
    return change;
  }


  public void setChange(SimplifiedNetworkChange change) {
    this.change = change;
  }


  public NetworkAllOf operation(NetworkOperation operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @javax.annotation.Nullable

  public NetworkOperation getOperation() {
    return operation;
  }


  public void setOperation(NetworkOperation operation) {
    this.operation = operation;
  }


  public NetworkAllOf changeLog(Changelog changeLog) {
    
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
   * Network sub-resources links
   * @return links
  **/
  @javax.annotation.Nullable

  public List<Link> getLinks() {
    return links;
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
   * @return the NetworkAllOf instance itself
   */
  public NetworkAllOf putAdditionalProperty(String key, Object value) {
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
    NetworkAllOf networkAllOf = (NetworkAllOf) o;
    return Objects.equals(this.href, networkAllOf.href) &&
        Objects.equals(this.uuid, networkAllOf.uuid) &&
        Objects.equals(this.state, networkAllOf.state) &&
        Objects.equals(this.connectionsCount, networkAllOf.connectionsCount) &&
        Objects.equals(this.account, networkAllOf.account) &&
        Objects.equals(this.change, networkAllOf.change) &&
        Objects.equals(this.operation, networkAllOf.operation) &&
        Objects.equals(this.changeLog, networkAllOf.changeLog) &&
        Objects.equals(this.links, networkAllOf.links)&&
        Objects.equals(this.additionalProperties, networkAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, uuid, state, connectionsCount, account, change, operation, changeLog, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkAllOf {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    connectionsCount: ").append(toIndentedString(connectionsCount)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    changeLog: ").append(toIndentedString(changeLog)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("uuid");
    openapiFields.add("state");
    openapiFields.add("connectionsCount");
    openapiFields.add("account");
    openapiFields.add("change");
    openapiFields.add("operation");
    openapiFields.add("changeLog");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("href");
    openapiRequiredFields.add("uuid");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("changeLog");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NetworkAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NetworkAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NetworkAllOf is not found in the empty JSON string", NetworkAllOf.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NetworkAllOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if (!jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      // validate the optional field `account`
      if (jsonObj.get("account") != null && !jsonObj.get("account").isJsonNull()) {
        SimplifiedAccount.validateJsonObject(jsonObj.getAsJsonObject("account"));
      }
      // validate the optional field `change`
      if (jsonObj.get("change") != null && !jsonObj.get("change").isJsonNull()) {
        SimplifiedNetworkChange.validateJsonObject(jsonObj.getAsJsonObject("change"));
      }
      // validate the optional field `operation`
      if (jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonNull()) {
        NetworkOperation.validateJsonObject(jsonObj.getAsJsonObject("operation"));
      }
      // validate the required field `changeLog`
      Changelog.validateJsonObject(jsonObj.getAsJsonObject("changeLog"));
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
          }

          // validate the optional field `links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            Link.validateJsonObject(jsonArraylinks.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NetworkAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NetworkAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NetworkAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NetworkAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<NetworkAllOf>() {
           @Override
           public void write(JsonWriter out, NetworkAllOf value) throws IOException {
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
           public NetworkAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             NetworkAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of NetworkAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NetworkAllOf
  * @throws IOException if the JSON string is invalid with respect to NetworkAllOf
  */
  public static NetworkAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NetworkAllOf.class);
  }

 /**
  * Convert an instance of NetworkAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

