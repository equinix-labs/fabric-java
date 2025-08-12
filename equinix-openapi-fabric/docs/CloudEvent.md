

# CloudEvent

Cloud Event object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**spec** | **String** | Cloud Event Open Telemetry specification |  [optional] [readonly] |
|**source** | **String** | Cloud Event source |  [optional] |
|**id** | **UUID** | Cloud Event identifier |  [optional] |
|**type** | **String** | Equinix supported event type |  [optional] |
|**subject** | **String** | Cloud Event subject |  [optional] |
|**dataschema** | **String** | Cloud Event dataschema reference |  [optional] |
|**datacontenttype** | **String** | Cloud Event data content type |  [optional] |
|**severitynumber** | **String** | Cloud Event severity number |  [optional] |
|**severitytext** | **String** | Cloud Event severity text |  [optional] |
|**equinixorganization** | **UUID** | Equinix organization identifier |  [optional] |
|**equinixproject** | **UUID** | Equinix project identifier |  [optional] |
|**authtype** | **String** | Cloud Event auth type |  [optional] |
|**authid** | **String** | Cloud Event user identifier |  [optional] |
|**traceparent** | **String** | Cloud Event traceparent |  [optional] |
|**tracestate** | **String** | Cloud Event tracestate |  [optional] |
|**data** | [**CloudEventData**](CloudEventData.md) |  |  [optional] |



