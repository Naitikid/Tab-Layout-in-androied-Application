package com.example.viewpagertablayoutexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.viewpagertablayoutexample.adapter.ViewPagerAdapter
import com.example.viewpagertablayoutexample.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    val animalsArray = arrayOf(
        "One",
        "two",
        "three",
        "four"
    )

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.viewPager.adapter=(ViewPagerAdapter(supportFragmentManager, lifecycle))
        val viewPager = binding.viewPager
        val tabLayout = binding.tabLayout

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = animalsArray[position]
        }.attach()

    }
}