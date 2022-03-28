package com.resocoder.forecastmvvm.data.network.response

import com.google.gson.annotations.SerializedName
import za.co.digitalhustlers.weatherapp.data.db.entity.WeatherLocation

data class FutureWeatherResponse(
    @SerializedName("forecast")
    val futureWeatherEntries: ForecastDaysContainer,
    val location: WeatherLocation
)