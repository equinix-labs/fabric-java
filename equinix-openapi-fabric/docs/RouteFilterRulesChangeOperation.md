

# RouteFilterRulesChangeOperation

Route Filter change operation data

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | name of  route filter rule |  |
|**description** | **String** | cust provided description |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | type of filter rule |  |
|**prefix** | **String** | given prefix (does not change) |  |
|**action** | [**ActionEnum**](#ActionEnum) | change to be made |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| IPV4_PREFIX_FILTER_RULE_UPDATE | &quot;BGP_IPv4_PREFIX_FILTER_RULE_UPDATE&quot; |
| IPV4_PREFIX_FILTER_RULE_CREATION | &quot;BGP_IPv4_PREFIX_FILTER_RULE_CREATION&quot; |
| IPV4_PREFIX_FILTER_RULE_DELETION | &quot;BGP_IPv4_PREFIX_FILTER_RULE_DELETION&quot; |
| IPV6_PREFIX_FILTER_RULE_UPDATE | &quot;BGP_IPv6_PREFIX_FILTER_RULE_UPDATE&quot; |
| IPV6_PREFIX_FILTER_RULE_CREATION | &quot;BGP_IPv6_PREFIX_FILTER_RULE_CREATION&quot; |
| IPV6_PREFIX_FILTER_RULE_DELETION | &quot;BGP_IPv6_PREFIX_FILTER_RULE_DELETION&quot; |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| PERMIT | &quot;PERMIT&quot; |
| DENY | &quot;DENY&quot; |



