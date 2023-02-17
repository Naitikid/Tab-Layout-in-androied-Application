package com.example.viewpagertablayoutexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpagertablayoutexample.adapter.ShowFragment
import com.example.viewpagertablayoutexample.databinding.FragmentThreeBinding


class Fragmentthree : Fragment() {
        private var _binding: FragmentThreeBinding? = null
        private val binding get() = _binding!!

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            _binding = FragmentThreeBinding
                .inflate(inflater, container, false)
            binding.submitid3.setOnClickListener {
                replacefragment(ShowFragment())
            }
            val view = binding.root
            return view
        }

    private fun replacefragment(showFragment: ShowFragment) {
        val fm = fragmentManager?.beginTransaction()
        fm?.replace(R.id.framelayoutthree, showFragment)
        fm?.addToBackStack("Third")
        fm?.commitAllowingStateLoss()
    }
}

