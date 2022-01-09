package com.example.lyricsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.Builder().permitAll().build())
    }

    fun search(view: View) {
        val queryInputView = findViewById<EditText>(R.id.queryInput)
        val query = queryInputView.text.toString()
        val lyrics = LyricsFinder.find(query)
        findViewById<TextView>(R.id.lyricsView).text=lyrics
    }

}