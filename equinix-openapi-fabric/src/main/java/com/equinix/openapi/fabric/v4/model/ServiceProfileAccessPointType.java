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
import com.equinix.openapi.fabric.v4.model.ApiConfig;
import com.equinix.openapi.fabric.v4.model.AuthenticationKey;
import com.equinix.openapi.fabric.v4.model.ServiceProfileAccessPointTypeCOLO;
import com.equinix.openapi.fabric.v4.model.ServiceProfileAccessPointTypeEnum;
import com.equinix.openapi.fabric.v4.model.ServiceProfileAccessPointTypeVD;
import com.equinix.openapi.fabric.v4.model.ServiceProfileLinkProtocolConfig;
import com.equinix.openapi.fabric.v4.model.ServiceProfileMetadata;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import com.equinix.openapi.fabric.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceProfileAccessPointType extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ServiceProfileAccessPointType.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ServiceProfileAccessPointType.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ServiceProfileAccessPointType' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ServiceProfileAccessPointTypeCOLO> adapterServiceProfileAccessPointTypeCOLO = gson.getDelegateAdapter(this, TypeToken.get(ServiceProfileAccessPointTypeCOLO.class));
            final TypeAdapter<ServiceProfileAccessPointTypeVD> adapterServiceProfileAccessPointTypeVD = gson.getDelegateAdapter(this, TypeToken.get(ServiceProfileAccessPointTypeVD.class));

            return (TypeAdapter<T>) new TypeAdapter<ServiceProfileAccessPointType>() {
                @Override
                public void write(JsonWriter out, ServiceProfileAccessPointType value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ServiceProfileAccessPointTypeCOLO`
                    if (value.getActualInstance() instanceof ServiceProfileAccessPointTypeCOLO) {
                        JsonObject obj = adapterServiceProfileAccessPointTypeCOLO.toJsonTree((ServiceProfileAccessPointTypeCOLO)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ServiceProfileAccessPointTypeVD`
                    if (value.getActualInstance() instanceof ServiceProfileAccessPointTypeVD) {
                        JsonObject obj = adapterServiceProfileAccessPointTypeVD.toJsonTree((ServiceProfileAccessPointTypeVD)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: ServiceProfileAccessPointTypeCOLO, ServiceProfileAccessPointTypeVD");
                }

                @Override
                public ServiceProfileAccessPointType read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize ServiceProfileAccessPointTypeCOLO
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ServiceProfileAccessPointTypeCOLO.validateJsonObject(jsonObject);
                        actualAdapter = adapterServiceProfileAccessPointTypeCOLO;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ServiceProfileAccessPointTypeCOLO'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ServiceProfileAccessPointTypeCOLO failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ServiceProfileAccessPointTypeCOLO'", e);
                    }

                    // deserialize ServiceProfileAccessPointTypeVD
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ServiceProfileAccessPointTypeVD.validateJsonObject(jsonObject);
                        actualAdapter = adapterServiceProfileAccessPointTypeVD;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ServiceProfileAccessPointTypeVD'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ServiceProfileAccessPointTypeVD failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ServiceProfileAccessPointTypeVD'", e);
                    }

                    if (match == 1) {
                        ServiceProfileAccessPointType ret = new ServiceProfileAccessPointType();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ServiceProfileAccessPointType: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ServiceProfileAccessPointType() {
        super("oneOf", Boolean.FALSE);
    }

    public ServiceProfileAccessPointType(ServiceProfileAccessPointTypeCOLO o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ServiceProfileAccessPointType(ServiceProfileAccessPointTypeVD o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ServiceProfileAccessPointTypeCOLO", new GenericType<ServiceProfileAccessPointTypeCOLO>() {
        });
        schemas.put("ServiceProfileAccessPointTypeVD", new GenericType<ServiceProfileAccessPointTypeVD>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ServiceProfileAccessPointType.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ServiceProfileAccessPointTypeCOLO, ServiceProfileAccessPointTypeVD
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ServiceProfileAccessPointTypeCOLO) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ServiceProfileAccessPointTypeVD) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ServiceProfileAccessPointTypeCOLO, ServiceProfileAccessPointTypeVD");
    }

    /**
     * Get the actual instance, which can be the following:
     * ServiceProfileAccessPointTypeCOLO, ServiceProfileAccessPointTypeVD
     *
     * @return The actual instance (ServiceProfileAccessPointTypeCOLO, ServiceProfileAccessPointTypeVD)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ServiceProfileAccessPointTypeCOLO`. If the actual instance is not `ServiceProfileAccessPointTypeCOLO`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ServiceProfileAccessPointTypeCOLO`
     * @throws ClassCastException if the instance is not `ServiceProfileAccessPointTypeCOLO`
     */
    public ServiceProfileAccessPointTypeCOLO getServiceProfileAccessPointTypeCOLO() throws ClassCastException {
        return (ServiceProfileAccessPointTypeCOLO)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ServiceProfileAccessPointTypeVD`. If the actual instance is not `ServiceProfileAccessPointTypeVD`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ServiceProfileAccessPointTypeVD`
     * @throws ClassCastException if the instance is not `ServiceProfileAccessPointTypeVD`
     */
    public ServiceProfileAccessPointTypeVD getServiceProfileAccessPointTypeVD() throws ClassCastException {
        return (ServiceProfileAccessPointTypeVD)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ServiceProfileAccessPointType
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with ServiceProfileAccessPointTypeCOLO
    try {
      ServiceProfileAccessPointTypeCOLO.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ServiceProfileAccessPointTypeCOLO failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ServiceProfileAccessPointTypeVD
    try {
      ServiceProfileAccessPointTypeVD.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ServiceProfileAccessPointTypeVD failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for ServiceProfileAccessPointType with oneOf schemas: ServiceProfileAccessPointTypeCOLO, ServiceProfileAccessPointTypeVD. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of ServiceProfileAccessPointType given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServiceProfileAccessPointType
  * @throws IOException if the JSON string is invalid with respect to ServiceProfileAccessPointType
  */
  public static ServiceProfileAccessPointType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServiceProfileAccessPointType.class);
  }

 /**
  * Convert an instance of ServiceProfileAccessPointType to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

