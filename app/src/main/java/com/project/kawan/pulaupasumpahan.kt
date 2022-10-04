package com.project.kawan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class pulaupasumpahan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pulaupasumpahan)
        val imageSlider = findViewById<ImageSlider>(R.id.imageslider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.d_pulaupasumpahan3_x4))
        imageList.add(SlideModel(R.drawable.d_pulaupasumpahan2_x4))
        imageList.add(SlideModel(R.drawable.d_pulaupasumpahan1_x4))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)
    }
}