

# Port

Port specification

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**serviceType** | [**ServiceTypeEnum**](#ServiceTypeEnum) | Port service Type |  [optional] |
|**encapsulation** | [**PortEncapsulation**](PortEncapsulation.md) |  |  |
|**loas** | [**List&lt;PortLoa&gt;**](PortLoa.md) | Port Loas |  [optional] |
|**description** | **String** | Equinix assigned response attribute for Port description |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**type** | **PortType** |  |  |
|**_interface** | [**PortInterface**](PortInterface.md) |  |  [optional] |
|**uuid** | **UUID** | Equinix assigned response attribute for  port identifier |  [optional] |
|**physicalPortsSpeed** | **Integer** | Physical Ports Speed in Mbps |  |
|**connectionsCount** | **Integer** | Equinix assigned response attribute for Connection count |  [optional] |
|**connectivitySourceType** | [**ConnectivitySourceTypeEnum**](#ConnectivitySourceTypeEnum) | Port connectivity type |  |
|**physicalPortQuantity** | **Integer** | Number of physical ports |  [optional] |
|**lag** | [**PortLAG**](PortLAG.md) |  |  |
|**usedBandwidth** | **Integer** | Equinix assigned response attribute for Port used bandwidth in Mbps |  [optional] |
|**additionalInfo** | [**List&lt;PortAdditionalInfo&gt;**](PortAdditionalInfo.md) | Port additional information |  [optional] |
|**id** | **Integer** | Equinix assigned response attribute for Port Id |  [optional] |
|**href** | **URI** | Equinix assigned response attribute for an absolute URL that is the subject of the link&#39;s context. |  [optional] [readonly] |
|**state** | **PortState** |  |  [optional] |
|**redundancy** | [**PortRedundancy**](PortRedundancy.md) |  |  [optional] |
|**order** | [**PortOrder**](PortOrder.md) |  |  [optional] |
|**settings** | [**PortSettings**](PortSettings.md) |  |  |
|**availableBandwidth** | **Integer** | Equinix assigned response attribute for Port available bandwidth in Mbps |  [optional] |
|**demarcationPoint** | [**PortDemarcationPoint**](PortDemarcationPoint.md) |  |  [optional] |
|**bandwidth** | **Integer** | Equinix assigned response attribute for Port bandwidth in Mbps |  [optional] |
|**tether** | [**PortTether**](PortTether.md) |  |  [optional] |
|**physicalPorts** | [**List&lt;PhysicalPort&gt;**](PhysicalPort.md) | Physical ports that implement this port |  [optional] |
|**changelog** | [**Changelog**](Changelog.md) |  |  [optional] |
|**physicalPortsType** | **String** | Physical Ports Type |  |
|**cvpId** | **String** | Equinix assigned response attribute for Unique ID for a virtual port. |  [optional] |
|**name** | **String** | Equinix assigned response attribute for Port name |  [optional] |
|**location** | [**SimplifiedLocation**](SimplifiedLocation.md) |  |  |
|**operation** | [**PortOperation**](PortOperation.md) |  |  [optional] |
|**device** | [**PortDevice**](PortDevice.md) |  |  [optional] |
|**asn** | **Integer** | Port ASN |  [optional] |
|**account** | [**SimplifiedAccount**](SimplifiedAccount.md) |  |  |
|**notifications** | [**List&lt;PortNotification&gt;**](PortNotification.md) | Notification preferences |  [optional] |



## Enum: ServiceTypeEnum

| Name | Value |
|---- | -----|
| EPL | &quot;EPL&quot; |
| MSP | &quot;MSP&quot; |



## Enum: ConnectivitySourceTypeEnum

| Name | Value |
|---- | -----|
| COLO | &quot;COLO&quot; |
| BMMR | &quot;BMMR&quot; |
| REMOTE | &quot;REMOTE&quot; |



