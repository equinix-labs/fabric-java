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
import com.equinix.openapi.fabric.v4.model.ConnectionRedundancy;
import com.equinix.openapi.fabric.v4.model.ConnectionSide;
import com.equinix.openapi.fabric.v4.model.ConnectionSideAdditionalInfo;
import com.equinix.openapi.fabric.v4.model.ConnectionType;
import com.equinix.openapi.fabric.v4.model.GeoScopeType;
import com.equinix.openapi.fabric.v4.model.Order;
import com.equinix.openapi.fabric.v4.model.Project;
import com.equinix.openapi.fabric.v4.model.SimplifiedNotification;
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
 * Create connection post request
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectionPostRequest {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ConnectionType type;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Order order;

  public static final String SERIALIZED_NAME_NOTIFICATIONS = "notifications";
  @SerializedName(SERIALIZED_NAME_NOTIFICATIONS)
  private List<SimplifiedNotification> notifications = new ArrayList<>();

  public static final String SERIALIZED_NAME_BANDWIDTH = "bandwidth";
  @SerializedName(SERIALIZED_NAME_BANDWIDTH)
  private Integer bandwidth;

  public static final String SERIALIZED_NAME_GEO_SCOPE = "geoScope";
  @SerializedName(SERIALIZED_NAME_GEO_SCOPE)
  private GeoScopeType geoScope;

  public static final String SERIALIZED_NAME_REDUNDANCY = "redundancy";
  @SerializedName(SERIALIZED_NAME_REDUNDANCY)
  private ConnectionRedundancy redundancy;

  public static final String SERIALIZED_NAME_A_SIDE = "aSide";
  @SerializedName(SERIALIZED_NAME_A_SIDE)
  private ConnectionSide aSide;

  public static final String SERIALIZED_NAME_Z_SIDE = "zSide";
  @SerializedName(SERIALIZED_NAME_Z_SIDE)
  private ConnectionSide zSide;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private Project project;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additionalInfo";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  private List<ConnectionSideAdditionalInfo> additionalInfo = new ArrayList<>();

  public ConnectionPostRequest() {
  }

  public ConnectionPostRequest type(ConnectionType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable

  public ConnectionType getType() {
    return type;
  }


  public void setType(ConnectionType type) {
    this.type = type;
  }


  public ConnectionPostRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Customer-provided connection name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ConnectionPostRequest order(Order order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable

  public Order getOrder() {
    return order;
  }


  public void setOrder(Order order) {
    this.order = order;
  }


  public ConnectionPostRequest notifications(List<SimplifiedNotification> notifications) {
    
    this.notifications = notifications;
    return this;
  }

  public ConnectionPostRequest addNotificationsItem(SimplifiedNotification notificationsItem) {
    if (this.notifications == null) {
      this.notifications = new ArrayList<>();
    }
    this.notifications.add(notificationsItem);
    return this;
  }

   /**
   * Preferences for notifications on connection configuration or status changes
   * @return notifications
  **/
  @javax.annotation.Nullable

  public List<SimplifiedNotification> getNotifications() {
    return notifications;
  }


  public void setNotifications(List<SimplifiedNotification> notifications) {
    this.notifications = notifications;
  }


  public ConnectionPostRequest bandwidth(Integer bandwidth) {
    
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Connection bandwidth in Mbps
   * minimum: 0
   * maximum: 50000
   * @return bandwidth
  **/
  @javax.annotation.Nullable

  public Integer getBandwidth() {
    return bandwidth;
  }


  public void setBandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
  }


  public ConnectionPostRequest geoScope(GeoScopeType geoScope) {
    
    this.geoScope = geoScope;
    return this;
  }

   /**
   * Get geoScope
   * @return geoScope
  **/
  @javax.annotation.Nullable

  public GeoScopeType getGeoScope() {
    return geoScope;
  }


  public void setGeoScope(GeoScopeType geoScope) {
    this.geoScope = geoScope;
  }


  public ConnectionPostRequest redundancy(ConnectionRedundancy redundancy) {
    
    this.redundancy = redundancy;
    return this;
  }

   /**
   * Get redundancy
   * @return redundancy
  **/
  @javax.annotation.Nullable

  public ConnectionRedundancy getRedundancy() {
    return redundancy;
  }


  public void setRedundancy(ConnectionRedundancy redundancy) {
    this.redundancy = redundancy;
  }


  public ConnectionPostRequest aSide(ConnectionSide aSide) {
    
    this.aSide = aSide;
    return this;
  }

   /**
   * Get aSide
   * @return aSide
  **/
  @javax.annotation.Nullable

  public ConnectionSide getaSide() {
    return aSide;
  }


  public void setaSide(ConnectionSide aSide) {
    this.aSide = aSide;
  }


  public ConnectionPostRequest zSide(ConnectionSide zSide) {
    
    this.zSide = zSide;
    return this;
  }

   /**
   * Get zSide
   * @return zSide
  **/
  @javax.annotation.Nullable

  public ConnectionSide getzSide() {
    return zSide;
  }


  public void setzSide(ConnectionSide zSide) {
    this.zSide = zSide;
  }


  public ConnectionPostRequest project(Project project) {
    
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


  public ConnectionPostRequest additionalInfo(List<ConnectionSideAdditionalInfo> additionalInfo) {
    
    this.additionalInfo = additionalInfo;
    return this;
  }

  public ConnectionPostRequest addAdditionalInfoItem(ConnectionSideAdditionalInfo additionalInfoItem) {
    if (this.additionalInfo == null) {
      this.additionalInfo = new ArrayList<>();
    }
    this.additionalInfo.add(additionalInfoItem);
    return this;
  }

   /**
   * Connection additional information
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
   * @return the ConnectionPostRequest instance itself
   */
  public ConnectionPostRequest putAdditionalProperty(String key, Object value) {
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
    ConnectionPostRequest connectionPostRequest = (ConnectionPostRequest) o;
    return Objects.equals(this.type, connectionPostRequest.type) &&
        Objects.equals(this.name, connectionPostRequest.name) &&
        Objects.equals(this.order, connectionPostRequest.order) &&
        Objects.equals(this.notifications, connectionPostRequest.notifications) &&
        Objects.equals(this.bandwidth, connectionPostRequest.bandwidth) &&
        Objects.equals(this.geoScope, connectionPostRequest.geoScope) &&
        Objects.equals(this.redundancy, connectionPostRequest.redundancy) &&
        Objects.equals(this.aSide, connectionPostRequest.aSide) &&
        Objects.equals(this.zSide, connectionPostRequest.zSide) &&
        Objects.equals(this.project, connectionPostRequest.project) &&
        Objects.equals(this.additionalInfo, connectionPostRequest.additionalInfo)&&
        Objects.equals(this.additionalProperties, connectionPostRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, order, notifications, bandwidth, geoScope, redundancy, aSide, zSide, project, additionalInfo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionPostRequest {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    geoScope: ").append(toIndentedString(geoScope)).append("\n");
    sb.append("    redundancy: ").append(toIndentedString(redundancy)).append("\n");
    sb.append("    aSide: ").append(toIndentedString(aSide)).append("\n");
    sb.append("    zSide: ").append(toIndentedString(zSide)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("name");
    openapiFields.add("order");
    openapiFields.add("notifications");
    openapiFields.add("bandwidth");
    openapiFields.add("geoScope");
    openapiFields.add("redundancy");
    openapiFields.add("aSide");
    openapiFields.add("zSide");
    openapiFields.add("project");
    openapiFields.add("additionalInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConnectionPostRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ConnectionPostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConnectionPostRequest is not found in the empty JSON string", ConnectionPostRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `order`
      if (jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) {
        Order.validateJsonObject(jsonObj.getAsJsonObject("order"));
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
      // validate the optional field `redundancy`
      if (jsonObj.get("redundancy") != null && !jsonObj.get("redundancy").isJsonNull()) {
        ConnectionRedundancy.validateJsonObject(jsonObj.getAsJsonObject("redundancy"));
      }
      // validate the optional field `aSide`
      if (jsonObj.get("aSide") != null && !jsonObj.get("aSide").isJsonNull()) {
        ConnectionSide.validateJsonObject(jsonObj.getAsJsonObject("aSide"));
      }
      // validate the optional field `zSide`
      if (jsonObj.get("zSide") != null && !jsonObj.get("zSide").isJsonNull()) {
        ConnectionSide.validateJsonObject(jsonObj.getAsJsonObject("zSide"));
      }
      // validate the optional field `project`
      if (jsonObj.get("project") != null && !jsonObj.get("project").isJsonNull()) {
        Project.validateJsonObject(jsonObj.getAsJsonObject("project"));
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
       if (!ConnectionPostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConnectionPostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConnectionPostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConnectionPostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ConnectionPostRequest>() {
           @Override
           public void write(JsonWriter out, ConnectionPostRequest value) throws IOException {
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
           public ConnectionPostRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ConnectionPostRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ConnectionPostRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConnectionPostRequest
  * @throws IOException if the JSON string is invalid with respect to ConnectionPostRequest
  */
  public static ConnectionPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConnectionPostRequest.class);
  }

 /**
  * Convert an instance of ConnectionPostRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

