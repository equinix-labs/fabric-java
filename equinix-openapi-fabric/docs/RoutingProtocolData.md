

# RoutingProtocolData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Routing protocol type |  [optional] |
|**name** | **String** |  |  [optional] |
|**bgpIpv4** | [**BGPConnectionIpv4**](BGPConnectionIpv4.md) |  |  [optional] |
|**bgpIpv6** | [**BGPConnectionIpv6**](BGPConnectionIpv6.md) |  |  [optional] |
|**customerAsn** | **Long** | Customer asn |  [optional] |
|**equinixAsn** | **Long** | Equinix asn |  [optional] |
|**bgpAuthKey** | **String** | BGP authorization key |  [optional] |
|**asOverrideEnabled** | **Boolean** | Enable AS number override |  [optional] |
|**bfd** | [**RoutingProtocolBFD**](RoutingProtocolBFD.md) |  |  [optional] |
|**href** | **URI** | Routing Protocol URI |  [optional] |
|**uuid** | **UUID** | Routing protocol identifier |  [optional] |
|**state** | [**StateEnum**](#StateEnum) |  |  [optional] |
|**operation** | [**RoutingProtocolOperation**](RoutingProtocolOperation.md) |  |  [optional] |
|**change** | [**RoutingProtocolChange**](RoutingProtocolChange.md) |  |  [optional] |
|**changelog** | [**Changelog**](Changelog.md) |  |  [optional] |
|**directIpv4** | [**DirectConnectionIpv4**](DirectConnectionIpv4.md) |  |  [optional] |
|**directIpv6** | [**DirectConnectionIpv6**](DirectConnectionIpv6.md) |  |  [optional] |



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



