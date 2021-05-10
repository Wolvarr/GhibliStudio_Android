package hu.bme.ghiblistudiofilms.interactor

import dagger.Module
import dagger.Provides
import hu.bme.ghiblistudiofilms.API.FilmsApi
import hu.bme.ghiblistudiofilms.repository.AppDatabase
import javax.inject.Singleton

@Module
class InteractorModule {
    @Provides
    @Singleton
    fun provideFilmsInteractor(filmsApi: FilmsApi, appDatabase: AppDatabase) = FilmsInteractor(filmsApi, appDatabase)
}