

# ServiceProfile

Service Profile is a software definition for a named provider service and it's network connectivity requirements. This includes the basic marketing information and one or more sets of access points (a set per each access point type) fulfilling the provider service. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**project** | [**Project**](Project.md) |  |  [optional] |
|**changeLog** | [**Changelog**](Changelog.md) | Seller Account for Service Profile. |  [optional] |
|**state** | **ServiceProfileStateEnum** |  |  [optional] |
|**account** | [**SimplifiedAccount**](SimplifiedAccount.md) | Seller Account for Service Profile. |  [optional] |
|**visibility** | **ServiceProfileVisibilityEnum** |  |  [optional] |
|**customFields** | [**List&lt;CustomField&gt;**](CustomField.md) |  |  [optional] |
|**description** | **String** | User-provided service description |  [optional] |
|**marketingInfo** | [**MarketingInfo**](MarketingInfo.md) |  |  [optional] |
|**type** | **ServiceProfileTypeEnum** |  |  [optional] |
|**ports** | [**List&lt;ServiceProfileAccessPointCOLO&gt;**](ServiceProfileAccessPointCOLO.md) |  |  [optional] |
|**uuid** | **UUID** | Equinix-assigned service profile identifier |  [optional] |
|**accessPointTypeConfigs** | [**List&lt;ServiceProfileAccessPointType&gt;**](ServiceProfileAccessPointType.md) |  |  [optional] |
|**selfProfile** | **Boolean** | response attribute indicates whether the profile belongs to the same organization as the api-invoker. |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**allowedEmails** | **List&lt;String&gt;** |  |  [optional] |
|**virtualDevices** | [**List&lt;ServiceProfileAccessPointVD&gt;**](ServiceProfileAccessPointVD.md) |  |  [optional] |
|**name** | **String** | Customer-assigned service profile name |  [optional] |
|**href** | **URI** | Service Profile URI response attribute |  [optional] [readonly] |
|**projectId** | **String** |  |  [optional] |
|**notifications** | [**List&lt;SimplifiedNotification&gt;**](SimplifiedNotification.md) | Recipients of notifications on service profile change |  [optional] |
|**metros** | [**List&lt;ServiceMetro&gt;**](ServiceMetro.md) | Derived response attribute. |  [optional] |



