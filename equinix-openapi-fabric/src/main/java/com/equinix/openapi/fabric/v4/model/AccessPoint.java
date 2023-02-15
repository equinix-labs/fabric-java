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
import com.equinix.openapi.fabric.v4.model.AccessPointType;
import com.equinix.openapi.fabric.v4.model.ModelInterface;
import com.equinix.openapi.fabric.v4.model.PeeringType;
import com.equinix.openapi.fabric.v4.model.RoutingProtocol;
import com.equinix.openapi.fabric.v4.model.SimplifiedAccount;
import com.equinix.openapi.fabric.v4.model.SimplifiedLinkProtocol;
import com.equinix.openapi.fabric.v4.model.SimplifiedLocation;
import com.equinix.openapi.fabric.v4.model.SimplifiedNetwork;
import com.equinix.openapi.fabric.v4.model.SimplifiedPort;
import com.equinix.openapi.fabric.v4.model.SimplifiedServiceProfile;
import com.equinix.openapi.fabric.v4.model.VirtualDevice;
import com.equinix.openapi.fabric.v4.model.VirtualGateway;
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
 * Access point object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccessPoint {
  public static final String SERIALIZED_NAME_PROVIDER_CONNECTION_ID = "providerConnectionId";
  @SerializedName(SERIALIZED_NAME_PROVIDER_CONNECTION_ID)
  private String providerConnectionId;

  public static final String SERIALIZED_NAME_PROFILE = "profile";
  @SerializedName(SERIALIZED_NAME_PROFILE)
  private SimplifiedServiceProfile profile;

  public static final String SERIALIZED_NAME_VIRTUAL_DEVICE = "virtualDevice";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_DEVICE)
  private VirtualDevice virtualDevice;

  public static final String SERIALIZED_NAME_AUTHENTICATION_KEY = "authenticationKey";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_KEY)
  private String authenticationKey;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private AccessPointType type;

  public static final String SERIALIZED_NAME_INTERFACE = "interface";
  @SerializedName(SERIALIZED_NAME_INTERFACE)
  private ModelInterface _interface;

  public static final String SERIALIZED_NAME_ROUTING_PROTOCOLS = "routingProtocols";
  @SerializedName(SERIALIZED_NAME_ROUTING_PROTOCOLS)
  private List<RoutingProtocol> routingProtocols = null;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private SimplifiedNetwork network;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private SimplifiedPort port;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additionalInfo";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  private Object additionalInfo;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private SimplifiedLocation location;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private SimplifiedAccount account;

  public static final String SERIALIZED_NAME_GATEWAY = "gateway";
  @SerializedName(SERIALIZED_NAME_GATEWAY)
  private VirtualGateway gateway;

  public static final String SERIALIZED_NAME_PEERING_TYPE = "peeringType";
  @SerializedName(SERIALIZED_NAME_PEERING_TYPE)
  private PeeringType peeringType;

  public static final String SERIALIZED_NAME_LINK_PROTOCOL = "linkProtocol";
  @SerializedName(SERIALIZED_NAME_LINK_PROTOCOL)
  private SimplifiedLinkProtocol linkProtocol;

  public static final String SERIALIZED_NAME_SELLER_REGION = "sellerRegion";
  @SerializedName(SERIALIZED_NAME_SELLER_REGION)
  private String sellerRegion;

  public AccessPoint() {
  }

  public AccessPoint providerConnectionId(String providerConnectionId) {
    
    this.providerConnectionId = providerConnectionId;
    return this;
  }

   /**
   * Provider assigned Connection Id
   * @return providerConnectionId
  **/
  @javax.annotation.Nullable

  public String getProviderConnectionId() {
    return providerConnectionId;
  }


  public void setProviderConnectionId(String providerConnectionId) {
    this.providerConnectionId = providerConnectionId;
  }


  public AccessPoint profile(SimplifiedServiceProfile profile) {
    
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @javax.annotation.Nullable

  public SimplifiedServiceProfile getProfile() {
    return profile;
  }


  public void setProfile(SimplifiedServiceProfile profile) {
    this.profile = profile;
  }


  public AccessPoint virtualDevice(VirtualDevice virtualDevice) {
    
    this.virtualDevice = virtualDevice;
    return this;
  }

   /**
   * Get virtualDevice
   * @return virtualDevice
  **/
  @javax.annotation.Nullable

  public VirtualDevice getVirtualDevice() {
    return virtualDevice;
  }


  public void setVirtualDevice(VirtualDevice virtualDevice) {
    this.virtualDevice = virtualDevice;
  }


  public AccessPoint authenticationKey(String authenticationKey) {
    
    this.authenticationKey = authenticationKey;
    return this;
  }

   /**
   * Access point authentication key
   * @return authenticationKey
  **/
  @javax.annotation.Nullable

  public String getAuthenticationKey() {
    return authenticationKey;
  }


  public void setAuthenticationKey(String authenticationKey) {
    this.authenticationKey = authenticationKey;
  }


  public AccessPoint type(AccessPointType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable

  public AccessPointType getType() {
    return type;
  }


  public void setType(AccessPointType type) {
    this.type = type;
  }


  public AccessPoint _interface(ModelInterface _interface) {
    
    this._interface = _interface;
    return this;
  }

   /**
   * Get _interface
   * @return _interface
  **/
  @javax.annotation.Nullable

  public ModelInterface getInterface() {
    return _interface;
  }


  public void setInterface(ModelInterface _interface) {
    this._interface = _interface;
  }


  public AccessPoint routingProtocols(List<RoutingProtocol> routingProtocols) {
    
    this.routingProtocols = routingProtocols;
    return this;
  }

  public AccessPoint addRoutingProtocolsItem(RoutingProtocol routingProtocolsItem) {
    if (this.routingProtocols == null) {
      this.routingProtocols = new ArrayList<>();
    }
    this.routingProtocols.add(routingProtocolsItem);
    return this;
  }

   /**
   * Access point routing protocols configuration
   * @return routingProtocols
  **/
  @javax.annotation.Nullable

  public List<RoutingProtocol> getRoutingProtocols() {
    return routingProtocols;
  }


  public void setRoutingProtocols(List<RoutingProtocol> routingProtocols) {
    this.routingProtocols = routingProtocols;
  }


  public AccessPoint network(SimplifiedNetwork network) {
    
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @javax.annotation.Nullable

  public SimplifiedNetwork getNetwork() {
    return network;
  }


  public void setNetwork(SimplifiedNetwork network) {
    this.network = network;
  }


  public AccessPoint port(SimplifiedPort port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nullable

  public SimplifiedPort getPort() {
    return port;
  }


  public void setPort(SimplifiedPort port) {
    this.port = port;
  }


  public AccessPoint additionalInfo(Object additionalInfo) {
    
    this.additionalInfo = additionalInfo;
    return this;
  }

   /**
   * Additional information
   * @return additionalInfo
  **/
  @javax.annotation.Nullable

  public Object getAdditionalInfo() {
    return additionalInfo;
  }


  public void setAdditionalInfo(Object additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  public AccessPoint location(SimplifiedLocation location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable

  public SimplifiedLocation getLocation() {
    return location;
  }


  public void setLocation(SimplifiedLocation location) {
    this.location = location;
  }


  public AccessPoint account(SimplifiedAccount account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nullable

  public SimplifiedAccount getAccount() {
    return account;
  }


  public void setAccount(SimplifiedAccount account) {
    this.account = account;
  }


  public AccessPoint gateway(VirtualGateway gateway) {
    
    this.gateway = gateway;
    return this;
  }

   /**
   * Get gateway
   * @return gateway
  **/
  @javax.annotation.Nullable

  public VirtualGateway getGateway() {
    return gateway;
  }


  public void setGateway(VirtualGateway gateway) {
    this.gateway = gateway;
  }


  public AccessPoint peeringType(PeeringType peeringType) {
    
    this.peeringType = peeringType;
    return this;
  }

   /**
   * Get peeringType
   * @return peeringType
  **/
  @javax.annotation.Nullable

  public PeeringType getPeeringType() {
    return peeringType;
  }


  public void setPeeringType(PeeringType peeringType) {
    this.peeringType = peeringType;
  }


  public AccessPoint linkProtocol(SimplifiedLinkProtocol linkProtocol) {
    
    this.linkProtocol = linkProtocol;
    return this;
  }

   /**
   * Get linkProtocol
   * @return linkProtocol
  **/
  @javax.annotation.Nullable

  public SimplifiedLinkProtocol getLinkProtocol() {
    return linkProtocol;
  }


  public void setLinkProtocol(SimplifiedLinkProtocol linkProtocol) {
    this.linkProtocol = linkProtocol;
  }


  public AccessPoint sellerRegion(String sellerRegion) {
    
    this.sellerRegion = sellerRegion;
    return this;
  }

   /**
   * Access point seller region
   * @return sellerRegion
  **/
  @javax.annotation.Nullable

  public String getSellerRegion() {
    return sellerRegion;
  }


  public void setSellerRegion(String sellerRegion) {
    this.sellerRegion = sellerRegion;
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
   * @return the AccessPoint instance itself
   */
  public AccessPoint putAdditionalProperty(String key, Object value) {
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
    AccessPoint accessPoint = (AccessPoint) o;
    return Objects.equals(this.providerConnectionId, accessPoint.providerConnectionId) &&
        Objects.equals(this.profile, accessPoint.profile) &&
        Objects.equals(this.virtualDevice, accessPoint.virtualDevice) &&
        Objects.equals(this.authenticationKey, accessPoint.authenticationKey) &&
        Objects.equals(this.type, accessPoint.type) &&
        Objects.equals(this._interface, accessPoint._interface) &&
        Objects.equals(this.routingProtocols, accessPoint.routingProtocols) &&
        Objects.equals(this.network, accessPoint.network) &&
        Objects.equals(this.port, accessPoint.port) &&
        Objects.equals(this.additionalInfo, accessPoint.additionalInfo) &&
        Objects.equals(this.location, accessPoint.location) &&
        Objects.equals(this.account, accessPoint.account) &&
        Objects.equals(this.gateway, accessPoint.gateway) &&
        Objects.equals(this.peeringType, accessPoint.peeringType) &&
        Objects.equals(this.linkProtocol, accessPoint.linkProtocol) &&
        Objects.equals(this.sellerRegion, accessPoint.sellerRegion)&&
        Objects.equals(this.additionalProperties, accessPoint.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerConnectionId, profile, virtualDevice, authenticationKey, type, _interface, routingProtocols, network, port, additionalInfo, location, account, gateway, peeringType, linkProtocol, sellerRegion, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessPoint {\n");
    sb.append("    providerConnectionId: ").append(toIndentedString(providerConnectionId)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    virtualDevice: ").append(toIndentedString(virtualDevice)).append("\n");
    sb.append("    authenticationKey: ").append(toIndentedString(authenticationKey)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    _interface: ").append(toIndentedString(_interface)).append("\n");
    sb.append("    routingProtocols: ").append(toIndentedString(routingProtocols)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    peeringType: ").append(toIndentedString(peeringType)).append("\n");
    sb.append("    linkProtocol: ").append(toIndentedString(linkProtocol)).append("\n");
    sb.append("    sellerRegion: ").append(toIndentedString(sellerRegion)).append("\n");
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
    openapiFields.add("providerConnectionId");
    openapiFields.add("profile");
    openapiFields.add("virtualDevice");
    openapiFields.add("authenticationKey");
    openapiFields.add("type");
    openapiFields.add("interface");
    openapiFields.add("routingProtocols");
    openapiFields.add("network");
    openapiFields.add("port");
    openapiFields.add("additionalInfo");
    openapiFields.add("location");
    openapiFields.add("account");
    openapiFields.add("gateway");
    openapiFields.add("peeringType");
    openapiFields.add("linkProtocol");
    openapiFields.add("sellerRegion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccessPoint
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AccessPoint.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessPoint is not found in the empty JSON string", AccessPoint.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("providerConnectionId") != null && !jsonObj.get("providerConnectionId").isJsonNull()) && !jsonObj.get("providerConnectionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `providerConnectionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("providerConnectionId").toString()));
      }
      // validate the optional field `profile`
      if (jsonObj.get("profile") != null && !jsonObj.get("profile").isJsonNull()) {
        SimplifiedServiceProfile.validateJsonObject(jsonObj.getAsJsonObject("profile"));
      }
      // validate the optional field `virtualDevice`
      if (jsonObj.get("virtualDevice") != null && !jsonObj.get("virtualDevice").isJsonNull()) {
        VirtualDevice.validateJsonObject(jsonObj.getAsJsonObject("virtualDevice"));
      }
      if ((jsonObj.get("authenticationKey") != null && !jsonObj.get("authenticationKey").isJsonNull()) && !jsonObj.get("authenticationKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authenticationKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authenticationKey").toString()));
      }
      // validate the optional field `interface`
      if (jsonObj.get("interface") != null && !jsonObj.get("interface").isJsonNull()) {
        ModelInterface.validateJsonObject(jsonObj.getAsJsonObject("interface"));
      }
      if (jsonObj.get("routingProtocols") != null && !jsonObj.get("routingProtocols").isJsonNull()) {
        JsonArray jsonArrayroutingProtocols = jsonObj.getAsJsonArray("routingProtocols");
        if (jsonArrayroutingProtocols != null) {
          // ensure the json data is an array
          if (!jsonObj.get("routingProtocols").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `routingProtocols` to be an array in the JSON string but got `%s`", jsonObj.get("routingProtocols").toString()));
          }

          // validate the optional field `routingProtocols` (array)
          for (int i = 0; i < jsonArrayroutingProtocols.size(); i++) {
            RoutingProtocol.validateJsonObject(jsonArrayroutingProtocols.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `network`
      if (jsonObj.get("network") != null && !jsonObj.get("network").isJsonNull()) {
        SimplifiedNetwork.validateJsonObject(jsonObj.getAsJsonObject("network"));
      }
      // validate the optional field `port`
      if (jsonObj.get("port") != null && !jsonObj.get("port").isJsonNull()) {
        SimplifiedPort.validateJsonObject(jsonObj.getAsJsonObject("port"));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        SimplifiedLocation.validateJsonObject(jsonObj.getAsJsonObject("location"));
      }
      // validate the optional field `account`
      if (jsonObj.get("account") != null && !jsonObj.get("account").isJsonNull()) {
        SimplifiedAccount.validateJsonObject(jsonObj.getAsJsonObject("account"));
      }
      // validate the optional field `gateway`
      if (jsonObj.get("gateway") != null && !jsonObj.get("gateway").isJsonNull()) {
        VirtualGateway.validateJsonObject(jsonObj.getAsJsonObject("gateway"));
      }
      // validate the optional field `linkProtocol`
      if (jsonObj.get("linkProtocol") != null && !jsonObj.get("linkProtocol").isJsonNull()) {
        SimplifiedLinkProtocol.validateJsonObject(jsonObj.getAsJsonObject("linkProtocol"));
      }
      if ((jsonObj.get("sellerRegion") != null && !jsonObj.get("sellerRegion").isJsonNull()) && !jsonObj.get("sellerRegion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sellerRegion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sellerRegion").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessPoint.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessPoint' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessPoint> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessPoint.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessPoint>() {
           @Override
           public void write(JsonWriter out, AccessPoint value) throws IOException {
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
           public AccessPoint read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AccessPoint instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AccessPoint given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessPoint
  * @throws IOException if the JSON string is invalid with respect to AccessPoint
  */
  public static AccessPoint fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessPoint.class);
  }

 /**
  * Convert an instance of AccessPoint to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
