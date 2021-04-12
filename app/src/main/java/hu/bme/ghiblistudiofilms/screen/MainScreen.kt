package hu.bme.ghiblistudiofilms.screen

import hu.bme.ghiblistudiofilms.model.FilmListModel

interface MainScreen {
    fun showFilms(filmList: List<FilmListModel>)
}