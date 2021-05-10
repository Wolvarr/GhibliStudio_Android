package hu.bme.ghiblistudiofilms.repository

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PersistenceModule(context: Context) {

    private var filmDatabase: AppDatabase? = null

    init {
        filmDatabase = Room.databaseBuilder(
            context.applicationContext,
            AppDatabase::class.java,
            "food-db"
        ).build()
    }

    @Singleton
    @Provides
    fun providesRoomDatabase(): AppDatabase {
        return filmDatabase!!
    }

    @Singleton
    @Provides
    fun providesProductDao(filmsDatabase: AppDatabase): FilmDAO {
        return filmsDatabase.filmDao()
    }
}

