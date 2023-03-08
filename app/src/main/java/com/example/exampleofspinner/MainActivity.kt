package com.example.exampleofspinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val spinnerChoice : Spinner = findViewById(R.id.spinner)
        var list_of_items = arrayOf("coffee", "tea", "milo")

        //Create an ArrayDapter using a simple spinner layout
        val aa = ArrayAdapter(this, android.R.layout.simple_spinner_item, list_of_items)
        //Set layout to use when the list of choice appear
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        //set Adapter to Spinner
        spinnerChoice!!.setAdapter(aa)
    }
}
