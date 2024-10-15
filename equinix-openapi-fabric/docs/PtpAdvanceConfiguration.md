

# PtpAdvanceConfiguration

PTP Advanced Configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**timeScale** | [**TimeScaleEnum**](#TimeScaleEnum) | Time Scale value, ARB denotes Arbitrary and PTP denotes Precision Time Protocol. |  [optional] |
|**domain** | **Integer** | The PTP domain value. |  [optional] |
|**priority1** | **Integer** | The priority1 value determines the best primary clock, Lower value indicates higher priority. |  [optional] |
|**priority2** | **Integer** | The priority2 value differentiates and prioritizes the primary clock to avoid confusion when priority1-value is the same for different primary clocks in a network. |  [optional] |
|**logAnnounceInterval** | [**LogAnnounceIntervalEnum**](#LogAnnounceIntervalEnum) | Logarithmic value that controls the rate of PTP Announce packets from the PTP time server. Default is 1 (1 packet every 2 seconds), Unit packets/second. |  [optional] |
|**logSyncInterval** | [**LogSyncIntervalEnum**](#LogSyncIntervalEnum) | Logarithmic value that controls the rate of PTP Sync packets. Default is -4 (16 packets per second), Unit packets/second.. |  [optional] |
|**logDelayReqInterval** | [**LogDelayReqIntervalEnum**](#LogDelayReqIntervalEnum) | Logarithmic value that controls the rate of PTP DelayReq packets. Default is -4 (16 packets per second), Unit packets/second.. |  [optional] |
|**transportMode** | [**TransportModeEnum**](#TransportModeEnum) |  |  [optional] |
|**grantTime** | **Integer** | Unicast Grant Time in seconds. For Multicast and Hybrid transport modes, grant time defaults to 300 seconds. For Unicast mode, grant time can be between 30 to 7200. |  [optional] |



## Enum: TimeScaleEnum

| Name | Value |
|---- | -----|
| ARB | &quot;ARB&quot; |
| PTP | &quot;PTP&quot; |



## Enum: LogAnnounceIntervalEnum

| Name | Value |
|---- | -----|
| NUMBER_MINUS_3 | -3 |
| NUMBER_MINUS_2 | -2 |
| NUMBER_MINUS_1 | -1 |
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: LogSyncIntervalEnum

| Name | Value |
|---- | -----|
| NUMBER_MINUS_5 | -5 |
| NUMBER_MINUS_4 | -4 |
| NUMBER_MINUS_3 | -3 |
| NUMBER_MINUS_2 | -2 |
| NUMBER_MINUS_1 | -1 |
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: LogDelayReqIntervalEnum

| Name | Value |
|---- | -----|
| NUMBER_MINUS_5 | -5 |
| NUMBER_MINUS_4 | -4 |
| NUMBER_MINUS_3 | -3 |
| NUMBER_MINUS_2 | -2 |
| NUMBER_MINUS_1 | -1 |
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: TransportModeEnum

| Name | Value |
|---- | -----|
| MULTICAST | &quot;MULTICAST&quot; |
| UNICAST | &quot;UNICAST&quot; |
| HYBRID | &quot;HYBRID&quot; |



