package com.resocoder.forecastmvvm.data.network.response

import com.google.gson.annotations.SerializedName
import za.co.digitalhustlers.weatherapp.data.db.entity.FutureWeatherEntry

data class ForecastDaysContainer(
    @SerializedName("forecastday")
    val entries: List<FutureWeatherEntry>
)