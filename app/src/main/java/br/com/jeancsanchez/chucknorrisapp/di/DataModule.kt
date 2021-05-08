package br.com.jeancsanchez.chucknorrisapp.di

import br.com.jeancsanchez.chucknorrisapp.data.Repository
import br.com.jeancsanchez.chucknorrisapp.data.RepositoryImpl
import br.com.jeancsanchez.chucknorrisapp.data.local.LocalDataSource
import br.com.jeancsanchez.chucknorrisapp.data.local.LocalDataSourceImpl
import br.com.jeancsanchez.chucknorrisapp.data.remote.RemoteDataSource
import br.com.jeancsanchez.chucknorrisapp.data.remote.RemoteDataSourceImpl
import org.koin.dsl.module

val dataModule = module {
    factory<Repository> { RepositoryImpl(remoteDataSource = get(), localDataSource = get()) }
    factory<LocalDataSource> { LocalDataSourceImpl(factDao = get()) }
    factory<RemoteDataSource> { RemoteDataSourceImpl(api = get()) }
}