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
import com.equinix.openapi.fabric.v4.model.DirectConnectionIpv4;
import com.equinix.openapi.fabric.v4.model.DirectConnectionIpv6;
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
 * RoutingProtocolDirectData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RoutingProtocolDirectData {
  /**
   * Routing protocol type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
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

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DIRECT_IPV4 = "directIpv4";
  @SerializedName(SERIALIZED_NAME_DIRECT_IPV4)
  private DirectConnectionIpv4 directIpv4;

  public static final String SERIALIZED_NAME_DIRECT_IPV6 = "directIpv6";
  @SerializedName(SERIALIZED_NAME_DIRECT_IPV6)
  private DirectConnectionIpv6 directIpv6;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private UUID uuid;

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

  public static final String SERIALIZED_NAME_CHANGE = "change";
  @SerializedName(SERIALIZED_NAME_CHANGE)
  private RoutingProtocolChange change;

  public static final String SERIALIZED_NAME_CHANGELOG = "changelog";
  @SerializedName(SERIALIZED_NAME_CHANGELOG)
  private Changelog changelog;

  public RoutingProtocolDirectData() {
  }

  public RoutingProtocolDirectData type(TypeEnum type) {
    
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


  public RoutingProtocolDirectData name(String name) {
    
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


  public RoutingProtocolDirectData directIpv4(DirectConnectionIpv4 directIpv4) {
    
    this.directIpv4 = directIpv4;
    return this;
  }

   /**
   * Get directIpv4
   * @return directIpv4
  **/
  @javax.annotation.Nullable

  public DirectConnectionIpv4 getDirectIpv4() {
    return directIpv4;
  }


  public void setDirectIpv4(DirectConnectionIpv4 directIpv4) {
    this.directIpv4 = directIpv4;
  }


  public RoutingProtocolDirectData directIpv6(DirectConnectionIpv6 directIpv6) {
    
    this.directIpv6 = directIpv6;
    return this;
  }

   /**
   * Get directIpv6
   * @return directIpv6
  **/
  @javax.annotation.Nullable

  public DirectConnectionIpv6 getDirectIpv6() {
    return directIpv6;
  }


  public void setDirectIpv6(DirectConnectionIpv6 directIpv6) {
    this.directIpv6 = directIpv6;
  }


  public RoutingProtocolDirectData href(URI href) {
    
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


  public RoutingProtocolDirectData uuid(UUID uuid) {
    
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


  public RoutingProtocolDirectData state(StateEnum state) {
    
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


  public RoutingProtocolDirectData operation(RoutingProtocolOperation operation) {
    
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


  public RoutingProtocolDirectData change(RoutingProtocolChange change) {
    
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


  public RoutingProtocolDirectData changelog(Changelog changelog) {
    
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
   * @return the RoutingProtocolDirectData instance itself
   */
  public RoutingProtocolDirectData putAdditionalProperty(String key, Object value) {
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
    RoutingProtocolDirectData routingProtocolDirectData = (RoutingProtocolDirectData) o;
    return Objects.equals(this.type, routingProtocolDirectData.type) &&
        Objects.equals(this.name, routingProtocolDirectData.name) &&
        Objects.equals(this.directIpv4, routingProtocolDirectData.directIpv4) &&
        Objects.equals(this.directIpv6, routingProtocolDirectData.directIpv6) &&
        Objects.equals(this.href, routingProtocolDirectData.href) &&
        Objects.equals(this.uuid, routingProtocolDirectData.uuid) &&
        Objects.equals(this.state, routingProtocolDirectData.state) &&
        Objects.equals(this.operation, routingProtocolDirectData.operation) &&
        Objects.equals(this.change, routingProtocolDirectData.change) &&
        Objects.equals(this.changelog, routingProtocolDirectData.changelog)&&
        Objects.equals(this.additionalProperties, routingProtocolDirectData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, directIpv4, directIpv6, href, uuid, state, operation, change, changelog, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutingProtocolDirectData {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    directIpv4: ").append(toIndentedString(directIpv4)).append("\n");
    sb.append("    directIpv6: ").append(toIndentedString(directIpv6)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    changelog: ").append(toIndentedString(changelog)).append("\n");
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
    openapiFields.add("directIpv4");
    openapiFields.add("directIpv6");
    openapiFields.add("href");
    openapiFields.add("uuid");
    openapiFields.add("state");
    openapiFields.add("operation");
    openapiFields.add("change");
    openapiFields.add("changelog");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RoutingProtocolDirectData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RoutingProtocolDirectData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RoutingProtocolDirectData is not found in the empty JSON string", RoutingProtocolDirectData.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `directIpv4`
      if (jsonObj.get("directIpv4") != null && !jsonObj.get("directIpv4").isJsonNull()) {
        DirectConnectionIpv4.validateJsonObject(jsonObj.getAsJsonObject("directIpv4"));
      }
      // validate the optional field `directIpv6`
      if (jsonObj.get("directIpv6") != null && !jsonObj.get("directIpv6").isJsonNull()) {
        DirectConnectionIpv6.validateJsonObject(jsonObj.getAsJsonObject("directIpv6"));
      }
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the optional field `operation`
      if (jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonNull()) {
        RoutingProtocolOperation.validateJsonObject(jsonObj.getAsJsonObject("operation"));
      }
      // validate the optional field `change`
      if (jsonObj.get("change") != null && !jsonObj.get("change").isJsonNull()) {
        RoutingProtocolChange.validateJsonObject(jsonObj.getAsJsonObject("change"));
      }
      // validate the optional field `changelog`
      if (jsonObj.get("changelog") != null && !jsonObj.get("changelog").isJsonNull()) {
        Changelog.validateJsonObject(jsonObj.getAsJsonObject("changelog"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RoutingProtocolDirectData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RoutingProtocolDirectData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RoutingProtocolDirectData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RoutingProtocolDirectData.class));

       return (TypeAdapter<T>) new TypeAdapter<RoutingProtocolDirectData>() {
           @Override
           public void write(JsonWriter out, RoutingProtocolDirectData value) throws IOException {
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
           public RoutingProtocolDirectData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RoutingProtocolDirectData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RoutingProtocolDirectData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RoutingProtocolDirectData
  * @throws IOException if the JSON string is invalid with respect to RoutingProtocolDirectData
  */
  public static RoutingProtocolDirectData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RoutingProtocolDirectData.class);
  }

 /**
  * Convert an instance of RoutingProtocolDirectData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

