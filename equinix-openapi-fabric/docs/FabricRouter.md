

# FabricRouter

The Router schema defines the structure for a network router within the orchestrator system.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**name** | **String** |  |  [optional] |
|**uuid** | **UUID** | Equinix-assigned access point identifier |  [optional] |
|**location** | [**SimplifiedLocationWithoutIBX**](SimplifiedLocationWithoutIBX.md) |  |  [optional] |
|**_package** | [**CloudRouterPostRequestPackage**](CloudRouterPostRequestPackage.md) |  |  [optional] |
|**deploymentProperties** | [**TopologyProperties**](TopologyProperties.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| XF_ROUTER | &quot;XF_ROUTER&quot; |



