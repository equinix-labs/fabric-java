

# Port

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
|**physicalPortsType** | [**PhysicalPortsTypeEnum**](#PhysicalPortsTypeEnum) | Physical Ports Type |  [optional] |
|**physicalPortsCount** | **Integer** |  |  [optional] |
|**connectivitySourceType** | [**ConnectivitySourceTypeEnum**](#ConnectivitySourceTypeEnum) | Port connectivity type |  [optional] |
|**bmmrType** | [**BmmrTypeEnum**](#BmmrTypeEnum) |  |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**state** | **PortState** |  |  [optional] |
|**order** | [**PortOrder**](PortOrder.md) |  |  [optional] |
|**operation** | [**PortOperation**](PortOperation.md) |  |  [optional] |
|**account** | [**SimplifiedAccount**](SimplifiedAccount.md) |  |  [optional] |
|**change** | [**PortChange**](PortChange.md) |  |  [optional] |
|**changeLog** | [**Changelog**](Changelog.md) |  |  [optional] |
|**serviceType** | [**ServiceTypeEnum**](#ServiceTypeEnum) | Port service Type |  [optional] |
|**bandwidth** | **Integer** | Equinix assigned response attribute for Port bandwidth in Mbps |  [optional] |
|**availableBandwidth** | **Integer** | Equinix assigned response attribute for Port available bandwidth in Mbps |  [optional] |
|**usedBandwidth** | **Integer** | Equinix assigned response attribute for Port used bandwidth in Mbps |  [optional] |
|**location** | [**SimplifiedLocation**](SimplifiedLocation.md) |  |  [optional] |
|**device** | [**PortDevice**](PortDevice.md) |  |  [optional] |
|**_interface** | [**PortInterface**](PortInterface.md) |  |  [optional] |
|**demarcationPointIbx** | **String** | A-side/Equinix ibx |  [optional] |
|**tetherIbx** | **String** | z-side/Equinix ibx |  [optional] |
|**demarcationPoint** | [**PortDemarcationPoint**](PortDemarcationPoint.md) |  |  [optional] |
|**redundancy** | [**PortRedundancy**](PortRedundancy.md) |  |  [optional] |
|**encapsulation** | [**PortEncapsulation**](PortEncapsulation.md) |  |  [optional] |
|**lagEnabled** | **Boolean** | If LAG enabled |  [optional] |
|**lag** | [**PortLag**](PortLag.md) |  |  [optional] |
|**asn** | **Integer** | Port ASN |  [optional] |
|**_package** | [**ModelPackage**](ModelPackage.md) |  |  [optional] |
|**settings** | [**PortSettings**](PortSettings.md) |  |  [optional] |
|**physicalPortQuantity** | **Integer** | Number of physical ports |  [optional] |
|**notifications** | [**List&lt;PortNotification&gt;**](PortNotification.md) | Notification preferences |  [optional] |
|**additionalInfo** | [**List&lt;PortAdditionalInfo&gt;**](PortAdditionalInfo.md) | Port additional information |  [optional] |
|**endCustomer** | [**EndCustomer**](EndCustomer.md) |  |  [optional] |
|**physicalPorts** | [**List&lt;PhysicalPort&gt;**](PhysicalPort.md) | Physical ports that implement this port |  [optional] |
|**loas** | [**List&lt;PortLoa&gt;**](PortLoa.md) | Port Loas |  [optional] |



## Enum: PhysicalPortsTypeEnum

| Name | Value |
|---- | -----|
| _1000BASE_LX | &quot;1000BASE_LX&quot; |
| _10GBASE_LR | &quot;10GBASE_LR&quot; |
| _100GBASE_LR4 | &quot;100GBASE_LR4&quot; |
| _10GBASE_ER | &quot;10GBASE_ER&quot; |
| _1000BASE_SX | &quot;1000BASE_SX&quot; |



## Enum: ConnectivitySourceTypeEnum

| Name | Value |
|---- | -----|
| COLO | &quot;COLO&quot; |
| BMMR | &quot;BMMR&quot; |
| REMOTE | &quot;REMOTE&quot; |



## Enum: BmmrTypeEnum

| Name | Value |
|---- | -----|
| SELF | &quot;SELF&quot; |
| EQUINIX | &quot;EQUINIX&quot; |



## Enum: ServiceTypeEnum

| Name | Value |
|---- | -----|
| EPL | &quot;EPL&quot; |
| MSP | &quot;MSP&quot; |



