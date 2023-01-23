

# VirtualPortPrice

Preferences and settings for a virtual port connected to an internet service provider (ISP) or other Equinix platform entity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**serviceType** | **VirtualPortServiceType** |  |  [optional] |
|**settings** | [**VirtualPortConfiguration**](VirtualPortConfiguration.md) |  |  [optional] |
|**lag** | [**LinkAggregationGroup**](LinkAggregationGroup.md) |  |  [optional] |
|**bandwidth** | **Integer** | Aggregated data transfer capacity,  expressed as follows &lt;br&gt; -&gt; Mbps, megabits (1 million bits) per second &lt;br&gt; -&gt; Gbps, gigabits (1 billion bits) per second &lt;br&gt; Bandwidth must be divisible by physicalPortsQuantity. |  [optional] |
|**connectivitySource** | [**ConnectivitySource**](ConnectivitySource.md) |  |  [optional] |
|**location** | [**VirtualPortLocation**](VirtualPortLocation.md) |  |  [optional] |
|**physicalPortsQuantity** | **Integer** | Number of physical ports requested. The defaults is 1. |  [optional] |
|**redundancy** | [**VirtualPortRedundancy**](VirtualPortRedundancy.md) |  |  [optional] |
|**type** | **VirtualPortType** |  |  [optional] |
|**uuid** | **UUID** | Unique identifier assigned to the virtual port. Either the uuid or the remaining attributes must be supplied. |  [optional] |



