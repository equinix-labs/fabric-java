

# RouteAggregationsData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Route Aggregation URI |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Route Aggregation type |  [optional] |
|**uuid** | **UUID** | Route Aggregation identifier |  [optional] |
|**name** | **String** |  |  [optional] |
|**description** | **String** | Customer-provided connection description |  [optional] |
|**state** | **RouteAggregationState** |  |  [optional] |
|**change** | [**RouteAggregationsChange**](RouteAggregationsChange.md) |  |  [optional] |
|**connectionsCount** | **Integer** |  |  [optional] |
|**rulesCount** | **Integer** |  |  [optional] |
|**project** | [**RouteAggregationsDataProject**](RouteAggregationsDataProject.md) |  |  [optional] |
|**changeLog** | [**Changelog**](Changelog.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| IPV4_PREFIX_AGGREGATION | &quot;BGP_IPv4_PREFIX_AGGREGATION&quot; |
| IPV6_PREFIX_AGGREGATION | &quot;BGP_IPv6_PREFIX_AGGREGATION&quot; |



