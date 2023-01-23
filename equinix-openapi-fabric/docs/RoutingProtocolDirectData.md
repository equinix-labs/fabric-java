

# RoutingProtocolDirectData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**directIpv6** | [**DirectConnectionIpv6**](DirectConnectionIpv6.md) |  |  [optional] |
|**change** | [**RoutingProtocolChange**](RoutingProtocolChange.md) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**changelog** | [**Changelog**](Changelog.md) |  |  [optional] |
|**href** | **URI** | Routing Protocol URI |  [optional] |
|**state** | [**StateEnum**](#StateEnum) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Routing protocol type |  [optional] |
|**directIpv4** | [**DirectConnectionIpv4**](DirectConnectionIpv4.md) |  |  [optional] |
|**uuid** | **UUID** | Routing protocol identifier |  [optional] |
|**operation** | [**RoutingProtocolOperation**](RoutingProtocolOperation.md) |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| PROVISIONED | &quot;PROVISIONED&quot; |
| DEPROVISIONED | &quot;DEPROVISIONED&quot; |
| PROVISIONING | &quot;PROVISIONING&quot; |
| DEPROVISIONING | &quot;DEPROVISIONING&quot; |
| REPROVISIONING | &quot;REPROVISIONING&quot; |
| FAILED | &quot;FAILED&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DIRECT | &quot;DIRECT&quot; |
| BGP | &quot;BGP&quot; |



