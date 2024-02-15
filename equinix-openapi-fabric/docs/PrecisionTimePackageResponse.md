

# PrecisionTimePackageResponse

EPT Service Package Information

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** |  |  [optional] |
|**code** | [**CodeEnum**](#CodeEnum) |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**bandwidth** | **Integer** |  |  [optional] |
|**clientsPerSecondMax** | **Integer** |  |  [optional] |
|**redundancySupported** | **Boolean** |  |  [optional] |
|**multiSubnetSupported** | **Boolean** |  |  [optional] |
|**accuracyUnit** | **String** |  |  [optional] |
|**accuracySla** | **Integer** |  |  [optional] |
|**accuracyAvgMin** | **Integer** |  |  [optional] |
|**accuracyAvgMax** | **Integer** |  |  [optional] |
|**changelog** | [**Changelog**](Changelog.md) |  |  [optional] |



## Enum: CodeEnum

| Name | Value |
|---- | -----|
| NTP_STANDARD | &quot;NTP_STANDARD&quot; |
| NTP_ENTERPRISE | &quot;NTP_ENTERPRISE&quot; |
| PTP_STANDARD | &quot;PTP_STANDARD&quot; |
| PTP_ENTERPRISE | &quot;PTP_ENTERPRISE&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TIME_SERVICE_PACKAGE | &quot;TIME_SERVICE_PACKAGE&quot; |



