package br.com.jeancsanchez.chucknorrisapp.di

import br.com.jeancsanchez.chucknorrisapp.BuildConfig
import br.com.jeancsanchez.chucknorrisapp.data.remote.retrofit.AbsApi
import br.com.jeancsanchez.chucknorrisapp.data.remote.retrofit.ApiImpl
import br.com.jeancsanchez.chucknorrisapp.data.remote.retrofit.FakeApi
import org.koin.dsl.module

val remoteDataSourceModule = module {
    fun providesApi(): AbsApi {
        return if (BuildConfig.BUILD_TYPE.contains("mock", true)) {
            FakeApi()
        } else {
            ApiImpl()
        }
    }

    single { providesApi() }
}