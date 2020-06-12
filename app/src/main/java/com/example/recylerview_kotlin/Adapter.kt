package com.example.recylerview_kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recylerview_kotlin.model.name
import kotlinx.android.synthetic.main.item_view.view.*

class Adapter (private val  list:ArrayList<name>) : RecyclerView.Adapter<Adapter.Holder>() {

    class Holder(val view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false))
    }

    override fun getItemCount(): Int = list?.size

    override fun onBindViewHolder(holder: Adapter.Holder, position: Int) {
        holder.view.lbList.text = list?.get(position)?.name
    }

}