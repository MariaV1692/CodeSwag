package com.mariav.codeswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.mariav.codeswag.Model.Category
import com.mariav.codeswag.R
import kotlinx.android.synthetic.main.category_list.view.*

class CategoryAdapter(val context: Context,val categories: List<Category>) : BaseAdapter(){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val holder : ViewHolder
        if(convertView == null){
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list,null)
            holder = ViewHolder(categoryView.imgCategory,categoryView.txtHat)
            categoryView.tag = holder
        }else{
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }

        holder.categoryName?.text = categories[position].title
        /*In order to access resource ID need to find it*/
        val resourceId = context.resources.getIdentifier(categories[position].image,"drawable",context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
        return categoryView;
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    private class ViewHolder(val categoryImage : ImageView,val categoryName : TextView)
}