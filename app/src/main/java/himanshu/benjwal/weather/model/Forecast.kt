package himanshu.benjwal.weather.model

/**
 * Forecast
 *
 * @property date
 * @property maxTemp
 * @property minTemp
 * @property sunrise
 * @property sunset
 * @property icon
 * @property hour
 * @constructor Create empty Forecast
 */
data class Forecast(
    val date: String,
    val maxTemp: String,
    val minTemp: String,
    val sunrise: String,
    val sunset: String,
    val icon: String,
    val hour: List<Hour>,
)
