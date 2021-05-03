package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.People;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PeopleApi
 */
public class PeopleApiTest {

    private PeopleApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PeopleApi.class);
    }

    /**
     * Return all people
     *
     * The People endpoint returns information about all of the Studio Ghibli people. This broadly includes all Ghibli characters, human and non-. 
     */
    @Test
    public void peopleGetTest() {
        String fields = null;
        Long limit = null;
        // List<People> response = api.peopleGet(fields, limit);

        // TODO: test validations
    }
    /**
     * People ID
     *
     * Returns a person based on a single ID 
     */
    @Test
    public void peopleIdGetTest() {
        String id = null;
        String fields = null;
        // List<People> response = api.peopleIdGet(id, fields);

        // TODO: test validations
    }
}
