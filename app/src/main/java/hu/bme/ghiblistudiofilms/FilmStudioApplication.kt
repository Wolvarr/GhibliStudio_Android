package hu.bme.ghiblistudiofilms

import android.app.Application
import hu.bme.ghiblistudiofilms.DaggerFilmStudioApplicationComponent.builder
import hu.bme.ghiblistudiofilms.UIModule
import hu.bme.ghiblistudiofilms.repository.PersistenceModule

class FilmStudioApplication: Application() {
    lateinit var injector: FilmStudioApplicationComponent


    override fun onCreate() {
        super.onCreate()
        injector = DaggerFilmStudioApplicationComponent.builder()
            .uIModule(UIModule(this))
            .persistenceModule(PersistenceModule(this))
            .build()
    }
}