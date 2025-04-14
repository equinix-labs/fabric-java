

# PortChange

Current state of latest port change

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | Uniquely identifies a change |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of change |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Current outcome of the change flow |  [optional] |
|**information** | **String** | Additional information |  [optional] |
|**data** | [**PortChangeOperation**](PortChangeOperation.md) |  |  [optional] |
|**createdDateTime** | **OffsetDateTime** | Set when change flow starts |  [optional] |
|**updatedDateTime** | **OffsetDateTime** | Set when change object is updated |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CREATION | &quot;PORT_CREATION&quot; |
| UPDATE | &quot;PORT_UPDATE&quot; |
| DELETION | &quot;PORT_DELETION&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| REQUESTED | &quot;REQUESTED&quot; |



