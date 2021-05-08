package br.com.jeancsanchez.chucknorrisapp.model

import com.google.gson.annotations.SerializedName
import java.util.*

data class Fact(
    val id: String,
    val categories: List<String> = emptyList(),

    @SerializedName("icon_url")
    val iconUrl: String,

    @SerializedName("created_at")
    val createdAt: Date,

    @SerializedName("updated_at")
    val updatedAt: Date,

    val url: String,
    val value: String
)