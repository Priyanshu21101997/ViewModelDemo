package com.example.viewmodeldemo

import android.widget.TextView
import androidx.lifecycle.ViewModel

class ViewModel: ViewModel() {

    var num =  0
    fun addNumber():Int {
        num++
        return num
    }
}