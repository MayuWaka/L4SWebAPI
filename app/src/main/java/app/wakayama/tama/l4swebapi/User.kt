package app.wakayama.tama.l4swebapi

import com.google.gson.annotations.SerializedName

data class User (
    @SerializedName("name")  val name: String,
    @SerializedName("login") val userId: String,
    @SerializedName("avatar_url") val avatarUrl: String,
    val following: Int,
    val followers: Int
)