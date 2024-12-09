

# ConnectionRouteAggregationData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Route Aggregation URI |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Route Aggregation type |  [optional] |
|**uuid** | **UUID** | Route Aggregation identifier |  [optional] |
|**attachmentStatus** | [**AttachmentStatusEnum**](#AttachmentStatusEnum) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BGP_IPV4_PREFIX_AGGREGATION | &quot;BGP_IPv4_PREFIX_AGGREGATION&quot; |



## Enum: AttachmentStatusEnum

| Name | Value |
|---- | -----|
| ATTACHING | &quot;ATTACHING&quot; |
| ATTACHED | &quot;ATTACHED&quot; |
| DETACHED | &quot;DETACHED&quot; |
| DETACHING | &quot;DETACHING&quot; |
| FAILED | &quot;FAILED&quot; |
| PENDING_BGP_CONFIGURATION | &quot;PENDING_BGP_CONFIGURATION&quot; |



