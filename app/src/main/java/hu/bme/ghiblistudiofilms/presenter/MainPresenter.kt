package hu.bme.ghiblistudiofilms.presenter

import hu.bme.ghiblistudiofilms.screen.MainScreen

object MainPresenter : Presenter<MainScreen>(){

    override fun attachScreen(screen: MainScreen) {
        super.attachScreen(screen)

        //TODO: Adatbázis lekérdezés, api call
    }

    override fun detachScreen() {
        super.detachScreen()
    }
}