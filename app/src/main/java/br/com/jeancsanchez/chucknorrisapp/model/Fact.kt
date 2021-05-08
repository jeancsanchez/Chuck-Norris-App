package br.com.jeancsanchez.chucknorrisapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.util.*

@Entity
data class Fact(
    @PrimaryKey val id: String,
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