

# FabricGateway

Fabric Gateway Access point object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Fabric Gateway URI |  [optional] [readonly] |
|**uuid** | **UUID** | Equinix-assigned access point identifier |  [optional] |
|**name** | **String** | Customer-provided Fabric Gateway name |  [optional] |
|**state** | **FabricGatewayAccessPointState** |  |  [optional] |
|**equinixAsn** | **Long** | Equinix ASN |  [optional] |
|**bgpIpv4RoutesCount** | **Integer** | Access point used and maximum number of IPv4 BGP routes |  [optional] |
|**bgpIpv6RoutesCount** | **Integer** | Access point used and maximum number of IPv6 BGP routes |  [optional] |
|**connectionsCount** | **Integer** | Number of connections associated with this Access point |  [optional] |
|**changeLog** | [**Changelog**](Changelog.md) |  |  [optional] |
|**change** | [**GatewayChange**](GatewayChange.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**location** | [**SimplifiedLocationWithoutIBX**](SimplifiedLocationWithoutIBX.md) |  |  [optional] |
|**_package** | [**FabricGatewayPackageType**](FabricGatewayPackageType.md) |  |  [optional] |
|**order** | [**Order**](Order.md) |  |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**account** | [**SimplifiedAccount**](SimplifiedAccount.md) |  |  [optional] |
|**notifications** | [**List&lt;SimplifiedNotification&gt;**](SimplifiedNotification.md) | Preferences for notifications on connection configuration or status changes |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| XF_GATEWAY | &quot;XF_GATEWAY&quot; |



