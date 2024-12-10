

# RouteFilterRulesData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Route Filter Rules URI |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Route filter type |  [optional] |
|**uuid** | **UUID** | Route Filter Rule identifier |  [optional] |
|**name** | **String** |  |  [optional] |
|**description** | **String** | Customer-provided Route Filter Rule description |  [optional] |
|**state** | **RouteFilterRuleState** |  |  [optional] |
|**prefixMatch** | **String** | prefix matching operator |  [optional] |
|**change** | [**RouteFilterRulesChange**](RouteFilterRulesChange.md) |  |  [optional] |
|**action** | [**ActionEnum**](#ActionEnum) |  |  [optional] |
|**prefix** | **String** |  |  [optional] |
|**changelog** | [**Changelog**](Changelog.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| IPV4_PREFIX_FILTER_RULE | &quot;BGP_IPv4_PREFIX_FILTER_RULE&quot; |
| IPV6_PREFIX_FILTER_RULE | &quot;BGP_IPv6_PREFIX_FILTER_RULE&quot; |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| PERMIT | &quot;PERMIT&quot; |
| DENY | &quot;DENY&quot; |



