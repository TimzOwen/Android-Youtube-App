package com.owen.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        //check if the recyclew accipies the whole parent
        //recycler_view.setBackgroundColor(Color.BLUE)
    }
}
