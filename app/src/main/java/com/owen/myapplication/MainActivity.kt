package com.owen.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.*
import java.io.IOException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        //check if the recyclew accipies the whole parent
        //recycler_view.setBackgroundColor(Color.BLUE)
        //recycler_view.setBackgroundColor(Color.BLUE)
        recycler_view.layoutManager = LinearLayoutManager(this)
        //set a dapter
        recycler_view.adapter = HomeAdapter()

        //function to collect json files
        fetchJson()
    }
    
    
    fun fetchJson()
    {
        val url = "https://api.letsbuildthatapp.com/youtube/home_feed"

        val request = Request.Builder().url(url).build()

       val client = OkHttpClient()

        client.newCall(request).enqueue(object : Callback{

            override fun onResponse(call: Call, response: Response)
            {
                val body = response?.body?.string()

                println(body)

            }

            override fun onFailure(call: Call, e: IOException) {
               println("Failed to Fetch data , try again")
            }
        })
    }
}
