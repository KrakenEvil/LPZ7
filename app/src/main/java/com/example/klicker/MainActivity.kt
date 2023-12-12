package com.example.klicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(view: View) {
        val textView: TextView = findViewById(R.id.txtW)
        textView.text = "Hello, friend"

    }
    var q = 0
    fun click2(view: View) {
        val textView: TextView = findViewById(R.id.txtW)

        textView.text = "Я нажал кнопку ${++q} раз"
    }

}