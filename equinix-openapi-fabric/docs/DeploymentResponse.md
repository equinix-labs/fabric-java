

# DeploymentResponse

This API provides capability to retrieve user's deployments The response contains the details of the deployment including its state, topology, and providers. The deployment is identified by its UUID. The response also includes a list of notifications preferences for deployment status changes.     The response is in JSON format and follows the OpenAPI specification. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **String** |  |  [optional] |
|**uuid** | **UUID** |  |  [optional] |
|**type** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**state** | **String** |  |  [optional] |
|**topology** | [**DeploymentTopology**](DeploymentTopology.md) |  |  [optional] |
|**providers** | [**List&lt;ProviderResponse&gt;**](ProviderResponse.md) |  |  [optional] |
|**notifications** | [**List&lt;SimplifiedNotification&gt;**](SimplifiedNotification.md) | Preferences for notifications on deployement status changes |  [optional] |



