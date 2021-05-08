package br.com.jeancsanchez.chucknorrisapp.data.remote.retrofit

import br.com.jeancsanchez.chucknorrisapp.data.dto.ResultDTO
import br.com.jeancsanchez.chucknorrisapp.model.Fact
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.mock.MockRetrofit
import retrofit2.mock.NetworkBehavior
import java.util.*
import java.util.concurrent.TimeUnit

class FakeApi : AbsApi(), Endpoints {

    private val networkBehavior =
        NetworkBehavior
            .create()
            .also {
                it.setDelay(0, TimeUnit.MILLISECONDS)
                it.setFailurePercent(0)
            }

    private val delegate =
        MockRetrofit
            .Builder(
                Retrofit.Builder()
                    .client(okHttp.build())
                    .baseUrl("http://fake.com")
                    .build()
            )
            .networkBehavior(networkBehavior)
            .build()
            .create(Endpoints::class.java)

    override fun request(): Endpoints {
        return this
    }

    override fun searchFacts(query: String): Response<ResultDTO> {
        val resultList = listOf(
            Fact(
                id = "pjepanwfqgowpgc3uf_7hg",
                categories = listOf("dev", "explicit"),
                createdAt = Date(),
                iconUrl = "https://assets.chucknorris.host/img/avatar/chuck-norris.png",
                updatedAt = Date(),
                url = "https://api.chucknorris.io/jokes/pjepanwfqgowpgc3uf_7hg",
                value = "Chuck Norris doesn't look both ways before he crosses the street..." +
                        " he just roundhouses any cars that get too close."
            ),
            Fact(
                id = "59GreidORcWWtxnSpqvX8Q",
                categories = listOf("political"),
                createdAt = Date(),
                iconUrl = "https://assets.chucknorris.host/img/avatar/chuck-norris.png",
                updatedAt = Date(),
                url = "https://api.chucknorris.io/jokes/59GreidORcWWtxnSpqvX8Q",
                value = "Chuck Norris, Jesus, and Barack Obama were standing by a lake." +
                        " Jesus walked out on the water and was shortly followed by Chuck." +
                        " Obama tried to follow, but fell in the water. After muck kicking " +
                        "and splashing Jesus said: Do you think we should tell him about the" +
                        " \"stepping stones\"? Chuck then said: \"What stepping stone?\""
            )
        )

        val data = ResultDTO(total = resultList.size, result = resultList)
        return delegate.returningResponse(data).searchFacts(query)
    }
}