

# Md5


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**keyNumber** | **Integer** | The authentication Key ID. |  [optional] |
|**key** | **byte[]** | The plaintext authentication key. Must be Base64 encoded. For ASCII type, the key must contain printable ASCII characters, range 10-20 characters. For HEX type, range should be 10-40 characters. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ASCII | &quot;ASCII&quot; |
| HEX | &quot;HEX&quot; |



