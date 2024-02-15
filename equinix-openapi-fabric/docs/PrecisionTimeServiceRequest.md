

# PrecisionTimeServiceRequest

EPT service instance

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Indicate the entity is EPT service |  |
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**_package** | [**PrecisionTimePackageRequest**](PrecisionTimePackageRequest.md) |  |  |
|**connections** | [**List&lt;FabricConnectionUuid&gt;**](FabricConnectionUuid.md) |  |  |
|**ipv4** | [**Ipv4**](Ipv4.md) |  |  |
|**advanceConfiguration** | [**AdvanceConfiguration**](AdvanceConfiguration.md) |  |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NTP | &quot;NTP&quot; |
| PTP | &quot;PTP&quot; |



