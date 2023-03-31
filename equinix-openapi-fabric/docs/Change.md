

# Change

Current state of latest connection change

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | Uniquely identifies a change |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of change |  |
|**status** | [**StatusEnum**](#StatusEnum) | Current outcome of the change flow |  [optional] |
|**createdDateTime** | **OffsetDateTime** | Set when change flow starts |  |
|**updatedDateTime** | **OffsetDateTime** | Set when change object is updated |  [optional] |
|**information** | **String** | Additional information |  [optional] |
|**data** | [**ConnectionChangeOperation**](ConnectionChangeOperation.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CREATION | &quot;CONNECTION_CREATION&quot; |
| UPDATE | &quot;CONNECTION_UPDATE&quot; |
| DELETION | &quot;CONNECTION_DELETION&quot; |
| PROVIDER_STATUS_REQUEST | &quot;CONNECTION_PROVIDER_STATUS_REQUEST&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;APPROVED&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| REJECTED | &quot;REJECTED&quot; |
| REQUESTED | &quot;REQUESTED&quot; |
| SUBMITTED_FOR_APPROVAL | &quot;SUBMITTED_FOR_APPROVAL&quot; |



