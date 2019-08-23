package jp.edainc.shogunnameapp.di

import androidx.appcompat.app.AppCompatActivity
import dagger.Binds
import dagger.Module
import jp.edainc.shogunnameapp.presentation.MainActivity

/**
 * とりあえず気にしなくてよい
 */

@Module
interface MainActivityModule {
    @Binds
    fun bindMainActivity(mainActivity: MainActivity): AppCompatActivity
}