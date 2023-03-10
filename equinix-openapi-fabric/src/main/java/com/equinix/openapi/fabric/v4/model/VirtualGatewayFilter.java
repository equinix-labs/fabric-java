/*
 * Equinix Fabric API v4
 * Equinix Fabric is an advanced software-defined interconnection solution that enables you to directly, securely and dynamically connect to distributed infrastructure and digital ecosystems on platform Equinix via a single port, Customers can use Fabric to connect to: </br> 1. Cloud Service Providers - Clouds, network and other service providers.  </br> 2. Enterprises - Other Equinix customers, vendors and partners.  </br> 3. Myself - Another customer instance deployed at Equinix. </br>
 *
 * The version of the OpenAPI document: 4.4
 * Contact: api-support@equinix.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.equinix.openapi.fabric.v4.model;

import java.util.Objects;
import java.util.Arrays;
import com.equinix.openapi.fabric.v4.model.VirtualGatewayOrFilter;
import com.equinix.openapi.fabric.v4.model.VirtualGatewaySimpleExpression;
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
public class VirtualGatewayFilter extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(VirtualGatewayFilter.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!VirtualGatewayFilter.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'VirtualGatewayFilter' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<VirtualGatewayOrFilter> adapterVirtualGatewayOrFilter = gson.getDelegateAdapter(this, TypeToken.get(VirtualGatewayOrFilter.class));
            final TypeAdapter<VirtualGatewaySimpleExpression> adapterVirtualGatewaySimpleExpression = gson.getDelegateAdapter(this, TypeToken.get(VirtualGatewaySimpleExpression.class));

            return (TypeAdapter<T>) new TypeAdapter<VirtualGatewayFilter>() {
                @Override
                public void write(JsonWriter out, VirtualGatewayFilter value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `VirtualGatewayOrFilter`
                    if (value.getActualInstance() instanceof VirtualGatewayOrFilter) {
                        JsonObject obj = adapterVirtualGatewayOrFilter.toJsonTree((VirtualGatewayOrFilter)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `VirtualGatewaySimpleExpression`
                    if (value.getActualInstance() instanceof VirtualGatewaySimpleExpression) {
                        JsonObject obj = adapterVirtualGatewaySimpleExpression.toJsonTree((VirtualGatewaySimpleExpression)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: VirtualGatewayOrFilter, VirtualGatewaySimpleExpression");
                }

                @Override
                public VirtualGatewayFilter read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize VirtualGatewayOrFilter
                    try {
                        // validate the JSON object to see if any exception is thrown
                        VirtualGatewayOrFilter.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'VirtualGatewayOrFilter'");
                        VirtualGatewayFilter ret = new VirtualGatewayFilter();
                        ret.setActualInstance(adapterVirtualGatewayOrFilter.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'VirtualGatewayOrFilter'", e);
                    }

                    // deserialize VirtualGatewaySimpleExpression
                    try {
                        // validate the JSON object to see if any exception is thrown
                        VirtualGatewaySimpleExpression.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'VirtualGatewaySimpleExpression'");
                        VirtualGatewayFilter ret = new VirtualGatewayFilter();
                        ret.setActualInstance(adapterVirtualGatewaySimpleExpression.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'VirtualGatewaySimpleExpression'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for VirtualGatewayFilter: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public VirtualGatewayFilter() {
        super("anyOf", Boolean.FALSE);
    }

    public VirtualGatewayFilter(VirtualGatewayOrFilter o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public VirtualGatewayFilter(VirtualGatewaySimpleExpression o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("VirtualGatewayOrFilter", new GenericType<VirtualGatewayOrFilter>() {
        });
        schemas.put("VirtualGatewaySimpleExpression", new GenericType<VirtualGatewaySimpleExpression>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return VirtualGatewayFilter.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * VirtualGatewayOrFilter, VirtualGatewaySimpleExpression
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof VirtualGatewayOrFilter) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof VirtualGatewaySimpleExpression) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be VirtualGatewayOrFilter, VirtualGatewaySimpleExpression");
    }

    /**
     * Get the actual instance, which can be the following:
     * VirtualGatewayOrFilter, VirtualGatewaySimpleExpression
     *
     * @return The actual instance (VirtualGatewayOrFilter, VirtualGatewaySimpleExpression)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `VirtualGatewayOrFilter`. If the actual instance is not `VirtualGatewayOrFilter`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `VirtualGatewayOrFilter`
     * @throws ClassCastException if the instance is not `VirtualGatewayOrFilter`
     */
    public VirtualGatewayOrFilter getVirtualGatewayOrFilter() throws ClassCastException {
        return (VirtualGatewayOrFilter)super.getActualInstance();
    }

    /**
     * Get the actual instance of `VirtualGatewaySimpleExpression`. If the actual instance is not `VirtualGatewaySimpleExpression`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `VirtualGatewaySimpleExpression`
     * @throws ClassCastException if the instance is not `VirtualGatewaySimpleExpression`
     */
    public VirtualGatewaySimpleExpression getVirtualGatewaySimpleExpression() throws ClassCastException {
        return (VirtualGatewaySimpleExpression)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VirtualGatewayFilter
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with VirtualGatewayOrFilter
    try {
      VirtualGatewayOrFilter.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with VirtualGatewaySimpleExpression
    try {
      VirtualGatewaySimpleExpression.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for VirtualGatewayFilter with anyOf schemas: VirtualGatewayOrFilter, VirtualGatewaySimpleExpression. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of VirtualGatewayFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VirtualGatewayFilter
  * @throws IOException if the JSON string is invalid with respect to VirtualGatewayFilter
  */
  public static VirtualGatewayFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VirtualGatewayFilter.class);
  }

 /**
  * Convert an instance of VirtualGatewayFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

