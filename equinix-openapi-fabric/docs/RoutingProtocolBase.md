

# RoutingProtocolBase


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
|**directIpv6** | [**DirectConnectionIpv6**](DirectConnectionIpv6.md) |  |  [optional] |
|**directIpv4** | [**DirectConnectionIpv4**](DirectConnectionIpv4.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DIRECT | &quot;DIRECT&quot; |
| BGP | &quot;BGP&quot; |



