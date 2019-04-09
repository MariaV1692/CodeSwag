package com.mariav.codeswag.Controller

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.mariav.codeswag.Adapters.ProductsAdapter
import com.mariav.codeswag.Model.Product
import com.mariav.codeswag.R
import com.mariav.codeswag.Services.DataService
import com.mariav.codeswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter : ProductsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
        adapter = ProductsAdapter(this,DataService.getProducts(categoryType))

        val orientation = resources.configuration.orientation
        val screenSize = resources.configuration.screenWidthDp
        var col_number = 2
            if((orientation == Configuration.ORIENTATION_LANDSCAPE)) {
                col_number = 4
            }

        if(screenSize > 750){
            col_number = 5
        }

        val layoutManager = GridLayoutManager(this,col_number)
        productListView.layoutManager = layoutManager
        productListView.adapter = adapter
    }
}
