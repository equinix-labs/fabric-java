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
import com.equinix.openapi.fabric.v4.model.AddOperation;
import com.equinix.openapi.fabric.v4.model.OpEnum;
import com.equinix.openapi.fabric.v4.model.RemoveOperation;
import com.equinix.openapi.fabric.v4.model.ReplaceOperation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
public class JsonPatchOperation extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(JsonPatchOperation.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!JsonPatchOperation.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'JsonPatchOperation' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AddOperation> adapterAddOperation = gson.getDelegateAdapter(this, TypeToken.get(AddOperation.class));
            final TypeAdapter<RemoveOperation> adapterRemoveOperation = gson.getDelegateAdapter(this, TypeToken.get(RemoveOperation.class));
            final TypeAdapter<ReplaceOperation> adapterReplaceOperation = gson.getDelegateAdapter(this, TypeToken.get(ReplaceOperation.class));

            return (TypeAdapter<T>) new TypeAdapter<JsonPatchOperation>() {
                @Override
                public void write(JsonWriter out, JsonPatchOperation value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `AddOperation`
                    if (value.getActualInstance() instanceof AddOperation) {
                        JsonObject obj = adapterAddOperation.toJsonTree((AddOperation)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `RemoveOperation`
                    if (value.getActualInstance() instanceof RemoveOperation) {
                        JsonObject obj = adapterRemoveOperation.toJsonTree((RemoveOperation)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ReplaceOperation`
                    if (value.getActualInstance() instanceof ReplaceOperation) {
                        JsonObject obj = adapterReplaceOperation.toJsonTree((ReplaceOperation)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: AddOperation, RemoveOperation, ReplaceOperation");
                }

                @Override
                public JsonPatchOperation read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize AddOperation
                    try {
                        // validate the JSON object to see if any exception is thrown
                        AddOperation.validateJsonObject(jsonObject);
                        actualAdapter = adapterAddOperation;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'AddOperation'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for AddOperation failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'AddOperation'", e);
                    }

                    // deserialize RemoveOperation
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RemoveOperation.validateJsonObject(jsonObject);
                        actualAdapter = adapterRemoveOperation;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RemoveOperation'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RemoveOperation failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RemoveOperation'", e);
                    }

                    // deserialize ReplaceOperation
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ReplaceOperation.validateJsonObject(jsonObject);
                        actualAdapter = adapterReplaceOperation;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ReplaceOperation'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ReplaceOperation failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ReplaceOperation'", e);
                    }

                    if (match == 1) {
                        JsonPatchOperation ret = new JsonPatchOperation();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for JsonPatchOperation: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public JsonPatchOperation() {
        super("oneOf", Boolean.FALSE);
    }

    public JsonPatchOperation(AddOperation o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public JsonPatchOperation(RemoveOperation o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public JsonPatchOperation(ReplaceOperation o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AddOperation", new GenericType<AddOperation>() {
        });
        schemas.put("RemoveOperation", new GenericType<RemoveOperation>() {
        });
        schemas.put("ReplaceOperation", new GenericType<ReplaceOperation>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return JsonPatchOperation.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AddOperation, RemoveOperation, ReplaceOperation
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof AddOperation) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RemoveOperation) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ReplaceOperation) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AddOperation, RemoveOperation, ReplaceOperation");
    }

    /**
     * Get the actual instance, which can be the following:
     * AddOperation, RemoveOperation, ReplaceOperation
     *
     * @return The actual instance (AddOperation, RemoveOperation, ReplaceOperation)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AddOperation`. If the actual instance is not `AddOperation`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AddOperation`
     * @throws ClassCastException if the instance is not `AddOperation`
     */
    public AddOperation getAddOperation() throws ClassCastException {
        return (AddOperation)super.getActualInstance();
    }

    /**
     * Get the actual instance of `RemoveOperation`. If the actual instance is not `RemoveOperation`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RemoveOperation`
     * @throws ClassCastException if the instance is not `RemoveOperation`
     */
    public RemoveOperation getRemoveOperation() throws ClassCastException {
        return (RemoveOperation)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ReplaceOperation`. If the actual instance is not `ReplaceOperation`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ReplaceOperation`
     * @throws ClassCastException if the instance is not `ReplaceOperation`
     */
    public ReplaceOperation getReplaceOperation() throws ClassCastException {
        return (ReplaceOperation)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JsonPatchOperation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with AddOperation
    try {
      AddOperation.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for AddOperation failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with RemoveOperation
    try {
      RemoveOperation.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for RemoveOperation failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ReplaceOperation
    try {
      ReplaceOperation.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ReplaceOperation failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for JsonPatchOperation with oneOf schemas: AddOperation, RemoveOperation, ReplaceOperation. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of JsonPatchOperation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JsonPatchOperation
  * @throws IOException if the JSON string is invalid with respect to JsonPatchOperation
  */
  public static JsonPatchOperation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JsonPatchOperation.class);
  }

 /**
  * Convert an instance of JsonPatchOperation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

