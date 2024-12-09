

# RouteFiltersChange

Current state of latest route filter change

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | Uniquely identifies a change |  |
|**type** | [**TypeEnum**](#TypeEnum) | Type of change |  |
|**href** | **URI** | Route filter change URI |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| IPV4_PREFIX_FILTER_UPDATE | &quot;BGP_IPv4_PREFIX_FILTER_UPDATE&quot; |
| IPV4_PREFIX_FILTER_CREATION | &quot;BGP_IPv4_PREFIX_FILTER_CREATION&quot; |
| IPV4_PREFIX_FILTER_DELETION | &quot;BGP_IPv4_PREFIX_FILTER_DELETION&quot; |
| IPV6_PREFIX_FILTER_UPDATE | &quot;BGP_IPv6_PREFIX_FILTER_UPDATE&quot; |
| IPV6_PREFIX_FILTER_CREATION | &quot;BGP_IPv6_PREFIX_FILTER_CREATION&quot; |
| IPV6_PREFIX_FILTER_DELETION | &quot;BGP_IPv6_PREFIX_FILTER_DELETION&quot; |



