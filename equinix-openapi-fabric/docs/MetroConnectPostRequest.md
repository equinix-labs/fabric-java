

# MetroConnectPostRequest

Create Metro Connect

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | Metro Connect Type |  |
|**bandwidth** | **Integer** | Bandwidth in Mbps |  |
|**connectivityDestinationType** | [**ConnectivityDestinationTypeEnum**](#ConnectivityDestinationTypeEnum) | Destination Port connectivity type |  |
|**aSide** | [**MetroConnectASide**](MetroConnectASide.md) |  |  |
|**zSide** | [**MetroConnectZSide**](MetroConnectZSide.md) |  |  |
|**order** | [**MetroConnectOrder**](MetroConnectOrder.md) |  |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**account** | [**SimplifiedAccount**](SimplifiedAccount.md) |  |  |
|**notifications** | [**List&lt;SimplifiedNotification&gt;**](SimplifiedNotification.md) | Preferences for notifications on connection configuration or status changes |  [optional] |



## Enum: ConnectivityDestinationTypeEnum

| Name | Value |
|---- | -----|
| COLO | &quot;COLO&quot; |
| BMMR | &quot;BMMR&quot; |
| REMOTE | &quot;REMOTE&quot; |



