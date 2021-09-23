package com.hypatil.newproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnshowtoast.setOnClickListener{
            Toast.makeText(this,"Button was Clicked",Toast.LENGTH_SHORT).show()
        }
        btnsenddata.setOnClickListener{
            val message: String =etUserMessage.text.toString()
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("msg1",message);
            startActivity(intent)

        }
        btnshare.setOnClickListener{
            val message: String =etUserMessage.text.toString()
            val intent=Intent()
            intent.putExtra(Intent.EXTRA_TEXT,message)
            intent.action = Intent.ACTION_SEND
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent,"Share to"))
        }

    }
}
