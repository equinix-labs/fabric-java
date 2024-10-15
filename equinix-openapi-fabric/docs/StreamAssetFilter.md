

# StreamAssetFilter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**property** | **String** | Possible field names to use on filters:  * &#x60;/uuid&#x60; - Asset uuid  * &#x60;/streamUuid&#x60; - Stream uuid  * &#x60;/projectId&#x60; - Asset projectId  * &#x60;/_*&#x60; - all-category search  |  [optional] |
|**operator** | **String** | Possible operators to use on filters:  * &#x60;&#x3D;&#x60; - equal  * &#x60;!&#x3D;&#x60; - not equal  * &#x60;&gt;&#x60; - greater than  * &#x60;&gt;&#x3D;&#x60; - greater than or equal to  * &#x60;&lt;&#x60; - less than  * &#x60;&lt;&#x3D;&#x60; - less than or equal to  * &#x60;[NOT] BETWEEN&#x60; - (not) between  * &#x60;[NOT] LIKE&#x60; - (not) like  * &#x60;[NOT] IN&#x60; - (not) in  * &#x60;ILIKE&#x60; - case-insensitive like  |  [optional] |
|**values** | **List&lt;String&gt;** |  |  [optional] |
|**or** | [**List&lt;StreamAssetSimpleExpression&gt;**](StreamAssetSimpleExpression.md) |  |  [optional] |



