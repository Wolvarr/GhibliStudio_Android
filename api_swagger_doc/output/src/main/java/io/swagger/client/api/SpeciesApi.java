package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import io.swagger.client.model.Species;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SpeciesApi {
  /**
   * Species
   * The Species endpoint returns information about all of the Studio Ghibli species. This includes humans, animals, and spirits et al. 
   * @param fields comma-separated list of fields to include in the response (optional)
   * @param limit amount of results (default 50) (maximum 250) (optional)
   * @return Call&lt;List&lt;Species&gt;&gt;
   */
  @GET("species")
  Call<List<Species>> speciesGet(
    @retrofit2.http.Query("fields") String fields, @retrofit2.http.Query("limit") Long limit
  );

  /**
   * Species ID
   * Returns an individual species
   * @param id film &#x60;id&#x60; (required)
   * @param fields comma-separated list of fields to include in the response (optional)
   * @return Call&lt;List&lt;Species&gt;&gt;
   */
  @GET("species/{id}")
  Call<List<Species>> speciesIdGet(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("fields") String fields
  );

}
