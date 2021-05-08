package br.com.jeancsanchez.chucknorrisapp.data.remote

import br.com.jeancsanchez.chucknorrisapp.data.dto.ResultDTO

interface RemoteDataSource {

    /**
     * Searches facts from remote location by given query string
     * @return a [ResultDTO] object.
     */
    fun searchFacts(query: String): ResultDTO
}