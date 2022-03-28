package za.co.digitalhustlers.weatherapp.data.db

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.room.TypeConverter
import java.time.LocalDate
import java.time.format.DateTimeFormatter


object LocalDateConverter {
    @RequiresApi(Build.VERSION_CODES.O)
    @TypeConverter
    @JvmStatic
    fun stringToDate(str: String?) = str?.let {
        LocalDate.parse(it, DateTimeFormatter.ISO_LOCAL_DATE)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    @TypeConverter
    @JvmStatic
    fun dateToString(dateTime: LocalDate?) = dateTime?.format(DateTimeFormatter.ISO_LOCAL_DATE)
}