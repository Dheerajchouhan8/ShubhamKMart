package com.example.shubhamkmart.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.shubhamkmart.model.RecViewCategoryModel

data class CategoryRecviewAdapter(val contex:Context,val Arr :ArrayList<RecViewCategoryModel>):RecyclerView.Adapter<ViewHolder>{
    class viewHolder(view: View):ViewHolder(view)

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        TODO("Not yet implemented")
    }
}
