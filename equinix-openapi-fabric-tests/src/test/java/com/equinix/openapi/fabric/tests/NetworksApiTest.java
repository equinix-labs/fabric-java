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
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.UUID;

import static com.equinix.openapi.fabric.tests.helpers.Apis.*;
import static com.equinix.openapi.fabric.tests.helpers.TokenGenerator.users;
import static java.util.Collections.singletonList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * API tests for NetworksApi
 */
public class NetworksApiTest {
    private static final UsersItem.UserName userName = UsersItem.UserName.PANTHERS_FNV;

    public static void removeNetworks(UsersItem.UserName userName) {
        users.get(userName).getUserResources().getNetworksUuid().forEach(NetworksApiTest::deleteNetwork);
    }

    @BeforeClass
    public static void setUp() {
        setUserName(userName);
    }

    @AfterClass
    public static void removeResources() {
        removeNetworks(userName);
    }

    public Network createNetwork() throws ApiException {
        UsersItem user = Utils.getUserData(userName);
        NetworkPostRequest networkPostRequest = new NetworkPostRequest()
                .name("panthers_network" + getCurrentUser().getValue())
                .type(NetworkType.EVPLAN)
                .scope(NetworkScope.LOCAL)
                .project(new Project().projectId(user.getProjectId()))
                .notifications(singletonList(new SimplifiedNotification()
                        .type(SimplifiedNotification.TypeEnum.ALL).emails(singletonList("test@equinix.com"))));

        Network network = networksApi.createNetwork(networkPostRequest, true);
        assertEquals(201, networksApi.getApiClient().getStatusCode());

        for (int i = 0; i < 5; i++) {
            Network networkGet = networksApi.getNetworkByUuid(network.getUuid());

            if (networkGet.getState().equals(NetworkState.ACTIVE)) {
                break;
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        users.get(userName).getUserResources().addNetworkUuid(network.getUuid());
        return network;
    }

    /**
     * Fabric Network Access point object
     */
    @Test
    public void validateNetworkCreation() throws ApiException {
        createNetwork();
    }

    public static void deleteNetwork(UUID uuid) {

        try {
            Network network = networksApi.getNetworkByUuid(uuid);
            if (!network.getState().equals(NetworkState.DELETED)) {
                networksApi.deleteNetworkByUuid(uuid);
                assertEquals(202, networksApi.getApiClient().getStatusCode());
            }
        } catch (ApiException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Fabric Network Access point object
     */
    @Test
    public void deleteNetworkByUuid() throws ApiException {
        Network network = createNetwork();
        deleteNetwork(network.getUuid());
    }

    /**
     * Fabric Network Access point object
     */
    @Test
    public void getNetworkByUuid() throws ApiException {
        Network network = createNetwork();
        Network networkGetResponse = networksApi.getNetworkByUuid(network.getUuid());
        assertEquals(200, networksApi.getApiClient().getStatusCode());
        assertEquals(network.getUuid(), networkGetResponse.getUuid());
        assertEquals(network.getName(), networkGetResponse.getName());
    }

    /**
     * Fabric Network Access point object
     */
    @Test
    public void updateNetwork() throws ApiException {
        String updatedName = "panthers_network_updated";
        Network network = createNetwork();
        NetworkChangeOperation changeOperation = new NetworkChangeOperation()
                .op(NetworkChangeOperation.OpEnum.REPLACE)
                .path(NetworkSearchFieldName.NAME.getValue())
                .value(updatedName);

        Network networkPutResponse = networksApi.updateNetworkByUuid(network.getUuid(), singletonList(changeOperation));
        assertEquals(200, networksApi.getApiClient().getStatusCode());
        assertEquals(updatedName, networkPutResponse.getName());
    }

    /**
     * Fabric Network Access point object
     */
    @Test
    public void searchNetwork() throws ApiException {
        Network network = createNetwork();
        NetworkSearchRequest networkSearchRequest = new NetworkSearchRequest()
                .filter(new NetworkFilter().addAndItem(new NetworkFilter()
                        .property(NetworkSearchFieldName.UUID)
                        .operator(NetworkFilter.OperatorEnum.EQUAL)
                        .values(singletonList(String.valueOf(network.getUuid())))))
                .sort(singletonList(new NetworkSortCriteria().direction(NetworkSortDirection.DESC).property(NetworkSortBy.CHANGELOG_CREATEDDATETIME)))
                .pagination(new PaginationRequest().offset(0).limit(20));

        NetworkSearchResponse networkSearchResponse = networksApi.searchNetworks(networkSearchRequest);

        assertEquals(200, networksApi.getApiClient().getStatusCode());
        assertFalse(networkSearchResponse.getData().isEmpty());
    }
}
