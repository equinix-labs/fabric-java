

# RoutingProtocolBGPData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bgpIpv6** | [**BGPConnectionIpv6**](BGPConnectionIpv6.md) |  |  [optional] |
|**bfd** | [**RoutingProtocolBFD**](RoutingProtocolBFD.md) |  |  [optional] |
|**bgpIpv4** | [**BGPConnectionIpv4**](BGPConnectionIpv4.md) |  |  [optional] |
|**equinixAsn** | **Long** | Equinix asn |  [optional] |
|**change** | [**RoutingProtocolChange**](RoutingProtocolChange.md) |  |  [optional] |
|**changelog** | [**Changelog**](Changelog.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Routing protocol type |  [optional] |
|**uuid** | **UUID** | Routing protocol identifier |  [optional] |
|**bgpAuthKey** | **String** | BGP authorization key |  [optional] |
|**name** | **String** |  |  [optional] |
|**href** | **URI** | Routing Protocol URI |  [optional] |
|**state** | [**StateEnum**](#StateEnum) |  |  [optional] |
|**operation** | [**RoutingProtocolOperation**](RoutingProtocolOperation.md) |  |  [optional] |
|**customerAsn** | **Long** | Customer asn |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BGP | &quot;BGP&quot; |
| DIRECT | &quot;DIRECT&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| PROVISIONED | &quot;PROVISIONED&quot; |
| DEPROVISIONED | &quot;DEPROVISIONED&quot; |
| PROVISIONING | &quot;PROVISIONING&quot; |
| DEPROVISIONING | &quot;DEPROVISIONING&quot; |
| REPROVISIONING | &quot;REPROVISIONING&quot; |
| FAILED | &quot;FAILED&quot; |



