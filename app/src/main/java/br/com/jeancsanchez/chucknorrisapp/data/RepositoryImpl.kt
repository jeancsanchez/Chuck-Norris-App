package br.com.jeancsanchez.chucknorrisapp.data

import br.com.jeancsanchez.chucknorrisapp.data.dto.ResultDTO
import br.com.jeancsanchez.chucknorrisapp.data.local.LocalDataSource
import br.com.jeancsanchez.chucknorrisapp.data.remote.RemoteDataSource

class RepositoryImpl(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource
) : Repository(remoteDataSource, localDataSource) {

    override fun searchFactsByQuery(query: String): ResultDTO {

    }
}