

# StreamSubscriptionPostRequest

Create Stream Subscription

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**name** | **String** | Customer-provided stream subscription name |  [optional] |
|**description** | **String** | Customer-provided stream subscription description |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**enabled** | **Boolean** | Stream subscription enabled status |  [optional] |
|**stream** | [**StreamTarget**](StreamTarget.md) |  |  [optional] |
|**filters** | [**StreamSubscriptionFilter**](StreamSubscriptionFilter.md) |  |  [optional] |
|**metricSelector** | [**StreamSubscriptionSelector**](StreamSubscriptionSelector.md) |  |  [optional] |
|**eventSelector** | [**StreamSubscriptionSelector**](StreamSubscriptionSelector.md) |  |  [optional] |
|**sink** | [**StreamSubscriptionSink**](StreamSubscriptionSink.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STREAM_SUBSCRIPTION | &quot;STREAM_SUBSCRIPTION&quot; |



