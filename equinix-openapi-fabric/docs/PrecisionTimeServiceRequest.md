

# PrecisionTimeServiceRequest

Create Precision Time Service Request Schema.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Precision Time Service Type refers to the corresponding Protocol. |  |
|**name** | **String** | Precision Time Service name. |  |
|**_package** | [**PrecisionTimePackageRequest**](PrecisionTimePackageRequest.md) |  |  |
|**connections** | [**List&lt;VirtualConnectionUuid&gt;**](VirtualConnectionUuid.md) |  |  |
|**ipv4** | [**Ipv4**](Ipv4.md) |  |  |
|**ntpAdvancedConfiguration** | [**List&lt;Md5&gt;**](Md5.md) | NTP Advanced configuration - MD5 Authentication. |  [optional] |
|**ptpAdvancedConfiguration** | [**PtpAdvanceConfiguration**](PtpAdvanceConfiguration.md) |  |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**order** | [**PrecisionTimeOrder**](PrecisionTimeOrder.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NTP | &quot;NTP&quot; |
| PTP | &quot;PTP&quot; |



