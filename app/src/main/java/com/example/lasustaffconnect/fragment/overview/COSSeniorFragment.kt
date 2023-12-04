package com.example.lasustaffconnect.fragment.overview


import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import com.example.lasustaffconnect.R

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.ParcelFileDescriptor
import android.view.WindowManager
import android.widget.ProgressBar
import android.widget.Toast
import androidx.core.view.ViewCompat
import androidx.viewpager2.widget.ViewPager2
import androidx.viewpager2.widget.ViewPager2.ORIENTATION_HORIZONTAL
import com.example.lasustaffconnect.PDFAdapter
import com.github.barteksc.pdfviewer.PDFView
import java.io.File
import java.io.InputStream

class COSSeniorFragment: Fragment() {


    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.pdf_viewer, container, false)

        val pdfview = view.findViewById<PDFView>(R.id.pdfView)
        pdfview.fromAsset("cos_senior.pdf")
            .password(null)
            .defaultPage(0)
            .enableAnnotationRendering(true)
            .spacing(10) // in dp
            .onPageError { page, _ ->
                Toast.makeText(
                    activity,
                    "Error at page: $page", Toast.LENGTH_LONG
                ).show()
            }
            .load()
        pdfview.setBackgroundColor(Color.LTGRAY)

        return view
    }



}