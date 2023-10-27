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
import com.equinix.openapi.fabric.v4.model.BGPConnectionIpv4;
import com.equinix.openapi.fabric.v4.model.BGPConnectionIpv6;
import com.equinix.openapi.fabric.v4.model.RoutingProtocolBFD;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * RoutingProtocolBGPType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RoutingProtocolBGPType {
  /**
   * Routing protocol type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    BGP("BGP");

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

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_BGP_IPV4 = "bgpIpv4";
  @SerializedName(SERIALIZED_NAME_BGP_IPV4)
  private BGPConnectionIpv4 bgpIpv4;

  public static final String SERIALIZED_NAME_BGP_IPV6 = "bgpIpv6";
  @SerializedName(SERIALIZED_NAME_BGP_IPV6)
  private BGPConnectionIpv6 bgpIpv6;

  public static final String SERIALIZED_NAME_CUSTOMER_ASN = "customerAsn";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ASN)
  private Long customerAsn;

  public static final String SERIALIZED_NAME_EQUINIX_ASN = "equinixAsn";
  @SerializedName(SERIALIZED_NAME_EQUINIX_ASN)
  private Long equinixAsn;

  public static final String SERIALIZED_NAME_BGP_AUTH_KEY = "bgpAuthKey";
  @SerializedName(SERIALIZED_NAME_BGP_AUTH_KEY)
  private String bgpAuthKey;

  public static final String SERIALIZED_NAME_BFD = "bfd";
  @SerializedName(SERIALIZED_NAME_BFD)
  private RoutingProtocolBFD bfd;

  public RoutingProtocolBGPType() {
  }

  public RoutingProtocolBGPType type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Routing protocol type
   * @return type
  **/
  @javax.annotation.Nonnull

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public RoutingProtocolBGPType name(String name) {
    
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


  public RoutingProtocolBGPType bgpIpv4(BGPConnectionIpv4 bgpIpv4) {
    
    this.bgpIpv4 = bgpIpv4;
    return this;
  }

   /**
   * Get bgpIpv4
   * @return bgpIpv4
  **/
  @javax.annotation.Nullable

  public BGPConnectionIpv4 getBgpIpv4() {
    return bgpIpv4;
  }


  public void setBgpIpv4(BGPConnectionIpv4 bgpIpv4) {
    this.bgpIpv4 = bgpIpv4;
  }


  public RoutingProtocolBGPType bgpIpv6(BGPConnectionIpv6 bgpIpv6) {
    
    this.bgpIpv6 = bgpIpv6;
    return this;
  }

   /**
   * Get bgpIpv6
   * @return bgpIpv6
  **/
  @javax.annotation.Nullable

  public BGPConnectionIpv6 getBgpIpv6() {
    return bgpIpv6;
  }


  public void setBgpIpv6(BGPConnectionIpv6 bgpIpv6) {
    this.bgpIpv6 = bgpIpv6;
  }


  public RoutingProtocolBGPType customerAsn(Long customerAsn) {
    
    this.customerAsn = customerAsn;
    return this;
  }

   /**
   * Customer asn
   * @return customerAsn
  **/
  @javax.annotation.Nullable

  public Long getCustomerAsn() {
    return customerAsn;
  }


  public void setCustomerAsn(Long customerAsn) {
    this.customerAsn = customerAsn;
  }


  public RoutingProtocolBGPType equinixAsn(Long equinixAsn) {
    
    this.equinixAsn = equinixAsn;
    return this;
  }

   /**
   * Equinix asn
   * @return equinixAsn
  **/
  @javax.annotation.Nullable

  public Long getEquinixAsn() {
    return equinixAsn;
  }


  public void setEquinixAsn(Long equinixAsn) {
    this.equinixAsn = equinixAsn;
  }


  public RoutingProtocolBGPType bgpAuthKey(String bgpAuthKey) {
    
    this.bgpAuthKey = bgpAuthKey;
    return this;
  }

   /**
   * BGP authorization key
   * @return bgpAuthKey
  **/
  @javax.annotation.Nullable

  public String getBgpAuthKey() {
    return bgpAuthKey;
  }


  public void setBgpAuthKey(String bgpAuthKey) {
    this.bgpAuthKey = bgpAuthKey;
  }


  public RoutingProtocolBGPType bfd(RoutingProtocolBFD bfd) {
    
    this.bfd = bfd;
    return this;
  }

   /**
   * Get bfd
   * @return bfd
  **/
  @javax.annotation.Nullable

  public RoutingProtocolBFD getBfd() {
    return bfd;
  }


  public void setBfd(RoutingProtocolBFD bfd) {
    this.bfd = bfd;
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
   * @return the RoutingProtocolBGPType instance itself
   */
  public RoutingProtocolBGPType putAdditionalProperty(String key, Object value) {
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
    RoutingProtocolBGPType routingProtocolBGPType = (RoutingProtocolBGPType) o;
    return Objects.equals(this.type, routingProtocolBGPType.type) &&
        Objects.equals(this.name, routingProtocolBGPType.name) &&
        Objects.equals(this.bgpIpv4, routingProtocolBGPType.bgpIpv4) &&
        Objects.equals(this.bgpIpv6, routingProtocolBGPType.bgpIpv6) &&
        Objects.equals(this.customerAsn, routingProtocolBGPType.customerAsn) &&
        Objects.equals(this.equinixAsn, routingProtocolBGPType.equinixAsn) &&
        Objects.equals(this.bgpAuthKey, routingProtocolBGPType.bgpAuthKey) &&
        Objects.equals(this.bfd, routingProtocolBGPType.bfd)&&
        Objects.equals(this.additionalProperties, routingProtocolBGPType.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, bgpIpv4, bgpIpv6, customerAsn, equinixAsn, bgpAuthKey, bfd, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutingProtocolBGPType {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bgpIpv4: ").append(toIndentedString(bgpIpv4)).append("\n");
    sb.append("    bgpIpv6: ").append(toIndentedString(bgpIpv6)).append("\n");
    sb.append("    customerAsn: ").append(toIndentedString(customerAsn)).append("\n");
    sb.append("    equinixAsn: ").append(toIndentedString(equinixAsn)).append("\n");
    sb.append("    bgpAuthKey: ").append(toIndentedString(bgpAuthKey)).append("\n");
    sb.append("    bfd: ").append(toIndentedString(bfd)).append("\n");
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
    openapiFields.add("bgpIpv4");
    openapiFields.add("bgpIpv6");
    openapiFields.add("customerAsn");
    openapiFields.add("equinixAsn");
    openapiFields.add("bgpAuthKey");
    openapiFields.add("bfd");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RoutingProtocolBGPType
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RoutingProtocolBGPType.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RoutingProtocolBGPType is not found in the empty JSON string", RoutingProtocolBGPType.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RoutingProtocolBGPType.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `bgpIpv4`
      if (jsonObj.get("bgpIpv4") != null && !jsonObj.get("bgpIpv4").isJsonNull()) {
        BGPConnectionIpv4.validateJsonObject(jsonObj.getAsJsonObject("bgpIpv4"));
      }
      // validate the optional field `bgpIpv6`
      if (jsonObj.get("bgpIpv6") != null && !jsonObj.get("bgpIpv6").isJsonNull()) {
        BGPConnectionIpv6.validateJsonObject(jsonObj.getAsJsonObject("bgpIpv6"));
      }
      if ((jsonObj.get("bgpAuthKey") != null && !jsonObj.get("bgpAuthKey").isJsonNull()) && !jsonObj.get("bgpAuthKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bgpAuthKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bgpAuthKey").toString()));
      }
      // validate the optional field `bfd`
      if (jsonObj.get("bfd") != null && !jsonObj.get("bfd").isJsonNull()) {
        RoutingProtocolBFD.validateJsonObject(jsonObj.getAsJsonObject("bfd"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RoutingProtocolBGPType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RoutingProtocolBGPType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RoutingProtocolBGPType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RoutingProtocolBGPType.class));

       return (TypeAdapter<T>) new TypeAdapter<RoutingProtocolBGPType>() {
           @Override
           public void write(JsonWriter out, RoutingProtocolBGPType value) throws IOException {
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
           public RoutingProtocolBGPType read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RoutingProtocolBGPType instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RoutingProtocolBGPType given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RoutingProtocolBGPType
  * @throws IOException if the JSON string is invalid with respect to RoutingProtocolBGPType
  */
  public static RoutingProtocolBGPType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RoutingProtocolBGPType.class);
  }

 /**
  * Convert an instance of RoutingProtocolBGPType to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

