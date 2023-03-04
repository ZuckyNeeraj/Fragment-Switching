package com.example.fragmentbackapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentOne = Fragment1()

        //initially the fragment that has to be loaded
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flframe, fragmentOne)
            commit()
        }
    }
}