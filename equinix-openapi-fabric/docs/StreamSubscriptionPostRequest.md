

# StreamSubscriptionPostRequest

Create Stream Subscription

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**name** | **String** | Customer-provided stream subscription name |  [optional] |
|**description** | **String** | Customer-provided stream subscription description |  [optional] |
|**enabled** | **Boolean** | Stream subscription enabled status |  [optional] |
|**metricSelector** | [**StreamSubscriptionSelector**](StreamSubscriptionSelector.md) |  |  [optional] |
|**eventSelector** | [**StreamSubscriptionSelector**](StreamSubscriptionSelector.md) |  |  [optional] |
|**sink** | [**StreamSubscriptionSink**](StreamSubscriptionSink.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STREAM_SUBSCRIPTION | &quot;STREAM_SUBSCRIPTION&quot; |



