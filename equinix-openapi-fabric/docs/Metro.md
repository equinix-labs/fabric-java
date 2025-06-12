

# Metro

GET Metros retrieves all Equinix? Fabric? metros, as well as latency data for each location.This performance data helps network planning engineers and administrators make strategic decisions about port locations and traffic routes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **String** | The Canonical URL at which the resource resides. |  [optional] |
|**type** | **String** | Indicator of a Fabric Metro |  [optional] |
|**code** | **String** | Code Assigned to an Equinix IBX data center in a specified metropolitan area. |  [optional] |
|**region** | **String** | Board geographic area in which the data center is located |  [optional] |
|**name** | **String** | Name of the region in which the data center is located. |  [optional] |
|**equinixAsn** | **Long** | Autonomous system number (ASN) for a specified Fabric metro. The ASN is a unique identifier that carries the network routing protocol and exchanges that data with other internal systems via border gateway protocol. |  [optional] |
|**localVCBandwidthMax** | **Long** | This field holds Max Connection speed with in the metro |  [optional] |
|**geoCoordinates** | [**GeoCoordinates**](GeoCoordinates.md) |  |  [optional] |
|**connectedMetros** | [**List&lt;ConnectedMetro&gt;**](ConnectedMetro.md) |  |  [optional] |
|**services** | [**List&lt;Services&gt;**](Services.md) |  |  [optional] |
|**geoScopes** | **List&lt;GeoScopeType&gt;** | List of supported geographic boundaries of a Fabric Metro. |  [optional] |



