

# ApiConfig

Configuration for API based Integration for Service Profile

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiAvailable** | **Boolean** | Setting indicating whether the API is available (true) or not (false). |  [optional] |
|**integrationId** | **String** |  |  [optional] |
|**equinixManagedPort** | **Boolean** | Setting indicating that the port is managed by Equinix (true) or not (false). |  [optional] |
|**equinixManagedVlan** | **Boolean** | Setting indicating that the VLAN is managed by Equinix (true) or not (false). |  [optional] |
|**allowOverSubscription** | **Boolean** | Setting showing that oversubscription support is available (true) or not (false). The default is false. Oversubscription is the sale of more than the available network bandwidth. This practice is common and legitimate. After all, many customers use less bandwidth than they&#39;ve purchased. And network users don&#39;t consume bandwidth all at the same time. The leftover bandwidth can be sold to other customers. When demand surges, operational and engineering resources can be shifted to accommodate the load.  |  [optional] |
|**overSubscriptionLimit** | **Integer** | A cap on oversubscription. |  [optional] |
|**bandwidthFromApi** | **Boolean** |  |  [optional] |



