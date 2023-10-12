

# PrecisionTimeServiceCreateResponse

EPT service instance

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**href** | **URI** |  |  |
|**uuid** | **UUID** | uuid of the ept service |  |
|**name** | **String** | name of the ept service |  [optional] |
|**description** | **String** |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | indicate service state |  |
|**_package** | [**PackageResponse**](PackageResponse.md) |  |  |
|**connections** | [**Set&lt;FabricConnectionUuid&gt;**](FabricConnectionUuid.md) | fabric l2 connections used for the ept service |  [optional] |
|**networkingIpv4** | [**Ipv4**](Ipv4.md) |  |  |
|**account** | [**Account**](Account.md) |  |  [optional] |
|**advanceConfiguration** | [**AdvanceConfiguration**](AdvanceConfiguration.md) |  |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NTP | &quot;NTP&quot; |
| PTP | &quot;PTP&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| PROVISIONED | &quot;PROVISIONED&quot; |
| PROVISIONING | &quot;PROVISIONING&quot; |
| PROVISIONING_FAILED | &quot;PROVISIONING_FAILED&quot; |
| CONFIGURING | &quot;CONFIGURING&quot; |
| CANCELLED | &quot;CANCELLED&quot; |
| DEPROVISIONING_FAILED | &quot;DEPROVISIONING_FAILED&quot; |
| PENDING_CONFIGURATION | &quot;PENDING_CONFIGURATION&quot; |
| DEPROVISIONED | &quot;DEPROVISIONED&quot; |
| CONFIGURING_FAILED | &quot;CONFIGURING_FAILED&quot; |
| DEPROVISIONING | &quot;DEPROVISIONING&quot; |



