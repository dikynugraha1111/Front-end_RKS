package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_PP.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        when(p0.id){
            R.id.btn_PP->{
                val IntentPP = Intent(this@MainActivity, Pp::class.java)
                startActivity(IntentPP)
            }
        }
    }
}
