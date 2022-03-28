package za.co.digitalhustlers.weatherapp.data.repository

import androidx.lifecycle.LiveData
import za.co.digitalhustlers.weatherapp.data.db.entity.WeatherLocation
import za.co.digitalhustlers.weatherapp.data.db.unitlocalized.current.UnitSpecificCurrentWeatherEntry
import za.co.digitalhustlers.weatherapp.data.db.unitlocalized.future.detail.UnitSpecificDetailFutureWeatherEntry
import za.co.digitalhustlers.weatherapp.data.db.unitlocalized.future.list.UnitSpecificSimpleFutureWeatherEntry
import java.time.LocalDate


interface ForecastRepository {
    suspend fun getCurrentWeather(metric: Boolean): LiveData<out UnitSpecificCurrentWeatherEntry>

    suspend fun getFutureWeatherList(
        startDate: LocalDate,
        metric: Boolean
    ): LiveData<out List<UnitSpecificSimpleFutureWeatherEntry>>

    suspend fun getFutureWeatherByDate(
        date: LocalDate,
        metric: Boolean
    ): LiveData<out UnitSpecificDetailFutureWeatherEntry>

    suspend fun getWeatherLocation(): LiveData<WeatherLocation>
}