

# Network

Network specification

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**change** | [**SimplifiedNetworkChange**](SimplifiedNetworkChange.md) |  |  [optional] |
|**changeLog** | [**Changelog**](Changelog.md) |  |  |
|**links** | [**List&lt;Link&gt;**](Link.md) | Network sub-resources links |  [optional] [readonly] |
|**href** | **URI** | Network URI |  [readonly] |
|**state** | **NetworkState** |  |  |
|**uuid** | **UUID** | Equinix-assigned network identifier |  |
|**connectionsCount** | **BigDecimal** | number of connections created on the network |  [optional] |
|**operation** | [**NetworkOperation**](NetworkOperation.md) |  |  [optional] |
|**account** | [**SimplifiedAccount**](SimplifiedAccount.md) |  |  [optional] |
|**name** | **String** | Customer-provided network name |  |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**location** | [**SimplifiedLocation**](SimplifiedLocation.md) |  |  [optional] |
|**type** | **NetworkType** |  |  |
|**notifications** | [**List&lt;SimplifiedNotification&gt;**](SimplifiedNotification.md) | Preferences for notifications on network configuration or status changes |  |
|**scope** | **NetworkScope** |  |  |



