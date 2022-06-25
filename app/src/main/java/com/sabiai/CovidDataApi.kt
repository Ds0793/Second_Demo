package com.sabiai

import com.sabiai.model.CovidData
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface CovidDataApi {

    @GET("data")
    suspend fun getResponse() : Response<List<CovidData>>

    companion object{
        operator fun invoke() : CovidDataApi{
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://data.covid19india.org/data.json")
                .build()
                .create(CovidDataApi::class.java)
        }
    }
}