

# CloudRouterCommandSearchExpression


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**property** | **String** | Possible field names to use on filters:  * &#x60;/type&#x60; - type of command  * &#x60;/name&#x60; - name of command  * &#x60;/state&#x60; - state of command  * &#x60;/request/destination&#x60; - destination of command request  * &#x60;/request/sourceConnection/uuid&#x60; - source connection uuid  * &#x60;/_*&#x60; - all-category search  |  [optional] |
|**operator** | **String** | Possible operators to use on filters:  * &#x60;&#x3D;&#x60; - equal  * &#x60;!&#x3D;&#x60; - not equal  * &#x60;&gt;&#x60; - greater than  * &#x60;&gt;&#x3D;&#x60; - greater than or equal to  * &#x60;&lt;&#x60; - less than  * &#x60;&lt;&#x3D;&#x60; - less than or equal to  * &#x60;[NOT] BETWEEN&#x60; - (not) between  * &#x60;[NOT] LIKE&#x60; - (not) like  * &#x60;[NOT] IN&#x60; - (not) in  * &#x60;~*&#x60; - case-insensitive like  |  [optional] |
|**values** | **List&lt;String&gt;** |  |  [optional] |



