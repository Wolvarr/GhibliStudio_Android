package hu.bme.ghiblistudiofilms.mock

import dagger.Module
import dagger.Provides
import hu.bme.ghiblistudiofilms.API.FilmsApi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import javax.inject.Singleton

@Module
class MockNetworkModule {
    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return OkHttpClient.Builder().addInterceptor(interceptor).build()
    }

    @Provides
    @Singleton
    fun provideFilmsApi(): FilmsApi = MockFilmsApi()
}