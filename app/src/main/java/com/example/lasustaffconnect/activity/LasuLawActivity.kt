package com.example.lasustaffconnect.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.ParcelFileDescriptor
import android.view.View
import android.view.WindowManager
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.view.ViewCompat
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import androidx.viewpager2.widget.ViewPager2.ORIENTATION_HORIZONTAL
import com.example.lasustaffconnect.PDFAdapter
import com.example.lasustaffconnect.R
import com.example.lasustaffconnect.ViewPagerAdapter
import com.example.lasustaffconnect.fragment.overview.LASULAWFragment
import com.example.lasustaffconnect.fragment.overview.PGAcademicFragment
import com.google.android.material.tabs.TabLayout
import java.io.File
import java.io.InputStream

class LasuLawActivity : AppCompatActivity() {
    private lateinit var pager: ViewPager
    private lateinit var tab: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_policy)

        var txt_title = findViewById<TextView>(R.id.txt_title)
        txt_title.text = resources.getString(R.string.lasu_law)
        txt_title.setOnClickListener{
            onBackPressed()
        }

        // set the references of the declared objects above
        pager = findViewById(R.id.viewPager)
        tab = findViewById(R.id.tabs)

        // Initializing the ViewPagerAdapter
        val adapter = ViewPagerAdapter(supportFragmentManager)

        // add fragment to the list
        adapter.addFragment(LASULAWFragment(), "LAGOS STATE UNIVERSITY LAW")
        //adapter.addFragment(PGNonAcdemicFragment(), "Non-Academic")

        // Adding the Adapter to the ViewPager
        pager.adapter = adapter

        // bind the viewPager with the TabLayout.
        tab.setupWithViewPager(pager)

    }
}