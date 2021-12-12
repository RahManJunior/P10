package com.example.p10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

const val baseURL = "https://kitsu.io/api/edge/"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getCurrentData()
    }
    private fun getCurrentData() {
        val api = Retrofit.Builder()
            .baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(AnimeService::class.java)

        GlobalScope.launch(Dispatchers.IO){
            val response = api.getAnime().awaitResponse()
            if (response.isSuccessful) {
                val datareceived = response.body()!!
                val animeTitleText: TextView = findViewById(R.id.animeTitleText)
                animeTitleText.text = response.body[0].attributes.canonicalTitle
            }
        }
    }

}