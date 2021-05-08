package br.com.jeancsanchez.chucknorrisapp.data

import br.com.jeancsanchez.chucknorrisapp.data.local.LocalDataSource

abstract class Repository(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource
) {

    /**
     * Searches for facts by given query text
     * @param query text to be searched.
     */
    abstract fun searchFactsByQuery(query: String)
}
