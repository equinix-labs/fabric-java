

# CloudRouterCommandRequest

Fabric Cloud Router Command Request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destination** | **String** | Fabric Cloud Router Ping Command Destination |  |
|**sourceConnection** | [**CloudRouterCommandRequestConnection**](CloudRouterCommandRequestConnection.md) |  |  |
|**timeout** | **Integer** | Timeout in seconds for Fabric Cloud Router Ping or Traceroute Command |  [optional] |
|**dataBytes** | **Integer** | Fabric Cloud Router Ping Command DataBytes |  [optional] |
|**interval** | **Integer** | Time in milliseconds between sending each packet for Fabric Cloud Router Ping Command |  [optional] [readonly] |
|**count** | **Integer** | Total number of ping requests for Fabric Cloud Router Ping Command |  [optional] [readonly] |
|**probes** | **Integer** | Number of probes to send for Fabric Cloud Router Traceroute Command |  [optional] |
|**hopsMax** | **Integer** | Maximum number of hops for Fabric Cloud Router Traceroute Command |  [optional] |



