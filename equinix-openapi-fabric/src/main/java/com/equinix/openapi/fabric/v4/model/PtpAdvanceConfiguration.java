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
 * PtpAdvanceConfiguration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PtpAdvanceConfiguration {
  /**
   * Time Scale value, ARB denotes Arbitrary and PTP denotes Precision Time Protocol.
   */
  @JsonAdapter(TimeScaleEnum.Adapter.class)
  public enum TimeScaleEnum {
    ARB("ARB"),
    
    PTP("PTP");

    private String value;

    TimeScaleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TimeScaleEnum fromValue(String value) {
      for (TimeScaleEnum b : TimeScaleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TimeScaleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TimeScaleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TimeScaleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TimeScaleEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TIME_SCALE = "timeScale";
  @SerializedName(SERIALIZED_NAME_TIME_SCALE)
  private TimeScaleEnum timeScale;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private Integer domain;

  public static final String SERIALIZED_NAME_PRIORITY1 = "priority1";
  @SerializedName(SERIALIZED_NAME_PRIORITY1)
  private Integer priority1;

  public static final String SERIALIZED_NAME_PRIORITY2 = "priority2";
  @SerializedName(SERIALIZED_NAME_PRIORITY2)
  private Integer priority2;

  public static final String SERIALIZED_NAME_LOG_ANNOUNCE_INTERVAL = "logAnnounceInterval";
  @SerializedName(SERIALIZED_NAME_LOG_ANNOUNCE_INTERVAL)
  private Integer logAnnounceInterval;

  public static final String SERIALIZED_NAME_LOG_SYNC_INTERVAL = "logSyncInterval";
  @SerializedName(SERIALIZED_NAME_LOG_SYNC_INTERVAL)
  private Integer logSyncInterval;

  public static final String SERIALIZED_NAME_LOG_DELAY_REQ_INTERVAL = "logDelayReqInterval";
  @SerializedName(SERIALIZED_NAME_LOG_DELAY_REQ_INTERVAL)
  private Integer logDelayReqInterval;

  /**
   * Gets or Sets transportMode
   */
  @JsonAdapter(TransportModeEnum.Adapter.class)
  public enum TransportModeEnum {
    MULTICAST("Multicast"),
    
    UNICAST("Unicast"),
    
    HYBRID("Hybrid");

    private String value;

    TransportModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransportModeEnum fromValue(String value) {
      for (TransportModeEnum b : TransportModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TransportModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransportModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransportModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TransportModeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TRANSPORT_MODE = "transportMode";
  @SerializedName(SERIALIZED_NAME_TRANSPORT_MODE)
  private TransportModeEnum transportMode;

  public static final String SERIALIZED_NAME_GRANT_TIME = "grantTime";
  @SerializedName(SERIALIZED_NAME_GRANT_TIME)
  private Integer grantTime;

  public PtpAdvanceConfiguration() {
  }

  public PtpAdvanceConfiguration timeScale(TimeScaleEnum timeScale) {
    
    this.timeScale = timeScale;
    return this;
  }

   /**
   * Time Scale value, ARB denotes Arbitrary and PTP denotes Precision Time Protocol.
   * @return timeScale
  **/
  @javax.annotation.Nullable

  public TimeScaleEnum getTimeScale() {
    return timeScale;
  }


  public void setTimeScale(TimeScaleEnum timeScale) {
    this.timeScale = timeScale;
  }


  public PtpAdvanceConfiguration domain(Integer domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * minimum: 0
   * maximum: 127
   * @return domain
  **/
  @javax.annotation.Nullable

  public Integer getDomain() {
    return domain;
  }


  public void setDomain(Integer domain) {
    this.domain = domain;
  }


  public PtpAdvanceConfiguration priority1(Integer priority1) {
    
    this.priority1 = priority1;
    return this;
  }

   /**
   * Get priority1
   * minimum: 0
   * maximum: 248
   * @return priority1
  **/
  @javax.annotation.Nullable

  public Integer getPriority1() {
    return priority1;
  }


  public void setPriority1(Integer priority1) {
    this.priority1 = priority1;
  }


  public PtpAdvanceConfiguration priority2(Integer priority2) {
    
    this.priority2 = priority2;
    return this;
  }

   /**
   * Get priority2
   * minimum: 0
   * maximum: 248
   * @return priority2
  **/
  @javax.annotation.Nullable

  public Integer getPriority2() {
    return priority2;
  }


  public void setPriority2(Integer priority2) {
    this.priority2 = priority2;
  }


  public PtpAdvanceConfiguration logAnnounceInterval(Integer logAnnounceInterval) {
    
    this.logAnnounceInterval = logAnnounceInterval;
    return this;
  }

   /**
   * The mean time interval between Announce messages. A shorter interval makes ptp4l react faster to the changes in the master-slave hierarchy. The interval should be the same in the whole domain. It&#39;s specified as a power of two in seconds. The default is 1 (2 seconds).
   * @return logAnnounceInterval
  **/
  @javax.annotation.Nullable

  public Integer getLogAnnounceInterval() {
    return logAnnounceInterval;
  }


  public void setLogAnnounceInterval(Integer logAnnounceInterval) {
    this.logAnnounceInterval = logAnnounceInterval;
  }


  public PtpAdvanceConfiguration logSyncInterval(Integer logSyncInterval) {
    
    this.logSyncInterval = logSyncInterval;
    return this;
  }

   /**
   * The mean time interval between Sync messages. A shorter interval may improve accuracy of the local clock. It&#39;s specified as a power of two in seconds. The default is 0 (1 second).
   * @return logSyncInterval
  **/
  @javax.annotation.Nullable

  public Integer getLogSyncInterval() {
    return logSyncInterval;
  }


  public void setLogSyncInterval(Integer logSyncInterval) {
    this.logSyncInterval = logSyncInterval;
  }


  public PtpAdvanceConfiguration logDelayReqInterval(Integer logDelayReqInterval) {
    
    this.logDelayReqInterval = logDelayReqInterval;
    return this;
  }

   /**
   * Get logDelayReqInterval
   * @return logDelayReqInterval
  **/
  @javax.annotation.Nullable

  public Integer getLogDelayReqInterval() {
    return logDelayReqInterval;
  }


  public void setLogDelayReqInterval(Integer logDelayReqInterval) {
    this.logDelayReqInterval = logDelayReqInterval;
  }


  public PtpAdvanceConfiguration transportMode(TransportModeEnum transportMode) {
    
    this.transportMode = transportMode;
    return this;
  }

   /**
   * Get transportMode
   * @return transportMode
  **/
  @javax.annotation.Nullable

  public TransportModeEnum getTransportMode() {
    return transportMode;
  }


  public void setTransportMode(TransportModeEnum transportMode) {
    this.transportMode = transportMode;
  }


  public PtpAdvanceConfiguration grantTime(Integer grantTime) {
    
    this.grantTime = grantTime;
    return this;
  }

   /**
   * Unicast Grant Time in seconds. For Multicast and Hybrid transport modes, grant time defaults to 300 seconds. For Unicast mode, grant time can be between 30 to 7200.
   * minimum: 30
   * maximum: 7200
   * @return grantTime
  **/
  @javax.annotation.Nullable

  public Integer getGrantTime() {
    return grantTime;
  }


  public void setGrantTime(Integer grantTime) {
    this.grantTime = grantTime;
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
   * @return the PtpAdvanceConfiguration instance itself
   */
  public PtpAdvanceConfiguration putAdditionalProperty(String key, Object value) {
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
    PtpAdvanceConfiguration ptpAdvanceConfiguration = (PtpAdvanceConfiguration) o;
    return Objects.equals(this.timeScale, ptpAdvanceConfiguration.timeScale) &&
        Objects.equals(this.domain, ptpAdvanceConfiguration.domain) &&
        Objects.equals(this.priority1, ptpAdvanceConfiguration.priority1) &&
        Objects.equals(this.priority2, ptpAdvanceConfiguration.priority2) &&
        Objects.equals(this.logAnnounceInterval, ptpAdvanceConfiguration.logAnnounceInterval) &&
        Objects.equals(this.logSyncInterval, ptpAdvanceConfiguration.logSyncInterval) &&
        Objects.equals(this.logDelayReqInterval, ptpAdvanceConfiguration.logDelayReqInterval) &&
        Objects.equals(this.transportMode, ptpAdvanceConfiguration.transportMode) &&
        Objects.equals(this.grantTime, ptpAdvanceConfiguration.grantTime)&&
        Objects.equals(this.additionalProperties, ptpAdvanceConfiguration.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeScale, domain, priority1, priority2, logAnnounceInterval, logSyncInterval, logDelayReqInterval, transportMode, grantTime, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtpAdvanceConfiguration {\n");
    sb.append("    timeScale: ").append(toIndentedString(timeScale)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    priority1: ").append(toIndentedString(priority1)).append("\n");
    sb.append("    priority2: ").append(toIndentedString(priority2)).append("\n");
    sb.append("    logAnnounceInterval: ").append(toIndentedString(logAnnounceInterval)).append("\n");
    sb.append("    logSyncInterval: ").append(toIndentedString(logSyncInterval)).append("\n");
    sb.append("    logDelayReqInterval: ").append(toIndentedString(logDelayReqInterval)).append("\n");
    sb.append("    transportMode: ").append(toIndentedString(transportMode)).append("\n");
    sb.append("    grantTime: ").append(toIndentedString(grantTime)).append("\n");
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
    openapiFields.add("timeScale");
    openapiFields.add("domain");
    openapiFields.add("priority1");
    openapiFields.add("priority2");
    openapiFields.add("logAnnounceInterval");
    openapiFields.add("logSyncInterval");
    openapiFields.add("logDelayReqInterval");
    openapiFields.add("transportMode");
    openapiFields.add("grantTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PtpAdvanceConfiguration
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PtpAdvanceConfiguration.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PtpAdvanceConfiguration is not found in the empty JSON string", PtpAdvanceConfiguration.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("timeScale") != null && !jsonObj.get("timeScale").isJsonNull()) && !jsonObj.get("timeScale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeScale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeScale").toString()));
      }
      if ((jsonObj.get("transportMode") != null && !jsonObj.get("transportMode").isJsonNull()) && !jsonObj.get("transportMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transportMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transportMode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PtpAdvanceConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PtpAdvanceConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PtpAdvanceConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PtpAdvanceConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<PtpAdvanceConfiguration>() {
           @Override
           public void write(JsonWriter out, PtpAdvanceConfiguration value) throws IOException {
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
           public PtpAdvanceConfiguration read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PtpAdvanceConfiguration instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PtpAdvanceConfiguration given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PtpAdvanceConfiguration
  * @throws IOException if the JSON string is invalid with respect to PtpAdvanceConfiguration
  */
  public static PtpAdvanceConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PtpAdvanceConfiguration.class);
  }

 /**
  * Convert an instance of PtpAdvanceConfiguration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
