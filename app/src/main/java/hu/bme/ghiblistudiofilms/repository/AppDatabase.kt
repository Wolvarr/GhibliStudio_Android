package hu.bme.ghiblistudiofilms.repository

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import hu.bme.ghiblistudiofilms.model.FilmDataModel

@Database(entities=arrayOf(FilmDataModel::class), version = 4)
abstract class AppDatabase :RoomDatabase() {

    //TODO: A felhasználó által megadott változtatások lekérdezése az API-tól kapot adatokhoz képest (újonnan hozzáadott, törölt és szerkesztett filmek)
}