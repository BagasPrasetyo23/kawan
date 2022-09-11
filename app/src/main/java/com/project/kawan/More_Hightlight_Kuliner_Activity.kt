package com.project.kawan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class More_Hightlight_Kuliner_Activity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more_hightlight_kuliner)
        val back : Button = findViewById(R.id.back)
        back.setOnClickListener(this)
        val card1 : Button = findViewById(R.id.card1)
        card1.setOnClickListener(this)
        val card2 : Button = findViewById(R.id.card2)
        card2.setOnClickListener(this)
        val card3 : Button = findViewById(R.id.card3)
        card3.setOnClickListener(this)
        val card4 : Button = findViewById(R.id.card4)
        card4.setOnClickListener(this)
        val card5 : Button = findViewById(R.id.card5)
        card5.setOnClickListener(this)
        val card6 : Button = findViewById(R.id.card6)
        card6.setOnClickListener(this)
        val card7 : Button = findViewById(R.id.card7)
        card7.setOnClickListener(this)
        val card8 : Button = findViewById(R.id.card8)
        card8.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        if (v !=null){
            when (v.id){
                R.id.back ->{
                    val pindahIntent = Intent(this,MainActivity::class.java)
                    startActivity(pindahIntent)
                }
                R.id.card1 ->{
                    val pindahIntent = Intent(this,DetailKulinerEsDurianIkoGantinyoActivity::class.java)
                    startActivity(pindahIntent)
                }
                R.id.card2 ->{
                    val pindahIntent = Intent(this,DetailKulinerKatupekPitalahActivity::class.java)
                    startActivity(pindahIntent)
                }
                R.id.card3 ->{
                    val pindahIntent = Intent(this,DetailKulinerPauhPiamanActivity::class.java)
                    startActivity(pindahIntent)
                }
                R.id.card4->{
                    val pindahIntent = Intent(this,DetailKulinerSateDDActivity::class.java)
                    startActivity(pindahIntent)
                }
                R.id.card5 ->{
                    val pindahIntent = Intent(this,DetailKulinerWarkopNanYoActivity::class.java)
                    startActivity(pindahIntent)
                }
                R.id.card6 ->{
                    val pindahIntent = Intent(this,DetailKulinerEsDurianGantiNanLamoActivity::class.java)
                    startActivity(pindahIntent)
                }
                R.id.card7 ->{
                    val pindahIntent = Intent(this,DetailKulinerJamsitActivity::class.java)
                    startActivity(pindahIntent)
                }
                R.id.card8 ->{
                    val pindahIntent = Intent(this,DetailKulinerLamunOmbakActivity::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }

}