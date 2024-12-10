

# ConnectionRouteTableEntry

Advertised and received route table entry object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **RouteTableEntryType** |  |  |
|**protocolType** | **RouteTableEntryProtocolType** |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) |  |  |
|**age** | **String** |  |  [optional] |
|**prefix** | **String** |  |  [optional] |
|**nextHop** | **String** |  |  [optional] |
|**MED** | **Integer** |  |  [optional] |
|**localPreference** | **Integer** |  |  [optional] |
|**asPath** | **List&lt;String&gt;** |  |  [optional] |
|**connection** | [**ConnectionRouteTableEntryConnection**](ConnectionRouteTableEntryConnection.md) |  |  [optional] |
|**changeLog** | [**Changelog**](Changelog.md) |  |  |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |



