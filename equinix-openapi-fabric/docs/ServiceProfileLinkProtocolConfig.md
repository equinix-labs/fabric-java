

# ServiceProfileLinkProtocolConfig

Configuration for dot1q to qinq translation support

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**encapsulationStrategy** | [**EncapsulationStrategyEnum**](#EncapsulationStrategyEnum) | was tagType - missing on wiki |  [optional] |
|**namedTags** | **List&lt;String&gt;** |  |  [optional] |
|**vlanCTagLabel** | **String** | was ctagLabel |  [optional] |
|**reuseVlanSTag** | **Boolean** |  |  [optional] |
|**encapsulation** | [**EncapsulationEnum**](#EncapsulationEnum) | Port encapsulation - Derived response attribute. Ignored on request payloads. |  [optional] |



## Enum: EncapsulationStrategyEnum

| Name | Value |
|---- | -----|
| CTAGED | &quot;CTAGED&quot; |
| BOTH | &quot;BOTH&quot; |
| NAMED | &quot;NAMED&quot; |



## Enum: EncapsulationEnum

| Name | Value |
|---- | -----|
| QINQ | &quot;QINQ&quot; |
| DOT1Q | &quot;DOT1Q&quot; |
| UNTAGGED | &quot;UNTAGGED&quot; |



