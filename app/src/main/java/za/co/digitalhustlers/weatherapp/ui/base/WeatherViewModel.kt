package za.co.digitalhustlers.weatherapp.ui.base

import androidx.lifecycle.ViewModel
import com.resocoder.forecastmvvm.data.provider.UnitProvider
import za.co.digitalhustlers.weatherapp.data.repository.ForecastRepository
import za.co.digitalhustlers.weatherapp.internal.UnitSystem
import za.co.digitalhustlers.weatherapp.internal.lazyDeferred


abstract class WeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : ViewModel() {

    private val unitSystem = unitProvider.getUnitSystem()

    val isMetricUnit: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weatherLocation by lazyDeferred {
        forecastRepository.getWeatherLocation()
    }
}