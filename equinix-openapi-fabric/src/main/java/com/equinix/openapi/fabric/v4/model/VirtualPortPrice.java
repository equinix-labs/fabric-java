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
import com.equinix.openapi.fabric.v4.model.ConnectivitySource;
import com.equinix.openapi.fabric.v4.model.LinkAggregationGroup;
import com.equinix.openapi.fabric.v4.model.VirtualPortConfiguration;
import com.equinix.openapi.fabric.v4.model.VirtualPortLocation;
import com.equinix.openapi.fabric.v4.model.VirtualPortRedundancy;
import com.equinix.openapi.fabric.v4.model.VirtualPortServiceType;
import com.equinix.openapi.fabric.v4.model.VirtualPortType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * Preferences and settings for a virtual port connected to an internet service provider (ISP) or other Equinix platform entity.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VirtualPortPrice {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private UUID uuid;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private VirtualPortType type;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private VirtualPortLocation location;

  public static final String SERIALIZED_NAME_LAG = "lag";
  @SerializedName(SERIALIZED_NAME_LAG)
  private LinkAggregationGroup lag;

  public static final String SERIALIZED_NAME_PHYSICAL_PORTS_QUANTITY = "physicalPortsQuantity";
  @SerializedName(SERIALIZED_NAME_PHYSICAL_PORTS_QUANTITY)
  private Integer physicalPortsQuantity = 1;

  public static final String SERIALIZED_NAME_BANDWIDTH = "bandwidth";
  @SerializedName(SERIALIZED_NAME_BANDWIDTH)
  private Integer bandwidth;

  public static final String SERIALIZED_NAME_REDUNDANCY = "redundancy";
  @SerializedName(SERIALIZED_NAME_REDUNDANCY)
  private VirtualPortRedundancy redundancy;

  public static final String SERIALIZED_NAME_CONNECTIVITY_SOURCE = "connectivitySource";
  @SerializedName(SERIALIZED_NAME_CONNECTIVITY_SOURCE)
  private ConnectivitySource connectivitySource;

  public static final String SERIALIZED_NAME_SERVICE_TYPE = "serviceType";
  @SerializedName(SERIALIZED_NAME_SERVICE_TYPE)
  private VirtualPortServiceType serviceType = VirtualPortServiceType.MSP;

  public static final String SERIALIZED_NAME_SETTINGS = "settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private VirtualPortConfiguration settings;

  public VirtualPortPrice() {
  }

  public VirtualPortPrice uuid(UUID uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Unique identifier assigned to the virtual port. Either the uuid or the remaining attributes must be supplied.
   * @return uuid
  **/
  @javax.annotation.Nullable

  public UUID getUuid() {
    return uuid;
  }


  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }


  public VirtualPortPrice type(VirtualPortType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable

  public VirtualPortType getType() {
    return type;
  }


  public void setType(VirtualPortType type) {
    this.type = type;
  }


  public VirtualPortPrice location(VirtualPortLocation location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable

  public VirtualPortLocation getLocation() {
    return location;
  }


  public void setLocation(VirtualPortLocation location) {
    this.location = location;
  }


  public VirtualPortPrice lag(LinkAggregationGroup lag) {
    
    this.lag = lag;
    return this;
  }

   /**
   * Get lag
   * @return lag
  **/
  @javax.annotation.Nullable

  public LinkAggregationGroup getLag() {
    return lag;
  }


  public void setLag(LinkAggregationGroup lag) {
    this.lag = lag;
  }


  public VirtualPortPrice physicalPortsQuantity(Integer physicalPortsQuantity) {
    
    this.physicalPortsQuantity = physicalPortsQuantity;
    return this;
  }

   /**
   * Number of physical ports requested. The defaults is 1.
   * @return physicalPortsQuantity
  **/
  @javax.annotation.Nullable

  public Integer getPhysicalPortsQuantity() {
    return physicalPortsQuantity;
  }


  public void setPhysicalPortsQuantity(Integer physicalPortsQuantity) {
    this.physicalPortsQuantity = physicalPortsQuantity;
  }


  public VirtualPortPrice bandwidth(Integer bandwidth) {
    
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Aggregated data transfer capacity,  expressed as follows &lt;br&gt; -&gt; Mbps, megabits (1 million bits) per second &lt;br&gt; -&gt; Gbps, gigabits (1 billion bits) per second &lt;br&gt; Bandwidth must be divisible by physicalPortsQuantity.
   * @return bandwidth
  **/
  @javax.annotation.Nullable

  public Integer getBandwidth() {
    return bandwidth;
  }


  public void setBandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
  }


  public VirtualPortPrice redundancy(VirtualPortRedundancy redundancy) {
    
    this.redundancy = redundancy;
    return this;
  }

   /**
   * Get redundancy
   * @return redundancy
  **/
  @javax.annotation.Nullable

  public VirtualPortRedundancy getRedundancy() {
    return redundancy;
  }


  public void setRedundancy(VirtualPortRedundancy redundancy) {
    this.redundancy = redundancy;
  }


  public VirtualPortPrice connectivitySource(ConnectivitySource connectivitySource) {
    
    this.connectivitySource = connectivitySource;
    return this;
  }

   /**
   * Get connectivitySource
   * @return connectivitySource
  **/
  @javax.annotation.Nullable

  public ConnectivitySource getConnectivitySource() {
    return connectivitySource;
  }


  public void setConnectivitySource(ConnectivitySource connectivitySource) {
    this.connectivitySource = connectivitySource;
  }


  public VirtualPortPrice serviceType(VirtualPortServiceType serviceType) {
    
    this.serviceType = serviceType;
    return this;
  }

   /**
   * Get serviceType
   * @return serviceType
  **/
  @javax.annotation.Nullable

  public VirtualPortServiceType getServiceType() {
    return serviceType;
  }


  public void setServiceType(VirtualPortServiceType serviceType) {
    this.serviceType = serviceType;
  }


  public VirtualPortPrice settings(VirtualPortConfiguration settings) {
    
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nullable

  public VirtualPortConfiguration getSettings() {
    return settings;
  }


  public void setSettings(VirtualPortConfiguration settings) {
    this.settings = settings;
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
   * @return the VirtualPortPrice instance itself
   */
  public VirtualPortPrice putAdditionalProperty(String key, Object value) {
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
    VirtualPortPrice virtualPortPrice = (VirtualPortPrice) o;
    return Objects.equals(this.uuid, virtualPortPrice.uuid) &&
        Objects.equals(this.type, virtualPortPrice.type) &&
        Objects.equals(this.location, virtualPortPrice.location) &&
        Objects.equals(this.lag, virtualPortPrice.lag) &&
        Objects.equals(this.physicalPortsQuantity, virtualPortPrice.physicalPortsQuantity) &&
        Objects.equals(this.bandwidth, virtualPortPrice.bandwidth) &&
        Objects.equals(this.redundancy, virtualPortPrice.redundancy) &&
        Objects.equals(this.connectivitySource, virtualPortPrice.connectivitySource) &&
        Objects.equals(this.serviceType, virtualPortPrice.serviceType) &&
        Objects.equals(this.settings, virtualPortPrice.settings)&&
        Objects.equals(this.additionalProperties, virtualPortPrice.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, type, location, lag, physicalPortsQuantity, bandwidth, redundancy, connectivitySource, serviceType, settings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualPortPrice {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    lag: ").append(toIndentedString(lag)).append("\n");
    sb.append("    physicalPortsQuantity: ").append(toIndentedString(physicalPortsQuantity)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    redundancy: ").append(toIndentedString(redundancy)).append("\n");
    sb.append("    connectivitySource: ").append(toIndentedString(connectivitySource)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
    openapiFields.add("uuid");
    openapiFields.add("type");
    openapiFields.add("location");
    openapiFields.add("lag");
    openapiFields.add("physicalPortsQuantity");
    openapiFields.add("bandwidth");
    openapiFields.add("redundancy");
    openapiFields.add("connectivitySource");
    openapiFields.add("serviceType");
    openapiFields.add("settings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VirtualPortPrice
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VirtualPortPrice.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VirtualPortPrice is not found in the empty JSON string", VirtualPortPrice.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        VirtualPortLocation.validateJsonObject(jsonObj.getAsJsonObject("location"));
      }
      // validate the optional field `lag`
      if (jsonObj.get("lag") != null && !jsonObj.get("lag").isJsonNull()) {
        LinkAggregationGroup.validateJsonObject(jsonObj.getAsJsonObject("lag"));
      }
      // validate the optional field `redundancy`
      if (jsonObj.get("redundancy") != null && !jsonObj.get("redundancy").isJsonNull()) {
        VirtualPortRedundancy.validateJsonObject(jsonObj.getAsJsonObject("redundancy"));
      }
      // validate the optional field `connectivitySource`
      if (jsonObj.get("connectivitySource") != null && !jsonObj.get("connectivitySource").isJsonNull()) {
        ConnectivitySource.validateJsonObject(jsonObj.getAsJsonObject("connectivitySource"));
      }
      // validate the optional field `settings`
      if (jsonObj.get("settings") != null && !jsonObj.get("settings").isJsonNull()) {
        VirtualPortConfiguration.validateJsonObject(jsonObj.getAsJsonObject("settings"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VirtualPortPrice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VirtualPortPrice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VirtualPortPrice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VirtualPortPrice.class));

       return (TypeAdapter<T>) new TypeAdapter<VirtualPortPrice>() {
           @Override
           public void write(JsonWriter out, VirtualPortPrice value) throws IOException {
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
           public VirtualPortPrice read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VirtualPortPrice instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VirtualPortPrice given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VirtualPortPrice
  * @throws IOException if the JSON string is invalid with respect to VirtualPortPrice
  */
  public static VirtualPortPrice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VirtualPortPrice.class);
  }

 /**
  * Convert an instance of VirtualPortPrice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

