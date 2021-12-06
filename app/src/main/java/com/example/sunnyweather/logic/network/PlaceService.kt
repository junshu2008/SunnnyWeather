package com.example.sunnyweather.logic.network

import retrofit2.Call
import com.example.sunnyweather.SunWeatherApplication
import com.example.sunnyweather.logic.model.PlaceResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    @GET("v2/place?token=${SunWeatherApplication.TOKEN}&lang = ch_CN")
    fun searchPlaces(@Query("query") query : String) : Call<PlaceResponse>
}