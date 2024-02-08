package himanshu.benjwal.weather

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint
import himanshu.benjwal.weather.ui.theme.WeatherTheme
import himanshu.benjwal.weather.ui.weather.WeatherScreen

/**
 * Main activity
 *
 */
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherTheme {
                WeatherScreen()
            }
        }
    }
}
