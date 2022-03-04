package com.example.androidsinav

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item_layout.view.*
import android.graphics.Color

import com.example.androidsinav.R



class AdapterFirst: RecyclerView.Adapter<AdapterFirst.NameViewHolder>() {

    var sayiListesi: ArrayList<Int> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= NameViewHolder (
        LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_layout, parent, false)
    )

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
        holder.bind(sayiListesi[position],position)

    }

    override fun getItemCount(): Int =sayiListesi.size
    inner class NameViewHolder(view: View): RecyclerView.ViewHolder(view) {
        fun bind(sayi: Int,position: Int) {
            with(itemView.button){
                text=sayi.toString()
                if (position%2==1){
                   setBackgroundColor(Color.BLUE)
                }
                else{
                    setBackgroundColor(Color.RED)
                }
            }
        }

    }
    fun datayiAl(sayiList: ArrayList<Int>){
        sayiListesi.clear()
        sayiListesi.addAll(sayiList)
        notifyDataSetChanged()
    }
}