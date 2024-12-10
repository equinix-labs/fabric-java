

# StreamAsset

Stream object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Stream Asset URI |  [optional] [readonly] |
|**uuid** | **UUID** | Equinix-assigned access point identifier |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Asset types |  [optional] |
|**metricsEnabled** | **Boolean** | enable metric |  [optional] |
|**attachmentStatus** | [**AttachmentStatusEnum**](#AttachmentStatusEnum) | asset status |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| XF_PORT | &quot;XF_PORT&quot; |
| IP_VC | &quot;IP_VC&quot; |
| EVPLAN_VC | &quot;EVPLAN_VC&quot; |
| EVPL_VC | &quot;EVPL_VC&quot; |
| XF_METRO | &quot;XF_METRO&quot; |
| XF_ROUTER | &quot;XF_ROUTER&quot; |
| ORGANIZATION | &quot;ORGANIZATION&quot; |
| PROJECT | &quot;PROJECT&quot; |



## Enum: AttachmentStatusEnum

| Name | Value |
|---- | -----|
| ATTACHING | &quot;ATTACHING&quot; |
| ATTACHED | &quot;ATTACHED&quot; |
| DETACHED | &quot;DETACHED&quot; |
| DETACHING | &quot;DETACHING&quot; |
| FAILED | &quot;FAILED&quot; |



