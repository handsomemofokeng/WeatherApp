package za.co.digitalhustlers.weatherapp.data.db.unitlocalized.future.list

import androidx.room.ColumnInfo
import java.time.LocalDate


class ImperialSimpleFutureWeatherEntry (
    @ColumnInfo(name = "date")
    override val date: LocalDate,
    @ColumnInfo(name = "avgtempF")
    override val avgTemperature: Double,
    @ColumnInfo(name = "condition_text")
    override val conditionText: String,
    @ColumnInfo(name = "condition_icon")
    override val conditionIconUrl: String
) : UnitSpecificSimpleFutureWeatherEntry