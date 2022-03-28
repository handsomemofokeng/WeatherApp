package com.resocoder.forecastmvvm.data.provider

import za.co.digitalhustlers.weatherapp.internal.UnitSystem


interface UnitProvider {
    fun getUnitSystem(): UnitSystem
}