

# SimplifiedPort

Port specification

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Equinix assigned response attribute for an absolute URL that is the subject of the link&#39;s context. |  [optional] [readonly] |
|**type** | **PortType** |  |  [optional] |
|**id** | **Integer** | Equinix assigned response attribute for Port Id |  [optional] |
|**uuid** | **UUID** | Equinix assigned response attribute for  port identifier |  [optional] |
|**name** | **String** | Equinix assigned response attribute for Port name |  [optional] |
|**description** | **String** | Equinix assigned response attribute for Port description |  [optional] |
|**physicalPortsSpeed** | **Integer** | Physical Ports Speed in Mbps |  [optional] |
|**connectionsCount** | **Integer** | Equinix assigned response attribute for Connection count |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**state** | **PortState** |  |  [optional] |
|**operation** | [**PortOperation**](PortOperation.md) |  |  [optional] |
|**account** | [**SimplifiedAccount**](SimplifiedAccount.md) |  |  [optional] |
|**serviceType** | [**ServiceTypeEnum**](#ServiceTypeEnum) | Port service Type |  [optional] |
|**bandwidth** | **Long** | Equinix assigned response attribute for Port bandwidth in Mbps |  [optional] |
|**availableBandwidth** | **Long** | Equinix assigned response attribute for Port available bandwidth in Mbps |  [optional] |
|**usedBandwidth** | **Long** | Equinix assigned response attribute for Port used bandwidth in Mbps |  [optional] |
|**location** | [**SimplifiedLocation**](SimplifiedLocation.md) |  |  [optional] |
|**device** | [**PortDevice**](PortDevice.md) |  |  [optional] |
|**_interface** | [**PortInterface**](PortInterface.md) |  |  [optional] |
|**tether** | [**PortTether**](PortTether.md) |  |  [optional] |
|**demarcationPoint** | [**PortDemarcationPoint**](PortDemarcationPoint.md) |  |  [optional] |
|**redundancy** | [**PortRedundancy**](PortRedundancy.md) |  |  [optional] |
|**encapsulation** | [**PortEncapsulation**](PortEncapsulation.md) |  |  [optional] |
|**lagEnabled** | **Boolean** | If LAG enabled |  [optional] |
|**_package** | [**ModelPackage**](ModelPackage.md) |  |  [optional] |
|**settings** | [**PortSettings**](PortSettings.md) |  |  [optional] |
|**physicalPortQuantity** | **Integer** | Number of physical ports |  [optional] |
|**additionalInfo** | [**List&lt;PortAdditionalInfo&gt;**](PortAdditionalInfo.md) | Port additional information |  [optional] |
|**physicalPorts** | [**List&lt;PhysicalPort&gt;**](PhysicalPort.md) | Physical ports that implement this port |  [optional] |



## Enum: ServiceTypeEnum

| Name | Value |
|---- | -----|
| EPL | &quot;EPL&quot; |
| MSP | &quot;MSP&quot; |



