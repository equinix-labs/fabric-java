

# StreamSubscriptionSinkSetting

Stream subscription sink settings

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventIndex** | **String** | event index |  [optional] |
|**metricIndex** | **String** | metric index |  [optional] |
|**source** | **String** | source |  [optional] |
|**applicationKey** | **String** | Application key |  [optional] |
|**eventUri** | **String** | event uri |  [optional] |
|**metricUri** | **String** | metric uri |  [optional] |
|**format** | [**FormatEnum**](#FormatEnum) | webhook message format |  [optional] |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| CLOUDEVENT | &quot;CLOUDEVENT&quot; |
| OPENTELEMETRY | &quot;OPENTELEMETRY&quot; |



