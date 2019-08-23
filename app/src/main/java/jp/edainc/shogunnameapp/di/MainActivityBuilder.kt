package jp.edainc.shogunnameapp.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import jp.edainc.shogunnameapp.presentation.MainActivity

/**
 * とりあえず気にしなくてよい
 */

@Module
interface MainActivityBuilder {
    @ContributesAndroidInjector(modules = [
        MainActivityModule::class
    ])
    fun contributeActivity(): MainActivity
}