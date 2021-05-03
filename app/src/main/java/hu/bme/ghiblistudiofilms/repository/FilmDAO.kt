package hu.bme.ghiblistudiofilms.repository

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import hu.bme.ghiblistudiofilms.model.FilmDataModel
import hu.bme.ghiblistudiofilms.model.FilmListModel
import java.util.*

@Dao
interface FilmDAO {
    @Query("SELECT id FROM ModifiedFilms")
    fun getModifiedFilmIds(): List<UUID>

    @Query("SELECT * FROM ModifiedFilms")
    fun getModifiedFilms(): List<FilmDataModel>

    //used when user get all films from the API, so we need to remove the ones that was locally "deleted"
    @Query("SELECT id FROM ModifiedFilms WHERE isDeleted = 1" )
    fun getDeletedFilmIds(): List<UUID>

    @Query("SELECT * FROM ModifiedFilms WHERE id = :id " )
    fun getDFilmById(id: UUID): FilmDataModel

    //used for delete too with IsDeleted flag = true
    @Insert
    fun insertFilm(vararg films: FilmDataModel)

    @Delete
    fun deleteFilm(film: FilmDataModel)

}