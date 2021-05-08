package br.com.jeancsanchez.chucknorrisapp.data.local

import br.com.jeancsanchez.chucknorrisapp.data.dto.ResultDTO

interface LocalDataSource {

    /**
     * Finds facts from local database by given query string
     * @return a [ResultDTO] object.
     */
    fun findByQuery(query: String): ResultDTO
}