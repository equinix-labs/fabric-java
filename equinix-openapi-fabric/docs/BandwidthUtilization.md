

# BandwidthUtilization

Bandwidth utilization statistics (octet counters-based)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**unit** | [**UnitEnum**](#UnitEnum) | Aggregated data transfer capacity. Possible values- Mbps, megabits (1 million bits) per second; Gbps, gigabits (1 billion bits) per second. |  [optional] |
|**metricInterval** | **String** | An interval formatted value, indicating the time-interval the metric objects within the response represent |  [optional] |
|**inbound** | [**Direction**](Direction.md) |  |  [optional] |
|**outbound** | [**Direction**](Direction.md) |  |  [optional] |



## Enum: UnitEnum

| Name | Value |
|---- | -----|
| MBPS | &quot;Mbps&quot; |



