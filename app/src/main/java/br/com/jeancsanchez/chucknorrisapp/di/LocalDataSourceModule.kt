package br.com.jeancsanchez.chucknorrisapp.di

import android.app.Application
import androidx.room.Room
import br.com.jeancsanchez.chucknorrisapp.data.local.room.AppDatabase
import br.com.jeancsanchez.chucknorrisapp.data.local.room.FactDao
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module


val localDataSourceModule = module {
    fun providesDatabase(application: Application): AppDatabase {
        return Room.databaseBuilder(application, AppDatabase::class.java, "facts_db")
            .fallbackToDestructiveMigration()
            .build()
    }

    fun providesFactDao(database: AppDatabase): FactDao {
        return database.factDao()
    }

    single { providesFactDao(get()) }
    single { providesDatabase(androidApplication()) }
}