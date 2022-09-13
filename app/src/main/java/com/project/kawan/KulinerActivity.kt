package com.project.kawan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.SearchView

class KulinerActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kuliner)
        val back: Button = findViewById(R.id.back)
        back.setOnClickListener(this)
        val srckuliner: androidx.appcompat.widget.SearchView= findViewById(R.id.srckuliner)
        srckuliner.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.back -> {
                    val pindahIntent = Intent(this, MainActivity::class.java)
                    startActivity(pindahIntent)
                }
                R.id.srckuliner -> {
                    val pindahIntent = Intent(this, pencariankuliner::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}