

# Price


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **String** | An absolute URL that returns specified pricing data |  [optional] |
|**type** | **ProductType** |  |  [optional] |
|**code** | **String** | Equinix-assigned product code |  [optional] |
|**name** | **String** | Full product name |  [optional] |
|**description** | **String** | Product description |  [optional] |
|**account** | [**SimplifiedAccount**](SimplifiedAccount.md) |  |  [optional] |
|**charges** | [**List&lt;PriceCharge&gt;**](PriceCharge.md) |  |  [optional] |
|**currency** | **String** | Product offering price currency |  [optional] |
|**termLength** | [**TermLengthEnum**](#TermLengthEnum) | In months. No value or value of 1 means on-demand |  [optional] |
|**catgory** | **PriceCategory** |  |  [optional] |
|**connection** | [**VirtualConnectionPrice**](VirtualConnectionPrice.md) |  |  [optional] |
|**ipBlock** | [**IpBlockPrice**](IpBlockPrice.md) |  |  [optional] |
|**router** | [**FabricCloudRouterPrice**](FabricCloudRouterPrice.md) |  |  [optional] |
|**port** | [**VirtualPortPrice**](VirtualPortPrice.md) |  |  [optional] |
|**timeService** | [**TimeServicePrice**](TimeServicePrice.md) |  |  [optional] |



## Enum: TermLengthEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_12 | 12 |
| NUMBER_24 | 24 |
| NUMBER_36 | 36 |



