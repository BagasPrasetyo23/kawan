package com.project.kawan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.SearchView
import androidx.cardview.widget.CardView

class listwisata : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listwisata)
        val btnsrcwisata: Button = findViewById(R.id.btnsrcwisata)
        btnsrcwisata.setOnClickListener(this)

        val srcwisata: androidx.appcompat.widget.SearchView = findViewById(R.id.srcwisata)
        srcwisata.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.btnsrcwisata -> {
                    val pindahIntent = Intent(this, MainActivity::class.java)
                    startActivity(pindahIntent)
                }
                R.id.srcwisata -> {
                    val pindahIntent = Intent(this, pencarianwisata::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}