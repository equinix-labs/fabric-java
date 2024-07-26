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
import com.equinix.openapi.fabric.v4.model.CloudRouterPostRequestPackage;
import com.equinix.openapi.fabric.v4.model.Order;
import com.equinix.openapi.fabric.v4.model.Project;
import com.equinix.openapi.fabric.v4.model.SimplifiedAccount;
import com.equinix.openapi.fabric.v4.model.SimplifiedLocationWithoutIBX;
import com.equinix.openapi.fabric.v4.model.SimplifiedNotification;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Create Cloud Router
 */
@JsonPropertyOrder({
  CloudRouterPostRequest.JSON_PROPERTY_TYPE,
  CloudRouterPostRequest.JSON_PROPERTY_NAME,
  CloudRouterPostRequest.JSON_PROPERTY_LOCATION,
  CloudRouterPostRequest.JSON_PROPERTY_PACKAGE,
  CloudRouterPostRequest.JSON_PROPERTY_ORDER,
  CloudRouterPostRequest.JSON_PROPERTY_PROJECT,
  CloudRouterPostRequest.JSON_PROPERTY_ACCOUNT,
  CloudRouterPostRequest.JSON_PROPERTY_NOTIFICATIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CloudRouterPostRequest {
  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    XF_ROUTER("XF_ROUTER");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private SimplifiedLocationWithoutIBX location;

  public static final String JSON_PROPERTY_PACKAGE = "package";
  private CloudRouterPostRequestPackage _package;

  public static final String JSON_PROPERTY_ORDER = "order";
  private Order order;

  public static final String JSON_PROPERTY_PROJECT = "project";
  private Project project;

  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private SimplifiedAccount account;

  public static final String JSON_PROPERTY_NOTIFICATIONS = "notifications";
  private List<SimplifiedNotification> notifications = new ArrayList<>();

  public CloudRouterPostRequest() {
  }

  public CloudRouterPostRequest type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CloudRouterPostRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Customer-provided Cloud Router name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public CloudRouterPostRequest location(SimplifiedLocationWithoutIBX location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SimplifiedLocationWithoutIBX getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(SimplifiedLocationWithoutIBX location) {
    this.location = location;
  }


  public CloudRouterPostRequest _package(CloudRouterPostRequestPackage _package) {
    
    this._package = _package;
    return this;
  }

   /**
   * Get _package
   * @return _package
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PACKAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CloudRouterPostRequestPackage getPackage() {
    return _package;
  }


  @JsonProperty(JSON_PROPERTY_PACKAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPackage(CloudRouterPostRequestPackage _package) {
    this._package = _package;
  }


  public CloudRouterPostRequest order(Order order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Order getOrder() {
    return order;
  }


  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrder(Order order) {
    this.order = order;
  }


  public CloudRouterPostRequest project(Project project) {
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Project getProject() {
    return project;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProject(Project project) {
    this.project = project;
  }


  public CloudRouterPostRequest account(SimplifiedAccount account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SimplifiedAccount getAccount() {
    return account;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccount(SimplifiedAccount account) {
    this.account = account;
  }


  public CloudRouterPostRequest notifications(List<SimplifiedNotification> notifications) {
    
    this.notifications = notifications;
    return this;
  }

  public CloudRouterPostRequest addNotificationsItem(SimplifiedNotification notificationsItem) {
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
  @JsonProperty(JSON_PROPERTY_NOTIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SimplifiedNotification> getNotifications() {
    return notifications;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotifications(List<SimplifiedNotification> notifications) {
    this.notifications = notifications;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudRouterPostRequest cloudRouterPostRequest = (CloudRouterPostRequest) o;
    return Objects.equals(this.type, cloudRouterPostRequest.type) &&
        Objects.equals(this.name, cloudRouterPostRequest.name) &&
        Objects.equals(this.location, cloudRouterPostRequest.location) &&
        Objects.equals(this._package, cloudRouterPostRequest._package) &&
        Objects.equals(this.order, cloudRouterPostRequest.order) &&
        Objects.equals(this.project, cloudRouterPostRequest.project) &&
        Objects.equals(this.account, cloudRouterPostRequest.account) &&
        Objects.equals(this.notifications, cloudRouterPostRequest.notifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, location, _package, order, project, account, notifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudRouterPostRequest {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
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

}

