/*
 * Equinix Fabric API v4
 * Equinix Fabric is an advanced software-defined interconnection solution that enables you to directly, securely and dynamically connect to distributed infrastructure and digital ecosystems on platform Equinix via a single port, Customers can use Fabric to connect to: </br> 1. Cloud Service Providers - Clouds, network and other service providers.  </br> 2. Enterprises - Other Equinix customers, vendors and partners.  </br> 3. Myself - Another customer instance deployed at Equinix. </br>
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
import com.equinix.openapi.fabric.v4.model.Direction;
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
 * Bandwidth utilization statistics (octet counters-based)
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BandwidthUtilization {
  /**
   * Aggregated data transfer capacity. Possible values- Mbps, megabits (1 million bits) per second; Gbps, gigabits (1 billion bits) per second.
   */
  @JsonAdapter(UnitEnum.Adapter.class)
  public enum UnitEnum {
    MBPS("Mbps");

    private String value;

    UnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UnitEnum fromValue(String value) {
      for (UnitEnum b : UnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UnitEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UnitEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private UnitEnum unit;

  public static final String SERIALIZED_NAME_METRIC_INTERVAL = "metricInterval";
  @SerializedName(SERIALIZED_NAME_METRIC_INTERVAL)
  private String metricInterval;

  public static final String SERIALIZED_NAME_INBOUND = "inbound";
  @SerializedName(SERIALIZED_NAME_INBOUND)
  private Direction inbound;

  public static final String SERIALIZED_NAME_OUTBOUND = "outbound";
  @SerializedName(SERIALIZED_NAME_OUTBOUND)
  private Direction outbound;

  public BandwidthUtilization() {
  }

  public BandwidthUtilization unit(UnitEnum unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * Aggregated data transfer capacity. Possible values- Mbps, megabits (1 million bits) per second; Gbps, gigabits (1 billion bits) per second.
   * @return unit
  **/
  @javax.annotation.Nullable

  public UnitEnum getUnit() {
    return unit;
  }


  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }


  public BandwidthUtilization metricInterval(String metricInterval) {
    
    this.metricInterval = metricInterval;
    return this;
  }

   /**
   * An interval formatted value, indicating the time-interval the metric objects within the response represent
   * @return metricInterval
  **/
  @javax.annotation.Nullable

  public String getMetricInterval() {
    return metricInterval;
  }


  public void setMetricInterval(String metricInterval) {
    this.metricInterval = metricInterval;
  }


  public BandwidthUtilization inbound(Direction inbound) {
    
    this.inbound = inbound;
    return this;
  }

   /**
   * Get inbound
   * @return inbound
  **/
  @javax.annotation.Nullable

  public Direction getInbound() {
    return inbound;
  }


  public void setInbound(Direction inbound) {
    this.inbound = inbound;
  }


  public BandwidthUtilization outbound(Direction outbound) {
    
    this.outbound = outbound;
    return this;
  }

   /**
   * Get outbound
   * @return outbound
  **/
  @javax.annotation.Nullable

  public Direction getOutbound() {
    return outbound;
  }


  public void setOutbound(Direction outbound) {
    this.outbound = outbound;
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
   * @return the BandwidthUtilization instance itself
   */
  public BandwidthUtilization putAdditionalProperty(String key, Object value) {
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
    BandwidthUtilization bandwidthUtilization = (BandwidthUtilization) o;
    return Objects.equals(this.unit, bandwidthUtilization.unit) &&
        Objects.equals(this.metricInterval, bandwidthUtilization.metricInterval) &&
        Objects.equals(this.inbound, bandwidthUtilization.inbound) &&
        Objects.equals(this.outbound, bandwidthUtilization.outbound)&&
        Objects.equals(this.additionalProperties, bandwidthUtilization.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, metricInterval, inbound, outbound, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BandwidthUtilization {\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    metricInterval: ").append(toIndentedString(metricInterval)).append("\n");
    sb.append("    inbound: ").append(toIndentedString(inbound)).append("\n");
    sb.append("    outbound: ").append(toIndentedString(outbound)).append("\n");
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
    openapiFields.add("unit");
    openapiFields.add("metricInterval");
    openapiFields.add("inbound");
    openapiFields.add("outbound");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BandwidthUtilization
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BandwidthUtilization.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BandwidthUtilization is not found in the empty JSON string", BandwidthUtilization.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("unit") != null && !jsonObj.get("unit").isJsonNull()) && !jsonObj.get("unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unit").toString()));
      }
      if ((jsonObj.get("metricInterval") != null && !jsonObj.get("metricInterval").isJsonNull()) && !jsonObj.get("metricInterval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metricInterval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metricInterval").toString()));
      }
      // validate the optional field `inbound`
      if (jsonObj.get("inbound") != null && !jsonObj.get("inbound").isJsonNull()) {
        Direction.validateJsonObject(jsonObj.getAsJsonObject("inbound"));
      }
      // validate the optional field `outbound`
      if (jsonObj.get("outbound") != null && !jsonObj.get("outbound").isJsonNull()) {
        Direction.validateJsonObject(jsonObj.getAsJsonObject("outbound"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BandwidthUtilization.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BandwidthUtilization' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BandwidthUtilization> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BandwidthUtilization.class));

       return (TypeAdapter<T>) new TypeAdapter<BandwidthUtilization>() {
           @Override
           public void write(JsonWriter out, BandwidthUtilization value) throws IOException {
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
           public BandwidthUtilization read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BandwidthUtilization instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BandwidthUtilization given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BandwidthUtilization
  * @throws IOException if the JSON string is invalid with respect to BandwidthUtilization
  */
  public static BandwidthUtilization fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BandwidthUtilization.class);
  }

 /**
  * Convert an instance of BandwidthUtilization to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

