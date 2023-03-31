

# FabricGatewayPackage

Fabric Gateway Package

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Gateway package URI |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of Gateway package |  [optional] |
|**code** | **Code** |  |  [optional] |
|**description** | **String** | Fabric Gateway Package description |  [optional] |
|**totalIPv4RoutesMax** | **Integer** | Gateway package BGP IPv4 routes limit |  [optional] |
|**totalIPv6RoutesMax** | **Integer** | Gateway package BGP IPv6 routes limit |  [optional] |
|**staticIPv4RoutesMax** | **Integer** | Gateway package static IPv4 routes limit |  [optional] |
|**staticIPv6RoutesMax** | **Integer** | Gateway package static IPv6 routes limit |  [optional] |
|**naclsMax** | **Integer** | Gateway package NACLs limit |  [optional] |
|**naclRulesMax** | **Integer** | Gateway package NACLs rules limit |  [optional] |
|**haSupported** | **Boolean** | Gateway package high-available configuration support |  [optional] |
|**routeFilterSupported** | **Boolean** | Gateway package route filter support |  [optional] |
|**natType** | [**NatTypeEnum**](#NatTypeEnum) | Gateway package NAT supported type |  [optional] |
|**maxConnLimit** | **Integer** | Gateway package Max Connection limit |  [optional] |
|**maxGwLimit** | **Integer** | Gateway package Max Gateways limit |  [optional] |
|**maxBwLimit** | **Integer** | Gateway package Max Bandwidth limit |  [optional] |
|**changeLog** | [**PackageChangeLog**](PackageChangeLog.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| GATEWAY_PACKAGE | &quot;GATEWAY_PACKAGE&quot; |



## Enum: NatTypeEnum

| Name | Value |
|---- | -----|
| STATIC_NAT | &quot;STATIC_NAT&quot; |



