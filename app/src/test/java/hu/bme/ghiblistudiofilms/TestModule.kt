package hu.bme.ghiblistudiofilms

import android.content.Context
import dagger.Module
import dagger.Provides
import hu.bme.ghiblistudiofilms.interactor.FilmsInteractor
import hu.bme.ghiblistudiofilms.presenter.DetailedPresenter
import hu.bme.ghiblistudiofilms.presenter.MainPresenter
import hu.bme.ghiblistudiofilms.repository.PersistenceModule
import hu.bme.ghiblistudiofilms.utils.UIExecutor

import java.util.concurrent.Executor
import javax.inject.Singleton

@Module
class TestModule(private val context: Context) {

    @Provides
    fun provideContext() = context

    @Provides
    @Singleton
    fun provideNetworkExecutor(): Executor = UIExecutor()

    @Provides
    @Singleton
    fun provideMainPresenter(executor: Executor, filmsInteractor: FilmsInteractor) = MainPresenter(executor, filmsInteractor)

    @Provides
    @Singleton
    fun provideDetailedPresenter(executor: Executor, filmsInteractor: FilmsInteractor) = DetailedPresenter(executor, filmsInteractor)

}