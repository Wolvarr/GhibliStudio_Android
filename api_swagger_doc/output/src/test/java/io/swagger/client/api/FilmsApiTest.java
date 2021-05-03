package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Films;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FilmsApi
 */
public class FilmsApiTest {

    private FilmsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(FilmsApi.class);
    }

    /**
     * Return all films
     *
     * The Films endpoint returns information about all of the Studio Ghibli films. 
     */
    @Test
    public void filmsGetTest() {
        String fields = null;
        Long limit = null;
        // List<Films> response = api.filmsGet(fields, limit);

        // TODO: test validations
    }
    /**
     * Film ID
     *
     * Returns a film based on a single ID 
     */
    @Test
    public void filmsIdGetTest() {
        String id = null;
        String fields = null;
        // List<Films> response = api.filmsIdGet(id, fields);

        // TODO: test validations
    }
}
