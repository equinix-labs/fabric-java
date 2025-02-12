

# StreamSubscription

Stream Subscription object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Stream Subscription URI |  [optional] [readonly] |
|**uuid** | **UUID** | Equinix-assigned access point identifier |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | type |  [optional] |
|**name** | **String** | Customer-provided subscription name |  [optional] |
|**description** | **String** | Customer-provided subscription description |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Steam subscription provision state |  [optional] |
|**enabled** | **Boolean** | Stream subscription enabled status |  [optional] |
|**filters** | [**StreamSubscriptionFilter**](StreamSubscriptionFilter.md) |  |  [optional] |
|**metricSelector** | [**StreamSubscriptionSelector**](StreamSubscriptionSelector.md) |  |  [optional] |
|**eventSelector** | [**StreamSubscriptionSelector**](StreamSubscriptionSelector.md) |  |  [optional] |
|**sink** | [**StreamSubscriptionSink**](StreamSubscriptionSink.md) |  |  [optional] |
|**changeLog** | [**Changelog**](Changelog.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STREAM_SUBSCRIPTION | &quot;STREAM_SUBSCRIPTION&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| PROVISIONING | &quot;PROVISIONING&quot; |
| PROVISIONED | &quot;PROVISIONED&quot; |
| REPROVISIONING | &quot;REPROVISIONING&quot; |
| DEPROVISIONING | &quot;DEPROVISIONING&quot; |
| DEPROVISIONED | &quot;DEPROVISIONED&quot; |
| FAILED | &quot;FAILED&quot; |



