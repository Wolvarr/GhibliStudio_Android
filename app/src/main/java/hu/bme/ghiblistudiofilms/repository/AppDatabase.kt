package hu.bme.ghiblistudiofilms.repository

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import hu.bme.ghiblistudiofilms.model.FilmDataModel

@Database(entities=arrayOf(FilmDataModel::class), version = 4)
abstract class AppDatabase :RoomDatabase() {

    //TODO: A felhasználó által megadott változtatások lekérdezése az API-tól kapot adatokhoz képest (újonnan hozzáadott, törölt és szerkesztett filmek)

    abstract fun filmDao(): FilmDetailedDAO
    abstract fun filmListDao(): FilmListDAO

    companion object {
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    AppDatabase::class.java, "films.db")
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return INSTANCE!!
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }
}