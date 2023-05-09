package com.pazzle.ae.app

import android.app.Application
import com.pazzle.ae.database.MySharedPreferences

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        // registration shared preferences
        MySharedPreferences.initPreferences(this)
    }
}