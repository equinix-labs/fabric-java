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
import com.equinix.openapi.fabric.v4.model.BandwidthUtilization;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

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
 * This API provides service-level traffic metrics so that you can view access and gather key information required to manage service subscription sizing and capacity.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Statistics {
  public static final String SERIALIZED_NAME_START_DATE_TIME = "startDateTime";
  @SerializedName(SERIALIZED_NAME_START_DATE_TIME)
  private OffsetDateTime startDateTime;

  public static final String SERIALIZED_NAME_END_DATE_TIME = "endDateTime";
  @SerializedName(SERIALIZED_NAME_END_DATE_TIME)
  private OffsetDateTime endDateTime;

  /**
   * Point of view for connection metrics - aSide or zSide
   */
  @JsonAdapter(ViewPointEnum.Adapter.class)
  public enum ViewPointEnum {
    ASIDE("aSide"),
    
    ZSIDE("zSide");

    private String value;

    ViewPointEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ViewPointEnum fromValue(String value) {
      for (ViewPointEnum b : ViewPointEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ViewPointEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ViewPointEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ViewPointEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ViewPointEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VIEW_POINT = "viewPoint";
  @SerializedName(SERIALIZED_NAME_VIEW_POINT)
  private ViewPointEnum viewPoint;

  public static final String SERIALIZED_NAME_BANDWIDTH_UTILIZATION = "bandwidthUtilization";
  @SerializedName(SERIALIZED_NAME_BANDWIDTH_UTILIZATION)
  private BandwidthUtilization bandwidthUtilization;

  public Statistics() {
  }

  public Statistics startDateTime(OffsetDateTime startDateTime) {
    
    this.startDateTime = startDateTime;
    return this;
  }

   /**
   * Start and duration of the statistical analysis interval.
   * @return startDateTime
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getStartDateTime() {
    return startDateTime;
  }


  public void setStartDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
  }


  public Statistics endDateTime(OffsetDateTime endDateTime) {
    
    this.endDateTime = endDateTime;
    return this;
  }

   /**
   * End and duration of the statistical analysis interval.
   * @return endDateTime
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getEndDateTime() {
    return endDateTime;
  }


  public void setEndDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
  }


  public Statistics viewPoint(ViewPointEnum viewPoint) {
    
    this.viewPoint = viewPoint;
    return this;
  }

   /**
   * Point of view for connection metrics - aSide or zSide
   * @return viewPoint
  **/
  @javax.annotation.Nullable

  public ViewPointEnum getViewPoint() {
    return viewPoint;
  }


  public void setViewPoint(ViewPointEnum viewPoint) {
    this.viewPoint = viewPoint;
  }


  public Statistics bandwidthUtilization(BandwidthUtilization bandwidthUtilization) {
    
    this.bandwidthUtilization = bandwidthUtilization;
    return this;
  }

   /**
   * Get bandwidthUtilization
   * @return bandwidthUtilization
  **/
  @javax.annotation.Nullable

  public BandwidthUtilization getBandwidthUtilization() {
    return bandwidthUtilization;
  }


  public void setBandwidthUtilization(BandwidthUtilization bandwidthUtilization) {
    this.bandwidthUtilization = bandwidthUtilization;
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
   * @return the Statistics instance itself
   */
  public Statistics putAdditionalProperty(String key, Object value) {
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
    Statistics statistics = (Statistics) o;
    return Objects.equals(this.startDateTime, statistics.startDateTime) &&
        Objects.equals(this.endDateTime, statistics.endDateTime) &&
        Objects.equals(this.viewPoint, statistics.viewPoint) &&
        Objects.equals(this.bandwidthUtilization, statistics.bandwidthUtilization)&&
        Objects.equals(this.additionalProperties, statistics.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDateTime, endDateTime, viewPoint, bandwidthUtilization, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Statistics {\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    viewPoint: ").append(toIndentedString(viewPoint)).append("\n");
    sb.append("    bandwidthUtilization: ").append(toIndentedString(bandwidthUtilization)).append("\n");
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
    openapiFields.add("startDateTime");
    openapiFields.add("endDateTime");
    openapiFields.add("viewPoint");
    openapiFields.add("bandwidthUtilization");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Statistics
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Statistics.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Statistics is not found in the empty JSON string", Statistics.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("viewPoint") != null && !jsonObj.get("viewPoint").isJsonNull()) && !jsonObj.get("viewPoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `viewPoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("viewPoint").toString()));
      }
      // validate the optional field `bandwidthUtilization`
      if (jsonObj.get("bandwidthUtilization") != null && !jsonObj.get("bandwidthUtilization").isJsonNull()) {
        BandwidthUtilization.validateJsonObject(jsonObj.getAsJsonObject("bandwidthUtilization"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Statistics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Statistics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Statistics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Statistics.class));

       return (TypeAdapter<T>) new TypeAdapter<Statistics>() {
           @Override
           public void write(JsonWriter out, Statistics value) throws IOException {
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
           public Statistics read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Statistics instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Statistics given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Statistics
  * @throws IOException if the JSON string is invalid with respect to Statistics
  */
  public static Statistics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Statistics.class);
  }

 /**
  * Convert an instance of Statistics to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

