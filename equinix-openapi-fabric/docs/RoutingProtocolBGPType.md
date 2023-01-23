

# RoutingProtocolBGPType


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bgpIpv6** | [**BGPConnectionIpv6**](BGPConnectionIpv6.md) |  |  [optional] |
|**bfd** | [**RoutingProtocolBFD**](RoutingProtocolBFD.md) |  |  [optional] |
|**bgpIpv4** | [**BGPConnectionIpv4**](BGPConnectionIpv4.md) |  |  [optional] |
|**bgpAuthKey** | **String** | BGP authorization key |  [optional] |
|**equinixAsn** | **Long** | Equinix asn |  [optional] |
|**name** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Routing protocol type |  |
|**customerAsn** | **Long** | Customer asn |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BGP | &quot;BGP&quot; |
| DIRECT | &quot;DIRECT&quot; |



