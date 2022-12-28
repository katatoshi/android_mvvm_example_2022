package io.github.katatoshi.android.mvvmexample2022

import android.app.Application
import timber.log.Timber

class MVVMExample2022Application : Application() {

    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
    }
}