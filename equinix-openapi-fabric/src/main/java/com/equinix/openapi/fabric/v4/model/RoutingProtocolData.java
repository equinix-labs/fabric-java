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
import com.equinix.openapi.fabric.v4.model.BGPConnectionIpv4;
import com.equinix.openapi.fabric.v4.model.BGPConnectionIpv6;
import com.equinix.openapi.fabric.v4.model.Changelog;
import com.equinix.openapi.fabric.v4.model.DirectConnectionIpv4;
import com.equinix.openapi.fabric.v4.model.DirectConnectionIpv6;
import com.equinix.openapi.fabric.v4.model.RoutingProtocolBFD;
import com.equinix.openapi.fabric.v4.model.RoutingProtocolBGPData;
import com.equinix.openapi.fabric.v4.model.RoutingProtocolChange;
import com.equinix.openapi.fabric.v4.model.RoutingProtocolDirectData;
import com.equinix.openapi.fabric.v4.model.RoutingProtocolOperation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import java.util.UUID;

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
public class RoutingProtocolData extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(RoutingProtocolData.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RoutingProtocolData.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RoutingProtocolData' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<RoutingProtocolBGPData> adapterRoutingProtocolBGPData = gson.getDelegateAdapter(this, TypeToken.get(RoutingProtocolBGPData.class));
            final TypeAdapter<RoutingProtocolDirectData> adapterRoutingProtocolDirectData = gson.getDelegateAdapter(this, TypeToken.get(RoutingProtocolDirectData.class));

            return (TypeAdapter<T>) new TypeAdapter<RoutingProtocolData>() {
                @Override
                public void write(JsonWriter out, RoutingProtocolData value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `RoutingProtocolBGPData`
                    if (value.getActualInstance() instanceof RoutingProtocolBGPData) {
                        JsonObject obj = adapterRoutingProtocolBGPData.toJsonTree((RoutingProtocolBGPData)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `RoutingProtocolDirectData`
                    if (value.getActualInstance() instanceof RoutingProtocolDirectData) {
                        JsonObject obj = adapterRoutingProtocolDirectData.toJsonTree((RoutingProtocolDirectData)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: RoutingProtocolBGPData, RoutingProtocolDirectData");
                }

                @Override
                public RoutingProtocolData read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize RoutingProtocolBGPData
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RoutingProtocolBGPData.validateJsonObject(jsonObject);
                        actualAdapter = adapterRoutingProtocolBGPData;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RoutingProtocolBGPData'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RoutingProtocolBGPData failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RoutingProtocolBGPData'", e);
                    }

                    // deserialize RoutingProtocolDirectData
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RoutingProtocolDirectData.validateJsonObject(jsonObject);
                        actualAdapter = adapterRoutingProtocolDirectData;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RoutingProtocolDirectData'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RoutingProtocolDirectData failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RoutingProtocolDirectData'", e);
                    }

                    if (match == 1) {
                        RoutingProtocolData ret = new RoutingProtocolData();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for RoutingProtocolData: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public RoutingProtocolData() {
        super("oneOf", Boolean.FALSE);
    }

    public RoutingProtocolData(RoutingProtocolBGPData o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public RoutingProtocolData(RoutingProtocolDirectData o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("RoutingProtocolBGPData", new GenericType<RoutingProtocolBGPData>() {
        });
        schemas.put("RoutingProtocolDirectData", new GenericType<RoutingProtocolDirectData>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return RoutingProtocolData.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * RoutingProtocolBGPData, RoutingProtocolDirectData
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof RoutingProtocolBGPData) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RoutingProtocolDirectData) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be RoutingProtocolBGPData, RoutingProtocolDirectData");
    }

    /**
     * Get the actual instance, which can be the following:
     * RoutingProtocolBGPData, RoutingProtocolDirectData
     *
     * @return The actual instance (RoutingProtocolBGPData, RoutingProtocolDirectData)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `RoutingProtocolBGPData`. If the actual instance is not `RoutingProtocolBGPData`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RoutingProtocolBGPData`
     * @throws ClassCastException if the instance is not `RoutingProtocolBGPData`
     */
    public RoutingProtocolBGPData getRoutingProtocolBGPData() throws ClassCastException {
        return (RoutingProtocolBGPData)super.getActualInstance();
    }

    /**
     * Get the actual instance of `RoutingProtocolDirectData`. If the actual instance is not `RoutingProtocolDirectData`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RoutingProtocolDirectData`
     * @throws ClassCastException if the instance is not `RoutingProtocolDirectData`
     */
    public RoutingProtocolDirectData getRoutingProtocolDirectData() throws ClassCastException {
        return (RoutingProtocolDirectData)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RoutingProtocolData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with RoutingProtocolBGPData
    try {
      RoutingProtocolBGPData.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for RoutingProtocolBGPData failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with RoutingProtocolDirectData
    try {
      RoutingProtocolDirectData.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for RoutingProtocolDirectData failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for RoutingProtocolData with oneOf schemas: RoutingProtocolBGPData, RoutingProtocolDirectData. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of RoutingProtocolData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RoutingProtocolData
  * @throws IOException if the JSON string is invalid with respect to RoutingProtocolData
  */
  public static RoutingProtocolData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RoutingProtocolData.class);
  }

 /**
  * Convert an instance of RoutingProtocolData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

