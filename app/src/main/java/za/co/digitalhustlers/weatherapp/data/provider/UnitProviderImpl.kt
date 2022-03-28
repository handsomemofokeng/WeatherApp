package com.resocoder.forecastmvvm.data.provider

import android.content.Context
import za.co.digitalhustlers.weatherapp.data.provider.PreferenceProvider
import za.co.digitalhustlers.weatherapp.internal.UnitSystem

const val UNIT_SYSTEM = "UNIT_SYSTEM"

class UnitProviderImpl(context: Context) : PreferenceProvider(context), UnitProvider {

    override fun getUnitSystem(): UnitSystem {
        val selectedName = preferences.getString(UNIT_SYSTEM, UnitSystem.METRIC.name)
        return UnitSystem.valueOf(selectedName!!)
    }
}
