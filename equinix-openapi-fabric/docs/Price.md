

# Price


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | Equinix-assigned product code |  [optional] |
|**catgory** | **PriceCategory** |  |  [optional] |
|**ipBlock** | [**IpBlockPrice**](IpBlockPrice.md) |  |  [optional] |
|**description** | **String** | Product description |  [optional] |
|**type** | **ProductType** |  |  [optional] |
|**charges** | [**List&lt;PriceCharge&gt;**](PriceCharge.md) |  |  [optional] |
|**termLength** | [**TermLengthEnum**](#TermLengthEnum) | In months. No value means unlimited |  [optional] |
|**port** | [**VirtualPortPrice**](VirtualPortPrice.md) |  |  [optional] |
|**name** | **String** | Full product name |  [optional] |
|**currency** | **String** | Product offering price currency |  [optional] |
|**connection** | [**VirtualConnectionPrice**](VirtualConnectionPrice.md) |  |  [optional] |
|**href** | **String** | An absolute URL that returns specified pricing data |  [optional] |
|**account** | [**SimplifiedAccount**](SimplifiedAccount.md) |  |  [optional] |
|**gateway** | [**FabricGatewayPrice**](FabricGatewayPrice.md) |  |  [optional] |



## Enum: TermLengthEnum

| Name | Value |
|---- | -----|
| NUMBER_12 | 12 |
| NUMBER_24 | 24 |
| NUMBER_36 | 36 |



