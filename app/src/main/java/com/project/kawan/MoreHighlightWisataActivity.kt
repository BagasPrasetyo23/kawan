package com.project.kawan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.cardview.widget.CardView

class MoreHighlightWisataActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more_highlight_wisata)
        val btnBack : Button= findViewById(R.id.btnBack)
        btnBack.setOnClickListener(this)

        val rantiang : CardView= findViewById(R.id.rantiang)
        rantiang.setOnClickListener(this)

        val tampuruang : CardView= findViewById(R.id.tampuruang)
        tampuruang.setOnClickListener(this)

        val hitam : CardView= findViewById(R.id.hitam)
        hitam.setOnClickListener(this)

        val niagara : CardView= findViewById(R.id.niagara)
        niagara.setOnClickListener(this)

        val jamsit : CardView= findViewById(R.id.jamsit)
        jamsit.setOnClickListener(this)

        val masjid : CardView= findViewById(R.id.masjid)
        masjid.setOnClickListener(this)

        val pantaipadang : CardView= findViewById(R.id.pantaipadang)
        pantaipadang.setOnClickListener(this)

        val pantaiairmanis : CardView= findViewById(R.id.pantaiairmanis)
        pantaiairmanis.setOnClickListener(this)

        val pasumpahan : CardView= findViewById(R.id.pasumpahan)
        pasumpahan.setOnClickListener(this)

        val sirandah : CardView= findViewById(R.id.sirandah)
        sirandah.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        if (v !=null){
            when (v.id){
                R.id.btnBack ->{
                    val pindahIntent = Intent(this,MainActivity::class.java)
                    startActivity(pindahIntent)
                }
                R.id.rantiang ->{
                    val pindahIntent = Intent(this,airterjunlubuakrantiang::class.java)
                    startActivity(pindahIntent)
                }
                R.id.tampuruang ->{
                    val pindahIntent = Intent(this,airterjunlubuakrantiang::class.java)
                    startActivity(pindahIntent)
                }
                R.id.hitam ->{
                    val pindahIntent = Intent(this,airterjuntampuruang::class.java)
                    startActivity(pindahIntent)
                }
                R.id.niagara ->{
                    val pindahIntent = Intent(this,bendunganniagara::class.java)
                    startActivity(pindahIntent)
                }
                R.id.jamsit ->{
                    val pindahIntent = Intent(this,jamsit::class.java)
                    startActivity(pindahIntent)
                }
                R.id.masjid ->{
                    val pindahIntent = Intent(this,masjidrayasumbar::class.java)
                    startActivity(pindahIntent)
                }
                R.id.pantaipadang ->{
                    val pindahIntent = Intent(this,pantaipadang::class.java)
                    startActivity(pindahIntent)
                }
                R.id.pantaiairmanis ->{
                    val pindahIntent = Intent(this,pantaiairmanis::class.java)
                    startActivity(pindahIntent)
                }
                R.id.pasumpahan ->{
                    val pindahIntent = Intent(this,pulaupasumpahan::class.java)
                    startActivity(pindahIntent)
                }
                R.id.sirandah ->{
                    val pindahIntent = Intent(this,pulausirandah::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}