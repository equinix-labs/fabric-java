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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * Service Profile is a software definition for a named provider service and it&#39;s network connectivity requirements. This includes the basic marketing information and one or more sets of access points (a set per each access point type) fulfilling the provider service. 
 */
@JsonPropertyOrder({
  ServiceProfileRequest.JSON_PROPERTY_PROJECT,
  ServiceProfileRequest.JSON_PROPERTY_HREF,
  ServiceProfileRequest.JSON_PROPERTY_TYPE,
  ServiceProfileRequest.JSON_PROPERTY_NAME,
  ServiceProfileRequest.JSON_PROPERTY_UUID,
  ServiceProfileRequest.JSON_PROPERTY_DESCRIPTION,
  ServiceProfileRequest.JSON_PROPERTY_NOTIFICATIONS,
  ServiceProfileRequest.JSON_PROPERTY_TAGS,
  ServiceProfileRequest.JSON_PROPERTY_VISIBILITY,
  ServiceProfileRequest.JSON_PROPERTY_ALLOWED_EMAILS,
  ServiceProfileRequest.JSON_PROPERTY_ACCESS_POINT_TYPE_CONFIGS,
  ServiceProfileRequest.JSON_PROPERTY_CUSTOM_FIELDS,
  ServiceProfileRequest.JSON_PROPERTY_MARKETING_INFO,
  ServiceProfileRequest.JSON_PROPERTY_PORTS,
  ServiceProfileRequest.JSON_PROPERTY_VIRTUAL_DEVICES,
  ServiceProfileRequest.JSON_PROPERTY_METROS,
  ServiceProfileRequest.JSON_PROPERTY_SELF_PROFILE,
  ServiceProfileRequest.JSON_PROPERTY_PROJECT_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceProfileRequest {
  public static final String JSON_PROPERTY_PROJECT = "project";
  private Project project;

  public static final String JSON_PROPERTY_HREF = "href";
  private URI href;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ServiceProfileTypeEnum type;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_UUID = "uuid";
  private UUID uuid;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NOTIFICATIONS = "notifications";
  private List<SimplifiedNotification> notifications = new ArrayList<>();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_VISIBILITY = "visibility";
  private ServiceProfileVisibilityEnum visibility;

  public static final String JSON_PROPERTY_ALLOWED_EMAILS = "allowedEmails";
  private List<String> allowedEmails = new ArrayList<>();

  public static final String JSON_PROPERTY_ACCESS_POINT_TYPE_CONFIGS = "accessPointTypeConfigs";
  private List<ServiceProfileAccessPointType> accessPointTypeConfigs = new ArrayList<>();

  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "customFields";
  private List<CustomField> customFields = new ArrayList<>();

  public static final String JSON_PROPERTY_MARKETING_INFO = "marketingInfo";
  private MarketingInfo marketingInfo;

  public static final String JSON_PROPERTY_PORTS = "ports";
  private List<ServiceProfileAccessPointCOLO> ports = new ArrayList<>();

  public static final String JSON_PROPERTY_VIRTUAL_DEVICES = "virtualDevices";
  private List<ServiceProfileAccessPointVD> virtualDevices = new ArrayList<>();

  public static final String JSON_PROPERTY_METROS = "metros";
  private List<ServiceMetro> metros = new ArrayList<>();

  public static final String JSON_PROPERTY_SELF_PROFILE = "selfProfile";
  private Boolean selfProfile;

  public static final String JSON_PROPERTY_PROJECT_ID = "projectId";
  private String projectId;

  public ServiceProfileRequest() {
  }

  @JsonCreator
  public ServiceProfileRequest(
    @JsonProperty(JSON_PROPERTY_HREF) URI href
  ) {
    this();
    this.href = href;
  }

  public ServiceProfileRequest project(Project project) {
    
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


   /**
   * Service Profile URI response attribute
   * @return href
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getHref() {
    return href;
  }




  public ServiceProfileRequest type(ServiceProfileTypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ServiceProfileTypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(ServiceProfileTypeEnum type) {
    this.type = type;
  }


  public ServiceProfileRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Customer-assigned service profile name
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public ServiceProfileRequest uuid(UUID uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Equinix-assigned service profile identifier
   * @return uuid
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getUuid() {
    return uuid;
  }


  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }


  public ServiceProfileRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * User-provided service description should be of maximum length 375
   * @return description
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public ServiceProfileRequest notifications(List<SimplifiedNotification> notifications) {
    
    this.notifications = notifications;
    return this;
  }

  public ServiceProfileRequest addNotificationsItem(SimplifiedNotification notificationsItem) {
    if (this.notifications == null) {
      this.notifications = new ArrayList<>();
    }
    this.notifications.add(notificationsItem);
    return this;
  }

   /**
   * Recipients of notifications on service profile change
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


  public ServiceProfileRequest tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public ServiceProfileRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public ServiceProfileRequest visibility(ServiceProfileVisibilityEnum visibility) {
    
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ServiceProfileVisibilityEnum getVisibility() {
    return visibility;
  }


  @JsonProperty(JSON_PROPERTY_VISIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisibility(ServiceProfileVisibilityEnum visibility) {
    this.visibility = visibility;
  }


  public ServiceProfileRequest allowedEmails(List<String> allowedEmails) {
    
    this.allowedEmails = allowedEmails;
    return this;
  }

  public ServiceProfileRequest addAllowedEmailsItem(String allowedEmailsItem) {
    if (this.allowedEmails == null) {
      this.allowedEmails = new ArrayList<>();
    }
    this.allowedEmails.add(allowedEmailsItem);
    return this;
  }

   /**
   * Get allowedEmails
   * @return allowedEmails
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWED_EMAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAllowedEmails() {
    return allowedEmails;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_EMAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedEmails(List<String> allowedEmails) {
    this.allowedEmails = allowedEmails;
  }


  public ServiceProfileRequest accessPointTypeConfigs(List<ServiceProfileAccessPointType> accessPointTypeConfigs) {
    
    this.accessPointTypeConfigs = accessPointTypeConfigs;
    return this;
  }

  public ServiceProfileRequest addAccessPointTypeConfigsItem(ServiceProfileAccessPointType accessPointTypeConfigsItem) {
    if (this.accessPointTypeConfigs == null) {
      this.accessPointTypeConfigs = new ArrayList<>();
    }
    this.accessPointTypeConfigs.add(accessPointTypeConfigsItem);
    return this;
  }

   /**
   * Get accessPointTypeConfigs
   * @return accessPointTypeConfigs
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCESS_POINT_TYPE_CONFIGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ServiceProfileAccessPointType> getAccessPointTypeConfigs() {
    return accessPointTypeConfigs;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_POINT_TYPE_CONFIGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccessPointTypeConfigs(List<ServiceProfileAccessPointType> accessPointTypeConfigs) {
    this.accessPointTypeConfigs = accessPointTypeConfigs;
  }


  public ServiceProfileRequest customFields(List<CustomField> customFields) {
    
    this.customFields = customFields;
    return this;
  }

  public ServiceProfileRequest addCustomFieldsItem(CustomField customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new ArrayList<>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CustomField> getCustomFields() {
    return customFields;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomFields(List<CustomField> customFields) {
    this.customFields = customFields;
  }


  public ServiceProfileRequest marketingInfo(MarketingInfo marketingInfo) {
    
    this.marketingInfo = marketingInfo;
    return this;
  }

   /**
   * Get marketingInfo
   * @return marketingInfo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MARKETING_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MarketingInfo getMarketingInfo() {
    return marketingInfo;
  }


  @JsonProperty(JSON_PROPERTY_MARKETING_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarketingInfo(MarketingInfo marketingInfo) {
    this.marketingInfo = marketingInfo;
  }


  public ServiceProfileRequest ports(List<ServiceProfileAccessPointCOLO> ports) {
    
    this.ports = ports;
    return this;
  }

  public ServiceProfileRequest addPortsItem(ServiceProfileAccessPointCOLO portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * Get ports
   * @return ports
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ServiceProfileAccessPointCOLO> getPorts() {
    return ports;
  }


  @JsonProperty(JSON_PROPERTY_PORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPorts(List<ServiceProfileAccessPointCOLO> ports) {
    this.ports = ports;
  }


  public ServiceProfileRequest virtualDevices(List<ServiceProfileAccessPointVD> virtualDevices) {
    
    this.virtualDevices = virtualDevices;
    return this;
  }

  public ServiceProfileRequest addVirtualDevicesItem(ServiceProfileAccessPointVD virtualDevicesItem) {
    if (this.virtualDevices == null) {
      this.virtualDevices = new ArrayList<>();
    }
    this.virtualDevices.add(virtualDevicesItem);
    return this;
  }

   /**
   * Get virtualDevices
   * @return virtualDevices
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIRTUAL_DEVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ServiceProfileAccessPointVD> getVirtualDevices() {
    return virtualDevices;
  }


  @JsonProperty(JSON_PROPERTY_VIRTUAL_DEVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVirtualDevices(List<ServiceProfileAccessPointVD> virtualDevices) {
    this.virtualDevices = virtualDevices;
  }


  public ServiceProfileRequest metros(List<ServiceMetro> metros) {
    
    this.metros = metros;
    return this;
  }

  public ServiceProfileRequest addMetrosItem(ServiceMetro metrosItem) {
    if (this.metros == null) {
      this.metros = new ArrayList<>();
    }
    this.metros.add(metrosItem);
    return this;
  }

   /**
   * Derived response attribute.
   * @return metros
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METROS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ServiceMetro> getMetros() {
    return metros;
  }


  @JsonProperty(JSON_PROPERTY_METROS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetros(List<ServiceMetro> metros) {
    this.metros = metros;
  }


  public ServiceProfileRequest selfProfile(Boolean selfProfile) {
    
    this.selfProfile = selfProfile;
    return this;
  }

   /**
   * response attribute indicates whether the profile belongs to the same organization as the api-invoker.
   * @return selfProfile
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SELF_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSelfProfile() {
    return selfProfile;
  }


  @JsonProperty(JSON_PROPERTY_SELF_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelfProfile(Boolean selfProfile) {
    this.selfProfile = selfProfile;
  }


  public ServiceProfileRequest projectId(String projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProjectId() {
    return projectId;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceProfileRequest serviceProfileRequest = (ServiceProfileRequest) o;
    return Objects.equals(this.project, serviceProfileRequest.project) &&
        Objects.equals(this.href, serviceProfileRequest.href) &&
        Objects.equals(this.type, serviceProfileRequest.type) &&
        Objects.equals(this.name, serviceProfileRequest.name) &&
        Objects.equals(this.uuid, serviceProfileRequest.uuid) &&
        Objects.equals(this.description, serviceProfileRequest.description) &&
        Objects.equals(this.notifications, serviceProfileRequest.notifications) &&
        Objects.equals(this.tags, serviceProfileRequest.tags) &&
        Objects.equals(this.visibility, serviceProfileRequest.visibility) &&
        Objects.equals(this.allowedEmails, serviceProfileRequest.allowedEmails) &&
        Objects.equals(this.accessPointTypeConfigs, serviceProfileRequest.accessPointTypeConfigs) &&
        Objects.equals(this.customFields, serviceProfileRequest.customFields) &&
        Objects.equals(this.marketingInfo, serviceProfileRequest.marketingInfo) &&
        Objects.equals(this.ports, serviceProfileRequest.ports) &&
        Objects.equals(this.virtualDevices, serviceProfileRequest.virtualDevices) &&
        Objects.equals(this.metros, serviceProfileRequest.metros) &&
        Objects.equals(this.selfProfile, serviceProfileRequest.selfProfile) &&
        Objects.equals(this.projectId, serviceProfileRequest.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, href, type, name, uuid, description, notifications, tags, visibility, allowedEmails, accessPointTypeConfigs, customFields, marketingInfo, ports, virtualDevices, metros, selfProfile, projectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceProfileRequest {\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    allowedEmails: ").append(toIndentedString(allowedEmails)).append("\n");
    sb.append("    accessPointTypeConfigs: ").append(toIndentedString(accessPointTypeConfigs)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    marketingInfo: ").append(toIndentedString(marketingInfo)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    virtualDevices: ").append(toIndentedString(virtualDevices)).append("\n");
    sb.append("    metros: ").append(toIndentedString(metros)).append("\n");
    sb.append("    selfProfile: ").append(toIndentedString(selfProfile)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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

