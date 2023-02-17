package com.example.viewpagertablayoutexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpagertablayoutexample.adapter.ShowFragment
import com.example.viewpagertablayoutexample.databinding.FragmentFragmentfourBinding


class Fragmentfour : Fragment() {
    private var _binding: FragmentFragmentfourBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFragmentfourBinding
            .inflate(inflater, container, false)
        binding.submitid4.setOnClickListener {
        }
        val view = binding.root
        return view
    }

    private fun replacefragment(showFragment: ShowFragment) {

    }
}