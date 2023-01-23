

# VirtualGatewayPostRequest

Create Fabric Gateway

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_package** | [**VirtualGatewayPackageType**](VirtualGatewayPackageType.md) |  |  [optional] |
|**name** | **String** | Customer-provided Fabric Gateway name |  [optional] |
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



