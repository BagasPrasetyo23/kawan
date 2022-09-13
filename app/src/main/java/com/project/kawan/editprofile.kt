package com.project.kawan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class editprofile : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editprofile)
        val back: Button = findViewById(R.id.back)
        back.setOnClickListener(this)
        val simpan: Button = findViewById(R.id.simpan)
        simpan.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.back -> {
                    val pindahIntent = Intent(this, ProfilLayoutActivity::class.java)
                    startActivity(pindahIntent)
                }
                R.id.simpan -> {
                    val pindahIntent = Intent(this, ProfilLayoutActivity::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}