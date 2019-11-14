package com.example.ecommerce

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager

class Splash_fragment : Fragment()
{
    private var mPager: ViewPager? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_splash_fragment, container, false)
        mPager = view.findViewById<ViewPager>(R.id.Pager)

        //  mPager!!.adapter = SelectionPageradapter(activity!!.applicationContext,activity!!.supportFragmentManager)
        mPager!!.adapter = SelectionPageradapter(activity!!.applicationContext,activity!!.supportFragmentManager)
        val indicator1= view.findViewById<ViewPager>(R.id.indicator)

        return  view
    }

}




