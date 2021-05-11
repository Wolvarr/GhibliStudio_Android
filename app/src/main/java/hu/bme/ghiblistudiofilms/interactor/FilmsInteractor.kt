package hu.bme.ghiblistudiofilms.interactor

import android.util.Log
import hu.bme.ghiblistudiofilms.API.FilmsApi
import hu.bme.ghiblistudiofilms.model.FilmDataModel
import hu.bme.ghiblistudiofilms.model.FilmListModel
import hu.bme.ghiblistudiofilms.repository.AppDatabase
import javax.inject.Inject
import org.greenrobot.eventbus.EventBus


class FilmsInteractor  @Inject constructor(private val filmsApi: FilmsApi, private val appDatabase: AppDatabase) {

    fun getFilms(fields: String? = null, limit: Long? = null) {
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
            val deletedFilms = getDeletedFilms()

            val tempList: MutableList<FilmListModel> = arrayListOf()

            deletedFilms.forEach { x ->
                event.films?.forEach {
                    if(it.id == x)
                        tempList.add(it)
                }
            }

            event.films?.removeAll(tempList)

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

    fun deleteFilm(film: FilmDataModel){
        film.isDeleted = true;
        appDatabase.filmDao().insertFilm(film)
    }

    fun getDeletedFilms() : List<String>{
        return appDatabase.filmDao().getDeletedFilmIds()
    }

    fun createFilm(film: FilmDataModel)
    {
        appDatabase.filmDao().insertFilm(film)
    }
}