package br.com.jeancsanchez.chucknorrisapp.data.local.room

import androidx.room.Dao
import androidx.room.Query
import br.com.jeancsanchez.chucknorrisapp.data.dto.ResultDTO

@Dao
interface FactDao {

    @Query("SELECT * FROM fact WHERE value LIKE :query")
    fun findByQuery(query: String): ResultDTO
}