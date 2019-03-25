package com.mariav.codeswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.mariav.codeswag.Adapters.CategoryAdapter
import com.mariav.codeswag.Model.Category
import com.mariav.codeswag.R
import com.mariav.codeswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this,
            DataService.categories)
        categoryListView.adapter = adapter
        categoryListView.setOnItemClickListener { parent, view, position, id ->
            val toast = Toast.makeText(this,"You category is ${DataService.categories[position].title}",Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}
