/*
 * Equinix Fabric API v4
 *
 * Contact: api-support@equinix.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.equinix.openapi.fabric.tests;

import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.tests.dto.users.UsersItem;
import com.equinix.openapi.fabric.tests.helpers.Utils;
import com.equinix.openapi.fabric.v4.model.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static com.equinix.openapi.fabric.tests.PortsApiTest.getPorts;
import static com.equinix.openapi.fabric.tests.helpers.Apis.serviceProfilesApi;
import static com.equinix.openapi.fabric.tests.helpers.Apis.setUserName;
import static com.equinix.openapi.fabric.tests.helpers.TokenGenerator.users;
import static com.equinix.openapi.fabric.v4.model.Expression.OperatorEnum.EQUAL;
import static java.util.Collections.singletonList;
import static org.junit.Assert.*;

/**
 * API tests for ServiceProfilesApi
 */
public class ServiceProfilesApiTest {
    private static final UsersItem.UserName userName = UsersItem.UserName.PANTHERS_FCR;

    public static void removeServiceProfiles(UsersItem.UserName userName) {
        users.get(userName).getUserResources().getServiceProfilesUuid().forEach(uuid -> {
            try {
                if (!serviceProfilesApi.getServiceProfileByUuid(uuid, null).getState().equals(ServiceProfileStateEnum.DELETED)) {
                    deleteServiceProfile(uuid);
                }
            } catch (ApiException e) {
                throw new RuntimeException(e);
            }
        });
    }

    @BeforeClass
    public static void setUp() {
        setUserName(userName);
    }

    @AfterClass
    public static void removeResources() {
        removeServiceProfiles(userName);
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Successful Create operation
     */
    @Test
    public void createServiceProfileSp2() throws ApiException {
        createServiceProfile();
        assertEquals(201, serviceProfilesApi.getApiClient().getStatusCode());
    }

    /**
     * Successful operation
     */
    @Test
    public void getServiceProfileMetrosByUuid() throws ApiException {
        ServiceProfiles serviceProfiles = getServiceProfilesByQueryResponse("aSide");
        ServiceProfile serviceProfileToCheck = serviceProfiles.getData().get(0);
        ServiceMetros serviceMetros = serviceProfilesApi.getServiceProfileMetrosByUuid(serviceProfileToCheck.getUuid(), 0, 10);
        assertEquals(200, serviceProfilesApi.getApiClient().getStatusCode());
        assertFalse(serviceMetros.getData().isEmpty());
        boolean isFound = serviceMetros.getData().stream().anyMatch(metro -> metro.getCode().equals(serviceProfileToCheck.getMetros().get(0).getCode()));
        assertTrue(isFound);
    }

    /**
     * Successful operation
     */
    @Test
    public void getServiceProfiles() throws ApiException {
        ServiceProfiles serviceProfiles = getServiceProfilesByQueryResponse("aSide");
        assertEquals(200, serviceProfilesApi.getApiClient().getStatusCode());
        assertFalse(serviceProfiles.getData().isEmpty());
    }

    /**
     * Successful operation
     */
    @Test
    public void getServiceProfile() throws ApiException {
        ServiceProfiles serviceProfiles = getServiceProfilesByQueryResponse("aSide");
        ServiceProfile serviceProfileToCheck = serviceProfiles.getData().get(0);
        ServiceProfile serviceProfile = serviceProfilesApi.getServiceProfileByUuid(serviceProfileToCheck.getUuid(), "aSide");
        assertEquals(200, serviceProfilesApi.getApiClient().getStatusCode());
        assertEquals(serviceProfileToCheck.getUuid(), serviceProfile.getUuid());
        assertEquals(serviceProfileToCheck.getName(), serviceProfile.getName());
    }

    /**
     * Successful Delete operation
     */
    @Test
    public void deleteServiceProfileByUuid() throws ApiException {
        ServiceProfile serviceProfile = createServiceProfile();
        serviceProfilesApi.deleteServiceProfileByUuid(serviceProfile.getUuid());
        assertEquals(200, serviceProfilesApi.getApiClient().getStatusCode());
    }

    /**
     * Successful operation
     */
    @Test
    public void searchServiceProfiles() throws ApiException {
        ServiceProfileSearchRequest serviceProfileSearchRequest = new ServiceProfileSearchRequest();
        ServiceProfileSimpleExpression serviceProfileSimpleExpression = new ServiceProfileSimpleExpression();
        serviceProfileSimpleExpression.setProperty(ServiceProfileSortBy.STATE.getValue());
        serviceProfileSimpleExpression.setOperator(EQUAL.getValue());
        serviceProfileSimpleExpression.setValues(singletonList("ACTIVE"));
        serviceProfileSearchRequest
                .filter(new ServiceProfileFilter(serviceProfileSimpleExpression))
                .sort(singletonList(new ServiceProfileSortCriteria()
                        .direction(ServiceProfileSortDirection.DESC)
                        .property(ServiceProfileSortBy.CHANGELOG_UPDATEDDATETIME)))
                .pagination(new PaginationRequest().
                        limit(20).offset(00));
        ServiceProfiles serviceProfiles = serviceProfilesApi.searchServiceProfiles(serviceProfileSearchRequest, "aSide");
        assertEquals(200, serviceProfilesApi.getApiClient().getStatusCode());
        assertFalse(serviceProfiles.getData().isEmpty());
    }

    public ServiceProfiles getServiceProfilesByQueryResponse(String viewPointQuery) throws ApiException {
        return serviceProfilesApi.getServiceProfiles(1, 10, viewPointQuery);
    }

    /**
     * Successful Patch operation
     */
    @Test
    public void updateServiceProfileByUuid() throws ApiException {
        ServiceProfile serviceProfile = createServiceProfile();

        String updatedServiceName = "panthers updated sp2" + RandomStringUtils.randomAlphabetic(5);
        String updatedDescription = "updated description";

        ServiceProfileRequest serviceProfileRequest = getServiceProfileRequest()
                .name(updatedServiceName)
                .description(updatedDescription);

        ServiceProfile updatedServiceProfile = serviceProfilesApi.putServiceProfileByUuid(serviceProfile.getUuid(), "1", serviceProfileRequest);

        assertEquals(202, serviceProfilesApi.getApiClient().getStatusCode());
        assertEquals(updatedServiceName, updatedServiceProfile.getName());
        assertEquals(updatedDescription, updatedServiceProfile.getDescription());
    }

    private static void deleteServiceProfile(UUID uuid) throws ApiException {
        serviceProfilesApi.deleteServiceProfileByUuid(uuid);
        assertEquals(200, serviceProfilesApi.getApiClient().getStatusCode());
        waitForSpIsInState(uuid, ServiceProfileStateEnum.DELETED);
    }

    private static void waitForSpIsInState(UUID uuid, ServiceProfileStateEnum state) throws ApiException {
        boolean result = false;
        ServiceProfileStateEnum currentState = null;
        for (int i = 0; i < 5; i++) {
            ServiceProfile serviceProfile = serviceProfilesApi.getServiceProfileByUuid(uuid, null);
            currentState = serviceProfile.getState();
            if (serviceProfile.getState().equals(state)) {
                result = true;
                break;
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        assertTrue("Service profile has not reached the expected state: " + state + " current state: " + currentState.getValue(), result);
    }

    private ServiceProfile createServiceProfile() throws ApiException {
        ServiceProfile serviceProfile = serviceProfilesApi.createServiceProfile(getServiceProfileRequest());
        users.get(userName).getUserResources().addServiceProfileUuid(serviceProfile.getUuid());
        return serviceProfile;
    }

    private ServiceProfileRequest getServiceProfileRequest() throws ApiException {
        UsersItem usersItem = Utils.getUserData(userName);
        List<String> email = singletonList("panthersfcr@test.com");

        Port port = getPorts(userName).getData().stream()
                .filter(p -> p.getName().contains("Dot1q"))
                .findFirst().get();
        return new ServiceProfileRequest()
                .name("panthers-sp2-test" + RandomStringUtils.randomAlphabetic(5))
                .description("desc")
                .type(ServiceProfileTypeEnum.L2_PROFILE)
                .notifications(
                        Arrays.asList(new SimplifiedNotification().emails(email).type(SimplifiedNotification.TypeEnum.BANDWIDTH_ALERT),
                                new SimplifiedNotification().emails(email).type(SimplifiedNotification.TypeEnum.CONNECTION_APPROVAL),
                                new SimplifiedNotification().emails(email).type(SimplifiedNotification.TypeEnum.PROFILE_LIFECYCLE)))
                .tags(Arrays.asList("SaaS", "VoIP"))
                .project(new Project().projectId(usersItem.getProjectId()))
                .visibility(ServiceProfileVisibilityEnum.PRIVATE)
                .ports(singletonList(new ServiceProfileAccessPointCOLO()
                        .type(ServiceProfileAccessPointCOLO.TypeEnum.XF_PORT)
                        .uuid(port.getUuid())
                        .location(new SimplifiedLocation().metroCode(port.getLocation().getMetroCode()))))
                .accessPointTypeConfigs(singletonList(new ServiceProfileAccessPointType(new ServiceProfileAccessPointTypeCOLO()
                        .type(ServiceProfileAccessPointTypeEnum.COLO)
                        .linkProtocolConfig(new ServiceProfileLinkProtocolConfig()
                                .encapsulationStrategy(null)
                                .reuseVlanSTag(false))
                        .enableAutoGenerateServiceKey(false)
                        .connectionRedundancyRequired(false)
                        .apiConfig(new ApiConfig()
                                .equinixManagedPort(false)
                                .equinixManagedVlan(false)
                                .allowOverSubscription(false)
                                .overSubscriptionLimit(1)
                                .apiAvailable(false)
                                .bandwidthFromApi(false))
                        .authenticationKey(new AuthenticationKey().required(false))
                        .allowRemoteConnections(true)
                        .supportedBandwidths(Arrays.asList(10, 50, 200, 500, 1000))
                        .allowCustomBandwidth(false)
                        .connectionLabel("Connection")
                        .allowBandwidthAutoApproval(false)
                )))
                .marketingInfo(new MarketingInfo().promotion(false).processSteps(new ArrayList<>()));
    }
}