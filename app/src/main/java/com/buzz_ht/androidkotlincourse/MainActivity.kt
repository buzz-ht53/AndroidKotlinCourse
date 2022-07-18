package com.buzz_ht.androidkotlincourse

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logging()

    }

    fun logging(){

        Log.d(TAG, "Hello World")
        Log.wtf(TAG, "This will never happen")

    }
}