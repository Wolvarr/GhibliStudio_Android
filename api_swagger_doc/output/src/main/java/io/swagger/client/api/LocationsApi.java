package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import io.swagger.client.model.Locations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface LocationsApi {
  /**
   * Return all locations
   * The Locations endpoint returns information about all of the Studio Ghibli locations. This broadly includes lands, countries, and places. 
   * @param fields comma-separated list of fields to include in the response (optional)
   * @param limit amount of results (default 50) (maximum 250) (optional)
   * @return Call&lt;List&lt;Locations&gt;&gt;
   */
  @GET("locations")
  Call<List<Locations>> locationsGet(
    @retrofit2.http.Query("fields") String fields, @retrofit2.http.Query("limit") Long limit
  );

  /**
   * Location ID
   * Returns an individual location.
   * @param id location &#x60;id&#x60; (required)
   * @param fields comma-separated list of fields to include in the response (optional)
   * @return Call&lt;Object&gt;
   */
  @GET("locations/{id}")
  Call<Object> locationsIdGet(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("fields") String fields
  );

}
