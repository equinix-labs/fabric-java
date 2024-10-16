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
import com.equinix.openapi.fabric.v4.model.Code;
import com.equinix.openapi.fabric.v4.model.PackageChangeLog;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;

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
 * Fabric Cloud Router Package
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CloudRouterPackage {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  /**
   * Type of Router package
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ROUTER_PACKAGE("ROUTER_PACKAGE");

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

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Code code;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TOTAL_I_PV4_ROUTES_MAX = "totalIPv4RoutesMax";
  @SerializedName(SERIALIZED_NAME_TOTAL_I_PV4_ROUTES_MAX)
  private Integer totalIPv4RoutesMax;

  public static final String SERIALIZED_NAME_TOTAL_I_PV6_ROUTES_MAX = "totalIPv6RoutesMax";
  @SerializedName(SERIALIZED_NAME_TOTAL_I_PV6_ROUTES_MAX)
  private Integer totalIPv6RoutesMax;

  public static final String SERIALIZED_NAME_STATIC_I_PV4_ROUTES_MAX = "staticIPv4RoutesMax";
  @SerializedName(SERIALIZED_NAME_STATIC_I_PV4_ROUTES_MAX)
  private Integer staticIPv4RoutesMax;

  public static final String SERIALIZED_NAME_STATIC_I_PV6_ROUTES_MAX = "staticIPv6RoutesMax";
  @SerializedName(SERIALIZED_NAME_STATIC_I_PV6_ROUTES_MAX)
  private Integer staticIPv6RoutesMax;

  public static final String SERIALIZED_NAME_NACLS_MAX = "naclsMax";
  @SerializedName(SERIALIZED_NAME_NACLS_MAX)
  private Integer naclsMax;

  public static final String SERIALIZED_NAME_NACL_RULES_MAX = "naclRulesMax";
  @SerializedName(SERIALIZED_NAME_NACL_RULES_MAX)
  private Integer naclRulesMax;

  public static final String SERIALIZED_NAME_HA_SUPPORTED = "haSupported";
  @SerializedName(SERIALIZED_NAME_HA_SUPPORTED)
  private Boolean haSupported;

  public static final String SERIALIZED_NAME_ROUTE_FILTER_SUPPORTED = "routeFilterSupported";
  @SerializedName(SERIALIZED_NAME_ROUTE_FILTER_SUPPORTED)
  private Boolean routeFilterSupported;

  /**
   * CloudRouter package NAT supported type
   */
  @JsonAdapter(NatTypeEnum.Adapter.class)
  public enum NatTypeEnum {
    STATIC_NAT("STATIC_NAT");

    private String value;

    NatTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NatTypeEnum fromValue(String value) {
      for (NatTypeEnum b : NatTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NatTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NatTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NatTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NatTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NAT_TYPE = "natType";
  @SerializedName(SERIALIZED_NAME_NAT_TYPE)
  private NatTypeEnum natType;

  public static final String SERIALIZED_NAME_VC_COUNT_MAX = "vcCountMax";
  @SerializedName(SERIALIZED_NAME_VC_COUNT_MAX)
  private Integer vcCountMax;

  public static final String SERIALIZED_NAME_CR_COUNT_MAX = "crCountMax";
  @SerializedName(SERIALIZED_NAME_CR_COUNT_MAX)
  private Integer crCountMax;

  public static final String SERIALIZED_NAME_VC_BANDWIDTH_MAX = "vcBandwidthMax";
  @SerializedName(SERIALIZED_NAME_VC_BANDWIDTH_MAX)
  private Integer vcBandwidthMax;

  public static final String SERIALIZED_NAME_CHANGE_LOG = "changeLog";
  @SerializedName(SERIALIZED_NAME_CHANGE_LOG)
  private PackageChangeLog changeLog;

  public CloudRouterPackage() {
  }

  
  public CloudRouterPackage(
     URI href
  ) {
    this();
    this.href = href;
  }

   /**
   * Cloud Router package URI
   * @return href
  **/
  @javax.annotation.Nullable

  public URI getHref() {
    return href;
  }




  public CloudRouterPackage type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of Router package
   * @return type
  **/
  @javax.annotation.Nullable

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CloudRouterPackage code(Code code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable

  public Code getCode() {
    return code;
  }


  public void setCode(Code code) {
    this.code = code;
  }


  public CloudRouterPackage description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Fabric Cloud Router Package description
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CloudRouterPackage totalIPv4RoutesMax(Integer totalIPv4RoutesMax) {
    
    this.totalIPv4RoutesMax = totalIPv4RoutesMax;
    return this;
  }

   /**
   * Cloud Router package BGP IPv4 routes limit
   * minimum: 0
   * @return totalIPv4RoutesMax
  **/
  @javax.annotation.Nullable

  public Integer getTotalIPv4RoutesMax() {
    return totalIPv4RoutesMax;
  }


  public void setTotalIPv4RoutesMax(Integer totalIPv4RoutesMax) {
    this.totalIPv4RoutesMax = totalIPv4RoutesMax;
  }


  public CloudRouterPackage totalIPv6RoutesMax(Integer totalIPv6RoutesMax) {
    
    this.totalIPv6RoutesMax = totalIPv6RoutesMax;
    return this;
  }

   /**
   * Cloud Router package BGP IPv6 routes limit
   * minimum: 0
   * @return totalIPv6RoutesMax
  **/
  @javax.annotation.Nullable

  public Integer getTotalIPv6RoutesMax() {
    return totalIPv6RoutesMax;
  }


  public void setTotalIPv6RoutesMax(Integer totalIPv6RoutesMax) {
    this.totalIPv6RoutesMax = totalIPv6RoutesMax;
  }


  public CloudRouterPackage staticIPv4RoutesMax(Integer staticIPv4RoutesMax) {
    
    this.staticIPv4RoutesMax = staticIPv4RoutesMax;
    return this;
  }

   /**
   * CloudRouter package static IPv4 routes limit
   * minimum: 0
   * @return staticIPv4RoutesMax
  **/
  @javax.annotation.Nullable

  public Integer getStaticIPv4RoutesMax() {
    return staticIPv4RoutesMax;
  }


  public void setStaticIPv4RoutesMax(Integer staticIPv4RoutesMax) {
    this.staticIPv4RoutesMax = staticIPv4RoutesMax;
  }


  public CloudRouterPackage staticIPv6RoutesMax(Integer staticIPv6RoutesMax) {
    
    this.staticIPv6RoutesMax = staticIPv6RoutesMax;
    return this;
  }

   /**
   * CloudRouter package static IPv6 routes limit
   * minimum: 0
   * @return staticIPv6RoutesMax
  **/
  @javax.annotation.Nullable

  public Integer getStaticIPv6RoutesMax() {
    return staticIPv6RoutesMax;
  }


  public void setStaticIPv6RoutesMax(Integer staticIPv6RoutesMax) {
    this.staticIPv6RoutesMax = staticIPv6RoutesMax;
  }


  public CloudRouterPackage naclsMax(Integer naclsMax) {
    
    this.naclsMax = naclsMax;
    return this;
  }

   /**
   * CloudRouter package NACLs limit
   * minimum: 0
   * @return naclsMax
  **/
  @javax.annotation.Nullable

  public Integer getNaclsMax() {
    return naclsMax;
  }


  public void setNaclsMax(Integer naclsMax) {
    this.naclsMax = naclsMax;
  }


  public CloudRouterPackage naclRulesMax(Integer naclRulesMax) {
    
    this.naclRulesMax = naclRulesMax;
    return this;
  }

   /**
   * CloudRouter package NACLs rules limit
   * minimum: 0
   * @return naclRulesMax
  **/
  @javax.annotation.Nullable

  public Integer getNaclRulesMax() {
    return naclRulesMax;
  }


  public void setNaclRulesMax(Integer naclRulesMax) {
    this.naclRulesMax = naclRulesMax;
  }


  public CloudRouterPackage haSupported(Boolean haSupported) {
    
    this.haSupported = haSupported;
    return this;
  }

   /**
   * CloudRouter package high-available configuration support
   * @return haSupported
  **/
  @javax.annotation.Nullable

  public Boolean getHaSupported() {
    return haSupported;
  }


  public void setHaSupported(Boolean haSupported) {
    this.haSupported = haSupported;
  }


  public CloudRouterPackage routeFilterSupported(Boolean routeFilterSupported) {
    
    this.routeFilterSupported = routeFilterSupported;
    return this;
  }

   /**
   * CloudRouter package route filter support
   * @return routeFilterSupported
  **/
  @javax.annotation.Nullable

  public Boolean getRouteFilterSupported() {
    return routeFilterSupported;
  }


  public void setRouteFilterSupported(Boolean routeFilterSupported) {
    this.routeFilterSupported = routeFilterSupported;
  }


  public CloudRouterPackage natType(NatTypeEnum natType) {
    
    this.natType = natType;
    return this;
  }

   /**
   * CloudRouter package NAT supported type
   * @return natType
  **/
  @javax.annotation.Nullable

  public NatTypeEnum getNatType() {
    return natType;
  }


  public void setNatType(NatTypeEnum natType) {
    this.natType = natType;
  }


  public CloudRouterPackage vcCountMax(Integer vcCountMax) {
    
    this.vcCountMax = vcCountMax;
    return this;
  }

   /**
   * CloudRouter package Max Connection limit
   * minimum: 0
   * @return vcCountMax
  **/
  @javax.annotation.Nullable

  public Integer getVcCountMax() {
    return vcCountMax;
  }


  public void setVcCountMax(Integer vcCountMax) {
    this.vcCountMax = vcCountMax;
  }


  public CloudRouterPackage crCountMax(Integer crCountMax) {
    
    this.crCountMax = crCountMax;
    return this;
  }

   /**
   * CloudRouter package Max CloudRouter limit
   * minimum: 0
   * @return crCountMax
  **/
  @javax.annotation.Nullable

  public Integer getCrCountMax() {
    return crCountMax;
  }


  public void setCrCountMax(Integer crCountMax) {
    this.crCountMax = crCountMax;
  }


  public CloudRouterPackage vcBandwidthMax(Integer vcBandwidthMax) {
    
    this.vcBandwidthMax = vcBandwidthMax;
    return this;
  }

   /**
   * CloudRouter package Max Bandwidth limit
   * minimum: 0
   * @return vcBandwidthMax
  **/
  @javax.annotation.Nullable

  public Integer getVcBandwidthMax() {
    return vcBandwidthMax;
  }


  public void setVcBandwidthMax(Integer vcBandwidthMax) {
    this.vcBandwidthMax = vcBandwidthMax;
  }


  public CloudRouterPackage changeLog(PackageChangeLog changeLog) {
    
    this.changeLog = changeLog;
    return this;
  }

   /**
   * Get changeLog
   * @return changeLog
  **/
  @javax.annotation.Nullable

  public PackageChangeLog getChangeLog() {
    return changeLog;
  }


  public void setChangeLog(PackageChangeLog changeLog) {
    this.changeLog = changeLog;
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
   * @return the CloudRouterPackage instance itself
   */
  public CloudRouterPackage putAdditionalProperty(String key, Object value) {
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
    CloudRouterPackage cloudRouterPackage = (CloudRouterPackage) o;
    return Objects.equals(this.href, cloudRouterPackage.href) &&
        Objects.equals(this.type, cloudRouterPackage.type) &&
        Objects.equals(this.code, cloudRouterPackage.code) &&
        Objects.equals(this.description, cloudRouterPackage.description) &&
        Objects.equals(this.totalIPv4RoutesMax, cloudRouterPackage.totalIPv4RoutesMax) &&
        Objects.equals(this.totalIPv6RoutesMax, cloudRouterPackage.totalIPv6RoutesMax) &&
        Objects.equals(this.staticIPv4RoutesMax, cloudRouterPackage.staticIPv4RoutesMax) &&
        Objects.equals(this.staticIPv6RoutesMax, cloudRouterPackage.staticIPv6RoutesMax) &&
        Objects.equals(this.naclsMax, cloudRouterPackage.naclsMax) &&
        Objects.equals(this.naclRulesMax, cloudRouterPackage.naclRulesMax) &&
        Objects.equals(this.haSupported, cloudRouterPackage.haSupported) &&
        Objects.equals(this.routeFilterSupported, cloudRouterPackage.routeFilterSupported) &&
        Objects.equals(this.natType, cloudRouterPackage.natType) &&
        Objects.equals(this.vcCountMax, cloudRouterPackage.vcCountMax) &&
        Objects.equals(this.crCountMax, cloudRouterPackage.crCountMax) &&
        Objects.equals(this.vcBandwidthMax, cloudRouterPackage.vcBandwidthMax) &&
        Objects.equals(this.changeLog, cloudRouterPackage.changeLog)&&
        Objects.equals(this.additionalProperties, cloudRouterPackage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, type, code, description, totalIPv4RoutesMax, totalIPv6RoutesMax, staticIPv4RoutesMax, staticIPv6RoutesMax, naclsMax, naclRulesMax, haSupported, routeFilterSupported, natType, vcCountMax, crCountMax, vcBandwidthMax, changeLog, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudRouterPackage {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    totalIPv4RoutesMax: ").append(toIndentedString(totalIPv4RoutesMax)).append("\n");
    sb.append("    totalIPv6RoutesMax: ").append(toIndentedString(totalIPv6RoutesMax)).append("\n");
    sb.append("    staticIPv4RoutesMax: ").append(toIndentedString(staticIPv4RoutesMax)).append("\n");
    sb.append("    staticIPv6RoutesMax: ").append(toIndentedString(staticIPv6RoutesMax)).append("\n");
    sb.append("    naclsMax: ").append(toIndentedString(naclsMax)).append("\n");
    sb.append("    naclRulesMax: ").append(toIndentedString(naclRulesMax)).append("\n");
    sb.append("    haSupported: ").append(toIndentedString(haSupported)).append("\n");
    sb.append("    routeFilterSupported: ").append(toIndentedString(routeFilterSupported)).append("\n");
    sb.append("    natType: ").append(toIndentedString(natType)).append("\n");
    sb.append("    vcCountMax: ").append(toIndentedString(vcCountMax)).append("\n");
    sb.append("    crCountMax: ").append(toIndentedString(crCountMax)).append("\n");
    sb.append("    vcBandwidthMax: ").append(toIndentedString(vcBandwidthMax)).append("\n");
    sb.append("    changeLog: ").append(toIndentedString(changeLog)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("description");
    openapiFields.add("totalIPv4RoutesMax");
    openapiFields.add("totalIPv6RoutesMax");
    openapiFields.add("staticIPv4RoutesMax");
    openapiFields.add("staticIPv6RoutesMax");
    openapiFields.add("naclsMax");
    openapiFields.add("naclRulesMax");
    openapiFields.add("haSupported");
    openapiFields.add("routeFilterSupported");
    openapiFields.add("natType");
    openapiFields.add("vcCountMax");
    openapiFields.add("crCountMax");
    openapiFields.add("vcBandwidthMax");
    openapiFields.add("changeLog");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CloudRouterPackage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CloudRouterPackage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudRouterPackage is not found in the empty JSON string", CloudRouterPackage.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("natType") != null && !jsonObj.get("natType").isJsonNull()) && !jsonObj.get("natType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `natType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("natType").toString()));
      }
      // validate the optional field `changeLog`
      if (jsonObj.get("changeLog") != null && !jsonObj.get("changeLog").isJsonNull()) {
        PackageChangeLog.validateJsonObject(jsonObj.getAsJsonObject("changeLog"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloudRouterPackage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloudRouterPackage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloudRouterPackage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloudRouterPackage.class));

       return (TypeAdapter<T>) new TypeAdapter<CloudRouterPackage>() {
           @Override
           public void write(JsonWriter out, CloudRouterPackage value) throws IOException {
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
           public CloudRouterPackage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CloudRouterPackage instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CloudRouterPackage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CloudRouterPackage
  * @throws IOException if the JSON string is invalid with respect to CloudRouterPackage
  */
  public static CloudRouterPackage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudRouterPackage.class);
  }

 /**
  * Convert an instance of CloudRouterPackage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

