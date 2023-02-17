package com.example.viewpagertablayoutexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewpagertablayoutexample.adapter.ShowFragment
import com.example.viewpagertablayoutexample.databinding.FragmentTwoBinding


class Fragmenttwo : Fragment() {
        private var _binding: FragmentTwoBinding? = null
        private val binding get() = _binding!!

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            _binding = FragmentTwoBinding.inflate(inflater, container, false)
            binding.submitid2.setOnClickListener {
                replacefragment(ShowFragment())
            }
            val view = binding.root
            return view
        }

    private fun replacefragment(showFragment: ShowFragment) {
        val fm = fragmentManager?.beginTransaction()
        fm?.replace(R.id.framlayouttwo, showFragment)
        fm?.addToBackStack("Showfragment ")
        fm?.commitAllowingStateLoss()
    }
}
