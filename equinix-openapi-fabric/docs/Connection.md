

# Connection

Connection specification

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Connection URI |  [optional] [readonly] |
|**type** | **ConnectionType** |  |  |
|**uuid** | **String** | Equinix-assigned connection identifier |  [optional] |
|**name** | **String** | Customer-provided connection name |  |
|**description** | **String** | Customer-provided connection description |  [optional] |
|**state** | **ConnectionState** |  |  [optional] |
|**change** | [**Change**](Change.md) |  |  [optional] |
|**operation** | [**ConnectionOperation**](ConnectionOperation.md) |  |  [optional] |
|**order** | [**Order**](Order.md) |  |  [optional] |
|**notifications** | [**List&lt;SimplifiedNotification&gt;**](SimplifiedNotification.md) | Preferences for notifications on connection configuration or status changes |  [optional] |
|**account** | [**SimplifiedAccount**](SimplifiedAccount.md) |  |  [optional] |
|**changeLog** | [**Changelog**](Changelog.md) |  |  [optional] |
|**bandwidth** | **Integer** | Connection bandwidth in Mbps |  |
|**geoScope** | **GeoScopeType** |  |  [optional] |
|**redundancy** | [**ConnectionRedundancy**](ConnectionRedundancy.md) |  |  [optional] |
|**isRemote** | **Boolean** | Connection property derived from access point locations |  [optional] |
|**direction** | **ConnectionDirection** |  |  [optional] |
|**aSide** | [**ConnectionSide**](ConnectionSide.md) |  |  |
|**zSide** | [**ConnectionSide**](ConnectionSide.md) |  |  |
|**marketplaceSubscription** | [**MarketplaceSubscription**](MarketplaceSubscription.md) |  |  [optional] |
|**additionalInfo** | [**List&lt;ConnectionSideAdditionalInfo&gt;**](ConnectionSideAdditionalInfo.md) | Connection additional information |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |



