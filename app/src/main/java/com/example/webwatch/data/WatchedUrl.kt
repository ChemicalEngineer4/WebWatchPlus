package com.example.webwatch.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class WatchedUrl(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val url: String,
    val lastContent: String? = null
)
