package com.asgar72.rkdfsh.Module1.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.asgar72.rkdfsh.R
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_home, container, false)

        val imageList = ArrayList<SlideModel>() // Create image list

        imageList.add(
            SlideModel(
                "https://bit.ly/2YoJ77H",
                "The animal population decreased by 58 percent in 42 years."
            )
        )
        imageList.add(
            SlideModel(
                "https://bit.ly/2BteuF2",
                "Elephants and tigers may become extinct."
            )
        )
        imageList.add(SlideModel("https://bit.ly/3fLJf72", "And people do that."))

        val imageSlider = rootView.findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)

        return rootView
    }

}