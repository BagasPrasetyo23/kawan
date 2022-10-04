package com.project.kawan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class DetailKulinerLamunOmbakActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_kuliner_lamun_ombak)

        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.d_lamunombak1_x4))
        imageList.add(SlideModel(R.drawable.d_lamunombak2_x4))
        imageList.add(SlideModel(R.drawable.d_lamunombak3_x4))


        imageSlider.setImageList(imageList, ScaleTypes.FIT)

    }
}