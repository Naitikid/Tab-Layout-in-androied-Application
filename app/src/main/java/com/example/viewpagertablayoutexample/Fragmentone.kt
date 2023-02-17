package com.example.viewpagertablayoutexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewpagertablayoutexample.adapter.ShowFragment
import com.example.viewpagertablayoutexample.databinding.FragmentOneBinding


class Fragmentone : Fragment() {
    private var _binding: FragmentOneBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOneBinding.inflate(inflater, container, false)
        binding.submitid1.setOnClickListener {
            replacefragment(ShowFragment())
            getActivity()?.setTitle("This is ShowFragment")
        }

        val view = binding.root
        return view
    }

    private fun replacefragment(showFragment: ShowFragment) {
        val fm = fragmentManager?.beginTransaction()
        fm?.replace(R.id.framelayoutfirst, showFragment)
        fm?.addToBackStack("second")
        fm?.commitAllowingStateLoss()
    }
}