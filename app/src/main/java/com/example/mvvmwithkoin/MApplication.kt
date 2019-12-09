package com.example.mvvmwithkoin

import android.app.Application
import com.example.mvvmwithkoin.di.cacheModule
import com.example.mvvmwithkoin.di.repositoryModule
import com.example.mvvmwithkoin.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MApplication : Application() {


    override fun onCreate() {
        super.onCreate()

        /**
         * Start Koin and add modules that depends on the application
         */
        startKoin {
            androidLogger()
            androidContext(this@MApplication)
            modules(listOf(cacheModule, repositoryModule, viewModelModule))
        }
    }

}