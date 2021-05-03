package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Locations;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LocationsApi
 */
public class LocationsApiTest {

    private LocationsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(LocationsApi.class);
    }

    /**
     * Return all locations
     *
     * The Locations endpoint returns information about all of the Studio Ghibli locations. This broadly includes lands, countries, and places. 
     */
    @Test
    public void locationsGetTest() {
        String fields = null;
        Long limit = null;
        // List<Locations> response = api.locationsGet(fields, limit);

        // TODO: test validations
    }
    /**
     * Location ID
     *
     * Returns an individual location.
     */
    @Test
    public void locationsIdGetTest() {
        String id = null;
        String fields = null;
        // Object response = api.locationsIdGet(id, fields);

        // TODO: test validations
    }
}
