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
 * Port configuration settings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PortSettings {
  public static final String SERIALIZED_NAME_PRODUCT = "product";
  @SerializedName(SERIALIZED_NAME_PRODUCT)
  private String product;

  public static final String SERIALIZED_NAME_BUYOUT = "buyout";
  @SerializedName(SERIALIZED_NAME_BUYOUT)
  private Boolean buyout;

  public static final String SERIALIZED_NAME_VIEW_PORT_PERMISSION = "viewPortPermission";
  @SerializedName(SERIALIZED_NAME_VIEW_PORT_PERMISSION)
  private Boolean viewPortPermission;

  public static final String SERIALIZED_NAME_PLACE_VC_ORDER_PERMISSION = "placeVcOrderPermission";
  @SerializedName(SERIALIZED_NAME_PLACE_VC_ORDER_PERMISSION)
  private Boolean placeVcOrderPermission;

  public static final String SERIALIZED_NAME_LAYER3_ENABLED = "layer3Enabled";
  @SerializedName(SERIALIZED_NAME_LAYER3_ENABLED)
  private Boolean layer3Enabled;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "productCode";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public static final String SERIALIZED_NAME_SHARED_PORT_TYPE = "sharedPortType";
  @SerializedName(SERIALIZED_NAME_SHARED_PORT_TYPE)
  private Boolean sharedPortType;

  /**
   * Gets or Sets sharedPortProduct
   */
  @JsonAdapter(SharedPortProductEnum.Adapter.class)
  public enum SharedPortProductEnum {
    NETWORK_EDGE("NETWORK_EDGE"),
    
    VIRTUAL_GATEWAY("VIRTUAL_GATEWAY"),
    
    SMARTKEY("SMARTKEY"),
    
    EDGE_METAL("EDGE_METAL");

    private String value;

    SharedPortProductEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SharedPortProductEnum fromValue(String value) {
      for (SharedPortProductEnum b : SharedPortProductEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SharedPortProductEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SharedPortProductEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SharedPortProductEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SharedPortProductEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SHARED_PORT_PRODUCT = "sharedPortProduct";
  @SerializedName(SERIALIZED_NAME_SHARED_PORT_PRODUCT)
  private SharedPortProductEnum sharedPortProduct;

  /**
   * Type of Port Package
   */
  @JsonAdapter(PackageTypeEnum.Adapter.class)
  public enum PackageTypeEnum {
    STANDARD("STANDARD"),
    
    UNTAGGED("UNTAGGED"),
    
    UNLIMITED("UNLIMITED"),
    
    FREE("FREE");

    private String value;

    PackageTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PackageTypeEnum fromValue(String value) {
      for (PackageTypeEnum b : PackageTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PackageTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PackageTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PackageTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PackageTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PACKAGE_TYPE = "packageType";
  @SerializedName(SERIALIZED_NAME_PACKAGE_TYPE)
  private PackageTypeEnum packageType;

  public PortSettings() {
  }

  public PortSettings product(String product) {
    
    this.product = product;
    return this;
  }

   /**
   * Product name
   * @return product
  **/
  @javax.annotation.Nullable

  public String getProduct() {
    return product;
  }


  public void setProduct(String product) {
    this.product = product;
  }


  public PortSettings buyout(Boolean buyout) {
    
    this.buyout = buyout;
    return this;
  }

   /**
   * Get buyout
   * @return buyout
  **/
  @javax.annotation.Nullable

  public Boolean getBuyout() {
    return buyout;
  }


  public void setBuyout(Boolean buyout) {
    this.buyout = buyout;
  }


  public PortSettings viewPortPermission(Boolean viewPortPermission) {
    
    this.viewPortPermission = viewPortPermission;
    return this;
  }

   /**
   * Get viewPortPermission
   * @return viewPortPermission
  **/
  @javax.annotation.Nullable

  public Boolean getViewPortPermission() {
    return viewPortPermission;
  }


  public void setViewPortPermission(Boolean viewPortPermission) {
    this.viewPortPermission = viewPortPermission;
  }


  public PortSettings placeVcOrderPermission(Boolean placeVcOrderPermission) {
    
    this.placeVcOrderPermission = placeVcOrderPermission;
    return this;
  }

   /**
   * Get placeVcOrderPermission
   * @return placeVcOrderPermission
  **/
  @javax.annotation.Nullable

  public Boolean getPlaceVcOrderPermission() {
    return placeVcOrderPermission;
  }


  public void setPlaceVcOrderPermission(Boolean placeVcOrderPermission) {
    this.placeVcOrderPermission = placeVcOrderPermission;
  }


  public PortSettings layer3Enabled(Boolean layer3Enabled) {
    
    this.layer3Enabled = layer3Enabled;
    return this;
  }

   /**
   * Get layer3Enabled
   * @return layer3Enabled
  **/
  @javax.annotation.Nullable

  public Boolean getLayer3Enabled() {
    return layer3Enabled;
  }


  public void setLayer3Enabled(Boolean layer3Enabled) {
    this.layer3Enabled = layer3Enabled;
  }


  public PortSettings productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * Get productCode
   * @return productCode
  **/
  @javax.annotation.Nullable

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public PortSettings sharedPortType(Boolean sharedPortType) {
    
    this.sharedPortType = sharedPortType;
    return this;
  }

   /**
   * Get sharedPortType
   * @return sharedPortType
  **/
  @javax.annotation.Nullable

  public Boolean getSharedPortType() {
    return sharedPortType;
  }


  public void setSharedPortType(Boolean sharedPortType) {
    this.sharedPortType = sharedPortType;
  }


  public PortSettings sharedPortProduct(SharedPortProductEnum sharedPortProduct) {
    
    this.sharedPortProduct = sharedPortProduct;
    return this;
  }

   /**
   * Get sharedPortProduct
   * @return sharedPortProduct
  **/
  @javax.annotation.Nullable

  public SharedPortProductEnum getSharedPortProduct() {
    return sharedPortProduct;
  }


  public void setSharedPortProduct(SharedPortProductEnum sharedPortProduct) {
    this.sharedPortProduct = sharedPortProduct;
  }


  public PortSettings packageType(PackageTypeEnum packageType) {
    
    this.packageType = packageType;
    return this;
  }

   /**
   * Type of Port Package
   * @return packageType
  **/
  @javax.annotation.Nullable

  public PackageTypeEnum getPackageType() {
    return packageType;
  }


  public void setPackageType(PackageTypeEnum packageType) {
    this.packageType = packageType;
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
   * @return the PortSettings instance itself
   */
  public PortSettings putAdditionalProperty(String key, Object value) {
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
    PortSettings portSettings = (PortSettings) o;
    return Objects.equals(this.product, portSettings.product) &&
        Objects.equals(this.buyout, portSettings.buyout) &&
        Objects.equals(this.viewPortPermission, portSettings.viewPortPermission) &&
        Objects.equals(this.placeVcOrderPermission, portSettings.placeVcOrderPermission) &&
        Objects.equals(this.layer3Enabled, portSettings.layer3Enabled) &&
        Objects.equals(this.productCode, portSettings.productCode) &&
        Objects.equals(this.sharedPortType, portSettings.sharedPortType) &&
        Objects.equals(this.sharedPortProduct, portSettings.sharedPortProduct) &&
        Objects.equals(this.packageType, portSettings.packageType)&&
        Objects.equals(this.additionalProperties, portSettings.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, buyout, viewPortPermission, placeVcOrderPermission, layer3Enabled, productCode, sharedPortType, sharedPortProduct, packageType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortSettings {\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    buyout: ").append(toIndentedString(buyout)).append("\n");
    sb.append("    viewPortPermission: ").append(toIndentedString(viewPortPermission)).append("\n");
    sb.append("    placeVcOrderPermission: ").append(toIndentedString(placeVcOrderPermission)).append("\n");
    sb.append("    layer3Enabled: ").append(toIndentedString(layer3Enabled)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    sharedPortType: ").append(toIndentedString(sharedPortType)).append("\n");
    sb.append("    sharedPortProduct: ").append(toIndentedString(sharedPortProduct)).append("\n");
    sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
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
    openapiFields.add("product");
    openapiFields.add("buyout");
    openapiFields.add("viewPortPermission");
    openapiFields.add("placeVcOrderPermission");
    openapiFields.add("layer3Enabled");
    openapiFields.add("productCode");
    openapiFields.add("sharedPortType");
    openapiFields.add("sharedPortProduct");
    openapiFields.add("packageType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PortSettings
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PortSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PortSettings is not found in the empty JSON string", PortSettings.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("product") != null && !jsonObj.get("product").isJsonNull()) && !jsonObj.get("product").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product").toString()));
      }
      if ((jsonObj.get("productCode") != null && !jsonObj.get("productCode").isJsonNull()) && !jsonObj.get("productCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productCode").toString()));
      }
      if ((jsonObj.get("sharedPortProduct") != null && !jsonObj.get("sharedPortProduct").isJsonNull()) && !jsonObj.get("sharedPortProduct").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sharedPortProduct` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sharedPortProduct").toString()));
      }
      if ((jsonObj.get("packageType") != null && !jsonObj.get("packageType").isJsonNull()) && !jsonObj.get("packageType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `packageType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("packageType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PortSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PortSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PortSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PortSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<PortSettings>() {
           @Override
           public void write(JsonWriter out, PortSettings value) throws IOException {
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
           public PortSettings read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PortSettings instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PortSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PortSettings
  * @throws IOException if the JSON string is invalid with respect to PortSettings
  */
  public static PortSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PortSettings.class);
  }

 /**
  * Convert an instance of PortSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

