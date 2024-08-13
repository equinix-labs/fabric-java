

# PrecisionTimeChangeOperation

Fabric Precision Timing change operation data

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**op** | [**OpEnum**](#OpEnum) | Handy shortcut for operation name |  |
|**path** | [**PathEnum**](#PathEnum) | path inside document leading to updated parameter |  |
|**value** | **Object** | new value for updated parameter |  |



## Enum: OpEnum

| Name | Value |
|---- | -----|
| REPLACE | &quot;replace&quot; |



## Enum: PathEnum

| Name | Value |
|---- | -----|
| NAME | &quot;/name&quot; |
| PACKAGE_CODE | &quot;/package/code&quot; |



