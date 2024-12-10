

# SubscriptionResponse

Subscription Response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Subscription URL |  [optional] |
|**uuid** | **UUID** | Unique identifier of the Subscription |  [optional] |
|**state** | **SubscriptionState** |  |  |
|**marketplace** | [**MarketplaceEnum**](#MarketplaceEnum) | Marketplace Type |  |
|**offerType** | [**OfferTypeEnum**](#OfferTypeEnum) | Marketplace Offer Type |  [optional] |
|**isAutoRenew** | **Boolean** | Is Auto Renewal Enabled |  [optional] |
|**offerId** | **String** | Marketplace Offer Id |  [optional] |
|**trial** | [**SubscriptionTrial**](SubscriptionTrial.md) |  |  [optional] |
|**metroCodes** | **List&lt;String&gt;** | List of available metro |  [optional] |
|**entitlements** | [**List&lt;SubscriptionEntitlementResponse&gt;**](SubscriptionEntitlementResponse.md) | List of entitlements associated with the subscription |  |
|**changelog** | [**Changelog**](Changelog.md) |  |  [optional] |



## Enum: MarketplaceEnum

| Name | Value |
|---- | -----|
| AWS | &quot;AWS&quot; |
| GCP | &quot;GCP&quot; |
| AZURE | &quot;AZURE&quot; |
| REDHAT | &quot;REDHAT&quot; |



## Enum: OfferTypeEnum

| Name | Value |
|---- | -----|
| PUBLIC | &quot;PUBLIC&quot; |
| PRIVATE_OFFER | &quot;PRIVATE_OFFER&quot; |



