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
import com.equinix.openapi.fabric.v4.model.ProcessStep;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * MarketingInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MarketingInfo {
  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private String logo;

  public static final String SERIALIZED_NAME_PROMOTION = "promotion";
  @SerializedName(SERIALIZED_NAME_PROMOTION)
  private Boolean promotion;

  public static final String SERIALIZED_NAME_PROCESS_STEPS = "processSteps";
  @SerializedName(SERIALIZED_NAME_PROCESS_STEPS)
  private List<ProcessStep> processSteps = new ArrayList<>();

  public MarketingInfo() {
  }

  public MarketingInfo logo(String logo) {
    
    this.logo = logo;
    return this;
  }

   /**
   * Logo file name
   * @return logo
  **/
  @javax.annotation.Nullable

  public String getLogo() {
    return logo;
  }


  public void setLogo(String logo) {
    this.logo = logo;
  }


  public MarketingInfo promotion(Boolean promotion) {
    
    this.promotion = promotion;
    return this;
  }

   /**
   * Profile promotion on marketplace
   * @return promotion
  **/
  @javax.annotation.Nullable

  public Boolean getPromotion() {
    return promotion;
  }


  public void setPromotion(Boolean promotion) {
    this.promotion = promotion;
  }


  public MarketingInfo processSteps(List<ProcessStep> processSteps) {
    
    this.processSteps = processSteps;
    return this;
  }

  public MarketingInfo addProcessStepsItem(ProcessStep processStepsItem) {
    if (this.processSteps == null) {
      this.processSteps = new ArrayList<>();
    }
    this.processSteps.add(processStepsItem);
    return this;
  }

   /**
   * Get processSteps
   * @return processSteps
  **/
  @javax.annotation.Nullable

  public List<ProcessStep> getProcessSteps() {
    return processSteps;
  }


  public void setProcessSteps(List<ProcessStep> processSteps) {
    this.processSteps = processSteps;
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
   * @return the MarketingInfo instance itself
   */
  public MarketingInfo putAdditionalProperty(String key, Object value) {
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
    MarketingInfo marketingInfo = (MarketingInfo) o;
    return Objects.equals(this.logo, marketingInfo.logo) &&
        Objects.equals(this.promotion, marketingInfo.promotion) &&
        Objects.equals(this.processSteps, marketingInfo.processSteps)&&
        Objects.equals(this.additionalProperties, marketingInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logo, promotion, processSteps, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketingInfo {\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    promotion: ").append(toIndentedString(promotion)).append("\n");
    sb.append("    processSteps: ").append(toIndentedString(processSteps)).append("\n");
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
    openapiFields.add("logo");
    openapiFields.add("promotion");
    openapiFields.add("processSteps");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MarketingInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MarketingInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MarketingInfo is not found in the empty JSON string", MarketingInfo.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("logo") != null && !jsonObj.get("logo").isJsonNull()) && !jsonObj.get("logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo").toString()));
      }
      if (jsonObj.get("processSteps") != null && !jsonObj.get("processSteps").isJsonNull()) {
        JsonArray jsonArrayprocessSteps = jsonObj.getAsJsonArray("processSteps");
        if (jsonArrayprocessSteps != null) {
          // ensure the json data is an array
          if (!jsonObj.get("processSteps").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `processSteps` to be an array in the JSON string but got `%s`", jsonObj.get("processSteps").toString()));
          }

          // validate the optional field `processSteps` (array)
          for (int i = 0; i < jsonArrayprocessSteps.size(); i++) {
            ProcessStep.validateJsonObject(jsonArrayprocessSteps.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MarketingInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MarketingInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MarketingInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MarketingInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<MarketingInfo>() {
           @Override
           public void write(JsonWriter out, MarketingInfo value) throws IOException {
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
           public MarketingInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MarketingInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MarketingInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MarketingInfo
  * @throws IOException if the JSON string is invalid with respect to MarketingInfo
  */
  public static MarketingInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MarketingInfo.class);
  }

 /**
  * Convert an instance of MarketingInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

