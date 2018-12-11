package com.dalydays.android.forecastmvvm.data.repository

import androidx.lifecycle.LiveData
import com.dalydays.android.forecastmvvm.data.db.unitlocalized.UnitSpecificCurrentWeatherEntry

interface ForecastRepository {
    suspend fun getCurrentWeather(metric: Boolean): LiveData<out UnitSpecificCurrentWeatherEntry>
}