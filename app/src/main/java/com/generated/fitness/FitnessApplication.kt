package com.generated.fitness

import android.app.Application
import com.generated.fitness.data.AppDatabase

class FitnessApplication : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
}