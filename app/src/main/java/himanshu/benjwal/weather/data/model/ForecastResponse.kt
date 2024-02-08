package himanshu.benjwal.weather.data.model


import com.google.gson.annotations.SerializedName
import himanshu.benjwal.weather.data.model.ForecastResponse.NetworkForecast.NetworkForecastday
import himanshu.benjwal.weather.model.Forecast
import himanshu.benjwal.weather.model.Hour
import himanshu.benjwal.weather.model.Weather

/**
 * Forecast response
 *
 * @property current
 * @property forecast
 * @property location
 * @constructor Create empty Forecast response
 */
data class ForecastResponse(
    @SerializedName("current") val current: Current,
    @SerializedName("forecast") val forecast: NetworkForecast,
    @SerializedName("location") val location: Location
) {
    /**
     * Current
     *
     * @property cloud
     * @property condition
     * @property feelslikeC
     * @property feelslikeF
     * @property gustKph
     * @property gustMph
     * @property humidity
     * @property isDay
     * @property lastUpdated
     * @property lastUpdatedEpoch
     * @property precipIn
     * @property precipMm
     * @property pressureIn
     * @property pressureMb
     * @property tempC
     * @property tempF
     * @property uv
     * @property visKm
     * @property visMiles
     * @property windDegree
     * @property windDir
     * @property windKph
     * @property windMph
     * @constructor Create empty Current
     */
    data class Current(
        @SerializedName("cloud") val cloud: Int,
        @SerializedName("condition") val condition: Condition,
        @SerializedName("feelslike_c") val feelslikeC: Double,
        @SerializedName("feelslike_f") val feelslikeF: Double,
        @SerializedName("gust_kph") val gustKph: Double,
        @SerializedName("gust_mph") val gustMph: Double,
        @SerializedName("humidity") val humidity: Int,
        @SerializedName("is_day") val isDay: Int,
        @SerializedName("last_updated") val lastUpdated: String,
        @SerializedName("last_updated_epoch") val lastUpdatedEpoch: Int,
        @SerializedName("precip_in") val precipIn: Double,
        @SerializedName("precip_mm") val precipMm: Double,
        @SerializedName("pressure_in") val pressureIn: Double,
        @SerializedName("pressure_mb") val pressureMb: Double,
        @SerializedName("temp_c") val tempC: Double,
        @SerializedName("temp_f") val tempF: Double,
        @SerializedName("uv") val uv: Double,
        @SerializedName("vis_km") val visKm: Double,
        @SerializedName("vis_miles") val visMiles: Double,
        @SerializedName("wind_degree") val windDegree: Int,
        @SerializedName("wind_dir") val windDir: String,
        @SerializedName("wind_kph") val windKph: Double,
        @SerializedName("wind_mph") val windMph: Double
    ) {
        /**
         * Condition
         *
         * @property code
         * @property icon
         * @property text
         * @constructor Create empty Condition
         */
        data class Condition(
            @SerializedName("code") val code: Int,
            @SerializedName("icon") val icon: String,
            @SerializedName("text") val text: String
        )
    }

    /**
     * Network forecast
     *
     * @property forecastday
     * @constructor Create empty Network forecast
     */
    data class NetworkForecast(
        @SerializedName("forecastday") val forecastday: List<NetworkForecastday>
    ) {
        /**
         * Network forecastday
         *
         * @property astro
         * @property date
         * @property dateEpoch
         * @property day
         * @property hour
         * @constructor Create empty Network forecastday
         */
        data class NetworkForecastday(
            @SerializedName("astro") val astro: Astro,
            @SerializedName("date") val date: String,
            @SerializedName("date_epoch") val dateEpoch: Int,
            @SerializedName("day") val day: Day,
            @SerializedName("hour") val hour: List<NetworkHour>
        ) {
            /**
             * Astro
             *
             * @property isMoonUp
             * @property isSunUp
             * @property moonIllumination
             * @property moonPhase
             * @property moonrise
             * @property moonset
             * @property sunrise
             * @property sunset
             * @constructor Create empty Astro
             */
            data class Astro(
                @SerializedName("is_moon_up") val isMoonUp: Int,
                @SerializedName("is_sun_up") val isSunUp: Int,
                @SerializedName("moon_illumination") val moonIllumination: String,
                @SerializedName("moon_phase") val moonPhase: String,
                @SerializedName("moonrise") val moonrise: String,
                @SerializedName("moonset") val moonset: String,
                @SerializedName("sunrise") val sunrise: String,
                @SerializedName("sunset") val sunset: String
            )

            /**
             * Day
             *
             * @property avghumidity
             * @property avgtempC
             * @property avgtempF
             * @property avgvisKm
             * @property avgvisMiles
             * @property condition
             * @property dailyChanceOfRain
             * @property dailyChanceOfSnow
             * @property dailyWillItRain
             * @property dailyWillItSnow
             * @property maxtempC
             * @property maxtempF
             * @property maxwindKph
             * @property maxwindMph
             * @property mintempC
             * @property mintempF
             * @property totalprecipIn
             * @property totalprecipMm
             * @property totalsnowCm
             * @property uv
             * @constructor Create empty Day
             */
            data class Day(
                @SerializedName("avghumidity") val avghumidity: Double,
                @SerializedName("avgtemp_c") val avgtempC: Double,
                @SerializedName("avgtemp_f") val avgtempF: Double,
                @SerializedName("avgvis_km") val avgvisKm: Double,
                @SerializedName("avgvis_miles") val avgvisMiles: Double,
                @SerializedName("condition") val condition: Condition,
                @SerializedName("daily_chance_of_rain") val dailyChanceOfRain: Int,
                @SerializedName("daily_chance_of_snow") val dailyChanceOfSnow: Int,
                @SerializedName("daily_will_it_rain") val dailyWillItRain: Int,
                @SerializedName("daily_will_it_snow") val dailyWillItSnow: Int,
                @SerializedName("maxtemp_c") val maxtempC: Double,
                @SerializedName("maxtemp_f") val maxtempF: Double,
                @SerializedName("maxwind_kph") val maxwindKph: Double,
                @SerializedName("maxwind_mph") val maxwindMph: Double,
                @SerializedName("mintemp_c") val mintempC: Double,
                @SerializedName("mintemp_f") val mintempF: Double,
                @SerializedName("totalprecip_in") val totalprecipIn: Double,
                @SerializedName("totalprecip_mm") val totalprecipMm: Double,
                @SerializedName("totalsnow_cm") val totalsnowCm: Double,
                @SerializedName("uv") val uv: Double
            ) {
                /**
                 * Condition
                 *
                 * @property code
                 * @property icon
                 * @property text
                 * @constructor Create empty Condition
                 */
                data class Condition(
                    @SerializedName("code") val code: Int,
                    @SerializedName("icon") val icon: String,
                    @SerializedName("text") val text: String
                )
            }

            /**
             * Network hour
             *
             * @property chanceOfRain
             * @property chanceOfSnow
             * @property cloud
             * @property condition
             * @property dewpointC
             * @property dewpointF
             * @property feelslikeC
             * @property feelslikeF
             * @property gustKph
             * @property gustMph
             * @property heatindexC
             * @property heatindexF
             * @property humidity
             * @property isDay
             * @property precipIn
             * @property precipMm
             * @property pressureIn
             * @property pressureMb
             * @property tempC
             * @property tempF
             * @property time
             * @property timeEpoch
             * @property uv
             * @property visKm
             * @property visMiles
             * @property willItRain
             * @property willItSnow
             * @property windDegree
             * @property windDir
             * @property windKph
             * @property windMph
             * @property windchillC
             * @property windchillF
             * @constructor Create empty Network hour
             */
            data class NetworkHour(
                @SerializedName("chance_of_rain") val chanceOfRain: Int,
                @SerializedName("chance_of_snow") val chanceOfSnow: Int,
                @SerializedName("cloud") val cloud: Int,
                @SerializedName("condition") val condition: Condition,
                @SerializedName("dewpoint_c") val dewpointC: Double,
                @SerializedName("dewpoint_f") val dewpointF: Double,
                @SerializedName("feelslike_c") val feelslikeC: Double,
                @SerializedName("feelslike_f") val feelslikeF: Double,
                @SerializedName("gust_kph") val gustKph: Double,
                @SerializedName("gust_mph") val gustMph: Double,
                @SerializedName("heatindex_c") val heatindexC: Double,
                @SerializedName("heatindex_f") val heatindexF: Double,
                @SerializedName("humidity") val humidity: Int,
                @SerializedName("is_day") val isDay: Int,
                @SerializedName("precip_in") val precipIn: Double,
                @SerializedName("precip_mm") val precipMm: Double,
                @SerializedName("pressure_in") val pressureIn: Double,
                @SerializedName("pressure_mb") val pressureMb: Double,
                @SerializedName("temp_c") val tempC: Double,
                @SerializedName("temp_f") val tempF: Double,
                @SerializedName("time") val time: String,
                @SerializedName("time_epoch") val timeEpoch: Int,
                @SerializedName("uv") val uv: Double,
                @SerializedName("vis_km") val visKm: Double,
                @SerializedName("vis_miles") val visMiles: Double,
                @SerializedName("will_it_rain") val willItRain: Int,
                @SerializedName("will_it_snow") val willItSnow: Int,
                @SerializedName("wind_degree") val windDegree: Int,
                @SerializedName("wind_dir") val windDir: String,
                @SerializedName("wind_kph") val windKph: Double,
                @SerializedName("wind_mph") val windMph: Double,
                @SerializedName("windchill_c") val windchillC: Double,
                @SerializedName("windchill_f") val windchillF: Double
            ) {
                /**
                 * Condition
                 *
                 * @property code
                 * @property icon
                 * @property text
                 * @constructor Create empty Condition
                 */
                data class Condition(
                    @SerializedName("code") val code: Int,
                    @SerializedName("icon") val icon: String,
                    @SerializedName("text") val text: String
                )
            }
        }
    }

    /**
     * Location
     *
     * @property country
     * @property lat
     * @property localtime
     * @property localtimeEpoch
     * @property lon
     * @property name
     * @property region
     * @property tzId
     * @constructor Create empty Location
     */
    data class Location(
        @SerializedName("country") val country: String,
        @SerializedName("lat") val lat: Double,
        @SerializedName("localtime") val localtime: String,
        @SerializedName("localtime_epoch") val localtimeEpoch: Int,
        @SerializedName("lon") val lon: Double,
        @SerializedName("name") val name: String,
        @SerializedName("region") val region: String,
        @SerializedName("tz_id") val tzId: String
    )
}

/**
 * To weather
 *
 * @return
 */
fun ForecastResponse.toWeather(): Weather = Weather(
    temperature = current.tempC.toInt(),
    date = forecast.forecastday[0].date,
    wind = current.windKph.toInt(),
    humidity = current.humidity,
    feelsLike = current.feelslikeC.toInt(),
    condition = current.condition,
    uv = current.uv.toInt(),
    name = location.name,
    forecasts = forecast.forecastday.map { networkForecastday ->
        networkForecastday.toWeatherForecast()
    }
)

/**
 * To weather forecast
 *
 * @return
 */
fun NetworkForecastday.toWeatherForecast(): Forecast = Forecast(
    date = date,
    maxTemp = day.maxtempC.toInt().toString(),
    minTemp = day.mintempC.toInt().toString(),
    sunrise = astro.sunrise,
    sunset = astro.sunset,
    icon = day.condition.icon,
    hour = hour.map { networkHour ->
        networkHour.toHour()
    }
)

/**
 * To hour
 *
 * @return
 */
fun NetworkForecastday.NetworkHour.toHour(): Hour = Hour(
    time = time,
    icon = condition.icon,
    temperature = tempC.toInt().toString(),
)