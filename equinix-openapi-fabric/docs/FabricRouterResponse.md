

# FabricRouterResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Cloud Routers URI |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**uuid** | **String** | Equinix-assigned cloud router identifier |  [optional] |
|**state** | **DeploymentState** |  |  |
|**name** | **String** |  |  |
|**location** | [**SimplifiedLocationWithoutIBX**](SimplifiedLocationWithoutIBX.md) |  |  |
|**_package** | [**CloudRouterPostRequestPackage**](CloudRouterPostRequestPackage.md) |  |  |
|**deploymentProperties** | [**TopologyProperties**](TopologyProperties.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| XF_ROUTER | &quot;XF_ROUTER&quot; |



