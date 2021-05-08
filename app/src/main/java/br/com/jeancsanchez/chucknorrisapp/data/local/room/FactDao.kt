package br.com.jeancsanchez.chucknorrisapp.data.local.room

import androidx.room.Dao
import androidx.room.Query
import br.com.jeancsanchez.chucknorrisapp.data.dto.ResultDTO
import br.com.jeancsanchez.chucknorrisapp.data.local.LocalDataSource

@Dao
interface FactDao : LocalDataSource {

    @Query("SELECT * FROM fact WHERE value LIKE :query")
    override fun findByQuery(query: String): ResultDTO
}