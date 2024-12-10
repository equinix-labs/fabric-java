

# PrecisionTimeServiceResponse

Precision Time Service Response Schema.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Precision Time Service URI. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Precision Time Service type refers to the corresponding protocol. |  |
|**name** | **String** | Precision Time Service Name. |  [optional] |
|**uuid** | **UUID** | Precision Time Service UUID. |  |
|**state** | [**StateEnum**](#StateEnum) | Precision Time Service Status. |  |
|**_package** | [**PrecisionTimePackageResponse**](PrecisionTimePackageResponse.md) |  |  |
|**connections** | [**Set&lt;VirtualConnectionTimeServiceResponse&gt;**](VirtualConnectionTimeServiceResponse.md) | Fabric Connections associated with Precision Time Service. |  [optional] |
|**ipv4** | [**Ipv4**](Ipv4.md) |  |  [optional] |
|**ntpAdvancedConfiguration** | [**List&lt;Md5&gt;**](Md5.md) | NTP Advanced configuration - MD5 Authentication. |  [optional] |
|**ptpAdvancedConfiguration** | [**PtpAdvanceConfiguration**](PtpAdvanceConfiguration.md) |  |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**account** | [**SimplifiedAccount**](SimplifiedAccount.md) |  |  [optional] |
|**order** | [**PrecisionTimeOrder**](PrecisionTimeOrder.md) |  |  [optional] |
|**pricing** | [**PrecisionTimePrice**](PrecisionTimePrice.md) |  |  [optional] |
|**changeLog** | [**Changelog**](Changelog.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NTP | &quot;NTP&quot; |
| PTP | &quot;PTP&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| CANCELLED | &quot;CANCELLED&quot; |
| CANCELLING | &quot;CANCELLING&quot; |
| CONFIGURING | &quot;CONFIGURING&quot; |
| CONFIGURING_FAILED | &quot;CONFIGURING_FAILED&quot; |
| DRAFT | &quot;DRAFT&quot; |
| DEPROVISIONING | &quot;DEPROVISIONING&quot; |
| DEPROVISIONING_FAILED | &quot;DEPROVISIONING_FAILED&quot; |
| DEPROVISIONED | &quot;DEPROVISIONED&quot; |
| PROVISIONED | &quot;PROVISIONED&quot; |
| PROVISIONING | &quot;PROVISIONING&quot; |
| PROVISIONING_FAILED | &quot;PROVISIONING_FAILED&quot; |
| REPROVISIONING | &quot;REPROVISIONING&quot; |
| REPROVISIONING_FAILED | &quot;REPROVISIONING_FAILED&quot; |



