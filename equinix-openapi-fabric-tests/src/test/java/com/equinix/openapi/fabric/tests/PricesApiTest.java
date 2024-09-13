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
import com.equinix.openapi.fabric.v4.model.FilterBody;
import com.equinix.openapi.fabric.v4.model.PriceSearchResponse;
import com.equinix.openapi.fabric.v4.model.SearchExpression;

import com.equinix.openapi.fabric.tests.dto.users.UsersItem;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static com.equinix.openapi.fabric.tests.helpers.Apis.pricesApi;
import static com.equinix.openapi.fabric.tests.helpers.Apis.setUserName;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * API tests for PricesApi
 */
public class PricesApiTest {

    @BeforeClass
    public static void setUp() {
        setUserName(UsersItem.UserName.PANTHERS_FCR);
    }

    @Test
    public void searchPrices() throws ApiException {
        SearchExpression itemProperty1 = new SearchExpression()
                .property("/type")
                .operator(SearchExpression.OperatorEnum.EQUAL)
                .values(Collections.singletonList("IP_BLOCK_PRODUCT"));
        SearchExpression itemProperty2 = new SearchExpression()
                .property("/ipBlock/type")
                .operator(SearchExpression.OperatorEnum.EQUAL)
                .values(Collections.singletonList("IPv4"));
        SearchExpression itemProperty3 = new SearchExpression()
                .property("/ipBlock/prefixLength")
                .operator(SearchExpression.OperatorEnum.EQUAL)
                .values(Collections.singletonList("29"));
        SearchExpression itemProperty4 = new SearchExpression().
                property("/ipBlock/location/metroCode")
                .operator(SearchExpression.OperatorEnum.IN)
                .values(Arrays.asList("SV", "WA"));

        SearchExpression item = new SearchExpression().and(Arrays.asList(itemProperty1, itemProperty2, itemProperty3, itemProperty4));

        FilterBody filterBody = new FilterBody();
        filterBody.setFilter(item);

        PriceSearchResponse priceSearchResponse = pricesApi.searchPrices(filterBody);
        assertEquals(200, pricesApi.getApiClient().getStatusCode());
        assertNotEquals(null, priceSearchResponse.getData().get(0).getType());
    }
}