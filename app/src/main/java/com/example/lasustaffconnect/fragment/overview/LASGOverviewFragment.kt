package com.example.lasustaffconnect.fragment.overview


import android.os.Build
import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.RequiresApi
import com.example.lasustaffconnect.R

class LASGOverviewFragment: Fragment() {

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_overview, container, false)
        val textView: TextView = view.findViewById(R.id.txt_policy)

        val str = resources.getString(R.string.abt_text_lasg_public_service)
        textView.text = Html.fromHtml(str, Html.FROM_HTML_MODE_COMPACT)

        return view
    }


}