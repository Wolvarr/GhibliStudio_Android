package hu.bme.ghiblistudiofilms.model

import java.util.*

//Not saved to database
data class FilmListModel(
        val id: UUID,
        val name: String,
        val originalName: String
)