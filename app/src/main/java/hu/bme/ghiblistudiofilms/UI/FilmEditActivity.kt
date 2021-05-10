package hu.bme.ghiblistudiofilms.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.Gson
import hu.bme.ghiblistudiofilms.R
import hu.bme.ghiblistudiofilms.UI.Detailed.FilmDetailedActivity
import hu.bme.ghiblistudiofilms.UI.Main.FilmsFragment
import hu.bme.ghiblistudiofilms.UI.Main.MainActivity
import hu.bme.ghiblistudiofilms.injector
import hu.bme.ghiblistudiofilms.model.FilmDataModel
import hu.bme.ghiblistudiofilms.presenter.DetailedPresenter
import hu.bme.ghiblistudiofilms.screen.DetailedScreen
import kotlinx.android.synthetic.main.activity_film_detailed.*
import kotlinx.android.synthetic.main.activity_film_edit.*
import javax.inject.Inject

class FilmEditActivity : AppCompatActivity(), DetailedScreen {
    private var filmId: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_film_edit)
        injector.inject(this)

        filmId =  intent.getStringExtra(FilmDetailedActivity.KEY_EDIT_FILM)

        discard_btn.setOnClickListener {
            discard()
        }

        save_btn.setOnClickListener {
            save()
        }
    }

    private fun discard() {
        val intent = Intent(this, FilmDetailedActivity::class.java)

        startActivity(intent)
    }

    private fun save() {
        //TODO: Save not implemented yet, probably wont be when handed eather..
        val intent = Intent(this, MainActivity::class.java)
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
        filmTitleEdit.setText(filmData.title)
        originalTitleEdit.setText(filmData.original_title_romanised)
        descriptionEdit.setText(filmData.description)
        directorEdit.setText(filmData.director)
        producerEdit.setText(filmData.producer)
        releaseEdit.setText(filmData.release_date)
        playTimeEdit.setText(filmData.running_time.toString())
    }
}