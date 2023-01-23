

# VirtualGateway

Fabric Gateway Access point object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bgpIpv4RoutesCount** | **Integer** | Access point used and maximum number of IPv4 BGP routes |  [optional] |
|**change** | [**GatewayChange**](GatewayChange.md) |  |  [optional] |
|**name** | **String** | Customer-provided Fabric Gateway name |  [optional] |
|**changeLog** | [**Changelog**](Changelog.md) |  |  [optional] |
|**href** | **URI** | Fabric Gateway URI |  [optional] [readonly] |
|**state** | **VirtualGatewayAccessPointState** |  |  [optional] |
|**bgpIpv6RoutesCount** | **Integer** | Access point used and maximum number of IPv6 BGP routes |  [optional] |
|**uuid** | **UUID** | Equinix-assigned access point identifier |  [optional] |
|**connectionsCount** | **Integer** | Number of connections associated with this Access point |  [optional] |
|**_package** | [**VirtualGatewayPackageType**](VirtualGatewayPackageType.md) |  |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**location** | [**SimplifiedLocationWithoutIBX**](SimplifiedLocationWithoutIBX.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**account** | [**SimplifiedAccount**](SimplifiedAccount.md) |  |  [optional] |
|**notifications** | [**List&lt;SimplifiedNotification&gt;**](SimplifiedNotification.md) | Preferences for notifications on connection configuration or status changes |  [optional] |
|**order** | [**Order**](Order.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| XF_GATEWAY | &quot;XF_GATEWAY&quot; |



