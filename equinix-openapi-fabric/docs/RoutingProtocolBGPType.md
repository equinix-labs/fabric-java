

# RoutingProtocolBGPType


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Routing protocol type |  |
|**name** | **String** |  |  [optional] |
|**bgpIpv4** | [**BGPConnectionIpv4**](BGPConnectionIpv4.md) |  |  [optional] |
|**bgpIpv6** | [**BGPConnectionIpv6**](BGPConnectionIpv6.md) |  |  [optional] |
|**customerAsn** | **Long** | Customer asn |  [optional] |
|**equinixAsn** | **Long** | Equinix asn |  [optional] |
|**bgpAuthKey** | **String** | BGP authorization key |  [optional] |
|**asOverrideEnabled** | **Boolean** | Enable AS number override |  [optional] |
|**bfd** | [**RoutingProtocolBFD**](RoutingProtocolBFD.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BGP | &quot;BGP&quot; |



