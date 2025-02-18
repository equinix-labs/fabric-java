

# StreamSubscriptionSink

Create Stream destination

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uri** | **String** | any publicly reachable http endpoint |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | destination type |  [optional] |
|**batchEnabled** | **Boolean** | batch mode on/off |  [optional] |
|**batchSizeMax** | **Integer** | maximum batch size |  [optional] |
|**batchWaitTimeMax** | **Integer** | maximum batch waiting time |  [optional] |
|**credential** | [**StreamSubscriptionSinkCredential**](StreamSubscriptionSinkCredential.md) |  |  [optional] |
|**settings** | [**StreamSubscriptionSinkSetting**](StreamSubscriptionSinkSetting.md) |  |  [optional] |
|**host** | **String** | sink host |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DATADOG | &quot;DATADOG&quot; |
| PAGERDUTY | &quot;PAGERDUTY&quot; |
| SPLUNK_HEC | &quot;SPLUNK_HEC&quot; |
| SLACK | &quot;SLACK&quot; |
| TEAMS | &quot;TEAMS&quot; |
| CUSTOM | &quot;CUSTOM&quot; |



