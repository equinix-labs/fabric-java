

# ServiceProfileFilter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**property** | **String** | Possible field names to use on filters:  * &#x60;/name&#x60; - Service Profile name  * &#x60;/uuid&#x60; - Service Profile uuid  * &#x60;/state&#x60; - Service Profile status  * &#x60;/metros/code&#x60; - Service Profile metro code  * &#x60;/visibility&#x60; - Service Profile package  * &#x60;/type&#x60; - Service Profile package  * &#x60;/project/projectId&#x60; - Service Profile project id  |  [optional] |
|**operator** | **String** | Possible operators to use on filters:  * &#x60;&#x3D;&#x60; - equal  |  [optional] |
|**values** | **List&lt;String&gt;** |  |  [optional] |
|**and** | [**List&lt;ServiceProfileSimpleExpression&gt;**](ServiceProfileSimpleExpression.md) |  |  [optional] |



