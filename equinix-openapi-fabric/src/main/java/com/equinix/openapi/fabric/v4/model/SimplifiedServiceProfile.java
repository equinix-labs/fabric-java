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
import com.equinix.openapi.fabric.v4.model.CustomField;
import com.equinix.openapi.fabric.v4.model.MarketingInfo;
import com.equinix.openapi.fabric.v4.model.ServiceMetro;
import com.equinix.openapi.fabric.v4.model.ServiceProfileAccessPointCOLO;
import com.equinix.openapi.fabric.v4.model.ServiceProfileAccessPointType;
import com.equinix.openapi.fabric.v4.model.ServiceProfileAccessPointVD;
import com.equinix.openapi.fabric.v4.model.ServiceProfileTypeEnum;
import com.equinix.openapi.fabric.v4.model.ServiceProfileVisibilityEnum;
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
 * Service Profile is a software definition for a named provider service and it&#39;s network connectivity requirements. This includes the basic marketing information and one or more sets of access points (a set per each access point type) fulfilling the provider service. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SimplifiedServiceProfile {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ServiceProfileTypeEnum type;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private UUID uuid;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NOTIFICATIONS = "notifications";
  @SerializedName(SERIALIZED_NAME_NOTIFICATIONS)
  private List<SimplifiedNotification> notifications = new ArrayList<>();

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private ServiceProfileVisibilityEnum visibility;

  public static final String SERIALIZED_NAME_ALLOWED_EMAILS = "allowedEmails";
  @SerializedName(SERIALIZED_NAME_ALLOWED_EMAILS)
  private List<String> allowedEmails = new ArrayList<>();

  public static final String SERIALIZED_NAME_ACCESS_POINT_TYPE_CONFIGS = "accessPointTypeConfigs";
  @SerializedName(SERIALIZED_NAME_ACCESS_POINT_TYPE_CONFIGS)
  private List<ServiceProfileAccessPointType> accessPointTypeConfigs = new ArrayList<>();

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "customFields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private List<CustomField> customFields = new ArrayList<>();

  public static final String SERIALIZED_NAME_MARKETING_INFO = "marketingInfo";
  @SerializedName(SERIALIZED_NAME_MARKETING_INFO)
  private MarketingInfo marketingInfo;

  public static final String SERIALIZED_NAME_PORTS = "ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<ServiceProfileAccessPointCOLO> ports = new ArrayList<>();

  public static final String SERIALIZED_NAME_VIRTUAL_DEVICES = "virtualDevices";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_DEVICES)
  private List<ServiceProfileAccessPointVD> virtualDevices = new ArrayList<>();

  public static final String SERIALIZED_NAME_METROS = "metros";
  @SerializedName(SERIALIZED_NAME_METROS)
  private List<ServiceMetro> metros = new ArrayList<>();

  public static final String SERIALIZED_NAME_SELF_PROFILE = "selfProfile";
  @SerializedName(SERIALIZED_NAME_SELF_PROFILE)
  private Boolean selfProfile;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public SimplifiedServiceProfile() {
  }

  
  public SimplifiedServiceProfile(
     URI href
  ) {
    this();
    this.href = href;
  }

   /**
   * Service Profile URI response attribute
   * @return href
  **/
  @javax.annotation.Nullable

  public URI getHref() {
    return href;
  }




  public SimplifiedServiceProfile type(ServiceProfileTypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable

  public ServiceProfileTypeEnum getType() {
    return type;
  }


  public void setType(ServiceProfileTypeEnum type) {
    this.type = type;
  }


  public SimplifiedServiceProfile name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Customer-assigned service profile name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SimplifiedServiceProfile uuid(UUID uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Equinix-assigned service profile identifier
   * @return uuid
  **/
  @javax.annotation.Nullable

  public UUID getUuid() {
    return uuid;
  }


  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }


  public SimplifiedServiceProfile description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * User-provided service description should be of maximum length 375
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SimplifiedServiceProfile notifications(List<SimplifiedNotification> notifications) {
    
    this.notifications = notifications;
    return this;
  }

  public SimplifiedServiceProfile addNotificationsItem(SimplifiedNotification notificationsItem) {
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

  public List<SimplifiedNotification> getNotifications() {
    return notifications;
  }


  public void setNotifications(List<SimplifiedNotification> notifications) {
    this.notifications = notifications;
  }


  public SimplifiedServiceProfile tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public SimplifiedServiceProfile addTagsItem(String tagsItem) {
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

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public SimplifiedServiceProfile visibility(ServiceProfileVisibilityEnum visibility) {
    
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @javax.annotation.Nullable

  public ServiceProfileVisibilityEnum getVisibility() {
    return visibility;
  }


  public void setVisibility(ServiceProfileVisibilityEnum visibility) {
    this.visibility = visibility;
  }


  public SimplifiedServiceProfile allowedEmails(List<String> allowedEmails) {
    
    this.allowedEmails = allowedEmails;
    return this;
  }

  public SimplifiedServiceProfile addAllowedEmailsItem(String allowedEmailsItem) {
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

  public List<String> getAllowedEmails() {
    return allowedEmails;
  }


  public void setAllowedEmails(List<String> allowedEmails) {
    this.allowedEmails = allowedEmails;
  }


  public SimplifiedServiceProfile accessPointTypeConfigs(List<ServiceProfileAccessPointType> accessPointTypeConfigs) {
    
    this.accessPointTypeConfigs = accessPointTypeConfigs;
    return this;
  }

  public SimplifiedServiceProfile addAccessPointTypeConfigsItem(ServiceProfileAccessPointType accessPointTypeConfigsItem) {
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

  public List<ServiceProfileAccessPointType> getAccessPointTypeConfigs() {
    return accessPointTypeConfigs;
  }


  public void setAccessPointTypeConfigs(List<ServiceProfileAccessPointType> accessPointTypeConfigs) {
    this.accessPointTypeConfigs = accessPointTypeConfigs;
  }


  public SimplifiedServiceProfile customFields(List<CustomField> customFields) {
    
    this.customFields = customFields;
    return this;
  }

  public SimplifiedServiceProfile addCustomFieldsItem(CustomField customFieldsItem) {
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

  public List<CustomField> getCustomFields() {
    return customFields;
  }


  public void setCustomFields(List<CustomField> customFields) {
    this.customFields = customFields;
  }


  public SimplifiedServiceProfile marketingInfo(MarketingInfo marketingInfo) {
    
    this.marketingInfo = marketingInfo;
    return this;
  }

   /**
   * Get marketingInfo
   * @return marketingInfo
  **/
  @javax.annotation.Nullable

  public MarketingInfo getMarketingInfo() {
    return marketingInfo;
  }


  public void setMarketingInfo(MarketingInfo marketingInfo) {
    this.marketingInfo = marketingInfo;
  }


  public SimplifiedServiceProfile ports(List<ServiceProfileAccessPointCOLO> ports) {
    
    this.ports = ports;
    return this;
  }

  public SimplifiedServiceProfile addPortsItem(ServiceProfileAccessPointCOLO portsItem) {
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

  public List<ServiceProfileAccessPointCOLO> getPorts() {
    return ports;
  }


  public void setPorts(List<ServiceProfileAccessPointCOLO> ports) {
    this.ports = ports;
  }


  public SimplifiedServiceProfile virtualDevices(List<ServiceProfileAccessPointVD> virtualDevices) {
    
    this.virtualDevices = virtualDevices;
    return this;
  }

  public SimplifiedServiceProfile addVirtualDevicesItem(ServiceProfileAccessPointVD virtualDevicesItem) {
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

  public List<ServiceProfileAccessPointVD> getVirtualDevices() {
    return virtualDevices;
  }


  public void setVirtualDevices(List<ServiceProfileAccessPointVD> virtualDevices) {
    this.virtualDevices = virtualDevices;
  }


  public SimplifiedServiceProfile metros(List<ServiceMetro> metros) {
    
    this.metros = metros;
    return this;
  }

  public SimplifiedServiceProfile addMetrosItem(ServiceMetro metrosItem) {
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

  public List<ServiceMetro> getMetros() {
    return metros;
  }


  public void setMetros(List<ServiceMetro> metros) {
    this.metros = metros;
  }


  public SimplifiedServiceProfile selfProfile(Boolean selfProfile) {
    
    this.selfProfile = selfProfile;
    return this;
  }

   /**
   * response attribute indicates whether the profile belongs to the same organization as the api-invoker.
   * @return selfProfile
  **/
  @javax.annotation.Nullable

  public Boolean getSelfProfile() {
    return selfProfile;
  }


  public void setSelfProfile(Boolean selfProfile) {
    this.selfProfile = selfProfile;
  }


  public SimplifiedServiceProfile projectId(String projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @javax.annotation.Nullable

  public String getProjectId() {
    return projectId;
  }


  public void setProjectId(String projectId) {
    this.projectId = projectId;
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
   * @return the SimplifiedServiceProfile instance itself
   */
  public SimplifiedServiceProfile putAdditionalProperty(String key, Object value) {
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
    SimplifiedServiceProfile simplifiedServiceProfile = (SimplifiedServiceProfile) o;
    return Objects.equals(this.href, simplifiedServiceProfile.href) &&
        Objects.equals(this.type, simplifiedServiceProfile.type) &&
        Objects.equals(this.name, simplifiedServiceProfile.name) &&
        Objects.equals(this.uuid, simplifiedServiceProfile.uuid) &&
        Objects.equals(this.description, simplifiedServiceProfile.description) &&
        Objects.equals(this.notifications, simplifiedServiceProfile.notifications) &&
        Objects.equals(this.tags, simplifiedServiceProfile.tags) &&
        Objects.equals(this.visibility, simplifiedServiceProfile.visibility) &&
        Objects.equals(this.allowedEmails, simplifiedServiceProfile.allowedEmails) &&
        Objects.equals(this.accessPointTypeConfigs, simplifiedServiceProfile.accessPointTypeConfigs) &&
        Objects.equals(this.customFields, simplifiedServiceProfile.customFields) &&
        Objects.equals(this.marketingInfo, simplifiedServiceProfile.marketingInfo) &&
        Objects.equals(this.ports, simplifiedServiceProfile.ports) &&
        Objects.equals(this.virtualDevices, simplifiedServiceProfile.virtualDevices) &&
        Objects.equals(this.metros, simplifiedServiceProfile.metros) &&
        Objects.equals(this.selfProfile, simplifiedServiceProfile.selfProfile) &&
        Objects.equals(this.projectId, simplifiedServiceProfile.projectId)&&
        Objects.equals(this.additionalProperties, simplifiedServiceProfile.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, type, name, uuid, description, notifications, tags, visibility, allowedEmails, accessPointTypeConfigs, customFields, marketingInfo, ports, virtualDevices, metros, selfProfile, projectId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimplifiedServiceProfile {\n");
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
    openapiFields.add("name");
    openapiFields.add("uuid");
    openapiFields.add("description");
    openapiFields.add("notifications");
    openapiFields.add("tags");
    openapiFields.add("visibility");
    openapiFields.add("allowedEmails");
    openapiFields.add("accessPointTypeConfigs");
    openapiFields.add("customFields");
    openapiFields.add("marketingInfo");
    openapiFields.add("ports");
    openapiFields.add("virtualDevices");
    openapiFields.add("metros");
    openapiFields.add("selfProfile");
    openapiFields.add("projectId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SimplifiedServiceProfile
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SimplifiedServiceProfile.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SimplifiedServiceProfile is not found in the empty JSON string", SimplifiedServiceProfile.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
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
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowedEmails") != null && !jsonObj.get("allowedEmails").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowedEmails` to be an array in the JSON string but got `%s`", jsonObj.get("allowedEmails").toString()));
      }
      if (jsonObj.get("accessPointTypeConfigs") != null && !jsonObj.get("accessPointTypeConfigs").isJsonNull()) {
        JsonArray jsonArrayaccessPointTypeConfigs = jsonObj.getAsJsonArray("accessPointTypeConfigs");
        if (jsonArrayaccessPointTypeConfigs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("accessPointTypeConfigs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `accessPointTypeConfigs` to be an array in the JSON string but got `%s`", jsonObj.get("accessPointTypeConfigs").toString()));
          }

          // validate the optional field `accessPointTypeConfigs` (array)
          for (int i = 0; i < jsonArrayaccessPointTypeConfigs.size(); i++) {
            ServiceProfileAccessPointType.validateJsonObject(jsonArrayaccessPointTypeConfigs.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("customFields") != null && !jsonObj.get("customFields").isJsonNull()) {
        JsonArray jsonArraycustomFields = jsonObj.getAsJsonArray("customFields");
        if (jsonArraycustomFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("customFields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `customFields` to be an array in the JSON string but got `%s`", jsonObj.get("customFields").toString()));
          }

          // validate the optional field `customFields` (array)
          for (int i = 0; i < jsonArraycustomFields.size(); i++) {
            CustomField.validateJsonObject(jsonArraycustomFields.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `marketingInfo`
      if (jsonObj.get("marketingInfo") != null && !jsonObj.get("marketingInfo").isJsonNull()) {
        MarketingInfo.validateJsonObject(jsonObj.getAsJsonObject("marketingInfo"));
      }
      if (jsonObj.get("ports") != null && !jsonObj.get("ports").isJsonNull()) {
        JsonArray jsonArrayports = jsonObj.getAsJsonArray("ports");
        if (jsonArrayports != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ports").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ports` to be an array in the JSON string but got `%s`", jsonObj.get("ports").toString()));
          }

          // validate the optional field `ports` (array)
          for (int i = 0; i < jsonArrayports.size(); i++) {
            ServiceProfileAccessPointCOLO.validateJsonObject(jsonArrayports.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("virtualDevices") != null && !jsonObj.get("virtualDevices").isJsonNull()) {
        JsonArray jsonArrayvirtualDevices = jsonObj.getAsJsonArray("virtualDevices");
        if (jsonArrayvirtualDevices != null) {
          // ensure the json data is an array
          if (!jsonObj.get("virtualDevices").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `virtualDevices` to be an array in the JSON string but got `%s`", jsonObj.get("virtualDevices").toString()));
          }

          // validate the optional field `virtualDevices` (array)
          for (int i = 0; i < jsonArrayvirtualDevices.size(); i++) {
            ServiceProfileAccessPointVD.validateJsonObject(jsonArrayvirtualDevices.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("metros") != null && !jsonObj.get("metros").isJsonNull()) {
        JsonArray jsonArraymetros = jsonObj.getAsJsonArray("metros");
        if (jsonArraymetros != null) {
          // ensure the json data is an array
          if (!jsonObj.get("metros").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `metros` to be an array in the JSON string but got `%s`", jsonObj.get("metros").toString()));
          }

          // validate the optional field `metros` (array)
          for (int i = 0; i < jsonArraymetros.size(); i++) {
            ServiceMetro.validateJsonObject(jsonArraymetros.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("projectId") != null && !jsonObj.get("projectId").isJsonNull()) && !jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SimplifiedServiceProfile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SimplifiedServiceProfile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SimplifiedServiceProfile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SimplifiedServiceProfile.class));

       return (TypeAdapter<T>) new TypeAdapter<SimplifiedServiceProfile>() {
           @Override
           public void write(JsonWriter out, SimplifiedServiceProfile value) throws IOException {
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
           public SimplifiedServiceProfile read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SimplifiedServiceProfile instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SimplifiedServiceProfile given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SimplifiedServiceProfile
  * @throws IOException if the JSON string is invalid with respect to SimplifiedServiceProfile
  */
  public static SimplifiedServiceProfile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SimplifiedServiceProfile.class);
  }

 /**
  * Convert an instance of SimplifiedServiceProfile to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

