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
 * Port physical connection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PortTether {
  public static final String SERIALIZED_NAME_CROSS_CONNECT_ID = "crossConnectId";
  @SerializedName(SERIALIZED_NAME_CROSS_CONNECT_ID)
  private String crossConnectId;

  public static final String SERIALIZED_NAME_CABINET_NUMBER = "cabinetNumber";
  @SerializedName(SERIALIZED_NAME_CABINET_NUMBER)
  private String cabinetNumber;

  public static final String SERIALIZED_NAME_SYSTEM_NAME = "systemName";
  @SerializedName(SERIALIZED_NAME_SYSTEM_NAME)
  private String systemName;

  public static final String SERIALIZED_NAME_PATCH_PANEL = "patchPanel";
  @SerializedName(SERIALIZED_NAME_PATCH_PANEL)
  private String patchPanel;

  public static final String SERIALIZED_NAME_PATCH_PANEL_PORT_A = "patchPanelPortA";
  @SerializedName(SERIALIZED_NAME_PATCH_PANEL_PORT_A)
  private String patchPanelPortA;

  public static final String SERIALIZED_NAME_PATCH_PANEL_PORT_B = "patchPanelPortB";
  @SerializedName(SERIALIZED_NAME_PATCH_PANEL_PORT_B)
  private String patchPanelPortB;

  public static final String SERIALIZED_NAME_IBX = "ibx";
  @SerializedName(SERIALIZED_NAME_IBX)
  private String ibx;

  public PortTether() {
  }

  public PortTether crossConnectId(String crossConnectId) {
    
    this.crossConnectId = crossConnectId;
    return this;
  }

   /**
   * Port cross connect identifier
   * @return crossConnectId
  **/
  @javax.annotation.Nullable

  public String getCrossConnectId() {
    return crossConnectId;
  }


  public void setCrossConnectId(String crossConnectId) {
    this.crossConnectId = crossConnectId;
  }


  public PortTether cabinetNumber(String cabinetNumber) {
    
    this.cabinetNumber = cabinetNumber;
    return this;
  }

   /**
   * Port cabinet number
   * @return cabinetNumber
  **/
  @javax.annotation.Nullable

  public String getCabinetNumber() {
    return cabinetNumber;
  }


  public void setCabinetNumber(String cabinetNumber) {
    this.cabinetNumber = cabinetNumber;
  }


  public PortTether systemName(String systemName) {
    
    this.systemName = systemName;
    return this;
  }

   /**
   * Port system name
   * @return systemName
  **/
  @javax.annotation.Nullable

  public String getSystemName() {
    return systemName;
  }


  public void setSystemName(String systemName) {
    this.systemName = systemName;
  }


  public PortTether patchPanel(String patchPanel) {
    
    this.patchPanel = patchPanel;
    return this;
  }

   /**
   * Port patch panel
   * @return patchPanel
  **/
  @javax.annotation.Nullable

  public String getPatchPanel() {
    return patchPanel;
  }


  public void setPatchPanel(String patchPanel) {
    this.patchPanel = patchPanel;
  }


  public PortTether patchPanelPortA(String patchPanelPortA) {
    
    this.patchPanelPortA = patchPanelPortA;
    return this;
  }

   /**
   * Port patch panel port A
   * @return patchPanelPortA
  **/
  @javax.annotation.Nullable

  public String getPatchPanelPortA() {
    return patchPanelPortA;
  }


  public void setPatchPanelPortA(String patchPanelPortA) {
    this.patchPanelPortA = patchPanelPortA;
  }


  public PortTether patchPanelPortB(String patchPanelPortB) {
    
    this.patchPanelPortB = patchPanelPortB;
    return this;
  }

   /**
   * Port patch panel port B
   * @return patchPanelPortB
  **/
  @javax.annotation.Nullable

  public String getPatchPanelPortB() {
    return patchPanelPortB;
  }


  public void setPatchPanelPortB(String patchPanelPortB) {
    this.patchPanelPortB = patchPanelPortB;
  }


  public PortTether ibx(String ibx) {
    
    this.ibx = ibx;
    return this;
  }

   /**
   * z-side/Equinix IBX
   * @return ibx
  **/
  @javax.annotation.Nullable

  public String getIbx() {
    return ibx;
  }


  public void setIbx(String ibx) {
    this.ibx = ibx;
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
   * @return the PortTether instance itself
   */
  public PortTether putAdditionalProperty(String key, Object value) {
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
    PortTether portTether = (PortTether) o;
    return Objects.equals(this.crossConnectId, portTether.crossConnectId) &&
        Objects.equals(this.cabinetNumber, portTether.cabinetNumber) &&
        Objects.equals(this.systemName, portTether.systemName) &&
        Objects.equals(this.patchPanel, portTether.patchPanel) &&
        Objects.equals(this.patchPanelPortA, portTether.patchPanelPortA) &&
        Objects.equals(this.patchPanelPortB, portTether.patchPanelPortB) &&
        Objects.equals(this.ibx, portTether.ibx)&&
        Objects.equals(this.additionalProperties, portTether.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crossConnectId, cabinetNumber, systemName, patchPanel, patchPanelPortA, patchPanelPortB, ibx, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortTether {\n");
    sb.append("    crossConnectId: ").append(toIndentedString(crossConnectId)).append("\n");
    sb.append("    cabinetNumber: ").append(toIndentedString(cabinetNumber)).append("\n");
    sb.append("    systemName: ").append(toIndentedString(systemName)).append("\n");
    sb.append("    patchPanel: ").append(toIndentedString(patchPanel)).append("\n");
    sb.append("    patchPanelPortA: ").append(toIndentedString(patchPanelPortA)).append("\n");
    sb.append("    patchPanelPortB: ").append(toIndentedString(patchPanelPortB)).append("\n");
    sb.append("    ibx: ").append(toIndentedString(ibx)).append("\n");
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
    openapiFields.add("crossConnectId");
    openapiFields.add("cabinetNumber");
    openapiFields.add("systemName");
    openapiFields.add("patchPanel");
    openapiFields.add("patchPanelPortA");
    openapiFields.add("patchPanelPortB");
    openapiFields.add("ibx");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PortTether
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PortTether.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PortTether is not found in the empty JSON string", PortTether.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("crossConnectId") != null && !jsonObj.get("crossConnectId").isJsonNull()) && !jsonObj.get("crossConnectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `crossConnectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("crossConnectId").toString()));
      }
      if ((jsonObj.get("cabinetNumber") != null && !jsonObj.get("cabinetNumber").isJsonNull()) && !jsonObj.get("cabinetNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cabinetNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cabinetNumber").toString()));
      }
      if ((jsonObj.get("systemName") != null && !jsonObj.get("systemName").isJsonNull()) && !jsonObj.get("systemName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `systemName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("systemName").toString()));
      }
      if ((jsonObj.get("patchPanel") != null && !jsonObj.get("patchPanel").isJsonNull()) && !jsonObj.get("patchPanel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `patchPanel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("patchPanel").toString()));
      }
      if ((jsonObj.get("patchPanelPortA") != null && !jsonObj.get("patchPanelPortA").isJsonNull()) && !jsonObj.get("patchPanelPortA").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `patchPanelPortA` to be a primitive type in the JSON string but got `%s`", jsonObj.get("patchPanelPortA").toString()));
      }
      if ((jsonObj.get("patchPanelPortB") != null && !jsonObj.get("patchPanelPortB").isJsonNull()) && !jsonObj.get("patchPanelPortB").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `patchPanelPortB` to be a primitive type in the JSON string but got `%s`", jsonObj.get("patchPanelPortB").toString()));
      }
      if ((jsonObj.get("ibx") != null && !jsonObj.get("ibx").isJsonNull()) && !jsonObj.get("ibx").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ibx` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ibx").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PortTether.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PortTether' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PortTether> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PortTether.class));

       return (TypeAdapter<T>) new TypeAdapter<PortTether>() {
           @Override
           public void write(JsonWriter out, PortTether value) throws IOException {
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
           public PortTether read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PortTether instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PortTether given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PortTether
  * @throws IOException if the JSON string is invalid with respect to PortTether
  */
  public static PortTether fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PortTether.class);
  }

 /**
  * Convert an instance of PortTether to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

