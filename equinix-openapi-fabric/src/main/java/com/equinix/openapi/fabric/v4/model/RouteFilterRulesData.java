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
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.net.URI;
import java.util.*;

/**
 * RouteFilterRulesData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RouteFilterRulesData {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  /**
   * Route Filter type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    IPV4_PREFIX_FILTER_RULE("BGP_IPv4_PREFIX_FILTER_RULE"),
    
    IPV6_PREFIX_FILTER_RULE("BGP_IPv6_PREFIX_FILTER_RULE");

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

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private UUID uuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private RouteFilterRuleState state;

  public static final String SERIALIZED_NAME_PREFIX_MATCH = "prefixMatch";
  @SerializedName(SERIALIZED_NAME_PREFIX_MATCH)
  private String prefixMatch = "orlonger";

  public static final String SERIALIZED_NAME_CHANGE = "change";
  @SerializedName(SERIALIZED_NAME_CHANGE)
  private RouteFilterRulesChange change;

  /**
   * Gets or Sets action
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    PERMIT("PERMIT"),
    
    DENY("DENY");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ActionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private ActionEnum action;

  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_CHANGELOG = "changelog";
  @SerializedName(SERIALIZED_NAME_CHANGELOG)
  private Changelog changelog;

  public RouteFilterRulesData() {
  }

  public RouteFilterRulesData href(URI href) {
    
    this.href = href;
    return this;
  }

   /**
   * Route Filter Rules URI
   * @return href
  **/
  @javax.annotation.Nullable

  public URI getHref() {
    return href;
  }


  public void setHref(URI href) {
    this.href = href;
  }


  public RouteFilterRulesData type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Route Filter type
   * @return type
  **/
  @javax.annotation.Nullable

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public RouteFilterRulesData uuid(UUID uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Route Filter Rule identifier
   * @return uuid
  **/
  @javax.annotation.Nullable

  public UUID getUuid() {
    return uuid;
  }


  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }


  public RouteFilterRulesData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RouteFilterRulesData description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Customer-provided Route Filter Rule description
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public RouteFilterRulesData state(RouteFilterRuleState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable

  public RouteFilterRuleState getState() {
    return state;
  }


  public void setState(RouteFilterRuleState state) {
    this.state = state;
  }


  public RouteFilterRulesData prefixMatch(String prefixMatch) {
    
    this.prefixMatch = prefixMatch;
    return this;
  }

   /**
   * prefix matching operator
   * @return prefixMatch
  **/
  @javax.annotation.Nullable

  public String getPrefixMatch() {
    return prefixMatch;
  }


  public void setPrefixMatch(String prefixMatch) {
    this.prefixMatch = prefixMatch;
  }


  public RouteFilterRulesData change(RouteFilterRulesChange change) {
    
    this.change = change;
    return this;
  }

   /**
   * Get change
   * @return change
  **/
  @javax.annotation.Nullable

  public RouteFilterRulesChange getChange() {
    return change;
  }


  public void setChange(RouteFilterRulesChange change) {
    this.change = change;
  }


  public RouteFilterRulesData action(ActionEnum action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable

  public ActionEnum getAction() {
    return action;
  }


  public void setAction(ActionEnum action) {
    this.action = action;
  }


  public RouteFilterRulesData prefix(String prefix) {
    
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


  public RouteFilterRulesData changelog(Changelog changelog) {
    
    this.changelog = changelog;
    return this;
  }

   /**
   * Get changelog
   * @return changelog
  **/
  @javax.annotation.Nullable

  public Changelog getChangelog() {
    return changelog;
  }


  public void setChangelog(Changelog changelog) {
    this.changelog = changelog;
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
   * @return the RouteFilterRulesData instance itself
   */
  public RouteFilterRulesData putAdditionalProperty(String key, Object value) {
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
    RouteFilterRulesData routeFilterRulesData = (RouteFilterRulesData) o;
    return Objects.equals(this.href, routeFilterRulesData.href) &&
        Objects.equals(this.type, routeFilterRulesData.type) &&
        Objects.equals(this.uuid, routeFilterRulesData.uuid) &&
        Objects.equals(this.name, routeFilterRulesData.name) &&
        Objects.equals(this.description, routeFilterRulesData.description) &&
        Objects.equals(this.state, routeFilterRulesData.state) &&
        Objects.equals(this.prefixMatch, routeFilterRulesData.prefixMatch) &&
        Objects.equals(this.change, routeFilterRulesData.change) &&
        Objects.equals(this.action, routeFilterRulesData.action) &&
        Objects.equals(this.prefix, routeFilterRulesData.prefix) &&
        Objects.equals(this.changelog, routeFilterRulesData.changelog)&&
        Objects.equals(this.additionalProperties, routeFilterRulesData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, type, uuid, name, description, state, prefixMatch, change, action, prefix, changelog, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteFilterRulesData {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    prefixMatch: ").append(toIndentedString(prefixMatch)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    changelog: ").append(toIndentedString(changelog)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("uuid");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("state");
    openapiFields.add("prefixMatch");
    openapiFields.add("change");
    openapiFields.add("action");
    openapiFields.add("prefix");
    openapiFields.add("changelog");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RouteFilterRulesData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RouteFilterRulesData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RouteFilterRulesData is not found in the empty JSON string", RouteFilterRulesData.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("prefixMatch") != null && !jsonObj.get("prefixMatch").isJsonNull()) && !jsonObj.get("prefixMatch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prefixMatch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prefixMatch").toString()));
      }
      // validate the optional field `change`
      if (jsonObj.get("change") != null && !jsonObj.get("change").isJsonNull()) {
        RouteFilterRulesChange.validateJsonObject(jsonObj.getAsJsonObject("change"));
      }
      if ((jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      if ((jsonObj.get("prefix") != null && !jsonObj.get("prefix").isJsonNull()) && !jsonObj.get("prefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prefix").toString()));
      }
      // validate the optional field `changelog`
      if (jsonObj.get("changelog") != null && !jsonObj.get("changelog").isJsonNull()) {
        Changelog.validateJsonObject(jsonObj.getAsJsonObject("changelog"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RouteFilterRulesData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RouteFilterRulesData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RouteFilterRulesData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RouteFilterRulesData.class));

       return (TypeAdapter<T>) new TypeAdapter<RouteFilterRulesData>() {
           @Override
           public void write(JsonWriter out, RouteFilterRulesData value) throws IOException {
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
           public RouteFilterRulesData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RouteFilterRulesData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RouteFilterRulesData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RouteFilterRulesData
  * @throws IOException if the JSON string is invalid with respect to RouteFilterRulesData
  */
  public static RouteFilterRulesData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RouteFilterRulesData.class);
  }

 /**
  * Convert an instance of RouteFilterRulesData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

