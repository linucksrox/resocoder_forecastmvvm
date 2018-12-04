package com.dalydays.android.forecastmvvm.data.repository

import androidx.lifecycle.LiveData
import com.dalydays.android.forecastmvvm.data.db.CurrentWeatherDao
import com.dalydays.android.forecastmvvm.data.db.unitlocalized.UnitSpecificCurrentWeatherEntry
import com.dalydays.android.forecastmvvm.data.network.WeatherNetworkDataSource
import com.dalydays.android.forecastmvvm.data.network.response.CurrentWeatherResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ForecastRepositoryImpl(
    private val currentWeatherDao: CurrentWeatherDao,
    private val weatherNetworkDataSource: WeatherNetworkDataSource
) : ForecastRepository {

    init {
        weatherNetworkDataSource.downloadedCurrentWeather.observeForever { newCurrentWeather ->
            // persist
        }
    }

    override suspend fun getCurrentWeather(metric: Boolean): LiveData<UnitSpecificCurrentWeatherEntry> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun persistCurrentWeather(fetchedWeather: CurrentWeatherResponse) {
        GlobalScope.launch(Dispatchers.IO) {
            currentWeatherDao.upsert(fetchedWeather.currentWeatherEntry)
        }
    }
}