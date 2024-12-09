

# RouteAggregationRulesData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Route Aggregation Rules URI |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Route Aggregation type |  [optional] |
|**uuid** | **UUID** | Route Aggregation Rule identifier |  [optional] |
|**name** | **String** |  |  [optional] |
|**description** | **String** | Customer-provided Route Aggregation Rule description |  [optional] |
|**state** | **RouteAggregationRuleState** |  |  [optional] |
|**change** | [**RouteAggregationRulesChange**](RouteAggregationRulesChange.md) |  |  [optional] |
|**prefix** | **String** |  |  [optional] |
|**changeLog** | [**Changelog**](Changelog.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BGP_IPV4_PREFIX_AGGREGATION_RULE | &quot;BGP_IPv4_PREFIX_AGGREGATION_RULE&quot; |



