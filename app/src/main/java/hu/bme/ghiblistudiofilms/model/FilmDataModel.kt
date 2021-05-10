package hu.bme.ghiblistudiofilms.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "ModifiedFilms")
data class FilmDataModel (
        @PrimaryKey(autoGenerate = false) val id : String,
        val title: String,
        val original_title_romanised: String,
        val description: String,
        val director: String,
        val producer: String,
        val release_date: String,
        val running_time: Int,
        //if the user deletes an entity, that the API provides
        val isDeleted: Boolean
        )