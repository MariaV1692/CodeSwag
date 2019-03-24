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

class CategoryAdapter(context: Context, categories: List<Category>) : BaseAdapter(){

    val context = context
    val categories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        categoryView = LayoutInflater.from(context).inflate(R.layout.category_list,null)
        val categoryImage : ImageView = categoryView.imgCategory
        val categoryName : TextView = categoryView.txtHat

        val category = categories[position]
        categoryName.text = category.title

        /*In order to access resource ID need to find it*/
        val resourceId = context.resources.getIdentifier(category.image,"drawable",context.packageName)
        categoryImage.setImageResource(resourceId)
        println(resourceId)
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
}