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
import com.equinix.openapi.fabric.v4.model.Changelog;
import com.equinix.openapi.fabric.v4.model.Project;
import com.equinix.openapi.fabric.v4.model.ServiceTokenConnection;
import com.equinix.openapi.fabric.v4.model.ServiceTokenState;
import com.equinix.openapi.fabric.v4.model.ServiceTokenType;
import com.equinix.openapi.fabric.v4.model.SimplifiedAccount;
import com.equinix.openapi.fabric.v4.model.SimplifiedNotification;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import java.time.OffsetDateTime;
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
 * Create Service Tokens (v4) generates Equinix Fabric service tokens. These tokens authorize users to access protected resources and services. The tokens remove sensitive content from the environment, rather than just masking it, making the protected data impossible to unencrypt or decrypt. Resource owners can distribute the tokens to trusted partners and vendors, allowing selected third parties to work directly with Equinix network assets.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceToken {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ServiceTokenType type;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private UUID uuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE_TIME = "expirationDateTime";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE_TIME)
  private OffsetDateTime expirationDateTime;

  public static final String SERIALIZED_NAME_CONNECTION = "connection";
  @SerializedName(SERIALIZED_NAME_CONNECTION)
  private ServiceTokenConnection connection;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private ServiceTokenState state;

  public static final String SERIALIZED_NAME_NOTIFICATIONS = "notifications";
  @SerializedName(SERIALIZED_NAME_NOTIFICATIONS)
  private List<SimplifiedNotification> notifications = new ArrayList<>();

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private SimplifiedAccount account;

  public static final String SERIALIZED_NAME_CHANGELOG = "changelog";
  @SerializedName(SERIALIZED_NAME_CHANGELOG)
  private Changelog changelog;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private Project project;

  public ServiceToken() {
  }

  
  public ServiceToken(
     URI href
  ) {
    this();
    this.href = href;
  }

  public ServiceToken type(ServiceTokenType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable

  public ServiceTokenType getType() {
    return type;
  }


  public void setType(ServiceTokenType type) {
    this.type = type;
  }


   /**
   * An absolute URL that is the subject of the link&#39;s context.
   * @return href
  **/
  @javax.annotation.Nullable

  public URI getHref() {
    return href;
  }




  public ServiceToken uuid(UUID uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Equinix-assigned service token identifier
   * @return uuid
  **/
  @javax.annotation.Nonnull

  public UUID getUuid() {
    return uuid;
  }


  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }


  public ServiceToken name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Customer-provided service token name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ServiceToken description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Customer-provided service token description
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ServiceToken expirationDateTime(OffsetDateTime expirationDateTime) {
    
    this.expirationDateTime = expirationDateTime;
    return this;
  }

   /**
   * Expiration date and time of the service token.
   * @return expirationDateTime
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getExpirationDateTime() {
    return expirationDateTime;
  }


  public void setExpirationDateTime(OffsetDateTime expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
  }


  public ServiceToken connection(ServiceTokenConnection connection) {
    
    this.connection = connection;
    return this;
  }

   /**
   * Get connection
   * @return connection
  **/
  @javax.annotation.Nullable

  public ServiceTokenConnection getConnection() {
    return connection;
  }


  public void setConnection(ServiceTokenConnection connection) {
    this.connection = connection;
  }


  public ServiceToken state(ServiceTokenState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable

  public ServiceTokenState getState() {
    return state;
  }


  public void setState(ServiceTokenState state) {
    this.state = state;
  }


  public ServiceToken notifications(List<SimplifiedNotification> notifications) {
    
    this.notifications = notifications;
    return this;
  }

  public ServiceToken addNotificationsItem(SimplifiedNotification notificationsItem) {
    if (this.notifications == null) {
      this.notifications = new ArrayList<>();
    }
    this.notifications.add(notificationsItem);
    return this;
  }

   /**
   * Service token related notifications
   * @return notifications
  **/
  @javax.annotation.Nullable

  public List<SimplifiedNotification> getNotifications() {
    return notifications;
  }


  public void setNotifications(List<SimplifiedNotification> notifications) {
    this.notifications = notifications;
  }


  public ServiceToken account(SimplifiedAccount account) {
    
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


  public ServiceToken changelog(Changelog changelog) {
    
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


  public ServiceToken project(Project project) {
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @javax.annotation.Nullable

  public Project getProject() {
    return project;
  }


  public void setProject(Project project) {
    this.project = project;
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
   * @return the ServiceToken instance itself
   */
  public ServiceToken putAdditionalProperty(String key, Object value) {
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
    ServiceToken serviceToken = (ServiceToken) o;
    return Objects.equals(this.type, serviceToken.type) &&
        Objects.equals(this.href, serviceToken.href) &&
        Objects.equals(this.uuid, serviceToken.uuid) &&
        Objects.equals(this.name, serviceToken.name) &&
        Objects.equals(this.description, serviceToken.description) &&
        Objects.equals(this.expirationDateTime, serviceToken.expirationDateTime) &&
        Objects.equals(this.connection, serviceToken.connection) &&
        Objects.equals(this.state, serviceToken.state) &&
        Objects.equals(this.notifications, serviceToken.notifications) &&
        Objects.equals(this.account, serviceToken.account) &&
        Objects.equals(this.changelog, serviceToken.changelog) &&
        Objects.equals(this.project, serviceToken.project)&&
        Objects.equals(this.additionalProperties, serviceToken.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, href, uuid, name, description, expirationDateTime, connection, state, notifications, account, changelog, project, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceToken {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    changelog: ").append(toIndentedString(changelog)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
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
    openapiFields.add("href");
    openapiFields.add("uuid");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("expirationDateTime");
    openapiFields.add("connection");
    openapiFields.add("state");
    openapiFields.add("notifications");
    openapiFields.add("account");
    openapiFields.add("changelog");
    openapiFields.add("project");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("uuid");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ServiceToken
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ServiceToken.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ServiceToken is not found in the empty JSON string", ServiceToken.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ServiceToken.openapiRequiredFields) {
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
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `connection`
      if (jsonObj.get("connection") != null && !jsonObj.get("connection").isJsonNull()) {
        ServiceTokenConnection.validateJsonObject(jsonObj.getAsJsonObject("connection"));
      }
      if (jsonObj.get("notifications") != null && !jsonObj.get("notifications").isJsonNull()) {
        JsonArray jsonArraynotifications = jsonObj.getAsJsonArray("notifications");
        if (jsonArraynotifications != null) {
          // ensure the json data is an array
          if (!jsonObj.get("notifications").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `notifications` to be an array in the JSON string but got `%s`", jsonObj.get("notifications").toString()));
          }

          // validate the optional field `notifications` (array)
          for (int i = 0; i < jsonArraynotifications.size(); i++) {
            SimplifiedNotification.validateJsonObject(jsonArraynotifications.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `account`
      if (jsonObj.get("account") != null && !jsonObj.get("account").isJsonNull()) {
        SimplifiedAccount.validateJsonObject(jsonObj.getAsJsonObject("account"));
      }
      // validate the optional field `changelog`
      if (jsonObj.get("changelog") != null && !jsonObj.get("changelog").isJsonNull()) {
        Changelog.validateJsonObject(jsonObj.getAsJsonObject("changelog"));
      }
      // validate the optional field `project`
      if (jsonObj.get("project") != null && !jsonObj.get("project").isJsonNull()) {
        Project.validateJsonObject(jsonObj.getAsJsonObject("project"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServiceToken.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServiceToken' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServiceToken> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServiceToken.class));

       return (TypeAdapter<T>) new TypeAdapter<ServiceToken>() {
           @Override
           public void write(JsonWriter out, ServiceToken value) throws IOException {
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
           public ServiceToken read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ServiceToken instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ServiceToken given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServiceToken
  * @throws IOException if the JSON string is invalid with respect to ServiceToken
  */
  public static ServiceToken fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServiceToken.class);
  }

 /**
  * Convert an instance of ServiceToken to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

