

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
| ADD | &quot;add&quot; |
| REMOVE | &quot;remove&quot; |



## Enum: PathEnum

| Name | Value |
|---- | -----|
| NAME | &quot;/name&quot; |
| PACKAGE_CODE | &quot;/package/code&quot; |
| IPV4 | &quot;/ipv4&quot; |
| NTPADVANCEDCONFIGURATION | &quot;/ntpAdvancedConfiguration&quot; |
| PTPADVANCEDCONFIGURATION | &quot;/ptpAdvancedConfiguration&quot; |



