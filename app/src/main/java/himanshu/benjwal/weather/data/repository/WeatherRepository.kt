package himanshu.benjwal.weather.data.repository

import himanshu.benjwal.weather.model.Weather
import himanshu.benjwal.weather.utils.Result
import kotlinx.coroutines.flow.Flow

interface WeatherRepository {
    fun getWeatherForecast(city: String): Flow<Result<Weather>>
}