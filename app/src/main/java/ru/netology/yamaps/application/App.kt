package ru.netology.yamaps.application

import android.app.Application
import com.yandex.mapkit.MapKitFactory
import ru.netology.yamaps.BuildConfig.MAPS_API_KEY

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        MapKitFactory.setApiKey(MAPS_API_KEY)
        MapKitFactory.initialize(this)
    }
}