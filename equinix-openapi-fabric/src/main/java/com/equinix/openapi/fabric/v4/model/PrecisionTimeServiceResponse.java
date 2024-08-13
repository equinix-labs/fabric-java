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

import com.equinix.openapi.fabric.JSON;
import com.google.gson.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.net.URI;
import java.util.*;

/**
 * EPT service instance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PrecisionTimeServiceResponse {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NTP("NTP"),
    
    PTP("PTP");

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

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private UUID uuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * indicate service state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    PROVISIONED("PROVISIONED"),
    
    PROVISIONING("PROVISIONING"),
    
    PROVISIONING_FAILED("PROVISIONING_FAILED"),
    
    CONFIGURING("CONFIGURING"),
    
    CANCELLED("CANCELLED"),
    
    DEPROVISIONING_FAILED("DEPROVISIONING_FAILED"),
    
    PENDING_CONFIGURATION("PENDING_CONFIGURATION"),
    
    DEPROVISIONED("DEPROVISIONED"),
    
    CONFIGURING_FAILED("CONFIGURING_FAILED"),
    
    DEPROVISIONING("DEPROVISIONING");

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

  public static final String SERIALIZED_NAME_PACKAGE = "package";
  @SerializedName(SERIALIZED_NAME_PACKAGE)
  private PrecisionTimePackageResponse _package;

  public static final String SERIALIZED_NAME_CONNECTIONS = "connections";
  @SerializedName(SERIALIZED_NAME_CONNECTIONS)
  private Set<FabricConnectionUuid> connections = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Order order;

  public static final String SERIALIZED_NAME_IPV4 = "ipv4";
  @SerializedName(SERIALIZED_NAME_IPV4)
  private Ipv4 ipv4;

  public static final String SERIALIZED_NAME_ADVANCE_CONFIGURATION = "advanceConfiguration";
  @SerializedName(SERIALIZED_NAME_ADVANCE_CONFIGURATION)
  private AdvanceConfiguration advanceConfiguration;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private Project project;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private Account account;

  public PrecisionTimeServiceResponse() {
  }

  public PrecisionTimeServiceResponse type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public PrecisionTimeServiceResponse href(URI href) {
    
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @javax.annotation.Nonnull

  public URI getHref() {
    return href;
  }


  public void setHref(URI href) {
    this.href = href;
  }


  public PrecisionTimeServiceResponse uuid(UUID uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * uuid of the ept service
   * @return uuid
  **/
  @javax.annotation.Nonnull

  public UUID getUuid() {
    return uuid;
  }


  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }


  public PrecisionTimeServiceResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * name of the ept service
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PrecisionTimeServiceResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PrecisionTimeServiceResponse state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * indicate service state
   * @return state
  **/
  @javax.annotation.Nonnull

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public PrecisionTimeServiceResponse _package(PrecisionTimePackageResponse _package) {
    
    this._package = _package;
    return this;
  }

   /**
   * Get _package
   * @return _package
  **/
  @javax.annotation.Nonnull

  public PrecisionTimePackageResponse getPackage() {
    return _package;
  }


  public void setPackage(PrecisionTimePackageResponse _package) {
    this._package = _package;
  }


  public PrecisionTimeServiceResponse connections(Set<FabricConnectionUuid> connections) {
    
    this.connections = connections;
    return this;
  }

  public PrecisionTimeServiceResponse addConnectionsItem(FabricConnectionUuid connectionsItem) {
    if (this.connections == null) {
      this.connections = new LinkedHashSet<>();
    }
    this.connections.add(connectionsItem);
    return this;
  }

   /**
   * fabric l2 connections used for the ept service
   * @return connections
  **/
  @javax.annotation.Nullable

  public Set<FabricConnectionUuid> getConnections() {
    return connections;
  }


  public void setConnections(Set<FabricConnectionUuid> connections) {
    this.connections = connections;
  }


  public PrecisionTimeServiceResponse order(Order order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nonnull

  public Order getOrder() {
    return order;
  }


  public void setOrder(Order order) {
    this.order = order;
  }


  public PrecisionTimeServiceResponse ipv4(Ipv4 ipv4) {
    
    this.ipv4 = ipv4;
    return this;
  }

   /**
   * Get ipv4
   * @return ipv4
  **/
  @javax.annotation.Nonnull

  public Ipv4 getIpv4() {
    return ipv4;
  }


  public void setIpv4(Ipv4 ipv4) {
    this.ipv4 = ipv4;
  }


  public PrecisionTimeServiceResponse advanceConfiguration(AdvanceConfiguration advanceConfiguration) {
    
    this.advanceConfiguration = advanceConfiguration;
    return this;
  }

   /**
   * Get advanceConfiguration
   * @return advanceConfiguration
  **/
  @javax.annotation.Nullable

  public AdvanceConfiguration getAdvanceConfiguration() {
    return advanceConfiguration;
  }


  public void setAdvanceConfiguration(AdvanceConfiguration advanceConfiguration) {
    this.advanceConfiguration = advanceConfiguration;
  }


  public PrecisionTimeServiceResponse project(Project project) {
    
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


  public PrecisionTimeServiceResponse account(Account account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nullable

  public Account getAccount() {
    return account;
  }


  public void setAccount(Account account) {
    this.account = account;
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
   * @return the PrecisionTimeServiceResponse instance itself
   */
  public PrecisionTimeServiceResponse putAdditionalProperty(String key, Object value) {
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
    PrecisionTimeServiceResponse precisionTimeServiceResponse = (PrecisionTimeServiceResponse) o;
    return Objects.equals(this.type, precisionTimeServiceResponse.type) &&
        Objects.equals(this.href, precisionTimeServiceResponse.href) &&
        Objects.equals(this.uuid, precisionTimeServiceResponse.uuid) &&
        Objects.equals(this.name, precisionTimeServiceResponse.name) &&
        Objects.equals(this.description, precisionTimeServiceResponse.description) &&
        Objects.equals(this.state, precisionTimeServiceResponse.state) &&
        Objects.equals(this._package, precisionTimeServiceResponse._package) &&
        Objects.equals(this.connections, precisionTimeServiceResponse.connections) &&
        Objects.equals(this.order, precisionTimeServiceResponse.order) &&
        Objects.equals(this.ipv4, precisionTimeServiceResponse.ipv4) &&
        Objects.equals(this.advanceConfiguration, precisionTimeServiceResponse.advanceConfiguration) &&
        Objects.equals(this.project, precisionTimeServiceResponse.project) &&
        Objects.equals(this.account, precisionTimeServiceResponse.account)&&
        Objects.equals(this.additionalProperties, precisionTimeServiceResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, href, uuid, name, description, state, _package, connections, order, ipv4, advanceConfiguration, project, account, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrecisionTimeServiceResponse {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    ipv4: ").append(toIndentedString(ipv4)).append("\n");
    sb.append("    advanceConfiguration: ").append(toIndentedString(advanceConfiguration)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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
    openapiFields.add("href");
    openapiFields.add("uuid");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("state");
    openapiFields.add("package");
    openapiFields.add("connections");
    openapiFields.add("order");
    openapiFields.add("ipv4");
    openapiFields.add("advanceConfiguration");
    openapiFields.add("project");
    openapiFields.add("account");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("href");
    openapiRequiredFields.add("uuid");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("package");
    openapiRequiredFields.add("order");
    openapiRequiredFields.add("ipv4");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PrecisionTimeServiceResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PrecisionTimeServiceResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PrecisionTimeServiceResponse is not found in the empty JSON string", PrecisionTimeServiceResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PrecisionTimeServiceResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if (!jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the required field `package`
      PrecisionTimePackageResponse.validateJsonObject(jsonObj.getAsJsonObject("package"));
      if (jsonObj.get("connections") != null && !jsonObj.get("connections").isJsonNull()) {
        JsonArray jsonArrayconnections = jsonObj.getAsJsonArray("connections");
        if (jsonArrayconnections != null) {
          // ensure the json data is an array
          if (!jsonObj.get("connections").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `connections` to be an array in the JSON string but got `%s`", jsonObj.get("connections").toString()));
          }

          // validate the optional field `connections` (array)
          for (int i = 0; i < jsonArrayconnections.size(); i++) {
            FabricConnectionUuid.validateJsonObject(jsonArrayconnections.get(i).getAsJsonObject());
          };
        }
      }
      // validate the required field `order`
      Order.validateJsonObject(jsonObj.getAsJsonObject("order"));
      // validate the required field `ipv4`
      Ipv4.validateJsonObject(jsonObj.getAsJsonObject("ipv4"));
      // validate the optional field `advanceConfiguration`
      if (jsonObj.get("advanceConfiguration") != null && !jsonObj.get("advanceConfiguration").isJsonNull()) {
        AdvanceConfiguration.validateJsonObject(jsonObj.getAsJsonObject("advanceConfiguration"));
      }
      // validate the optional field `project`
      if (jsonObj.get("project") != null && !jsonObj.get("project").isJsonNull()) {
        Project.validateJsonObject(jsonObj.getAsJsonObject("project"));
      }
      // validate the optional field `account`
      if (jsonObj.get("account") != null && !jsonObj.get("account").isJsonNull()) {
        Account.validateJsonObject(jsonObj.getAsJsonObject("account"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PrecisionTimeServiceResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PrecisionTimeServiceResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PrecisionTimeServiceResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PrecisionTimeServiceResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PrecisionTimeServiceResponse>() {
           @Override
           public void write(JsonWriter out, PrecisionTimeServiceResponse value) throws IOException {
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
           public PrecisionTimeServiceResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PrecisionTimeServiceResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PrecisionTimeServiceResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PrecisionTimeServiceResponse
  * @throws IOException if the JSON string is invalid with respect to PrecisionTimeServiceResponse
  */
  public static PrecisionTimeServiceResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PrecisionTimeServiceResponse.class);
  }

 /**
  * Convert an instance of PrecisionTimeServiceResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

