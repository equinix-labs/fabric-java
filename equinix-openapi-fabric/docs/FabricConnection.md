

# FabricConnection

The OrchestratorProvider schema defines the configuration for a network connection and deployment properties, offering a detailed overview of the connection's characteristics and requirements. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**bandwidth** | **Integer** |  |  |
|**name** | **String** |  |  [optional] |
|**redundancy** | [**ConnectionRedundancy**](ConnectionRedundancy.md) |  |  |
|**aSide** | [**ConnectionSide**](ConnectionSide.md) |  |  |
|**zSide** | [**ConnectionSide**](ConnectionSide.md) |  |  |
|**deploymentProperties** | [**TopologyProperties**](TopologyProperties.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| IP_VC | &quot;IP_VC&quot; |



