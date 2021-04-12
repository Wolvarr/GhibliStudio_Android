package hu.bme.ghiblistudiofilms.presenter

import hu.bme.ghiblistudiofilms.screen.EditScreen

class EditPresenter: Presenter<EditScreen>(){

    override fun attachScreen(screen: EditScreen) {
        super.attachScreen(screen)

        //TODO: Adatbázis lekérdezés, api call
    }

    override fun detachScreen() {
        super.detachScreen()
    }
}