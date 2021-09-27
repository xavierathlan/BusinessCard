package com.example.businesscard

import android.app.Application
import com.example.businesscard.data.AppDatabase
import com.example.businesscard.data.BusinessCardRepository
import kotlinx.coroutines.InternalCoroutinesApi

class App : Application() {
    @InternalCoroutinesApi
    val database by lazy { AppDatabase.getDatabase(this) }
    @InternalCoroutinesApi
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}