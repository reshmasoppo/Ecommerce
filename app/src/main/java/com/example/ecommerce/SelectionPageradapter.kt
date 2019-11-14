package com.example.ecommerce

import android.content.Context
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class SelectionPageradapter(private val context: Context,supportFragmentManager: FragmentManager):
    FragmentStatePagerAdapter(supportFragmentManager)
     {
      override fun getItem(position: Int): Fragment {

        if(position==0)
            return Fragment1()
        else if(position==1)
            return Fragment2()
        else
            return Fragment3() }

         override fun getCount(): Int {
        return 3
    }

}