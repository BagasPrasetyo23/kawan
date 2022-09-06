package com.project.kawan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.SearchView
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lyrsearch: RelativeLayout = findViewById(R.id.lyrsearch)
        lyrsearch.setOnClickListener(this)
        val card1: CardView = findViewById(R.id.card1)
        card1.setOnClickListener(this)
        val card2: CardView = findViewById(R.id.card2)
        card2.setOnClickListener(this)
        val card3: CardView = findViewById(R.id.card3)
        card3.setOnClickListener(this)
        val card4: CardView = findViewById(R.id.card4)
        card4.setOnClickListener(this)
        val card5: CardView = findViewById(R.id.card5)
        card5.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.card1 -> {
                    val pindahIntent = Intent(this, airterjuntampuruang::class.java)
                    startActivity(pindahIntent)
                }
                R.id.card2 -> {
                    val pindahIntent = Intent(this, airterjunlubuakrantiang::class.java)
                    startActivity(pindahIntent)
                }
                R.id.card3 -> {
                    val pindahIntent = Intent(this, airterjunlubuakhitam::class.java)
                    startActivity(pindahIntent)
                }
                R.id.card4 -> {
                    val pindahIntent = Intent(this, pulausirandah::class.java)
                    startActivity(pindahIntent)
                }
                R.id.card5 -> {
                    val pindahIntent = Intent(this, bendunganniagara::class.java)
                    startActivity(pindahIntent)
                }
                R.id.lyrsearch -> {
                    val pindahIntent = Intent(this, pencarian1::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}