package com.example.stuntrack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import android.widget.ArrayAdapter
import android.widget.Spinner


class add_data_anak : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_data_anak)

        val spinner: Spinner = findViewById(R.id.spinner)

        val genderOptions = resources.getStringArray(R.array.gender_options)

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, genderOptions)

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner.adapter = adapter

        val toolbar = findViewById<Toolbar>(R.id.tbDetailMbl)
        setSupportActionBar(toolbar)

        supportActionBar?.apply {
            title = "Data Anak"
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }

    }
}