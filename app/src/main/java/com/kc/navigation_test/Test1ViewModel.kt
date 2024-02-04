package com.kc.navigation_test

import androidx.lifecycle.ViewModel

class Test1ViewModel : ViewModel() {

    private var counter = 0
    fun getCount() = counter++.toString()
}