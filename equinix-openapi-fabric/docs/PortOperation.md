

# PortOperation

Operational specifications for ports.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operationalStatus** | [**OperationalStatusEnum**](#OperationalStatusEnum) | Availability of a given physical port. |  [optional] |
|**opStatusChangedAt** | **OffsetDateTime** | Date and time at which port availability changed. |  [optional] |
|**connectionCount** | **Integer** | Total number of connections. |  [optional] |



## Enum: OperationalStatusEnum

| Name | Value |
|---- | -----|
| UP | &quot;UP&quot; |
| DOWN | &quot;DOWN&quot; |



