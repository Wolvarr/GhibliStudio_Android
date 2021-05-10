package hu.bme.ghiblistudiofilms.presenter

import hu.bme.ghiblistudiofilms.interactor.FilmsInteractor
import hu.bme.ghiblistudiofilms.interactor.GetFilmsEvent
import hu.bme.ghiblistudiofilms.screen.MainScreen
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import java.util.concurrent.Executor
import javax.inject.Inject

class MainPresenter @Inject constructor(private val executor: Executor, private val foodInteractor: FilmsInteractor ): Presenter<MainScreen>() {

    override fun attachScreen(screen: MainScreen) {
        super.attachScreen(screen)
        EventBus.getDefault().register(this)
    }

    override fun detachScreen() {
        EventBus.getDefault().unregister(this)
        super.detachScreen()
    }

    fun refreshFilms() {
        executor.execute {
            foodInteractor.getFilms()
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onEventMainThread(event: GetFilmsEvent) {
        if (event.throwable != null) {
            event.throwable?.printStackTrace()

        } else {
            if (screen != null) {
                if (event.films != null) {
                    screen?.showFilms(event.films!!)
                }

            }
        }
    }
}