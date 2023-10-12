

# PrecisionTimeChangeOperation

Fabric Precision Timing change operation data

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**op** | [**OpEnum**](#OpEnum) | Handy shortcut for operation name |  |
|**path** | [**PathEnum**](#PathEnum) | path inside document leading to updated parameter |  |
|**value** | **Object** | new value for updated parameter |  |



## Enum: OpEnum

| Name | Value |
|---- | -----|
| REPLACE | &quot;replace&quot; |
| ADD | &quot;add&quot; |
| REMOVE | &quot;remove&quot; |



## Enum: PathEnum

| Name | Value |
|---- | -----|
| NETWORKINGIPV4 | &quot;/networkingIpv4&quot; |
| NAME | &quot;/name&quot; |
| ADVANCECONFIGURATION_NTP | &quot;/advanceConfiguration/ntp&quot; |
| ADVANCECONFIGURATION_PTP | &quot;/advanceConfiguration/ptp&quot; |
| PACKAGE | &quot;/package&quot; |



