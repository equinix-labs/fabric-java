/*
 * Equinix Fabric API v4
 * Equinix Fabric is an advanced software-defined interconnection solution that enables you to directly, securely and dynamically connect to distributed infrastructure and digital ecosystems on platform Equinix via a single port, Customers can use Fabric to connect to: </br> 1. Cloud Service Providers - Clouds, network and other service providers.  </br> 2. Enterprises - Other Equinix customers, vendors and partners.  </br> 3. Myself - Another customer instance deployed at Equinix. </br>
 *
 * The version of the OpenAPI document: 4.4
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
import com.equinix.openapi.fabric.v4.model.Changelog;
import com.equinix.openapi.fabric.v4.model.RoutingProtocolBFD;
import com.equinix.openapi.fabric.v4.model.RoutingProtocolChange;
import com.equinix.openapi.fabric.v4.model.RoutingProtocolOperation;
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
 * RoutingProtocolBGPData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RoutingProtocolBGPData {
  public static final String SERIALIZED_NAME_BGP_IPV6 = "bgpIpv6";
  @SerializedName(SERIALIZED_NAME_BGP_IPV6)
  private BGPConnectionIpv6 bgpIpv6;

  public static final String SERIALIZED_NAME_BFD = "bfd";
  @SerializedName(SERIALIZED_NAME_BFD)
  private RoutingProtocolBFD bfd;

  public static final String SERIALIZED_NAME_BGP_IPV4 = "bgpIpv4";
  @SerializedName(SERIALIZED_NAME_BGP_IPV4)
  private BGPConnectionIpv4 bgpIpv4;

  public static final String SERIALIZED_NAME_EQUINIX_ASN = "equinixAsn";
  @SerializedName(SERIALIZED_NAME_EQUINIX_ASN)
  private Long equinixAsn;

  public static final String SERIALIZED_NAME_CHANGE = "change";
  @SerializedName(SERIALIZED_NAME_CHANGE)
  private RoutingProtocolChange change;

  public static final String SERIALIZED_NAME_CHANGELOG = "changelog";
  @SerializedName(SERIALIZED_NAME_CHANGELOG)
  private Changelog changelog;

  /**
   * Routing protocol type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    BGP("BGP"),
    
    DIRECT("DIRECT");

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

  public static final String SERIALIZED_NAME_BGP_AUTH_KEY = "bgpAuthKey";
  @SerializedName(SERIALIZED_NAME_BGP_AUTH_KEY)
  private String bgpAuthKey;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    PROVISIONED("PROVISIONED"),
    
    DEPROVISIONED("DEPROVISIONED"),
    
    PROVISIONING("PROVISIONING"),
    
    DEPROVISIONING("DEPROVISIONING"),
    
    REPROVISIONING("REPROVISIONING"),
    
    FAILED("FAILED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private RoutingProtocolOperation operation;

  public static final String SERIALIZED_NAME_CUSTOMER_ASN = "customerAsn";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ASN)
  private Long customerAsn;

  public RoutingProtocolBGPData() {
  }

  public RoutingProtocolBGPData bgpIpv6(BGPConnectionIpv6 bgpIpv6) {
    
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


  public RoutingProtocolBGPData bfd(RoutingProtocolBFD bfd) {
    
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


  public RoutingProtocolBGPData bgpIpv4(BGPConnectionIpv4 bgpIpv4) {
    
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


  public RoutingProtocolBGPData equinixAsn(Long equinixAsn) {
    
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


  public RoutingProtocolBGPData change(RoutingProtocolChange change) {
    
    this.change = change;
    return this;
  }

   /**
   * Get change
   * @return change
  **/
  @javax.annotation.Nullable

  public RoutingProtocolChange getChange() {
    return change;
  }


  public void setChange(RoutingProtocolChange change) {
    this.change = change;
  }


  public RoutingProtocolBGPData changelog(Changelog changelog) {
    
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


  public RoutingProtocolBGPData type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Routing protocol type
   * @return type
  **/
  @javax.annotation.Nullable

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public RoutingProtocolBGPData uuid(UUID uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Routing protocol identifier
   * @return uuid
  **/
  @javax.annotation.Nullable

  public UUID getUuid() {
    return uuid;
  }


  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }


  public RoutingProtocolBGPData bgpAuthKey(String bgpAuthKey) {
    
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


  public RoutingProtocolBGPData name(String name) {
    
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


  public RoutingProtocolBGPData href(URI href) {
    
    this.href = href;
    return this;
  }

   /**
   * Routing Protocol URI
   * @return href
  **/
  @javax.annotation.Nullable

  public URI getHref() {
    return href;
  }


  public void setHref(URI href) {
    this.href = href;
  }


  public RoutingProtocolBGPData state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public RoutingProtocolBGPData operation(RoutingProtocolOperation operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @javax.annotation.Nullable

  public RoutingProtocolOperation getOperation() {
    return operation;
  }


  public void setOperation(RoutingProtocolOperation operation) {
    this.operation = operation;
  }


  public RoutingProtocolBGPData customerAsn(Long customerAsn) {
    
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
   * @return the RoutingProtocolBGPData instance itself
   */
  public RoutingProtocolBGPData putAdditionalProperty(String key, Object value) {
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
    RoutingProtocolBGPData routingProtocolBGPData = (RoutingProtocolBGPData) o;
    return Objects.equals(this.bgpIpv6, routingProtocolBGPData.bgpIpv6) &&
        Objects.equals(this.bfd, routingProtocolBGPData.bfd) &&
        Objects.equals(this.bgpIpv4, routingProtocolBGPData.bgpIpv4) &&
        Objects.equals(this.equinixAsn, routingProtocolBGPData.equinixAsn) &&
        Objects.equals(this.change, routingProtocolBGPData.change) &&
        Objects.equals(this.changelog, routingProtocolBGPData.changelog) &&
        Objects.equals(this.type, routingProtocolBGPData.type) &&
        Objects.equals(this.uuid, routingProtocolBGPData.uuid) &&
        Objects.equals(this.bgpAuthKey, routingProtocolBGPData.bgpAuthKey) &&
        Objects.equals(this.name, routingProtocolBGPData.name) &&
        Objects.equals(this.href, routingProtocolBGPData.href) &&
        Objects.equals(this.state, routingProtocolBGPData.state) &&
        Objects.equals(this.operation, routingProtocolBGPData.operation) &&
        Objects.equals(this.customerAsn, routingProtocolBGPData.customerAsn)&&
        Objects.equals(this.additionalProperties, routingProtocolBGPData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bgpIpv6, bfd, bgpIpv4, equinixAsn, change, changelog, type, uuid, bgpAuthKey, name, href, state, operation, customerAsn, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutingProtocolBGPData {\n");
    sb.append("    bgpIpv6: ").append(toIndentedString(bgpIpv6)).append("\n");
    sb.append("    bfd: ").append(toIndentedString(bfd)).append("\n");
    sb.append("    bgpIpv4: ").append(toIndentedString(bgpIpv4)).append("\n");
    sb.append("    equinixAsn: ").append(toIndentedString(equinixAsn)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    changelog: ").append(toIndentedString(changelog)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    bgpAuthKey: ").append(toIndentedString(bgpAuthKey)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    customerAsn: ").append(toIndentedString(customerAsn)).append("\n");
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
    openapiFields.add("bgpIpv6");
    openapiFields.add("bfd");
    openapiFields.add("bgpIpv4");
    openapiFields.add("equinixAsn");
    openapiFields.add("change");
    openapiFields.add("changelog");
    openapiFields.add("type");
    openapiFields.add("uuid");
    openapiFields.add("bgpAuthKey");
    openapiFields.add("name");
    openapiFields.add("href");
    openapiFields.add("state");
    openapiFields.add("operation");
    openapiFields.add("customerAsn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RoutingProtocolBGPData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RoutingProtocolBGPData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RoutingProtocolBGPData is not found in the empty JSON string", RoutingProtocolBGPData.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `bgpIpv6`
      if (jsonObj.get("bgpIpv6") != null && !jsonObj.get("bgpIpv6").isJsonNull()) {
        BGPConnectionIpv6.validateJsonObject(jsonObj.getAsJsonObject("bgpIpv6"));
      }
      // validate the optional field `bfd`
      if (jsonObj.get("bfd") != null && !jsonObj.get("bfd").isJsonNull()) {
        RoutingProtocolBFD.validateJsonObject(jsonObj.getAsJsonObject("bfd"));
      }
      // validate the optional field `bgpIpv4`
      if (jsonObj.get("bgpIpv4") != null && !jsonObj.get("bgpIpv4").isJsonNull()) {
        BGPConnectionIpv4.validateJsonObject(jsonObj.getAsJsonObject("bgpIpv4"));
      }
      // validate the optional field `change`
      if (jsonObj.get("change") != null && !jsonObj.get("change").isJsonNull()) {
        RoutingProtocolChange.validateJsonObject(jsonObj.getAsJsonObject("change"));
      }
      // validate the optional field `changelog`
      if (jsonObj.get("changelog") != null && !jsonObj.get("changelog").isJsonNull()) {
        Changelog.validateJsonObject(jsonObj.getAsJsonObject("changelog"));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("bgpAuthKey") != null && !jsonObj.get("bgpAuthKey").isJsonNull()) && !jsonObj.get("bgpAuthKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bgpAuthKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bgpAuthKey").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the optional field `operation`
      if (jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonNull()) {
        RoutingProtocolOperation.validateJsonObject(jsonObj.getAsJsonObject("operation"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RoutingProtocolBGPData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RoutingProtocolBGPData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RoutingProtocolBGPData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RoutingProtocolBGPData.class));

       return (TypeAdapter<T>) new TypeAdapter<RoutingProtocolBGPData>() {
           @Override
           public void write(JsonWriter out, RoutingProtocolBGPData value) throws IOException {
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
           public RoutingProtocolBGPData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RoutingProtocolBGPData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RoutingProtocolBGPData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RoutingProtocolBGPData
  * @throws IOException if the JSON string is invalid with respect to RoutingProtocolBGPData
  */
  public static RoutingProtocolBGPData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RoutingProtocolBGPData.class);
  }

 /**
  * Convert an instance of RoutingProtocolBGPData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
