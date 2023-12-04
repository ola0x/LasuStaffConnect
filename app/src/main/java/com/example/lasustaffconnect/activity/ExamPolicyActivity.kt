package com.example.lasustaffconnect.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import com.example.lasustaffconnect.R
import com.example.lasustaffconnect.ViewPagerAdapter
import com.example.lasustaffconnect.dialog.Dialog_download_appendix
import com.example.lasustaffconnect.fragment.overview.ExamOverviewFragment
import com.example.lasustaffconnect.fragment.policy.ExamPolicyFragment
import com.google.android.material.tabs.TabLayout

class ExamPolicyActivity : AppCompatActivity() {
    private lateinit var pager: ViewPager
    private lateinit var tab: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_policy)

        var txt_title = findViewById<TextView>(R.id.txt_title)
        txt_title.text = resources.getString(R.string.txt_exam)
        txt_title.setOnClickListener{
            onBackPressed()
        }

//        var btn_download = findViewById<TextView>(R.id.download_btn)
//        btn_download.visibility = View.VISIBLE
//        btn_download.setOnClickListener{
//            val alert = Dialog_download_appendix()
//            alert.showDialog(this@ExamPolicyActivity)
//        }

        // set the references of the declared objects above
        pager = findViewById(R.id.viewPager)
        tab = findViewById(R.id.tabs)

        // Initializing the ViewPagerAdapter
        val adapter = ViewPagerAdapter(supportFragmentManager)

        // add fragment to the list
        adapter.addFragment(ExamOverviewFragment(), "Overview")
        adapter.addFragment(ExamPolicyFragment(), "View Policy")

        // Adding the Adapter to the ViewPager
        pager.adapter = adapter

        // bind the viewPager with the TabLayout.
        tab.setupWithViewPager(pager)


    }


}