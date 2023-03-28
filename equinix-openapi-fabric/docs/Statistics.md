

# Statistics

This API provides service-level traffic metrics so that you can view access and gather key information required to manage service subscription sizing and capacity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDateTime** | **OffsetDateTime** | Start and duration of the statistical analysis interval. |  [optional] |
|**endDateTime** | **OffsetDateTime** | End and duration of the statistical analysis interval. |  [optional] |
|**viewPoint** | [**ViewPointEnum**](#ViewPointEnum) | Point of view for connection metrics - aSide or zSide |  [optional] |
|**bandwidthUtilization** | [**BandwidthUtilization**](BandwidthUtilization.md) |  |  [optional] |



## Enum: ViewPointEnum

| Name | Value |
|---- | -----|
| ASIDE | &quot;aSide&quot; |
| ZSIDE | &quot;zSide&quot; |



