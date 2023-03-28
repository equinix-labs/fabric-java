

# RoutingProtocolDirectData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Routing protocol type |  [optional] |
|**name** | **String** |  |  [optional] |
|**directIpv4** | [**DirectConnectionIpv4**](DirectConnectionIpv4.md) |  |  [optional] |
|**directIpv6** | [**DirectConnectionIpv6**](DirectConnectionIpv6.md) |  |  [optional] |
|**href** | **URI** | Routing Protocol URI |  [optional] |
|**uuid** | **UUID** | Routing protocol identifier |  [optional] |
|**state** | [**StateEnum**](#StateEnum) |  |  [optional] |
|**operation** | [**RoutingProtocolOperation**](RoutingProtocolOperation.md) |  |  [optional] |
|**change** | [**RoutingProtocolChange**](RoutingProtocolChange.md) |  |  [optional] |
|**changelog** | [**Changelog**](Changelog.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
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



