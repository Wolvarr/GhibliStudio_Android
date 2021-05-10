package hu.bme.ghiblistudiofilms

import android.app.Activity
import androidx.fragment.app.Fragment
import hu.bme.ghiblistudiofilms.FilmStudioApplication
import hu.bme.ghiblistudiofilms.FilmStudioApplicationComponent



val Activity.injector: FilmStudioApplicationComponent
    get() {
        return (this.applicationContext as FilmStudioApplication).injector
    }

val Fragment.injector: FilmStudioApplicationComponent
    get() {
        return (this.context!!.applicationContext as FilmStudioApplication).injector
    }