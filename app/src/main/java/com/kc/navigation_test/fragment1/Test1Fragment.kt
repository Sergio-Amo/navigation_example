package com.kc.navigation_test.fragment1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.kc.navigation_test.databinding.FragmentTest1Binding

class Test1Fragment : Fragment() {

    private lateinit var binding: FragmentTest1Binding
    private val viewModel: Test1ViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentTest1Binding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Set observers, listeners, etc...
        with(binding){
            button.setOnClickListener {
                fragmentTextView.text = "Clicked! ${viewModel.getCount()}"
            }

        }
    }

}