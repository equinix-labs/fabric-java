

# Network

Network specification

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Network URI |  [readonly] |
|**uuid** | **UUID** | Equinix-assigned network identifier |  |
|**state** | **NetworkState** |  |  |
|**connectionsCount** | **BigDecimal** | number of connections created on the network |  [optional] |
|**account** | [**SimplifiedAccount**](SimplifiedAccount.md) |  |  [optional] |
|**change** | [**SimplifiedNetworkChange**](SimplifiedNetworkChange.md) |  |  [optional] |
|**operation** | [**NetworkOperation**](NetworkOperation.md) |  |  [optional] |
|**changeLog** | [**Changelog**](Changelog.md) |  |  |
|**links** | [**List&lt;Link&gt;**](Link.md) | Network sub-resources links |  [optional] [readonly] |
|**type** | **NetworkType** |  |  |
|**name** | **String** | Customer-provided network name |  |
|**scope** | **NetworkScope** |  |  |
|**location** | [**SimplifiedLocation**](SimplifiedLocation.md) |  |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**notifications** | [**List&lt;SimplifiedNotification&gt;**](SimplifiedNotification.md) | Preferences for notifications on network configuration or status changes |  |



