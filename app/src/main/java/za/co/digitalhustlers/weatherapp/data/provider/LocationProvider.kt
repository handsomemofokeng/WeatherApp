package za.co.digitalhustlers.weatherapp.data.provider

import za.co.digitalhustlers.weatherapp.data.db.entity.WeatherLocation


interface LocationProvider {
    suspend fun hasLocationChanged(lastWeatherLocation: WeatherLocation): Boolean
    suspend fun getPreferredLocationString(): String
}