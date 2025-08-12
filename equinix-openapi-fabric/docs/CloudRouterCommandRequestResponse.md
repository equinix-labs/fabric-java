

# CloudRouterCommandRequestResponse

Fabric Cloud Router Command Request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destination** | **String** | Fabric Cloud Router Ping or Traceroute Command Destination |  [optional] |
|**sourceConnection** | [**CloudRouterCommandRequestConnection**](CloudRouterCommandRequestConnection.md) |  |  [optional] |
|**timeout** | **Integer** | Timeout in seconds for Fabric Cloud Router Command:   - For &#x60;PING_COMMAND&#x60;: Packet timeout duration. The default value is 5.   - For &#x60;TRACEROUTE_COMMAND&#x60;: Probe timeout duration.     The default value is 2 and it is not configurable.  |  [optional] |
|**dataBytes** | **Integer** | Ping Command DataBytes.  This field is only applicable for commands of type &#x60;PING_COMMAND&#x60;.  |  [optional] |
|**interval** | **Integer** | Time in milliseconds between sending each packet. This field is only applicable for commands of type &#x60;PING_COMMAND&#x60;.  |  [optional] |
|**count** | **Integer** | Total number of ping requests. This field is only applicable for commands of type &#x60;PING_COMMAND&#x60;.  |  [optional] |
|**probes** | **Integer** | Number of probes for Fabric Cloud Router Traceroute Command. This field is only applicable for commands of type &#x60;TRACEROUTE_COMMAND&#x60; and is not configurable.  |  [optional] |
|**hopsMax** | **Integer** | Maximum number of hops for the traceroute command. This field is only applicable for commands of type &#x60;TRACEROUTE_COMMAND&#x60;.  |  [optional] |



