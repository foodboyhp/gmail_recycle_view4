package com.example.gmail_recycle_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val data  = ArrayList<ItemViewModel>()
        data.add(ItemViewModel("PHH", "review food", "Let's go to this restaurant to test the steak there", "20:00"))
        data.add(ItemViewModel("PHH", "review food", "Let's go to this restaurant to test the steak there", "20:00"))
        data.add(ItemViewModel("PHH", "review food", "Let's go to this restaurant to test the steak there", "20:00"))
        data.add(ItemViewModel("PHH", "review food", "Let's go to this restaurant to test the steak there", "20:00"))
        data.add(ItemViewModel("PHH", "review food", "Let's go to this restaurant to test the steak there", "20:00"))
        data.add(ItemViewModel("PHH", "review food", "Let's go to this restaurant to test the steak there", "20:00"))
        data.add(ItemViewModel("PHH", "review food", "Let's go to this restaurant to test the steak there", "20:00"))
        data.add(ItemViewModel("PHH", "review food", "Let's go to this restaurant to test the steak there", "20:00"))
        data.add(ItemViewModel("PHH", "review food", "Let's go to this restaurant to test the steak there", "20:00"))
        data.add(ItemViewModel("PHH", "review food", "Let's go to this restaurant to test the steak there", "20:00"))
        data.add(ItemViewModel("PHH", "review food", "Let's go to this restaurant to test the steak there", "20:00"))
        data.add(ItemViewModel("PHH", "review food", "Let's go to this restaurant to test the steak there", "20:00"))
        val adapter = ItemAdapter(data)
        recyclerView.adapter = adapter
    }
}