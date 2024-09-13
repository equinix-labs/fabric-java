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
import com.equinix.openapi.fabric.v4.model.TimeServiceOrFilter;
import com.equinix.openapi.fabric.v4.model.TimeServiceSimpleExpression;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
public class TimeServiceFilter extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(TimeServiceFilter.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!TimeServiceFilter.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'TimeServiceFilter' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<TimeServiceOrFilter> adapterTimeServiceOrFilter = gson.getDelegateAdapter(this, TypeToken.get(TimeServiceOrFilter.class));
            final TypeAdapter<TimeServiceSimpleExpression> adapterTimeServiceSimpleExpression = gson.getDelegateAdapter(this, TypeToken.get(TimeServiceSimpleExpression.class));

            return (TypeAdapter<T>) new TypeAdapter<TimeServiceFilter>() {
                @Override
                public void write(JsonWriter out, TimeServiceFilter value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `TimeServiceOrFilter`
                    if (value.getActualInstance() instanceof TimeServiceOrFilter) {
                        JsonObject obj = adapterTimeServiceOrFilter.toJsonTree((TimeServiceOrFilter)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `TimeServiceSimpleExpression`
                    if (value.getActualInstance() instanceof TimeServiceSimpleExpression) {
                        JsonObject obj = adapterTimeServiceSimpleExpression.toJsonTree((TimeServiceSimpleExpression)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: TimeServiceOrFilter, TimeServiceSimpleExpression");
                }

                @Override
                public TimeServiceFilter read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize TimeServiceOrFilter
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TimeServiceOrFilter.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'TimeServiceOrFilter'");
                        TimeServiceFilter ret = new TimeServiceFilter();
                        ret.setActualInstance(adapterTimeServiceOrFilter.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'TimeServiceOrFilter'", e);
                    }

                    // deserialize TimeServiceSimpleExpression
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TimeServiceSimpleExpression.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'TimeServiceSimpleExpression'");
                        TimeServiceFilter ret = new TimeServiceFilter();
                        ret.setActualInstance(adapterTimeServiceSimpleExpression.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'TimeServiceSimpleExpression'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for TimeServiceFilter: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public TimeServiceFilter() {
        super("anyOf", Boolean.FALSE);
    }

    public TimeServiceFilter(TimeServiceOrFilter o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TimeServiceFilter(TimeServiceSimpleExpression o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("TimeServiceOrFilter", new GenericType<TimeServiceOrFilter>() {
        });
        schemas.put("TimeServiceSimpleExpression", new GenericType<TimeServiceSimpleExpression>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return TimeServiceFilter.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * TimeServiceOrFilter, TimeServiceSimpleExpression
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof TimeServiceOrFilter) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TimeServiceSimpleExpression) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be TimeServiceOrFilter, TimeServiceSimpleExpression");
    }

    /**
     * Get the actual instance, which can be the following:
     * TimeServiceOrFilter, TimeServiceSimpleExpression
     *
     * @return The actual instance (TimeServiceOrFilter, TimeServiceSimpleExpression)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `TimeServiceOrFilter`. If the actual instance is not `TimeServiceOrFilter`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TimeServiceOrFilter`
     * @throws ClassCastException if the instance is not `TimeServiceOrFilter`
     */
    public TimeServiceOrFilter getTimeServiceOrFilter() throws ClassCastException {
        return (TimeServiceOrFilter)super.getActualInstance();
    }

    /**
     * Get the actual instance of `TimeServiceSimpleExpression`. If the actual instance is not `TimeServiceSimpleExpression`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TimeServiceSimpleExpression`
     * @throws ClassCastException if the instance is not `TimeServiceSimpleExpression`
     */
    public TimeServiceSimpleExpression getTimeServiceSimpleExpression() throws ClassCastException {
        return (TimeServiceSimpleExpression)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TimeServiceFilter
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with TimeServiceOrFilter
    try {
      TimeServiceOrFilter.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with TimeServiceSimpleExpression
    try {
      TimeServiceSimpleExpression.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for TimeServiceFilter with anyOf schemas: TimeServiceOrFilter, TimeServiceSimpleExpression. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of TimeServiceFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TimeServiceFilter
  * @throws IOException if the JSON string is invalid with respect to TimeServiceFilter
  */
  public static TimeServiceFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimeServiceFilter.class);
  }

 /**
  * Convert an instance of TimeServiceFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
