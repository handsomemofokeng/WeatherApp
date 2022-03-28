package za.co.digitalhustlers.weatherapp.data.db.unitlocalized.future.list

import java.time.LocalDate


interface UnitSpecificSimpleFutureWeatherEntry {
    val date: LocalDate
    val avgTemperature: Double
    val conditionText: String
    val conditionIconUrl: String
}