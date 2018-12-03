package com.dalydays.android.forecastmvvm.data.network.response

import com.dalydays.android.forecastmvvm.data.db.entity.CurrentWeatherEntry
import com.dalydays.android.forecastmvvm.data.db.entity.Location
import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(
    @SerializedName("current")
    val current: CurrentWeatherEntry,
    val location: Location
)