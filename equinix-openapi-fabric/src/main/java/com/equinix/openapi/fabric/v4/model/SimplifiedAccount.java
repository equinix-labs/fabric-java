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
 * SimplifiedAccount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SimplifiedAccount {
  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private Long accountNumber;

  public static final String SERIALIZED_NAME_ACCOUNT_REFERENCE_ID = "accountReferenceId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_REFERENCE_ID)
  private String accountReferenceId;

  public static final String SERIALIZED_NAME_ACCOUNT_NAME = "accountName";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NAME)
  private String accountName;

  public static final String SERIALIZED_NAME_ORG_ID = "orgId";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private Long orgId;

  public static final String SERIALIZED_NAME_ORGANIZATION_NAME = "organizationName";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_NAME)
  private String organizationName;

  public static final String SERIALIZED_NAME_GLOBAL_ORG_ID = "globalOrgId";
  @SerializedName(SERIALIZED_NAME_GLOBAL_ORG_ID)
  private String globalOrgId;

  public static final String SERIALIZED_NAME_GLOBAL_ORGANIZATION_NAME = "globalOrganizationName";
  @SerializedName(SERIALIZED_NAME_GLOBAL_ORGANIZATION_NAME)
  private String globalOrganizationName;

  public static final String SERIALIZED_NAME_UCM_ID = "ucmId";
  @SerializedName(SERIALIZED_NAME_UCM_ID)
  private String ucmId;

  public static final String SERIALIZED_NAME_GLOBAL_CUST_ID = "globalCustId";
  @SerializedName(SERIALIZED_NAME_GLOBAL_CUST_ID)
  private String globalCustId;

  public static final String SERIALIZED_NAME_RESELLER_ACCOUNT_NUMBER = "resellerAccountNumber";
  @SerializedName(SERIALIZED_NAME_RESELLER_ACCOUNT_NUMBER)
  private Long resellerAccountNumber;

  public static final String SERIALIZED_NAME_RESELLER_ACCOUNT_NAME = "resellerAccountName";
  @SerializedName(SERIALIZED_NAME_RESELLER_ACCOUNT_NAME)
  private String resellerAccountName;

  public static final String SERIALIZED_NAME_RESELLER_UCM_ID = "resellerUcmId";
  @SerializedName(SERIALIZED_NAME_RESELLER_UCM_ID)
  private String resellerUcmId;

  public static final String SERIALIZED_NAME_RESELLER_ORG_ID = "resellerOrgId";
  @SerializedName(SERIALIZED_NAME_RESELLER_ORG_ID)
  private Long resellerOrgId;

  public SimplifiedAccount() {
  }

  public SimplifiedAccount accountNumber(Long accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Account number
   * @return accountNumber
  **/
  @javax.annotation.Nullable

  public Long getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(Long accountNumber) {
    this.accountNumber = accountNumber;
  }


  public SimplifiedAccount accountReferenceId(String accountReferenceId) {
    
    this.accountReferenceId = accountReferenceId;
    return this;
  }

   /**
   * Account ReferenceId
   * @return accountReferenceId
  **/
  @javax.annotation.Nullable

  public String getAccountReferenceId() {
    return accountReferenceId;
  }


  public void setAccountReferenceId(String accountReferenceId) {
    this.accountReferenceId = accountReferenceId;
  }


  public SimplifiedAccount accountName(String accountName) {
    
    this.accountName = accountName;
    return this;
  }

   /**
   * Account name
   * @return accountName
  **/
  @javax.annotation.Nullable

  public String getAccountName() {
    return accountName;
  }


  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  public SimplifiedAccount orgId(Long orgId) {
    
    this.orgId = orgId;
    return this;
  }

   /**
   * Customer organization identifier
   * @return orgId
  **/
  @javax.annotation.Nullable

  public Long getOrgId() {
    return orgId;
  }


  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }


  public SimplifiedAccount organizationName(String organizationName) {
    
    this.organizationName = organizationName;
    return this;
  }

   /**
   * Customer organization name
   * @return organizationName
  **/
  @javax.annotation.Nullable

  public String getOrganizationName() {
    return organizationName;
  }


  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }


  public SimplifiedAccount globalOrgId(String globalOrgId) {
    
    this.globalOrgId = globalOrgId;
    return this;
  }

   /**
   * Global organization identifier
   * @return globalOrgId
  **/
  @javax.annotation.Nullable

  public String getGlobalOrgId() {
    return globalOrgId;
  }


  public void setGlobalOrgId(String globalOrgId) {
    this.globalOrgId = globalOrgId;
  }


  public SimplifiedAccount globalOrganizationName(String globalOrganizationName) {
    
    this.globalOrganizationName = globalOrganizationName;
    return this;
  }

   /**
   * Global organization name
   * @return globalOrganizationName
  **/
  @javax.annotation.Nullable

  public String getGlobalOrganizationName() {
    return globalOrganizationName;
  }


  public void setGlobalOrganizationName(String globalOrganizationName) {
    this.globalOrganizationName = globalOrganizationName;
  }


  public SimplifiedAccount ucmId(String ucmId) {
    
    this.ucmId = ucmId;
    return this;
  }

   /**
   * Account ucmId
   * @return ucmId
  **/
  @javax.annotation.Nullable

  public String getUcmId() {
    return ucmId;
  }


  public void setUcmId(String ucmId) {
    this.ucmId = ucmId;
  }


  public SimplifiedAccount globalCustId(String globalCustId) {
    
    this.globalCustId = globalCustId;
    return this;
  }

   /**
   * Account name
   * @return globalCustId
  **/
  @javax.annotation.Nullable

  public String getGlobalCustId() {
    return globalCustId;
  }


  public void setGlobalCustId(String globalCustId) {
    this.globalCustId = globalCustId;
  }


  public SimplifiedAccount resellerAccountNumber(Long resellerAccountNumber) {
    
    this.resellerAccountNumber = resellerAccountNumber;
    return this;
  }

   /**
   * Reseller account number
   * @return resellerAccountNumber
  **/
  @javax.annotation.Nullable

  public Long getResellerAccountNumber() {
    return resellerAccountNumber;
  }


  public void setResellerAccountNumber(Long resellerAccountNumber) {
    this.resellerAccountNumber = resellerAccountNumber;
  }


  public SimplifiedAccount resellerAccountName(String resellerAccountName) {
    
    this.resellerAccountName = resellerAccountName;
    return this;
  }

   /**
   * Reseller account name
   * @return resellerAccountName
  **/
  @javax.annotation.Nullable

  public String getResellerAccountName() {
    return resellerAccountName;
  }


  public void setResellerAccountName(String resellerAccountName) {
    this.resellerAccountName = resellerAccountName;
  }


  public SimplifiedAccount resellerUcmId(String resellerUcmId) {
    
    this.resellerUcmId = resellerUcmId;
    return this;
  }

   /**
   * Reseller account ucmId
   * @return resellerUcmId
  **/
  @javax.annotation.Nullable

  public String getResellerUcmId() {
    return resellerUcmId;
  }


  public void setResellerUcmId(String resellerUcmId) {
    this.resellerUcmId = resellerUcmId;
  }


  public SimplifiedAccount resellerOrgId(Long resellerOrgId) {
    
    this.resellerOrgId = resellerOrgId;
    return this;
  }

   /**
   * Reseller customer organization identifier
   * @return resellerOrgId
  **/
  @javax.annotation.Nullable

  public Long getResellerOrgId() {
    return resellerOrgId;
  }


  public void setResellerOrgId(Long resellerOrgId) {
    this.resellerOrgId = resellerOrgId;
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
   * @return the SimplifiedAccount instance itself
   */
  public SimplifiedAccount putAdditionalProperty(String key, Object value) {
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
    SimplifiedAccount simplifiedAccount = (SimplifiedAccount) o;
    return Objects.equals(this.accountNumber, simplifiedAccount.accountNumber) &&
        Objects.equals(this.accountReferenceId, simplifiedAccount.accountReferenceId) &&
        Objects.equals(this.accountName, simplifiedAccount.accountName) &&
        Objects.equals(this.orgId, simplifiedAccount.orgId) &&
        Objects.equals(this.organizationName, simplifiedAccount.organizationName) &&
        Objects.equals(this.globalOrgId, simplifiedAccount.globalOrgId) &&
        Objects.equals(this.globalOrganizationName, simplifiedAccount.globalOrganizationName) &&
        Objects.equals(this.ucmId, simplifiedAccount.ucmId) &&
        Objects.equals(this.globalCustId, simplifiedAccount.globalCustId) &&
        Objects.equals(this.resellerAccountNumber, simplifiedAccount.resellerAccountNumber) &&
        Objects.equals(this.resellerAccountName, simplifiedAccount.resellerAccountName) &&
        Objects.equals(this.resellerUcmId, simplifiedAccount.resellerUcmId) &&
        Objects.equals(this.resellerOrgId, simplifiedAccount.resellerOrgId)&&
        Objects.equals(this.additionalProperties, simplifiedAccount.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, accountReferenceId, accountName, orgId, organizationName, globalOrgId, globalOrganizationName, ucmId, globalCustId, resellerAccountNumber, resellerAccountName, resellerUcmId, resellerOrgId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimplifiedAccount {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountReferenceId: ").append(toIndentedString(accountReferenceId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    globalOrgId: ").append(toIndentedString(globalOrgId)).append("\n");
    sb.append("    globalOrganizationName: ").append(toIndentedString(globalOrganizationName)).append("\n");
    sb.append("    ucmId: ").append(toIndentedString(ucmId)).append("\n");
    sb.append("    globalCustId: ").append(toIndentedString(globalCustId)).append("\n");
    sb.append("    resellerAccountNumber: ").append(toIndentedString(resellerAccountNumber)).append("\n");
    sb.append("    resellerAccountName: ").append(toIndentedString(resellerAccountName)).append("\n");
    sb.append("    resellerUcmId: ").append(toIndentedString(resellerUcmId)).append("\n");
    sb.append("    resellerOrgId: ").append(toIndentedString(resellerOrgId)).append("\n");
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
    openapiFields.add("accountReferenceId");
    openapiFields.add("accountName");
    openapiFields.add("orgId");
    openapiFields.add("organizationName");
    openapiFields.add("globalOrgId");
    openapiFields.add("globalOrganizationName");
    openapiFields.add("ucmId");
    openapiFields.add("globalCustId");
    openapiFields.add("resellerAccountNumber");
    openapiFields.add("resellerAccountName");
    openapiFields.add("resellerUcmId");
    openapiFields.add("resellerOrgId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SimplifiedAccount
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SimplifiedAccount.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SimplifiedAccount is not found in the empty JSON string", SimplifiedAccount.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("accountReferenceId") != null && !jsonObj.get("accountReferenceId").isJsonNull()) && !jsonObj.get("accountReferenceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountReferenceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountReferenceId").toString()));
      }
      if ((jsonObj.get("accountName") != null && !jsonObj.get("accountName").isJsonNull()) && !jsonObj.get("accountName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountName").toString()));
      }
      if ((jsonObj.get("organizationName") != null && !jsonObj.get("organizationName").isJsonNull()) && !jsonObj.get("organizationName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organizationName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organizationName").toString()));
      }
      if ((jsonObj.get("globalOrgId") != null && !jsonObj.get("globalOrgId").isJsonNull()) && !jsonObj.get("globalOrgId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `globalOrgId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("globalOrgId").toString()));
      }
      if ((jsonObj.get("globalOrganizationName") != null && !jsonObj.get("globalOrganizationName").isJsonNull()) && !jsonObj.get("globalOrganizationName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `globalOrganizationName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("globalOrganizationName").toString()));
      }
      if ((jsonObj.get("ucmId") != null && !jsonObj.get("ucmId").isJsonNull()) && !jsonObj.get("ucmId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ucmId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ucmId").toString()));
      }
      if ((jsonObj.get("globalCustId") != null && !jsonObj.get("globalCustId").isJsonNull()) && !jsonObj.get("globalCustId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `globalCustId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("globalCustId").toString()));
      }
      if ((jsonObj.get("resellerAccountName") != null && !jsonObj.get("resellerAccountName").isJsonNull()) && !jsonObj.get("resellerAccountName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resellerAccountName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resellerAccountName").toString()));
      }
      if ((jsonObj.get("resellerUcmId") != null && !jsonObj.get("resellerUcmId").isJsonNull()) && !jsonObj.get("resellerUcmId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resellerUcmId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resellerUcmId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SimplifiedAccount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SimplifiedAccount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SimplifiedAccount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SimplifiedAccount.class));

       return (TypeAdapter<T>) new TypeAdapter<SimplifiedAccount>() {
           @Override
           public void write(JsonWriter out, SimplifiedAccount value) throws IOException {
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
           public SimplifiedAccount read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SimplifiedAccount instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SimplifiedAccount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SimplifiedAccount
  * @throws IOException if the JSON string is invalid with respect to SimplifiedAccount
  */
  public static SimplifiedAccount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SimplifiedAccount.class);
  }

 /**
  * Convert an instance of SimplifiedAccount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

