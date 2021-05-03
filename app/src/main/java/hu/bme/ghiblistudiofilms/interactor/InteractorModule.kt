package hu.bme.ghiblistudiofilms.interactor

import dagger.Module
import dagger.Provides
import hu.bme.ghiblistudiofilms.API.FilmsApi
import javax.inject.Singleton

@Module
class InteractorModule {
    @Provides
    @Singleton
    fun provideFilmsInteractor(filmsApi: FilmsApi) = FilmsInteractor(filmsApi)
}