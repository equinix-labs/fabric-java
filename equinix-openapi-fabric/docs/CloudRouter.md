

# CloudRouter

Fabric Cloud Router object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Cloud Routers URI |  [optional] [readonly] |
|**uuid** | **UUID** | Equinix-assigned access point identifier |  [optional] |
|**name** | **String** | Customer-provided Cloud Router name |  [optional] |
|**state** | **CloudRouterAccessPointState** |  |  [optional] |
|**equinixAsn** | **Long** | Equinix ASN |  [optional] |
|**connectionsCount** | **Integer** | Number of connections associated with this Access point |  [optional] |
|**marketplaceSubscription** | [**MarketplaceSubscription**](MarketplaceSubscription.md) |  |  [optional] |
|**changeLog** | [**Changelog**](Changelog.md) |  |  [optional] |
|**change** | [**CloudRouterChange**](CloudRouterChange.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**location** | [**SimplifiedLocationWithoutIBX**](SimplifiedLocationWithoutIBX.md) |  |  [optional] |
|**_package** | [**CloudRouterPostRequestPackage**](CloudRouterPostRequestPackage.md) |  |  [optional] |
|**order** | [**Order**](Order.md) |  |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**account** | [**SimplifiedAccount**](SimplifiedAccount.md) |  |  [optional] |
|**notifications** | [**List&lt;SimplifiedNotification&gt;**](SimplifiedNotification.md) | Preferences for notifications on connection configuration or status changes |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| XF_ROUTER | &quot;XF_ROUTER&quot; |



