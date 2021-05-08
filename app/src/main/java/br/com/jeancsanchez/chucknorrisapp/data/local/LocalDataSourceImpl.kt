package br.com.jeancsanchez.chucknorrisapp.data.local

import br.com.jeancsanchez.chucknorrisapp.data.dto.ResultDTO
import br.com.jeancsanchez.chucknorrisapp.data.local.room.FactDao

class LocalDataSourceImpl(
    private val factDao: FactDao
) : LocalDataSource {

    override fun findByQuery(query: String): ResultDTO {

    }
}