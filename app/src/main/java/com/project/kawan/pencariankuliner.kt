package com.project.kawan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class pencariankuliner : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pencariankuliner)
        val back : Button = findViewById(R.id.back)
        back.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.back -> {
                    val pindahIntent = Intent(this, KulinerActivity::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}