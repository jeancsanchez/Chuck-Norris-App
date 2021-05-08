package br.com.jeancsanchez.chucknorrisapp

import android.app.Application
import br.com.jeancsanchez.chucknorrisapp.di.dataModule
import br.com.jeancsanchez.chucknorrisapp.di.localDataSourceModule
import br.com.jeancsanchez.chucknorrisapp.di.remoteDataSourceModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@BaseApplication)
            modules(
                listOf(
                    dataModule,
                    localDataSourceModule,
                    remoteDataSourceModule
                )
            )
        }
    }
}