

# PriceError

Error with details

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**errorCode** | [**ErrorCodeEnum**](#ErrorCodeEnum) |  |  |
|**errorMessage** | [**ErrorMessageEnum**](#ErrorMessageEnum) |  |  |
|**correlationId** | **String** |  |  [optional] |
|**details** | **String** |  |  [optional] |
|**help** | **String** |  |  [optional] |
|**additionalInfo** | [**List&lt;PriceErrorAdditionalInfo&gt;**](PriceErrorAdditionalInfo.md) |  |  [optional] |



## Enum: ErrorCodeEnum

| Name | Value |
|---- | -----|
| _3038010 | &quot;EQ-3038010&quot; |
| _3038022 | &quot;EQ-3038022&quot; |
| _3038030 | &quot;EQ-3038030&quot; |



## Enum: ErrorMessageEnum

| Name | Value |
|---- | -----|
| VALIDATION_FAILURE | &quot;Validation failure&quot; |
| INVALID_VALUE | &quot;Invalid value&quot; |
| INTERNAL_SERVER_ERROR | &quot;Internal Server Error&quot; |



