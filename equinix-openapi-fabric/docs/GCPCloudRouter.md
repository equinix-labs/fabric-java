

# GCPCloudRouter

The GCP CloudRouter schema defines the structure for the gcp cloud router configuration, including provider type, VPC, subnet, and deployment properties. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**vpcId** | **UUID** |  |  |
|**subnetId** | **UUID** |  |  |
|**deploymentProperties** | [**TopologyProperties**](TopologyProperties.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| GCP_CLOUD_ROUTER | &quot;GCP_CLOUD_ROUTER&quot; |



