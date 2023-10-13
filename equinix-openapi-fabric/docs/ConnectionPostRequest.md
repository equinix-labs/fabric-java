

# ConnectionPostRequest

Create connection post request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **ConnectionType** |  |  [optional] |
|**name** | **String** | Customer-provided connection name |  [optional] |
|**order** | [**Order**](Order.md) |  |  [optional] |
|**notifications** | [**List&lt;SimplifiedNotification&gt;**](SimplifiedNotification.md) | Preferences for notifications on connection configuration or status changes |  [optional] |
|**bandwidth** | **Integer** | Connection bandwidth in Mbps |  [optional] |
|**geoScope** | **GeoScopeType** |  |  [optional] |
|**redundancy** | [**ConnectionRedundancy**](ConnectionRedundancy.md) |  |  [optional] |
|**aSide** | [**ConnectionSide**](ConnectionSide.md) |  |  [optional] |
|**zSide** | [**ConnectionSide**](ConnectionSide.md) |  |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**additionalInfo** | [**List&lt;ConnectionSideAdditionalInfo&gt;**](ConnectionSideAdditionalInfo.md) | Connection additional information |  [optional] |



