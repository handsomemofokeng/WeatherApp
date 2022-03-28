package za.co.digitalhustlers.weatherapp.internal

import java.io.IOException


class NoConnectivityException : IOException()
class LocationPermissionNotGrantedException : Exception()
class DateNotFoundException : Exception()