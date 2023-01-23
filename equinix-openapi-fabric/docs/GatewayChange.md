

# GatewayChange

Current state of latest gateway change

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | [**VirtualGatewayChangeOperation**](VirtualGatewayChangeOperation.md) |  |  [optional] |
|**createdDateTime** | **OffsetDateTime** | Set when change flow starts |  [optional] |
|**information** | **String** | Additional information |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of change |  |
|**uuid** | **String** | Uniquely identifies a change |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Current outcome of the change flow |  [optional] |
|**updatedDateTime** | **OffsetDateTime** | Set when change object is updated |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| UPDATE | &quot;GATEWAY_UPDATE&quot; |
| PACKAGE_UPDATE | &quot;GATEWAY_PACKAGE_UPDATE&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| REQUESTED | &quot;REQUESTED&quot; |



