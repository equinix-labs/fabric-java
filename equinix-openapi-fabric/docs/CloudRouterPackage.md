

# CloudRouterPackage

Fabric Cloud Router Package

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Cloud Router package URI |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of Router package |  [optional] |
|**code** | **Code** |  |  [optional] |
|**description** | **String** | Fabric Cloud Router Package description |  [optional] |
|**totalIPv4RoutesMax** | **Integer** | Cloud Router package BGP IPv4 routes limit |  [optional] |
|**totalIPv6RoutesMax** | **Integer** | Cloud Router package BGP IPv6 routes limit |  [optional] |
|**routeFilterSupported** | **Boolean** | CloudRouter package route filter support |  [optional] |
|**vcCountMax** | **Integer** | CloudRouter package Max Connection limit |  [optional] |
|**crCountMax** | **Integer** | CloudRouter package Max CloudRouter limit |  [optional] |
|**vcBandwidthMax** | **Integer** | CloudRouter package Max Bandwidth limit |  [optional] |
|**changeLog** | [**PackageChangeLog**](PackageChangeLog.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ROUTER_PACKAGE | &quot;ROUTER_PACKAGE&quot; |



