

# PortOperation

Operational specifications for ports.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operationalStatus** | [**OperationalStatusEnum**](#OperationalStatusEnum) | Availability of a given physical port. |  [optional] |
|**connectionCount** | **Integer** | Total number of connections. |  [optional] |
|**opStatusChangedAt** | **OffsetDateTime** | Date and time at which port availability changed. |  [optional] |



## Enum: OperationalStatusEnum

| Name | Value |
|---- | -----|
| UP | &quot;UP&quot; |
| DOWN | &quot;DOWN&quot; |



