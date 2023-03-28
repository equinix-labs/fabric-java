

# PhysicalPort

Physical Port specification

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **PhysicalPortType** |  |  [optional] |
|**id** | **Integer** | Equinix assigned response attribute for Physical Port Id |  [optional] |
|**href** | **URI** | Equinix assigned response attribute for an absolute URL that is the subject of the link&#39;s context. |  [optional] [readonly] |
|**state** | **PortState** |  |  [optional] |
|**interfaceSpeed** | **Integer** | Physical Port Speed in Mbps |  [optional] |
|**interfaceType** | **String** | Physical Port Interface Type |  [optional] |
|**tether** | [**PortTether**](PortTether.md) |  |  [optional] |
|**demarcationPoint** | [**PortDemarcationPoint**](PortDemarcationPoint.md) |  |  [optional] |
|**additionalInfo** | [**List&lt;PortAdditionalInfo&gt;**](PortAdditionalInfo.md) | Physical Port additional information |  [optional] |
|**order** | [**PortOrder**](PortOrder.md) |  |  [optional] |
|**operation** | [**PortOperation**](PortOperation.md) |  |  [optional] |
|**loas** | [**List&lt;PortLoa&gt;**](PortLoa.md) | Port Loas |  [optional] |



