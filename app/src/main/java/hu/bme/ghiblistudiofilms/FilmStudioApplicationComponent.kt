package hu.bme.ghiblistudiofilms

import dagger.Component
import hu.bme.ghiblistudiofilms.API.NetworkModule
import hu.bme.ghiblistudiofilms.UI.Detailed.FilmDetailedActivity
import hu.bme.ghiblistudiofilms.UI.FilmEditActivity
import hu.bme.ghiblistudiofilms.UI.Main.FilmsFragment
import hu.bme.ghiblistudiofilms.UI.Main.MainActivity
import hu.bme.ghiblistudiofilms.interactor.InteractorModule
import hu.bme.ghiblistudiofilms.repository.PersistenceModule
import javax.inject.Singleton

@Singleton
@Component(modules = [UIModule::class, NetworkModule::class, InteractorModule::class, PersistenceModule::class])
interface FilmStudioApplicationComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(filmFragment: FilmsFragment)
    fun inject(editActivity: FilmEditActivity)
    fun inject(detailActivity: FilmDetailedActivity)
}