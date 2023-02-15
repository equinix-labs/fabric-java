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
import com.equinix.openapi.fabric.v4.model.PhysicalPort;
import com.equinix.openapi.fabric.v4.model.PortAdditionalInfo;
import com.equinix.openapi.fabric.v4.model.PortDemarcationPoint;
import com.equinix.openapi.fabric.v4.model.PortDevice;
import com.equinix.openapi.fabric.v4.model.PortEncapsulation;
import com.equinix.openapi.fabric.v4.model.PortInterface;
import com.equinix.openapi.fabric.v4.model.PortLAG;
import com.equinix.openapi.fabric.v4.model.PortOperation;
import com.equinix.openapi.fabric.v4.model.PortRedundancy;
import com.equinix.openapi.fabric.v4.model.PortSettings;
import com.equinix.openapi.fabric.v4.model.PortState;
import com.equinix.openapi.fabric.v4.model.PortTether;
import com.equinix.openapi.fabric.v4.model.PortType;
import com.equinix.openapi.fabric.v4.model.Project;
import com.equinix.openapi.fabric.v4.model.SimplifiedAccount;
import com.equinix.openapi.fabric.v4.model.SimplifiedLocation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.equinix.openapi.fabric.JSON;

/**
 * Port specification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SimplifiedPort {
  /**
   * Port service Type
   */
  @JsonAdapter(ServiceTypeEnum.Adapter.class)
  public enum ServiceTypeEnum {
    EPL("EPL"),
    
    MSP("MSP");

    private String value;

    ServiceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ServiceTypeEnum fromValue(String value) {
      for (ServiceTypeEnum b : ServiceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ServiceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ServiceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ServiceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ServiceTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SERVICE_TYPE = "serviceType";
  @SerializedName(SERIALIZED_NAME_SERVICE_TYPE)
  private ServiceTypeEnum serviceType;

  public static final String SERIALIZED_NAME_ENCAPSULATION = "encapsulation";
  @SerializedName(SERIALIZED_NAME_ENCAPSULATION)
  private PortEncapsulation encapsulation;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private Project project;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private PortType type;

  public static final String SERIALIZED_NAME_INTERFACE = "interface";
  @SerializedName(SERIALIZED_NAME_INTERFACE)
  private PortInterface _interface;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private UUID uuid;

  public static final String SERIALIZED_NAME_PHYSICAL_PORTS_SPEED = "physicalPortsSpeed";
  @SerializedName(SERIALIZED_NAME_PHYSICAL_PORTS_SPEED)
  private Integer physicalPortsSpeed;

  public static final String SERIALIZED_NAME_CONNECTIONS_COUNT = "connectionsCount";
  @SerializedName(SERIALIZED_NAME_CONNECTIONS_COUNT)
  private Integer connectionsCount;

  public static final String SERIALIZED_NAME_PHYSICAL_PORT_QUANTITY = "physicalPortQuantity";
  @SerializedName(SERIALIZED_NAME_PHYSICAL_PORT_QUANTITY)
  private Integer physicalPortQuantity;

  public static final String SERIALIZED_NAME_LAG = "lag";
  @SerializedName(SERIALIZED_NAME_LAG)
  private PortLAG lag;

  public static final String SERIALIZED_NAME_USED_BANDWIDTH = "usedBandwidth";
  @SerializedName(SERIALIZED_NAME_USED_BANDWIDTH)
  private Integer usedBandwidth;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additionalInfo";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  private List<PortAdditionalInfo> additionalInfo = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private PortState state;

  public static final String SERIALIZED_NAME_REDUNDANCY = "redundancy";
  @SerializedName(SERIALIZED_NAME_REDUNDANCY)
  private PortRedundancy redundancy;

  public static final String SERIALIZED_NAME_SETTINGS = "settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private PortSettings settings;

  public static final String SERIALIZED_NAME_AVAILABLE_BANDWIDTH = "availableBandwidth";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_BANDWIDTH)
  private Integer availableBandwidth;

  public static final String SERIALIZED_NAME_DEMARCATION_POINT = "demarcationPoint";
  @SerializedName(SERIALIZED_NAME_DEMARCATION_POINT)
  private PortDemarcationPoint demarcationPoint;

  public static final String SERIALIZED_NAME_BANDWIDTH = "bandwidth";
  @SerializedName(SERIALIZED_NAME_BANDWIDTH)
  private Integer bandwidth;

  public static final String SERIALIZED_NAME_TETHER = "tether";
  @SerializedName(SERIALIZED_NAME_TETHER)
  private PortTether tether;

  public static final String SERIALIZED_NAME_PHYSICAL_PORTS = "physicalPorts";
  @SerializedName(SERIALIZED_NAME_PHYSICAL_PORTS)
  private List<PhysicalPort> physicalPorts = null;

  public static final String SERIALIZED_NAME_CVP_ID = "cvpId";
  @SerializedName(SERIALIZED_NAME_CVP_ID)
  private String cvpId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private SimplifiedLocation location;

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private PortOperation operation;

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private PortDevice device;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private SimplifiedAccount account;

  public SimplifiedPort() {
  }

  
  public SimplifiedPort(
     URI href
  ) {
    this();
    this.href = href;
  }

  public SimplifiedPort serviceType(ServiceTypeEnum serviceType) {
    
    this.serviceType = serviceType;
    return this;
  }

   /**
   * Port service Type
   * @return serviceType
  **/
  @javax.annotation.Nullable

  public ServiceTypeEnum getServiceType() {
    return serviceType;
  }


  public void setServiceType(ServiceTypeEnum serviceType) {
    this.serviceType = serviceType;
  }


  public SimplifiedPort encapsulation(PortEncapsulation encapsulation) {
    
    this.encapsulation = encapsulation;
    return this;
  }

   /**
   * Get encapsulation
   * @return encapsulation
  **/
  @javax.annotation.Nullable

  public PortEncapsulation getEncapsulation() {
    return encapsulation;
  }


  public void setEncapsulation(PortEncapsulation encapsulation) {
    this.encapsulation = encapsulation;
  }


  public SimplifiedPort description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Equinix assigned response attribute for Port description
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SimplifiedPort project(Project project) {
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @javax.annotation.Nullable

  public Project getProject() {
    return project;
  }


  public void setProject(Project project) {
    this.project = project;
  }


  public SimplifiedPort type(PortType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable

  public PortType getType() {
    return type;
  }


  public void setType(PortType type) {
    this.type = type;
  }


  public SimplifiedPort _interface(PortInterface _interface) {
    
    this._interface = _interface;
    return this;
  }

   /**
   * Get _interface
   * @return _interface
  **/
  @javax.annotation.Nullable

  public PortInterface getInterface() {
    return _interface;
  }


  public void setInterface(PortInterface _interface) {
    this._interface = _interface;
  }


  public SimplifiedPort uuid(UUID uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Equinix assigned response attribute for  port identifier
   * @return uuid
  **/
  @javax.annotation.Nullable

  public UUID getUuid() {
    return uuid;
  }


  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }


  public SimplifiedPort physicalPortsSpeed(Integer physicalPortsSpeed) {
    
    this.physicalPortsSpeed = physicalPortsSpeed;
    return this;
  }

   /**
   * Physical Ports Speed in Mbps
   * minimum: 0
   * @return physicalPortsSpeed
  **/
  @javax.annotation.Nullable

  public Integer getPhysicalPortsSpeed() {
    return physicalPortsSpeed;
  }


  public void setPhysicalPortsSpeed(Integer physicalPortsSpeed) {
    this.physicalPortsSpeed = physicalPortsSpeed;
  }


  public SimplifiedPort connectionsCount(Integer connectionsCount) {
    
    this.connectionsCount = connectionsCount;
    return this;
  }

   /**
   * Equinix assigned response attribute for Connection count
   * minimum: 0
   * @return connectionsCount
  **/
  @javax.annotation.Nullable

  public Integer getConnectionsCount() {
    return connectionsCount;
  }


  public void setConnectionsCount(Integer connectionsCount) {
    this.connectionsCount = connectionsCount;
  }


  public SimplifiedPort physicalPortQuantity(Integer physicalPortQuantity) {
    
    this.physicalPortQuantity = physicalPortQuantity;
    return this;
  }

   /**
   * Number of physical ports
   * @return physicalPortQuantity
  **/
  @javax.annotation.Nullable

  public Integer getPhysicalPortQuantity() {
    return physicalPortQuantity;
  }


  public void setPhysicalPortQuantity(Integer physicalPortQuantity) {
    this.physicalPortQuantity = physicalPortQuantity;
  }


  public SimplifiedPort lag(PortLAG lag) {
    
    this.lag = lag;
    return this;
  }

   /**
   * Get lag
   * @return lag
  **/
  @javax.annotation.Nullable

  public PortLAG getLag() {
    return lag;
  }


  public void setLag(PortLAG lag) {
    this.lag = lag;
  }


  public SimplifiedPort usedBandwidth(Integer usedBandwidth) {
    
    this.usedBandwidth = usedBandwidth;
    return this;
  }

   /**
   * Equinix assigned response attribute for Port used bandwidth in Mbps
   * minimum: 0
   * @return usedBandwidth
  **/
  @javax.annotation.Nullable

  public Integer getUsedBandwidth() {
    return usedBandwidth;
  }


  public void setUsedBandwidth(Integer usedBandwidth) {
    this.usedBandwidth = usedBandwidth;
  }


  public SimplifiedPort additionalInfo(List<PortAdditionalInfo> additionalInfo) {
    
    this.additionalInfo = additionalInfo;
    return this;
  }

  public SimplifiedPort addAdditionalInfoItem(PortAdditionalInfo additionalInfoItem) {
    if (this.additionalInfo == null) {
      this.additionalInfo = new ArrayList<>();
    }
    this.additionalInfo.add(additionalInfoItem);
    return this;
  }

   /**
   * Port additional information
   * @return additionalInfo
  **/
  @javax.annotation.Nullable

  public List<PortAdditionalInfo> getAdditionalInfo() {
    return additionalInfo;
  }


  public void setAdditionalInfo(List<PortAdditionalInfo> additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  public SimplifiedPort id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Equinix assigned response attribute for Port Id
   * @return id
  **/
  @javax.annotation.Nullable

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


   /**
   * Equinix assigned response attribute for an absolute URL that is the subject of the link&#39;s context.
   * @return href
  **/
  @javax.annotation.Nullable

  public URI getHref() {
    return href;
  }




  public SimplifiedPort state(PortState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable

  public PortState getState() {
    return state;
  }


  public void setState(PortState state) {
    this.state = state;
  }


  public SimplifiedPort redundancy(PortRedundancy redundancy) {
    
    this.redundancy = redundancy;
    return this;
  }

   /**
   * Get redundancy
   * @return redundancy
  **/
  @javax.annotation.Nullable

  public PortRedundancy getRedundancy() {
    return redundancy;
  }


  public void setRedundancy(PortRedundancy redundancy) {
    this.redundancy = redundancy;
  }


  public SimplifiedPort settings(PortSettings settings) {
    
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nullable

  public PortSettings getSettings() {
    return settings;
  }


  public void setSettings(PortSettings settings) {
    this.settings = settings;
  }


  public SimplifiedPort availableBandwidth(Integer availableBandwidth) {
    
    this.availableBandwidth = availableBandwidth;
    return this;
  }

   /**
   * Equinix assigned response attribute for Port available bandwidth in Mbps
   * minimum: 0
   * @return availableBandwidth
  **/
  @javax.annotation.Nullable

  public Integer getAvailableBandwidth() {
    return availableBandwidth;
  }


  public void setAvailableBandwidth(Integer availableBandwidth) {
    this.availableBandwidth = availableBandwidth;
  }


  public SimplifiedPort demarcationPoint(PortDemarcationPoint demarcationPoint) {
    
    this.demarcationPoint = demarcationPoint;
    return this;
  }

   /**
   * Get demarcationPoint
   * @return demarcationPoint
  **/
  @javax.annotation.Nullable

  public PortDemarcationPoint getDemarcationPoint() {
    return demarcationPoint;
  }


  public void setDemarcationPoint(PortDemarcationPoint demarcationPoint) {
    this.demarcationPoint = demarcationPoint;
  }


  public SimplifiedPort bandwidth(Integer bandwidth) {
    
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Equinix assigned response attribute for Port bandwidth in Mbps
   * minimum: 0
   * @return bandwidth
  **/
  @javax.annotation.Nullable

  public Integer getBandwidth() {
    return bandwidth;
  }


  public void setBandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
  }


  public SimplifiedPort tether(PortTether tether) {
    
    this.tether = tether;
    return this;
  }

   /**
   * Get tether
   * @return tether
  **/
  @javax.annotation.Nullable

  public PortTether getTether() {
    return tether;
  }


  public void setTether(PortTether tether) {
    this.tether = tether;
  }


  public SimplifiedPort physicalPorts(List<PhysicalPort> physicalPorts) {
    
    this.physicalPorts = physicalPorts;
    return this;
  }

  public SimplifiedPort addPhysicalPortsItem(PhysicalPort physicalPortsItem) {
    if (this.physicalPorts == null) {
      this.physicalPorts = new ArrayList<>();
    }
    this.physicalPorts.add(physicalPortsItem);
    return this;
  }

   /**
   * Physical ports that implement this port
   * @return physicalPorts
  **/
  @javax.annotation.Nullable

  public List<PhysicalPort> getPhysicalPorts() {
    return physicalPorts;
  }


  public void setPhysicalPorts(List<PhysicalPort> physicalPorts) {
    this.physicalPorts = physicalPorts;
  }


  public SimplifiedPort cvpId(String cvpId) {
    
    this.cvpId = cvpId;
    return this;
  }

   /**
   * Equinix assigned response attribute for Unique ID for a virtual port.
   * @return cvpId
  **/
  @javax.annotation.Nullable

  public String getCvpId() {
    return cvpId;
  }


  public void setCvpId(String cvpId) {
    this.cvpId = cvpId;
  }


  public SimplifiedPort name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Equinix assigned response attribute for Port name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SimplifiedPort location(SimplifiedLocation location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable

  public SimplifiedLocation getLocation() {
    return location;
  }


  public void setLocation(SimplifiedLocation location) {
    this.location = location;
  }


  public SimplifiedPort operation(PortOperation operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @javax.annotation.Nullable

  public PortOperation getOperation() {
    return operation;
  }


  public void setOperation(PortOperation operation) {
    this.operation = operation;
  }


  public SimplifiedPort device(PortDevice device) {
    
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @javax.annotation.Nullable

  public PortDevice getDevice() {
    return device;
  }


  public void setDevice(PortDevice device) {
    this.device = device;
  }


  public SimplifiedPort account(SimplifiedAccount account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nullable

  public SimplifiedAccount getAccount() {
    return account;
  }


  public void setAccount(SimplifiedAccount account) {
    this.account = account;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the SimplifiedPort instance itself
   */
  public SimplifiedPort putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimplifiedPort simplifiedPort = (SimplifiedPort) o;
    return Objects.equals(this.serviceType, simplifiedPort.serviceType) &&
        Objects.equals(this.encapsulation, simplifiedPort.encapsulation) &&
        Objects.equals(this.description, simplifiedPort.description) &&
        Objects.equals(this.project, simplifiedPort.project) &&
        Objects.equals(this.type, simplifiedPort.type) &&
        Objects.equals(this._interface, simplifiedPort._interface) &&
        Objects.equals(this.uuid, simplifiedPort.uuid) &&
        Objects.equals(this.physicalPortsSpeed, simplifiedPort.physicalPortsSpeed) &&
        Objects.equals(this.connectionsCount, simplifiedPort.connectionsCount) &&
        Objects.equals(this.physicalPortQuantity, simplifiedPort.physicalPortQuantity) &&
        Objects.equals(this.lag, simplifiedPort.lag) &&
        Objects.equals(this.usedBandwidth, simplifiedPort.usedBandwidth) &&
        Objects.equals(this.additionalInfo, simplifiedPort.additionalInfo) &&
        Objects.equals(this.id, simplifiedPort.id) &&
        Objects.equals(this.href, simplifiedPort.href) &&
        Objects.equals(this.state, simplifiedPort.state) &&
        Objects.equals(this.redundancy, simplifiedPort.redundancy) &&
        Objects.equals(this.settings, simplifiedPort.settings) &&
        Objects.equals(this.availableBandwidth, simplifiedPort.availableBandwidth) &&
        Objects.equals(this.demarcationPoint, simplifiedPort.demarcationPoint) &&
        Objects.equals(this.bandwidth, simplifiedPort.bandwidth) &&
        Objects.equals(this.tether, simplifiedPort.tether) &&
        Objects.equals(this.physicalPorts, simplifiedPort.physicalPorts) &&
        Objects.equals(this.cvpId, simplifiedPort.cvpId) &&
        Objects.equals(this.name, simplifiedPort.name) &&
        Objects.equals(this.location, simplifiedPort.location) &&
        Objects.equals(this.operation, simplifiedPort.operation) &&
        Objects.equals(this.device, simplifiedPort.device) &&
        Objects.equals(this.account, simplifiedPort.account)&&
        Objects.equals(this.additionalProperties, simplifiedPort.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceType, encapsulation, description, project, type, _interface, uuid, physicalPortsSpeed, connectionsCount, physicalPortQuantity, lag, usedBandwidth, additionalInfo, id, href, state, redundancy, settings, availableBandwidth, demarcationPoint, bandwidth, tether, physicalPorts, cvpId, name, location, operation, device, account, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimplifiedPort {\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    encapsulation: ").append(toIndentedString(encapsulation)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    _interface: ").append(toIndentedString(_interface)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    physicalPortsSpeed: ").append(toIndentedString(physicalPortsSpeed)).append("\n");
    sb.append("    connectionsCount: ").append(toIndentedString(connectionsCount)).append("\n");
    sb.append("    physicalPortQuantity: ").append(toIndentedString(physicalPortQuantity)).append("\n");
    sb.append("    lag: ").append(toIndentedString(lag)).append("\n");
    sb.append("    usedBandwidth: ").append(toIndentedString(usedBandwidth)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    redundancy: ").append(toIndentedString(redundancy)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    availableBandwidth: ").append(toIndentedString(availableBandwidth)).append("\n");
    sb.append("    demarcationPoint: ").append(toIndentedString(demarcationPoint)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    tether: ").append(toIndentedString(tether)).append("\n");
    sb.append("    physicalPorts: ").append(toIndentedString(physicalPorts)).append("\n");
    sb.append("    cvpId: ").append(toIndentedString(cvpId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("serviceType");
    openapiFields.add("encapsulation");
    openapiFields.add("description");
    openapiFields.add("project");
    openapiFields.add("type");
    openapiFields.add("interface");
    openapiFields.add("uuid");
    openapiFields.add("physicalPortsSpeed");
    openapiFields.add("connectionsCount");
    openapiFields.add("physicalPortQuantity");
    openapiFields.add("lag");
    openapiFields.add("usedBandwidth");
    openapiFields.add("additionalInfo");
    openapiFields.add("id");
    openapiFields.add("href");
    openapiFields.add("state");
    openapiFields.add("redundancy");
    openapiFields.add("settings");
    openapiFields.add("availableBandwidth");
    openapiFields.add("demarcationPoint");
    openapiFields.add("bandwidth");
    openapiFields.add("tether");
    openapiFields.add("physicalPorts");
    openapiFields.add("cvpId");
    openapiFields.add("name");
    openapiFields.add("location");
    openapiFields.add("operation");
    openapiFields.add("device");
    openapiFields.add("account");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SimplifiedPort
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SimplifiedPort.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SimplifiedPort is not found in the empty JSON string", SimplifiedPort.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("serviceType") != null && !jsonObj.get("serviceType").isJsonNull()) && !jsonObj.get("serviceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceType").toString()));
      }
      // validate the optional field `encapsulation`
      if (jsonObj.get("encapsulation") != null && !jsonObj.get("encapsulation").isJsonNull()) {
        PortEncapsulation.validateJsonObject(jsonObj.getAsJsonObject("encapsulation"));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `project`
      if (jsonObj.get("project") != null && !jsonObj.get("project").isJsonNull()) {
        Project.validateJsonObject(jsonObj.getAsJsonObject("project"));
      }
      // validate the optional field `interface`
      if (jsonObj.get("interface") != null && !jsonObj.get("interface").isJsonNull()) {
        PortInterface.validateJsonObject(jsonObj.getAsJsonObject("interface"));
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      // validate the optional field `lag`
      if (jsonObj.get("lag") != null && !jsonObj.get("lag").isJsonNull()) {
        PortLAG.validateJsonObject(jsonObj.getAsJsonObject("lag"));
      }
      if (jsonObj.get("additionalInfo") != null && !jsonObj.get("additionalInfo").isJsonNull()) {
        JsonArray jsonArrayadditionalInfo = jsonObj.getAsJsonArray("additionalInfo");
        if (jsonArrayadditionalInfo != null) {
          // ensure the json data is an array
          if (!jsonObj.get("additionalInfo").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `additionalInfo` to be an array in the JSON string but got `%s`", jsonObj.get("additionalInfo").toString()));
          }

          // validate the optional field `additionalInfo` (array)
          for (int i = 0; i < jsonArrayadditionalInfo.size(); i++) {
            PortAdditionalInfo.validateJsonObject(jsonArrayadditionalInfo.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      // validate the optional field `redundancy`
      if (jsonObj.get("redundancy") != null && !jsonObj.get("redundancy").isJsonNull()) {
        PortRedundancy.validateJsonObject(jsonObj.getAsJsonObject("redundancy"));
      }
      // validate the optional field `settings`
      if (jsonObj.get("settings") != null && !jsonObj.get("settings").isJsonNull()) {
        PortSettings.validateJsonObject(jsonObj.getAsJsonObject("settings"));
      }
      // validate the optional field `demarcationPoint`
      if (jsonObj.get("demarcationPoint") != null && !jsonObj.get("demarcationPoint").isJsonNull()) {
        PortDemarcationPoint.validateJsonObject(jsonObj.getAsJsonObject("demarcationPoint"));
      }
      // validate the optional field `tether`
      if (jsonObj.get("tether") != null && !jsonObj.get("tether").isJsonNull()) {
        PortTether.validateJsonObject(jsonObj.getAsJsonObject("tether"));
      }
      if (jsonObj.get("physicalPorts") != null && !jsonObj.get("physicalPorts").isJsonNull()) {
        JsonArray jsonArrayphysicalPorts = jsonObj.getAsJsonArray("physicalPorts");
        if (jsonArrayphysicalPorts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("physicalPorts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `physicalPorts` to be an array in the JSON string but got `%s`", jsonObj.get("physicalPorts").toString()));
          }

          // validate the optional field `physicalPorts` (array)
          for (int i = 0; i < jsonArrayphysicalPorts.size(); i++) {
            PhysicalPort.validateJsonObject(jsonArrayphysicalPorts.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("cvpId") != null && !jsonObj.get("cvpId").isJsonNull()) && !jsonObj.get("cvpId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cvpId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cvpId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        SimplifiedLocation.validateJsonObject(jsonObj.getAsJsonObject("location"));
      }
      // validate the optional field `operation`
      if (jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonNull()) {
        PortOperation.validateJsonObject(jsonObj.getAsJsonObject("operation"));
      }
      // validate the optional field `device`
      if (jsonObj.get("device") != null && !jsonObj.get("device").isJsonNull()) {
        PortDevice.validateJsonObject(jsonObj.getAsJsonObject("device"));
      }
      // validate the optional field `account`
      if (jsonObj.get("account") != null && !jsonObj.get("account").isJsonNull()) {
        SimplifiedAccount.validateJsonObject(jsonObj.getAsJsonObject("account"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SimplifiedPort.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SimplifiedPort' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SimplifiedPort> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SimplifiedPort.class));

       return (TypeAdapter<T>) new TypeAdapter<SimplifiedPort>() {
           @Override
           public void write(JsonWriter out, SimplifiedPort value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public SimplifiedPort read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SimplifiedPort instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SimplifiedPort given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SimplifiedPort
  * @throws IOException if the JSON string is invalid with respect to SimplifiedPort
  */
  public static SimplifiedPort fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SimplifiedPort.class);
  }

 /**
  * Convert an instance of SimplifiedPort to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
