

# FabricConnectionResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Connection URI |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**uuid** | **String** | Equinix-assigned connection identifier |  [optional] |
|**state** | **DeploymentState** |  |  |
|**bandwidth** | **Integer** |  |  |
|**name** | **String** |  |  |
|**redundancy** | [**ConnectionRedundancy**](ConnectionRedundancy.md) |  |  |
|**aSide** | [**ConnectionSide**](ConnectionSide.md) |  |  |
|**zSide** | [**ConnectionSide**](ConnectionSide.md) |  |  |
|**deploymentProperties** | [**TopologyProperties**](TopologyProperties.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| IP_VC | &quot;IP_VC&quot; |



