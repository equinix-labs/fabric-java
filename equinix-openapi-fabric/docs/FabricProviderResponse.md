

# FabricProviderResponse

The response from the orchestrator when querying for fabric provider resources. This response contains a list of resources that are managed by the fabric provider. The resources can be routers, connections, or route protocols. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**resources** | [**List&lt;FabricProviderResourceResponse&gt;**](FabricProviderResourceResponse.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FABRIC_PROVIDER | &quot;FABRIC_PROVIDER&quot; |



