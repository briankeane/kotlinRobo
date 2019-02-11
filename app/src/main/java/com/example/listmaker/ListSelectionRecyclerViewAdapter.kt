package com.example.listmaker

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class ListSelectionRecyclerViewAdapter : RecyclerView.Adapter<ListSelectionViewHolder>() {
  val listTitles = arrayOf("Shopping List", "Chores", "Android Tutorials")

  override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ListSelectionViewHolder {
    val view = LayoutInflater.from(parent?.context).inflate(R.layout.list_selection_view_holder, parent, false)
    return ListSelectionViewHolder(view)
  }

  override fun getItemCount(): Int {
    return listTitles.size
  }

  override fun onBindViewHolder(listSelectionViewHolder: ListSelectionViewHolder, index: Int) {
   listSelectionViewHolder.item?.text = listTitles[index]
    listSelectionViewHolder.itemNumber?.text = Integer.toString(index + 1)
  }
}
