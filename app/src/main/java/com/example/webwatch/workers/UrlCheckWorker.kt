package com.example.webwatch.workers

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class UrlCheckWorker(appContext: Context, workerParams: WorkerParameters) :
    Worker(appContext, workerParams) {
    override fun doWork(): Result {
        // TODO: URL kontrol ve bildirim işlemleri
        return Result.success()
    }
}
