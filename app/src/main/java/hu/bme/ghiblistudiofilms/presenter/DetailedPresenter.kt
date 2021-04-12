package hu.bme.ghiblistudiofilms.presenter

import hu.bme.ghiblistudiofilms.screen.DetailedScreen

class DetailedPresenter : Presenter<DetailedScreen>(){

    override fun attachScreen(screen: DetailedScreen) {
        super.attachScreen(screen)

        //TODO: Adatbázis lekérdezés, api call
    }

    override fun detachScreen() {
        super.detachScreen()
    }
}