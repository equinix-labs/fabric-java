/*
 * Equinix Fabric API v4
 * Equinix Fabric is an advanced software-defined interconnection solution that enables you to directly, securely and dynamically connect to distributed infrastructure and digital ecosystems on platform Equinix via a single port, Customers can use Fabric to connect to: </br> 1. Cloud Service Providers - Clouds, network and other service providers.  </br> 2. Enterprises - Other Equinix customers, vendors and partners.  </br> 3. Myself - Another customer instance deployed at Equinix. </br>
 *
 * Contact: api-support@equinix.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.equinix.openapi.fabric.v4.api;

import com.equinix.openapi.fabric.ApiException;
import com.equinix.openapi.fabric.v4.model.FilterBody;
import com.equinix.openapi.fabric.v4.model.PriceSearchResponse;
import com.equinix.openapi.fabric.v4.model.SearchExpression;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * API tests for PricesApi
 */

public class PricesApiTest extends AbstractTest {
    private final PricesApi api = new PricesApi(generateToken());

    /**
     * Get Prices
     * <p>
     * Search prices by search criteria
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchPricesTest() throws ApiException {
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

        PriceSearchResponse response = api.searchPrices(filterBody);
        assertEquals(200, api.getApiClient().getStatusCode());
        assertNotEquals(null, response.getData().get(0).getType());
    }
}