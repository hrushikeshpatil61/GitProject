package com.hypatil.newproject

import android.os.Bundle
import android.view.ActionMode
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val bundle: Bundle? = intent.extras
        val msg = bundle!!.getString("msg1")
        if (msg.isNullOrBlank()){
            Toast.makeText(this,"Empty Input In previous activity",Toast.LENGTH_SHORT).show()
            tvmsgdisp.text="Amazon Dog when no internet"
        }else{
            tvmsgdisp.text = msg
        }


        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
    }
}