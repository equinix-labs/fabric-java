

# RouteFilterChangeData

Current state of latest route filter change

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Current outcome of the change flow |  [optional] |
|**createdBy** | **String** | Created by user key |  [optional] |
|**createdDateTime** | **OffsetDateTime** | Set when change flow starts |  [optional] |
|**updatedBy** | **String** | Updated by user key |  [optional] |
|**updatedDateTime** | **OffsetDateTime** | Set when change object is updated |  [optional] |
|**information** | **String** | Additional information |  [optional] |
|**data** | [**RouteFiltersChangeOperation**](RouteFiltersChangeOperation.md) |  |  [optional] |
|**uuid** | **String** | Uniquely identifies a change |  |
|**type** | [**TypeEnum**](#TypeEnum) | Type of change |  |
|**href** | **URI** | Route filter change URI |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| REQUESTED | &quot;REQUESTED&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| IPV4_PREFIX_FILTER_UPDATE | &quot;BGP_IPv4_PREFIX_FILTER_UPDATE&quot; |
| IPV4_PREFIX_FILTER_CREATION | &quot;BGP_IPv4_PREFIX_FILTER_CREATION&quot; |
| IPV4_PREFIX_FILTER_DELETION | &quot;BGP_IPv4_PREFIX_FILTER_DELETION&quot; |
| IPV6_PREFIX_FILTER_UPDATE | &quot;BGP_IPv6_PREFIX_FILTER_UPDATE&quot; |
| IPV6_PREFIX_FILTER_CREATION | &quot;BGP_IPv6_PREFIX_FILTER_CREATION&quot; |
| IPV6_PREFIX_FILTER_DELETION | &quot;BGP_IPv6_PREFIX_FILTER_DELETION&quot; |



