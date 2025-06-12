

# FabricRoutingProtocolBGPType

Defines the structure for BGP routing protocol configuration, including protocol type, BGP IPv4 settings, customer ASN, authentication key, and deployment properties. 

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



