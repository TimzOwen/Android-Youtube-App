package com.owen.myapplication

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

class HomeAdapter: RecyclerView.Adapter<CustomViewHolder>()
{
    override fun getItemCount(): Int {
        return 2
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CustomViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(p0: CustomViewHolder, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class CustomViewHolder (v: View): RecyclerView.ViewHolder(v)
{

}
