package hu.bme.ghiblistudiofilms.UI.Main

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import hu.bme.ghiblistudiofilms.R
import hu.bme.ghiblistudiofilms.UI.Detailed.FilmDetailedActivity
import hu.bme.ghiblistudiofilms.injector
import hu.bme.ghiblistudiofilms.model.FilmListModel
import hu.bme.ghiblistudiofilms.presenter.MainPresenter
import hu.bme.ghiblistudiofilms.screen.MainScreen
import kotlinx.android.synthetic.main.fragment_films_list.*
import javax.inject.Inject

class FilmsFragment : Fragment(), MainScreen {

    @Inject
    lateinit var mainPresenter: MainPresenter

    private var columnCount = 1
    private var filmAdapter: FilmsRecyclerViewAdapter? = null
    private val displayedFilms: MutableList<FilmListModel> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            columnCount = it.getInt(ARG_COLUMN_COUNT)
        }
    }

    override fun onStart() {
        super.onStart()
        injector.inject(this)
        mainPresenter.attachScreen(this)
    }

    override fun onResume() {
        super.onResume()
        mainPresenter.refreshFilms()
    }

    override fun onStop() {
        super.onStop()
        mainPresenter.detachScreen()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_films_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        list.layoutManager = LinearLayoutManager(context)
        filmAdapter = FilmsRecyclerViewAdapter(displayedFilms, ::onItemClick)
        list.adapter = filmAdapter
    }

    fun onItemClick(id: String) {
        val intent = Intent(activity, FilmDetailedActivity::class.java)
        intent.putExtra(KEY_FILMS, id)
        startActivity(intent)

    }

    companion object {
        const val KEY_FILMS = "KEY_FILMS"
        const val ARG_COLUMN_COUNT = "column-count"

        @JvmStatic
        fun newInstance(columnCount: Int) =
            FilmsFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_COLUMN_COUNT, columnCount)
                }
            }
    }

    override fun showFilms(films: List<FilmListModel>) {
        displayedFilms.clear()
        if (films != null) {
            displayedFilms.addAll(films)
        }
        filmAdapter?.notifyDataSetChanged()
    }
}