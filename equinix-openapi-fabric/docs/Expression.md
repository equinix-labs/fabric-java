

# Expression


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**and** | [**List&lt;Expression&gt;**](Expression.md) |  |  [optional] |
|**or** | [**List&lt;Expression&gt;**](Expression.md) |  |  [optional] |
|**property** | **SearchFieldName** |  |  [optional] |
|**operator** | [**OperatorEnum**](#OperatorEnum) |  |  [optional] |
|**values** | **List&lt;String&gt;** |  |  [optional] |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| EQUAL | &quot;&#x3D;&quot; |
| NOT_EQUAL | &quot;!&#x3D;&quot; |
| GREATER_THAN | &quot;&gt;&quot; |
| GREATER_THAN_OR_EQUAL_TO | &quot;&gt;&#x3D;&quot; |
| LESS_THAN | &quot;&lt;&quot; |
| LESS_THAN_OR_EQUAL_TO | &quot;&lt;&#x3D;&quot; |
| BETWEEN | &quot;BETWEEN&quot; |
| NOT_BETWEEN | &quot;NOT BETWEEN&quot; |
| LIKE | &quot;LIKE&quot; |
| NOT_LIKE | &quot;NOT LIKE&quot; |
| IN | &quot;IN&quot; |
| NOT_IN | &quot;NOT IN&quot; |
| IS_NOT_NULL | &quot;IS NOT NULL&quot; |
| IS_NULL | &quot;IS NULL&quot; |



