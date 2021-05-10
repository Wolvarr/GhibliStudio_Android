package hu.bme.ghiblistudiofilms

import android.content.Context
import dagger.Module
import dagger.Provides
import hu.bme.ghiblistudiofilms.interactor.FilmsInteractor
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import javax.inject.Singleton

@Module
class UIModule(private val context: Context) {

    @Provides
    fun context() = context


    @Provides
    @Singleton
    fun mainPresenter(executor: Executor, filmInteractor: FilmsInteractor) =
        hu.bme.ghiblistudiofilms.presenter.MainPresenter(executor, filmInteractor)

    //@Provides
    //@Singleton
    //fun editPresenter() = EditPresenter()


    //@Provides
   // @Singleton
    //fun detailPresenter(executor: Executor, filmsInteractor: FilmsInteractor) = DetailPresenter(executor, filmsInteractor)


    @Provides
    @Singleton
    fun networkExecutor(): Executor = Executors.newFixedThreadPool(1)
}
