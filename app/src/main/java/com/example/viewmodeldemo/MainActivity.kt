package com.example.viewmodeldemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val textView = findViewById<TextView>(R.id.textView)
        var viewModel = ViewModelProvider(this).get(ViewModel::class.java)

        textView.text=(viewModel.addNumber().toString())

        btnAdd.setOnClickListener{

            textView.text=(viewModel.addNumber().toString())

        }
    }
}