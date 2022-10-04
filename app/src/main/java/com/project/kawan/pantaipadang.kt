package com.project.kawan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class pantaipadang : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantaipadang)
        val imageSlider = findViewById<ImageSlider>(R.id.imageslider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.d_pantaipadang1_x4))
        imageList.add(SlideModel(R.drawable.d_pantaipadang2_x4))
        imageList.add(SlideModel(R.drawable.d_pantaipadang3_x4))


        imageSlider.setImageList(imageList, ScaleTypes.FIT)
    }
}