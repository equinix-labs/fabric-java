

# FabricGatewayPostRequest

Create Fabric Gateway

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**name** | **String** | Customer-provided Fabric Gateway name |  [optional] |
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



