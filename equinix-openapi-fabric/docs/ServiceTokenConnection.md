

# ServiceTokenConnection

Service Token Connection Type Information

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowRemoteConnection** | **Boolean** | Authorization to connect remotely |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of Connection |  |
|**aSide** | [**ServiceTokenSide**](ServiceTokenSide.md) |  |  [optional] |
|**bandwidthLimit** | **Integer** | Connection bandwidth limit in Mbps |  [optional] |
|**supportedBandwidths** | **List&lt;Integer&gt;** | List of permitted bandwidths. |  [optional] |
|**zSide** | [**ServiceTokenSide**](ServiceTokenSide.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EVPL_VC | &quot;EVPL_VC&quot; |



