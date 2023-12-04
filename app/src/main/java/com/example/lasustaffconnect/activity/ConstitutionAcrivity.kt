package com.example.lasustaffconnect.activity

import android.app.Activity
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.viewpager.widget.ViewPager
import com.downloader.Error
import com.downloader.OnDownloadListener
import com.downloader.PRDownloader
import com.example.lasustaffconnect.R
import com.example.lasustaffconnect.ViewPagerAdapter
import com.example.lasustaffconnect.fragment.overview.CONSTOverviewFragment
import com.example.lasustaffconnect.fragment.overview.PActOverviewFragment
import com.example.lasustaffconnect.fragment.policy.CONSTPolicyFragment
import com.example.lasustaffconnect.fragment.policy.PActPolicyFragment
import com.example.lasustaffconnect.utils.FileUtils
import com.github.barteksc.pdfviewer.PDFView
import com.google.android.material.tabs.TabLayout
import java.io.File

class ConstitutionAcrivity : AppCompatActivity() {

    private lateinit var pager: ViewPager
    private lateinit var tab: TabLayout
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_policy)

//        PRDownloader.initialize(applicationContext)

//        var txt_policy = findViewById<TextView>(R.id.txt_policy)
//        val progressBar = findViewById<ProgressBar>(R.id.progressBar)

//        var txt_download = findViewById<TextView>(R.id.txt_download)
//        txt_download.setOnClickListener {
//            progressBar.visibility = View.VISIBLE
//            val fileName = "myFile.pdf"
//            downloadPdfFromInternet(
//                FileUtils.getPdfUrl(),
//                FileUtils.getRootDirPath(this),
//                fileName
//            )
//        }

        var txt_title = findViewById<TextView>(R.id.txt_title)
        txt_title.text = resources.getString(R.string.txt_constitution)
        txt_title.setOnClickListener{
            onBackPressed()
        }

        // set the references of the declared objects above
        pager = findViewById(R.id.viewPager)
        tab = findViewById(R.id.tabs)

        // Initializing the ViewPagerAdapter
        val adapter = ViewPagerAdapter(supportFragmentManager)

        // add fragment to the list
        adapter.addFragment(CONSTOverviewFragment(), "Overview")
        adapter.addFragment(CONSTPolicyFragment(), "View Constitution")

        // Adding the Adapter to the ViewPager
        pager.adapter = adapter

        // bind the viewPager with the TabLayout.
        tab.setupWithViewPager(pager)

    }

//    private fun showPdfFromFile(file: File) {
//        val pdfView = findViewById<PDFView>(R.id.pdfView)
//        pdfView.visibility = View.VISIBLE
//        pdfView.fromFile(file)
//            .password(null)
//            .defaultPage(0)
//            .enableSwipe(true)
//            .swipeHorizontal(false)
//            .enableDoubletap(true)
//            .onPageError { page, _ ->
//                Toast.makeText(
//                    this@ConstitutionAcrivity,
//                    "Error at page: $page", Toast.LENGTH_LONG
//                ).show()
//            }
//            .load()
//    }

//    private fun downloadPdfFromInternet(url: String, dirPath: String, fileName: String) {
//        PRDownloader.download(
//            url,
//            dirPath,
//            fileName
//        ).build()
//            .start(object : OnDownloadListener {
//                override fun onDownloadComplete() {
//                    Toast.makeText(this@ConstitutionAcrivity, "downloadComplete", Toast.LENGTH_LONG)
//                        .show()
//                    val downloadedFile = File(dirPath, fileName)
//                    val progressBar = findViewById<ProgressBar>(R.id.progressBar)
//                    progressBar.visibility = View.GONE
////                    showPdfFromFile(downloadedFile)
//                }
//
//                override fun onError(error: Error?) {
//                    Toast.makeText(
//                        this@ConstitutionAcrivity,
//                        "Error in downloading file : $error",
//                        Toast.LENGTH_LONG
//                    )
//                        .show()
//                }
//            })
//    }

//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        if (requestCode == PDF_SELECTION_CODE && resultCode == Activity.RESULT_OK && data != null) {
//            val selectedPdfFromStorage = data.data
//            showPdfFromUri(selectedPdfFromStorage)
//        }
//    }
}