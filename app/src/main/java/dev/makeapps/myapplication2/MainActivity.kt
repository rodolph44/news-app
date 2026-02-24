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
                R.drawable.world
            ),
            NewsItem(
                "Heavy rain expected across the region",
                "Meteorologists warn of possible flooding in low areas.",
                R.drawable.weather
            ),
            NewsItem(
                "Football final ends in dramatic penalty shootout",
                "Fans celebrate as the championship trophy is lifted.",
                R.drawable.soccer
            ),
            NewsItem(
                "New AI chip promises faster performance",
                "Tech companies race to improve machine learning hardware.",
                R.drawable.tech
            ),
            NewsItem(
                "Stock markets close higher amid investor optimism",
                "Economic indicators show signs of recovery.",
                R.drawable.business
            ),
            NewsItem(
                "Archaeologists uncover ancient city ruins",
                "Researchers discovered well-preserved structures dating back over 2,000 years.",
                R.drawable.history
            ),
            NewsItem(
                "New study highlights benefits of daily walking",
                "Doctors recommend 30 minutes of moderate activity to improve heart health and reduce stress.",
                R.drawable.medical
            ),
        )

        rvNews.adapter = NewsAdapter(newsList)
    }
}