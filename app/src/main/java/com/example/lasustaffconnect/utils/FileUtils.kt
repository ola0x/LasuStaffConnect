package com.example.lasustaffconnect.utils

import android.content.Context
import android.os.Environment
import androidx.core.content.ContextCompat
import java.io.File

object FileUtils {

    fun getPdfNameFromAssets(): String {
        return "MindOrks_Android_Online_Professional_Course-Syllabus.pdf"
    }

    fun getPdfUrl(): String {
        return "https://admin.concern.net/sites/default/files/documents/2020-10/2020%20Global%20Hunger%20Index.pdf"
    }

    fun getRootDirPath(context: Context): String {
        return if (Environment.MEDIA_MOUNTED == Environment.getExternalStorageState()) {
            val file: File = ContextCompat.getExternalFilesDirs(
                context.applicationContext,
                null
            )[0]
            file.absolutePath
        } else {
            context.applicationContext.filesDir.absolutePath
        }
    }
}