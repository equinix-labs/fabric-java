/*
 * Equinix Fabric API v4
 * Equinix Fabric is an advanced software-defined interconnection solution that enables you to directly, securely and dynamically connect to distributed infrastructure and digital ecosystems on platform Equinix via a single port, Customers can use Fabric to connect to: </br> 1. Cloud Service Providers - Clouds, network and other service providers.  </br> 2. Enterprises - Other Equinix customers, vendors and partners.  </br> 3. Myself - Another customer instance deployed at Equinix. </br> </br> <b>Integrations (SDKs, Tools) links:</b></br> <a href=\"https://deploy.equinix.com/labs/fabric-java\\\">Fabric Java SDK</a> </br> <a href=\"https://deploy.equinix.com/labs/equinix-sdk-go\\\">Fabric Go SDK</a> </br> <a href=\"https://deploy.equinix.com/labs/terraform-provider-equinix\\\">Equinix Terraform Provider</a> </br> <a href=\"https://deploy.equinix.com/labs/terraform-equinix-fabric\\\">Fabric Terraform Modules</a> </br> <a href=\"https://deploy.equinix.com/labs/pulumi-provider-equinix/\">Equinix Pulumi Provider</a> </br>
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
import com.equinix.openapi.fabric.v4.model.LinkProtocolDot1q;
import com.equinix.openapi.fabric.v4.model.LinkProtocolEvpnVxlan;
import com.equinix.openapi.fabric.v4.model.LinkProtocolIpv4Ipv6Config;
import com.equinix.openapi.fabric.v4.model.LinkProtocolQinq;
import com.equinix.openapi.fabric.v4.model.LinkProtocolType;
import com.equinix.openapi.fabric.v4.model.LinkProtocolUntagged;
import com.equinix.openapi.fabric.v4.model.LinkProtocolVxlan;
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
public class LinkProtocol extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(LinkProtocol.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!LinkProtocol.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'LinkProtocol' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<LinkProtocolDot1q> adapterLinkProtocolDot1q = gson.getDelegateAdapter(this, TypeToken.get(LinkProtocolDot1q.class));
            final TypeAdapter<LinkProtocolEvpnVxlan> adapterLinkProtocolEvpnVxlan = gson.getDelegateAdapter(this, TypeToken.get(LinkProtocolEvpnVxlan.class));
            final TypeAdapter<LinkProtocolQinq> adapterLinkProtocolQinq = gson.getDelegateAdapter(this, TypeToken.get(LinkProtocolQinq.class));
            final TypeAdapter<LinkProtocolUntagged> adapterLinkProtocolUntagged = gson.getDelegateAdapter(this, TypeToken.get(LinkProtocolUntagged.class));
            final TypeAdapter<LinkProtocolVxlan> adapterLinkProtocolVxlan = gson.getDelegateAdapter(this, TypeToken.get(LinkProtocolVxlan.class));

            return (TypeAdapter<T>) new TypeAdapter<LinkProtocol>() {
                @Override
                public void write(JsonWriter out, LinkProtocol value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `LinkProtocolDot1q`
                    if (value.getActualInstance() instanceof LinkProtocolDot1q) {
                        JsonObject obj = adapterLinkProtocolDot1q.toJsonTree((LinkProtocolDot1q)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `LinkProtocolEvpnVxlan`
                    if (value.getActualInstance() instanceof LinkProtocolEvpnVxlan) {
                        JsonObject obj = adapterLinkProtocolEvpnVxlan.toJsonTree((LinkProtocolEvpnVxlan)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `LinkProtocolQinq`
                    if (value.getActualInstance() instanceof LinkProtocolQinq) {
                        JsonObject obj = adapterLinkProtocolQinq.toJsonTree((LinkProtocolQinq)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `LinkProtocolUntagged`
                    if (value.getActualInstance() instanceof LinkProtocolUntagged) {
                        JsonObject obj = adapterLinkProtocolUntagged.toJsonTree((LinkProtocolUntagged)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `LinkProtocolVxlan`
                    if (value.getActualInstance() instanceof LinkProtocolVxlan) {
                        JsonObject obj = adapterLinkProtocolVxlan.toJsonTree((LinkProtocolVxlan)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: LinkProtocolDot1q, LinkProtocolEvpnVxlan, LinkProtocolQinq, LinkProtocolUntagged, LinkProtocolVxlan");
                }

                @Override
                public LinkProtocol read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize LinkProtocolDot1q
                    try {
                        // validate the JSON object to see if any exception is thrown
                        LinkProtocolDot1q.validateJsonObject(jsonObject);
                        actualAdapter = adapterLinkProtocolDot1q;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'LinkProtocolDot1q'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for LinkProtocolDot1q failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'LinkProtocolDot1q'", e);
                    }

                    // deserialize LinkProtocolEvpnVxlan
                    try {
                        // validate the JSON object to see if any exception is thrown
                        LinkProtocolEvpnVxlan.validateJsonObject(jsonObject);
                        actualAdapter = adapterLinkProtocolEvpnVxlan;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'LinkProtocolEvpnVxlan'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for LinkProtocolEvpnVxlan failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'LinkProtocolEvpnVxlan'", e);
                    }

                    // deserialize LinkProtocolQinq
                    try {
                        // validate the JSON object to see if any exception is thrown
                        LinkProtocolQinq.validateJsonObject(jsonObject);
                        actualAdapter = adapterLinkProtocolQinq;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'LinkProtocolQinq'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for LinkProtocolQinq failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'LinkProtocolQinq'", e);
                    }

                    // deserialize LinkProtocolUntagged
                    try {
                        // validate the JSON object to see if any exception is thrown
                        LinkProtocolUntagged.validateJsonObject(jsonObject);
                        actualAdapter = adapterLinkProtocolUntagged;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'LinkProtocolUntagged'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for LinkProtocolUntagged failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'LinkProtocolUntagged'", e);
                    }

                    // deserialize LinkProtocolVxlan
                    try {
                        // validate the JSON object to see if any exception is thrown
                        LinkProtocolVxlan.validateJsonObject(jsonObject);
                        actualAdapter = adapterLinkProtocolVxlan;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'LinkProtocolVxlan'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for LinkProtocolVxlan failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'LinkProtocolVxlan'", e);
                    }

                    if (match == 1) {
                        LinkProtocol ret = new LinkProtocol();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for LinkProtocol: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public LinkProtocol() {
        super("oneOf", Boolean.FALSE);
    }

    public LinkProtocol(LinkProtocolDot1q o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public LinkProtocol(LinkProtocolEvpnVxlan o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public LinkProtocol(LinkProtocolQinq o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public LinkProtocol(LinkProtocolUntagged o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public LinkProtocol(LinkProtocolVxlan o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("LinkProtocolDot1q", new GenericType<LinkProtocolDot1q>() {
        });
        schemas.put("LinkProtocolEvpnVxlan", new GenericType<LinkProtocolEvpnVxlan>() {
        });
        schemas.put("LinkProtocolQinq", new GenericType<LinkProtocolQinq>() {
        });
        schemas.put("LinkProtocolUntagged", new GenericType<LinkProtocolUntagged>() {
        });
        schemas.put("LinkProtocolVxlan", new GenericType<LinkProtocolVxlan>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return LinkProtocol.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * LinkProtocolDot1q, LinkProtocolEvpnVxlan, LinkProtocolQinq, LinkProtocolUntagged, LinkProtocolVxlan
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof LinkProtocolDot1q) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof LinkProtocolEvpnVxlan) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof LinkProtocolQinq) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof LinkProtocolUntagged) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof LinkProtocolVxlan) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be LinkProtocolDot1q, LinkProtocolEvpnVxlan, LinkProtocolQinq, LinkProtocolUntagged, LinkProtocolVxlan");
    }

    /**
     * Get the actual instance, which can be the following:
     * LinkProtocolDot1q, LinkProtocolEvpnVxlan, LinkProtocolQinq, LinkProtocolUntagged, LinkProtocolVxlan
     *
     * @return The actual instance (LinkProtocolDot1q, LinkProtocolEvpnVxlan, LinkProtocolQinq, LinkProtocolUntagged, LinkProtocolVxlan)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `LinkProtocolDot1q`. If the actual instance is not `LinkProtocolDot1q`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LinkProtocolDot1q`
     * @throws ClassCastException if the instance is not `LinkProtocolDot1q`
     */
    public LinkProtocolDot1q getLinkProtocolDot1q() throws ClassCastException {
        return (LinkProtocolDot1q)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LinkProtocolEvpnVxlan`. If the actual instance is not `LinkProtocolEvpnVxlan`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LinkProtocolEvpnVxlan`
     * @throws ClassCastException if the instance is not `LinkProtocolEvpnVxlan`
     */
    public LinkProtocolEvpnVxlan getLinkProtocolEvpnVxlan() throws ClassCastException {
        return (LinkProtocolEvpnVxlan)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LinkProtocolQinq`. If the actual instance is not `LinkProtocolQinq`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LinkProtocolQinq`
     * @throws ClassCastException if the instance is not `LinkProtocolQinq`
     */
    public LinkProtocolQinq getLinkProtocolQinq() throws ClassCastException {
        return (LinkProtocolQinq)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LinkProtocolUntagged`. If the actual instance is not `LinkProtocolUntagged`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LinkProtocolUntagged`
     * @throws ClassCastException if the instance is not `LinkProtocolUntagged`
     */
    public LinkProtocolUntagged getLinkProtocolUntagged() throws ClassCastException {
        return (LinkProtocolUntagged)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LinkProtocolVxlan`. If the actual instance is not `LinkProtocolVxlan`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LinkProtocolVxlan`
     * @throws ClassCastException if the instance is not `LinkProtocolVxlan`
     */
    public LinkProtocolVxlan getLinkProtocolVxlan() throws ClassCastException {
        return (LinkProtocolVxlan)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LinkProtocol
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with LinkProtocolDot1q
    try {
      LinkProtocolDot1q.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for LinkProtocolDot1q failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with LinkProtocolEvpnVxlan
    try {
      LinkProtocolEvpnVxlan.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for LinkProtocolEvpnVxlan failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with LinkProtocolQinq
    try {
      LinkProtocolQinq.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for LinkProtocolQinq failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with LinkProtocolUntagged
    try {
      LinkProtocolUntagged.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for LinkProtocolUntagged failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with LinkProtocolVxlan
    try {
      LinkProtocolVxlan.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for LinkProtocolVxlan failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for LinkProtocol with oneOf schemas: LinkProtocolDot1q, LinkProtocolEvpnVxlan, LinkProtocolQinq, LinkProtocolUntagged, LinkProtocolVxlan. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of LinkProtocol given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LinkProtocol
  * @throws IOException if the JSON string is invalid with respect to LinkProtocol
  */
  public static LinkProtocol fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LinkProtocol.class);
  }

 /**
  * Convert an instance of LinkProtocol to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

