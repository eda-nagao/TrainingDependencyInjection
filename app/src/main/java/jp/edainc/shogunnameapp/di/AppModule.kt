package jp.edainc.shogunnameapp.di

import dagger.Module
import dagger.Provides
import jp.edainc.shogunnameapp.BuildConfig
import jp.edainc.shogunnameapp.data.api.ShogunApi
import jp.edainc.shogunnameapp.data.repository.ShogunRepository
import jp.edainc.shogunnameapp.data.repository.impl.ShogunRepositoryImpl
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
object AppModule {

    @Singleton @JvmStatic @Provides
    fun provideShogunRepository(): ShogunRepository {
        return ShogunRepositoryImpl(createApi())
    }

    private fun createApi(): ShogunApi {
        val client = OkHttpClient.Builder().apply {
            // デバッグ時にログを表示する
            if (BuildConfig.DEBUG) {
                val loggingInterceptor = HttpLoggingInterceptor()
                loggingInterceptor.level = HttpLoggingInterceptor.Level.HEADERS
                addInterceptor(loggingInterceptor)
            }
        }.build()
        val retrofit = Retrofit.Builder()
            .baseUrl("http://hogehoge.hogehoge.shogun.com") // 存在しないURL
            .client(client)
            .build()
        return retrofit.create(ShogunApi::class.java)
    }
}