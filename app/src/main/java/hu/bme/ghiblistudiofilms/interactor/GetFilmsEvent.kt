package hu.bme.ghiblistudiofilms.interactor

import hu.bme.ghiblistudiofilms.model.FilmListModel

data class GetFilmsEvent(
    var code: Int =0,
    var films: MutableList<FilmListModel>? = null,
    var throwable: Throwable? = null
)