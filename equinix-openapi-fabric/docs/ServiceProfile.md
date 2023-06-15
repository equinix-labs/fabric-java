

# ServiceProfile

Service Profile is a software definition for a named provider service and it's network connectivity requirements. This includes the basic marketing information and one or more sets of access points (a set per each access point type) fulfilling the provider service. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**state** | **ServiceProfileStateEnum** |  |  [optional] |
|**account** | [**SimplifiedAccount**](SimplifiedAccount.md) | Seller Account for Service Profile. |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**changeLog** | [**Changelog**](Changelog.md) | Seller Account for Service Profile. |  [optional] |
|**href** | **URI** | Service Profile URI response attribute |  [optional] [readonly] |
|**type** | **ServiceProfileTypeEnum** |  |  [optional] |
|**name** | **String** | Customer-assigned service profile name |  [optional] |
|**uuid** | **UUID** | Equinix-assigned service profile identifier |  [optional] |
|**description** | **String** | User-provided service description should be of maximum length 375 |  [optional] |
|**notifications** | [**List&lt;SimplifiedNotification&gt;**](SimplifiedNotification.md) | Recipients of notifications on service profile change |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**visibility** | **ServiceProfileVisibilityEnum** |  |  [optional] |
|**allowedEmails** | **List&lt;String&gt;** |  |  [optional] |
|**accessPointTypeConfigs** | [**List&lt;ServiceProfileAccessPointType&gt;**](ServiceProfileAccessPointType.md) |  |  [optional] |
|**customFields** | [**List&lt;CustomField&gt;**](CustomField.md) |  |  [optional] |
|**marketingInfo** | [**MarketingInfo**](MarketingInfo.md) |  |  [optional] |
|**ports** | [**List&lt;ServiceProfileAccessPointCOLO&gt;**](ServiceProfileAccessPointCOLO.md) |  |  [optional] |
|**virtualDevices** | [**List&lt;ServiceProfileAccessPointVD&gt;**](ServiceProfileAccessPointVD.md) |  |  [optional] |
|**metros** | [**List&lt;ServiceMetro&gt;**](ServiceMetro.md) | Derived response attribute. |  [optional] |
|**selfProfile** | **Boolean** | response attribute indicates whether the profile belongs to the same organization as the api-invoker. |  [optional] |
|**projectId** | **String** |  |  [optional] |



