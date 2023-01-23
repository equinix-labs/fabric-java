

# RoutingProtocolChangeData

Current state of latest Routing Protocol change

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**updatedBy** | **String** | Updated by User Key |  [optional] |
|**data** | [**RoutingProtocolChangeOperation**](RoutingProtocolChangeOperation.md) |  |  [optional] |
|**createdBy** | **String** | Created by User Key |  [optional] |
|**createdDateTime** | **OffsetDateTime** | Set when change flow starts |  [optional] |
|**information** | **String** | Additional information |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Current outcome of the change flow |  [optional] |
|**updatedDateTime** | **OffsetDateTime** | Set when change object is updated |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of change |  |
|**uuid** | **String** | Uniquely identifies a change |  |
|**href** | **URI** | Routing Protocol Change URI |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| REQUESTED | &quot;REQUESTED&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| UPDATE | &quot;ROUTING_PROTOCOL_UPDATE&quot; |
| CREATION | &quot;ROUTING_PROTOCOL_CREATION&quot; |
| DELETION | &quot;ROUTING_PROTOCOL_DELETION&quot; |



