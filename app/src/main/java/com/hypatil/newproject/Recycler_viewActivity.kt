package com.hypatil.newproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.recyclerview_layout.*

class Recycler_viewActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recyclerview_layout)
        val layoutManager =LinearLayoutManager(this)
        layoutManager.orientation= LinearLayoutManager.VERTICAL
        rvview.layoutManager=layoutManager
        val adapter = HobbiesAdapter(this,Supplyer.hobbies)
        rvview.adapter=adapter
    }
}