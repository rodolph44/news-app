package dev.makeapps.myapplication2

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter(
    private val items: List<NewsItem>
) : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgIcon: ImageView = itemView.findViewById(R.id.imgIcon)
        val tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
        val tvDesc: TextView = itemView.findViewById(R.id.tvDesc)
        val tvCategory: TextView = itemView.findViewById(R.id.tvCategory)
        val tvDate: TextView = itemView.findViewById(R.id.tvDate)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_news, parent, false)
        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val item = items[position]

        holder.imgIcon.setImageResource(item.logoResId)
        holder.tvTitle.text = item.title
        holder.tvDesc.text = item.description
        holder.tvCategory.text = item.category
        holder.tvDate.text = item.date

        // 🎨 Different color per category (bonus pretty touch)
        when (item.category.lowercase()) {
            "world" -> holder.tvCategory.setBackgroundColor(Color.parseColor("#3F51B5"))
            "weather" -> holder.tvCategory.setBackgroundColor(Color.parseColor("#009688"))
            "football" -> holder.tvCategory.setBackgroundColor(Color.parseColor("#4CAF50"))
            "tech" -> holder.tvCategory.setBackgroundColor(Color.parseColor("#FF9800"))
            "business" -> holder.tvCategory.setBackgroundColor(Color.parseColor("#9C27B0"))
            "health" -> holder.tvCategory.setBackgroundColor(Color.parseColor("#E91E63"))
            else -> holder.tvCategory.setBackgroundColor(Color.DKGRAY)
        }
    }

    override fun getItemCount(): Int = items.size
}