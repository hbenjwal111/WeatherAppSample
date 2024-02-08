package himanshu.benjwal.weather.ui.weather

import himanshu.benjwal.weather.model.Weather

data class WeatherUiState(
    val weather: Weather? = null,
    val isLoading: Boolean = false,
    val errorMessage: String = "",
)
