

# ServiceTokenConnection

Service Token Connection Type Information

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Type of Connection |  [optional] |
|**href** | **URI** | An absolute URL that is the subject of the link&#39;s context. |  [optional] [readonly] |
|**uuid** | **UUID** | Equinix-assigned connection identifier |  [optional] |
|**allowRemoteConnection** | **Boolean** | Authorization to connect remotely |  [optional] |
|**allowCustomBandwidth** | **Boolean** | Allow custom bandwidth value |  [optional] |
|**bandwidthLimit** | **Integer** | Connection bandwidth limit in Mbps |  [optional] |
|**supportedBandwidths** | **List&lt;Integer&gt;** | List of permitted bandwidths. |  [optional] |
|**aSide** | [**ServiceTokenSide**](ServiceTokenSide.md) |  |  [optional] |
|**zSide** | [**ServiceTokenSide**](ServiceTokenSide.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EVPL_VC | &quot;EVPL_VC&quot; |
| EPL_VC | &quot;EPL_VC&quot; |
| EVPLAN_VC | &quot;EVPLAN_VC&quot; |
| EPLAN_VC | &quot;EPLAN_VC&quot; |
| IPWAN_VC | &quot;IPWAN_VC&quot; |
| IP_VC | &quot;IP_VC&quot; |
| EVPTREE_VC | &quot;EVPTREE_VC&quot; |
| EPTREE_VC | &quot;EPTREE_VC&quot; |



