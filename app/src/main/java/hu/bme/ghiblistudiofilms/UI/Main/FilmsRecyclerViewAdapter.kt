package hu.bme.ghiblistudiofilms.UI.Main

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import hu.bme.ghiblistudiofilms.R

import hu.bme.ghiblistudiofilms.model.FilmListModel

class FilmsRecyclerViewAdapter(
    private val values: MutableList<FilmListModel>,
    private val onItemClick: (String) -> Unit
) : RecyclerView.Adapter<FilmsRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_films, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.idView.text = item.title
        holder.itemView.setOnClickListener{
            onItemClick(item.id)
        }

        //TODO ha lesz kép
        //val img = R.id.imageView_URL

        //GlideApp.with(holder.itemView)
         //   .load(item.url)
         //   .into(holder.itemView.findViewById(img))
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val idView: TextView = view.findViewById(R.id.item_number)
        val contentView: TextView = view.findViewById(R.id.content)

        override fun toString(): String {
            return super.toString() + " '" + contentView.text + "'"
        }
    }
}