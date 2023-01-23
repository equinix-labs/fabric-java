

# VirtualGatewayPackage

Fabric Gateway Package

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**staticIPv6RoutesMax** | **Integer** | Gateway package static IPv6 routes limit |  [optional] |
|**naclRulesMax** | **Integer** | Gateway package NACLs rules limit |  [optional] |
|**code** | **Code** |  |  [optional] |
|**natType** | [**NatTypeEnum**](#NatTypeEnum) | Gateway package NAT supported type |  [optional] |
|**description** | **String** | Fabric Gateway Package description |  [optional] |
|**changeLog** | [**PackageChangeLog**](PackageChangeLog.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of Gateway package |  [optional] |
|**totalIPv4RoutesMax** | **Integer** | Gateway package BGP IPv4 routes limit |  [optional] |
|**haSupported** | **Boolean** | Gateway package high-available configuration support |  [optional] |
|**staticIPv4RoutesMax** | **Integer** | Gateway package static IPv4 routes limit |  [optional] |
|**naclsMax** | **Integer** | Gateway package NACLs limit |  [optional] |
|**totalIPv6RoutesMax** | **Integer** | Gateway package BGP IPv6 routes limit |  [optional] |
|**href** | **URI** | Gateway package URI |  [optional] [readonly] |
|**routeFilterSupported** | **Boolean** | Gateway package route filter support |  [optional] |



## Enum: NatTypeEnum

| Name | Value |
|---- | -----|
| STATIC_NAT | &quot;STATIC_NAT&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| GATEWAY_PACKAGE | &quot;GATEWAY_PACKAGE&quot; |



