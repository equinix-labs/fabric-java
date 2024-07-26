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

import com.equinix.openapi.fabric.v4.model.Duration;
import com.equinix.openapi.fabric.v4.model.Error;
import com.equinix.openapi.fabric.v4.model.MetricInterval;
import java.time.OffsetDateTime;
import com.equinix.openapi.fabric.v4.model.QueryDirection;
import com.equinix.openapi.fabric.v4.model.Sort;
import com.equinix.openapi.fabric.v4.model.Statistics;
import com.equinix.openapi.fabric.v4.model.TopUtilizedStatistics;
import java.util.UUID;
import com.equinix.openapi.fabric.v4.model.ViewPoint;

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

public class StatisticsApi {

    private Supplier<RequestSpecBuilder> reqSpecSupplier;
    private Consumer<RequestSpecBuilder> reqSpecCustomizer;

    private StatisticsApi(Supplier<RequestSpecBuilder> reqSpecSupplier) {
        this.reqSpecSupplier = reqSpecSupplier;
    }

    public static StatisticsApi statistics(Supplier<RequestSpecBuilder> reqSpecSupplier) {
        return new StatisticsApi(reqSpecSupplier);
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
                getConnectionStatsByPortUuid(),
                getPortStats(),
                getPortStatsByPortUuid()
        );
    }

    public GetConnectionStatsByPortUuidOper getConnectionStatsByPortUuid() {
        return new GetConnectionStatsByPortUuidOper(createReqSpec());
    }

    public GetPortStatsOper getPortStats() {
        return new GetPortStatsOper(createReqSpec());
    }

    public GetPortStatsByPortUuidOper getPortStatsByPortUuid() {
        return new GetPortStatsByPortUuidOper(createReqSpec());
    }

    /**
     * Customize request specification
     * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
     * @return api
     */
    public StatisticsApi reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
        this.reqSpecCustomizer = reqSpecCustomizer;
        return this;
    }

    /**
     * Get Stats by uuid
     * This API provides service-level metrics so that you can view access and gather key information required to manage service subscription sizing and capacity
     *
     * @see #connectionIdPath Connection UUID (required)
     * @see #startDateTimeQuery startDateTime (required)
     * @see #endDateTimeQuery endDateTime (required)
     * @see #viewPointQuery viewPoint (required)
     * return Statistics
     */
    public static class GetConnectionStatsByPortUuidOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/fabric/v4/connections/{connectionId}/stats";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public GetConnectionStatsByPortUuidOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /fabric/v4/connections/{connectionId}/stats
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /fabric/v4/connections/{connectionId}/stats
         * @param handler handler
         * @return Statistics
         */
        public Statistics executeAs(Function<Response, Response> handler) {
            TypeRef<Statistics> type = new TypeRef<Statistics>(){};
            return execute(handler).as(type);
        }

        public static final String CONNECTION_ID_PATH = "connectionId";

        /**
         * @param connectionId (String) Connection UUID (required)
         * @return operation
         */
        public GetConnectionStatsByPortUuidOper connectionIdPath(Object connectionId) {
            reqSpec.addPathParam(CONNECTION_ID_PATH, connectionId);
            return this;
        }

        public static final String START_DATE_TIME_QUERY = "startDateTime";

        /**
         * @param startDateTime (OffsetDateTime) startDateTime (required)
         * @return operation
         */
        public GetConnectionStatsByPortUuidOper startDateTimeQuery(Object... startDateTime) {
            reqSpec.addQueryParam(START_DATE_TIME_QUERY, startDateTime);
            return this;
        }

        public static final String END_DATE_TIME_QUERY = "endDateTime";

        /**
         * @param endDateTime (OffsetDateTime) endDateTime (required)
         * @return operation
         */
        public GetConnectionStatsByPortUuidOper endDateTimeQuery(Object... endDateTime) {
            reqSpec.addQueryParam(END_DATE_TIME_QUERY, endDateTime);
            return this;
        }

        public static final String VIEW_POINT_QUERY = "viewPoint";

        /**
         * @param viewPoint (ViewPoint) viewPoint (required)
         * @return operation
         */
        public GetConnectionStatsByPortUuidOper viewPointQuery(Object... viewPoint) {
            reqSpec.addQueryParam(VIEW_POINT_QUERY, viewPoint);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public GetConnectionStatsByPortUuidOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public GetConnectionStatsByPortUuidOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * Top Port Statistics
     * This API provides top utilized service-level traffic metrics so that you can view access and gather key information required to manage service subscription sizing and capacity.
     *
     * @see #metrosQuery Two-letter prefix indicating the metropolitan area in which a specified Equinix asset is located. (required)
     * @see #sortQuery Key or set of keys that organizes the search payload by property (such as createdDate or metroCode) or by direction. Ascending (ASC) is the default value. The \&quot;?\&quot; prefix indicates descending (DESC) order. (optional, default to -bandwidthUtilization)
     * @see #topQuery Filter returning only the specified number of most heavily trafficked ports. The standard value is [1...10], and the default is 5. (optional, default to 5)
     * @see #durationQuery duration (optional, default to P7D)
     * @see #directionQuery Direction of traffic from the requester&#39;s viewpoint. The default is outbound. (optional, default to outbound)
     * @see #metricIntervalQuery metricInterval (optional, default to P7D)
     * @see #projectIdQuery projectId (optional)
     * return TopUtilizedStatistics
     */
    public static class GetPortStatsOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/fabric/v4/ports/stats";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public GetPortStatsOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /fabric/v4/ports/stats
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /fabric/v4/ports/stats
         * @param handler handler
         * @return TopUtilizedStatistics
         */
        public TopUtilizedStatistics executeAs(Function<Response, Response> handler) {
            TypeRef<TopUtilizedStatistics> type = new TypeRef<TopUtilizedStatistics>(){};
            return execute(handler).as(type);
        }

        public static final String SORT_QUERY = "sort";

        /**
         * @param sort (Sort) Key or set of keys that organizes the search payload by property (such as createdDate or metroCode) or by direction. Ascending (ASC) is the default value. The \&quot;?\&quot; prefix indicates descending (DESC) order. (optional, default to -bandwidthUtilization)
         * @return operation
         */
        public GetPortStatsOper sortQuery(Object... sort) {
            reqSpec.addQueryParam(SORT_QUERY, sort);
            return this;
        }

        public static final String TOP_QUERY = "top";

        /**
         * @param top (Integer) Filter returning only the specified number of most heavily trafficked ports. The standard value is [1...10], and the default is 5. (optional, default to 5)
         * @return operation
         */
        public GetPortStatsOper topQuery(Object... top) {
            reqSpec.addQueryParam(TOP_QUERY, top);
            return this;
        }

        public static final String DURATION_QUERY = "duration";

        /**
         * @param duration (Duration) duration (optional, default to P7D)
         * @return operation
         */
        public GetPortStatsOper durationQuery(Object... duration) {
            reqSpec.addQueryParam(DURATION_QUERY, duration);
            return this;
        }

        public static final String DIRECTION_QUERY = "direction";

        /**
         * @param direction (QueryDirection) Direction of traffic from the requester&#39;s viewpoint. The default is outbound. (optional, default to outbound)
         * @return operation
         */
        public GetPortStatsOper directionQuery(Object... direction) {
            reqSpec.addQueryParam(DIRECTION_QUERY, direction);
            return this;
        }

        public static final String METRIC_INTERVAL_QUERY = "metricInterval";

        /**
         * @param metricInterval (MetricInterval) metricInterval (optional, default to P7D)
         * @return operation
         */
        public GetPortStatsOper metricIntervalQuery(Object... metricInterval) {
            reqSpec.addQueryParam(METRIC_INTERVAL_QUERY, metricInterval);
            return this;
        }

        public static final String METROS_QUERY = "metros";

        /**
         * @param metros (List&lt;String&gt;) Two-letter prefix indicating the metropolitan area in which a specified Equinix asset is located. (required)
         * @return operation
         */
        public GetPortStatsOper metrosQuery(Object... metros) {
            reqSpec.addQueryParam(METROS_QUERY, metros);
            return this;
        }

        public static final String PROJECT_ID_QUERY = "projectId";

        /**
         * @param projectId (String) projectId (optional)
         * @return operation
         */
        public GetPortStatsOper projectIdQuery(Object... projectId) {
            reqSpec.addQueryParam(PROJECT_ID_QUERY, projectId);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public GetPortStatsOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public GetPortStatsOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
    /**
     * Get Stats by uuid
     * This API provides service-level traffic metrics so that you can view access and gather key information required to manage service subscription sizing and capacity.
     *
     * @see #portIdPath Port UUID (required)
     * @see #startDateTimeQuery startDateTime (required)
     * @see #endDateTimeQuery endDateTime (required)
     * return Statistics
     */
    public static class GetPortStatsByPortUuidOper implements Oper {

        public static final Method REQ_METHOD = GET;
        public static final String REQ_URI = "/fabric/v4/ports/{portId}/stats";

        private RequestSpecBuilder reqSpec;
        private ResponseSpecBuilder respSpec;

        public GetPortStatsByPortUuidOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /fabric/v4/ports/{portId}/stats
         * @param handler handler
         * @param <T> type
         * @return type
         */
        @Override
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(REQ_METHOD, REQ_URI));
        }

        /**
         * GET /fabric/v4/ports/{portId}/stats
         * @param handler handler
         * @return Statistics
         */
        public Statistics executeAs(Function<Response, Response> handler) {
            TypeRef<Statistics> type = new TypeRef<Statistics>(){};
            return execute(handler).as(type);
        }

        public static final String PORT_ID_PATH = "portId";

        /**
         * @param portId (UUID) Port UUID (required)
         * @return operation
         */
        public GetPortStatsByPortUuidOper portIdPath(Object portId) {
            reqSpec.addPathParam(PORT_ID_PATH, portId);
            return this;
        }

        public static final String START_DATE_TIME_QUERY = "startDateTime";

        /**
         * @param startDateTime (OffsetDateTime) startDateTime (required)
         * @return operation
         */
        public GetPortStatsByPortUuidOper startDateTimeQuery(Object... startDateTime) {
            reqSpec.addQueryParam(START_DATE_TIME_QUERY, startDateTime);
            return this;
        }

        public static final String END_DATE_TIME_QUERY = "endDateTime";

        /**
         * @param endDateTime (OffsetDateTime) endDateTime (required)
         * @return operation
         */
        public GetPortStatsByPortUuidOper endDateTimeQuery(Object... endDateTime) {
            reqSpec.addQueryParam(END_DATE_TIME_QUERY, endDateTime);
            return this;
        }

        /**
         * Customize request specification
         * @param reqSpecCustomizer consumer to modify the RequestSpecBuilder
         * @return operation
         */
        public GetPortStatsByPortUuidOper reqSpec(Consumer<RequestSpecBuilder> reqSpecCustomizer) {
            reqSpecCustomizer.accept(reqSpec);
            return this;
        }

        /**
         * Customize response specification
         * @param respSpecCustomizer consumer to modify the ResponseSpecBuilder
         * @return operation
         */
        public GetPortStatsByPortUuidOper respSpec(Consumer<ResponseSpecBuilder> respSpecCustomizer) {
            respSpecCustomizer.accept(respSpec);
            return this;
        }
    }
}
