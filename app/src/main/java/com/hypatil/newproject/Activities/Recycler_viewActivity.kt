package com.hypatil.newproject.Activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.hypatil.newproject.Supplyer
import com.hypatil.newproject.adaptors.HobbiesAdapter
import kotlinx.android.synthetic.main.recyclerview_layout.*

class Recycler_viewActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        createAdapter()
    }

    private fun createAdapter() {
        val layoutManager =LinearLayoutManager(this)
        layoutManager.orientation= LinearLayoutManager.VERTICAL
        rvview.layoutManager=layoutManager
        val adapter = HobbiesAdapter(this, Supplyer.hobbies)
        rvview.adapter=adapter
    }
}