package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import io.swagger.client.model.People;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PeopleApi {
  /**
   * Return all people
   * The People endpoint returns information about all of the Studio Ghibli people. This broadly includes all Ghibli characters, human and non-. 
   * @param fields comma-separated list of fields to include in the response (optional)
   * @param limit amount of results (default 50) (maximum 250) (optional)
   * @return Call&lt;List&lt;People&gt;&gt;
   */
  @GET("people")
  Call<List<People>> peopleGet(
    @retrofit2.http.Query("fields") String fields, @retrofit2.http.Query("limit") Long limit
  );

  /**
   * People ID
   * Returns a person based on a single ID 
   * @param id person &#x60;id&#x60; (required)
   * @param fields comma-separated list of fields to include in the response (optional)
   * @return Call&lt;List&lt;People&gt;&gt;
   */
  @GET("people/{id}")
  Call<List<People>> peopleIdGet(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("fields") String fields
  );

}
