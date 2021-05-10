package hu.bme.ghiblistudiofilms.screen

import hu.bme.ghiblistudiofilms.model.FilmDataModel

interface DetailedScreen {
    fun showFilmDetails(filmData: FilmDataModel)
}