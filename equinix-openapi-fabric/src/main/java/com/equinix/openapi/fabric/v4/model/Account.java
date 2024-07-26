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

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Account model, includes account number and flag to indicate if this account is reseller
 */
@JsonPropertyOrder({
  Account.JSON_PROPERTY_ACCOUNT_NUMBER,
  Account.JSON_PROPERTY_IS_RESELLER_ACCOUNT,
  Account.JSON_PROPERTY_ORG_ID,
  Account.JSON_PROPERTY_GLOBAL_ORG_ID
})
@JsonTypeName("account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Account {
  public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "accountNumber";
  private Integer accountNumber;

  public static final String JSON_PROPERTY_IS_RESELLER_ACCOUNT = "isResellerAccount";
  private Boolean isResellerAccount;

  public static final String JSON_PROPERTY_ORG_ID = "orgId";
  private String orgId;

  public static final String JSON_PROPERTY_GLOBAL_ORG_ID = "globalOrgId";
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
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getAccountNumber() {
    return accountNumber;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @JsonProperty(JSON_PROPERTY_IS_RESELLER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsResellerAccount() {
    return isResellerAccount;
  }


  @JsonProperty(JSON_PROPERTY_IS_RESELLER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrgId() {
    return orgId;
  }


  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @JsonProperty(JSON_PROPERTY_GLOBAL_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGlobalOrgId() {
    return globalOrgId;
  }


  @JsonProperty(JSON_PROPERTY_GLOBAL_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGlobalOrgId(String globalOrgId) {
    this.globalOrgId = globalOrgId;
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
        Objects.equals(this.globalOrgId, account.globalOrgId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, isResellerAccount, orgId, globalOrgId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    isResellerAccount: ").append(toIndentedString(isResellerAccount)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    globalOrgId: ").append(toIndentedString(globalOrgId)).append("\n");
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

}

