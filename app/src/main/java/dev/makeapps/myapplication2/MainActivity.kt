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
                "World leaders gather for climate summit",
                "Talks focus on reducing emissions and global cooperation.",
                "World",
                "June 1, 2025",
                R.drawable.world
            ),
            NewsItem(
                "Heavy rain expected across the region",
                "Meteorologists warn of possible flooding in low areas.",
                "Weather",
                "June 2, 2025",
                R.drawable.weather
            ),
            NewsItem(
                "Football final ends in dramatic penalty shootout",
                "Fans celebrate as the championship trophy is lifted.",
                "Football",
                "June 3, 2025",
                R.drawable.soccer
            ),
            NewsItem(
                "New AI chip promises faster performance",
                "Tech companies race to improve machine learning hardware.",
                "Tech",
                "June 4, 2025",
                R.drawable.tech
            ),
            NewsItem(
                "Stock markets close higher amid investor optimism",
                "Economic indicators show signs of recovery.",
                "Business",
                "June 5, 2025",
                R.drawable.business
            ),
        )

        rvNews.adapter = NewsAdapter(newsList)
    }
}