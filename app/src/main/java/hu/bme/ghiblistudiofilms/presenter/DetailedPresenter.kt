package hu.bme.ghiblistudiofilms.presenter

import android.util.Log
import hu.bme.ghiblistudiofilms.interactor.FilmsInteractor
import hu.bme.ghiblistudiofilms.interactor.GetSingleFilmEvent
import hu.bme.ghiblistudiofilms.model.FilmDataModel
import hu.bme.ghiblistudiofilms.screen.DetailedScreen
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import java.util.concurrent.Executor
import javax.inject.Inject

class DetailedPresenter @Inject constructor(private val executor: Executor, private val filmsInteractor: FilmsInteractor): Presenter<DetailedScreen>(){

    override fun attachScreen(screen: DetailedScreen) {
        super.attachScreen(screen)
        EventBus.getDefault().register(this)
    }

    override fun detachScreen() {
        EventBus.getDefault().unregister(this)
        super.detachScreen()
    }

    fun loadDetailedFilmData(id: String) {
        executor.execute {
            filmsInteractor.getFilm(id)
        }
    }

    fun deleteFilm(film: FilmDataModel) {
        executor.execute {
            filmsInteractor.deleteFilm(film)
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onEventMainThread(event: GetSingleFilmEvent) {
        if (event.throwable != null) {
            event.throwable?.printStackTrace()

        } else {
            if (screen != null) {
                if (event.film != null) {
                    Log.d("Subs Detail food", event.film.toString())
                    screen?.showFilmDetails(event.film!!)
                }

            }
        }
    }
}