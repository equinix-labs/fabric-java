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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * the operation to be performed
 */
@JsonAdapter(OpEnum.Adapter.class)
public enum OpEnum {
  
  ADD("add"),
  
  REMOVE("remove"),
  
  REPLACE("replace");

  private String value;

  OpEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OpEnum fromValue(String value) {
    for (OpEnum b : OpEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OpEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final OpEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OpEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OpEnum.fromValue(value);
    }
  }
}

