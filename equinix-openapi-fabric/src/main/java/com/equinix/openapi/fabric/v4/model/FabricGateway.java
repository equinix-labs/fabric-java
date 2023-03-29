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
import com.equinix.openapi.fabric.v4.model.Changelog;
import com.equinix.openapi.fabric.v4.model.FabricGatewayAccessPointState;
import com.equinix.openapi.fabric.v4.model.FabricGatewayPackageType;
import com.equinix.openapi.fabric.v4.model.GatewayChange;
import com.equinix.openapi.fabric.v4.model.Order;
import com.equinix.openapi.fabric.v4.model.Project;
import com.equinix.openapi.fabric.v4.model.SimplifiedAccount;
import com.equinix.openapi.fabric.v4.model.SimplifiedLocationWithoutIBX;
import com.equinix.openapi.fabric.v4.model.SimplifiedNotification;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * Fabric Gateway Access point object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FabricGateway {
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
  private FabricGatewayAccessPointState state;

  public static final String SERIALIZED_NAME_EQUINIX_ASN = "equinixAsn";
  @SerializedName(SERIALIZED_NAME_EQUINIX_ASN)
  private Long equinixAsn;

  public static final String SERIALIZED_NAME_BGP_IPV4_ROUTES_COUNT = "bgpIpv4RoutesCount";
  @SerializedName(SERIALIZED_NAME_BGP_IPV4_ROUTES_COUNT)
  private Integer bgpIpv4RoutesCount;

  public static final String SERIALIZED_NAME_BGP_IPV6_ROUTES_COUNT = "bgpIpv6RoutesCount";
  @SerializedName(SERIALIZED_NAME_BGP_IPV6_ROUTES_COUNT)
  private Integer bgpIpv6RoutesCount;

  public static final String SERIALIZED_NAME_CONNECTIONS_COUNT = "connectionsCount";
  @SerializedName(SERIALIZED_NAME_CONNECTIONS_COUNT)
  private Integer connectionsCount;

  public static final String SERIALIZED_NAME_CHANGE_LOG = "changeLog";
  @SerializedName(SERIALIZED_NAME_CHANGE_LOG)
  private Changelog changeLog;

  public static final String SERIALIZED_NAME_CHANGE = "change";
  @SerializedName(SERIALIZED_NAME_CHANGE)
  private GatewayChange change;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    XF_GATEWAY("XF_GATEWAY");

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

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private SimplifiedLocationWithoutIBX location;

  public static final String SERIALIZED_NAME_PACKAGE = "package";
  @SerializedName(SERIALIZED_NAME_PACKAGE)
  private FabricGatewayPackageType _package;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Order order;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private Project project;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private SimplifiedAccount account;

  public static final String SERIALIZED_NAME_NOTIFICATIONS = "notifications";
  @SerializedName(SERIALIZED_NAME_NOTIFICATIONS)
  private List<SimplifiedNotification> notifications = new ArrayList<>();

  public FabricGateway() {
  }

  
  public FabricGateway(
     URI href
  ) {
    this();
    this.href = href;
  }

   /**
   * Fabric Gateway URI
   * @return href
  **/
  @javax.annotation.Nullable

  public URI getHref() {
    return href;
  }




  public FabricGateway uuid(UUID uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Equinix-assigned access point identifier
   * @return uuid
  **/
  @javax.annotation.Nullable

  public UUID getUuid() {
    return uuid;
  }


  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }


  public FabricGateway name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Customer-provided Fabric Gateway name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public FabricGateway state(FabricGatewayAccessPointState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable

  public FabricGatewayAccessPointState getState() {
    return state;
  }


  public void setState(FabricGatewayAccessPointState state) {
    this.state = state;
  }


  public FabricGateway equinixAsn(Long equinixAsn) {
    
    this.equinixAsn = equinixAsn;
    return this;
  }

   /**
   * Equinix ASN
   * @return equinixAsn
  **/
  @javax.annotation.Nullable

  public Long getEquinixAsn() {
    return equinixAsn;
  }


  public void setEquinixAsn(Long equinixAsn) {
    this.equinixAsn = equinixAsn;
  }


  public FabricGateway bgpIpv4RoutesCount(Integer bgpIpv4RoutesCount) {
    
    this.bgpIpv4RoutesCount = bgpIpv4RoutesCount;
    return this;
  }

   /**
   * Access point used and maximum number of IPv4 BGP routes
   * minimum: 0
   * @return bgpIpv4RoutesCount
  **/
  @javax.annotation.Nullable

  public Integer getBgpIpv4RoutesCount() {
    return bgpIpv4RoutesCount;
  }


  public void setBgpIpv4RoutesCount(Integer bgpIpv4RoutesCount) {
    this.bgpIpv4RoutesCount = bgpIpv4RoutesCount;
  }


  public FabricGateway bgpIpv6RoutesCount(Integer bgpIpv6RoutesCount) {
    
    this.bgpIpv6RoutesCount = bgpIpv6RoutesCount;
    return this;
  }

   /**
   * Access point used and maximum number of IPv6 BGP routes
   * minimum: 0
   * @return bgpIpv6RoutesCount
  **/
  @javax.annotation.Nullable

  public Integer getBgpIpv6RoutesCount() {
    return bgpIpv6RoutesCount;
  }


  public void setBgpIpv6RoutesCount(Integer bgpIpv6RoutesCount) {
    this.bgpIpv6RoutesCount = bgpIpv6RoutesCount;
  }


  public FabricGateway connectionsCount(Integer connectionsCount) {
    
    this.connectionsCount = connectionsCount;
    return this;
  }

   /**
   * Number of connections associated with this Access point
   * minimum: 0
   * @return connectionsCount
  **/
  @javax.annotation.Nullable

  public Integer getConnectionsCount() {
    return connectionsCount;
  }


  public void setConnectionsCount(Integer connectionsCount) {
    this.connectionsCount = connectionsCount;
  }


  public FabricGateway changeLog(Changelog changeLog) {
    
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


  public FabricGateway change(GatewayChange change) {
    
    this.change = change;
    return this;
  }

   /**
   * Get change
   * @return change
  **/
  @javax.annotation.Nullable

  public GatewayChange getChange() {
    return change;
  }


  public void setChange(GatewayChange change) {
    this.change = change;
  }


  public FabricGateway type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public FabricGateway location(SimplifiedLocationWithoutIBX location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable

  public SimplifiedLocationWithoutIBX getLocation() {
    return location;
  }


  public void setLocation(SimplifiedLocationWithoutIBX location) {
    this.location = location;
  }


  public FabricGateway _package(FabricGatewayPackageType _package) {
    
    this._package = _package;
    return this;
  }

   /**
   * Get _package
   * @return _package
  **/
  @javax.annotation.Nullable

  public FabricGatewayPackageType getPackage() {
    return _package;
  }


  public void setPackage(FabricGatewayPackageType _package) {
    this._package = _package;
  }


  public FabricGateway order(Order order) {
    
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


  public FabricGateway project(Project project) {
    
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


  public FabricGateway account(SimplifiedAccount account) {
    
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


  public FabricGateway notifications(List<SimplifiedNotification> notifications) {
    
    this.notifications = notifications;
    return this;
  }

  public FabricGateway addNotificationsItem(SimplifiedNotification notificationsItem) {
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
   * @return the FabricGateway instance itself
   */
  public FabricGateway putAdditionalProperty(String key, Object value) {
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
    FabricGateway fabricGateway = (FabricGateway) o;
    return Objects.equals(this.href, fabricGateway.href) &&
        Objects.equals(this.uuid, fabricGateway.uuid) &&
        Objects.equals(this.name, fabricGateway.name) &&
        Objects.equals(this.state, fabricGateway.state) &&
        Objects.equals(this.equinixAsn, fabricGateway.equinixAsn) &&
        Objects.equals(this.bgpIpv4RoutesCount, fabricGateway.bgpIpv4RoutesCount) &&
        Objects.equals(this.bgpIpv6RoutesCount, fabricGateway.bgpIpv6RoutesCount) &&
        Objects.equals(this.connectionsCount, fabricGateway.connectionsCount) &&
        Objects.equals(this.changeLog, fabricGateway.changeLog) &&
        Objects.equals(this.change, fabricGateway.change) &&
        Objects.equals(this.type, fabricGateway.type) &&
        Objects.equals(this.location, fabricGateway.location) &&
        Objects.equals(this._package, fabricGateway._package) &&
        Objects.equals(this.order, fabricGateway.order) &&
        Objects.equals(this.project, fabricGateway.project) &&
        Objects.equals(this.account, fabricGateway.account) &&
        Objects.equals(this.notifications, fabricGateway.notifications)&&
        Objects.equals(this.additionalProperties, fabricGateway.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, uuid, name, state, equinixAsn, bgpIpv4RoutesCount, bgpIpv6RoutesCount, connectionsCount, changeLog, change, type, location, _package, order, project, account, notifications, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FabricGateway {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    equinixAsn: ").append(toIndentedString(equinixAsn)).append("\n");
    sb.append("    bgpIpv4RoutesCount: ").append(toIndentedString(bgpIpv4RoutesCount)).append("\n");
    sb.append("    bgpIpv6RoutesCount: ").append(toIndentedString(bgpIpv6RoutesCount)).append("\n");
    sb.append("    connectionsCount: ").append(toIndentedString(connectionsCount)).append("\n");
    sb.append("    changeLog: ").append(toIndentedString(changeLog)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
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
    openapiFields.add("location");
    openapiFields.add("package");
    openapiFields.add("order");
    openapiFields.add("project");
    openapiFields.add("account");
    openapiFields.add("notifications");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FabricGateway
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FabricGateway.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FabricGateway is not found in the empty JSON string", FabricGateway.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `changeLog`
      if (jsonObj.get("changeLog") != null && !jsonObj.get("changeLog").isJsonNull()) {
        Changelog.validateJsonObject(jsonObj.getAsJsonObject("changeLog"));
      }
      // validate the optional field `change`
      if (jsonObj.get("change") != null && !jsonObj.get("change").isJsonNull()) {
        GatewayChange.validateJsonObject(jsonObj.getAsJsonObject("change"));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        SimplifiedLocationWithoutIBX.validateJsonObject(jsonObj.getAsJsonObject("location"));
      }
      // validate the optional field `package`
      if (jsonObj.get("package") != null && !jsonObj.get("package").isJsonNull()) {
        FabricGatewayPackageType.validateJsonObject(jsonObj.getAsJsonObject("package"));
      }
      // validate the optional field `order`
      if (jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) {
        Order.validateJsonObject(jsonObj.getAsJsonObject("order"));
      }
      // validate the optional field `project`
      if (jsonObj.get("project") != null && !jsonObj.get("project").isJsonNull()) {
        Project.validateJsonObject(jsonObj.getAsJsonObject("project"));
      }
      // validate the optional field `account`
      if (jsonObj.get("account") != null && !jsonObj.get("account").isJsonNull()) {
        SimplifiedAccount.validateJsonObject(jsonObj.getAsJsonObject("account"));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FabricGateway.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FabricGateway' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FabricGateway> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FabricGateway.class));

       return (TypeAdapter<T>) new TypeAdapter<FabricGateway>() {
           @Override
           public void write(JsonWriter out, FabricGateway value) throws IOException {
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
           public FabricGateway read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FabricGateway instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FabricGateway given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FabricGateway
  * @throws IOException if the JSON string is invalid with respect to FabricGateway
  */
  public static FabricGateway fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FabricGateway.class);
  }

 /**
  * Convert an instance of FabricGateway to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
