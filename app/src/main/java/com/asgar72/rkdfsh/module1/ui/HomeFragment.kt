package com.asgar72.rkdfsh.module1.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.asgar72.rkdfsh.R
import com.asgar72.rkdfsh.databinding.FragmentHomeBinding
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        val imageList = ArrayList<SlideModel>()

//        imageList.add(SlideModel("https://drive.google.com/file/d/1Z92xwVS88CZHt5Dmp5HHA9lWmQtlrnDj/view?usp=drive_link","Endgame"))
//        imageList.add(SlideModel("https://img.cinemablend.com/filter:scale/quill/3/7/0/0/8/e/37008e36e98cd75101cf1347396eac8534871a19.jpg?mw=600","Jumanji"))
//        imageList.add(SlideModel("https://www.adgully.com/img/800/201711/spider-man-homecoming-banner.jpg","Man"))
//        imageList.add(SlideModel("https://live.staticflickr.com/1980/29996141587_7886795726_b.jpg","Venom"))
        imageList.add(SlideModel(R.drawable.a, "Main Building"))
        imageList.add(SlideModel(R.drawable.b, "Play Ground"))
        imageList.add(SlideModel(R.drawable.c, "MCA Students"))
        imageList.add(SlideModel(R.drawable.d))
        imageList.add(SlideModel(R.drawable.e))
        imageList.add(SlideModel(R.drawable.f))


        binding.imageSlider.setImageList(imageList, ScaleTypes.FIT)


        binding.RkdfOfficial.setOnClickListener {
            val fragmentTransaction = parentFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frameLayout, WebsiteFragment())
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
        binding.RkdfStudent.setOnClickListener {
            val fragmentTransaction = parentFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frameLayout, StuLoginFragment())
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

        binding.SyllabusCardView.setOnClickListener {
            val fragmentTransaction = parentFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frameLayout, SyllabusFragment())
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

        binding.RkdfHelpDesk.setOnClickListener {
            val fragmentTransition = parentFragmentManager.beginTransaction()
            fragmentTransition.replace(R.id.frameLayout,HelpDeskFragment())
            fragmentTransition.addToBackStack(null)
            fragmentTransition.commit()
        }

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}