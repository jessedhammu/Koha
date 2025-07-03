package com.jesse.koha.network

import com.jesse.koha.models.Book
import com.jesse.koha.models.User
import retrofit2.Call
import retrofit2.http.*

interface KohaService {
    @GET("search")
    fun searchBooks(@Query("q") query: String): Call<List<Book>>

    @GET("profile")
    fun getUserProfile(@Header("Authorization") auth: String): Call<User>
}