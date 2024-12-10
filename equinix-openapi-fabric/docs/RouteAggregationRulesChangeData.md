

# RouteAggregationRulesChangeData

Current state of latest Route Aggregation Rules change

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Current outcome of the change flow |  [optional] |
|**createdBy** | **String** | Created by User Key |  [optional] |
|**createdDateTime** | **OffsetDateTime** | Set when change flow starts |  [optional] |
|**updatedBy** | **String** | Updated by User Key |  [optional] |
|**updatedDateTime** | **OffsetDateTime** | Set when change object is updated |  [optional] |
|**data** | [**RouteAggregationRulesChangeOperation**](RouteAggregationRulesChangeOperation.md) |  |  [optional] |
|**uuid** | **String** | Uniquely identifies a change |  |
|**type** | [**TypeEnum**](#TypeEnum) | Type of change |  |
|**href** | **URI** | Route Aggregation Change URI |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| REQUESTED | &quot;REQUESTED&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| UPDATE | &quot;BGP_IPv4_PREFIX_AGGREGATION_RULE_UPDATE&quot; |
| CREATION | &quot;BGP_IPv4_PREFIX_AGGREGATION_RULE_CREATION&quot; |
| DELETION | &quot;BGP_IPv4_PREFIX_AGGREGATION_RULE_DELETION&quot; |



