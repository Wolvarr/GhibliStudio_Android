package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Vehicles;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VehiclesApi
 */
public class VehiclesApiTest {

    private VehiclesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(VehiclesApi.class);
    }

    /**
     * Vehicles
     *
     * The Vehicles endpoint returns information about all of the Studio Ghibli vechiles. This includes cars, ships, and planes. 
     */
    @Test
    public void vehiclesGetTest() {
        String fields = null;
        Long limit = null;
        // List<Vehicles> response = api.vehiclesGet(fields, limit);

        // TODO: test validations
    }
    /**
     * Vehicle ID
     *
     * An individual vehicle
     */
    @Test
    public void vehiclesIdGetTest() {
        String id = null;
        String fields = null;
        // List<Vehicles> response = api.vehiclesIdGet(id, fields);

        // TODO: test validations
    }
}
