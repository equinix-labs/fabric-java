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
import java.net.URI;
import java.util.*;

/**
 * Network specification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SimplifiedNetwork {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private UUID uuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private NetworkState state;

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

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private NetworkType type;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private NetworkScope scope;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private SimplifiedLocation location;

  public SimplifiedNetwork() {
  }

  
  public SimplifiedNetwork(
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
  @javax.annotation.Nullable

  public URI getHref() {
    return href;
  }




  public SimplifiedNetwork uuid(UUID uuid) {
    
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


  public SimplifiedNetwork name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Customer-assigned network name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SimplifiedNetwork state(NetworkState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable

  public NetworkState getState() {
    return state;
  }


  public void setState(NetworkState state) {
    this.state = state;
  }


  public SimplifiedNetwork account(SimplifiedAccount account) {
    
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


  public SimplifiedNetwork change(SimplifiedNetworkChange change) {
    
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


  public SimplifiedNetwork operation(NetworkOperation operation) {
    
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


  public SimplifiedNetwork changeLog(Changelog changeLog) {
    
    this.changeLog = changeLog;
    return this;
  }

   /**
   * Get changeLog
   * @return changeLog
  **/
  @javax.annotation.Nullable

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




  public SimplifiedNetwork type(NetworkType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable

  public NetworkType getType() {
    return type;
  }


  public void setType(NetworkType type) {
    this.type = type;
  }


  public SimplifiedNetwork scope(NetworkScope scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @javax.annotation.Nullable

  public NetworkScope getScope() {
    return scope;
  }


  public void setScope(NetworkScope scope) {
    this.scope = scope;
  }


  public SimplifiedNetwork location(SimplifiedLocation location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable

  public SimplifiedLocation getLocation() {
    return location;
  }


  public void setLocation(SimplifiedLocation location) {
    this.location = location;
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
   * @return the SimplifiedNetwork instance itself
   */
  public SimplifiedNetwork putAdditionalProperty(String key, Object value) {
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
    SimplifiedNetwork simplifiedNetwork = (SimplifiedNetwork) o;
    return Objects.equals(this.href, simplifiedNetwork.href) &&
        Objects.equals(this.uuid, simplifiedNetwork.uuid) &&
        Objects.equals(this.name, simplifiedNetwork.name) &&
        Objects.equals(this.state, simplifiedNetwork.state) &&
        Objects.equals(this.account, simplifiedNetwork.account) &&
        Objects.equals(this.change, simplifiedNetwork.change) &&
        Objects.equals(this.operation, simplifiedNetwork.operation) &&
        Objects.equals(this.changeLog, simplifiedNetwork.changeLog) &&
        Objects.equals(this.links, simplifiedNetwork.links) &&
        Objects.equals(this.type, simplifiedNetwork.type) &&
        Objects.equals(this.scope, simplifiedNetwork.scope) &&
        Objects.equals(this.location, simplifiedNetwork.location)&&
        Objects.equals(this.additionalProperties, simplifiedNetwork.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, uuid, name, state, account, change, operation, changeLog, links, type, scope, location, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimplifiedNetwork {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    changeLog: ").append(toIndentedString(changeLog)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("state");
    openapiFields.add("account");
    openapiFields.add("change");
    openapiFields.add("operation");
    openapiFields.add("changeLog");
    openapiFields.add("links");
    openapiFields.add("type");
    openapiFields.add("scope");
    openapiFields.add("location");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("uuid");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SimplifiedNetwork
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SimplifiedNetwork.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SimplifiedNetwork is not found in the empty JSON string", SimplifiedNetwork.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SimplifiedNetwork.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if (!jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
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
      // validate the optional field `changeLog`
      if (jsonObj.get("changeLog") != null && !jsonObj.get("changeLog").isJsonNull()) {
        Changelog.validateJsonObject(jsonObj.getAsJsonObject("changeLog"));
      }
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
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        SimplifiedLocation.validateJsonObject(jsonObj.getAsJsonObject("location"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SimplifiedNetwork.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SimplifiedNetwork' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SimplifiedNetwork> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SimplifiedNetwork.class));

       return (TypeAdapter<T>) new TypeAdapter<SimplifiedNetwork>() {
           @Override
           public void write(JsonWriter out, SimplifiedNetwork value) throws IOException {
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
           public SimplifiedNetwork read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SimplifiedNetwork instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SimplifiedNetwork given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SimplifiedNetwork
  * @throws IOException if the JSON string is invalid with respect to SimplifiedNetwork
  */
  public static SimplifiedNetwork fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SimplifiedNetwork.class);
  }

 /**
  * Convert an instance of SimplifiedNetwork to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

