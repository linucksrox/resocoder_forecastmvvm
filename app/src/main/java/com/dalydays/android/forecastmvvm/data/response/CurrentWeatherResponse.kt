package com.dalydays.android.forecastmvvm.data.response

import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(
    @SerializedName("current")
    val current: CurrentWeatherEntry,
    val location: Location
)