package com.example.lasustaffconnect.fragment.overview


import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.example.lasustaffconnect.R
import com.github.barteksc.pdfviewer.PDFView

class FROverviewFragment: Fragment() {

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.pdf_viewer, container, false)

        val pdfview = view.findViewById<PDFView>(R.id.pdfView)
        pdfview.fromAsset("fp.pdf")
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