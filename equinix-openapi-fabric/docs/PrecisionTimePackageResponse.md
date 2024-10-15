

# PrecisionTimePackageResponse

EPT Service Package Information

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**code** | [**CodeEnum**](#CodeEnum) |  |  |
|**bandwidth** | **Integer** | Connection bandwidth in Mbps. |  |
|**clientsPerSecondMax** | **Integer** | Max. number of clients that can be synchronized per second at a packet rate of 1 per second. |  [optional] |
|**redundancySupported** | **Boolean** | Is Redundant virtual connection supported for the package code. |  [optional] |
|**multiSubnetSupported** | **Boolean** | Is Multiple subnet supported for the package code. |  [optional] |
|**accuracySlaUnit** | **String** | Accuracy SLA unit. |  [optional] |
|**accuracySla** | **Integer** | Accuracy SLA for the package code, -1 value denotes the accuracySla is not published. |  [optional] |
|**accuracySlaMin** | **Integer** | Typical minimum Accuracy for the package code. |  [optional] |
|**accuracySlaMax** | **Integer** | Typical maximum Accuracy for the package code. |  [optional] |
|**changelog** | [**Changelog**](Changelog.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TIME_SERVICE_PACKAGE | &quot;TIME_SERVICE_PACKAGE&quot; |



## Enum: CodeEnum

| Name | Value |
|---- | -----|
| NTP_STANDARD | &quot;NTP_STANDARD&quot; |
| NTP_ENTERPRISE | &quot;NTP_ENTERPRISE&quot; |
| PTP_STANDARD | &quot;PTP_STANDARD&quot; |
| PTP_ENTERPRISE | &quot;PTP_ENTERPRISE&quot; |



