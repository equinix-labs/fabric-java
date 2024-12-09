

# AccessPointSelector

List of criteria for selecting network access points with optimal efficiency, security, compatibility, and availability.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Type of Access point |  [optional] |
|**hideAssetInfo** | **Boolean** |  |  [optional] |
|**port** | [**SimplifiedMetadataEntity**](SimplifiedMetadataEntity.md) |  |  [optional] |
|**linkProtocol** | [**SimplifiedLinkProtocol**](SimplifiedLinkProtocol.md) |  |  [optional] |
|**virtualDevice** | [**SimplifiedVirtualDevice**](SimplifiedVirtualDevice.md) |  |  [optional] |
|**_interface** | [**VirtualDeviceInterface**](VirtualDeviceInterface.md) |  |  [optional] |
|**network** | [**SimplifiedTokenNetwork**](SimplifiedTokenNetwork.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| COLO | &quot;COLO&quot; |
| VD | &quot;VD&quot; |
| NETWORK | &quot;NETWORK&quot; |



