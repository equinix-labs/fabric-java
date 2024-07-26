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
 * SortItem
 */
@JsonPropertyOrder({
  SortItem.JSON_PROPERTY_PROPERTY,
  SortItem.JSON_PROPERTY_DIRECTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SortItem {
  /**
   * Possible field names to use on sorting
   */
  public enum PropertyEnum {
    TYPE("/type"),
    
    UUID("/uuid"),
    
    NAME("/name"),
    
    PROJECT_PROJECTID("/project/projectId"),
    
    STATE("/state"),
    
    NOTMATCHEDRULEACTION("/notMatchedRuleAction"),
    
    CONNECTIONSCOUNT("/connectionsCount"),
    
    CHANGELOG_CREATEDDATETIME("/changeLog/createdDateTime"),
    
    CHANGELOG_UPDATEDDATETIME("/changeLog/updatedDateTime");

    private String value;

    PropertyEnum(String value) {
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
    public static PropertyEnum fromValue(String value) {
      for (PropertyEnum b : PropertyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PROPERTY = "property";
  private PropertyEnum property = PropertyEnum.CHANGELOG_UPDATEDDATETIME;

  /**
   * Sorting direction
   */
  public enum DirectionEnum {
    DESC("DESC"),
    
    ASC("ASC");

    private String value;

    DirectionEnum(String value) {
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
    public static DirectionEnum fromValue(String value) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private DirectionEnum direction = DirectionEnum.DESC;

  public SortItem() {
  }

  public SortItem property(PropertyEnum property) {
    
    this.property = property;
    return this;
  }

   /**
   * Possible field names to use on sorting
   * @return property
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PropertyEnum getProperty() {
    return property;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProperty(PropertyEnum property) {
    this.property = property;
  }


  public SortItem direction(DirectionEnum direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Sorting direction
   * @return direction
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DirectionEnum getDirection() {
    return direction;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SortItem sortItem = (SortItem) o;
    return Objects.equals(this.property, sortItem.property) &&
        Objects.equals(this.direction, sortItem.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(property, direction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SortItem {\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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

