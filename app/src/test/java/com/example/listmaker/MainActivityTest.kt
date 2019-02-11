package com.example.listmaker

import android.support.v7.widget.RecyclerView
import android.widget.TextView
import kotlinx.android.synthetic.main.content_main.view.*
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(RobolectricTestRunner::class)
class MainActivityTest {

  @Test
  fun subtractionIsCorrect() {
    assertEquals(4, 5-1)
  }

  @Test
  fun mainActivity_titleShouldBeCorrect() {
    val activity = Robolectric.buildActivity(MainActivity::class.java)
    activity.create().start().resume()
    val listsRecyclerView = activity.findViewById(R.id.lists_recyclerview) as RecyclerView
    val listSelectionRecyclerViewAdapter = listsRecyclerView.findViewHolderForAdapterPosition(0) as ListSelectionViewHolder
    assertEquals(listSelectionRecyclerViewAdapter.itemNumber, "1")
    assertEquals(listSelectionRecyclerViewAdapter.item, "Shopping List")

//
//    assertEquals(textView.text, "Hello World!")

  }
}
