package hu.bme.ghiblistudiofilms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hu.bme.ghiblistudiofilms.model.FilmListModel
import hu.bme.ghiblistudiofilms.screen.MainScreen

class MainActivity : AppCompatActivity(), MainScreen {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun showFilms(filmList: List<FilmListModel>) {
        TODO("Not yet implemented")
    }
}