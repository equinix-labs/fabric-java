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
import com.equinix.openapi.fabric.v4.model.Changelog;
import com.equinix.openapi.fabric.v4.model.RouteFilterState;
import com.equinix.openapi.fabric.v4.model.RouteFiltersChange;
import com.equinix.openapi.fabric.v4.model.RouteFiltersDataProject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
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
 * RouteFiltersData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RouteFiltersData {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  /**
   * Route Filter type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    IPV4_PREFIX_FILTER("BGP_IPv4_PREFIX_FILTER"),
    
    IPV6_PREFIX_FILTER("BGP_IPv6_PREFIX_FILTER");

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
  private RouteFilterState state;

  public static final String SERIALIZED_NAME_CHANGE = "change";
  @SerializedName(SERIALIZED_NAME_CHANGE)
  private RouteFiltersChange change;

  /**
   * Gets or Sets notMatchedRuleAction
   */
  @JsonAdapter(NotMatchedRuleActionEnum.Adapter.class)
  public enum NotMatchedRuleActionEnum {
    ALLOW("ALLOW"),
    
    DENY("DENY");

    private String value;

    NotMatchedRuleActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NotMatchedRuleActionEnum fromValue(String value) {
      for (NotMatchedRuleActionEnum b : NotMatchedRuleActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NotMatchedRuleActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NotMatchedRuleActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NotMatchedRuleActionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NotMatchedRuleActionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NOT_MATCHED_RULE_ACTION = "notMatchedRuleAction";
  @SerializedName(SERIALIZED_NAME_NOT_MATCHED_RULE_ACTION)
  private NotMatchedRuleActionEnum notMatchedRuleAction;

  public static final String SERIALIZED_NAME_CONNECTIONS_COUNT = "connectionsCount";
  @SerializedName(SERIALIZED_NAME_CONNECTIONS_COUNT)
  private Integer connectionsCount;

  public static final String SERIALIZED_NAME_RULES_COUNT = "rulesCount";
  @SerializedName(SERIALIZED_NAME_RULES_COUNT)
  private Integer rulesCount;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private RouteFiltersDataProject project;

  public static final String SERIALIZED_NAME_CHANGELOG = "changelog";
  @SerializedName(SERIALIZED_NAME_CHANGELOG)
  private Changelog changelog;

  public RouteFiltersData() {
  }

  public RouteFiltersData href(URI href) {
    
    this.href = href;
    return this;
  }

   /**
   * Route filter URI
   * @return href
  **/
  @javax.annotation.Nullable

  public URI getHref() {
    return href;
  }


  public void setHref(URI href) {
    this.href = href;
  }


  public RouteFiltersData type(TypeEnum type) {
    
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


  public RouteFiltersData uuid(UUID uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Route filter identifier
   * @return uuid
  **/
  @javax.annotation.Nullable

  public UUID getUuid() {
    return uuid;
  }


  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }


  public RouteFiltersData name(String name) {
    
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


  public RouteFiltersData description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Customer-provided connection description
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public RouteFiltersData state(RouteFilterState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable

  public RouteFilterState getState() {
    return state;
  }


  public void setState(RouteFilterState state) {
    this.state = state;
  }


  public RouteFiltersData change(RouteFiltersChange change) {
    
    this.change = change;
    return this;
  }

   /**
   * Get change
   * @return change
  **/
  @javax.annotation.Nullable

  public RouteFiltersChange getChange() {
    return change;
  }


  public void setChange(RouteFiltersChange change) {
    this.change = change;
  }


  public RouteFiltersData notMatchedRuleAction(NotMatchedRuleActionEnum notMatchedRuleAction) {
    
    this.notMatchedRuleAction = notMatchedRuleAction;
    return this;
  }

   /**
   * Get notMatchedRuleAction
   * @return notMatchedRuleAction
  **/
  @javax.annotation.Nullable

  public NotMatchedRuleActionEnum getNotMatchedRuleAction() {
    return notMatchedRuleAction;
  }


  public void setNotMatchedRuleAction(NotMatchedRuleActionEnum notMatchedRuleAction) {
    this.notMatchedRuleAction = notMatchedRuleAction;
  }


  public RouteFiltersData connectionsCount(Integer connectionsCount) {
    
    this.connectionsCount = connectionsCount;
    return this;
  }

   /**
   * Get connectionsCount
   * @return connectionsCount
  **/
  @javax.annotation.Nullable

  public Integer getConnectionsCount() {
    return connectionsCount;
  }


  public void setConnectionsCount(Integer connectionsCount) {
    this.connectionsCount = connectionsCount;
  }


  public RouteFiltersData rulesCount(Integer rulesCount) {
    
    this.rulesCount = rulesCount;
    return this;
  }

   /**
   * Get rulesCount
   * @return rulesCount
  **/
  @javax.annotation.Nullable

  public Integer getRulesCount() {
    return rulesCount;
  }


  public void setRulesCount(Integer rulesCount) {
    this.rulesCount = rulesCount;
  }


  public RouteFiltersData project(RouteFiltersDataProject project) {
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @javax.annotation.Nullable

  public RouteFiltersDataProject getProject() {
    return project;
  }


  public void setProject(RouteFiltersDataProject project) {
    this.project = project;
  }


  public RouteFiltersData changelog(Changelog changelog) {
    
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
   * @return the RouteFiltersData instance itself
   */
  public RouteFiltersData putAdditionalProperty(String key, Object value) {
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
    RouteFiltersData routeFiltersData = (RouteFiltersData) o;
    return Objects.equals(this.href, routeFiltersData.href) &&
        Objects.equals(this.type, routeFiltersData.type) &&
        Objects.equals(this.uuid, routeFiltersData.uuid) &&
        Objects.equals(this.name, routeFiltersData.name) &&
        Objects.equals(this.description, routeFiltersData.description) &&
        Objects.equals(this.state, routeFiltersData.state) &&
        Objects.equals(this.change, routeFiltersData.change) &&
        Objects.equals(this.notMatchedRuleAction, routeFiltersData.notMatchedRuleAction) &&
        Objects.equals(this.connectionsCount, routeFiltersData.connectionsCount) &&
        Objects.equals(this.rulesCount, routeFiltersData.rulesCount) &&
        Objects.equals(this.project, routeFiltersData.project) &&
        Objects.equals(this.changelog, routeFiltersData.changelog)&&
        Objects.equals(this.additionalProperties, routeFiltersData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, type, uuid, name, description, state, change, notMatchedRuleAction, connectionsCount, rulesCount, project, changelog, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteFiltersData {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    notMatchedRuleAction: ").append(toIndentedString(notMatchedRuleAction)).append("\n");
    sb.append("    connectionsCount: ").append(toIndentedString(connectionsCount)).append("\n");
    sb.append("    rulesCount: ").append(toIndentedString(rulesCount)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
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
    openapiFields.add("change");
    openapiFields.add("notMatchedRuleAction");
    openapiFields.add("connectionsCount");
    openapiFields.add("rulesCount");
    openapiFields.add("project");
    openapiFields.add("changelog");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RouteFiltersData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RouteFiltersData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RouteFiltersData is not found in the empty JSON string", RouteFiltersData.openapiRequiredFields.toString()));
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
      // validate the optional field `change`
      if (jsonObj.get("change") != null && !jsonObj.get("change").isJsonNull()) {
        RouteFiltersChange.validateJsonObject(jsonObj.getAsJsonObject("change"));
      }
      if ((jsonObj.get("notMatchedRuleAction") != null && !jsonObj.get("notMatchedRuleAction").isJsonNull()) && !jsonObj.get("notMatchedRuleAction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notMatchedRuleAction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notMatchedRuleAction").toString()));
      }
      // validate the optional field `project`
      if (jsonObj.get("project") != null && !jsonObj.get("project").isJsonNull()) {
        RouteFiltersDataProject.validateJsonObject(jsonObj.getAsJsonObject("project"));
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
       if (!RouteFiltersData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RouteFiltersData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RouteFiltersData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RouteFiltersData.class));

       return (TypeAdapter<T>) new TypeAdapter<RouteFiltersData>() {
           @Override
           public void write(JsonWriter out, RouteFiltersData value) throws IOException {
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
           public RouteFiltersData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RouteFiltersData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RouteFiltersData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RouteFiltersData
  * @throws IOException if the JSON string is invalid with respect to RouteFiltersData
  */
  public static RouteFiltersData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RouteFiltersData.class);
  }

 /**
  * Convert an instance of RouteFiltersData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

