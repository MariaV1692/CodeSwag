package com.mariav.codeswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.mariav.codeswag.Model.Category
import com.mariav.codeswag.R
import kotlinx.android.synthetic.main.category_list.view.*

class CategoryRecyclerAdapter(val context: Context, val categories: List<Category>) : RecyclerView.Adapter<CategoryRecyclerAdapter.Holder>() {
    override fun onCreateViewHolder(paranet_view_group: ViewGroup, p1: Int): Holder {
        val view = LayoutInflater.from(paranet_view_group.context).inflate(R.layout.category_list,paranet_view_group,false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindCategory(categories[position],context)
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val categoryImage = itemView.findViewById<ImageView>(R.id.imgCategory)
        val categoryName = itemView.findViewById<TextView>(R.id.txtHat)
        fun bindCategory(category: Category, context: Context){
            val resourceID = context.resources.getIdentifier(category.image,"drawable",context.packageName)
            categoryImage.setImageResource(resourceID)
            categoryName.text = category.title
        }
    }
}