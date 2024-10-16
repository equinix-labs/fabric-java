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
import com.equinix.openapi.fabric.v4.model.StreamAssetOrFilter;
import com.equinix.openapi.fabric.v4.model.StreamAssetSimpleExpression;
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
public class StreamAssetFilter extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(StreamAssetFilter.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!StreamAssetFilter.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'StreamAssetFilter' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<StreamAssetOrFilter> adapterStreamAssetOrFilter = gson.getDelegateAdapter(this, TypeToken.get(StreamAssetOrFilter.class));
            final TypeAdapter<StreamAssetSimpleExpression> adapterStreamAssetSimpleExpression = gson.getDelegateAdapter(this, TypeToken.get(StreamAssetSimpleExpression.class));

            return (TypeAdapter<T>) new TypeAdapter<StreamAssetFilter>() {
                @Override
                public void write(JsonWriter out, StreamAssetFilter value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `StreamAssetOrFilter`
                    if (value.getActualInstance() instanceof StreamAssetOrFilter) {
                        JsonObject obj = adapterStreamAssetOrFilter.toJsonTree((StreamAssetOrFilter)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `StreamAssetSimpleExpression`
                    if (value.getActualInstance() instanceof StreamAssetSimpleExpression) {
                        JsonObject obj = adapterStreamAssetSimpleExpression.toJsonTree((StreamAssetSimpleExpression)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: StreamAssetOrFilter, StreamAssetSimpleExpression");
                }

                @Override
                public StreamAssetFilter read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize StreamAssetOrFilter
                    try {
                        // validate the JSON object to see if any exception is thrown
                        StreamAssetOrFilter.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'StreamAssetOrFilter'");
                        StreamAssetFilter ret = new StreamAssetFilter();
                        ret.setActualInstance(adapterStreamAssetOrFilter.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'StreamAssetOrFilter'", e);
                    }

                    // deserialize StreamAssetSimpleExpression
                    try {
                        // validate the JSON object to see if any exception is thrown
                        StreamAssetSimpleExpression.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'StreamAssetSimpleExpression'");
                        StreamAssetFilter ret = new StreamAssetFilter();
                        ret.setActualInstance(adapterStreamAssetSimpleExpression.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'StreamAssetSimpleExpression'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for StreamAssetFilter: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public StreamAssetFilter() {
        super("anyOf", Boolean.FALSE);
    }

    public StreamAssetFilter(StreamAssetOrFilter o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public StreamAssetFilter(StreamAssetSimpleExpression o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("StreamAssetOrFilter", new GenericType<StreamAssetOrFilter>() {
        });
        schemas.put("StreamAssetSimpleExpression", new GenericType<StreamAssetSimpleExpression>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return StreamAssetFilter.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * StreamAssetOrFilter, StreamAssetSimpleExpression
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof StreamAssetOrFilter) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof StreamAssetSimpleExpression) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be StreamAssetOrFilter, StreamAssetSimpleExpression");
    }

    /**
     * Get the actual instance, which can be the following:
     * StreamAssetOrFilter, StreamAssetSimpleExpression
     *
     * @return The actual instance (StreamAssetOrFilter, StreamAssetSimpleExpression)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `StreamAssetOrFilter`. If the actual instance is not `StreamAssetOrFilter`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `StreamAssetOrFilter`
     * @throws ClassCastException if the instance is not `StreamAssetOrFilter`
     */
    public StreamAssetOrFilter getStreamAssetOrFilter() throws ClassCastException {
        return (StreamAssetOrFilter)super.getActualInstance();
    }

    /**
     * Get the actual instance of `StreamAssetSimpleExpression`. If the actual instance is not `StreamAssetSimpleExpression`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `StreamAssetSimpleExpression`
     * @throws ClassCastException if the instance is not `StreamAssetSimpleExpression`
     */
    public StreamAssetSimpleExpression getStreamAssetSimpleExpression() throws ClassCastException {
        return (StreamAssetSimpleExpression)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StreamAssetFilter
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with StreamAssetOrFilter
    try {
      StreamAssetOrFilter.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with StreamAssetSimpleExpression
    try {
      StreamAssetSimpleExpression.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for StreamAssetFilter with anyOf schemas: StreamAssetOrFilter, StreamAssetSimpleExpression. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of StreamAssetFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StreamAssetFilter
  * @throws IOException if the JSON string is invalid with respect to StreamAssetFilter
  */
  public static StreamAssetFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StreamAssetFilter.class);
  }

 /**
  * Convert an instance of StreamAssetFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

