

# ServiceToken

Create Service Tokens (v4) generates Equinix Fabric service tokens. These tokens authorize users to access protected resources and services. The tokens remove sensitive content from the environment, rather than just masking it, making the protected data impossible to unencrypt or decrypt. Resource owners can distribute the tokens to trusted partners and vendors, allowing selected third parties to work directly with Equinix network assets.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **ServiceTokenType** |  |  [optional] |
|**href** | **URI** | An absolute URL that is the subject of the link&#39;s context. |  [optional] [readonly] |
|**expiry** | **Integer** |  |  [optional] |
|**uuid** | **UUID** | Equinix-assigned service token identifier |  [optional] |
|**issuerSide** | **String** | information about token side |  [optional] |
|**name** | **String** | Customer-provided service token name |  [optional] |
|**description** | **String** | Customer-provided service token description |  [optional] |
|**expirationDateTime** | **OffsetDateTime** | Expiration date and time of the service token. |  [optional] |
|**connection** | [**ServiceTokenConnection**](ServiceTokenConnection.md) |  |  [optional] |
|**state** | **ServiceTokenState** |  |  [optional] |
|**notifications** | [**List&lt;SimplifiedNotification&gt;**](SimplifiedNotification.md) | Service token related notifications |  [optional] |
|**account** | [**SimplifiedAccount**](SimplifiedAccount.md) |  |  [optional] |
|**changelog** | [**Changelog**](Changelog.md) |  |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |



