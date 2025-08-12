

# CloudRouterPostRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**name** | **String** | Customer-provided Cloud Router name |  |
|**location** | [**SimplifiedLocationWithoutIBX**](SimplifiedLocationWithoutIBX.md) |  |  |
|**_package** | [**CloudRouterPostRequestPackage**](CloudRouterPostRequestPackage.md) |  |  |
|**order** | [**Order**](Order.md) |  |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**account** | [**SimplifiedAccount**](SimplifiedAccount.md) |  |  [optional] |
|**notifications** | [**List&lt;SimplifiedNotification&gt;**](SimplifiedNotification.md) | Preferences for notifications on connection configuration or status changes |  [optional] |
|**marketplaceSubscription** | [**MarketplaceSubscription**](MarketplaceSubscription.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| XF_ROUTER | &quot;XF_ROUTER&quot; |



