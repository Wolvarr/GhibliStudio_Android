package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Species;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SpeciesApi
 */
public class SpeciesApiTest {

    private SpeciesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SpeciesApi.class);
    }

    /**
     * Species
     *
     * The Species endpoint returns information about all of the Studio Ghibli species. This includes humans, animals, and spirits et al. 
     */
    @Test
    public void speciesGetTest() {
        String fields = null;
        Long limit = null;
        // List<Species> response = api.speciesGet(fields, limit);

        // TODO: test validations
    }
    /**
     * Species ID
     *
     * Returns an individual species
     */
    @Test
    public void speciesIdGetTest() {
        String id = null;
        String fields = null;
        // List<Species> response = api.speciesIdGet(id, fields);

        // TODO: test validations
    }
}
