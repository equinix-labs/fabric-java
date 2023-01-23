

# Connection

Connection specification

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bandwidth** | **Integer** | Connection bandwidth in Mbps |  |
|**aSide** | [**ConnectionSide**](ConnectionSide.md) |  |  |
|**change** | [**Change**](Change.md) |  |  [optional] |
|**isRemote** | **Boolean** | Connection property derived from access point locations |  [optional] |
|**description** | **String** | Customer-provided connection description |  [optional] |
|**changeLog** | [**Changelog**](Changelog.md) |  |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**type** | **ConnectionType** |  |  |
|**uuid** | **String** | Equinix-assigned connection identifier |  [optional] |
|**zSide** | [**ConnectionSide**](ConnectionSide.md) |  |  |
|**name** | **String** | Customer-provided connection name |  |
|**additionalInfo** | [**List&lt;ConnectionSideAdditionalInfo&gt;**](ConnectionSideAdditionalInfo.md) | Connection additional information |  [optional] |
|**href** | **URI** | Connection URI |  [optional] [readonly] |
|**state** | **ConnectionState** |  |  [optional] |
|**redundancy** | [**ConnectionRedundancy**](ConnectionRedundancy.md) |  |  [optional] |
|**operation** | [**ConnectionOperation**](ConnectionOperation.md) |  |  [optional] |
|**notifications** | [**List&lt;SimplifiedNotification&gt;**](SimplifiedNotification.md) | Preferences for notifications on connection configuration or status changes |  [optional] |
|**account** | [**SimplifiedAccount**](SimplifiedAccount.md) |  |  [optional] |
|**order** | [**Order**](Order.md) |  |  [optional] |
|**direction** | **ConnectionDirection** |  |  [optional] |



