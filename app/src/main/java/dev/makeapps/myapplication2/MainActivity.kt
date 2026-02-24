package dev.makeapps.myapplication2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvNews = findViewById<RecyclerView>(R.id.rvNews)
        rvNews.layoutManager = LinearLayoutManager(this)

        val newsList = listOf(
            NewsItem(
                "This is the news title",
                "This is the news description and it contains a summary of what happened",
                R.mipmap.ic_launcher
            ),
            NewsItem(
                "This is the news title",
                "This is the news description and it contains a summary of what happened",
                R.mipmap.ic_launcher
            ),
            NewsItem(
                "This is the news title",
                "This is the news description and it contains a summary of what happened",
                R.mipmap.ic_launcher
            ),
            NewsItem(
                "This is the news title",
                "This is the news description and it contains a summary of what happened",
                R.mipmap.ic_launcher
            )
        )

        rvNews.adapter = NewsAdapter(newsList)
    }
}