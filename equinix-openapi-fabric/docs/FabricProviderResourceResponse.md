

# FabricProviderResourceResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Connection URI |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | Routing protocol type |  |
|**uuid** | **UUID** | Equinix-assigned route protocol identifier |  [optional] |
|**state** | **DeploymentState** |  |  |
|**name** | **String** |  |  |
|**location** | [**SimplifiedLocationWithoutIBX**](SimplifiedLocationWithoutIBX.md) |  |  |
|**_package** | [**CloudRouterPostRequestPackage**](CloudRouterPostRequestPackage.md) |  |  |
|**deploymentProperties** | [**TopologyProperties**](TopologyProperties.md) |  |  |
|**bandwidth** | **Integer** |  |  |
|**redundancy** | [**ConnectionRedundancy**](ConnectionRedundancy.md) |  |  |
|**aSide** | [**ConnectionSide**](ConnectionSide.md) |  |  |
|**zSide** | [**ConnectionSide**](ConnectionSide.md) |  |  |
|**bgpIpv4** | [**FabricBGPConnectionIpv4**](FabricBGPConnectionIpv4.md) |  |  |
|**customerAsn** | **Long** | Customer asn |  |
|**bgpAuthKey** | **String** | BGP authorization key |  |
|**asOverrideEnabled** | **Boolean** | Enable AS number override |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BGP | &quot;BGP&quot; |



