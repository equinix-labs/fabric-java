

# PhysicalPort

Physical Port specification

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Equinix assigned response attribute for an absolute URL that is the subject of the link&#39;s context. |  [optional] [readonly] |
|**type** | **PhysicalPortType** |  |  [optional] |
|**id** | **Integer** | Equinix assigned response attribute for Physical Port Id |  [optional] |
|**state** | **PortState** |  |  [optional] |
|**account** | [**SimplifiedAccount**](SimplifiedAccount.md) |  |  [optional] |
|**interfaceSpeed** | **Integer** | Physical Port Speed in Mbps |  [optional] |
|**interfaceType** | **String** | Physical Port Interface Type |  [optional] |
|**uuid** | **UUID** | Equinix assigned response attribute for physical port identifier |  [optional] |
|**tether** | [**PortTether**](PortTether.md) |  |  [optional] |
|**demarcationPoint** | [**PortDemarcationPoint**](PortDemarcationPoint.md) |  |  [optional] |
|**settings** | [**PhysicalPortSettings**](PhysicalPortSettings.md) |  |  [optional] |
|**_interface** | [**PortInterface**](PortInterface.md) |  |  [optional] |
|**notifications** | [**List&lt;PortNotification&gt;**](PortNotification.md) | Notification preferences |  [optional] |
|**additionalInfo** | [**List&lt;PortAdditionalInfo&gt;**](PortAdditionalInfo.md) | Physical Port additional information |  [optional] |
|**order** | [**PortOrder**](PortOrder.md) |  |  [optional] |
|**operation** | [**PortOperation**](PortOperation.md) |  |  [optional] |
|**loas** | [**List&lt;PortLoa&gt;**](PortLoa.md) | Port Loas |  [optional] |



