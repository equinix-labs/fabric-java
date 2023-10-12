/*
 * Equinix Fabric API v4
 * Equinix Fabric is an advanced software-defined interconnection solution that enables you to directly, securely and dynamically connect to distributed infrastructure and digital ecosystems on platform Equinix via a single port, Customers can use Fabric to connect to: </br> 1. Cloud Service Providers - Clouds, network and other service providers.  </br> 2. Enterprises - Other Equinix customers, vendors and partners.  </br> 3. Myself - Another customer instance deployed at Equinix. </br>
 *
 * The version of the OpenAPI document: 4.10
 * Contact: api-support@equinix.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.equinix.openapi.fabric.v4.model;

import java.util.Objects;
import java.util.Arrays;
import com.equinix.openapi.fabric.v4.model.Account;
import com.equinix.openapi.fabric.v4.model.AdvanceConfiguration;
import com.equinix.openapi.fabric.v4.model.FabricConnectionUuid;
import com.equinix.openapi.fabric.v4.model.Ipv4;
import com.equinix.openapi.fabric.v4.model.PackageResponse;
import com.equinix.openapi.fabric.v4.model.Project;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import java.util.LinkedHashSet;
import java.util.Set;
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
 * EPT service instance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PrecisionTimeServiceCreateResponse {
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
  private PackageResponse _package;

  public static final String SERIALIZED_NAME_CONNECTIONS = "connections";
  @SerializedName(SERIALIZED_NAME_CONNECTIONS)
  private Set<FabricConnectionUuid> connections = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_NETWORKING_IPV4 = "networkingIpv4";
  @SerializedName(SERIALIZED_NAME_NETWORKING_IPV4)
  private Ipv4 networkingIpv4;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private Account account;

  public static final String SERIALIZED_NAME_ADVANCE_CONFIGURATION = "advanceConfiguration";
  @SerializedName(SERIALIZED_NAME_ADVANCE_CONFIGURATION)
  private AdvanceConfiguration advanceConfiguration;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private Project project;

  public PrecisionTimeServiceCreateResponse() {
  }

  public PrecisionTimeServiceCreateResponse type(TypeEnum type) {
    
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


  public PrecisionTimeServiceCreateResponse href(URI href) {
    
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


  public PrecisionTimeServiceCreateResponse uuid(UUID uuid) {
    
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


  public PrecisionTimeServiceCreateResponse name(String name) {
    
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


  public PrecisionTimeServiceCreateResponse description(String description) {
    
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


  public PrecisionTimeServiceCreateResponse state(StateEnum state) {
    
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


  public PrecisionTimeServiceCreateResponse _package(PackageResponse _package) {
    
    this._package = _package;
    return this;
  }

   /**
   * Get _package
   * @return _package
  **/
  @javax.annotation.Nonnull

  public PackageResponse getPackage() {
    return _package;
  }


  public void setPackage(PackageResponse _package) {
    this._package = _package;
  }


  public PrecisionTimeServiceCreateResponse connections(Set<FabricConnectionUuid> connections) {
    
    this.connections = connections;
    return this;
  }

  public PrecisionTimeServiceCreateResponse addConnectionsItem(FabricConnectionUuid connectionsItem) {
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


  public PrecisionTimeServiceCreateResponse networkingIpv4(Ipv4 networkingIpv4) {
    
    this.networkingIpv4 = networkingIpv4;
    return this;
  }

   /**
   * Get networkingIpv4
   * @return networkingIpv4
  **/
  @javax.annotation.Nonnull

  public Ipv4 getNetworkingIpv4() {
    return networkingIpv4;
  }


  public void setNetworkingIpv4(Ipv4 networkingIpv4) {
    this.networkingIpv4 = networkingIpv4;
  }


  public PrecisionTimeServiceCreateResponse account(Account account) {
    
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


  public PrecisionTimeServiceCreateResponse advanceConfiguration(AdvanceConfiguration advanceConfiguration) {
    
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


  public PrecisionTimeServiceCreateResponse project(Project project) {
    
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
   * @return the PrecisionTimeServiceCreateResponse instance itself
   */
  public PrecisionTimeServiceCreateResponse putAdditionalProperty(String key, Object value) {
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
    PrecisionTimeServiceCreateResponse precisionTimeServiceCreateResponse = (PrecisionTimeServiceCreateResponse) o;
    return Objects.equals(this.type, precisionTimeServiceCreateResponse.type) &&
        Objects.equals(this.href, precisionTimeServiceCreateResponse.href) &&
        Objects.equals(this.uuid, precisionTimeServiceCreateResponse.uuid) &&
        Objects.equals(this.name, precisionTimeServiceCreateResponse.name) &&
        Objects.equals(this.description, precisionTimeServiceCreateResponse.description) &&
        Objects.equals(this.state, precisionTimeServiceCreateResponse.state) &&
        Objects.equals(this._package, precisionTimeServiceCreateResponse._package) &&
        Objects.equals(this.connections, precisionTimeServiceCreateResponse.connections) &&
        Objects.equals(this.networkingIpv4, precisionTimeServiceCreateResponse.networkingIpv4) &&
        Objects.equals(this.account, precisionTimeServiceCreateResponse.account) &&
        Objects.equals(this.advanceConfiguration, precisionTimeServiceCreateResponse.advanceConfiguration) &&
        Objects.equals(this.project, precisionTimeServiceCreateResponse.project)&&
        Objects.equals(this.additionalProperties, precisionTimeServiceCreateResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, href, uuid, name, description, state, _package, connections, networkingIpv4, account, advanceConfiguration, project, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrecisionTimeServiceCreateResponse {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
    sb.append("    networkingIpv4: ").append(toIndentedString(networkingIpv4)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    advanceConfiguration: ").append(toIndentedString(advanceConfiguration)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
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
    openapiFields.add("networkingIpv4");
    openapiFields.add("account");
    openapiFields.add("advanceConfiguration");
    openapiFields.add("project");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("href");
    openapiRequiredFields.add("uuid");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("package");
    openapiRequiredFields.add("networkingIpv4");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PrecisionTimeServiceCreateResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PrecisionTimeServiceCreateResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PrecisionTimeServiceCreateResponse is not found in the empty JSON string", PrecisionTimeServiceCreateResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PrecisionTimeServiceCreateResponse.openapiRequiredFields) {
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
      PackageResponse.validateJsonObject(jsonObj.getAsJsonObject("package"));
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
      // validate the required field `networkingIpv4`
      Ipv4.validateJsonObject(jsonObj.getAsJsonObject("networkingIpv4"));
      // validate the optional field `account`
      if (jsonObj.get("account") != null && !jsonObj.get("account").isJsonNull()) {
        Account.validateJsonObject(jsonObj.getAsJsonObject("account"));
      }
      // validate the optional field `advanceConfiguration`
      if (jsonObj.get("advanceConfiguration") != null && !jsonObj.get("advanceConfiguration").isJsonNull()) {
        AdvanceConfiguration.validateJsonObject(jsonObj.getAsJsonObject("advanceConfiguration"));
      }
      // validate the optional field `project`
      if (jsonObj.get("project") != null && !jsonObj.get("project").isJsonNull()) {
        Project.validateJsonObject(jsonObj.getAsJsonObject("project"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PrecisionTimeServiceCreateResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PrecisionTimeServiceCreateResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PrecisionTimeServiceCreateResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PrecisionTimeServiceCreateResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PrecisionTimeServiceCreateResponse>() {
           @Override
           public void write(JsonWriter out, PrecisionTimeServiceCreateResponse value) throws IOException {
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
           public PrecisionTimeServiceCreateResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PrecisionTimeServiceCreateResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PrecisionTimeServiceCreateResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PrecisionTimeServiceCreateResponse
  * @throws IOException if the JSON string is invalid with respect to PrecisionTimeServiceCreateResponse
  */
  public static PrecisionTimeServiceCreateResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PrecisionTimeServiceCreateResponse.class);
  }

 /**
  * Convert an instance of PrecisionTimeServiceCreateResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

