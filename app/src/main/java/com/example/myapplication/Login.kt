package com.example.myapplication

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        when(p0.id){
            R.id.btn_login->{
                val id = et_id.text.toString()
                val pass = et_pass.text.toString()
                if (id.isEmpty()|| pass.isEmpty()) {
                    Toast.makeText(this, "Please Insert Email and Password", Toast.LENGTH_SHORT).show()
                }
                if(id == "admin" || pass == "admin"){
                    val progressDialog = ProgressDialog(this,
                        R.style.Theme_MaterialComponents_Light_Dialog)
                    progressDialog.isIndeterminate = true
                    progressDialog.setMessage("Loading...")
                    progressDialog.show()
                    val intent = Intent (this,MainActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }
        }
    }

}
