

# RouteFiltersChangeOperation

Route Filter change operation data

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**op** | [**OpEnum**](#OpEnum) | Handy shortcut for operation name |  |
|**path** | **String** | path inside document leading to updated parameter |  |
|**value** | [**RouteFiltersBase**](RouteFiltersBase.md) |  |  |



## Enum: OpEnum

| Name | Value |
|---- | -----|
| ADD | &quot;add&quot; |
| REPLACE | &quot;replace&quot; |
| REMOVE | &quot;remove&quot; |



