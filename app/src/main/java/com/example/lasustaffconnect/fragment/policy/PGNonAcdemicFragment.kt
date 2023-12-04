package com.example.lasustaffconnect.fragment.policy


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import com.example.lasustaffconnect.R
import com.github.barteksc.pdfviewer.PDFView

class PGNonAcdemicFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) : View? {

        val view = inflater.inflate(R.layout.pdf_viewer, container, false)

        val pdfview = view.findViewById<PDFView>(R.id.pdfView)
        pdfview.fromAsset("EXAM-POLICY.pdf").load()


        return view
    }
}