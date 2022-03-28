package za.co.digitalhustlers.weatherapp.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import za.co.digitalhustlers.weatherapp.data.db.entity.CURRENT_WEATHER_ID
import za.co.digitalhustlers.weatherapp.data.db.entity.CurrentWeatherEntry
import za.co.digitalhustlers.weatherapp.data.db.unitlocalized.current.ImperialCurrentWeatherEntry
import za.co.digitalhustlers.weatherapp.data.db.unitlocalized.current.MetricCurrentWeatherEntry


@Dao
interface CurrentWeatherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(weatherEntry: CurrentWeatherEntry)

    @Query("select * from current_weather where id = $CURRENT_WEATHER_ID")
    fun getWeatherMetric(): LiveData<MetricCurrentWeatherEntry>

    @Query("select * from current_weather where id = $CURRENT_WEATHER_ID")
    fun getWeatherImperial(): LiveData<ImperialCurrentWeatherEntry>
}