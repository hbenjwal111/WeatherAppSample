package himanshu.benjwal.weather.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import himanshu.benjwal.weather.data.network.WeatherApi
import himanshu.benjwal.weather.data.repository.DefaultWeatherRepository
import himanshu.benjwal.weather.data.repository.WeatherRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideRepository(weatherApi: WeatherApi): WeatherRepository =
        DefaultWeatherRepository(weatherApi)
}