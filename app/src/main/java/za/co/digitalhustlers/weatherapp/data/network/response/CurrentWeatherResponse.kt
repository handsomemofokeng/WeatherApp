package com.resocoder.forecastmvvm.data.network.response

import com.google.gson.annotations.SerializedName
import za.co.digitalhustlers.weatherapp.data.db.entity.CurrentWeatherEntry
import za.co.digitalhustlers.weatherapp.data.db.entity.WeatherLocation

data class CurrentWeatherResponse(
    val location: WeatherLocation,
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry
)