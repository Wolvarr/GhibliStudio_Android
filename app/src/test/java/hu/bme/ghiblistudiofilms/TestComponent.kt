package hu.bme.ghiblistudiofilms

import dagger.Component
import hu.bme.ghiblistudiofilms.interactor.InteractorModule
import hu.bme.ghiblistudiofilms.mock.MockNetworkModule
import hu.bme.ghiblistudiofilms.repository.PersistenceModule
import hu.bme.ghiblistudiofilms.tests.FilmsTests
import javax.inject.Singleton

@Singleton
@Component(modules = [MockNetworkModule::class, TestModule::class, InteractorModule::class, PersistenceModule::class])
interface TestComponent : FilmStudioApplicationComponent {
    fun inject(filmsTests: FilmsTests)

}