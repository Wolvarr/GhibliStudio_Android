package hu.bme.ghiblistudiofilms.model

import java.util.*

data class FilmDataModel (
        val name: String,
        val originalName: String,
        val description: String,
        val director: String,
        val producer: String,
        val releaseData: Date,
        val playTime: Int
        )