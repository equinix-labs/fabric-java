

# ConnectionPostRequest

Create connection post request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **ConnectionType** |  |  |
|**name** | **String** | Customer-provided connection name |  |
|**order** | [**Order**](Order.md) |  |  [optional] |
|**notifications** | [**List&lt;SimplifiedNotification&gt;**](SimplifiedNotification.md) | Preferences for notifications on connection configuration or status changes |  |
|**bandwidth** | **Integer** | Connection bandwidth in Mbps |  |
|**geoScope** | **GeoScopeType** |  |  [optional] |
|**redundancy** | [**ConnectionRedundancy**](ConnectionRedundancy.md) |  |  [optional] |
|**aSide** | [**ConnectionSide**](ConnectionSide.md) |  |  |
|**zSide** | [**ConnectionSide**](ConnectionSide.md) |  |  |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**additionalInfo** | [**List&lt;ConnectionSideAdditionalInfo&gt;**](ConnectionSideAdditionalInfo.md) | Connection additional information |  [optional] |
|**marketplaceSubscription** | [**MarketplaceSubscription**](MarketplaceSubscription.md) |  |  [optional] |
|**endCustomer** | [**EndCustomer**](EndCustomer.md) |  |  [optional] |



