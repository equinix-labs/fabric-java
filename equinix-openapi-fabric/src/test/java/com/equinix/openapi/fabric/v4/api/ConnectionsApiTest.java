/*
 * Equinix Fabric API v4
 *
 * Contact: api-support@equinix.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.equinix.openapi.fabric.v4.api;

import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.v4.api.dto.port.PortDto;
import com.equinix.openapi.fabric.v4.api.dto.users.UsersItem;
import com.equinix.openapi.fabric.v4.api.helpers.Utils;
import com.equinix.openapi.fabric.v4.model.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;

import static com.equinix.openapi.fabric.v4.api.CloudRoutersApiTest.createRouter;
import static com.equinix.openapi.fabric.v4.api.PortsApiTest.getPorts;
import static com.equinix.openapi.fabric.v4.api.helpers.Apis.*;
import static com.equinix.openapi.fabric.v4.api.helpers.TokenGenerator.users;
import static com.equinix.openapi.fabric.v4.api.helpers.Utils.getRandomVlanNumber;
import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConnectionsApiTest {
    private static final UsersItem.UserName userName = UsersItem.UserName.PANTHERS_FCR;

    public static void removeConnections(UsersItem.UserName userName) {
        users.get(userName).getUserResources().getConnectionsUuid().forEach(uuid -> {
            try {
                deleteConnection(uuid);
            } catch (ApiException e) {
                throw new RuntimeException(e);
            }
        });
    }

    @BeforeAll
    public static void setUp() {
        setUserName(userName);
    }

    @AfterAll
    public static void removeResources() {
        removeConnections(userName);
        CloudRoutersApiTest.removeCloudRouters(userName);
    }

    @Test
    public void createConnectionVdColo() throws ApiException {
        UsersItem usersItem = Utils.getUserData(getCurrentUser());

        UUID portUuid = UUID.fromString(usersItem.getPorts().stream()
                .filter(port -> port.getEncapsulation().equals(LinkProtocolType.DOT1Q.getValue()))
                .findFirst().get().getUuid());

        ConnectionPostRequest connectionPostRequest = getDefaultConnectionRequest("panthers-con-vd-2-colo")
                .bandwidth(1000)
                .type(ConnectionType.EVPL_VC)
                .order(new Order().purchaseOrderNumber("pol123"))
                .aSide(new ConnectionSide().accessPoint(new AccessPoint()
                        .type(AccessPointType.VD)
                        .virtualDevice(new VirtualDevice()
                                .type(VirtualDevice.TypeEnum.EDGE)
                                .uuid(usersItem.getVirtualDevices().get(0).getUuid()))));

        Connection connection = null;

        for (int i = 0; i < 3; i++) {
            int vlanTag = getRandomVlanNumber();
            connectionPostRequest.zSide(new ConnectionSide().accessPoint(
                    new AccessPoint()
                            .type(AccessPointType.COLO)
                            .port(new SimplifiedPort()
//                                    .uuid(port.getUuid()))
                                    .uuid(portUuid))
                            .linkProtocol(new SimplifiedLinkProtocol()
                                    .type(LinkProtocolType.DOT1Q)
                                    .vlanTag(vlanTag))));

            connection = connectionsApi.createConnection(connectionPostRequest);

            if (connectionsApi.getApiClient().getStatusCode() == 201) {
                break;
            }
        }

        assertEquals(201, connectionsApi.getApiClient().getStatusCode());
        users.get(userName).getUserResources().addConnectionUuid(connection.getUuid());
        waitForConnectionIsInState(connection.getUuid(), EquinixStatus.PROVISIONED);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void createConnectionPort2SP() throws ApiException {
        Connection connection = createPort2SpConnection();
        users.get(userName).getUserResources().addConnectionUuid(connection.getUuid());
        waitForConnectionIsInState(connection.getUuid(), EquinixStatus.PENDING_APPROVAL);
    }

    @Test
    public void createConnectionFCR2Port() throws ApiException {
        Connection connection = createConnectionFCR2ToPort();
        waitForConnectionIsInState(connection.getUuid(), EquinixStatus.PENDING_INTERFACE_CONFIGURATION);
    }

    @Test
    public void createConnectionPort2Port() throws ApiException {
        createPort2Port();
    }

    /**
     * Successful operation
     */
    @Test
    public void searchConnections() throws ApiException {
        ConnectionSearchResponse connectionSearchResponse = getConnections();
        assertEquals(200, connectionsApi.getApiClient().getStatusCode());
        connectionSearchResponse.getData().forEach(connection -> assertEquals(connection.getOperation().getProviderStatus(), ProviderStatus.AVAILABLE));
    }

    /**
     * Successful operation
     */
    @Test
    public void getConnectionByUuid() throws ApiException {
        ConnectionSearchResponse connectionSearchResponse = getConnections();
        Connection randomConnection = connectionSearchResponse.getData().get(new Random().nextInt(connectionSearchResponse.getData().size()));

        Connection connection = connectionsApi.getConnectionByUuid(randomConnection.getUuid(), null);

        assertEquals(200, connectionsApi.getApiClient().getStatusCode());
        assertEquals(randomConnection.getUuid(), connection.getUuid());
        assertEquals(randomConnection.getName(), connection.getName());
    }

    /**
     * Delete Connection Request
     */
    @Test
    public void deleteConnectionByUuid() throws ApiException {
        Connection connection = createPort2SpConnection();
        connectionsApi.deleteConnectionByUuid(connection.getUuid());
        waitForConnectionIsInState(connection.getUuid(), EquinixStatus.DELETED);
        assertEquals(200, connectionsApi.getApiClient().getStatusCode());
    }

    public static Connection createConnectionFCR2ToPort() throws ApiException {
        CloudRouter cloudRouter = createRouter();

        UsersItem userDto = Utils.getUserData(getCurrentUser());

        Random r = new Random();
        List<Port> portList = getPorts(userName).getData().stream()
                .filter(p -> p.getName().contains("Dot1q"))
                .filter(p -> p.getLocation().getMetroCode().equals(cloudRouter.getLocation().getMetroCode()))
                .collect(Collectors.toList());

        Port port = portList.get(r.nextInt(portList.size()));

        ConnectionPostRequest connectionPostRequest = getDefaultConnectionRequest("panthers-con-fcr-2-port")
                .type(ConnectionType.IP_VC)
                .bandwidth(1000)
                .project(new Project().projectId(userDto.getProjectId()))
                .aSide(new ConnectionSide().accessPoint(
                        new AccessPoint()
                                .type(AccessPointType.CLOUD_ROUTER)
                                .router(new CloudRouter().uuid(cloudRouter.getUuid()))));

        Connection connection = null;
        for (int i = 0; i < 3; i++) {
            int tag = getRandomVlanNumber();
            connectionPostRequest.zSide(new ConnectionSide().accessPoint(
                    new AccessPoint()
                            .type(AccessPointType.COLO)
                            .port(new SimplifiedPort().uuid(port.getUuid()))
                            .linkProtocol(new SimplifiedLinkProtocol()
                                    .type(LinkProtocolType.DOT1Q)
                                    .vlanTag(tag))));

            connection = connectionsApi.createConnection(connectionPostRequest);

            if (connectionsApi.getApiClient().getStatusCode() == 201) {
                break;
            }
        }

        assertEquals(201, connectionsApi.getApiClient().getStatusCode());

        users.get(userName).getUserResources().addConnectionUuid(connection.getUuid());
        return connection;
    }

    public static ConnectionPostRequest getDefaultConnectionRequest(String name) {
        return new ConnectionPostRequest()
                .name(name)
                .notifications(singletonList(new SimplifiedNotification()
                        .type(SimplifiedNotification.TypeEnum.ALL)
                        .emails(singletonList("test@test.com"))));
    }

    public static Connection createPort2SpConnection() throws ApiException {
        ServiceProfile serviceProfile = new ServiceProfilesApiTest().getServiceProfilesByQueryResponse("zSide")
                .getData().stream()
                .filter(sp -> sp.getState().equals(ServiceProfileStateEnum.ACTIVE))
                .filter(sp -> sp.getVisibility().equals(ServiceProfileVisibilityEnum.PUBLIC))
                .findAny().get();

        UsersItem usersItem = Utils.getUserData(getCurrentUser());
        PortDto portDto = usersItem.getPorts().get(0);

        ConnectionPostRequest connectionPostRequest = getDefaultConnectionRequest("panthers-con-port-2-sp")
                .bandwidth(serviceProfile.getAccessPointTypeConfigs().get(0).getServiceProfileAccessPointTypeCOLO().getSupportedBandwidths().get(0))
                .type(ConnectionType.EVPL_VC)
                .redundancy(new ConnectionRedundancy().priority(ConnectionPriority.PRIMARY))
                .order(new Order().purchaseOrderNumber("pol123"))
                .zSide(new ConnectionSide().accessPoint(
                        new AccessPoint()
                                .type(AccessPointType.SP)
                                .profile(new SimplifiedServiceProfile()
                                        .type(ServiceProfileTypeEnum.L2_PROFILE)
                                        .uuid(serviceProfile.getUuid()))
                                .location(new SimplifiedLocation()
                                        .metroCode(serviceProfile.getMetros().get(0).getCode()))));

        Connection connection = null;

        for (int i = 0; i < 3; i++) {
            int sTag = getRandomVlanNumber();
            int cTag = getRandomVlanNumber();
            connectionPostRequest.aSide(new ConnectionSide().accessPoint(
                    new AccessPoint()
                            .type(AccessPointType.COLO)
                            .port(new SimplifiedPort().uuid(UUID.fromString(portDto.getUuid())))
                            .linkProtocol(new SimplifiedLinkProtocol()
                                    .type(LinkProtocolType.QINQ)
                                    .vlanSTag(sTag)
                                    .vlanCTag(cTag))));

            connection = connectionsApi.createConnection(connectionPostRequest);

            if (connectionsApi.getApiClient().getStatusCode() == 201) {
                break;
            }
        }

        assertEquals(201, connectionsApi.getApiClient().getStatusCode());

        return connection;
    }

    /**
     * Successful operation
     */
    @Test
    public void updateConnectionByUuid() throws ApiException {
        Connection connection = createPort2Port();
        String updatedName = "updated_p2p_connection";

        ConnectionChangeOperation connectionChangeOperation = new ConnectionChangeOperation()
                .op(OpEnum.REPLACE.getValue())
                .path("/name")
                .value(updatedName);

        Connection updatedConnection = connectionsApi.updateConnectionByUuid(connection.getUuid(), singletonList(connectionChangeOperation));

        assertEquals(202, connectionsApi.getApiClient().getStatusCode());

        for (int i = 0; i < 5; i++) {
            updatedConnection = connectionsApi.getConnectionByUuid(connection.getUuid(), null);

            if (updatedConnection.getName().equals(updatedName)) {
                break;
            }
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        assertEquals(updatedConnection.getName(), updatedName);
    }

    public static Connection createPort2Port() throws ApiException {
        List<Port> port = getPorts(userName).getData().stream()
                .filter(p -> p.getName().contains("Dot1q"))
                .collect(Collectors.toList());

        Connection connection = null;

        for (int i = 0; i < 3; i++) {
            int tagAside = getRandomVlanNumber();
            int tagZside = getRandomVlanNumber();

            ConnectionPostRequest connectionPostRequest = getDefaultConnectionRequest("panthers-con-port-2-port")
                    .type(ConnectionType.EVPL_VC)
                    .redundancy(new ConnectionRedundancy().priority(ConnectionPriority.PRIMARY))
                    .aSide(new ConnectionSide().accessPoint(
                            new AccessPoint()
                                    .type(AccessPointType.COLO)
                                    .port(new SimplifiedPort()
                                            .uuid(port.get(0).getUuid()))
                                    .linkProtocol(new SimplifiedLinkProtocol()
                                            .type(LinkProtocolType.DOT1Q).vlanTag(tagAside))))
                    .zSide(new ConnectionSide().accessPoint(
                            new AccessPoint()
                                    .type(AccessPointType.COLO)
                                    .port(new SimplifiedPort()
                                            .uuid(port.get(1).getUuid()))
                                    .linkProtocol(new SimplifiedLinkProtocol()
                                            .type(LinkProtocolType.DOT1Q)
                                            .vlanTag(tagZside))));

            connection = connectionsApi.createConnection(connectionPostRequest);

            if (connectionsApi.getApiClient().getStatusCode() == 201) {
                break;
            }
        }

        assertEquals(201, connectionsApi.getApiClient().getStatusCode());
        users.get(userName).getUserResources().addConnectionUuid(connection.getUuid());
        waitForConnectionIsInState(connection.getUuid(), EquinixStatus.PROVISIONED);
        return connection;
    }

    private static void deleteConnection(String uuid) throws ApiException {
        connectionsApi.deleteConnectionByUuid(uuid);
        assertEquals(202, connectionsApi.getApiClient().getStatusCode());
        waitForConnectionIsInState(uuid, EquinixStatus.DELETED, EquinixStatus.DEPROVISIONED);
    }

    private static void waitForConnectionIsInState(String connectionUuid, EquinixStatus... connectionState) throws ApiException {
        boolean result = false;
        EquinixStatus currentState = null;
        for (int i = 0; i < 5; i++) {
            Connection connection = connectionsApi.getConnectionByUuid(connectionUuid, null);
            currentState = connection.getOperation().getEquinixStatus();

            if (connectionState.length > 1) {
                if (currentState.equals(connectionState[0]) || currentState.equals(connectionState[1])) {
                    result = true;
                    break;
                }
            } else {
                if (currentState.equals(connectionState[0])) {
                    result = true;
                    break;
                }
            }
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        assertTrue(result, "Connection ha not reached the expected state: " + connectionState + " current state: " + currentState.getValue());
    }

    private ConnectionSearchResponse getConnections() throws ApiException {
        SearchRequest searchRequest = new SearchRequest()
                .filter(new Expression()
                        .addAndItem(new Expression()
                                .property(SearchFieldName._OPERATION_PROVIDERSTATUS)
                                .operator(Expression.OperatorEnum.EQUAL)
                                .values(singletonList(ProviderStatus.AVAILABLE.getValue()))))
                .pagination(new PaginationRequest().limit(5).offset(10))
                .sort(singletonList(new SortCriteria().property(SortBy.CHANGELOG_UPDATEDDATETIME).direction(SortDirection.DESC)));

        return connectionsApi.searchConnections(searchRequest);
    }
}
