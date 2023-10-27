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
 * Configuration for dot1q to qinq translation support
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceProfileLinkProtocolConfig {
  /**
   * was tagType - missing on wiki
   */
  @JsonAdapter(EncapsulationStrategyEnum.Adapter.class)
  public enum EncapsulationStrategyEnum {
    CTAGED("CTAGED"),
    
    BOTH("BOTH"),
    
    NAMED("NAMED");

    private String value;

    EncapsulationStrategyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EncapsulationStrategyEnum fromValue(String value) {
      for (EncapsulationStrategyEnum b : EncapsulationStrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EncapsulationStrategyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EncapsulationStrategyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EncapsulationStrategyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EncapsulationStrategyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENCAPSULATION_STRATEGY = "encapsulationStrategy";
  @SerializedName(SERIALIZED_NAME_ENCAPSULATION_STRATEGY)
  private EncapsulationStrategyEnum encapsulationStrategy;

  public static final String SERIALIZED_NAME_NAMED_TAGS = "namedTags";
  @SerializedName(SERIALIZED_NAME_NAMED_TAGS)
  private List<String> namedTags = new ArrayList<>();

  public static final String SERIALIZED_NAME_VLAN_C_TAG_LABEL = "vlanCTagLabel";
  @SerializedName(SERIALIZED_NAME_VLAN_C_TAG_LABEL)
  private String vlanCTagLabel;

  public static final String SERIALIZED_NAME_REUSE_VLAN_S_TAG = "reuseVlanSTag";
  @SerializedName(SERIALIZED_NAME_REUSE_VLAN_S_TAG)
  private Boolean reuseVlanSTag = false;

  /**
   * Port encapsulation - Derived response attribute. Ignored on request payloads.
   */
  @JsonAdapter(EncapsulationEnum.Adapter.class)
  public enum EncapsulationEnum {
    QINQ("QINQ"),
    
    DOT1Q("DOT1Q"),
    
    UNTAGGED("UNTAGGED");

    private String value;

    EncapsulationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EncapsulationEnum fromValue(String value) {
      for (EncapsulationEnum b : EncapsulationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EncapsulationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EncapsulationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EncapsulationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EncapsulationEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENCAPSULATION = "encapsulation";
  @SerializedName(SERIALIZED_NAME_ENCAPSULATION)
  private EncapsulationEnum encapsulation;

  public ServiceProfileLinkProtocolConfig() {
  }

  public ServiceProfileLinkProtocolConfig encapsulationStrategy(EncapsulationStrategyEnum encapsulationStrategy) {
    
    this.encapsulationStrategy = encapsulationStrategy;
    return this;
  }

   /**
   * was tagType - missing on wiki
   * @return encapsulationStrategy
  **/
  @javax.annotation.Nullable

  public EncapsulationStrategyEnum getEncapsulationStrategy() {
    return encapsulationStrategy;
  }


  public void setEncapsulationStrategy(EncapsulationStrategyEnum encapsulationStrategy) {
    this.encapsulationStrategy = encapsulationStrategy;
  }


  public ServiceProfileLinkProtocolConfig namedTags(List<String> namedTags) {
    
    this.namedTags = namedTags;
    return this;
  }

  public ServiceProfileLinkProtocolConfig addNamedTagsItem(String namedTagsItem) {
    if (this.namedTags == null) {
      this.namedTags = new ArrayList<>();
    }
    this.namedTags.add(namedTagsItem);
    return this;
  }

   /**
   * Get namedTags
   * @return namedTags
  **/
  @javax.annotation.Nullable

  public List<String> getNamedTags() {
    return namedTags;
  }


  public void setNamedTags(List<String> namedTags) {
    this.namedTags = namedTags;
  }


  public ServiceProfileLinkProtocolConfig vlanCTagLabel(String vlanCTagLabel) {
    
    this.vlanCTagLabel = vlanCTagLabel;
    return this;
  }

   /**
   * was ctagLabel
   * @return vlanCTagLabel
  **/
  @javax.annotation.Nullable

  public String getVlanCTagLabel() {
    return vlanCTagLabel;
  }


  public void setVlanCTagLabel(String vlanCTagLabel) {
    this.vlanCTagLabel = vlanCTagLabel;
  }


  public ServiceProfileLinkProtocolConfig reuseVlanSTag(Boolean reuseVlanSTag) {
    
    this.reuseVlanSTag = reuseVlanSTag;
    return this;
  }

   /**
   * Get reuseVlanSTag
   * @return reuseVlanSTag
  **/
  @javax.annotation.Nullable

  public Boolean getReuseVlanSTag() {
    return reuseVlanSTag;
  }


  public void setReuseVlanSTag(Boolean reuseVlanSTag) {
    this.reuseVlanSTag = reuseVlanSTag;
  }


  public ServiceProfileLinkProtocolConfig encapsulation(EncapsulationEnum encapsulation) {
    
    this.encapsulation = encapsulation;
    return this;
  }

   /**
   * Port encapsulation - Derived response attribute. Ignored on request payloads.
   * @return encapsulation
  **/
  @javax.annotation.Nullable

  public EncapsulationEnum getEncapsulation() {
    return encapsulation;
  }


  public void setEncapsulation(EncapsulationEnum encapsulation) {
    this.encapsulation = encapsulation;
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
   * @return the ServiceProfileLinkProtocolConfig instance itself
   */
  public ServiceProfileLinkProtocolConfig putAdditionalProperty(String key, Object value) {
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
    ServiceProfileLinkProtocolConfig serviceProfileLinkProtocolConfig = (ServiceProfileLinkProtocolConfig) o;
    return Objects.equals(this.encapsulationStrategy, serviceProfileLinkProtocolConfig.encapsulationStrategy) &&
        Objects.equals(this.namedTags, serviceProfileLinkProtocolConfig.namedTags) &&
        Objects.equals(this.vlanCTagLabel, serviceProfileLinkProtocolConfig.vlanCTagLabel) &&
        Objects.equals(this.reuseVlanSTag, serviceProfileLinkProtocolConfig.reuseVlanSTag) &&
        Objects.equals(this.encapsulation, serviceProfileLinkProtocolConfig.encapsulation)&&
        Objects.equals(this.additionalProperties, serviceProfileLinkProtocolConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encapsulationStrategy, namedTags, vlanCTagLabel, reuseVlanSTag, encapsulation, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceProfileLinkProtocolConfig {\n");
    sb.append("    encapsulationStrategy: ").append(toIndentedString(encapsulationStrategy)).append("\n");
    sb.append("    namedTags: ").append(toIndentedString(namedTags)).append("\n");
    sb.append("    vlanCTagLabel: ").append(toIndentedString(vlanCTagLabel)).append("\n");
    sb.append("    reuseVlanSTag: ").append(toIndentedString(reuseVlanSTag)).append("\n");
    sb.append("    encapsulation: ").append(toIndentedString(encapsulation)).append("\n");
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
    openapiFields.add("encapsulationStrategy");
    openapiFields.add("namedTags");
    openapiFields.add("vlanCTagLabel");
    openapiFields.add("reuseVlanSTag");
    openapiFields.add("encapsulation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ServiceProfileLinkProtocolConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ServiceProfileLinkProtocolConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ServiceProfileLinkProtocolConfig is not found in the empty JSON string", ServiceProfileLinkProtocolConfig.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("encapsulationStrategy") != null && !jsonObj.get("encapsulationStrategy").isJsonNull()) && !jsonObj.get("encapsulationStrategy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encapsulationStrategy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encapsulationStrategy").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("namedTags") != null && !jsonObj.get("namedTags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `namedTags` to be an array in the JSON string but got `%s`", jsonObj.get("namedTags").toString()));
      }
      if ((jsonObj.get("vlanCTagLabel") != null && !jsonObj.get("vlanCTagLabel").isJsonNull()) && !jsonObj.get("vlanCTagLabel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vlanCTagLabel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vlanCTagLabel").toString()));
      }
      if ((jsonObj.get("encapsulation") != null && !jsonObj.get("encapsulation").isJsonNull()) && !jsonObj.get("encapsulation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encapsulation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encapsulation").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServiceProfileLinkProtocolConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServiceProfileLinkProtocolConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServiceProfileLinkProtocolConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServiceProfileLinkProtocolConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ServiceProfileLinkProtocolConfig>() {
           @Override
           public void write(JsonWriter out, ServiceProfileLinkProtocolConfig value) throws IOException {
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
           public ServiceProfileLinkProtocolConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ServiceProfileLinkProtocolConfig instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ServiceProfileLinkProtocolConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServiceProfileLinkProtocolConfig
  * @throws IOException if the JSON string is invalid with respect to ServiceProfileLinkProtocolConfig
  */
  public static ServiceProfileLinkProtocolConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServiceProfileLinkProtocolConfig.class);
  }

 /**
  * Convert an instance of ServiceProfileLinkProtocolConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

