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
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.*;

/**
 * Account model, includes account number and flag to indicate if this account is reseller
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Account {
  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private Integer accountNumber;

  public static final String SERIALIZED_NAME_IS_RESELLER_ACCOUNT = "isResellerAccount";
  @SerializedName(SERIALIZED_NAME_IS_RESELLER_ACCOUNT)
  private Boolean isResellerAccount;

  public static final String SERIALIZED_NAME_ORG_ID = "orgId";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private String orgId;

  public static final String SERIALIZED_NAME_GLOBAL_ORG_ID = "globalOrgId";
  @SerializedName(SERIALIZED_NAME_GLOBAL_ORG_ID)
  private String globalOrgId;

  public Account() {
  }

  public Account accountNumber(Integer accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @javax.annotation.Nonnull

  public Integer getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(Integer accountNumber) {
    this.accountNumber = accountNumber;
  }


  public Account isResellerAccount(Boolean isResellerAccount) {
    
    this.isResellerAccount = isResellerAccount;
    return this;
  }

   /**
   * Get isResellerAccount
   * @return isResellerAccount
  **/
  @javax.annotation.Nullable

  public Boolean getIsResellerAccount() {
    return isResellerAccount;
  }


  public void setIsResellerAccount(Boolean isResellerAccount) {
    this.isResellerAccount = isResellerAccount;
  }


  public Account orgId(String orgId) {
    
    this.orgId = orgId;
    return this;
  }

   /**
   * Get orgId
   * @return orgId
  **/
  @javax.annotation.Nullable

  public String getOrgId() {
    return orgId;
  }


  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }


  public Account globalOrgId(String globalOrgId) {
    
    this.globalOrgId = globalOrgId;
    return this;
  }

   /**
   * Get globalOrgId
   * @return globalOrgId
  **/
  @javax.annotation.Nullable

  public String getGlobalOrgId() {
    return globalOrgId;
  }


  public void setGlobalOrgId(String globalOrgId) {
    this.globalOrgId = globalOrgId;
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
   * @return the Account instance itself
   */
  public Account putAdditionalProperty(String key, Object value) {
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
    Account account = (Account) o;
    return Objects.equals(this.accountNumber, account.accountNumber) &&
        Objects.equals(this.isResellerAccount, account.isResellerAccount) &&
        Objects.equals(this.orgId, account.orgId) &&
        Objects.equals(this.globalOrgId, account.globalOrgId)&&
        Objects.equals(this.additionalProperties, account.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, isResellerAccount, orgId, globalOrgId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    isResellerAccount: ").append(toIndentedString(isResellerAccount)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    globalOrgId: ").append(toIndentedString(globalOrgId)).append("\n");
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
    openapiFields.add("accountNumber");
    openapiFields.add("isResellerAccount");
    openapiFields.add("orgId");
    openapiFields.add("globalOrgId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accountNumber");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Account
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Account.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Account is not found in the empty JSON string", Account.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Account.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("orgId") != null && !jsonObj.get("orgId").isJsonNull()) && !jsonObj.get("orgId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orgId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orgId").toString()));
      }
      if ((jsonObj.get("globalOrgId") != null && !jsonObj.get("globalOrgId").isJsonNull()) && !jsonObj.get("globalOrgId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `globalOrgId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("globalOrgId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Account.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Account' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Account> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Account.class));

       return (TypeAdapter<T>) new TypeAdapter<Account>() {
           @Override
           public void write(JsonWriter out, Account value) throws IOException {
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
           public Account read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Account instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Account given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Account
  * @throws IOException if the JSON string is invalid with respect to Account
  */
  public static Account fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Account.class);
  }

 /**
  * Convert an instance of Account to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

