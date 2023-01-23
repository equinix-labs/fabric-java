

# Metro

GET Metros retrieves all Equinix® Fabric™ metros, as well as latency data for each location.This performance data helps network planning engineers and administrators make strategic decisions about port locations and traffic routes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | Code Assigned to an Equinix IBX data center in a specified metropolitan area. |  [optional] |
|**name** | **String** | Name of the region in which the data center is located. |  [optional] |
|**connectedMetros** | [**List&lt;ConnectedMetro&gt;**](ConnectedMetro.md) |  |  [optional] |
|**href** | **String** | The Canonical URL at which the resource resides. |  [optional] |
|**geoCoordinates** | [**GeoCoordinates**](GeoCoordinates.md) |  |  [optional] |
|**type** | **String** | Indicator of a Fabric Metro |  [optional] |
|**region** | **String** | Board geographic area in which the data center is located |  [optional] |



