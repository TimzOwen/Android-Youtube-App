package com.owen.myapplication

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

class HomeAdapter: RecyclerView.Adapter<CustomViewHolder>()
{
     val videoList = listOf("Queen of the south", "Game of thrones", "The hunter", "Ghost Fighter")
    
    override fun getItemCount(): Int {
        return 2
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CustomViewHolder {
          val layoutInflater = LayoutInflater.from(parentVG.context)

        val cellPerRow = layoutInflater.inflate(R.layout.video_row_list, parentVG, false)

        return CustomViewHolder(cellPerRow)
    }

    override fun onBindViewHolder(p0: CustomViewHolder, p1: Int) {
         val videoTitle = videoList.get(position)

        holder.view.tv_video_title.text= videoTitle

    }
}

class CustomViewHolder val view: View): RecyclerView.ViewHolder(view)
{

}
