package com.example.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunWeatherApplication : Application() {
    companion object {
        @SuppressLint("StaticFieldLeak")// 在AS中会弹出一些警告，如果确保自己编写的代码无措的情况下，可以使用该命令忽略上述警告。
        lateinit var context : Context
        const val TOKEN = "UbDQi2CfSBgzWvkI"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}