

# SimplifiedPort

Port specification

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**serviceType** | [**ServiceTypeEnum**](#ServiceTypeEnum) | Port service Type |  [optional] |
|**encapsulation** | [**PortEncapsulation**](PortEncapsulation.md) |  |  [optional] |
|**description** | **String** | Equinix assigned response attribute for Port description |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**type** | **PortType** |  |  [optional] |
|**_interface** | [**PortInterface**](PortInterface.md) |  |  [optional] |
|**uuid** | **UUID** | Equinix assigned response attribute for  port identifier |  [optional] |
|**physicalPortsSpeed** | **Integer** | Physical Ports Speed in Mbps |  [optional] |
|**connectionsCount** | **Integer** | Equinix assigned response attribute for Connection count |  [optional] |
|**physicalPortQuantity** | **Integer** | Number of physical ports |  [optional] |
|**lag** | [**PortLAG**](PortLAG.md) |  |  [optional] |
|**usedBandwidth** | **Integer** | Equinix assigned response attribute for Port used bandwidth in Mbps |  [optional] |
|**additionalInfo** | [**List&lt;PortAdditionalInfo&gt;**](PortAdditionalInfo.md) | Port additional information |  [optional] |
|**id** | **Integer** | Equinix assigned response attribute for Port Id |  [optional] |
|**href** | **URI** | Equinix assigned response attribute for an absolute URL that is the subject of the link&#39;s context. |  [optional] [readonly] |
|**state** | **PortState** |  |  [optional] |
|**redundancy** | [**PortRedundancy**](PortRedundancy.md) |  |  [optional] |
|**settings** | [**PortSettings**](PortSettings.md) |  |  [optional] |
|**availableBandwidth** | **Integer** | Equinix assigned response attribute for Port available bandwidth in Mbps |  [optional] |
|**demarcationPoint** | [**PortDemarcationPoint**](PortDemarcationPoint.md) |  |  [optional] |
|**bandwidth** | **Integer** | Equinix assigned response attribute for Port bandwidth in Mbps |  [optional] |
|**tether** | [**PortTether**](PortTether.md) |  |  [optional] |
|**physicalPorts** | [**List&lt;PhysicalPort&gt;**](PhysicalPort.md) | Physical ports that implement this port |  [optional] |
|**cvpId** | **String** | Equinix assigned response attribute for Unique ID for a virtual port. |  [optional] |
|**name** | **String** | Equinix assigned response attribute for Port name |  [optional] |
|**location** | [**SimplifiedLocation**](SimplifiedLocation.md) |  |  [optional] |
|**operation** | [**PortOperation**](PortOperation.md) |  |  [optional] |
|**device** | [**PortDevice**](PortDevice.md) |  |  [optional] |
|**account** | [**SimplifiedAccount**](SimplifiedAccount.md) |  |  [optional] |



## Enum: ServiceTypeEnum

| Name | Value |
|---- | -----|
| EPL | &quot;EPL&quot; |
| MSP | &quot;MSP&quot; |



