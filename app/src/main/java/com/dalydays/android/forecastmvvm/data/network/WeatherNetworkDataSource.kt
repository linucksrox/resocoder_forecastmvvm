package com.dalydays.android.forecastmvvm.data.network

import androidx.lifecycle.LiveData
import com.dalydays.android.forecastmvvm.data.network.response.CurrentWeatherResponse

interface WeatherNetworkDataSource {
    val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>

    suspend fun fetchCurrentWeather(
        location: String,
        languageCode: String
    )
}