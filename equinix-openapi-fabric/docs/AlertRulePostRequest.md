

# AlertRulePostRequest

Create Stream Alert Rules

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**name** | **String** | Customer-provided stream name |  [optional] |
|**description** | **String** | Customer-provided stream description |  [optional] |
|**enabled** | **Boolean** | Stream alert rule enabled status |  [optional] |
|**metricName** | **String** | Stream alert rule metric name |  [optional] |
|**resourceSelector** | [**ResourceSelector**](ResourceSelector.md) |  |  [optional] |
|**windowSize** | **String** | Stream alert rule metric window size |  [optional] |
|**operand** | [**OperandEnum**](#OperandEnum) | Stream alert rule metric operand |  [optional] |
|**warningThreshold** | **String** | Stream alert rule metric warning threshold |  [optional] |
|**criticalThreshold** | **String** | Stream alert rule metric critical threshold |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| METRIC_ALERT | &quot;METRIC_ALERT&quot; |



## Enum: OperandEnum

| Name | Value |
|---- | -----|
| ABOVE | &quot;ABOVE&quot; |
| BELOW | &quot;BELOW&quot; |



