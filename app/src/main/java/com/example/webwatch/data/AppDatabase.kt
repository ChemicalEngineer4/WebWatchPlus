package com.example.webwatch.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [WatchedUrl::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun watchedUrlDao(): WatchedUrlDao
}
