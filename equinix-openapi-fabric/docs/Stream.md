

# Stream

Stream object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Stream URI |  [optional] [readonly] |
|**uuid** | **UUID** | Equinix-assigned access point identifier |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Stream provision state |  [optional] |
|**assetsCount** | **Integer** | Stream assets count |  [optional] |
|**streamSubscriptionsCount** | **Integer** | Stream subscriptions count |  [optional] |
|**changeLog** | [**Changelog**](Changelog.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**name** | **String** | Customer-provided stream name |  [optional] |
|**description** | **String** | Customer-provided stream description |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| PROVISIONING | &quot;PROVISIONING&quot; |
| PROVISIONED | &quot;PROVISIONED&quot; |
| REPROVISIONING | &quot;REPROVISIONING&quot; |
| DEPROVISIONING | &quot;DEPROVISIONING&quot; |
| DEPROVISIONED | &quot;DEPROVISIONED&quot; |
| FAILED | &quot;FAILED&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TELEMETRY_STREAM | &quot;TELEMETRY_STREAM&quot; |



