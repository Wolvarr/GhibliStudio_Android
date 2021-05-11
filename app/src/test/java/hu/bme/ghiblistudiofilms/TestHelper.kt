package hu.bme.ghiblistudiofilms

import hu.bme.ghiblistudiofilms.repository.PersistenceModule
import org.robolectric.RuntimeEnvironment
import org.robolectric.shadows.ShadowLog

val testInjector: TestComponent
    get() {
        ShadowLog.stream = System.out
        val application = RuntimeEnvironment.application as FilmStudioApplication
        val component = DaggerTestComponent.builder().persistenceModule(PersistenceModule(application))
            .testModule(TestModule(application.applicationContext)).build()
        application.injector = component
        return component
    }

