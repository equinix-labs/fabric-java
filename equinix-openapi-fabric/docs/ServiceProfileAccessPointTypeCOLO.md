

# ServiceProfileAccessPointTypeCOLO

Colo Access Point Type

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** |  |  [optional] |
|**type** | **ServiceProfileAccessPointTypeEnum** |  |  |
|**supportedBandwidths** | **List&lt;Integer&gt;** |  |  [optional] |
|**allowRemoteConnections** | **Boolean** | Setting to allow or prohibit remote connections to the service profile. |  [optional] |
|**allowCustomBandwidth** | **Boolean** | Setting to enable or disable the ability of the buyer to customize the bandwidth. |  [optional] |
|**bandwidthAlertThreshold** | **BigDecimal** | percentage of port bandwidth at which an allocation alert is generated - missing on wiki. |  [optional] |
|**allowBandwidthAutoApproval** | **Boolean** | Setting to enable or disable the ability of the buyer to change connection bandwidth without approval of the seller. |  [optional] |
|**allowBandwidthUpgrade** | **Boolean** | Availability of a bandwidth upgrade. The default is false. |  [optional] |
|**linkProtocolConfig** | [**ServiceProfileLinkProtocolConfig**](ServiceProfileLinkProtocolConfig.md) |  |  [optional] |
|**enableAutoGenerateServiceKey** | **Boolean** | for verizon only. |  [optional] |
|**connectionRedundancyRequired** | **Boolean** | Mandate redundant connections |  [optional] |
|**apiConfig** | [**ApiConfig**](ApiConfig.md) |  |  [optional] |
|**connectionLabel** | **String** | custom name for \&quot;Connection\&quot; |  [optional] |
|**authenticationKey** | [**AuthenticationKey**](AuthenticationKey.md) |  |  [optional] |
|**metadata** | [**ServiceProfileMetadata**](ServiceProfileMetadata.md) |  |  [optional] |



