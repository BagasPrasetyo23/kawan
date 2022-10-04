package com.project.kawan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class DetailKulinerJamsitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_kuliner_jamsit)

        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.d_kulinerjamsit2_x4))
        imageList.add(SlideModel(R.drawable.d_kulinerjamsit1_x4))
        imageList.add(SlideModel(R.drawable.d_kulinerjamsit3_x4))


        imageSlider.setImageList(imageList, ScaleTypes.FIT)
    }
}