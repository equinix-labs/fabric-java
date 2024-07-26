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

import java.math.BigDecimal;
import com.equinix.openapi.fabric.v4.model.Error;
import com.equinix.openapi.fabric.v4.model.ServiceToken;
import com.equinix.openapi.fabric.v4.model.ServiceTokenActionRequest;
import com.equinix.openapi.fabric.v4.model.ServiceTokenChangeOperation;
import com.equinix.openapi.fabric.v4.model.ServiceTokenSearchRequest;
import com.equinix.openapi.fabric.v4.model.ServiceTokens;
import java.util.UUID;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.common.mapper.TypeRef;
import io.restassured.http.Method;
import io.restassured.response.Response;

import java.lang.reflect.Type;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import static io.restassured.http.Method.*;

public class ServiceTokensApi {

    private Supplier<RequestSpecBuilder> reqSpecSupplier;
    private Consumer<RequestSpecBuilder> reqSpecCustomizer;

    private ServiceTokensApi(Supplier<RequestSpecBuilder> reqSpecSupplier) {
        this.reqSpecSupplier = reqSpecSupplier;
    }

    public static ServiceTokensApi serviceTokens(Supplier<RequestSpecBuilder> reqSpecSupplier) {
        return new ServiceTokensApi(reqSpecSupplier);
    }

    private RequestSpecBuilder createReqSpec() {
        RequestSpecBuilder reqSpec = reqSpecSupplier.get();
        if(reqSpecCustomizer != null) {
            reqSpecCustomizer.accept(reqSpec);
        }
        return reqSpec;
    }

    public List<Oper> getAllOperations() {
        return Arrays.asList(
                createServiceToken(),
                createServiceTokenAction(),
                deleteServiceTokenByUuid(),
                getServiceTokenByUuid(),
                getServiceTokens(),
                searchServiceTokens(),
                updateServiceTokenByUuid()
        );
    }

    public CreateServiceTokenOper createServiceToken() {
        return new CreateServiceTokenOper(createReqSpec());
    }

    public CreateServiceTokenActionOper createServiceTokenAction() {
        return new CreateServiceTokenActionOper(createReqSpec());
    }

    public DeleteServiceTokenByUuidOper deleteServiceTokenByUuid() {
        return new DeleteServiceTokenByUuidOper(createReqSpec());
    }

    public GetServiceTokenByUuidOper getServiceTokenByUuid() {
        return new GetServiceTokenByUuidOper(createReqSpec());
    }

    public GetServiceTokensOper getServiceTokens() {
        return new GetServiceTokensOper(createReqSpec());
    }

    public SearchServiceTokensOper searchServiceTokens() {
        return new SearchServiceTokensOper(createReqSpec());
    }

    public UpdateServiceTokenByUuidOper updateServiceTokenByUuid() {
        return new UpdateServiceTokenByUuidOper(createReqSpec());
    }

    /**
     * Customize request specification
     * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
     * @return api
     */
    public ServiceTokensApi reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
        this.reqSpecCustomizer = reqSpecCustomizer;
        return this;
    }

    /**
     * Create Service Token
     * Create Service Tokens generates Equinix Fabric? service tokens. These tokens authorize users to access protected resources and services.
     *
     * @see #body  (required)
     * return ServiceToken
     */
    public static class CreateServiceTokenOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/fabric/v4/serviceTokens";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public CreateServiceTokenOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /fabric/v4/serviceTokens
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * POST /fabric/v4/serviceTokens
         * @param handler handler
         * @return ServiceToken
         */
        public ServiceToken executeAs(Function<Response, Response> handler) {
            TypeRef<ServiceToken> type = new TypeRef<ServiceToken>(){};
            return execute(handler).as(type);
        }

         /**
         * @param serviceToken (ServiceToken)  (required)
         * @return operation
         */
        public CreateServiceTokenOper body(ServiceToken serviceToken) {
            reqSpec.setBody(serviceToken);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public CreateServiceTokenOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public CreateServiceTokenOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * ServiceToken Actions
     * This API provides capability to accept/reject user&#39;s servicetokens
     *
     * @see #serviceTokenIdPath Service Token UUID (required)
     * @see #body  (required)
     * return ServiceToken
     */
    public static class CreateServiceTokenActionOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/fabric/v4/serviceTokens/{serviceTokenId}/actions";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public CreateServiceTokenActionOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /fabric/v4/serviceTokens/{serviceTokenId}/actions
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * POST /fabric/v4/serviceTokens/{serviceTokenId}/actions
         * @param handler handler
         * @return ServiceToken
         */
        public ServiceToken executeAs(Function<Response, Response> handler) {
            TypeRef<ServiceToken> type = new TypeRef<ServiceToken>(){};
            return execute(handler).as(type);
        }

         /**
         * @param serviceTokenActionRequest (ServiceTokenActionRequest)  (required)
         * @return operation
         */
        public CreateServiceTokenActionOper body(ServiceTokenActionRequest serviceTokenActionRequest) {
            reqSpec.setBody(serviceTokenActionRequest);
            return this;
        }

        public static final String SERVICE_TOKEN_ID_PATH = "serviceTokenId";

        /**
         * @param serviceTokenId (UUID) Service Token UUID (required)
         * @return operation
         */
        public CreateServiceTokenActionOper serviceTokenIdPath(Object serviceTokenId) {
            reqSpec.addPathParam(SERVICE_TOKEN_ID_PATH, serviceTokenId);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public CreateServiceTokenActionOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public CreateServiceTokenActionOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * Delete Token by uuid
     * Delete Service Tokens removes an Equinix Fabric service token corresponding to the specified uuid which are in INACTIVE state.
     *
     * @see #serviceTokenIdPath Service Token UUID (required)
     */
    public static class DeleteServiceTokenByUuidOper implements Oper {

        public static final Method REQ_METHOD = DELETE;
        public static final String REQ_URI = "/fabric/v4/serviceTokens/{serviceTokenId}";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public DeleteServiceTokenByUuidOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * DELETE /fabric/v4/serviceTokens/{serviceTokenId}
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        public static final String SERVICE_TOKEN_ID_PATH = "serviceTokenId";

        /**
         * @param serviceTokenId (UUID) Service Token UUID (required)
         * @return operation
         */
        public DeleteServiceTokenByUuidOper serviceTokenIdPath(Object serviceTokenId) {
            reqSpec.addPathParam(SERVICE_TOKEN_ID_PATH, serviceTokenId);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public DeleteServiceTokenByUuidOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public DeleteServiceTokenByUuidOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * Get Token by uuid
     * Get Specified Service Tokens uses the uuid of an Equinix Fabric service token to return details about the token&#39;s type, state, location, bandwidth, and other key properties.
     *
     * @see #serviceTokenIdPath Service Token UUID (required)
     * return ServiceToken
     */
    public static class GetServiceTokenByUuidOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/fabric/v4/serviceTokens/{serviceTokenId}";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public GetServiceTokenByUuidOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /fabric/v4/serviceTokens/{serviceTokenId}
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /fabric/v4/serviceTokens/{serviceTokenId}
         * @param handler handler
         * @return ServiceToken
         */
        public ServiceToken executeAs(Function<Response, Response> handler) {
            TypeRef<ServiceToken> type = new TypeRef<ServiceToken>(){};
            return execute(handler).as(type);
        }

        public static final String SERVICE_TOKEN_ID_PATH = "serviceTokenId";

        /**
         * @param serviceTokenId (UUID) Service Token UUID (required)
         * @return operation
         */
        public GetServiceTokenByUuidOper serviceTokenIdPath(Object serviceTokenId) {
            reqSpec.addPathParam(SERVICE_TOKEN_ID_PATH, serviceTokenId);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public GetServiceTokenByUuidOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public GetServiceTokenByUuidOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * Get All Tokens
     * Get All ServiceTokens creates a list of all Equinix Fabric service tokens associated with the subscriber&#39;s account.
     *
     * @see #offsetQuery offset (optional)
     * @see #limitQuery number of records to fetch (optional)
     * return ServiceTokens
     */
    public static class GetServiceTokensOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/fabric/v4/serviceTokens";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public GetServiceTokensOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /fabric/v4/serviceTokens
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /fabric/v4/serviceTokens
         * @param handler handler
         * @return ServiceTokens
         */
        public ServiceTokens executeAs(Function<Response, Response> handler) {
            TypeRef<ServiceTokens> type = new TypeRef<ServiceTokens>(){};
            return execute(handler).as(type);
        }

        public static final String OFFSET_QUERY = "offset";

        /**
         * @param offset (BigDecimal) offset (optional)
         * @return operation
         */
        public GetServiceTokensOper offsetQuery(Object... offset) {
            reqSpec.addQueryParam(OFFSET_QUERY, offset);
            return this;
        }

        public static final String LIMIT_QUERY = "limit";

        /**
         * @param limit (BigDecimal) number of records to fetch (optional)
         * @return operation
         */
        public GetServiceTokensOper limitQuery(Object... limit) {
            reqSpec.addQueryParam(LIMIT_QUERY, limit);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public GetServiceTokensOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public GetServiceTokensOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * Search servicetokens
     * The API provides capability to get list of user&#39;s servicetokens using search criteria, including optional filtering, pagination and sorting
     *
     * @see #body  (required)
     * return ServiceTokens
     */
    public static class SearchServiceTokensOper implements Oper {

        public static final Method REQ_METHOD = POST;
        public static final String REQ_URI = "/fabric/v4/serviceTokens/search";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public SearchServiceTokensOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /fabric/v4/serviceTokens/search
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * POST /fabric/v4/serviceTokens/search
         * @param handler handler
         * @return ServiceTokens
         */
        public ServiceTokens executeAs(Function<Response, Response> handler) {
            TypeRef<ServiceTokens> type = new TypeRef<ServiceTokens>(){};
            return execute(handler).as(type);
        }

         /**
         * @param serviceTokenSearchRequest (ServiceTokenSearchRequest)  (required)
         * @return operation
         */
        public SearchServiceTokensOper body(ServiceTokenSearchRequest serviceTokenSearchRequest) {
            reqSpec.setBody(serviceTokenSearchRequest);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public SearchServiceTokensOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public SearchServiceTokensOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * Update Token By ID
     * This API provides capability to update user&#39;s Service Token
     *
     * @see #serviceTokenIdPath Service Token UUID (required)
     * @see #body  (required)
     * return ServiceToken
     */
    public static class UpdateServiceTokenByUuidOper implements Oper {

        public static final Method REQ_METHOD = PATCH;
        public static final String REQ_URI = "/fabric/v4/serviceTokens/{serviceTokenId}";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public UpdateServiceTokenByUuidOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("application/json-patch+json");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * PATCH /fabric/v4/serviceTokens/{serviceTokenId}
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * PATCH /fabric/v4/serviceTokens/{serviceTokenId}
         * @param handler handler
         * @return ServiceToken
         */
        public ServiceToken executeAs(Function<Response, Response> handler) {
            TypeRef<ServiceToken> type = new TypeRef<ServiceToken>(){};
            return execute(handler).as(type);
        }

         /**
         * @param serviceTokenChangeOperation (List&lt;ServiceTokenChangeOperation&gt;)  (required)
         * @return operation
         */
        public UpdateServiceTokenByUuidOper body(List<ServiceTokenChangeOperation> serviceTokenChangeOperation) {
            reqSpec.setBody(serviceTokenChangeOperation);
            return this;
        }

        public static final String SERVICE_TOKEN_ID_PATH = "serviceTokenId";

        /**
         * @param serviceTokenId (UUID) Service Token UUID (required)
         * @return operation
         */
        public UpdateServiceTokenByUuidOper serviceTokenIdPath(Object serviceTokenId) {
            reqSpec.addPathParam(SERVICE_TOKEN_ID_PATH, serviceTokenId);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public UpdateServiceTokenByUuidOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public UpdateServiceTokenByUuidOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
}
