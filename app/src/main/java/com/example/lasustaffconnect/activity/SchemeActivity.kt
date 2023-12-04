package com.example.lasustaffconnect.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import com.example.lasustaffconnect.R
import com.example.lasustaffconnect.ViewPagerAdapter
import com.example.lasustaffconnect.fragment.overview.COSSeniorFragment
import com.example.lasustaffconnect.fragment.overview.SchemeSeniorFragment
import com.example.lasustaffconnect.fragment.policy.COSJuniorFragment
import com.example.lasustaffconnect.fragment.policy.SchemeJuniorFragment
import com.google.android.material.tabs.TabLayout

class SchemeActivity : AppCompatActivity() {

    private lateinit var pager: ViewPager
    private lateinit var tab: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_policy)

        var txt_title = findViewById<TextView>(R.id.txt_title)
        txt_title.text = resources.getString(R.string.txt_scheme)
        txt_title.setOnClickListener{
            onBackPressed()
        }

        // set the references of the declared objects above
        pager = findViewById(R.id.viewPager)
        tab = findViewById(R.id.tabs)

        // Initializing the ViewPagerAdapter
        val adapter = ViewPagerAdapter(supportFragmentManager)

        // add fragment to the list
        adapter.addFragment(SchemeSeniorFragment(), "Senior Staff")
        adapter.addFragment(SchemeJuniorFragment(), "Junior Staff")

        // Adding the Adapter to the ViewPager
        pager.adapter = adapter

        // bind the viewPager with the TabLayout.
        tab.setupWithViewPager(pager)

    }


}