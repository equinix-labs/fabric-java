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
import com.equinix.openapi.fabric.v4.model.ServiceProfileAndFilter;
import com.equinix.openapi.fabric.v4.model.ServiceProfileSimpleExpression;
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
public class ServiceProfileFilter extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ServiceProfileFilter.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ServiceProfileFilter.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ServiceProfileFilter' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ServiceProfileAndFilter> adapterServiceProfileAndFilter = gson.getDelegateAdapter(this, TypeToken.get(ServiceProfileAndFilter.class));
            final TypeAdapter<ServiceProfileSimpleExpression> adapterServiceProfileSimpleExpression = gson.getDelegateAdapter(this, TypeToken.get(ServiceProfileSimpleExpression.class));

            return (TypeAdapter<T>) new TypeAdapter<ServiceProfileFilter>() {
                @Override
                public void write(JsonWriter out, ServiceProfileFilter value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ServiceProfileAndFilter`
                    if (value.getActualInstance() instanceof ServiceProfileAndFilter) {
                        JsonObject obj = adapterServiceProfileAndFilter.toJsonTree((ServiceProfileAndFilter)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ServiceProfileSimpleExpression`
                    if (value.getActualInstance() instanceof ServiceProfileSimpleExpression) {
                        JsonObject obj = adapterServiceProfileSimpleExpression.toJsonTree((ServiceProfileSimpleExpression)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: ServiceProfileAndFilter, ServiceProfileSimpleExpression");
                }

                @Override
                public ServiceProfileFilter read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize ServiceProfileAndFilter
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ServiceProfileAndFilter.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'ServiceProfileAndFilter'");
                        ServiceProfileFilter ret = new ServiceProfileFilter();
                        ret.setActualInstance(adapterServiceProfileAndFilter.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'ServiceProfileAndFilter'", e);
                    }

                    // deserialize ServiceProfileSimpleExpression
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ServiceProfileSimpleExpression.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'ServiceProfileSimpleExpression'");
                        ServiceProfileFilter ret = new ServiceProfileFilter();
                        ret.setActualInstance(adapterServiceProfileSimpleExpression.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'ServiceProfileSimpleExpression'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for ServiceProfileFilter: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ServiceProfileFilter() {
        super("anyOf", Boolean.FALSE);
    }

    public ServiceProfileFilter(ServiceProfileAndFilter o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ServiceProfileFilter(ServiceProfileSimpleExpression o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ServiceProfileAndFilter", new GenericType<ServiceProfileAndFilter>() {
        });
        schemas.put("ServiceProfileSimpleExpression", new GenericType<ServiceProfileSimpleExpression>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ServiceProfileFilter.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * ServiceProfileAndFilter, ServiceProfileSimpleExpression
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ServiceProfileAndFilter) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ServiceProfileSimpleExpression) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ServiceProfileAndFilter, ServiceProfileSimpleExpression");
    }

    /**
     * Get the actual instance, which can be the following:
     * ServiceProfileAndFilter, ServiceProfileSimpleExpression
     *
     * @return The actual instance (ServiceProfileAndFilter, ServiceProfileSimpleExpression)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ServiceProfileAndFilter`. If the actual instance is not `ServiceProfileAndFilter`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ServiceProfileAndFilter`
     * @throws ClassCastException if the instance is not `ServiceProfileAndFilter`
     */
    public ServiceProfileAndFilter getServiceProfileAndFilter() throws ClassCastException {
        return (ServiceProfileAndFilter)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ServiceProfileSimpleExpression`. If the actual instance is not `ServiceProfileSimpleExpression`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ServiceProfileSimpleExpression`
     * @throws ClassCastException if the instance is not `ServiceProfileSimpleExpression`
     */
    public ServiceProfileSimpleExpression getServiceProfileSimpleExpression() throws ClassCastException {
        return (ServiceProfileSimpleExpression)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ServiceProfileFilter
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with ServiceProfileAndFilter
    try {
      ServiceProfileAndFilter.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with ServiceProfileSimpleExpression
    try {
      ServiceProfileSimpleExpression.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for ServiceProfileFilter with anyOf schemas: ServiceProfileAndFilter, ServiceProfileSimpleExpression. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of ServiceProfileFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServiceProfileFilter
  * @throws IOException if the JSON string is invalid with respect to ServiceProfileFilter
  */
  public static ServiceProfileFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServiceProfileFilter.class);
  }

 /**
  * Convert an instance of ServiceProfileFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

