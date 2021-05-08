package br.com.jeancsanchez.chucknorrisapp.data.remote.retrofit

import br.com.jeancsanchez.restinterceptor.RestErrorInterceptor
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

abstract class AbsApi {

    companion object {
        const val CONNECTION_TIMEOUT: Int = 60000
    }

    protected val okHttp = OkHttpClient.Builder()
        .connectTimeout(CONNECTION_TIMEOUT.toLong(), TimeUnit.MILLISECONDS)
        .writeTimeout(CONNECTION_TIMEOUT.toLong(), TimeUnit.MILLISECONDS)
        .readTimeout(CONNECTION_TIMEOUT.toLong(), TimeUnit.MILLISECONDS)
        .addInterceptor(RestErrorInterceptor())

    /**
     * Creates a new request based on [Endpoints] from an implementation of this abstract class.
     * @return an instance of [Endpoints]
     */
    abstract fun request(): Endpoints
}