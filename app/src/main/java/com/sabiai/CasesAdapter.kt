package com.sabiai

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CasesAdapter() : RecyclerView.Adapter<CasesAdapter.CasesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CasesViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.cases_itemview, parent, false)
        return CasesViewHolder(view)
    }

    override fun onBindViewHolder(holder: CasesViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


    class CasesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var date = itemView.findViewById<TextView>(R.id.dateID)
    }
}

