package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import io.swagger.client.model.Vehicles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface VehiclesApi {
  /**
   * Vehicles
   * The Vehicles endpoint returns information about all of the Studio Ghibli vechiles. This includes cars, ships, and planes. 
   * @param fields comma-separated list of fields to include in the response (optional)
   * @param limit amount of results (default 50) (maximum 250) (optional)
   * @return Call&lt;List&lt;Vehicles&gt;&gt;
   */
  @GET("vehicles")
  Call<List<Vehicles>> vehiclesGet(
    @retrofit2.http.Query("fields") String fields, @retrofit2.http.Query("limit") Long limit
  );

  /**
   * Vehicle ID
   * An individual vehicle
   * @param id film &#x60;id&#x60; (required)
   * @param fields comma-separated list of fields to include in the response (optional)
   * @return Call&lt;List&lt;Vehicles&gt;&gt;
   */
  @GET("vehicles/{id}")
  Call<List<Vehicles>> vehiclesIdGet(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("fields") String fields
  );

}
