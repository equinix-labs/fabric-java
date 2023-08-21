

# CloudRouterChange

Current state of latest CloudRouter change

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | Uniquely identifies a change |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of change |  |
|**status** | [**StatusEnum**](#StatusEnum) | Current outcome of the change flow |  [optional] |
|**createdDateTime** | **OffsetDateTime** | Set when change flow starts |  [optional] |
|**updatedDateTime** | **OffsetDateTime** | Set when change object is updated |  |
|**information** | **String** | Additional information |  [optional] |
|**data** | [**CloudRouterChangeOperation**](CloudRouterChangeOperation.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| UPDATE | &quot;ROUTER_UPDATE&quot; |
| PACKAGE_UPDATE | &quot;ROUTER_PACKAGE_UPDATE&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| REQUESTED | &quot;REQUESTED&quot; |



