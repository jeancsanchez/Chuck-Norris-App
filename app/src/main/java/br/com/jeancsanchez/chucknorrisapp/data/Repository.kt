package br.com.jeancsanchez.chucknorrisapp.data

import br.com.jeancsanchez.chucknorrisapp.data.dto.ResultDTO
import br.com.jeancsanchez.chucknorrisapp.data.local.LocalDataSource
import br.com.jeancsanchez.chucknorrisapp.data.remote.RemoteDataSource

abstract class Repository(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource
) {

    /**
     * Searches for facts by given query text
     * @param query text to be searched.
     * @return a [ResultDTO] object
     */
    abstract fun searchFactsByQuery(query: String): ResultDTO
}
