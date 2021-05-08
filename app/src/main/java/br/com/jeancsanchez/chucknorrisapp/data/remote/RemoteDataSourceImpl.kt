package br.com.jeancsanchez.chucknorrisapp.data.remote

import br.com.jeancsanchez.chucknorrisapp.data.dto.ResultDTO
import br.com.jeancsanchez.chucknorrisapp.data.remote.retrofit.AbsApi

class RemoteDataSourceImpl(
    private val api: AbsApi
) : RemoteDataSource {

    override fun searchFacts(query: String): ResultDTO {

    }
}