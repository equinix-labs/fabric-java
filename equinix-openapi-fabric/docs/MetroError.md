

# MetroError

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
| _3036001 | &quot;EQ-3036001&quot; |
| _3036013 | &quot;EQ-3036013&quot; |
| _3036030 | &quot;EQ-3036030&quot; |
| _3036100 | &quot;EQ-3036100&quot; |



## Enum: ErrorMessageEnum

| Name | Value |
|---- | -----|
| UNAUTHORIZED | &quot;Unauthorized&quot; |
| INVALID_QUERY_PARAMETER | &quot;Invalid Query Parameter&quot; |
| INVALID_PATH_PARAMETER | &quot;Invalid Path Parameter&quot; |
| INVALID_QUERY_OR_PATH_PARAMETER | &quot;Invalid Query or Path Parameter&quot; |
| INTERNAL_SERVER_ERROR | &quot;Internal Server Error&quot; |
| METRO_NOT_FOUND | &quot;Metro Not Found&quot; |



