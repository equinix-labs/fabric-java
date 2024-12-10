

# RouteFiltersData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Route filter URI |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Route Filter type |  [optional] |
|**uuid** | **UUID** | Route filter identifier |  [optional] |
|**name** | **String** |  |  [optional] |
|**description** | **String** | Customer-provided connection description |  [optional] |
|**state** | **RouteFilterState** |  |  [optional] |
|**change** | [**RouteFiltersChange**](RouteFiltersChange.md) |  |  [optional] |
|**notMatchedRuleAction** | [**NotMatchedRuleActionEnum**](#NotMatchedRuleActionEnum) |  |  [optional] |
|**connectionsCount** | **Integer** |  |  [optional] |
|**rulesCount** | **Integer** |  |  [optional] |
|**project** | [**RouteFiltersDataProject**](RouteFiltersDataProject.md) |  |  [optional] |
|**changelog** | [**Changelog**](Changelog.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| IPV4_PREFIX_FILTER | &quot;BGP_IPv4_PREFIX_FILTER&quot; |
| IPV6_PREFIX_FILTER | &quot;BGP_IPv6_PREFIX_FILTER&quot; |



## Enum: NotMatchedRuleActionEnum

| Name | Value |
|---- | -----|
| ALLOW | &quot;ALLOW&quot; |
| DENY | &quot;DENY&quot; |



