package com.example.listmaker

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class ListSelectionViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
  val itemNumber = itemView.findViewById<TextView>(R.id.item_number)
  val item = itemView.findViewById<TextView>(R.id.item)
}
