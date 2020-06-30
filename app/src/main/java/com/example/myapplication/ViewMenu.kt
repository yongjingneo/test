package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import com.example.myapplication.com.example.myapplication.adapters.FoodAdapters
import com.example.myapplication.com.example.myapplication.model.Food

class ViewMenu : AppCompatActivity() {

    private var arrayList:ArrayList<Food> ? = null
    private var gridView:GridView ? = null
    private var foodAdapters: FoodAdapters ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_menu)

        val actionbar = supportActionBar
        actionbar!!.title="View Menu"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        gridView = findViewById(R.id.my_grid_view_list)
        arrayList = ArrayList()
        arrayList = setDataList()
        foodAdapters = FoodAdapters(applicationContext, arrayList!!)
        gridView?.adapter = foodAdapters
    }

    private fun setDataList(): ArrayList<Food> {

        var arrayList: ArrayList<Food> = ArrayList()

        arrayList.add(Food(R.drawable.chick1,"Sweet & Sour Chicken RM29.90"))
        arrayList.add(Food(R.drawable.chick2,"Kam Heong Chicken  RM25.90"))
        arrayList.add(Food(R.drawable.chick3,"Curry Chicken RM39.90"))
        arrayList.add(Food(R.drawable.fish1,"Curry Fish   RM70.90"))
        arrayList.add(Food(R.drawable.fish2,"Sambal Fish   RM45.90"))
        arrayList.add(Food(R.drawable.fish3,"Steam Fish   RM59.90"))
        arrayList.add(Food(R.drawable.prawn1,"Onion Prawn   RM55.90"))
        arrayList.add(Food(R.drawable.prawn2,"Salted Egg Prawn   RM62.90"))
        arrayList.add(Food(R.drawable.prawn3,"Chilli Prawn   RM60.90"))

        return arrayList
    }
}
