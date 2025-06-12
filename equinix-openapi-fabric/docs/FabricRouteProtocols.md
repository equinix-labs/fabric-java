

# FabricRouteProtocols

The RouteProtocols schema specifies the supported routing protocols for orchestrator providers. It defines the structure and configuration options for each protocol type. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Routing protocol type |  |
|**name** | **String** |  |  [optional] |
|**uuid** | **UUID** | Equinix-assigned route protocol identifier |  [optional] |
|**bgpIpv4** | [**FabricBGPConnectionIpv4**](FabricBGPConnectionIpv4.md) |  |  |
|**customerAsn** | **Long** | Customer asn |  |
|**bgpAuthKey** | **String** | BGP authorization key |  |
|**asOverrideEnabled** | **Boolean** | Enable AS number override |  [optional] |
|**deploymentProperties** | [**TopologyProperties**](TopologyProperties.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BGP | &quot;BGP&quot; |



