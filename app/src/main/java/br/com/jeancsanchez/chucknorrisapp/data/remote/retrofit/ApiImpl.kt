package br.com.jeancsanchez.chucknorrisapp.data.remote.retrofit

import com.google.gson.GsonBuilder
import com.google.gson.JsonDeserializer
import com.google.gson.JsonPrimitive
import com.google.gson.JsonSerializer
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.*

class ApiImpl : AbsApi() {

    companion object {
        private const val BASE_URL = "https://api.chucknorris.io/"
    }

    private val gson = GsonBuilder()
        .setLenient()
        .registerTypeAdapter(Date::class.java, JsonDeserializer { json, _, _ ->
            Date(json.asJsonPrimitive.asLong)
        })
        .registerTypeAdapter(Date::class.java, JsonSerializer<Date> { date, _, _ ->
            JsonPrimitive(date.time)
        }).create()

    private val loggingInterceptor =
        HttpLoggingInterceptor().also { it.level = HttpLoggingInterceptor.Level.BODY }

    override fun request(): Endpoints {
        okHttp.addInterceptor(loggingInterceptor)

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(okHttp.build())
            .build()
            .create(Endpoints::class.java)
    }
}