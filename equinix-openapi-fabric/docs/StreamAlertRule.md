

# StreamAlertRule

Stream object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Stream Alert Rule URI |  [optional] [readonly] |
|**uuid** | **UUID** | Equinix-assigned access point identifier |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Stream subscription type |  [optional] |
|**name** | **String** | Customer-provided stream alert rule name |  [optional] |
|**description** | **String** | Customer-provided stream alert rule description |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Steam subscription provision state |  [optional] |
|**enabled** | **Boolean** | Stream alert rule enabled status |  [optional] |
|**metricName** | [**MetricNameEnum**](#MetricNameEnum) | Stream alert rule metric name |  [optional] |
|**resourceSelector** | [**ResourceSelector**](ResourceSelector.md) |  |  [optional] |
|**windowSize** | **String** | Stream alert rule metric window size |  [optional] |
|**operand** | [**OperandEnum**](#OperandEnum) | Stream alert rule metric operand |  [optional] |
|**warningThreshold** | **String** | Stream alert rule metric warning threshold |  [optional] |
|**criticalThreshold** | **String** | Stream alert rule metric critical threshold |  [optional] |
|**changeLog** | [**Changelog**](Changelog.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| METRIC_ALERT | &quot;METRIC_ALERT&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |



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



