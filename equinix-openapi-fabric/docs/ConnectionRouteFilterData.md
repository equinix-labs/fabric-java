

# ConnectionRouteFilterData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Route filter URI |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Route filter type |  [optional] |
|**uuid** | **UUID** | Route Filter identifier |  [optional] |
|**attachmentStatus** | [**AttachmentStatusEnum**](#AttachmentStatusEnum) |  |  [optional] |
|**direction** | [**DirectionEnum**](#DirectionEnum) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| IPV4_PREFIX_FILTER | &quot;BGP_IPv4_PREFIX_FILTER&quot; |
| IPV6_PREFIX_FILTER | &quot;BGP_IPv6_PREFIX_FILTER&quot; |



## Enum: AttachmentStatusEnum

| Name | Value |
|---- | -----|
| ATTACHING | &quot;ATTACHING&quot; |
| ATTACHED | &quot;ATTACHED&quot; |
| DETACHED | &quot;DETACHED&quot; |
| DETACHING | &quot;DETACHING&quot; |
| FAILED | &quot;FAILED&quot; |
| PENDING_BGP_CONFIGURATION | &quot;PENDING_BGP_CONFIGURATION&quot; |



## Enum: DirectionEnum

| Name | Value |
|---- | -----|
| INBOUND | &quot;INBOUND&quot; |
| OUTBOUND | &quot;OUTBOUND&quot; |



