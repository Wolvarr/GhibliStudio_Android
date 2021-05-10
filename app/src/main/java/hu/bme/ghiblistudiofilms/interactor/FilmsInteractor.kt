package hu.bme.ghiblistudiofilms.interactor

import android.util.Log
import hu.bme.ghiblistudiofilms.API.FilmsApi
import javax.inject.Inject
import org.greenrobot.eventbus.EventBus


class FilmsInteractor  @Inject constructor(private val filmsApi: FilmsApi) {

    fun getFilms(fields: String? = null, limit: Long? = null) {
        Log.d("Eljutunk ide lol:", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA")
        val event = GetFilmsEvent()

        try {
            val filmsQueryCall = filmsApi.filmsGet(fields, limit)

            val response = filmsQueryCall?.execute()
            Log.d("Reponse", response?.body().toString())
            if (response?.code() != 200) {
                throw Exception("Result code is not 200")
            }
            event.code = response.code()
            event.films = response.body()
            EventBus.getDefault().post(event)
        } catch (e: Exception) {
            event.throwable = e
            EventBus.getDefault().post(event)
        }
    }

    fun getFilm(id : String, fields: String? = null) {
        val event = GetSingleFilmEvent()

        try {
            val filmsQueryCall = filmsApi.filmsIdGet(id, fields)

            val response = filmsQueryCall?.execute()
            Log.d("Reponse", response?.body().toString())
            if (response?.code() != 200) {
                throw Exception("Result code is not 200")
            }
            event.code = response.code()
            event.film = response.body()
            EventBus.getDefault().post(event)
        } catch (e: Exception) {
            event.throwable = e
            EventBus.getDefault().post(event)
        }
    }
}