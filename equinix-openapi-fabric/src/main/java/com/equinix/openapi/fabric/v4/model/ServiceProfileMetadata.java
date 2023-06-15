/*
 * Equinix Fabric API v4
 * Equinix Fabric is an advanced software-defined interconnection solution that enables you to directly, securely and dynamically connect to distributed infrastructure and digital ecosystems on platform Equinix via a single port, Customers can use Fabric to connect to: </br> 1. Cloud Service Providers - Clouds, network and other service providers.  </br> 2. Enterprises - Other Equinix customers, vendors and partners.  </br> 3. Myself - Another customer instance deployed at Equinix. </br>
 *
 * The version of the OpenAPI document: 4.8
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
 * Metadata. Response attribute. Ignored on request payload.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceProfileMetadata {
  public static final String SERIALIZED_NAME_PROPS = "props";
  @SerializedName(SERIALIZED_NAME_PROPS)
  private String props;

  public static final String SERIALIZED_NAME_REG_EX = "regEx";
  @SerializedName(SERIALIZED_NAME_REG_EX)
  private String regEx;

  public static final String SERIALIZED_NAME_REG_EX_MSG = "regExMsg";
  @SerializedName(SERIALIZED_NAME_REG_EX_MSG)
  private String regExMsg;

  public static final String SERIALIZED_NAME_VLAN_RANGE_MAX_VALUE = "vlanRangeMaxValue";
  @SerializedName(SERIALIZED_NAME_VLAN_RANGE_MAX_VALUE)
  private Integer vlanRangeMaxValue;

  public static final String SERIALIZED_NAME_VLAN_RANGE_MIN_VALUE = "vlanRangeMinValue";
  @SerializedName(SERIALIZED_NAME_VLAN_RANGE_MIN_VALUE)
  private Integer vlanRangeMinValue;

  public static final String SERIALIZED_NAME_MAX_QINQ = "maxQinq";
  @SerializedName(SERIALIZED_NAME_MAX_QINQ)
  private String maxQinq;

  public static final String SERIALIZED_NAME_MAX_DOT1Q = "maxDot1q";
  @SerializedName(SERIALIZED_NAME_MAX_DOT1Q)
  private Integer maxDot1q;

  public static final String SERIALIZED_NAME_VARIABLE_BILLING = "variableBilling";
  @SerializedName(SERIALIZED_NAME_VARIABLE_BILLING)
  private Boolean variableBilling;

  public static final String SERIALIZED_NAME_GLOBAL_ORGANIZATION = "globalOrganization";
  @SerializedName(SERIALIZED_NAME_GLOBAL_ORGANIZATION)
  private String globalOrganization;

  public static final String SERIALIZED_NAME_LIMIT_AUTH_KEY_CONN = "limitAuthKeyConn";
  @SerializedName(SERIALIZED_NAME_LIMIT_AUTH_KEY_CONN)
  private Boolean limitAuthKeyConn;

  public static final String SERIALIZED_NAME_ALLOW_SECONDARY_LOCATION = "allowSecondaryLocation";
  @SerializedName(SERIALIZED_NAME_ALLOW_SECONDARY_LOCATION)
  private Boolean allowSecondaryLocation;

  public static final String SERIALIZED_NAME_REDUNDANT_PROFILE_ID = "redundantProfileId";
  @SerializedName(SERIALIZED_NAME_REDUNDANT_PROFILE_ID)
  private String redundantProfileId;

  public static final String SERIALIZED_NAME_ALLOW_VC_MIGRATION = "allowVcMigration";
  @SerializedName(SERIALIZED_NAME_ALLOW_VC_MIGRATION)
  private Boolean allowVcMigration;

  public static final String SERIALIZED_NAME_CONNECTION_EDITABLE = "connectionEditable";
  @SerializedName(SERIALIZED_NAME_CONNECTION_EDITABLE)
  private Boolean connectionEditable;

  public static final String SERIALIZED_NAME_RELEASE_VLAN = "releaseVlan";
  @SerializedName(SERIALIZED_NAME_RELEASE_VLAN)
  private Boolean releaseVlan;

  public static final String SERIALIZED_NAME_MAX_CONNECTIONS_ON_PORT = "maxConnectionsOnPort";
  @SerializedName(SERIALIZED_NAME_MAX_CONNECTIONS_ON_PORT)
  private Integer maxConnectionsOnPort;

  public static final String SERIALIZED_NAME_PORT_ASSIGNMENT_STRATEGY = "portAssignmentStrategy";
  @SerializedName(SERIALIZED_NAME_PORT_ASSIGNMENT_STRATEGY)
  private String portAssignmentStrategy;

  public static final String SERIALIZED_NAME_EQX_MANAGED_PORT = "eqxManagedPort";
  @SerializedName(SERIALIZED_NAME_EQX_MANAGED_PORT)
  private Boolean eqxManagedPort;

  public static final String SERIALIZED_NAME_CONNECTION_NAME_EDITABLE = "connectionNameEditable";
  @SerializedName(SERIALIZED_NAME_CONNECTION_NAME_EDITABLE)
  private Boolean connectionNameEditable;

  public ServiceProfileMetadata() {
  }

  public ServiceProfileMetadata props(String props) {
    
    this.props = props;
    return this;
  }

   /**
   * Get props
   * @return props
  **/
  @javax.annotation.Nullable

  public String getProps() {
    return props;
  }


  public void setProps(String props) {
    this.props = props;
  }


  public ServiceProfileMetadata regEx(String regEx) {
    
    this.regEx = regEx;
    return this;
  }

   /**
   * Get regEx
   * @return regEx
  **/
  @javax.annotation.Nullable

  public String getRegEx() {
    return regEx;
  }


  public void setRegEx(String regEx) {
    this.regEx = regEx;
  }


  public ServiceProfileMetadata regExMsg(String regExMsg) {
    
    this.regExMsg = regExMsg;
    return this;
  }

   /**
   * Get regExMsg
   * @return regExMsg
  **/
  @javax.annotation.Nullable

  public String getRegExMsg() {
    return regExMsg;
  }


  public void setRegExMsg(String regExMsg) {
    this.regExMsg = regExMsg;
  }


  public ServiceProfileMetadata vlanRangeMaxValue(Integer vlanRangeMaxValue) {
    
    this.vlanRangeMaxValue = vlanRangeMaxValue;
    return this;
  }

   /**
   * Get vlanRangeMaxValue
   * @return vlanRangeMaxValue
  **/
  @javax.annotation.Nullable

  public Integer getVlanRangeMaxValue() {
    return vlanRangeMaxValue;
  }


  public void setVlanRangeMaxValue(Integer vlanRangeMaxValue) {
    this.vlanRangeMaxValue = vlanRangeMaxValue;
  }


  public ServiceProfileMetadata vlanRangeMinValue(Integer vlanRangeMinValue) {
    
    this.vlanRangeMinValue = vlanRangeMinValue;
    return this;
  }

   /**
   * Get vlanRangeMinValue
   * @return vlanRangeMinValue
  **/
  @javax.annotation.Nullable

  public Integer getVlanRangeMinValue() {
    return vlanRangeMinValue;
  }


  public void setVlanRangeMinValue(Integer vlanRangeMinValue) {
    this.vlanRangeMinValue = vlanRangeMinValue;
  }


  public ServiceProfileMetadata maxQinq(String maxQinq) {
    
    this.maxQinq = maxQinq;
    return this;
  }

   /**
   * Get maxQinq
   * @return maxQinq
  **/
  @javax.annotation.Nullable

  public String getMaxQinq() {
    return maxQinq;
  }


  public void setMaxQinq(String maxQinq) {
    this.maxQinq = maxQinq;
  }


  public ServiceProfileMetadata maxDot1q(Integer maxDot1q) {
    
    this.maxDot1q = maxDot1q;
    return this;
  }

   /**
   * Get maxDot1q
   * @return maxDot1q
  **/
  @javax.annotation.Nullable

  public Integer getMaxDot1q() {
    return maxDot1q;
  }


  public void setMaxDot1q(Integer maxDot1q) {
    this.maxDot1q = maxDot1q;
  }


  public ServiceProfileMetadata variableBilling(Boolean variableBilling) {
    
    this.variableBilling = variableBilling;
    return this;
  }

   /**
   * Get variableBilling
   * @return variableBilling
  **/
  @javax.annotation.Nullable

  public Boolean getVariableBilling() {
    return variableBilling;
  }


  public void setVariableBilling(Boolean variableBilling) {
    this.variableBilling = variableBilling;
  }


  public ServiceProfileMetadata globalOrganization(String globalOrganization) {
    
    this.globalOrganization = globalOrganization;
    return this;
  }

   /**
   * Get globalOrganization
   * @return globalOrganization
  **/
  @javax.annotation.Nullable

  public String getGlobalOrganization() {
    return globalOrganization;
  }


  public void setGlobalOrganization(String globalOrganization) {
    this.globalOrganization = globalOrganization;
  }


  public ServiceProfileMetadata limitAuthKeyConn(Boolean limitAuthKeyConn) {
    
    this.limitAuthKeyConn = limitAuthKeyConn;
    return this;
  }

   /**
   * Get limitAuthKeyConn
   * @return limitAuthKeyConn
  **/
  @javax.annotation.Nullable

  public Boolean getLimitAuthKeyConn() {
    return limitAuthKeyConn;
  }


  public void setLimitAuthKeyConn(Boolean limitAuthKeyConn) {
    this.limitAuthKeyConn = limitAuthKeyConn;
  }


  public ServiceProfileMetadata allowSecondaryLocation(Boolean allowSecondaryLocation) {
    
    this.allowSecondaryLocation = allowSecondaryLocation;
    return this;
  }

   /**
   * Get allowSecondaryLocation
   * @return allowSecondaryLocation
  **/
  @javax.annotation.Nullable

  public Boolean getAllowSecondaryLocation() {
    return allowSecondaryLocation;
  }


  public void setAllowSecondaryLocation(Boolean allowSecondaryLocation) {
    this.allowSecondaryLocation = allowSecondaryLocation;
  }


  public ServiceProfileMetadata redundantProfileId(String redundantProfileId) {
    
    this.redundantProfileId = redundantProfileId;
    return this;
  }

   /**
   * Get redundantProfileId
   * @return redundantProfileId
  **/
  @javax.annotation.Nullable

  public String getRedundantProfileId() {
    return redundantProfileId;
  }


  public void setRedundantProfileId(String redundantProfileId) {
    this.redundantProfileId = redundantProfileId;
  }


  public ServiceProfileMetadata allowVcMigration(Boolean allowVcMigration) {
    
    this.allowVcMigration = allowVcMigration;
    return this;
  }

   /**
   * Get allowVcMigration
   * @return allowVcMigration
  **/
  @javax.annotation.Nullable

  public Boolean getAllowVcMigration() {
    return allowVcMigration;
  }


  public void setAllowVcMigration(Boolean allowVcMigration) {
    this.allowVcMigration = allowVcMigration;
  }


  public ServiceProfileMetadata connectionEditable(Boolean connectionEditable) {
    
    this.connectionEditable = connectionEditable;
    return this;
  }

   /**
   * Get connectionEditable
   * @return connectionEditable
  **/
  @javax.annotation.Nullable

  public Boolean getConnectionEditable() {
    return connectionEditable;
  }


  public void setConnectionEditable(Boolean connectionEditable) {
    this.connectionEditable = connectionEditable;
  }


  public ServiceProfileMetadata releaseVlan(Boolean releaseVlan) {
    
    this.releaseVlan = releaseVlan;
    return this;
  }

   /**
   * Get releaseVlan
   * @return releaseVlan
  **/
  @javax.annotation.Nullable

  public Boolean getReleaseVlan() {
    return releaseVlan;
  }


  public void setReleaseVlan(Boolean releaseVlan) {
    this.releaseVlan = releaseVlan;
  }


  public ServiceProfileMetadata maxConnectionsOnPort(Integer maxConnectionsOnPort) {
    
    this.maxConnectionsOnPort = maxConnectionsOnPort;
    return this;
  }

   /**
   * Get maxConnectionsOnPort
   * @return maxConnectionsOnPort
  **/
  @javax.annotation.Nullable

  public Integer getMaxConnectionsOnPort() {
    return maxConnectionsOnPort;
  }


  public void setMaxConnectionsOnPort(Integer maxConnectionsOnPort) {
    this.maxConnectionsOnPort = maxConnectionsOnPort;
  }


  public ServiceProfileMetadata portAssignmentStrategy(String portAssignmentStrategy) {
    
    this.portAssignmentStrategy = portAssignmentStrategy;
    return this;
  }

   /**
   * Get portAssignmentStrategy
   * @return portAssignmentStrategy
  **/
  @javax.annotation.Nullable

  public String getPortAssignmentStrategy() {
    return portAssignmentStrategy;
  }


  public void setPortAssignmentStrategy(String portAssignmentStrategy) {
    this.portAssignmentStrategy = portAssignmentStrategy;
  }


  public ServiceProfileMetadata eqxManagedPort(Boolean eqxManagedPort) {
    
    this.eqxManagedPort = eqxManagedPort;
    return this;
  }

   /**
   * Get eqxManagedPort
   * @return eqxManagedPort
  **/
  @javax.annotation.Nullable

  public Boolean getEqxManagedPort() {
    return eqxManagedPort;
  }


  public void setEqxManagedPort(Boolean eqxManagedPort) {
    this.eqxManagedPort = eqxManagedPort;
  }


  public ServiceProfileMetadata connectionNameEditable(Boolean connectionNameEditable) {
    
    this.connectionNameEditable = connectionNameEditable;
    return this;
  }

   /**
   * Get connectionNameEditable
   * @return connectionNameEditable
  **/
  @javax.annotation.Nullable

  public Boolean getConnectionNameEditable() {
    return connectionNameEditable;
  }


  public void setConnectionNameEditable(Boolean connectionNameEditable) {
    this.connectionNameEditable = connectionNameEditable;
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
   * @return the ServiceProfileMetadata instance itself
   */
  public ServiceProfileMetadata putAdditionalProperty(String key, Object value) {
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
    ServiceProfileMetadata serviceProfileMetadata = (ServiceProfileMetadata) o;
    return Objects.equals(this.props, serviceProfileMetadata.props) &&
        Objects.equals(this.regEx, serviceProfileMetadata.regEx) &&
        Objects.equals(this.regExMsg, serviceProfileMetadata.regExMsg) &&
        Objects.equals(this.vlanRangeMaxValue, serviceProfileMetadata.vlanRangeMaxValue) &&
        Objects.equals(this.vlanRangeMinValue, serviceProfileMetadata.vlanRangeMinValue) &&
        Objects.equals(this.maxQinq, serviceProfileMetadata.maxQinq) &&
        Objects.equals(this.maxDot1q, serviceProfileMetadata.maxDot1q) &&
        Objects.equals(this.variableBilling, serviceProfileMetadata.variableBilling) &&
        Objects.equals(this.globalOrganization, serviceProfileMetadata.globalOrganization) &&
        Objects.equals(this.limitAuthKeyConn, serviceProfileMetadata.limitAuthKeyConn) &&
        Objects.equals(this.allowSecondaryLocation, serviceProfileMetadata.allowSecondaryLocation) &&
        Objects.equals(this.redundantProfileId, serviceProfileMetadata.redundantProfileId) &&
        Objects.equals(this.allowVcMigration, serviceProfileMetadata.allowVcMigration) &&
        Objects.equals(this.connectionEditable, serviceProfileMetadata.connectionEditable) &&
        Objects.equals(this.releaseVlan, serviceProfileMetadata.releaseVlan) &&
        Objects.equals(this.maxConnectionsOnPort, serviceProfileMetadata.maxConnectionsOnPort) &&
        Objects.equals(this.portAssignmentStrategy, serviceProfileMetadata.portAssignmentStrategy) &&
        Objects.equals(this.eqxManagedPort, serviceProfileMetadata.eqxManagedPort) &&
        Objects.equals(this.connectionNameEditable, serviceProfileMetadata.connectionNameEditable)&&
        Objects.equals(this.additionalProperties, serviceProfileMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(props, regEx, regExMsg, vlanRangeMaxValue, vlanRangeMinValue, maxQinq, maxDot1q, variableBilling, globalOrganization, limitAuthKeyConn, allowSecondaryLocation, redundantProfileId, allowVcMigration, connectionEditable, releaseVlan, maxConnectionsOnPort, portAssignmentStrategy, eqxManagedPort, connectionNameEditable, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceProfileMetadata {\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    regEx: ").append(toIndentedString(regEx)).append("\n");
    sb.append("    regExMsg: ").append(toIndentedString(regExMsg)).append("\n");
    sb.append("    vlanRangeMaxValue: ").append(toIndentedString(vlanRangeMaxValue)).append("\n");
    sb.append("    vlanRangeMinValue: ").append(toIndentedString(vlanRangeMinValue)).append("\n");
    sb.append("    maxQinq: ").append(toIndentedString(maxQinq)).append("\n");
    sb.append("    maxDot1q: ").append(toIndentedString(maxDot1q)).append("\n");
    sb.append("    variableBilling: ").append(toIndentedString(variableBilling)).append("\n");
    sb.append("    globalOrganization: ").append(toIndentedString(globalOrganization)).append("\n");
    sb.append("    limitAuthKeyConn: ").append(toIndentedString(limitAuthKeyConn)).append("\n");
    sb.append("    allowSecondaryLocation: ").append(toIndentedString(allowSecondaryLocation)).append("\n");
    sb.append("    redundantProfileId: ").append(toIndentedString(redundantProfileId)).append("\n");
    sb.append("    allowVcMigration: ").append(toIndentedString(allowVcMigration)).append("\n");
    sb.append("    connectionEditable: ").append(toIndentedString(connectionEditable)).append("\n");
    sb.append("    releaseVlan: ").append(toIndentedString(releaseVlan)).append("\n");
    sb.append("    maxConnectionsOnPort: ").append(toIndentedString(maxConnectionsOnPort)).append("\n");
    sb.append("    portAssignmentStrategy: ").append(toIndentedString(portAssignmentStrategy)).append("\n");
    sb.append("    eqxManagedPort: ").append(toIndentedString(eqxManagedPort)).append("\n");
    sb.append("    connectionNameEditable: ").append(toIndentedString(connectionNameEditable)).append("\n");
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
    openapiFields.add("props");
    openapiFields.add("regEx");
    openapiFields.add("regExMsg");
    openapiFields.add("vlanRangeMaxValue");
    openapiFields.add("vlanRangeMinValue");
    openapiFields.add("maxQinq");
    openapiFields.add("maxDot1q");
    openapiFields.add("variableBilling");
    openapiFields.add("globalOrganization");
    openapiFields.add("limitAuthKeyConn");
    openapiFields.add("allowSecondaryLocation");
    openapiFields.add("redundantProfileId");
    openapiFields.add("allowVcMigration");
    openapiFields.add("connectionEditable");
    openapiFields.add("releaseVlan");
    openapiFields.add("maxConnectionsOnPort");
    openapiFields.add("portAssignmentStrategy");
    openapiFields.add("eqxManagedPort");
    openapiFields.add("connectionNameEditable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ServiceProfileMetadata
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ServiceProfileMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ServiceProfileMetadata is not found in the empty JSON string", ServiceProfileMetadata.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("props") != null && !jsonObj.get("props").isJsonNull()) && !jsonObj.get("props").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `props` to be a primitive type in the JSON string but got `%s`", jsonObj.get("props").toString()));
      }
      if ((jsonObj.get("regEx") != null && !jsonObj.get("regEx").isJsonNull()) && !jsonObj.get("regEx").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `regEx` to be a primitive type in the JSON string but got `%s`", jsonObj.get("regEx").toString()));
      }
      if ((jsonObj.get("regExMsg") != null && !jsonObj.get("regExMsg").isJsonNull()) && !jsonObj.get("regExMsg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `regExMsg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("regExMsg").toString()));
      }
      if ((jsonObj.get("maxQinq") != null && !jsonObj.get("maxQinq").isJsonNull()) && !jsonObj.get("maxQinq").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxQinq` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxQinq").toString()));
      }
      if ((jsonObj.get("globalOrganization") != null && !jsonObj.get("globalOrganization").isJsonNull()) && !jsonObj.get("globalOrganization").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `globalOrganization` to be a primitive type in the JSON string but got `%s`", jsonObj.get("globalOrganization").toString()));
      }
      if ((jsonObj.get("redundantProfileId") != null && !jsonObj.get("redundantProfileId").isJsonNull()) && !jsonObj.get("redundantProfileId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redundantProfileId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redundantProfileId").toString()));
      }
      if ((jsonObj.get("portAssignmentStrategy") != null && !jsonObj.get("portAssignmentStrategy").isJsonNull()) && !jsonObj.get("portAssignmentStrategy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `portAssignmentStrategy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("portAssignmentStrategy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServiceProfileMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServiceProfileMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServiceProfileMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServiceProfileMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<ServiceProfileMetadata>() {
           @Override
           public void write(JsonWriter out, ServiceProfileMetadata value) throws IOException {
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
           public ServiceProfileMetadata read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ServiceProfileMetadata instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ServiceProfileMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServiceProfileMetadata
  * @throws IOException if the JSON string is invalid with respect to ServiceProfileMetadata
  */
  public static ServiceProfileMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServiceProfileMetadata.class);
  }

 /**
  * Convert an instance of ServiceProfileMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

