package com.project.kawan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.View
import android.widget.*

class RegisterActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val back : Button = findViewById(R.id.back)
        back.setOnClickListener(this)
        val btndaftar : Button = findViewById(R.id.btndaftar)
        btndaftar.setOnClickListener(this)
        val tv_to_login : TextView = findViewById(R.id.tv_to_login)
        tv_to_login.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        if (v !=null){
            when (v.id){
                R.id.back ->{
                    val pindahIntent = Intent(this,LoginActivity::class.java)
                    startActivity(pindahIntent)
                }
                R.id.btndaftar ->{
                    val pindahIntent = Intent(this,LoginActivity::class.java)
                    startActivity(pindahIntent)
                }
                R.id.tv_to_login ->{
                    val pindahIntent = Intent(this,LoginActivity::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}