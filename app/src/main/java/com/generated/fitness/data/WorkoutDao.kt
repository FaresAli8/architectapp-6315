package com.generated.fitness.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface WorkoutDao {
    @Query("SELECT * FROM workout_sessions ORDER BY timestamp DESC")
    fun getAllSessions(): Flow<List<WorkoutSession>>

    @Insert
    suspend fun insertSession(session: WorkoutSession)

    @Delete
    suspend fun deleteSession(session: WorkoutSession)

    @Query("SELECT SUM(caloriesBurned) FROM workout_sessions")
    fun getTotalCalories(): Flow<Int?>
    
    @Query("SELECT SUM(durationMinutes) FROM workout_sessions")
    fun getTotalDuration(): Flow<Int?>
}