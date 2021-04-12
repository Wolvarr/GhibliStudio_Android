package hu.bme.ghiblistudiofilms.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "ModifiedFilms")
data class FilmDataModel (
        @PrimaryKey(autoGenerate = false) val id: UUID,
        val name: String,
        val originalName: String,
        val description: String,
        val director: String,
        val producer: String,
        val releaseData: Date,
        val playTime: Int
        )