package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import io.swagger.client.model.Films;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface FilmsApi {
  /**
   * Return all films
   * The Films endpoint returns information about all of the Studio Ghibli films. 
   * @param fields comma-separated list of fields to include in the response (optional)
   * @param limit amount of results (default 50) (maximum 250) (optional)
   * @return Call&lt;List&lt;Films&gt;&gt;
   */
  @GET("films")
  Call<List<Films>> filmsGet(
    @retrofit2.http.Query("fields") String fields, @retrofit2.http.Query("limit") Long limit
  );

  /**
   * Film ID
   * Returns a film based on a single ID 
   * @param id film &#x60;id&#x60; (required)
   * @param fields comma-separated list of fields to include in the response (optional)
   * @return Call&lt;List&lt;Films&gt;&gt;
   */
  @GET("films/{id}")
  Call<List<Films>> filmsIdGet(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("fields") String fields
  );

}
