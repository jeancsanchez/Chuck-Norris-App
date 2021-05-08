package br.com.jeancsanchez.chucknorrisapp.data.remote.retrofit

import br.com.jeancsanchez.chucknorrisapp.data.dto.ResultDTO
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface Endpoints {

    @GET("jokes/search?query={query}")
    fun searchFacts(@Path("query") query: String): Response<ResultDTO>
}