package com.kc.navigation_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.kc.navigation_test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // set initials
        setListeners()
    }

    private fun setListeners() {
        with(binding) {
            button.setOnClickListener {
                openFragment()
            }
        }
    }

    private fun openFragment() {

    }
}