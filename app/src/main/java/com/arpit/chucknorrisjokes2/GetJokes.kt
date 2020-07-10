package com.arpit.chucknorrisjokes2


import retrofit2.Response
import retrofit2.http.GET

interface getJokes {

    @GET("jokes/random/5")
    suspend fun jokes() : Response<JokesResponse>
}