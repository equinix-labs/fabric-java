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

import com.fasterxml.jackson.annotation.*;

import java.util.Objects;
import java.util.UUID;

/**
 * purchase order
 */
@JsonPropertyOrder({
  PortOrderPurchaseOrder.JSON_PROPERTY_NUMBER,
  PortOrderPurchaseOrder.JSON_PROPERTY_AMOUNT,
  PortOrderPurchaseOrder.JSON_PROPERTY_START_DATE,
  PortOrderPurchaseOrder.JSON_PROPERTY_END_DATE,
  PortOrderPurchaseOrder.JSON_PROPERTY_ATTACHMENT_ID,
  PortOrderPurchaseOrder.JSON_PROPERTY_SELECTION_TYPE
})
@JsonTypeName("PortOrder_purchaseOrder")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PortOrderPurchaseOrder {
  public static final String JSON_PROPERTY_NUMBER = "number";
  private String number;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private String amount;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_ATTACHMENT_ID = "attachmentId";
  private UUID attachmentId;

  /**
   * Gets or Sets selectionType
   */
  public enum SelectionTypeEnum {
    EXEMPTION("EXEMPTION"),
    
    EXISTING("EXISTING"),
    
    NEW("NEW"),
    
    BLANKET("BLANKET");

    private String value;

    SelectionTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SelectionTypeEnum fromValue(String value) {
      for (SelectionTypeEnum b : SelectionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SELECTION_TYPE = "selectionType";
  private SelectionTypeEnum selectionType;

  public PortOrderPurchaseOrder() {
  }

  public PortOrderPurchaseOrder number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * purchase order number
   * @return number
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNumber() {
    return number;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumber(String number) {
    this.number = number;
  }


  public PortOrderPurchaseOrder amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * purchase order amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(String amount) {
    this.amount = amount;
  }


  public PortOrderPurchaseOrder startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public PortOrderPurchaseOrder endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public PortOrderPurchaseOrder attachmentId(UUID attachmentId) {
    
    this.attachmentId = attachmentId;
    return this;
  }

   /**
   * Get attachmentId
   * @return attachmentId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTACHMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getAttachmentId() {
    return attachmentId;
  }


  @JsonProperty(JSON_PROPERTY_ATTACHMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttachmentId(UUID attachmentId) {
    this.attachmentId = attachmentId;
  }


  public PortOrderPurchaseOrder selectionType(SelectionTypeEnum selectionType) {
    
    this.selectionType = selectionType;
    return this;
  }

   /**
   * Get selectionType
   * @return selectionType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SELECTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SelectionTypeEnum getSelectionType() {
    return selectionType;
  }


  @JsonProperty(JSON_PROPERTY_SELECTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelectionType(SelectionTypeEnum selectionType) {
    this.selectionType = selectionType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortOrderPurchaseOrder portOrderPurchaseOrder = (PortOrderPurchaseOrder) o;
    return Objects.equals(this.number, portOrderPurchaseOrder.number) &&
        Objects.equals(this.amount, portOrderPurchaseOrder.amount) &&
        Objects.equals(this.startDate, portOrderPurchaseOrder.startDate) &&
        Objects.equals(this.endDate, portOrderPurchaseOrder.endDate) &&
        Objects.equals(this.attachmentId, portOrderPurchaseOrder.attachmentId) &&
        Objects.equals(this.selectionType, portOrderPurchaseOrder.selectionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, amount, startDate, endDate, attachmentId, selectionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortOrderPurchaseOrder {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    selectionType: ").append(toIndentedString(selectionType)).append("\n");
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

