

# AlertRulePutRequest

Create Stream Alert Rules

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Customer-provided stream name |  [optional] |
|**description** | **String** | Customer-provided stream description |  [optional] |
|**enabled** | **Boolean** | Stream alert rule enabled status |  [optional] |
|**metricName** | [**MetricNameEnum**](#MetricNameEnum) | Stream alert rule metric name |  [optional] |
|**resourceSelector** | [**ResourceSelector**](ResourceSelector.md) |  |  [optional] |
|**operand** | [**OperandEnum**](#OperandEnum) | Stream alert rule metric operand |  [optional] |
|**windowSize** | **String** | Stream alert rule metric window size |  [optional] |
|**warningThreshold** | **String** | Stream alert rule metric warning threshold |  [optional] |
|**criticalThreshold** | **String** | Stream alert rule metric critical threshold |  [optional] |



## Enum: MetricNameEnum

| Name | Value |
|---- | -----|
| CONNECTION_BANDWIDTH_TX_USAGE | &quot;equinix.fabric.connection.bandwidth_tx.usage&quot; |
| CONNECTION_BANDWIDTH_RX_USAGE | &quot;equinix.fabric.connection.bandwidth_rx.usage&quot; |
| PORT_BANDWIDTH_TX_USAGE | &quot;equinix.fabric.port.bandwidth_tx.usage&quot; |
| PORT_BANDWIDTH_RX_USAGE | &quot;equinix.fabric.port.bandwidth_rx.usage&quot; |
| PORT_PACKETS_ERRED_TX_COUNT | &quot;equinix.fabric.port.packets_erred_tx.count&quot; |
| PORT_PACKETS_ERRED_RX_COUNT | &quot;equinix.fabric.port.packets_erred_rx.count&quot; |
| PORT_PACKETS_DROPPED_TX_COUNT | &quot;equinix.fabric.port.packets_dropped_tx.count&quot; |
| PORT_PACKETS_DROPPED_RX_COUNT | &quot;equinix.fabric.port.packets_dropped_rx.count&quot; |
| METRO_SOURCE_METRO_CODE___DESTINATION_METRO_CODE_LATENCY | &quot;equinix.fabric.metro.&lt;source_metro_code&gt;_&lt;destination_metro_code&gt;.latency&quot; |



## Enum: OperandEnum

| Name | Value |
|---- | -----|
| ABOVE | &quot;ABOVE&quot; |
| BELOW | &quot;BELOW&quot; |



