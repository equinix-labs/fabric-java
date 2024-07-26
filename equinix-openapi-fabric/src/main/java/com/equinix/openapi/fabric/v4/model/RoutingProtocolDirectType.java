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

import com.fasterxml.jackson.annotation.*;

import java.util.Objects;

/**
 * RoutingProtocolDirectType
 */
@JsonPropertyOrder({
  RoutingProtocolDirectType.JSON_PROPERTY_TYPE,
  RoutingProtocolDirectType.JSON_PROPERTY_NAME,
  RoutingProtocolDirectType.JSON_PROPERTY_DIRECT_IPV4,
  RoutingProtocolDirectType.JSON_PROPERTY_DIRECT_IPV6
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RoutingProtocolDirectType {
  /**
   * Routing protocol type
   */
  public enum TypeEnum {
    DIRECT("DIRECT");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DIRECT_IPV4 = "directIpv4";
  private DirectConnectionIpv4 directIpv4;

  public static final String JSON_PROPERTY_DIRECT_IPV6 = "directIpv6";
  private DirectConnectionIpv6 directIpv6;

  public RoutingProtocolDirectType() {
  }

  public RoutingProtocolDirectType type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Routing protocol type
   * @return type
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public RoutingProtocolDirectType name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public RoutingProtocolDirectType directIpv4(DirectConnectionIpv4 directIpv4) {
    
    this.directIpv4 = directIpv4;
    return this;
  }

   /**
   * Get directIpv4
   * @return directIpv4
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIRECT_IPV4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DirectConnectionIpv4 getDirectIpv4() {
    return directIpv4;
  }


  @JsonProperty(JSON_PROPERTY_DIRECT_IPV4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirectIpv4(DirectConnectionIpv4 directIpv4) {
    this.directIpv4 = directIpv4;
  }


  public RoutingProtocolDirectType directIpv6(DirectConnectionIpv6 directIpv6) {
    
    this.directIpv6 = directIpv6;
    return this;
  }

   /**
   * Get directIpv6
   * @return directIpv6
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIRECT_IPV6)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DirectConnectionIpv6 getDirectIpv6() {
    return directIpv6;
  }


  @JsonProperty(JSON_PROPERTY_DIRECT_IPV6)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirectIpv6(DirectConnectionIpv6 directIpv6) {
    this.directIpv6 = directIpv6;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoutingProtocolDirectType routingProtocolDirectType = (RoutingProtocolDirectType) o;
    return Objects.equals(this.type, routingProtocolDirectType.type) &&
        Objects.equals(this.name, routingProtocolDirectType.name) &&
        Objects.equals(this.directIpv4, routingProtocolDirectType.directIpv4) &&
        Objects.equals(this.directIpv6, routingProtocolDirectType.directIpv6);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, directIpv4, directIpv6);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutingProtocolDirectType {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    directIpv4: ").append(toIndentedString(directIpv4)).append("\n");
    sb.append("    directIpv6: ").append(toIndentedString(directIpv6)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

