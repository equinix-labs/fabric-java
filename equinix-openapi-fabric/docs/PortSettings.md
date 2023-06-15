

# PortSettings

Port configuration settings

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**product** | **String** | Product name |  [optional] |
|**buyout** | **Boolean** |  |  [optional] |
|**viewPortPermission** | **Boolean** |  |  [optional] |
|**placeVcOrderPermission** | **Boolean** |  |  [optional] |
|**layer3Enabled** | **Boolean** |  |  [optional] |
|**productCode** | **String** |  |  [optional] |
|**sharedPortType** | **Boolean** |  |  [optional] |
|**sharedPortProduct** | [**SharedPortProductEnum**](#SharedPortProductEnum) |  |  [optional] |
|**packageType** | [**PackageTypeEnum**](#PackageTypeEnum) | Type of Port Package |  [optional] |



## Enum: SharedPortProductEnum

| Name | Value |
|---- | -----|
| NETWORK_EDGE | &quot;NETWORK_EDGE&quot; |
| VIRTUAL_GATEWAY | &quot;VIRTUAL_GATEWAY&quot; |
| SMARTKEY | &quot;SMARTKEY&quot; |
| EDGE_METAL | &quot;EDGE_METAL&quot; |



## Enum: PackageTypeEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;STANDARD&quot; |
| UNTAGGED | &quot;UNTAGGED&quot; |
| UNLIMITED | &quot;UNLIMITED&quot; |
| FREE | &quot;FREE&quot; |



