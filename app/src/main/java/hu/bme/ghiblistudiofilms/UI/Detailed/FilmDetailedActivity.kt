package hu.bme.ghiblistudiofilms.UI.Detailed

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.gson.Gson
import hu.bme.ghiblistudiofilms.R
import hu.bme.ghiblistudiofilms.UI.FilmEditActivity
import hu.bme.ghiblistudiofilms.UI.Main.FilmsFragment
import hu.bme.ghiblistudiofilms.UI.Main.MainActivity
import hu.bme.ghiblistudiofilms.injector
import hu.bme.ghiblistudiofilms.model.FilmDataModel
import hu.bme.ghiblistudiofilms.presenter.DetailedPresenter
import hu.bme.ghiblistudiofilms.screen.DetailedScreen
import kotlinx.android.synthetic.main.activity_film_detailed.*
import javax.inject.Inject

class FilmDetailedActivity : AppCompatActivity(), DetailedScreen {

    private var filmId: String? = null
    private var filmDataModel: FilmDataModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_film_detailed)
        injector.inject(this)

        filmId =  intent.getStringExtra(FilmsFragment.KEY_FILMS)

        delete_btn.setOnClickListener {
            deleteFilm()
        }

        edit_btn.setOnClickListener {
            editFilm()
        }
    }

    private fun deleteFilm() {
        detailedPresenter.deleteFilm(filmDataModel!!)
        Toast.makeText(this, "Succesfully deleted item!", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun editFilm() {

        val intent = Intent(this, FilmEditActivity::class.java)
        intent.putExtra(KEY_EDIT_FILM,  filmId)
        startActivity(intent)
    }

        @Inject
        lateinit var detailedPresenter: DetailedPresenter

    override fun onStart() {
        super.onStart()
        detailedPresenter.attachScreen(this)
    }

        override fun onResume() {
            super.onResume()
            detailedPresenter.loadDetailedFilmData(filmId!!)
        }

    override fun showFilmDetails(filmData: FilmDataModel) {
        this.filmDataModel = filmData
        filmTitle.text = filmData.title
        originalTitle.text = filmData.original_title_romanised
        description.text = filmData.description
        director.text = "Director: " + filmData.director
        producer.text = "Producer: " + filmData.producer
        release.text = "Release date: " + filmData.release_date
        playTime.text = "Playtime: " + filmData.running_time + "min"
    }

    companion object {
        const val KEY_EDIT_FILM = "KEY_EDIT_FILM"
    }
}
