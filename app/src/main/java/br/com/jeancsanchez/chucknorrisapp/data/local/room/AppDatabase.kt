package br.com.jeancsanchez.chucknorrisapp.data.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import br.com.jeancsanchez.chucknorrisapp.model.Fact

@Database(entities = [Fact::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun factDao(): FactDao
}