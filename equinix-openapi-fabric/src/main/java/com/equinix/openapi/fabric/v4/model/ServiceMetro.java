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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * ServiceMetro
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceMetro {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IBXS = "ibxs";
  @SerializedName(SERIALIZED_NAME_IBXS)
  private List<String> ibxs = new ArrayList<>();

  public static final String SERIALIZED_NAME_IN_TRAIL = "inTrail";
  @SerializedName(SERIALIZED_NAME_IN_TRAIL)
  private Boolean inTrail;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_SELLER_REGIONS = "sellerRegions";
  @SerializedName(SERIALIZED_NAME_SELLER_REGIONS)
  private Map<String, String> sellerRegions = new HashMap<>();

  public ServiceMetro() {
  }

  public ServiceMetro code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * metro code
   * @return code
  **/
  @javax.annotation.Nullable

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public ServiceMetro name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * metro name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ServiceMetro ibxs(List<String> ibxs) {
    
    this.ibxs = ibxs;
    return this;
  }

  public ServiceMetro addIbxsItem(String ibxsItem) {
    if (this.ibxs == null) {
      this.ibxs = new ArrayList<>();
    }
    this.ibxs.add(ibxsItem);
    return this;
  }

   /**
   * Get ibxs
   * @return ibxs
  **/
  @javax.annotation.Nullable

  public List<String> getIbxs() {
    return ibxs;
  }


  public void setIbxs(List<String> ibxs) {
    this.ibxs = ibxs;
  }


  public ServiceMetro inTrail(Boolean inTrail) {
    
    this.inTrail = inTrail;
    return this;
  }

   /**
   * Get inTrail
   * @return inTrail
  **/
  @javax.annotation.Nullable

  public Boolean getInTrail() {
    return inTrail;
  }


  public void setInTrail(Boolean inTrail) {
    this.inTrail = inTrail;
  }


  public ServiceMetro displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * service metro display name
   * @return displayName
  **/
  @javax.annotation.Nullable

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public ServiceMetro sellerRegions(Map<String, String> sellerRegions) {
    
    this.sellerRegions = sellerRegions;
    return this;
  }

  public ServiceMetro putSellerRegionsItem(String key, String sellerRegionsItem) {
    if (this.sellerRegions == null) {
      this.sellerRegions = new HashMap<>();
    }
    this.sellerRegions.put(key, sellerRegionsItem);
    return this;
  }

   /**
   * Get sellerRegions
   * @return sellerRegions
  **/
  @javax.annotation.Nullable

  public Map<String, String> getSellerRegions() {
    return sellerRegions;
  }


  public void setSellerRegions(Map<String, String> sellerRegions) {
    this.sellerRegions = sellerRegions;
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
   * @return the ServiceMetro instance itself
   */
  public ServiceMetro putAdditionalProperty(String key, Object value) {
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
    ServiceMetro serviceMetro = (ServiceMetro) o;
    return Objects.equals(this.code, serviceMetro.code) &&
        Objects.equals(this.name, serviceMetro.name) &&
        Objects.equals(this.ibxs, serviceMetro.ibxs) &&
        Objects.equals(this.inTrail, serviceMetro.inTrail) &&
        Objects.equals(this.displayName, serviceMetro.displayName) &&
        Objects.equals(this.sellerRegions, serviceMetro.sellerRegions)&&
        Objects.equals(this.additionalProperties, serviceMetro.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, ibxs, inTrail, displayName, sellerRegions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceMetro {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ibxs: ").append(toIndentedString(ibxs)).append("\n");
    sb.append("    inTrail: ").append(toIndentedString(inTrail)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    sellerRegions: ").append(toIndentedString(sellerRegions)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("name");
    openapiFields.add("ibxs");
    openapiFields.add("inTrail");
    openapiFields.add("displayName");
    openapiFields.add("sellerRegions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ServiceMetro
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ServiceMetro.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ServiceMetro is not found in the empty JSON string", ServiceMetro.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ibxs") != null && !jsonObj.get("ibxs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ibxs` to be an array in the JSON string but got `%s`", jsonObj.get("ibxs").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServiceMetro.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServiceMetro' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServiceMetro> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServiceMetro.class));

       return (TypeAdapter<T>) new TypeAdapter<ServiceMetro>() {
           @Override
           public void write(JsonWriter out, ServiceMetro value) throws IOException {
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
           public ServiceMetro read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ServiceMetro instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ServiceMetro given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServiceMetro
  * @throws IOException if the JSON string is invalid with respect to ServiceMetro
  */
  public static ServiceMetro fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServiceMetro.class);
  }

 /**
  * Convert an instance of ServiceMetro to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

