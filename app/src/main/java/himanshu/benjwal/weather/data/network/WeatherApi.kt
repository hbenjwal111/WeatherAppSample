package himanshu.benjwal.weather.data.network

import himanshu.benjwal.weather.BuildConfig
import himanshu.benjwal.weather.data.model.ForecastResponse
import himanshu.benjwal.weather.utils.DEFAULT_WEATHER_DESTINATION
import himanshu.benjwal.weather.utils.NUMBER_OF_DAYS
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Weather api
 *
 * @constructor Create empty Weather api
 */
interface WeatherApi {
    /**
     * Get weather forecast
     *
     * @param key
     * @param city
     * @param days
     * @return
     */
    @GET("forecast.json")
    suspend fun getWeatherForecast(
        @Query("key") key: String = BuildConfig.API_KEY,
        @Query("q") city: String = DEFAULT_WEATHER_DESTINATION,
        @Query("days") days: Int = NUMBER_OF_DAYS,
    ): ForecastResponse
}