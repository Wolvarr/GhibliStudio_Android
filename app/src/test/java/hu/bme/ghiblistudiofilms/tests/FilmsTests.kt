package hu.bme.ghiblistudiofilms.tests

import hu.bme.ghiblistudiofilms.interactor.FilmsInteractor
import hu.bme.ghiblistudiofilms.model.FilmDataModel
import hu.bme.ghiblistudiofilms.model.FilmListModel
import hu.bme.ghiblistudiofilms.presenter.DetailedPresenter
import hu.bme.ghiblistudiofilms.presenter.MainPresenter
import hu.bme.ghiblistudiofilms.screen.DetailedScreen
import hu.bme.ghiblistudiofilms.screen.MainScreen
import hu.bme.ghiblistudiofilms.testInjector
import hu.bme.ghiblistudiofilms.utils.argumentCaptor
import hu.bme.ghiblistudiofilms.utils.mock
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import javax.inject.Inject

@Config(sdk = [28])
@RunWith(RobolectricTestRunner::class)
class FilmsTests {
    @Inject
    lateinit var mainPresenter: MainPresenter
    @Inject
    lateinit var detailedPresenter: DetailedPresenter
    private lateinit var mainScreen: MainScreen
    private lateinit var detailedScreen: DetailedScreen

    @Before
    @Throws(Exception::class)
    fun setup() {
        testInjector.inject(this)
        mainScreen = mock()
        detailedScreen = mock()
        mainPresenter.attachScreen(mainScreen)
        detailedPresenter.attachScreen(detailedScreen)
    }

    @Test
    fun testGetFilms() {
        mainPresenter.refreshFilms()
        val list = argumentCaptor<MutableList<FilmListModel>>()
        verify(mainScreen).showFilms(list.capture())
        assert(list.value.size == 0)
    }

    @Test
    fun testCreateFilm() {
        detailedPresenter.createFilm(FilmDataModel(
            "a6ffcbdb-3cbe-4d0b-a09e-c7a3d45fjc9",
            "Created title", "test original",
            "Test desc",
            "Test dir",
            "Test prod",
            "Test date",
            99,
            false ))

        //assert by testing the load film method
        detailedPresenter.loadDetailedFilmData("a6ffcbdb-3cbe-4d0b-a09e-c7a3d40f4491")

        val film = argumentCaptor<FilmDataModel>()
        verify(detailedScreen).showFilmDetails(film.capture())
        assert(film.value.title.equals("Created title"))
    }

    @Test
    fun testDeleteFilm() {
        detailedPresenter.deleteFilm(FilmDataModel(
            "a6ffcbdb-3cbe-4d0b-a09e-c7a3d40f4499",
            "Test title2", "test original2",
            "Test desc",
            "Test dir",
            "Test prod",
            "Test date",
            99,
            true ))
    }

    @Test
    fun testLoadDetailedFilmData() {
        detailedPresenter.loadDetailedFilmData("a6ffcbdb-3cbe-4d0b-a09e-c7a3d40f4491")

        val film = argumentCaptor<FilmDataModel>()
        verify(detailedScreen).showFilmDetails(film.capture())
        assert(film.value.title.equals("Test title1"))
    }
}