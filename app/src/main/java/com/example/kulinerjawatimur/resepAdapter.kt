package com.example.kulinerjawatimur

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.daftar_resep.view.*

import kotlinx.android.synthetic.main.detail_resep.view.*

class resepAdapter (val resepItemList: List<resepdata>, val clickListener: (resepdata) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.daftar_resep,parent,false)
        return PartViewHolder(view)
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(resepItemList[position], clickListener)

        }

    override fun getItemCount() = resepItemList.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bind(judul: resepdata, clickListener: (resepdata) -> Unit){

            itemView.JudulU.text = judul.nama

            Picasso.get().load(judul.gambar).into(itemView.gambarU)
            itemView.setOnClickListener{ clickListener(judul)}
        }
    }

}



