

# SubscriptionResponse

Subscription

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** |  |  [optional] |
|**uuid** | **UUID** |  |  [optional] |
|**status** | **SubscriptionStatus** |  |  [optional] |
|**marketplace** | [**MarketplaceEnum**](#MarketplaceEnum) |  |  [optional] |
|**offerType** | [**OfferTypeEnum**](#OfferTypeEnum) |  |  [optional] |
|**isAutoRenew** | **Boolean** |  |  [optional] |
|**offerId** | **String** |  |  [optional] |
|**trial** | [**SubscriptionTrial**](SubscriptionTrial.md) |  |  [optional] |
|**subscriptionKey** | **String** |  |  [optional] |
|**entitlements** | [**List&lt;SubscriptionEntitlementResponse&gt;**](SubscriptionEntitlementResponse.md) |  |  [optional] |
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



