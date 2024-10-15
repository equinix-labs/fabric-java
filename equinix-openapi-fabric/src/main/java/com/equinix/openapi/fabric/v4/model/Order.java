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
 * Order
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Order {
  public static final String SERIALIZED_NAME_PURCHASE_ORDER_NUMBER = "purchaseOrderNumber";
  @SerializedName(SERIALIZED_NAME_PURCHASE_ORDER_NUMBER)
  private String purchaseOrderNumber;

  public static final String SERIALIZED_NAME_CUSTOMER_REFERENCE_NUMBER = "customerReferenceNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_REFERENCE_NUMBER)
  private String customerReferenceNumber;

  public static final String SERIALIZED_NAME_BILLING_TIER = "billingTier";
  @SerializedName(SERIALIZED_NAME_BILLING_TIER)
  private String billingTier;

  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private String orderNumber;

  public Order() {
  }

  public Order purchaseOrderNumber(String purchaseOrderNumber) {
    
    this.purchaseOrderNumber = purchaseOrderNumber;
    return this;
  }

   /**
   * Purchase order number
   * @return purchaseOrderNumber
  **/
  @javax.annotation.Nullable

  public String getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }


  public void setPurchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }


  public Order customerReferenceNumber(String customerReferenceNumber) {
    
    this.customerReferenceNumber = customerReferenceNumber;
    return this;
  }

   /**
   * Customer reference number
   * @return customerReferenceNumber
  **/
  @javax.annotation.Nullable

  public String getCustomerReferenceNumber() {
    return customerReferenceNumber;
  }


  public void setCustomerReferenceNumber(String customerReferenceNumber) {
    this.customerReferenceNumber = customerReferenceNumber;
  }


  public Order billingTier(String billingTier) {
    
    this.billingTier = billingTier;
    return this;
  }

   /**
   * Billing tier for connection bandwidth
   * @return billingTier
  **/
  @javax.annotation.Nullable

  public String getBillingTier() {
    return billingTier;
  }


  public void setBillingTier(String billingTier) {
    this.billingTier = billingTier;
  }


  public Order orderId(String orderId) {
    
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


  public Order orderNumber(String orderNumber) {
    
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
   * @return the Order instance itself
   */
  public Order putAdditionalProperty(String key, Object value) {
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
    Order order = (Order) o;
    return Objects.equals(this.purchaseOrderNumber, order.purchaseOrderNumber) &&
        Objects.equals(this.customerReferenceNumber, order.customerReferenceNumber) &&
        Objects.equals(this.billingTier, order.billingTier) &&
        Objects.equals(this.orderId, order.orderId) &&
        Objects.equals(this.orderNumber, order.orderNumber)&&
        Objects.equals(this.additionalProperties, order.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purchaseOrderNumber, customerReferenceNumber, billingTier, orderId, orderNumber, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    sb.append("    purchaseOrderNumber: ").append(toIndentedString(purchaseOrderNumber)).append("\n");
    sb.append("    customerReferenceNumber: ").append(toIndentedString(customerReferenceNumber)).append("\n");
    sb.append("    billingTier: ").append(toIndentedString(billingTier)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
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
    openapiFields.add("purchaseOrderNumber");
    openapiFields.add("customerReferenceNumber");
    openapiFields.add("billingTier");
    openapiFields.add("orderId");
    openapiFields.add("orderNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Order
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Order.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Order is not found in the empty JSON string", Order.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("purchaseOrderNumber") != null && !jsonObj.get("purchaseOrderNumber").isJsonNull()) && !jsonObj.get("purchaseOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `purchaseOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("purchaseOrderNumber").toString()));
      }
      if ((jsonObj.get("customerReferenceNumber") != null && !jsonObj.get("customerReferenceNumber").isJsonNull()) && !jsonObj.get("customerReferenceNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerReferenceNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerReferenceNumber").toString()));
      }
      if ((jsonObj.get("billingTier") != null && !jsonObj.get("billingTier").isJsonNull()) && !jsonObj.get("billingTier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billingTier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billingTier").toString()));
      }
      if ((jsonObj.get("orderId") != null && !jsonObj.get("orderId").isJsonNull()) && !jsonObj.get("orderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderId").toString()));
      }
      if ((jsonObj.get("orderNumber") != null && !jsonObj.get("orderNumber").isJsonNull()) && !jsonObj.get("orderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Order.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Order' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Order> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Order.class));

       return (TypeAdapter<T>) new TypeAdapter<Order>() {
           @Override
           public void write(JsonWriter out, Order value) throws IOException {
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
           public Order read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Order instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Order given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Order
  * @throws IOException if the JSON string is invalid with respect to Order
  */
  public static Order fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Order.class);
  }

 /**
  * Convert an instance of Order to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

