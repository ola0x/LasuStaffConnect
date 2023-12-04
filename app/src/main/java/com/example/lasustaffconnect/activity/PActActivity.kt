
package com.example.lasustaffconnect.activity

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.viewpager.widget.ViewPager
import com.example.lasustaffconnect.R
import com.example.lasustaffconnect.ViewPagerAdapter
import com.example.lasustaffconnect.fragment.overview.LASGOverviewFragment
import com.example.lasustaffconnect.fragment.overview.PActOverviewFragment
import com.example.lasustaffconnect.fragment.policy.LASGPolicyFragment
import com.example.lasustaffconnect.fragment.policy.PActPolicyFragment
import com.google.android.material.tabs.TabLayout

class PActActivity : AppCompatActivity() {

    private lateinit var pager: ViewPager
    private lateinit var tab: TabLayout

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_policy)

        var txt_title = findViewById<TextView>(R.id.txt_title)

        txt_title.text = resources.getString(R.string.txt_pact)
        txt_title.setOnClickListener{
            onBackPressed()
        }

        // set the references of the declared objects above
        pager = findViewById(R.id.viewPager)
        tab = findViewById(R.id.tabs)

        // Initializing the ViewPagerAdapter
        val adapter = ViewPagerAdapter(supportFragmentManager)

        // add fragment to the list
        adapter.addFragment(PActOverviewFragment(), "Overview")
        adapter.addFragment(PActPolicyFragment(), "View Act")

        // Adding the Adapter to the ViewPager
        pager.adapter = adapter

        // bind the viewPager with the TabLayout.
        tab.setupWithViewPager(pager)

    }
}