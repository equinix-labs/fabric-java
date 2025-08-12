

# StreamSubscriptionOperation

Stream subscription operational information

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventsDeliveredCount** | **Integer** | count of delivered events |  [optional] |
|**metricsDeliveredCount** | **Integer** | count of delivered metrics |  [optional] |
|**alertsDeliveredCount** | **Integer** | count of delivered alerts |  [optional] |
|**lastSuccessfulDeliveryDateTime** | **OffsetDateTime** | last successful date time of delivered event, metric, or alert |  [optional] |
|**suspendedDateTime** | **OffsetDateTime** | suspended date time of stream subscription delivery for event, metric, or alert |  [optional] |
|**errors** | [**List&lt;StreamSubscriptionOperationErrors&gt;**](StreamSubscriptionOperationErrors.md) | List of error information for stream subscription delivery |  [optional] |



