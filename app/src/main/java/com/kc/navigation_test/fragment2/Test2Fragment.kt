package com.kc.navigation_test.fragment2

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.kc.navigation_test.R
import com.kc.navigation_test.databinding.FragmentTest1Binding
import com.kc.navigation_test.databinding.FragmentTest2Binding

class Test2Fragment : Fragment() {

    private lateinit var binding: FragmentTest2Binding
    private val viewModel: Test2ViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentTest2Binding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Set observers, listeners, etc...

    }

}