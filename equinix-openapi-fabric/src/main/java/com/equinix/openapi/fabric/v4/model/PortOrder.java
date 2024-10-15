/*
 * Equinix Fabric API v4
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.equinix.openapi.fabric.v4.model;

import java.util.Objects;
import java.util.Arrays;
import com.equinix.openapi.fabric.v4.model.PortOrderPurchaseOrder;
import com.equinix.openapi.fabric.v4.model.PortOrderSignature;
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
 * PortOrder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PortOrder {
  public static final String SERIALIZED_NAME_PURCHASE_ORDER = "purchaseOrder";
  @SerializedName(SERIALIZED_NAME_PURCHASE_ORDER)
  private PortOrderPurchaseOrder purchaseOrder;

  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_CUSTOMER_REFERENCE_ID = "customerReferenceId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_REFERENCE_ID)
  private String customerReferenceId;

  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private String orderNumber;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private UUID uuid;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private PortOrderSignature signature;

  public PortOrder() {
  }

  public PortOrder purchaseOrder(PortOrderPurchaseOrder purchaseOrder) {
    
    this.purchaseOrder = purchaseOrder;
    return this;
  }

   /**
   * Get purchaseOrder
   * @return purchaseOrder
  **/
  @javax.annotation.Nullable

  public PortOrderPurchaseOrder getPurchaseOrder() {
    return purchaseOrder;
  }


  public void setPurchaseOrder(PortOrderPurchaseOrder purchaseOrder) {
    this.purchaseOrder = purchaseOrder;
  }


  public PortOrder orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Order Identification
   * @return orderId
  **/
  @javax.annotation.Nullable

  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public PortOrder customerReferenceId(String customerReferenceId) {
    
    this.customerReferenceId = customerReferenceId;
    return this;
  }

   /**
   * Customer order reference Id
   * @return customerReferenceId
  **/
  @javax.annotation.Nullable

  public String getCustomerReferenceId() {
    return customerReferenceId;
  }


  public void setCustomerReferenceId(String customerReferenceId) {
    this.customerReferenceId = customerReferenceId;
  }


  public PortOrder orderNumber(String orderNumber) {
    
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * Order Reference Number
   * @return orderNumber
  **/
  @javax.annotation.Nullable

  public String getOrderNumber() {
    return orderNumber;
  }


  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }


  public PortOrder uuid(UUID uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Equinix-assigned order identifier, this is a derived response atrribute
   * @return uuid
  **/
  @javax.annotation.Nullable

  public UUID getUuid() {
    return uuid;
  }


  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }


  public PortOrder signature(PortOrderSignature signature) {
    
    this.signature = signature;
    return this;
  }

   /**
   * Get signature
   * @return signature
  **/
  @javax.annotation.Nullable

  public PortOrderSignature getSignature() {
    return signature;
  }


  public void setSignature(PortOrderSignature signature) {
    this.signature = signature;
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
   * @return the PortOrder instance itself
   */
  public PortOrder putAdditionalProperty(String key, Object value) {
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
    PortOrder portOrder = (PortOrder) o;
    return Objects.equals(this.purchaseOrder, portOrder.purchaseOrder) &&
        Objects.equals(this.orderId, portOrder.orderId) &&
        Objects.equals(this.customerReferenceId, portOrder.customerReferenceId) &&
        Objects.equals(this.orderNumber, portOrder.orderNumber) &&
        Objects.equals(this.uuid, portOrder.uuid) &&
        Objects.equals(this.signature, portOrder.signature)&&
        Objects.equals(this.additionalProperties, portOrder.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purchaseOrder, orderId, customerReferenceId, orderNumber, uuid, signature, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortOrder {\n");
    sb.append("    purchaseOrder: ").append(toIndentedString(purchaseOrder)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    customerReferenceId: ").append(toIndentedString(customerReferenceId)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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
    openapiFields.add("purchaseOrder");
    openapiFields.add("orderId");
    openapiFields.add("customerReferenceId");
    openapiFields.add("orderNumber");
    openapiFields.add("uuid");
    openapiFields.add("signature");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PortOrder
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PortOrder.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PortOrder is not found in the empty JSON string", PortOrder.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `purchaseOrder`
      if (jsonObj.get("purchaseOrder") != null && !jsonObj.get("purchaseOrder").isJsonNull()) {
        PortOrderPurchaseOrder.validateJsonObject(jsonObj.getAsJsonObject("purchaseOrder"));
      }
      if ((jsonObj.get("orderId") != null && !jsonObj.get("orderId").isJsonNull()) && !jsonObj.get("orderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderId").toString()));
      }
      if ((jsonObj.get("customerReferenceId") != null && !jsonObj.get("customerReferenceId").isJsonNull()) && !jsonObj.get("customerReferenceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerReferenceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerReferenceId").toString()));
      }
      if ((jsonObj.get("orderNumber") != null && !jsonObj.get("orderNumber").isJsonNull()) && !jsonObj.get("orderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderNumber").toString()));
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      // validate the optional field `signature`
      if (jsonObj.get("signature") != null && !jsonObj.get("signature").isJsonNull()) {
        PortOrderSignature.validateJsonObject(jsonObj.getAsJsonObject("signature"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PortOrder.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PortOrder' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PortOrder> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PortOrder.class));

       return (TypeAdapter<T>) new TypeAdapter<PortOrder>() {
           @Override
           public void write(JsonWriter out, PortOrder value) throws IOException {
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
           public PortOrder read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PortOrder instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PortOrder given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PortOrder
  * @throws IOException if the JSON string is invalid with respect to PortOrder
  */
  public static PortOrder fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PortOrder.class);
  }

 /**
  * Convert an instance of PortOrder to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

