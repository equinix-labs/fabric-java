

# StreamAlertRule

Stream object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Stream Alert Rule URI |  [optional] [readonly] |
|**uuid** | **UUID** | Equinix-assigned access point identifier |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Stream subscription type |  [optional] |
|**name** | **String** | Customer-provided stream alert rule name |  [optional] |
|**description** | **String** | Customer-provided stream alert rule description |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Steam subscription provision state |  [optional] |
|**enabled** | **Boolean** | Stream alert rule enabled status |  [optional] |
|**metricName** | **String** | Stream alert rule metric name |  [optional] |
|**resourceSelector** | [**ResourceSelector**](ResourceSelector.md) |  |  [optional] |
|**windowSize** | **String** | Stream alert rule metric window size |  [optional] |
|**operand** | [**OperandEnum**](#OperandEnum) | Stream alert rule metric operand |  [optional] |
|**warningThreshold** | **String** | Stream alert rule metric warning threshold |  [optional] |
|**criticalThreshold** | **String** | Stream alert rule metric critical threshold |  [optional] |
|**changeLog** | [**Changelog**](Changelog.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| METRIC_ALERT | &quot;METRIC_ALERT&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |



## Enum: OperandEnum

| Name | Value |
|---- | -----|
| ABOVE | &quot;ABOVE&quot; |
| BELOW | &quot;BELOW&quot; |



