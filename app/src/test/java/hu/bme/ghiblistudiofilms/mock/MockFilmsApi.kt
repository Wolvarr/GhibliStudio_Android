package hu.bme.ghiblistudiofilms.mock

import hu.bme.ghiblistudiofilms.API.FilmsApi
import hu.bme.ghiblistudiofilms.model.FilmDataModel
import hu.bme.ghiblistudiofilms.model.FilmListModel
import okhttp3.Request
import okio.Timeout
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.IOException

class MockFilmsApi : FilmsApi {
    override fun filmsGet(fields: String?, limit: Long?): Call<MutableList<FilmListModel>>? {
        val films: MutableList<FilmListModel> = arrayListOf()
        for (i in 1..3)
        {
            films.add(FilmListModel("a6ffcbdb-3cbe-4d0b-a09e-c7a3d40f449" + i, "Test title" + i, "test original" + i))
        }

        val call = object : Call<MutableList<FilmListModel>> {
            @Throws(IOException::class)
            override fun execute(): Response<MutableList<FilmListModel>> {
                return Response.success(films)
            }

            override fun isExecuted(): Boolean {
                return false
            }

            override fun cancel() {

            }

            override fun isCanceled(): Boolean {
                return false
            }

            override fun clone(): Call<MutableList<FilmListModel>> {
                return this
            }


            override fun timeout(): Timeout {
                TODO("Not yet implemented")
            }

            override fun request(): Request {
                TODO("Not yet implemented")
            }

            override fun enqueue(callback: Callback<MutableList<FilmListModel>>) {
                TODO("Not yet implemented")
            }
        }

        return call
    }


    override fun filmsIdGet(id: String?, fields: String?): Call<FilmDataModel>? {
        var film = FilmDataModel(
            "a6ffcbdb-3cbe-4d0b-a09e-c7a3d40f4499",
            "Test title", "test original",
            "Test desc",
            "Test dir",
            "Test prod",
            "Test date",
            99,
            false )

        val call = object : Call<FilmDataModel> {
            @Throws(IOException::class)
            override fun execute(): Response<FilmDataModel> {
                return Response.success(film)
            }

            override fun isExecuted(): Boolean {
                return false
            }

            override fun cancel() {

            }

            override fun isCanceled(): Boolean {
                return false
            }

            override fun clone(): Call<FilmDataModel> {
                return this
            }


            override fun timeout(): Timeout {
                TODO("Not yet implemented")
            }

            override fun request(): Request {
                TODO("Not yet implemented")
            }

            override fun enqueue(callback: Callback<FilmDataModel>) {
                TODO("Not yet implemented")
            }
        }

        return call
    }
}