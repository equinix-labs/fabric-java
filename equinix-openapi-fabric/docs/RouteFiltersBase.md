

# RouteFiltersBase


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Route Filter type |  [optional] |
|**name** | **String** |  |  [optional] |
|**description** | **String** | Customer-provided connection description |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**notifications** | [**List&lt;SimplifiedNotification&gt;**](SimplifiedNotification.md) | Preferences for notifications on route filter configuration or status changes |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| IPV4_PREFIX_FILTER | &quot;BGP_IPv4_PREFIX_FILTER&quot; |
| IPV6_PREFIX_FILTER | &quot;BGP_IPv6_PREFIX_FILTER&quot; |



