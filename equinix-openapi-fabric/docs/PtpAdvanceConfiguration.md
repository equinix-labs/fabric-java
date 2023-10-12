

# PtpAdvanceConfiguration


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**timeScale** | [**TimeScaleEnum**](#TimeScaleEnum) | Time Scale value, ARB denotes Arbitrary and PTP denotes Precision Time Protocol. |  [optional] |
|**domain** | **Integer** |  |  [optional] |
|**priority1** | **Integer** |  |  [optional] |
|**priority2** | **Integer** |  |  [optional] |
|**logAnnounceInterval** | **Integer** | The mean time interval between Announce messages. A shorter interval makes ptp4l react faster to the changes in the master-slave hierarchy. The interval should be the same in the whole domain. It&#39;s specified as a power of two in seconds. The default is 1 (2 seconds). |  [optional] |
|**logSyncInterval** | **Integer** | The mean time interval between Sync messages. A shorter interval may improve accuracy of the local clock. It&#39;s specified as a power of two in seconds. The default is 0 (1 second). |  [optional] |
|**logDelayReqInterval** | **Integer** |  |  [optional] |
|**transportMode** | [**TransportModeEnum**](#TransportModeEnum) |  |  [optional] |
|**grantTime** | **Integer** | Unicast Grant Time in seconds. For Multicast and Hybrid transport modes, grant time defaults to 300 seconds. For Unicast mode, grant time can be between 30 to 7200. |  [optional] |



## Enum: TimeScaleEnum

| Name | Value |
|---- | -----|
| ARB | &quot;ARB&quot; |
| PTP | &quot;PTP&quot; |



## Enum: TransportModeEnum

| Name | Value |
|---- | -----|
| MULTICAST | &quot;Multicast&quot; |
| UNICAST | &quot;Unicast&quot; |
| HYBRID | &quot;Hybrid&quot; |



