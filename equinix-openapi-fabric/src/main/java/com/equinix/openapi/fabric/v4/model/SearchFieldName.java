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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Possible field names to use on filters
 */
@JsonAdapter(SearchFieldName.Adapter.class)
public enum SearchFieldName {
  
  _ISREMOTE("/isRemote"),
  
  _NAME("/name"),
  
  _UUID("/uuid"),
  
  _TYPE("/type"),
  
  _GEOSCOPE("/geoScope"),
  
  _ACCOUNT_ORGID("/account/orgId"),
  
  _ASIDE_ACCESSPOINT_ACCOUNT_ACCOUNTNAME("/aSide/accessPoint/account/accountName"),
  
  _ASIDE_ACCESSPOINT_ACCOUNT_ACCOUNTNUMBER("/aSide/accessPoint/account/accountNumber"),
  
  _ASIDE_ACCESSPOINT_ROUTER_UUID("/aSide/accessPoint/router/uuid"),
  
  _ASIDE_ACCESSPOINT_LINKPROTOCOL_VLANCTAG("/aSide/accessPoint/linkProtocol/vlanCTag"),
  
  _ASIDE_ACCESSPOINT_LINKPROTOCOL_VLANSTAG("/aSide/accessPoint/linkProtocol/vlanSTag"),
  
  _ASIDE_ACCESSPOINT_LINKPROTOCOL_VLANTAGMIN("/aSide/accessPoint/linkProtocol/vlanTagMin"),
  
  _ASIDE_ACCESSPOINT_LINKPROTOCOL_VLANTAGMAX("/aSide/accessPoint/linkProtocol/vlanTagMax"),
  
  _ASIDE_ACCESSPOINT_LOCATION_METROCODE("/aSide/accessPoint/location/metroCode"),
  
  _ASIDE_ACCESSPOINT_LOCATION_METRONAME("/aSide/accessPoint/location/metroName"),
  
  _ASIDE_ACCESSPOINT_NAME("/aSide/accessPoint/name"),
  
  _ASIDE_ACCESSPOINT_PORT_UUID("/aSide/accessPoint/port/uuid"),
  
  _ASIDE_ACCESSPOINT_PORT_NAME("/aSide/accessPoint/port/name"),
  
  _ASIDE_ACCESSPOINT_TYPE("/aSide/accessPoint/type"),
  
  _ASIDE_ACCESSPOINT_VIRTUALDEVICE_NAME("/aSide/accessPoint/virtualDevice/name"),
  
  _ASIDE_ACCESSPOINT_VIRTUALDEVICE_UUID("/aSide/accessPoint/virtualDevice/uuid"),
  
  _ASIDE_SERVICETOKEN_UUID("/aSide/serviceToken/uuid"),
  
  _CHANGE_STATUS("/change/status"),
  
  _OPERATION_EQUINIXSTATUS("/operation/equinixStatus"),
  
  _OPERATION_PROVIDERSTATUS("/operation/providerStatus"),
  
  _PROJECT_PROJECTID("/project/projectId"),
  
  _REDUNDANCY_GROUP("/redundancy/group"),
  
  _REDUNDANCY_PRIORITY("/redundancy/priority"),
  
  _ZSIDE_ACCESSPOINT_ACCOUNT_ACCOUNTNAME("/zSide/accessPoint/account/accountName"),
  
  _ZSIDE_ACCESSPOINT_AUTHENTICATIONKEY("/zSide/accessPoint/authenticationKey"),
  
  _ZSIDE_ACCESSPOINT_LINKPROTOCOL_VLANCTAG("/zSide/accessPoint/linkProtocol/vlanCTag"),
  
  _ZSIDE_ACCESSPOINT_LINKPROTOCOL_VLANSTAG("/zSide/accessPoint/linkProtocol/vlanSTag"),
  
  _ZSIDE_ACCESSPOINT_LINKPROTOCOL_VLANTAGMIN("/zSide/accessPoint/linkProtocol/vlanTagMin"),
  
  _ZSIDE_ACCESSPOINT_LINKPROTOCOL_VLANTAGMAX("/zSide/accessPoint/linkProtocol/vlanTagMax"),
  
  _ZSIDE_ACCESSPOINT_LOCATION_METROCODE("/zSide/accessPoint/location/metroCode"),
  
  _ZSIDE_ACCESSPOINT_LOCATION_METRONAME("/zSide/accessPoint/location/metroName"),
  
  _ZSIDE_ACCESSPOINT_NAME("/zSide/accessPoint/name"),
  
  _ZSIDE_ACCESSPOINT_PORT_UUID("/zSide/accessPoint/port/uuid"),
  
  _ZSIDE_ACCESSPOINT_NETWORK_UUID("/zSide/accessPoint/network/uuid"),
  
  _ZSIDE_ACCESSPOINT_PORT_NAME("/zSide/accessPoint/port/name"),
  
  _ZSIDE_ACCESSPOINT_PROFILE_UUID("/zSide/accessPoint/profile/uuid"),
  
  _ZSIDE_ACCESSPOINT_TYPE("/zSide/accessPoint/type"),
  
  _ZSIDE_ACCESSPOINT_VIRTUALDEVICE_NAME("/zSide/accessPoint/virtualDevice/name"),
  
  _ZSIDE_ACCESSPOINT_VIRTUALDEVICE_UUID("/zSide/accessPoint/virtualDevice/uuid"),
  
  _ZSIDE_SERVICETOKEN_UUID("/zSide/serviceToken/uuid"),
  
  STAR("*");

  private String value;

  SearchFieldName(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SearchFieldName fromValue(String value) {
    for (SearchFieldName b : SearchFieldName.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SearchFieldName> {
    @Override
    public void write(final JsonWriter jsonWriter, final SearchFieldName enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SearchFieldName read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SearchFieldName.fromValue(value);
    }
  }
}

