

# AWSVirtualPrivateGateway

The VirtualPrivateGateway schema defines the structure for the virtual private gateway configuration. It includes details about the gateway type, required flag, VPC and subnet IDs, and deployment properties. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**required** | **Boolean** |  |  |
|**vpcId** | **UUID** |  |  [optional] |
|**subnetId** | **UUID** |  |  [optional] |
|**deploymentProperties** | [**TopologyProperties**](TopologyProperties.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| VIRTUAL_PRIVATE_GATEWAY | &quot;VIRTUAL_PRIVATE_GATEWAY&quot; |



