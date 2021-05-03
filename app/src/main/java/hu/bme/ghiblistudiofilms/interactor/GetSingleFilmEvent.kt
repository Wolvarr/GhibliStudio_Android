package hu.bme.ghiblistudiofilms.interactor

import hu.bme.ghiblistudiofilms.model.FilmDataModel

data class GetSingleFilmEvent(
    var code: Int =0,
    var film: FilmDataModel? = null,
    var throwable: Throwable? = null
)