package hu.bme.ghiblistudiofilms.API

import hu.bme.ghiblistudiofilms.model.FilmDataModel
import hu.bme.ghiblistudiofilms.model.FilmListModel
import retrofit2.Call
import retrofit2.http.*


interface FilmsApi {
    /**
     * Return all films
     * The Films endpoint returns information about all of the Studio Ghibli films.
     * @param fields comma-separated list of fields to include in the response (optional)
     * @param limit amount of results (default 50) (maximum 250) (optional)
     * @return Call&lt;List&lt;Films&gt;&gt;
     */
    @GET("films")
    fun filmsGet(
            @retrofit2.http.Query("fields") fields: String?,
            @retrofit2.http.Query("limit") limit: Long?
    ): Call<MutableList<FilmListModel>>?

    /**
     * Film ID
     * Returns a film based on a single ID
     * @param id film &#x60;id&#x60; (required)
     * @param fields comma-separated list of fields to include in the response (optional)
     * @return Call&lt;List&lt;Films&gt;&gt;
     */
    @GET("films/{id}")
    fun filmsIdGet(
            @retrofit2.http.Path("id") id: String?,
            @retrofit2.http.Query("fields") fields: String?
    ): Call<FilmDataModel>?
}
