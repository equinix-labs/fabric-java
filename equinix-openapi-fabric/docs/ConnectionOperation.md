

# ConnectionOperation

Connection type-specific operational data

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**providerStatus** | **ProviderStatus** |  |  [optional] |
|**equinixStatus** | **EquinixStatus** |  |  [optional] |
|**operationalStatus** | [**OperationalStatusEnum**](#OperationalStatusEnum) | Connection operational status |  [optional] |
|**errors** | [**List&lt;Error&gt;**](Error.md) |  |  [optional] |
|**opStatusChangedAt** | **OffsetDateTime** | When connection transitioned into current operational status |  [optional] |



## Enum: OperationalStatusEnum

| Name | Value |
|---- | -----|
| UP | &quot;UP&quot; |
| DOWN | &quot;DOWN&quot; |



