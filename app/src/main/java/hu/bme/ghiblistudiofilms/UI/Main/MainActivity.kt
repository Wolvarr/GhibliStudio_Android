package hu.bme.ghiblistudiofilms.UI.Main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.gson.Gson
import hu.bme.ghiblistudiofilms.R
import hu.bme.ghiblistudiofilms.UI.FilmEditActivity
import hu.bme.ghiblistudiofilms.injector
import hu.bme.ghiblistudiofilms.model.FilmDataModel
import hu.bme.ghiblistudiofilms.model.FilmListModel
import hu.bme.ghiblistudiofilms.screen.MainScreen

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       injector.inject(this)


        setContentView(R.layout.activity_main)
        //setSupportActionBar(findViewById(R.id.toolbar))

        supportFragmentManager.beginTransaction().replace(R.id.fragment, FilmsFragment.newInstance(1)).commit()

       // findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
       //     val intent = Intent(this, FilmEditActivity::class.java)
      //      intent.putExtra(FoodFragment.KEY_FOOD,  Gson().toJson(FilmDataModel()))
      //      startActivity(intent)
      //  }
    }

}